# InlineSQLCommentor

InlineSQLCommentor는 에디터에서 선택한 SQL에 데이터베이스 컬럼 주석을 자동으로 삽입해 주는 IntelliJ Platform 플러그인입니다. Oracle PL/SQL을 기본 대상으로 하며, IntelliJ의 Database 도구 창이 유지하는 메타데이터 캐시(스키마/테이블/컬럼 주석)를 활용하여 빠르게 코멘트를 추가합니다.

<!-- Plugin description -->
InlineSQLCommentor는 에디터에서 선택한 SQL에 데이터베이스 컬럼 주석을 자동 삽입합니다. 
- Editor의 선택 영역 내 SQL을 분석하여 각 컬럼 뒤에 `/* 주석 */`을 추가합니다.
- IntelliJ Database(데이터 소스) 캐시로부터 테이블/컬럼의 코멘트를 조회하므로 네트워크 연결 없이도 빠르게 동작합니다.
- 기본적으로 Oracle PL/SQL 문법(ANTLR)을 사용하여 SELECT/INSERT 구문을 파싱합니다.
- 단축키: Ctrl+Alt+C, 에디터 팝업 메뉴: “Insert Column Comments”.
<!-- Plugin description end -->

## 주요 기능
- 선택한 SQL의 컬럼 뒤에 컬럼 주석 자동 삽입
- 선택한 SQL의 테이블 이름 뒤에 테이블 주석 자동 삽입(FROM/INSERT/UPDATE/DELETE/CTE 문맥)
- JOIN과 서브쿼리가 포함된 SELECT에서도 가능한 범위 내에서 컬럼/테이블 주석 삽입 지원 (지원 JOIN: INNER, LEFT/LEFT OUTER, RIGHT/RIGHT OUTER, FULL OUTER, CROSS)
- IntelliJ Database 캐시 사용(실 DB 접속 없이 빠른 조회)
- 여러 테이블이 등장하는 쿼리에서 테이블 별칭을 실제 테이블과 매핑 시도(대소문자 무시)
- SYS, SYSTEM 등 시스템 스키마는 조회 대상에서 제외하여 노이즈 감소

## 사용 방법
1) Database 도구 창에서 대상 데이터 소스를 등록하고 Synchronize로 메타데이터 캐시를 최신 상태로 맞춥니다.
2) 에디터에서 SQL을 드래그하여 선택합니다.
3) 다음 중 하나로 실행합니다.
   - 에디터 팝업 메뉴: 우클릭 → “Insert Column Comments”
   - 단축키: Ctrl+Alt+C
4) 플러그인은 현재 파일 컨텍스트에서 연결 가능한 데이터 소스를 자동 탐색합니다. 못 찾으면 수동으로 데이터 소스 이름을 묻고, 해당 이름의 데이터 소스를 찾아 사용합니다.
5) 성공 시 선택 영역의 SQL이 다음과 같이 변환됩니다.
   - Before: `SELECT ID, NAME FROM USERS u`
   - After:  `SELECT ID /* 사용자 ID */, NAME /* 사용자명 */ FROM USERS u`

참고: 데이터 소스 캐시에 코멘트가 없는 컬럼은 주석이 추가되지 않습니다.

## 동작 방식(아키텍처)
- Action: `SqlCommentAction`
  - 에디터/프로젝트/선택 영역을 확인하고 데이터 소스를 자동/수동으로 결정합니다.
  - `IntelliJCacheColumnCommentProvider`와 `SqlCommentInjector`를 사용해 주석을 삽입하고, `WriteCommandAction`으로 선택 영역을 교체합니다.
- Injector: `SqlCommentInjector`
  - ANTLR 기반 `ColumnCommentVisitor`로 컬럼(이름, 삽입 위치)을 수집하고, `TableNameVisitor`로 테이블명/별칭을 수집합니다.
  - 별칭→실제 테이블 이름 매핑을 만든 뒤, 각 컬럼에 대한 코멘트를 조회하여 원문 SQL의 해당 위치에 `/* ... */` 형태로 삽입합니다. 인덱스 꼬임 방지를 위해 뒤에서부터 삽입합니다.
- Provider: `IntelliJCacheColumnCommentProvider` (인터페이스: `ColumnCommentProvider`)
  - `DbPsiFacade`로 data source를 찾고, `DasUtil.getTables()`와 `DasTable.getDasChildren(ObjectKind.COLUMN)`을 이용해 캐시된 테이블/컬럼을 조회합니다.
  - SYS, SYSTEM 스키마의 테이블은 제외합니다. `ReadAction`으로 안전하게 PSI/모델을 읽습니다.
