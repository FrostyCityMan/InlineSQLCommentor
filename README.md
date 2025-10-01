# InlineSQLCommentor

## 简体中文

InlineSQLCommentor 是一款 IntelliJ 平台插件，可在编辑器中为选中的 SQL 自动“瞬间注入”数据库注释。默认面向 Oracle PL/SQL，并利用 IntelliJ Database 工具窗口维护的元数据缓存（模式/表/列注释），无需网络连接也能飞快运行。

- 🔮 立即在列名后插入 `/* 注释 */`
- 🏷️ 在 FROM/INSERT/UPDATE/DELETE/CTE 场景下自动注入表注释
- 🧠 智能别名→真实表名映射（不区分大小写）
- ⚡ 极速：仅使用 IntelliJ Database 缓存 → 离线也能用
- 🧩 基于 Oracle PL/SQL（ANTLR）的解析 —— 以 SELECT/INSERT 为主
- ⌨️ 快捷键：Ctrl+Alt+C · 编辑器右键菜单：“Insert Column Comments”

示例（自动转换）：

```sql
-- Before
SELECT ID, NAME FROM USERS u;

-- After
SELECT
  ID   /* 用户ID */,
  NAME /* 用户名 */
FROM USERS u;
```

为什么好用

- 📈 极大提升可读性：含义一目了然
- 🧭 便于维护：新同学也能快速理解上下文
- 🛡️ 安全插入：从后向前插入，避免索引错位

限制/注意

- 🎯 原则上跳过复杂表达式（函数/字面量/标量子查询等）
- 🚫 忽略系统 Schema，如 SYS、SYSTEM
- 🗃️ 如果数据源缓存里没有注释，相应字段不会被插入注释

---

## English

InlineSQLCommentor is an IntelliJ Platform plugin that instantly injects database comments into the SQL you select in the editor. It targets Oracle PL/SQL by default and uses IntelliJ’s Database tool window metadata cache (schema/table/column comments), so it works blazing fast without any network calls.

- 🔮 Instantly inserts `/* comment */` right after columns
- 🏷️ Automatically injects table comments in FROM/INSERT/UPDATE/DELETE/CTE contexts
- 🧠 Smart alias→real table name mapping (case-insensitive)
- ⚡ Super fast: uses only IntelliJ Database cache → works offline
- 🧩 Oracle PL/SQL (ANTLR) based parsing — focused on SELECT/INSERT
- ⌨️ Shortcut: Ctrl+Alt+C · Editor popup: “Insert Column Comments”

Example (auto transform):

```sql
-- Before
SELECT ID, NAME FROM USERS u;

-- After
SELECT
  ID   /* User ID */,
  NAME /* User Name */
FROM USERS u;
```

Why it’s great

- 📈 Huge readability boost: semantics pop out immediately
- 🧭 Easier maintenance: newcomers grasp context faster
- 🛡️ Safe insertion: inserts from the end to avoid index shifts

Limits / Notes

- 🎯 Skips complex expressions (functions/literals/scalar subqueries) by design
- 🚫 Ignores system schemas like SYS and SYSTEM
- 🗃️ If the data source cache has no comments, nothing will be inserted for those fields

---

InlineSQLCommentor는 에디터에서 선택한 SQL에 데이터베이스 컬럼 주석을 자동으로 삽입해 주는 IntelliJ Platform 플러그인입니다. Oracle PL/SQL을 기본 대상으로 하며, IntelliJ의 Database 도구 창이 유지하는 메타데이터 캐시(스키마/테이블/컬럼 주석)를 활용하여 빠르게 코멘트를 추가합니다.

<!-- Plugin description -->
✨ InlineSQLCommentor — 선택한 SQL에 데이터베이스 코멘트를 “순간 주입”하는 매직 툴!

- 🔮 컬럼 뒤에 즉시 `/* 주석 */` 삽입
- 🏷️ FROM/INSERT/UPDATE/DELETE/CTE 문맥의 테이블 주석도 자동 주입
- 🧠 별칭→실제 테이블명 스마트 매핑(대소문자 무시)
- ⚡ 초고속: IntelliJ Database 캐시만 활용 → 네트워크 없이도 번개처럼
- 🧩 Oracle PL/SQL(ANTLR) 기반 파싱 — SELECT/INSERT 중심
- ⌨️ 단축키: Ctrl+Alt+C · 에디터 팝업: “Insert Column Comments”

예시(자동 변환):

```sql
-- Before
SELECT ID, NAME FROM USERS u;

-- After
SELECT
  ID   /* 사용자 ID */,
  NAME /* 사용자명  */
FROM USERS u;
```

왜 좋은가요?

- 📈 가독성 폭증: SQL을 읽는 순간 의미가 보입니다.
- 🧭 유지보수 용이: 새 팀원도 맥락 파악이 쉬워집니다.
- 🛡️ 안전한 삽입: 원문 인덱스 꼬임 방지를 위해 뒤에서부터 삽입

제한/주의:

- 🎯 복잡한 표현식(함수/리터럴/스칼라 서브쿼리)은 원칙적으로 건너뜁니다.
- 🚫 SYS, SYSTEM 등 시스템 스키마는 제외됩니다.
- 🗃️ 데이터 소스 캐시에 코멘트가 없으면 해당 항목은 삽입되지 않습니다.
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

## 로드맵(아이디어)
- ColumnCommentVisitor의 별칭/표현식 파싱 고도화 (복잡한 표현식 지원 확대)
- 다양한 SQL 방언 지원 (ANSI SQL, PostgreSQL 등) 옵션화
- 컬럼 코멘트뿐 아니라 테이블 코멘트 주입/툴팁
- 멀티라인 주석 스타일/포맷 옵션

## 크레딧
- Based on the IntelliJ Platform Plugin Template.
- Oracle PL/SQL ANTLR grammar 사용.


---