- Parser(ANTLR):
  - Grammar: `src\main\antlr\PlSqlLexer.g4`, `PlSqlParser.g4`
  - Generated: `src\main\gen\com\github\frostycityman\inlinesqlcommentor\sql\parser\generated\oracle\...`
  - `ColumnCommentVisitor`: SELECT의 selected_list, INSERT의 column_list에서 컬럼 이름과 주석 삽입 위치(stopIndex)를 수집합니다.
  - `TableNameVisitor`: parse tree를 bottom-up으로 따라 올라가서 테이블 이름과 별칭을 추출하고 문맥(FROM/UPDATE/DELETE/INSERT/CTE)을 기록합니다.

## 지원 범위 및 한계
- 지원 방언: Oracle PL/SQL(기본). 다른 DB도 Data Source 캐시가 있다면 코멘트 조회 자체는 가능하지만, 파서는 현재 PL/SQL에 최적화되어 있습니다.
- SELECT/INSERT 컬럼 추출: JOIN/별칭이 포함된 SELECT에서 테이블 별칭 기반으로 컬럼 코멘트를 매핑합니다(대소문자 무시). 단, 함수/리터럴/스칼라 서브쿼리 등 복잡한 표현식은 원칙적으로 건너뜁니다.
- 별칭 매핑: FROM/JOIN에 등장한 별칭을 추출하여 실제 테이블과 매핑합니다. SELECT 항목에 테이블 접두어가 없는 경우(모호한 컬럼)에는 단일 테이블 쿼리일 때만 코멘트를 삽입합니다.
- 메타데이터 캐시 의존: Database 동기화가 되어 있지 않거나 코멘트가 비어 있으면 삽입되지 않습니다.

## 설치
- JetBrains Marketplace: 아직 게시되지 않았습니다. (게시 후 링크 추가 예정)
- 로컬 설치(수동):
  - Git clone 후 Gradle 빌드 산출물을 IDE에서 ‘Install plugin from disk…’로 설치하거나,
  - 개발 모드로 실행: `./gradlew runIde` (Windows: `gradlew.bat runIde`)

## 개발 가이드
- JDK: 17
- IntelliJ Platform: IU 2025.1.3 (gradle.properties 참고)
- Gradle: 8.13
- 주요 Gradle 설정: 
  - `antlr` 플러그인으로 `generateGrammarSource` 작업이 PL/SQL 파서를 생성합니다. Kotlin/Java 컴파일 작업은 이에 의존합니다.
  - IntelliJ Platform Gradle Plugin이 README의 “Plugin description” 섹션을 plugin.xml로 주입합니다.
- 유용한 작업:
  - `gradlew.bat generateGrammarSource` — ANTLR 생성물 갱신
  - `gradlew.bat runIde` — 샌드박스 IDE 실행
  - `gradlew.bat build` — 빌드/테스트

## 프로젝트 구조(요약)
- `src\main\kotlin\...\action\SqlCommentAction.kt` — 액션 엔트리 포인트
- `src\main\kotlin\...\sql\injector\SqlCommentInjector.kt` — 코멘트 삽입기
- `src\main\kotlin\...\sql\parser\ColumnCommentVisitor.kt` — 컬럼/삽입위치 수집
- `src\main\kotlin\...\sql\parser\TableNameVisitor.kt` — 테이블/별칭 수집
- `src\main\kotlin\...\sql\provider\ColumnCommentProvider.kt` — 제공자 인터페이스
- `src\main\kotlin\...\sql\provider\IntelliJCacheColumnCommentProvider.kt` — 캐시 기반 구현
- `src\main\resources\META-INF\plugin.xml` — 플러그인 메타데이터 및 액션 등록
- `src\main\antlr` — PL/SQL 문법 정의(.g4)
- `src\main\gen` — ANTLR 생성 코드(자동 생성)

## 로드맵(아이디어)
- ColumnCommentVisitor의 별칭/표현식 파싱 고도화 (복잡한 표현식 지원 확대)
- 다양한 SQL 방언 지원 (ANSI SQL, PostgreSQL 등) 옵션화
- 컬럼 코멘트뿐 아니라 테이블 코멘트 주입/툴팁
- 멀티라인 주석 스타일/포맷 옵션

## 크레딧
- Based on the IntelliJ Platform Plugin Template.
- Oracle PL/SQL ANTLR grammar 사용.
