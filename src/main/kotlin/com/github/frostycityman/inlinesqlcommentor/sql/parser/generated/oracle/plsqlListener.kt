// Generated from oracle/plsql.g4 by ANTLR 4.13.2
package com.github.frostycityman.inlinesqlcommentor.sql.parser.generated

import org.antlr.v4.runtime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * [plsqlParser].
 */
interface plsqlListener : ParseTreeListener {
    /**
     * Enter a parse tree produced by [plsqlParser.swallow_to_semi].
     * @param ctx the parse tree
     */
    fun enterSwallow_to_semi(ctx: plsqlParser.Swallow_to_semiContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.swallow_to_semi].
     * @param ctx the parse tree
     */
    fun exitSwallow_to_semi(ctx: plsqlParser.Swallow_to_semiContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.compilation_unit].
     * @param ctx the parse tree
     */
    fun enterCompilation_unit(ctx: plsqlParser.Compilation_unitContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.compilation_unit].
     * @param ctx the parse tree
     */
    fun exitCompilation_unit(ctx: plsqlParser.Compilation_unitContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sql_script].
     * @param ctx the parse tree
     */
    fun enterSql_script(ctx: plsqlParser.Sql_scriptContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sql_script].
     * @param ctx the parse tree
     */
    fun exitSql_script(ctx: plsqlParser.Sql_scriptContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sql_explain].
     * @param ctx the parse tree
     */
    fun enterSql_explain(ctx: plsqlParser.Sql_explainContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sql_explain].
     * @param ctx the parse tree
     */
    fun exitSql_explain(ctx: plsqlParser.Sql_explainContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.unit_statement].
     * @param ctx the parse tree
     */
    fun enterUnit_statement(ctx: plsqlParser.Unit_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.unit_statement].
     * @param ctx the parse tree
     */
    fun exitUnit_statement(ctx: plsqlParser.Unit_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.unit_statement_body].
     * @param ctx the parse tree
     */
    fun enterUnit_statement_body(ctx: plsqlParser.Unit_statement_bodyContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.unit_statement_body].
     * @param ctx the parse tree
     */
    fun exitUnit_statement_body(ctx: plsqlParser.Unit_statement_bodyContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_role].
     * @param ctx the parse tree
     */
    fun enterCreate_role(ctx: plsqlParser.Create_roleContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_role].
     * @param ctx the parse tree
     */
    fun exitCreate_role(ctx: plsqlParser.Create_roleContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.role_option].
     * @param ctx the parse tree
     */
    fun enterRole_option(ctx: plsqlParser.Role_optionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.role_option].
     * @param ctx the parse tree
     */
    fun exitRole_option(ctx: plsqlParser.Role_optionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.refresh_materialized_view].
     * @param ctx the parse tree
     */
    fun enterRefresh_materialized_view(ctx: plsqlParser.Refresh_materialized_viewContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.refresh_materialized_view].
     * @param ctx the parse tree
     */
    fun exitRefresh_materialized_view(ctx: plsqlParser.Refresh_materialized_viewContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_materialized_view].
     * @param ctx the parse tree
     */
    fun enterCreate_materialized_view(ctx: plsqlParser.Create_materialized_viewContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_materialized_view].
     * @param ctx the parse tree
     */
    fun exitCreate_materialized_view(ctx: plsqlParser.Create_materialized_viewContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_mv_refresh].
     * @param ctx the parse tree
     */
    fun enterCreate_mv_refresh(ctx: plsqlParser.Create_mv_refreshContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_mv_refresh].
     * @param ctx the parse tree
     */
    fun exitCreate_mv_refresh(ctx: plsqlParser.Create_mv_refreshContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.build_clause].
     * @param ctx the parse tree
     */
    fun enterBuild_clause(ctx: plsqlParser.Build_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.build_clause].
     * @param ctx the parse tree
     */
    fun exitBuild_clause(ctx: plsqlParser.Build_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_permission].
     * @param ctx the parse tree
     */
    fun enterAlter_permission(ctx: plsqlParser.Alter_permissionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_permission].
     * @param ctx the parse tree
     */
    fun exitAlter_permission(ctx: plsqlParser.Alter_permissionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.permission_options].
     * @param ctx the parse tree
     */
    fun enterPermission_options(ctx: plsqlParser.Permission_optionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.permission_options].
     * @param ctx the parse tree
     */
    fun exitPermission_options(ctx: plsqlParser.Permission_optionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_view].
     * @param ctx the parse tree
     */
    fun enterCreate_view(ctx: plsqlParser.Create_viewContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_view].
     * @param ctx the parse tree
     */
    fun exitCreate_view(ctx: plsqlParser.Create_viewContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.view_options].
     * @param ctx the parse tree
     */
    fun enterView_options(ctx: plsqlParser.View_optionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.view_options].
     * @param ctx the parse tree
     */
    fun exitView_options(ctx: plsqlParser.View_optionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.view_alias_constraint].
     * @param ctx the parse tree
     */
    fun enterView_alias_constraint(ctx: plsqlParser.View_alias_constraintContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.view_alias_constraint].
     * @param ctx the parse tree
     */
    fun exitView_alias_constraint(ctx: plsqlParser.View_alias_constraintContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_index].
     * @param ctx the parse tree
     */
    fun enterCreate_index(ctx: plsqlParser.Create_indexContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_index].
     * @param ctx the parse tree
     */
    fun exitCreate_index(ctx: plsqlParser.Create_indexContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cluster_index_clause].
     * @param ctx the parse tree
     */
    fun enterCluster_index_clause(ctx: plsqlParser.Cluster_index_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cluster_index_clause].
     * @param ctx the parse tree
     */
    fun exitCluster_index_clause(ctx: plsqlParser.Cluster_index_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cluster_name].
     * @param ctx the parse tree
     */
    fun enterCluster_name(ctx: plsqlParser.Cluster_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cluster_name].
     * @param ctx the parse tree
     */
    fun exitCluster_name(ctx: plsqlParser.Cluster_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.index_attributes].
     * @param ctx the parse tree
     */
    fun enterIndex_attributes(ctx: plsqlParser.Index_attributesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.index_attributes].
     * @param ctx the parse tree
     */
    fun exitIndex_attributes(ctx: plsqlParser.Index_attributesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.tablespace].
     * @param ctx the parse tree
     */
    fun enterTablespace(ctx: plsqlParser.TablespaceContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.tablespace].
     * @param ctx the parse tree
     */
    fun exitTablespace(ctx: plsqlParser.TablespaceContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.key_compression].
     * @param ctx the parse tree
     */
    fun enterKey_compression(ctx: plsqlParser.Key_compressionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.key_compression].
     * @param ctx the parse tree
     */
    fun exitKey_compression(ctx: plsqlParser.Key_compressionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sort_or_nosort].
     * @param ctx the parse tree
     */
    fun enterSort_or_nosort(ctx: plsqlParser.Sort_or_nosortContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sort_or_nosort].
     * @param ctx the parse tree
     */
    fun exitSort_or_nosort(ctx: plsqlParser.Sort_or_nosortContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.visible_or_invisible].
     * @param ctx the parse tree
     */
    fun enterVisible_or_invisible(ctx: plsqlParser.Visible_or_invisibleContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.visible_or_invisible].
     * @param ctx the parse tree
     */
    fun exitVisible_or_invisible(ctx: plsqlParser.Visible_or_invisibleContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.parallel_clause].
     * @param ctx the parse tree
     */
    fun enterParallel_clause(ctx: plsqlParser.Parallel_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.parallel_clause].
     * @param ctx the parse tree
     */
    fun exitParallel_clause(ctx: plsqlParser.Parallel_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_index_clause].
     * @param ctx the parse tree
     */
    fun enterTable_index_clause(ctx: plsqlParser.Table_index_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_index_clause].
     * @param ctx the parse tree
     */
    fun exitTable_index_clause(ctx: plsqlParser.Table_index_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.index_expr].
     * @param ctx the parse tree
     */
    fun enterIndex_expr(ctx: plsqlParser.Index_exprContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.index_expr].
     * @param ctx the parse tree
     */
    fun exitIndex_expr(ctx: plsqlParser.Index_exprContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.index_properties].
     * @param ctx the parse tree
     */
    fun enterIndex_properties(ctx: plsqlParser.Index_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.index_properties].
     * @param ctx the parse tree
     */
    fun exitIndex_properties(ctx: plsqlParser.Index_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.global_partitioned_index].
     * @param ctx the parse tree
     */
    fun enterGlobal_partitioned_index(ctx: plsqlParser.Global_partitioned_indexContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.global_partitioned_index].
     * @param ctx the parse tree
     */
    fun exitGlobal_partitioned_index(ctx: plsqlParser.Global_partitioned_indexContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.index_partitioning_clause].
     * @param ctx the parse tree
     */
    fun enterIndex_partitioning_clause(ctx: plsqlParser.Index_partitioning_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.index_partitioning_clause].
     * @param ctx the parse tree
     */
    fun exitIndex_partitioning_clause(ctx: plsqlParser.Index_partitioning_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.partition_name].
     * @param ctx the parse tree
     */
    fun enterPartition_name(ctx: plsqlParser.Partition_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.partition_name].
     * @param ctx the parse tree
     */
    fun exitPartition_name(ctx: plsqlParser.Partition_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.literal].
     * @param ctx the parse tree
     */
    fun enterLiteral(ctx: plsqlParser.LiteralContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.literal].
     * @param ctx the parse tree
     */
    fun exitLiteral(ctx: plsqlParser.LiteralContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.string_function].
     * @param ctx the parse tree
     */
    fun enterString_function(ctx: plsqlParser.String_functionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.string_function].
     * @param ctx the parse tree
     */
    fun exitString_function(ctx: plsqlParser.String_functionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.expressions].
     * @param ctx the parse tree
     */
    fun enterExpressions(ctx: plsqlParser.ExpressionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.expressions].
     * @param ctx the parse tree
     */
    fun exitExpressions(ctx: plsqlParser.ExpressionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.individual_hash_partitions].
     * @param ctx the parse tree
     */
    fun enterIndividual_hash_partitions(ctx: plsqlParser.Individual_hash_partitionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.individual_hash_partitions].
     * @param ctx the parse tree
     */
    fun exitIndividual_hash_partitions(ctx: plsqlParser.Individual_hash_partitionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.partitioning_storage_clause].
     * @param ctx the parse tree
     */
    fun enterPartitioning_storage_clause(ctx: plsqlParser.Partitioning_storage_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.partitioning_storage_clause].
     * @param ctx the parse tree
     */
    fun exitPartitioning_storage_clause(ctx: plsqlParser.Partitioning_storage_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_compression].
     * @param ctx the parse tree
     */
    fun enterTable_compression(ctx: plsqlParser.Table_compressionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_compression].
     * @param ctx the parse tree
     */
    fun exitTable_compression(ctx: plsqlParser.Table_compressionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lob_partitioning_storage].
     * @param ctx the parse tree
     */
    fun enterLob_partitioning_storage(ctx: plsqlParser.Lob_partitioning_storageContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lob_partitioning_storage].
     * @param ctx the parse tree
     */
    fun exitLob_partitioning_storage(ctx: plsqlParser.Lob_partitioning_storageContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lob_item].
     * @param ctx the parse tree
     */
    fun enterLob_item(ctx: plsqlParser.Lob_itemContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lob_item].
     * @param ctx the parse tree
     */
    fun exitLob_item(ctx: plsqlParser.Lob_itemContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lob_segname].
     * @param ctx the parse tree
     */
    fun enterLob_segname(ctx: plsqlParser.Lob_segnameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lob_segname].
     * @param ctx the parse tree
     */
    fun exitLob_segname(ctx: plsqlParser.Lob_segnameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.varray_item].
     * @param ctx the parse tree
     */
    fun enterVarray_item(ctx: plsqlParser.Varray_itemContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.varray_item].
     * @param ctx the parse tree
     */
    fun exitVarray_item(ctx: plsqlParser.Varray_itemContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.hash_partitions_by_quantity].
     * @param ctx the parse tree
     */
    fun enterHash_partitions_by_quantity(ctx: plsqlParser.Hash_partitions_by_quantityContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.hash_partitions_by_quantity].
     * @param ctx the parse tree
     */
    fun exitHash_partitions_by_quantity(ctx: plsqlParser.Hash_partitions_by_quantityContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.hash_partition_quantity].
     * @param ctx the parse tree
     */
    fun enterHash_partition_quantity(ctx: plsqlParser.Hash_partition_quantityContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.hash_partition_quantity].
     * @param ctx the parse tree
     */
    fun exitHash_partition_quantity(ctx: plsqlParser.Hash_partition_quantityContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.local_partitioned_index].
     * @param ctx the parse tree
     */
    fun enterLocal_partitioned_index(ctx: plsqlParser.Local_partitioned_indexContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.local_partitioned_index].
     * @param ctx the parse tree
     */
    fun exitLocal_partitioned_index(ctx: plsqlParser.Local_partitioned_indexContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.on_range_partitioned_table].
     * @param ctx the parse tree
     */
    fun enterOn_range_partitioned_table(ctx: plsqlParser.On_range_partitioned_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.on_range_partitioned_table].
     * @param ctx the parse tree
     */
    fun exitOn_range_partitioned_table(ctx: plsqlParser.On_range_partitioned_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.on_list_partitioned_table].
     * @param ctx the parse tree
     */
    fun enterOn_list_partitioned_table(ctx: plsqlParser.On_list_partitioned_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.on_list_partitioned_table].
     * @param ctx the parse tree
     */
    fun exitOn_list_partitioned_table(ctx: plsqlParser.On_list_partitioned_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.on_hash_partitioned_table].
     * @param ctx the parse tree
     */
    fun enterOn_hash_partitioned_table(ctx: plsqlParser.On_hash_partitioned_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.on_hash_partitioned_table].
     * @param ctx the parse tree
     */
    fun exitOn_hash_partitioned_table(ctx: plsqlParser.On_hash_partitioned_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.on_comp_partitioned_table].
     * @param ctx the parse tree
     */
    fun enterOn_comp_partitioned_table(ctx: plsqlParser.On_comp_partitioned_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.on_comp_partitioned_table].
     * @param ctx the parse tree
     */
    fun exitOn_comp_partitioned_table(ctx: plsqlParser.On_comp_partitioned_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.index_subpartition_clause].
     * @param ctx the parse tree
     */
    fun enterIndex_subpartition_clause(ctx: plsqlParser.Index_subpartition_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.index_subpartition_clause].
     * @param ctx the parse tree
     */
    fun exitIndex_subpartition_clause(ctx: plsqlParser.Index_subpartition_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subpartition_name].
     * @param ctx the parse tree
     */
    fun enterSubpartition_name(ctx: plsqlParser.Subpartition_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subpartition_name].
     * @param ctx the parse tree
     */
    fun exitSubpartition_name(ctx: plsqlParser.Subpartition_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.domain_index_clause].
     * @param ctx the parse tree
     */
    fun enterDomain_index_clause(ctx: plsqlParser.Domain_index_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.domain_index_clause].
     * @param ctx the parse tree
     */
    fun exitDomain_index_clause(ctx: plsqlParser.Domain_index_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.indextype].
     * @param ctx the parse tree
     */
    fun enterIndextype(ctx: plsqlParser.IndextypeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.indextype].
     * @param ctx the parse tree
     */
    fun exitIndextype(ctx: plsqlParser.IndextypeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.odci_parameters].
     * @param ctx the parse tree
     */
    fun enterOdci_parameters(ctx: plsqlParser.Odci_parametersContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.odci_parameters].
     * @param ctx the parse tree
     */
    fun exitOdci_parameters(ctx: plsqlParser.Odci_parametersContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.local_domain_index_clause].
     * @param ctx the parse tree
     */
    fun enterLocal_domain_index_clause(ctx: plsqlParser.Local_domain_index_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.local_domain_index_clause].
     * @param ctx the parse tree
     */
    fun exitLocal_domain_index_clause(ctx: plsqlParser.Local_domain_index_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmlindex_clause].
     * @param ctx the parse tree
     */
    fun enterXmlindex_clause(ctx: plsqlParser.Xmlindex_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmlindex_clause].
     * @param ctx the parse tree
     */
    fun exitXmlindex_clause(ctx: plsqlParser.Xmlindex_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.local_xmlindex_clause].
     * @param ctx the parse tree
     */
    fun enterLocal_xmlindex_clause(ctx: plsqlParser.Local_xmlindex_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.local_xmlindex_clause].
     * @param ctx the parse tree
     */
    fun exitLocal_xmlindex_clause(ctx: plsqlParser.Local_xmlindex_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.bitmap_join_index_clause].
     * @param ctx the parse tree
     */
    fun enterBitmap_join_index_clause(ctx: plsqlParser.Bitmap_join_index_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.bitmap_join_index_clause].
     * @param ctx the parse tree
     */
    fun exitBitmap_join_index_clause(ctx: plsqlParser.Bitmap_join_index_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_table].
     * @param ctx the parse tree
     */
    fun enterCreate_table(ctx: plsqlParser.Create_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_table].
     * @param ctx the parse tree
     */
    fun exitCreate_table(ctx: plsqlParser.Create_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.relational_table].
     * @param ctx the parse tree
     */
    fun enterRelational_table(ctx: plsqlParser.Relational_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.relational_table].
     * @param ctx the parse tree
     */
    fun exitRelational_table(ctx: plsqlParser.Relational_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.relational_properties].
     * @param ctx the parse tree
     */
    fun enterRelational_properties(ctx: plsqlParser.Relational_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.relational_properties].
     * @param ctx the parse tree
     */
    fun exitRelational_properties(ctx: plsqlParser.Relational_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.column_definition].
     * @param ctx the parse tree
     */
    fun enterColumn_definition(ctx: plsqlParser.Column_definitionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.column_definition].
     * @param ctx the parse tree
     */
    fun exitColumn_definition(ctx: plsqlParser.Column_definitionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.inline_ref_constraint].
     * @param ctx the parse tree
     */
    fun enterInline_ref_constraint(ctx: plsqlParser.Inline_ref_constraintContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.inline_ref_constraint].
     * @param ctx the parse tree
     */
    fun exitInline_ref_constraint(ctx: plsqlParser.Inline_ref_constraintContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.virtual_column_definition].
     * @param ctx the parse tree
     */
    fun enterVirtual_column_definition(ctx: plsqlParser.Virtual_column_definitionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.virtual_column_definition].
     * @param ctx the parse tree
     */
    fun exitVirtual_column_definition(ctx: plsqlParser.Virtual_column_definitionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.out_of_line_constraint].
     * @param ctx the parse tree
     */
    fun enterOut_of_line_constraint(ctx: plsqlParser.Out_of_line_constraintContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.out_of_line_constraint].
     * @param ctx the parse tree
     */
    fun exitOut_of_line_constraint(ctx: plsqlParser.Out_of_line_constraintContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.foreign_key_clause].
     * @param ctx the parse tree
     */
    fun enterForeign_key_clause(ctx: plsqlParser.Foreign_key_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.foreign_key_clause].
     * @param ctx the parse tree
     */
    fun exitForeign_key_clause(ctx: plsqlParser.Foreign_key_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.on_delete_clause].
     * @param ctx the parse tree
     */
    fun enterOn_delete_clause(ctx: plsqlParser.On_delete_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.on_delete_clause].
     * @param ctx the parse tree
     */
    fun exitOn_delete_clause(ctx: plsqlParser.On_delete_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.out_of_line_ref_constraint].
     * @param ctx the parse tree
     */
    fun enterOut_of_line_ref_constraint(ctx: plsqlParser.Out_of_line_ref_constraintContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.out_of_line_ref_constraint].
     * @param ctx the parse tree
     */
    fun exitOut_of_line_ref_constraint(ctx: plsqlParser.Out_of_line_ref_constraintContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.supplemental_logging_props].
     * @param ctx the parse tree
     */
    fun enterSupplemental_logging_props(ctx: plsqlParser.Supplemental_logging_propsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.supplemental_logging_props].
     * @param ctx the parse tree
     */
    fun exitSupplemental_logging_props(ctx: plsqlParser.Supplemental_logging_propsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.supplemental_log_grp_clause].
     * @param ctx the parse tree
     */
    fun enterSupplemental_log_grp_clause(ctx: plsqlParser.Supplemental_log_grp_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.supplemental_log_grp_clause].
     * @param ctx the parse tree
     */
    fun exitSupplemental_log_grp_clause(ctx: plsqlParser.Supplemental_log_grp_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.log_grp].
     * @param ctx the parse tree
     */
    fun enterLog_grp(ctx: plsqlParser.Log_grpContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.log_grp].
     * @param ctx the parse tree
     */
    fun exitLog_grp(ctx: plsqlParser.Log_grpContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.supplemental_id_key_clause].
     * @param ctx the parse tree
     */
    fun enterSupplemental_id_key_clause(ctx: plsqlParser.Supplemental_id_key_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.supplemental_id_key_clause].
     * @param ctx the parse tree
     */
    fun exitSupplemental_id_key_clause(ctx: plsqlParser.Supplemental_id_key_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.physical_properties].
     * @param ctx the parse tree
     */
    fun enterPhysical_properties(ctx: plsqlParser.Physical_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.physical_properties].
     * @param ctx the parse tree
     */
    fun exitPhysical_properties(ctx: plsqlParser.Physical_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.deferred_segment_creation].
     * @param ctx the parse tree
     */
    fun enterDeferred_segment_creation(ctx: plsqlParser.Deferred_segment_creationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.deferred_segment_creation].
     * @param ctx the parse tree
     */
    fun exitDeferred_segment_creation(ctx: plsqlParser.Deferred_segment_creationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.segment_attributes_clause].
     * @param ctx the parse tree
     */
    fun enterSegment_attributes_clause(ctx: plsqlParser.Segment_attributes_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.segment_attributes_clause].
     * @param ctx the parse tree
     */
    fun exitSegment_attributes_clause(ctx: plsqlParser.Segment_attributes_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.physical_attributes_clause].
     * @param ctx the parse tree
     */
    fun enterPhysical_attributes_clause(ctx: plsqlParser.Physical_attributes_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.physical_attributes_clause].
     * @param ctx the parse tree
     */
    fun exitPhysical_attributes_clause(ctx: plsqlParser.Physical_attributes_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.storage_clause].
     * @param ctx the parse tree
     */
    fun enterStorage_clause(ctx: plsqlParser.Storage_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.storage_clause].
     * @param ctx the parse tree
     */
    fun exitStorage_clause(ctx: plsqlParser.Storage_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.size_clause].
     * @param ctx the parse tree
     */
    fun enterSize_clause(ctx: plsqlParser.Size_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.size_clause].
     * @param ctx the parse tree
     */
    fun exitSize_clause(ctx: plsqlParser.Size_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.logging_clause].
     * @param ctx the parse tree
     */
    fun enterLogging_clause(ctx: plsqlParser.Logging_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.logging_clause].
     * @param ctx the parse tree
     */
    fun exitLogging_clause(ctx: plsqlParser.Logging_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.column_properties].
     * @param ctx the parse tree
     */
    fun enterColumn_properties(ctx: plsqlParser.Column_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.column_properties].
     * @param ctx the parse tree
     */
    fun exitColumn_properties(ctx: plsqlParser.Column_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.object_type_col_properties].
     * @param ctx the parse tree
     */
    fun enterObject_type_col_properties(ctx: plsqlParser.Object_type_col_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.object_type_col_properties].
     * @param ctx the parse tree
     */
    fun exitObject_type_col_properties(ctx: plsqlParser.Object_type_col_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.substitutable_column_clause].
     * @param ctx the parse tree
     */
    fun enterSubstitutable_column_clause(ctx: plsqlParser.Substitutable_column_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.substitutable_column_clause].
     * @param ctx the parse tree
     */
    fun exitSubstitutable_column_clause(ctx: plsqlParser.Substitutable_column_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.nested_table_col_properties].
     * @param ctx the parse tree
     */
    fun enterNested_table_col_properties(ctx: plsqlParser.Nested_table_col_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.nested_table_col_properties].
     * @param ctx the parse tree
     */
    fun exitNested_table_col_properties(ctx: plsqlParser.Nested_table_col_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.nested_item].
     * @param ctx the parse tree
     */
    fun enterNested_item(ctx: plsqlParser.Nested_itemContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.nested_item].
     * @param ctx the parse tree
     */
    fun exitNested_item(ctx: plsqlParser.Nested_itemContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.object_properties].
     * @param ctx the parse tree
     */
    fun enterObject_properties(ctx: plsqlParser.Object_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.object_properties].
     * @param ctx the parse tree
     */
    fun exitObject_properties(ctx: plsqlParser.Object_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.inline_constraint].
     * @param ctx the parse tree
     */
    fun enterInline_constraint(ctx: plsqlParser.Inline_constraintContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.inline_constraint].
     * @param ctx the parse tree
     */
    fun exitInline_constraint(ctx: plsqlParser.Inline_constraintContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.references_clause].
     * @param ctx the parse tree
     */
    fun enterReferences_clause(ctx: plsqlParser.References_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.references_clause].
     * @param ctx the parse tree
     */
    fun exitReferences_clause(ctx: plsqlParser.References_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.paren_column_list].
     * @param ctx the parse tree
     */
    fun enterParen_column_list(ctx: plsqlParser.Paren_column_listContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.paren_column_list].
     * @param ctx the parse tree
     */
    fun exitParen_column_list(ctx: plsqlParser.Paren_column_listContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.column_list].
     * @param ctx the parse tree
     */
    fun enterColumn_list(ctx: plsqlParser.Column_listContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.column_list].
     * @param ctx the parse tree
     */
    fun exitColumn_list(ctx: plsqlParser.Column_listContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.check_constraint].
     * @param ctx the parse tree
     */
    fun enterCheck_constraint(ctx: plsqlParser.Check_constraintContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.check_constraint].
     * @param ctx the parse tree
     */
    fun exitCheck_constraint(ctx: plsqlParser.Check_constraintContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.constraint_state].
     * @param ctx the parse tree
     */
    fun enterConstraint_state(ctx: plsqlParser.Constraint_stateContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.constraint_state].
     * @param ctx the parse tree
     */
    fun exitConstraint_state(ctx: plsqlParser.Constraint_stateContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.using_index_clause].
     * @param ctx the parse tree
     */
    fun enterUsing_index_clause(ctx: plsqlParser.Using_index_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.using_index_clause].
     * @param ctx the parse tree
     */
    fun exitUsing_index_clause(ctx: plsqlParser.Using_index_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.varray_col_properties].
     * @param ctx the parse tree
     */
    fun enterVarray_col_properties(ctx: plsqlParser.Varray_col_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.varray_col_properties].
     * @param ctx the parse tree
     */
    fun exitVarray_col_properties(ctx: plsqlParser.Varray_col_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.varray_storage_clause].
     * @param ctx the parse tree
     */
    fun enterVarray_storage_clause(ctx: plsqlParser.Varray_storage_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.varray_storage_clause].
     * @param ctx the parse tree
     */
    fun exitVarray_storage_clause(ctx: plsqlParser.Varray_storage_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lob_storage_parameters].
     * @param ctx the parse tree
     */
    fun enterLob_storage_parameters(ctx: plsqlParser.Lob_storage_parametersContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lob_storage_parameters].
     * @param ctx the parse tree
     */
    fun exitLob_storage_parameters(ctx: plsqlParser.Lob_storage_parametersContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lob_parameters].
     * @param ctx the parse tree
     */
    fun enterLob_parameters(ctx: plsqlParser.Lob_parametersContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lob_parameters].
     * @param ctx the parse tree
     */
    fun exitLob_parameters(ctx: plsqlParser.Lob_parametersContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lob_retention_clause].
     * @param ctx the parse tree
     */
    fun enterLob_retention_clause(ctx: plsqlParser.Lob_retention_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lob_retention_clause].
     * @param ctx the parse tree
     */
    fun exitLob_retention_clause(ctx: plsqlParser.Lob_retention_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lob_deduplicate_clause].
     * @param ctx the parse tree
     */
    fun enterLob_deduplicate_clause(ctx: plsqlParser.Lob_deduplicate_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lob_deduplicate_clause].
     * @param ctx the parse tree
     */
    fun exitLob_deduplicate_clause(ctx: plsqlParser.Lob_deduplicate_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lob_compression_clause].
     * @param ctx the parse tree
     */
    fun enterLob_compression_clause(ctx: plsqlParser.Lob_compression_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lob_compression_clause].
     * @param ctx the parse tree
     */
    fun exitLob_compression_clause(ctx: plsqlParser.Lob_compression_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.encryption_spec].
     * @param ctx the parse tree
     */
    fun enterEncryption_spec(ctx: plsqlParser.Encryption_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.encryption_spec].
     * @param ctx the parse tree
     */
    fun exitEncryption_spec(ctx: plsqlParser.Encryption_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lob_storage_clause].
     * @param ctx the parse tree
     */
    fun enterLob_storage_clause(ctx: plsqlParser.Lob_storage_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lob_storage_clause].
     * @param ctx the parse tree
     */
    fun exitLob_storage_clause(ctx: plsqlParser.Lob_storage_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmltype_column_properties].
     * @param ctx the parse tree
     */
    fun enterXmltype_column_properties(ctx: plsqlParser.Xmltype_column_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmltype_column_properties].
     * @param ctx the parse tree
     */
    fun exitXmltype_column_properties(ctx: plsqlParser.Xmltype_column_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmltype_storage].
     * @param ctx the parse tree
     */
    fun enterXmltype_storage(ctx: plsqlParser.Xmltype_storageContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmltype_storage].
     * @param ctx the parse tree
     */
    fun exitXmltype_storage(ctx: plsqlParser.Xmltype_storageContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmlschema_spec].
     * @param ctx the parse tree
     */
    fun enterXmlschema_spec(ctx: plsqlParser.Xmlschema_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmlschema_spec].
     * @param ctx the parse tree
     */
    fun exitXmlschema_spec(ctx: plsqlParser.Xmlschema_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.allow_or_disallow].
     * @param ctx the parse tree
     */
    fun enterAllow_or_disallow(ctx: plsqlParser.Allow_or_disallowContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.allow_or_disallow].
     * @param ctx the parse tree
     */
    fun exitAllow_or_disallow(ctx: plsqlParser.Allow_or_disallowContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_partitioning_clauses].
     * @param ctx the parse tree
     */
    fun enterTable_partitioning_clauses(ctx: plsqlParser.Table_partitioning_clausesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_partitioning_clauses].
     * @param ctx the parse tree
     */
    fun exitTable_partitioning_clauses(ctx: plsqlParser.Table_partitioning_clausesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.range_partitions].
     * @param ctx the parse tree
     */
    fun enterRange_partitions(ctx: plsqlParser.Range_partitionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.range_partitions].
     * @param ctx the parse tree
     */
    fun exitRange_partitions(ctx: plsqlParser.Range_partitionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.range_values_clause].
     * @param ctx the parse tree
     */
    fun enterRange_values_clause(ctx: plsqlParser.Range_values_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.range_values_clause].
     * @param ctx the parse tree
     */
    fun exitRange_values_clause(ctx: plsqlParser.Range_values_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_partition_description].
     * @param ctx the parse tree
     */
    fun enterTable_partition_description(ctx: plsqlParser.Table_partition_descriptionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_partition_description].
     * @param ctx the parse tree
     */
    fun exitTable_partition_description(ctx: plsqlParser.Table_partition_descriptionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.list_partitions].
     * @param ctx the parse tree
     */
    fun enterList_partitions(ctx: plsqlParser.List_partitionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.list_partitions].
     * @param ctx the parse tree
     */
    fun exitList_partitions(ctx: plsqlParser.List_partitionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.list_values_clause].
     * @param ctx the parse tree
     */
    fun enterList_values_clause(ctx: plsqlParser.List_values_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.list_values_clause].
     * @param ctx the parse tree
     */
    fun exitList_values_clause(ctx: plsqlParser.List_values_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.hash_partitions].
     * @param ctx the parse tree
     */
    fun enterHash_partitions(ctx: plsqlParser.Hash_partitionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.hash_partitions].
     * @param ctx the parse tree
     */
    fun exitHash_partitions(ctx: plsqlParser.Hash_partitionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.composite_range_partitions].
     * @param ctx the parse tree
     */
    fun enterComposite_range_partitions(ctx: plsqlParser.Composite_range_partitionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.composite_range_partitions].
     * @param ctx the parse tree
     */
    fun exitComposite_range_partitions(ctx: plsqlParser.Composite_range_partitionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subpartition_by_range].
     * @param ctx the parse tree
     */
    fun enterSubpartition_by_range(ctx: plsqlParser.Subpartition_by_rangeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subpartition_by_range].
     * @param ctx the parse tree
     */
    fun exitSubpartition_by_range(ctx: plsqlParser.Subpartition_by_rangeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subpartition_by_list].
     * @param ctx the parse tree
     */
    fun enterSubpartition_by_list(ctx: plsqlParser.Subpartition_by_listContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subpartition_by_list].
     * @param ctx the parse tree
     */
    fun exitSubpartition_by_list(ctx: plsqlParser.Subpartition_by_listContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subpartition_template].
     * @param ctx the parse tree
     */
    fun enterSubpartition_template(ctx: plsqlParser.Subpartition_templateContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subpartition_template].
     * @param ctx the parse tree
     */
    fun exitSubpartition_template(ctx: plsqlParser.Subpartition_templateContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.range_subpartition_desc].
     * @param ctx the parse tree
     */
    fun enterRange_subpartition_desc(ctx: plsqlParser.Range_subpartition_descContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.range_subpartition_desc].
     * @param ctx the parse tree
     */
    fun exitRange_subpartition_desc(ctx: plsqlParser.Range_subpartition_descContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.list_subpartition_desc].
     * @param ctx the parse tree
     */
    fun enterList_subpartition_desc(ctx: plsqlParser.List_subpartition_descContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.list_subpartition_desc].
     * @param ctx the parse tree
     */
    fun exitList_subpartition_desc(ctx: plsqlParser.List_subpartition_descContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.individual_hash_subparts].
     * @param ctx the parse tree
     */
    fun enterIndividual_hash_subparts(ctx: plsqlParser.Individual_hash_subpartsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.individual_hash_subparts].
     * @param ctx the parse tree
     */
    fun exitIndividual_hash_subparts(ctx: plsqlParser.Individual_hash_subpartsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.hash_subpartition_quantity].
     * @param ctx the parse tree
     */
    fun enterHash_subpartition_quantity(ctx: plsqlParser.Hash_subpartition_quantityContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.hash_subpartition_quantity].
     * @param ctx the parse tree
     */
    fun exitHash_subpartition_quantity(ctx: plsqlParser.Hash_subpartition_quantityContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subpartition_by_hash].
     * @param ctx the parse tree
     */
    fun enterSubpartition_by_hash(ctx: plsqlParser.Subpartition_by_hashContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subpartition_by_hash].
     * @param ctx the parse tree
     */
    fun exitSubpartition_by_hash(ctx: plsqlParser.Subpartition_by_hashContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.range_partition_desc].
     * @param ctx the parse tree
     */
    fun enterRange_partition_desc(ctx: plsqlParser.Range_partition_descContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.range_partition_desc].
     * @param ctx the parse tree
     */
    fun exitRange_partition_desc(ctx: plsqlParser.Range_partition_descContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.hash_subparts_by_quantity].
     * @param ctx the parse tree
     */
    fun enterHash_subparts_by_quantity(ctx: plsqlParser.Hash_subparts_by_quantityContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.hash_subparts_by_quantity].
     * @param ctx the parse tree
     */
    fun exitHash_subparts_by_quantity(ctx: plsqlParser.Hash_subparts_by_quantityContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.composite_list_partitions].
     * @param ctx the parse tree
     */
    fun enterComposite_list_partitions(ctx: plsqlParser.Composite_list_partitionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.composite_list_partitions].
     * @param ctx the parse tree
     */
    fun exitComposite_list_partitions(ctx: plsqlParser.Composite_list_partitionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.list_partition_desc].
     * @param ctx the parse tree
     */
    fun enterList_partition_desc(ctx: plsqlParser.List_partition_descContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.list_partition_desc].
     * @param ctx the parse tree
     */
    fun exitList_partition_desc(ctx: plsqlParser.List_partition_descContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.composite_hash_partitions].
     * @param ctx the parse tree
     */
    fun enterComposite_hash_partitions(ctx: plsqlParser.Composite_hash_partitionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.composite_hash_partitions].
     * @param ctx the parse tree
     */
    fun exitComposite_hash_partitions(ctx: plsqlParser.Composite_hash_partitionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.reference_partitioning].
     * @param ctx the parse tree
     */
    fun enterReference_partitioning(ctx: plsqlParser.Reference_partitioningContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.reference_partitioning].
     * @param ctx the parse tree
     */
    fun exitReference_partitioning(ctx: plsqlParser.Reference_partitioningContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.reference_partition_desc].
     * @param ctx the parse tree
     */
    fun enterReference_partition_desc(ctx: plsqlParser.Reference_partition_descContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.reference_partition_desc].
     * @param ctx the parse tree
     */
    fun exitReference_partition_desc(ctx: plsqlParser.Reference_partition_descContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.system_partitioning].
     * @param ctx the parse tree
     */
    fun enterSystem_partitioning(ctx: plsqlParser.System_partitioningContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.system_partitioning].
     * @param ctx the parse tree
     */
    fun exitSystem_partitioning(ctx: plsqlParser.System_partitioningContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.enable_disable_clause].
     * @param ctx the parse tree
     */
    fun enterEnable_disable_clause(ctx: plsqlParser.Enable_disable_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.enable_disable_clause].
     * @param ctx the parse tree
     */
    fun exitEnable_disable_clause(ctx: plsqlParser.Enable_disable_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.exceptions_clause].
     * @param ctx the parse tree
     */
    fun enterExceptions_clause(ctx: plsqlParser.Exceptions_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.exceptions_clause].
     * @param ctx the parse tree
     */
    fun exitExceptions_clause(ctx: plsqlParser.Exceptions_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.row_movement_clause].
     * @param ctx the parse tree
     */
    fun enterRow_movement_clause(ctx: plsqlParser.Row_movement_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.row_movement_clause].
     * @param ctx the parse tree
     */
    fun exitRow_movement_clause(ctx: plsqlParser.Row_movement_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.flashback_archive_clause].
     * @param ctx the parse tree
     */
    fun enterFlashback_archive_clause(ctx: plsqlParser.Flashback_archive_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.flashback_archive_clause].
     * @param ctx the parse tree
     */
    fun exitFlashback_archive_clause(ctx: plsqlParser.Flashback_archive_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.object_table].
     * @param ctx the parse tree
     */
    fun enterObject_table(ctx: plsqlParser.Object_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.object_table].
     * @param ctx the parse tree
     */
    fun exitObject_table(ctx: plsqlParser.Object_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.object_table_substitution].
     * @param ctx the parse tree
     */
    fun enterObject_table_substitution(ctx: plsqlParser.Object_table_substitutionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.object_table_substitution].
     * @param ctx the parse tree
     */
    fun exitObject_table_substitution(ctx: plsqlParser.Object_table_substitutionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.oid_clause].
     * @param ctx the parse tree
     */
    fun enterOid_clause(ctx: plsqlParser.Oid_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.oid_clause].
     * @param ctx the parse tree
     */
    fun exitOid_clause(ctx: plsqlParser.Oid_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.oid_index_clause].
     * @param ctx the parse tree
     */
    fun enterOid_index_clause(ctx: plsqlParser.Oid_index_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.oid_index_clause].
     * @param ctx the parse tree
     */
    fun exitOid_index_clause(ctx: plsqlParser.Oid_index_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmltype_table].
     * @param ctx the parse tree
     */
    fun enterXmltype_table(ctx: plsqlParser.Xmltype_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmltype_table].
     * @param ctx the parse tree
     */
    fun exitXmltype_table(ctx: plsqlParser.Xmltype_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmltype_virtual_columns].
     * @param ctx the parse tree
     */
    fun enterXmltype_virtual_columns(ctx: plsqlParser.Xmltype_virtual_columnsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmltype_virtual_columns].
     * @param ctx the parse tree
     */
    fun exitXmltype_virtual_columns(ctx: plsqlParser.Xmltype_virtual_columnsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_table].
     * @param ctx the parse tree
     */
    fun enterDrop_table(ctx: plsqlParser.Drop_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_table].
     * @param ctx the parse tree
     */
    fun exitDrop_table(ctx: plsqlParser.Drop_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_table].
     * @param ctx the parse tree
     */
    fun enterAlter_table(ctx: plsqlParser.Alter_tableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_table].
     * @param ctx the parse tree
     */
    fun exitAlter_table(ctx: plsqlParser.Alter_tableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_table_properties].
     * @param ctx the parse tree
     */
    fun enterAlter_table_properties(ctx: plsqlParser.Alter_table_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_table_properties].
     * @param ctx the parse tree
     */
    fun exitAlter_table_properties(ctx: plsqlParser.Alter_table_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_table_properties_1].
     * @param ctx the parse tree
     */
    fun enterAlter_table_properties_1(ctx: plsqlParser.Alter_table_properties_1Context?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_table_properties_1].
     * @param ctx the parse tree
     */
    fun exitAlter_table_properties_1(ctx: plsqlParser.Alter_table_properties_1Context?)

    /**
     * Enter a parse tree produced by [plsqlParser.supplemental_table_logging].
     * @param ctx the parse tree
     */
    fun enterSupplemental_table_logging(ctx: plsqlParser.Supplemental_table_loggingContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.supplemental_table_logging].
     * @param ctx the parse tree
     */
    fun exitSupplemental_table_logging(ctx: plsqlParser.Supplemental_table_loggingContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.allocate_extent_clause].
     * @param ctx the parse tree
     */
    fun enterAllocate_extent_clause(ctx: plsqlParser.Allocate_extent_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.allocate_extent_clause].
     * @param ctx the parse tree
     */
    fun exitAllocate_extent_clause(ctx: plsqlParser.Allocate_extent_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.deallocate_unused_clause].
     * @param ctx the parse tree
     */
    fun enterDeallocate_unused_clause(ctx: plsqlParser.Deallocate_unused_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.deallocate_unused_clause].
     * @param ctx the parse tree
     */
    fun exitDeallocate_unused_clause(ctx: plsqlParser.Deallocate_unused_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.upgrade_table_clause].
     * @param ctx the parse tree
     */
    fun enterUpgrade_table_clause(ctx: plsqlParser.Upgrade_table_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.upgrade_table_clause].
     * @param ctx the parse tree
     */
    fun exitUpgrade_table_clause(ctx: plsqlParser.Upgrade_table_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.records_per_block_clause].
     * @param ctx the parse tree
     */
    fun enterRecords_per_block_clause(ctx: plsqlParser.Records_per_block_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.records_per_block_clause].
     * @param ctx the parse tree
     */
    fun exitRecords_per_block_clause(ctx: plsqlParser.Records_per_block_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_iot_clauses].
     * @param ctx the parse tree
     */
    fun enterAlter_iot_clauses(ctx: plsqlParser.Alter_iot_clausesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_iot_clauses].
     * @param ctx the parse tree
     */
    fun exitAlter_iot_clauses(ctx: plsqlParser.Alter_iot_clausesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.index_org_table_clause].
     * @param ctx the parse tree
     */
    fun enterIndex_org_table_clause(ctx: plsqlParser.Index_org_table_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.index_org_table_clause].
     * @param ctx the parse tree
     */
    fun exitIndex_org_table_clause(ctx: plsqlParser.Index_org_table_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.mapping_table_clause].
     * @param ctx the parse tree
     */
    fun enterMapping_table_clause(ctx: plsqlParser.Mapping_table_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.mapping_table_clause].
     * @param ctx the parse tree
     */
    fun exitMapping_table_clause(ctx: plsqlParser.Mapping_table_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.index_org_overflow_clause].
     * @param ctx the parse tree
     */
    fun enterIndex_org_overflow_clause(ctx: plsqlParser.Index_org_overflow_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.index_org_overflow_clause].
     * @param ctx the parse tree
     */
    fun exitIndex_org_overflow_clause(ctx: plsqlParser.Index_org_overflow_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_overflow_clause].
     * @param ctx the parse tree
     */
    fun enterAlter_overflow_clause(ctx: plsqlParser.Alter_overflow_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_overflow_clause].
     * @param ctx the parse tree
     */
    fun exitAlter_overflow_clause(ctx: plsqlParser.Alter_overflow_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.add_overflow_clause].
     * @param ctx the parse tree
     */
    fun enterAdd_overflow_clause(ctx: plsqlParser.Add_overflow_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.add_overflow_clause].
     * @param ctx the parse tree
     */
    fun exitAdd_overflow_clause(ctx: plsqlParser.Add_overflow_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.shrink_clause].
     * @param ctx the parse tree
     */
    fun enterShrink_clause(ctx: plsqlParser.Shrink_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.shrink_clause].
     * @param ctx the parse tree
     */
    fun exitShrink_clause(ctx: plsqlParser.Shrink_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_mapping_table_clause].
     * @param ctx the parse tree
     */
    fun enterAlter_mapping_table_clause(ctx: plsqlParser.Alter_mapping_table_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_mapping_table_clause].
     * @param ctx the parse tree
     */
    fun exitAlter_mapping_table_clause(ctx: plsqlParser.Alter_mapping_table_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.constraint_clauses].
     * @param ctx the parse tree
     */
    fun enterConstraint_clauses(ctx: plsqlParser.Constraint_clausesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.constraint_clauses].
     * @param ctx the parse tree
     */
    fun exitConstraint_clauses(ctx: plsqlParser.Constraint_clausesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.old_constraint_name].
     * @param ctx the parse tree
     */
    fun enterOld_constraint_name(ctx: plsqlParser.Old_constraint_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.old_constraint_name].
     * @param ctx the parse tree
     */
    fun exitOld_constraint_name(ctx: plsqlParser.Old_constraint_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.new_constraint_name].
     * @param ctx the parse tree
     */
    fun enterNew_constraint_name(ctx: plsqlParser.New_constraint_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.new_constraint_name].
     * @param ctx the parse tree
     */
    fun exitNew_constraint_name(ctx: plsqlParser.New_constraint_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_constraint_clause].
     * @param ctx the parse tree
     */
    fun enterDrop_constraint_clause(ctx: plsqlParser.Drop_constraint_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_constraint_clause].
     * @param ctx the parse tree
     */
    fun exitDrop_constraint_clause(ctx: plsqlParser.Drop_constraint_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_primary_key_or_unique_or_generic_clause].
     * @param ctx the parse tree
     */
    fun enterDrop_primary_key_or_unique_or_generic_clause(ctx: plsqlParser.Drop_primary_key_or_unique_or_generic_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_primary_key_or_unique_or_generic_clause].
     * @param ctx the parse tree
     */
    fun exitDrop_primary_key_or_unique_or_generic_clause(ctx: plsqlParser.Drop_primary_key_or_unique_or_generic_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.column_clauses].
     * @param ctx the parse tree
     */
    fun enterColumn_clauses(ctx: plsqlParser.Column_clausesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.column_clauses].
     * @param ctx the parse tree
     */
    fun exitColumn_clauses(ctx: plsqlParser.Column_clausesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.add_modify_drop_column_clauses].
     * @param ctx the parse tree
     */
    fun enterAdd_modify_drop_column_clauses(ctx: plsqlParser.Add_modify_drop_column_clausesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.add_modify_drop_column_clauses].
     * @param ctx the parse tree
     */
    fun exitAdd_modify_drop_column_clauses(ctx: plsqlParser.Add_modify_drop_column_clausesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.add_column_clause].
     * @param ctx the parse tree
     */
    fun enterAdd_column_clause(ctx: plsqlParser.Add_column_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.add_column_clause].
     * @param ctx the parse tree
     */
    fun exitAdd_column_clause(ctx: plsqlParser.Add_column_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.modify_column_clauses].
     * @param ctx the parse tree
     */
    fun enterModify_column_clauses(ctx: plsqlParser.Modify_column_clausesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.modify_column_clauses].
     * @param ctx the parse tree
     */
    fun exitModify_column_clauses(ctx: plsqlParser.Modify_column_clausesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_column_clause].
     * @param ctx the parse tree
     */
    fun enterAlter_column_clause(ctx: plsqlParser.Alter_column_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_column_clause].
     * @param ctx the parse tree
     */
    fun exitAlter_column_clause(ctx: plsqlParser.Alter_column_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.modify_col_properties].
     * @param ctx the parse tree
     */
    fun enterModify_col_properties(ctx: plsqlParser.Modify_col_propertiesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.modify_col_properties].
     * @param ctx the parse tree
     */
    fun exitModify_col_properties(ctx: plsqlParser.Modify_col_propertiesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.modify_col_substitutable].
     * @param ctx the parse tree
     */
    fun enterModify_col_substitutable(ctx: plsqlParser.Modify_col_substitutableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.modify_col_substitutable].
     * @param ctx the parse tree
     */
    fun exitModify_col_substitutable(ctx: plsqlParser.Modify_col_substitutableContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_column_clause].
     * @param ctx the parse tree
     */
    fun enterDrop_column_clause(ctx: plsqlParser.Drop_column_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_column_clause].
     * @param ctx the parse tree
     */
    fun exitDrop_column_clause(ctx: plsqlParser.Drop_column_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.rename_column_clause].
     * @param ctx the parse tree
     */
    fun enterRename_column_clause(ctx: plsqlParser.Rename_column_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.rename_column_clause].
     * @param ctx the parse tree
     */
    fun exitRename_column_clause(ctx: plsqlParser.Rename_column_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.old_column_name].
     * @param ctx the parse tree
     */
    fun enterOld_column_name(ctx: plsqlParser.Old_column_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.old_column_name].
     * @param ctx the parse tree
     */
    fun exitOld_column_name(ctx: plsqlParser.Old_column_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.new_column_name].
     * @param ctx the parse tree
     */
    fun enterNew_column_name(ctx: plsqlParser.New_column_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.new_column_name].
     * @param ctx the parse tree
     */
    fun exitNew_column_name(ctx: plsqlParser.New_column_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.modify_collection_retrieval].
     * @param ctx the parse tree
     */
    fun enterModify_collection_retrieval(ctx: plsqlParser.Modify_collection_retrievalContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.modify_collection_retrieval].
     * @param ctx the parse tree
     */
    fun exitModify_collection_retrieval(ctx: plsqlParser.Modify_collection_retrievalContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.collection_item].
     * @param ctx the parse tree
     */
    fun enterCollection_item(ctx: plsqlParser.Collection_itemContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.collection_item].
     * @param ctx the parse tree
     */
    fun exitCollection_item(ctx: plsqlParser.Collection_itemContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.modify_lob_storage_clause].
     * @param ctx the parse tree
     */
    fun enterModify_lob_storage_clause(ctx: plsqlParser.Modify_lob_storage_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.modify_lob_storage_clause].
     * @param ctx the parse tree
     */
    fun exitModify_lob_storage_clause(ctx: plsqlParser.Modify_lob_storage_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.modify_lob_parameters].
     * @param ctx the parse tree
     */
    fun enterModify_lob_parameters(ctx: plsqlParser.Modify_lob_parametersContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.modify_lob_parameters].
     * @param ctx the parse tree
     */
    fun exitModify_lob_parameters(ctx: plsqlParser.Modify_lob_parametersContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_function].
     * @param ctx the parse tree
     */
    fun enterDrop_function(ctx: plsqlParser.Drop_functionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_function].
     * @param ctx the parse tree
     */
    fun exitDrop_function(ctx: plsqlParser.Drop_functionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_function].
     * @param ctx the parse tree
     */
    fun enterAlter_function(ctx: plsqlParser.Alter_functionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_function].
     * @param ctx the parse tree
     */
    fun exitAlter_function(ctx: plsqlParser.Alter_functionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_function_body].
     * @param ctx the parse tree
     */
    fun enterCreate_function_body(ctx: plsqlParser.Create_function_bodyContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_function_body].
     * @param ctx the parse tree
     */
    fun exitCreate_function_body(ctx: plsqlParser.Create_function_bodyContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.parallel_enable_clause].
     * @param ctx the parse tree
     */
    fun enterParallel_enable_clause(ctx: plsqlParser.Parallel_enable_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.parallel_enable_clause].
     * @param ctx the parse tree
     */
    fun exitParallel_enable_clause(ctx: plsqlParser.Parallel_enable_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.partition_by_clause].
     * @param ctx the parse tree
     */
    fun enterPartition_by_clause(ctx: plsqlParser.Partition_by_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.partition_by_clause].
     * @param ctx the parse tree
     */
    fun exitPartition_by_clause(ctx: plsqlParser.Partition_by_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.result_cache_clause].
     * @param ctx the parse tree
     */
    fun enterResult_cache_clause(ctx: plsqlParser.Result_cache_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.result_cache_clause].
     * @param ctx the parse tree
     */
    fun exitResult_cache_clause(ctx: plsqlParser.Result_cache_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.relies_on_part].
     * @param ctx the parse tree
     */
    fun enterRelies_on_part(ctx: plsqlParser.Relies_on_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.relies_on_part].
     * @param ctx the parse tree
     */
    fun exitRelies_on_part(ctx: plsqlParser.Relies_on_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.streaming_clause].
     * @param ctx the parse tree
     */
    fun enterStreaming_clause(ctx: plsqlParser.Streaming_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.streaming_clause].
     * @param ctx the parse tree
     */
    fun exitStreaming_clause(ctx: plsqlParser.Streaming_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_package].
     * @param ctx the parse tree
     */
    fun enterDrop_package(ctx: plsqlParser.Drop_packageContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_package].
     * @param ctx the parse tree
     */
    fun exitDrop_package(ctx: plsqlParser.Drop_packageContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_package].
     * @param ctx the parse tree
     */
    fun enterAlter_package(ctx: plsqlParser.Alter_packageContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_package].
     * @param ctx the parse tree
     */
    fun exitAlter_package(ctx: plsqlParser.Alter_packageContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_package].
     * @param ctx the parse tree
     */
    fun enterCreate_package(ctx: plsqlParser.Create_packageContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_package].
     * @param ctx the parse tree
     */
    fun exitCreate_package(ctx: plsqlParser.Create_packageContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.package_body].
     * @param ctx the parse tree
     */
    fun enterPackage_body(ctx: plsqlParser.Package_bodyContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.package_body].
     * @param ctx the parse tree
     */
    fun exitPackage_body(ctx: plsqlParser.Package_bodyContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.package_spec].
     * @param ctx the parse tree
     */
    fun enterPackage_spec(ctx: plsqlParser.Package_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.package_spec].
     * @param ctx the parse tree
     */
    fun exitPackage_spec(ctx: plsqlParser.Package_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.package_obj_spec].
     * @param ctx the parse tree
     */
    fun enterPackage_obj_spec(ctx: plsqlParser.Package_obj_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.package_obj_spec].
     * @param ctx the parse tree
     */
    fun exitPackage_obj_spec(ctx: plsqlParser.Package_obj_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.procedure_spec].
     * @param ctx the parse tree
     */
    fun enterProcedure_spec(ctx: plsqlParser.Procedure_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.procedure_spec].
     * @param ctx the parse tree
     */
    fun exitProcedure_spec(ctx: plsqlParser.Procedure_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.function_spec].
     * @param ctx the parse tree
     */
    fun enterFunction_spec(ctx: plsqlParser.Function_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.function_spec].
     * @param ctx the parse tree
     */
    fun exitFunction_spec(ctx: plsqlParser.Function_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.package_obj_body].
     * @param ctx the parse tree
     */
    fun enterPackage_obj_body(ctx: plsqlParser.Package_obj_bodyContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.package_obj_body].
     * @param ctx the parse tree
     */
    fun exitPackage_obj_body(ctx: plsqlParser.Package_obj_bodyContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_procedure].
     * @param ctx the parse tree
     */
    fun enterDrop_procedure(ctx: plsqlParser.Drop_procedureContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_procedure].
     * @param ctx the parse tree
     */
    fun exitDrop_procedure(ctx: plsqlParser.Drop_procedureContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_procedure].
     * @param ctx the parse tree
     */
    fun enterAlter_procedure(ctx: plsqlParser.Alter_procedureContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_procedure].
     * @param ctx the parse tree
     */
    fun exitAlter_procedure(ctx: plsqlParser.Alter_procedureContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_procedure_body].
     * @param ctx the parse tree
     */
    fun enterCreate_procedure_body(ctx: plsqlParser.Create_procedure_bodyContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_procedure_body].
     * @param ctx the parse tree
     */
    fun exitCreate_procedure_body(ctx: plsqlParser.Create_procedure_bodyContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_trigger].
     * @param ctx the parse tree
     */
    fun enterDrop_trigger(ctx: plsqlParser.Drop_triggerContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_trigger].
     * @param ctx the parse tree
     */
    fun exitDrop_trigger(ctx: plsqlParser.Drop_triggerContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_trigger].
     * @param ctx the parse tree
     */
    fun enterAlter_trigger(ctx: plsqlParser.Alter_triggerContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_trigger].
     * @param ctx the parse tree
     */
    fun exitAlter_trigger(ctx: plsqlParser.Alter_triggerContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_trigger].
     * @param ctx the parse tree
     */
    fun enterCreate_trigger(ctx: plsqlParser.Create_triggerContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_trigger].
     * @param ctx the parse tree
     */
    fun exitCreate_trigger(ctx: plsqlParser.Create_triggerContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.trigger_follows_clause].
     * @param ctx the parse tree
     */
    fun enterTrigger_follows_clause(ctx: plsqlParser.Trigger_follows_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.trigger_follows_clause].
     * @param ctx the parse tree
     */
    fun exitTrigger_follows_clause(ctx: plsqlParser.Trigger_follows_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.trigger_when_clause].
     * @param ctx the parse tree
     */
    fun enterTrigger_when_clause(ctx: plsqlParser.Trigger_when_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.trigger_when_clause].
     * @param ctx the parse tree
     */
    fun exitTrigger_when_clause(ctx: plsqlParser.Trigger_when_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.simple_dml_trigger].
     * @param ctx the parse tree
     */
    fun enterSimple_dml_trigger(ctx: plsqlParser.Simple_dml_triggerContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.simple_dml_trigger].
     * @param ctx the parse tree
     */
    fun exitSimple_dml_trigger(ctx: plsqlParser.Simple_dml_triggerContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.for_each_row].
     * @param ctx the parse tree
     */
    fun enterFor_each_row(ctx: plsqlParser.For_each_rowContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.for_each_row].
     * @param ctx the parse tree
     */
    fun exitFor_each_row(ctx: plsqlParser.For_each_rowContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.compound_dml_trigger].
     * @param ctx the parse tree
     */
    fun enterCompound_dml_trigger(ctx: plsqlParser.Compound_dml_triggerContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.compound_dml_trigger].
     * @param ctx the parse tree
     */
    fun exitCompound_dml_trigger(ctx: plsqlParser.Compound_dml_triggerContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.non_dml_trigger].
     * @param ctx the parse tree
     */
    fun enterNon_dml_trigger(ctx: plsqlParser.Non_dml_triggerContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.non_dml_trigger].
     * @param ctx the parse tree
     */
    fun exitNon_dml_trigger(ctx: plsqlParser.Non_dml_triggerContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.trigger_body].
     * @param ctx the parse tree
     */
    fun enterTrigger_body(ctx: plsqlParser.Trigger_bodyContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.trigger_body].
     * @param ctx the parse tree
     */
    fun exitTrigger_body(ctx: plsqlParser.Trigger_bodyContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.routine_clause].
     * @param ctx the parse tree
     */
    fun enterRoutine_clause(ctx: plsqlParser.Routine_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.routine_clause].
     * @param ctx the parse tree
     */
    fun exitRoutine_clause(ctx: plsqlParser.Routine_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.compound_trigger_block].
     * @param ctx the parse tree
     */
    fun enterCompound_trigger_block(ctx: plsqlParser.Compound_trigger_blockContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.compound_trigger_block].
     * @param ctx the parse tree
     */
    fun exitCompound_trigger_block(ctx: plsqlParser.Compound_trigger_blockContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.timing_point_section].
     * @param ctx the parse tree
     */
    fun enterTiming_point_section(ctx: plsqlParser.Timing_point_sectionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.timing_point_section].
     * @param ctx the parse tree
     */
    fun exitTiming_point_section(ctx: plsqlParser.Timing_point_sectionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.non_dml_event].
     * @param ctx the parse tree
     */
    fun enterNon_dml_event(ctx: plsqlParser.Non_dml_eventContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.non_dml_event].
     * @param ctx the parse tree
     */
    fun exitNon_dml_event(ctx: plsqlParser.Non_dml_eventContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.dml_event_clause].
     * @param ctx the parse tree
     */
    fun enterDml_event_clause(ctx: plsqlParser.Dml_event_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.dml_event_clause].
     * @param ctx the parse tree
     */
    fun exitDml_event_clause(ctx: plsqlParser.Dml_event_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.dml_event_element].
     * @param ctx the parse tree
     */
    fun enterDml_event_element(ctx: plsqlParser.Dml_event_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.dml_event_element].
     * @param ctx the parse tree
     */
    fun exitDml_event_element(ctx: plsqlParser.Dml_event_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.dml_event_nested_clause].
     * @param ctx the parse tree
     */
    fun enterDml_event_nested_clause(ctx: plsqlParser.Dml_event_nested_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.dml_event_nested_clause].
     * @param ctx the parse tree
     */
    fun exitDml_event_nested_clause(ctx: plsqlParser.Dml_event_nested_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.referencing_clause].
     * @param ctx the parse tree
     */
    fun enterReferencing_clause(ctx: plsqlParser.Referencing_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.referencing_clause].
     * @param ctx the parse tree
     */
    fun exitReferencing_clause(ctx: plsqlParser.Referencing_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.referencing_element].
     * @param ctx the parse tree
     */
    fun enterReferencing_element(ctx: plsqlParser.Referencing_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.referencing_element].
     * @param ctx the parse tree
     */
    fun exitReferencing_element(ctx: plsqlParser.Referencing_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_type].
     * @param ctx the parse tree
     */
    fun enterDrop_type(ctx: plsqlParser.Drop_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_type].
     * @param ctx the parse tree
     */
    fun exitDrop_type(ctx: plsqlParser.Drop_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_type].
     * @param ctx the parse tree
     */
    fun enterAlter_type(ctx: plsqlParser.Alter_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_type].
     * @param ctx the parse tree
     */
    fun exitAlter_type(ctx: plsqlParser.Alter_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.compile_type_clause].
     * @param ctx the parse tree
     */
    fun enterCompile_type_clause(ctx: plsqlParser.Compile_type_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.compile_type_clause].
     * @param ctx the parse tree
     */
    fun exitCompile_type_clause(ctx: plsqlParser.Compile_type_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.replace_type_clause].
     * @param ctx the parse tree
     */
    fun enterReplace_type_clause(ctx: plsqlParser.Replace_type_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.replace_type_clause].
     * @param ctx the parse tree
     */
    fun exitReplace_type_clause(ctx: plsqlParser.Replace_type_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_method_spec].
     * @param ctx the parse tree
     */
    fun enterAlter_method_spec(ctx: plsqlParser.Alter_method_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_method_spec].
     * @param ctx the parse tree
     */
    fun exitAlter_method_spec(ctx: plsqlParser.Alter_method_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_method_element].
     * @param ctx the parse tree
     */
    fun enterAlter_method_element(ctx: plsqlParser.Alter_method_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_method_element].
     * @param ctx the parse tree
     */
    fun exitAlter_method_element(ctx: plsqlParser.Alter_method_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_attribute_definition].
     * @param ctx the parse tree
     */
    fun enterAlter_attribute_definition(ctx: plsqlParser.Alter_attribute_definitionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_attribute_definition].
     * @param ctx the parse tree
     */
    fun exitAlter_attribute_definition(ctx: plsqlParser.Alter_attribute_definitionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.attribute_definition].
     * @param ctx the parse tree
     */
    fun enterAttribute_definition(ctx: plsqlParser.Attribute_definitionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.attribute_definition].
     * @param ctx the parse tree
     */
    fun exitAttribute_definition(ctx: plsqlParser.Attribute_definitionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_collection_clauses].
     * @param ctx the parse tree
     */
    fun enterAlter_collection_clauses(ctx: plsqlParser.Alter_collection_clausesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_collection_clauses].
     * @param ctx the parse tree
     */
    fun exitAlter_collection_clauses(ctx: plsqlParser.Alter_collection_clausesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.dependent_handling_clause].
     * @param ctx the parse tree
     */
    fun enterDependent_handling_clause(ctx: plsqlParser.Dependent_handling_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.dependent_handling_clause].
     * @param ctx the parse tree
     */
    fun exitDependent_handling_clause(ctx: plsqlParser.Dependent_handling_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.dependent_exceptions_part].
     * @param ctx the parse tree
     */
    fun enterDependent_exceptions_part(ctx: plsqlParser.Dependent_exceptions_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.dependent_exceptions_part].
     * @param ctx the parse tree
     */
    fun exitDependent_exceptions_part(ctx: plsqlParser.Dependent_exceptions_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_type].
     * @param ctx the parse tree
     */
    fun enterCreate_type(ctx: plsqlParser.Create_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_type].
     * @param ctx the parse tree
     */
    fun exitCreate_type(ctx: plsqlParser.Create_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.type_definition].
     * @param ctx the parse tree
     */
    fun enterType_definition(ctx: plsqlParser.Type_definitionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.type_definition].
     * @param ctx the parse tree
     */
    fun exitType_definition(ctx: plsqlParser.Type_definitionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.object_type_def].
     * @param ctx the parse tree
     */
    fun enterObject_type_def(ctx: plsqlParser.Object_type_defContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.object_type_def].
     * @param ctx the parse tree
     */
    fun exitObject_type_def(ctx: plsqlParser.Object_type_defContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.object_as_part].
     * @param ctx the parse tree
     */
    fun enterObject_as_part(ctx: plsqlParser.Object_as_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.object_as_part].
     * @param ctx the parse tree
     */
    fun exitObject_as_part(ctx: plsqlParser.Object_as_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.object_under_part].
     * @param ctx the parse tree
     */
    fun enterObject_under_part(ctx: plsqlParser.Object_under_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.object_under_part].
     * @param ctx the parse tree
     */
    fun exitObject_under_part(ctx: plsqlParser.Object_under_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.nested_table_type_def].
     * @param ctx the parse tree
     */
    fun enterNested_table_type_def(ctx: plsqlParser.Nested_table_type_defContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.nested_table_type_def].
     * @param ctx the parse tree
     */
    fun exitNested_table_type_def(ctx: plsqlParser.Nested_table_type_defContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sqlj_object_type].
     * @param ctx the parse tree
     */
    fun enterSqlj_object_type(ctx: plsqlParser.Sqlj_object_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sqlj_object_type].
     * @param ctx the parse tree
     */
    fun exitSqlj_object_type(ctx: plsqlParser.Sqlj_object_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.type_body].
     * @param ctx the parse tree
     */
    fun enterType_body(ctx: plsqlParser.Type_bodyContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.type_body].
     * @param ctx the parse tree
     */
    fun exitType_body(ctx: plsqlParser.Type_bodyContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.type_body_elements].
     * @param ctx the parse tree
     */
    fun enterType_body_elements(ctx: plsqlParser.Type_body_elementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.type_body_elements].
     * @param ctx the parse tree
     */
    fun exitType_body_elements(ctx: plsqlParser.Type_body_elementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.map_order_func_declaration].
     * @param ctx the parse tree
     */
    fun enterMap_order_func_declaration(ctx: plsqlParser.Map_order_func_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.map_order_func_declaration].
     * @param ctx the parse tree
     */
    fun exitMap_order_func_declaration(ctx: plsqlParser.Map_order_func_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subprog_decl_in_type].
     * @param ctx the parse tree
     */
    fun enterSubprog_decl_in_type(ctx: plsqlParser.Subprog_decl_in_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subprog_decl_in_type].
     * @param ctx the parse tree
     */
    fun exitSubprog_decl_in_type(ctx: plsqlParser.Subprog_decl_in_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.proc_decl_in_type].
     * @param ctx the parse tree
     */
    fun enterProc_decl_in_type(ctx: plsqlParser.Proc_decl_in_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.proc_decl_in_type].
     * @param ctx the parse tree
     */
    fun exitProc_decl_in_type(ctx: plsqlParser.Proc_decl_in_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.func_decl_in_type].
     * @param ctx the parse tree
     */
    fun enterFunc_decl_in_type(ctx: plsqlParser.Func_decl_in_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.func_decl_in_type].
     * @param ctx the parse tree
     */
    fun exitFunc_decl_in_type(ctx: plsqlParser.Func_decl_in_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.constructor_declaration].
     * @param ctx the parse tree
     */
    fun enterConstructor_declaration(ctx: plsqlParser.Constructor_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.constructor_declaration].
     * @param ctx the parse tree
     */
    fun exitConstructor_declaration(ctx: plsqlParser.Constructor_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.modifier_clause].
     * @param ctx the parse tree
     */
    fun enterModifier_clause(ctx: plsqlParser.Modifier_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.modifier_clause].
     * @param ctx the parse tree
     */
    fun exitModifier_clause(ctx: plsqlParser.Modifier_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.object_member_spec].
     * @param ctx the parse tree
     */
    fun enterObject_member_spec(ctx: plsqlParser.Object_member_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.object_member_spec].
     * @param ctx the parse tree
     */
    fun exitObject_member_spec(ctx: plsqlParser.Object_member_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sqlj_object_type_attr].
     * @param ctx the parse tree
     */
    fun enterSqlj_object_type_attr(ctx: plsqlParser.Sqlj_object_type_attrContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sqlj_object_type_attr].
     * @param ctx the parse tree
     */
    fun exitSqlj_object_type_attr(ctx: plsqlParser.Sqlj_object_type_attrContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.element_spec].
     * @param ctx the parse tree
     */
    fun enterElement_spec(ctx: plsqlParser.Element_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.element_spec].
     * @param ctx the parse tree
     */
    fun exitElement_spec(ctx: plsqlParser.Element_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.element_spec_options].
     * @param ctx the parse tree
     */
    fun enterElement_spec_options(ctx: plsqlParser.Element_spec_optionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.element_spec_options].
     * @param ctx the parse tree
     */
    fun exitElement_spec_options(ctx: plsqlParser.Element_spec_optionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subprogram_spec].
     * @param ctx the parse tree
     */
    fun enterSubprogram_spec(ctx: plsqlParser.Subprogram_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subprogram_spec].
     * @param ctx the parse tree
     */
    fun exitSubprogram_spec(ctx: plsqlParser.Subprogram_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.type_procedure_spec].
     * @param ctx the parse tree
     */
    fun enterType_procedure_spec(ctx: plsqlParser.Type_procedure_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.type_procedure_spec].
     * @param ctx the parse tree
     */
    fun exitType_procedure_spec(ctx: plsqlParser.Type_procedure_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.type_function_spec].
     * @param ctx the parse tree
     */
    fun enterType_function_spec(ctx: plsqlParser.Type_function_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.type_function_spec].
     * @param ctx the parse tree
     */
    fun exitType_function_spec(ctx: plsqlParser.Type_function_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.constructor_spec].
     * @param ctx the parse tree
     */
    fun enterConstructor_spec(ctx: plsqlParser.Constructor_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.constructor_spec].
     * @param ctx the parse tree
     */
    fun exitConstructor_spec(ctx: plsqlParser.Constructor_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.map_order_function_spec].
     * @param ctx the parse tree
     */
    fun enterMap_order_function_spec(ctx: plsqlParser.Map_order_function_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.map_order_function_spec].
     * @param ctx the parse tree
     */
    fun exitMap_order_function_spec(ctx: plsqlParser.Map_order_function_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.pragma_clause].
     * @param ctx the parse tree
     */
    fun enterPragma_clause(ctx: plsqlParser.Pragma_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.pragma_clause].
     * @param ctx the parse tree
     */
    fun exitPragma_clause(ctx: plsqlParser.Pragma_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.pragma_elements].
     * @param ctx the parse tree
     */
    fun enterPragma_elements(ctx: plsqlParser.Pragma_elementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.pragma_elements].
     * @param ctx the parse tree
     */
    fun exitPragma_elements(ctx: plsqlParser.Pragma_elementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.type_elements_parameter].
     * @param ctx the parse tree
     */
    fun enterType_elements_parameter(ctx: plsqlParser.Type_elements_parameterContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.type_elements_parameter].
     * @param ctx the parse tree
     */
    fun exitType_elements_parameter(ctx: plsqlParser.Type_elements_parameterContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.drop_sequence].
     * @param ctx the parse tree
     */
    fun enterDrop_sequence(ctx: plsqlParser.Drop_sequenceContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.drop_sequence].
     * @param ctx the parse tree
     */
    fun exitDrop_sequence(ctx: plsqlParser.Drop_sequenceContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alter_sequence].
     * @param ctx the parse tree
     */
    fun enterAlter_sequence(ctx: plsqlParser.Alter_sequenceContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alter_sequence].
     * @param ctx the parse tree
     */
    fun exitAlter_sequence(ctx: plsqlParser.Alter_sequenceContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.create_sequence].
     * @param ctx the parse tree
     */
    fun enterCreate_sequence(ctx: plsqlParser.Create_sequenceContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.create_sequence].
     * @param ctx the parse tree
     */
    fun exitCreate_sequence(ctx: plsqlParser.Create_sequenceContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sequence_spec].
     * @param ctx the parse tree
     */
    fun enterSequence_spec(ctx: plsqlParser.Sequence_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sequence_spec].
     * @param ctx the parse tree
     */
    fun exitSequence_spec(ctx: plsqlParser.Sequence_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sequence_start_clause].
     * @param ctx the parse tree
     */
    fun enterSequence_start_clause(ctx: plsqlParser.Sequence_start_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sequence_start_clause].
     * @param ctx the parse tree
     */
    fun exitSequence_start_clause(ctx: plsqlParser.Sequence_start_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.invoker_rights_clause].
     * @param ctx the parse tree
     */
    fun enterInvoker_rights_clause(ctx: plsqlParser.Invoker_rights_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.invoker_rights_clause].
     * @param ctx the parse tree
     */
    fun exitInvoker_rights_clause(ctx: plsqlParser.Invoker_rights_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.compiler_parameters_clause].
     * @param ctx the parse tree
     */
    fun enterCompiler_parameters_clause(ctx: plsqlParser.Compiler_parameters_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.compiler_parameters_clause].
     * @param ctx the parse tree
     */
    fun exitCompiler_parameters_clause(ctx: plsqlParser.Compiler_parameters_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.call_spec].
     * @param ctx the parse tree
     */
    fun enterCall_spec(ctx: plsqlParser.Call_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.call_spec].
     * @param ctx the parse tree
     */
    fun exitCall_spec(ctx: plsqlParser.Call_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.java_spec].
     * @param ctx the parse tree
     */
    fun enterJava_spec(ctx: plsqlParser.Java_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.java_spec].
     * @param ctx the parse tree
     */
    fun exitJava_spec(ctx: plsqlParser.Java_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.c_spec].
     * @param ctx the parse tree
     */
    fun enterC_spec(ctx: plsqlParser.C_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.c_spec].
     * @param ctx the parse tree
     */
    fun exitC_spec(ctx: plsqlParser.C_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.c_agent_in_clause].
     * @param ctx the parse tree
     */
    fun enterC_agent_in_clause(ctx: plsqlParser.C_agent_in_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.c_agent_in_clause].
     * @param ctx the parse tree
     */
    fun exitC_agent_in_clause(ctx: plsqlParser.C_agent_in_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.c_parameters_clause].
     * @param ctx the parse tree
     */
    fun enterC_parameters_clause(ctx: plsqlParser.C_parameters_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.c_parameters_clause].
     * @param ctx the parse tree
     */
    fun exitC_parameters_clause(ctx: plsqlParser.C_parameters_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.parameter].
     * @param ctx the parse tree
     */
    fun enterParameter(ctx: plsqlParser.ParameterContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.parameter].
     * @param ctx the parse tree
     */
    fun exitParameter(ctx: plsqlParser.ParameterContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.default_value_part].
     * @param ctx the parse tree
     */
    fun enterDefault_value_part(ctx: plsqlParser.Default_value_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.default_value_part].
     * @param ctx the parse tree
     */
    fun exitDefault_value_part(ctx: plsqlParser.Default_value_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.declare_spec].
     * @param ctx the parse tree
     */
    fun enterDeclare_spec(ctx: plsqlParser.Declare_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.declare_spec].
     * @param ctx the parse tree
     */
    fun exitDeclare_spec(ctx: plsqlParser.Declare_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.variable_declaration].
     * @param ctx the parse tree
     */
    fun enterVariable_declaration(ctx: plsqlParser.Variable_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.variable_declaration].
     * @param ctx the parse tree
     */
    fun exitVariable_declaration(ctx: plsqlParser.Variable_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subtype_declaration].
     * @param ctx the parse tree
     */
    fun enterSubtype_declaration(ctx: plsqlParser.Subtype_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subtype_declaration].
     * @param ctx the parse tree
     */
    fun exitSubtype_declaration(ctx: plsqlParser.Subtype_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cursor_declaration].
     * @param ctx the parse tree
     */
    fun enterCursor_declaration(ctx: plsqlParser.Cursor_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cursor_declaration].
     * @param ctx the parse tree
     */
    fun exitCursor_declaration(ctx: plsqlParser.Cursor_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.parameter_spec].
     * @param ctx the parse tree
     */
    fun enterParameter_spec(ctx: plsqlParser.Parameter_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.parameter_spec].
     * @param ctx the parse tree
     */
    fun exitParameter_spec(ctx: plsqlParser.Parameter_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.exception_declaration].
     * @param ctx the parse tree
     */
    fun enterException_declaration(ctx: plsqlParser.Exception_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.exception_declaration].
     * @param ctx the parse tree
     */
    fun exitException_declaration(ctx: plsqlParser.Exception_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.pragma_declaration].
     * @param ctx the parse tree
     */
    fun enterPragma_declaration(ctx: plsqlParser.Pragma_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.pragma_declaration].
     * @param ctx the parse tree
     */
    fun exitPragma_declaration(ctx: plsqlParser.Pragma_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.record_declaration].
     * @param ctx the parse tree
     */
    fun enterRecord_declaration(ctx: plsqlParser.Record_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.record_declaration].
     * @param ctx the parse tree
     */
    fun exitRecord_declaration(ctx: plsqlParser.Record_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.record_type_dec].
     * @param ctx the parse tree
     */
    fun enterRecord_type_dec(ctx: plsqlParser.Record_type_decContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.record_type_dec].
     * @param ctx the parse tree
     */
    fun exitRecord_type_dec(ctx: plsqlParser.Record_type_decContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.field_spec].
     * @param ctx the parse tree
     */
    fun enterField_spec(ctx: plsqlParser.Field_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.field_spec].
     * @param ctx the parse tree
     */
    fun exitField_spec(ctx: plsqlParser.Field_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.record_var_dec].
     * @param ctx the parse tree
     */
    fun enterRecord_var_dec(ctx: plsqlParser.Record_var_decContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.record_var_dec].
     * @param ctx the parse tree
     */
    fun exitRecord_var_dec(ctx: plsqlParser.Record_var_decContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_declaration].
     * @param ctx the parse tree
     */
    fun enterTable_declaration(ctx: plsqlParser.Table_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_declaration].
     * @param ctx the parse tree
     */
    fun exitTable_declaration(ctx: plsqlParser.Table_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_type_dec].
     * @param ctx the parse tree
     */
    fun enterTable_type_dec(ctx: plsqlParser.Table_type_decContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_type_dec].
     * @param ctx the parse tree
     */
    fun exitTable_type_dec(ctx: plsqlParser.Table_type_decContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_indexed_by_part].
     * @param ctx the parse tree
     */
    fun enterTable_indexed_by_part(ctx: plsqlParser.Table_indexed_by_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_indexed_by_part].
     * @param ctx the parse tree
     */
    fun exitTable_indexed_by_part(ctx: plsqlParser.Table_indexed_by_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.varray_type_def].
     * @param ctx the parse tree
     */
    fun enterVarray_type_def(ctx: plsqlParser.Varray_type_defContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.varray_type_def].
     * @param ctx the parse tree
     */
    fun exitVarray_type_def(ctx: plsqlParser.Varray_type_defContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_var_dec].
     * @param ctx the parse tree
     */
    fun enterTable_var_dec(ctx: plsqlParser.Table_var_decContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_var_dec].
     * @param ctx the parse tree
     */
    fun exitTable_var_dec(ctx: plsqlParser.Table_var_decContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.seq_of_statements].
     * @param ctx the parse tree
     */
    fun enterSeq_of_statements(ctx: plsqlParser.Seq_of_statementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.seq_of_statements].
     * @param ctx the parse tree
     */
    fun exitSeq_of_statements(ctx: plsqlParser.Seq_of_statementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.label_declaration].
     * @param ctx the parse tree
     */
    fun enterLabel_declaration(ctx: plsqlParser.Label_declarationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.label_declaration].
     * @param ctx the parse tree
     */
    fun exitLabel_declaration(ctx: plsqlParser.Label_declarationContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.statement].
     * @param ctx the parse tree
     */
    fun enterStatement(ctx: plsqlParser.StatementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.statement].
     * @param ctx the parse tree
     */
    fun exitStatement(ctx: plsqlParser.StatementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.assignment_statement].
     * @param ctx the parse tree
     */
    fun enterAssignment_statement(ctx: plsqlParser.Assignment_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.assignment_statement].
     * @param ctx the parse tree
     */
    fun exitAssignment_statement(ctx: plsqlParser.Assignment_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.continue_statement].
     * @param ctx the parse tree
     */
    fun enterContinue_statement(ctx: plsqlParser.Continue_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.continue_statement].
     * @param ctx the parse tree
     */
    fun exitContinue_statement(ctx: plsqlParser.Continue_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.exit_statement].
     * @param ctx the parse tree
     */
    fun enterExit_statement(ctx: plsqlParser.Exit_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.exit_statement].
     * @param ctx the parse tree
     */
    fun exitExit_statement(ctx: plsqlParser.Exit_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.goto_statement].
     * @param ctx the parse tree
     */
    fun enterGoto_statement(ctx: plsqlParser.Goto_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.goto_statement].
     * @param ctx the parse tree
     */
    fun exitGoto_statement(ctx: plsqlParser.Goto_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.if_statement].
     * @param ctx the parse tree
     */
    fun enterIf_statement(ctx: plsqlParser.If_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.if_statement].
     * @param ctx the parse tree
     */
    fun exitIf_statement(ctx: plsqlParser.If_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.elsif_part].
     * @param ctx the parse tree
     */
    fun enterElsif_part(ctx: plsqlParser.Elsif_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.elsif_part].
     * @param ctx the parse tree
     */
    fun exitElsif_part(ctx: plsqlParser.Elsif_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.else_part].
     * @param ctx the parse tree
     */
    fun enterElse_part(ctx: plsqlParser.Else_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.else_part].
     * @param ctx the parse tree
     */
    fun exitElse_part(ctx: plsqlParser.Else_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.loop_statement].
     * @param ctx the parse tree
     */
    fun enterLoop_statement(ctx: plsqlParser.Loop_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.loop_statement].
     * @param ctx the parse tree
     */
    fun exitLoop_statement(ctx: plsqlParser.Loop_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cursor_loop_param].
     * @param ctx the parse tree
     */
    fun enterCursor_loop_param(ctx: plsqlParser.Cursor_loop_paramContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cursor_loop_param].
     * @param ctx the parse tree
     */
    fun exitCursor_loop_param(ctx: plsqlParser.Cursor_loop_paramContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.forall_statement].
     * @param ctx the parse tree
     */
    fun enterForall_statement(ctx: plsqlParser.Forall_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.forall_statement].
     * @param ctx the parse tree
     */
    fun exitForall_statement(ctx: plsqlParser.Forall_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.bounds_clause].
     * @param ctx the parse tree
     */
    fun enterBounds_clause(ctx: plsqlParser.Bounds_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.bounds_clause].
     * @param ctx the parse tree
     */
    fun exitBounds_clause(ctx: plsqlParser.Bounds_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.between_bound].
     * @param ctx the parse tree
     */
    fun enterBetween_bound(ctx: plsqlParser.Between_boundContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.between_bound].
     * @param ctx the parse tree
     */
    fun exitBetween_bound(ctx: plsqlParser.Between_boundContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lower_bound].
     * @param ctx the parse tree
     */
    fun enterLower_bound(ctx: plsqlParser.Lower_boundContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lower_bound].
     * @param ctx the parse tree
     */
    fun exitLower_bound(ctx: plsqlParser.Lower_boundContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.upper_bound].
     * @param ctx the parse tree
     */
    fun enterUpper_bound(ctx: plsqlParser.Upper_boundContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.upper_bound].
     * @param ctx the parse tree
     */
    fun exitUpper_bound(ctx: plsqlParser.Upper_boundContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.null_statement].
     * @param ctx the parse tree
     */
    fun enterNull_statement(ctx: plsqlParser.Null_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.null_statement].
     * @param ctx the parse tree
     */
    fun exitNull_statement(ctx: plsqlParser.Null_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.raise_statement].
     * @param ctx the parse tree
     */
    fun enterRaise_statement(ctx: plsqlParser.Raise_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.raise_statement].
     * @param ctx the parse tree
     */
    fun exitRaise_statement(ctx: plsqlParser.Raise_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.return_statement].
     * @param ctx the parse tree
     */
    fun enterReturn_statement(ctx: plsqlParser.Return_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.return_statement].
     * @param ctx the parse tree
     */
    fun exitReturn_statement(ctx: plsqlParser.Return_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.function_call].
     * @param ctx the parse tree
     */
    fun enterFunction_call(ctx: plsqlParser.Function_callContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.function_call].
     * @param ctx the parse tree
     */
    fun exitFunction_call(ctx: plsqlParser.Function_callContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.body].
     * @param ctx the parse tree
     */
    fun enterBody(ctx: plsqlParser.BodyContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.body].
     * @param ctx the parse tree
     */
    fun exitBody(ctx: plsqlParser.BodyContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.exception_handler].
     * @param ctx the parse tree
     */
    fun enterException_handler(ctx: plsqlParser.Exception_handlerContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.exception_handler].
     * @param ctx the parse tree
     */
    fun exitException_handler(ctx: plsqlParser.Exception_handlerContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.trigger_block].
     * @param ctx the parse tree
     */
    fun enterTrigger_block(ctx: plsqlParser.Trigger_blockContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.trigger_block].
     * @param ctx the parse tree
     */
    fun exitTrigger_block(ctx: plsqlParser.Trigger_blockContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.block].
     * @param ctx the parse tree
     */
    fun enterBlock(ctx: plsqlParser.BlockContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.block].
     * @param ctx the parse tree
     */
    fun exitBlock(ctx: plsqlParser.BlockContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sql_statement].
     * @param ctx the parse tree
     */
    fun enterSql_statement(ctx: plsqlParser.Sql_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sql_statement].
     * @param ctx the parse tree
     */
    fun exitSql_statement(ctx: plsqlParser.Sql_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.execute_immediate].
     * @param ctx the parse tree
     */
    fun enterExecute_immediate(ctx: plsqlParser.Execute_immediateContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.execute_immediate].
     * @param ctx the parse tree
     */
    fun exitExecute_immediate(ctx: plsqlParser.Execute_immediateContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.dynamic_returning_clause].
     * @param ctx the parse tree
     */
    fun enterDynamic_returning_clause(ctx: plsqlParser.Dynamic_returning_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.dynamic_returning_clause].
     * @param ctx the parse tree
     */
    fun exitDynamic_returning_clause(ctx: plsqlParser.Dynamic_returning_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.data_manipulation_language_statements].
     * @param ctx the parse tree
     */
    fun enterData_manipulation_language_statements(ctx: plsqlParser.Data_manipulation_language_statementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.data_manipulation_language_statements].
     * @param ctx the parse tree
     */
    fun exitData_manipulation_language_statements(ctx: plsqlParser.Data_manipulation_language_statementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cursor_manipulation_statements].
     * @param ctx the parse tree
     */
    fun enterCursor_manipulation_statements(ctx: plsqlParser.Cursor_manipulation_statementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cursor_manipulation_statements].
     * @param ctx the parse tree
     */
    fun exitCursor_manipulation_statements(ctx: plsqlParser.Cursor_manipulation_statementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.close_statement].
     * @param ctx the parse tree
     */
    fun enterClose_statement(ctx: plsqlParser.Close_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.close_statement].
     * @param ctx the parse tree
     */
    fun exitClose_statement(ctx: plsqlParser.Close_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.open_statement].
     * @param ctx the parse tree
     */
    fun enterOpen_statement(ctx: plsqlParser.Open_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.open_statement].
     * @param ctx the parse tree
     */
    fun exitOpen_statement(ctx: plsqlParser.Open_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.fetch_statement].
     * @param ctx the parse tree
     */
    fun enterFetch_statement(ctx: plsqlParser.Fetch_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.fetch_statement].
     * @param ctx the parse tree
     */
    fun exitFetch_statement(ctx: plsqlParser.Fetch_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.open_for_statement].
     * @param ctx the parse tree
     */
    fun enterOpen_for_statement(ctx: plsqlParser.Open_for_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.open_for_statement].
     * @param ctx the parse tree
     */
    fun exitOpen_for_statement(ctx: plsqlParser.Open_for_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.transaction_control_statements].
     * @param ctx the parse tree
     */
    fun enterTransaction_control_statements(ctx: plsqlParser.Transaction_control_statementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.transaction_control_statements].
     * @param ctx the parse tree
     */
    fun exitTransaction_control_statements(ctx: plsqlParser.Transaction_control_statementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.set_transaction_command].
     * @param ctx the parse tree
     */
    fun enterSet_transaction_command(ctx: plsqlParser.Set_transaction_commandContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.set_transaction_command].
     * @param ctx the parse tree
     */
    fun exitSet_transaction_command(ctx: plsqlParser.Set_transaction_commandContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.set_constraint_command].
     * @param ctx the parse tree
     */
    fun enterSet_constraint_command(ctx: plsqlParser.Set_constraint_commandContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.set_constraint_command].
     * @param ctx the parse tree
     */
    fun exitSet_constraint_command(ctx: plsqlParser.Set_constraint_commandContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.commit_statement].
     * @param ctx the parse tree
     */
    fun enterCommit_statement(ctx: plsqlParser.Commit_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.commit_statement].
     * @param ctx the parse tree
     */
    fun exitCommit_statement(ctx: plsqlParser.Commit_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.write_clause].
     * @param ctx the parse tree
     */
    fun enterWrite_clause(ctx: plsqlParser.Write_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.write_clause].
     * @param ctx the parse tree
     */
    fun exitWrite_clause(ctx: plsqlParser.Write_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.rollback_statement].
     * @param ctx the parse tree
     */
    fun enterRollback_statement(ctx: plsqlParser.Rollback_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.rollback_statement].
     * @param ctx the parse tree
     */
    fun exitRollback_statement(ctx: plsqlParser.Rollback_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.savepoint_statement].
     * @param ctx the parse tree
     */
    fun enterSavepoint_statement(ctx: plsqlParser.Savepoint_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.savepoint_statement].
     * @param ctx the parse tree
     */
    fun exitSavepoint_statement(ctx: plsqlParser.Savepoint_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.explain_statement].
     * @param ctx the parse tree
     */
    fun enterExplain_statement(ctx: plsqlParser.Explain_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.explain_statement].
     * @param ctx the parse tree
     */
    fun exitExplain_statement(ctx: plsqlParser.Explain_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.select_statement].
     * @param ctx the parse tree
     */
    fun enterSelect_statement(ctx: plsqlParser.Select_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.select_statement].
     * @param ctx the parse tree
     */
    fun exitSelect_statement(ctx: plsqlParser.Select_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subquery_factoring_clause].
     * @param ctx the parse tree
     */
    fun enterSubquery_factoring_clause(ctx: plsqlParser.Subquery_factoring_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subquery_factoring_clause].
     * @param ctx the parse tree
     */
    fun exitSubquery_factoring_clause(ctx: plsqlParser.Subquery_factoring_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.factoring_element].
     * @param ctx the parse tree
     */
    fun enterFactoring_element(ctx: plsqlParser.Factoring_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.factoring_element].
     * @param ctx the parse tree
     */
    fun exitFactoring_element(ctx: plsqlParser.Factoring_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.search_clause].
     * @param ctx the parse tree
     */
    fun enterSearch_clause(ctx: plsqlParser.Search_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.search_clause].
     * @param ctx the parse tree
     */
    fun exitSearch_clause(ctx: plsqlParser.Search_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cycle_clause].
     * @param ctx the parse tree
     */
    fun enterCycle_clause(ctx: plsqlParser.Cycle_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cycle_clause].
     * @param ctx the parse tree
     */
    fun exitCycle_clause(ctx: plsqlParser.Cycle_clauseContext?)

    /**
     * Enter a parse tree produced by the `SubqueryParen`
     * labeled alternative in [plsqlParser.subquery].
     * @param ctx the parse tree
     */
    fun enterSubqueryParen(ctx: plsqlParser.SubqueryParenContext?)

    /**
     * Exit a parse tree produced by the `SubqueryParen`
     * labeled alternative in [plsqlParser.subquery].
     * @param ctx the parse tree
     */
    fun exitSubqueryParen(ctx: plsqlParser.SubqueryParenContext?)

    /**
     * Enter a parse tree produced by the `IgnoreSubquery`
     * labeled alternative in [plsqlParser.subquery].
     * @param ctx the parse tree
     */
    fun enterIgnoreSubquery(ctx: plsqlParser.IgnoreSubqueryContext?)

    /**
     * Exit a parse tree produced by the `IgnoreSubquery`
     * labeled alternative in [plsqlParser.subquery].
     * @param ctx the parse tree
     */
    fun exitIgnoreSubquery(ctx: plsqlParser.IgnoreSubqueryContext?)

    /**
     * Enter a parse tree produced by the `SubqueryCompound`
     * labeled alternative in [plsqlParser.subquery].
     * @param ctx the parse tree
     */
    fun enterSubqueryCompound(ctx: plsqlParser.SubqueryCompoundContext?)

    /**
     * Exit a parse tree produced by the `SubqueryCompound`
     * labeled alternative in [plsqlParser.subquery].
     * @param ctx the parse tree
     */
    fun exitSubqueryCompound(ctx: plsqlParser.SubqueryCompoundContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subquery_operation_part].
     * @param ctx the parse tree
     */
    fun enterSubquery_operation_part(ctx: plsqlParser.Subquery_operation_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subquery_operation_part].
     * @param ctx the parse tree
     */
    fun exitSubquery_operation_part(ctx: plsqlParser.Subquery_operation_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.query_block].
     * @param ctx the parse tree
     */
    fun enterQuery_block(ctx: plsqlParser.Query_blockContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.query_block].
     * @param ctx the parse tree
     */
    fun exitQuery_block(ctx: plsqlParser.Query_blockContext?)

    /**
     * Enter a parse tree produced by the `Star1`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     */
    fun enterStar1(ctx: plsqlParser.Star1Context?)

    /**
     * Exit a parse tree produced by the `Star1`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     */
    fun exitStar1(ctx: plsqlParser.Star1Context?)

    /**
     * Enter a parse tree produced by the `StarTable`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     */
    fun enterStarTable(ctx: plsqlParser.StarTableContext?)

    /**
     * Exit a parse tree produced by the `StarTable`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     */
    fun exitStarTable(ctx: plsqlParser.StarTableContext?)

    /**
     * Enter a parse tree produced by the `IgnoreTableview_name`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     */
    fun enterIgnoreTableview_name(ctx: plsqlParser.IgnoreTableview_nameContext?)

    /**
     * Exit a parse tree produced by the `IgnoreTableview_name`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     */
    fun exitIgnoreTableview_name(ctx: plsqlParser.IgnoreTableview_nameContext?)

    /**
     * Enter a parse tree produced by the `Alias_expr`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     */
    fun enterAlias_expr(ctx: plsqlParser.Alias_exprContext?)

    /**
     * Exit a parse tree produced by the `Alias_expr`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     */
    fun exitAlias_expr(ctx: plsqlParser.Alias_exprContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.from_clause].
     * @param ctx the parse tree
     */
    fun enterFrom_clause(ctx: plsqlParser.From_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.from_clause].
     * @param ctx the parse tree
     */
    fun exitFrom_clause(ctx: plsqlParser.From_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_ref_pivot].
     * @param ctx the parse tree
     */
    fun enterTable_ref_pivot(ctx: plsqlParser.Table_ref_pivotContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_ref_pivot].
     * @param ctx the parse tree
     */
    fun exitTable_ref_pivot(ctx: plsqlParser.Table_ref_pivotContext?)

    /**
     * Enter a parse tree produced by the `JoinExpr`
     * labeled alternative in [plsqlParser.table_ref].
     * @param ctx the parse tree
     */
    fun enterJoinExpr(ctx: plsqlParser.JoinExprContext?)

    /**
     * Exit a parse tree produced by the `JoinExpr`
     * labeled alternative in [plsqlParser.table_ref].
     * @param ctx the parse tree
     */
    fun exitJoinExpr(ctx: plsqlParser.JoinExprContext?)

    /**
     * Enter a parse tree produced by the `TableRefSimple`
     * labeled alternative in [plsqlParser.table_ref].
     * @param ctx the parse tree
     */
    fun enterTableRefSimple(ctx: plsqlParser.TableRefSimpleContext?)

    /**
     * Exit a parse tree produced by the `TableRefSimple`
     * labeled alternative in [plsqlParser.table_ref].
     * @param ctx the parse tree
     */
    fun exitTableRefSimple(ctx: plsqlParser.TableRefSimpleContext?)

    /**
     * Enter a parse tree produced by the `TableRefAux`
     * labeled alternative in [plsqlParser.table_ref].
     * @param ctx the parse tree
     */
    fun enterTableRefAux(ctx: plsqlParser.TableRefAuxContext?)

    /**
     * Exit a parse tree produced by the `TableRefAux`
     * labeled alternative in [plsqlParser.table_ref].
     * @param ctx the parse tree
     */
    fun exitTableRefAux(ctx: plsqlParser.TableRefAuxContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_ref_aux].
     * @param ctx the parse tree
     */
    fun enterTable_ref_aux(ctx: plsqlParser.Table_ref_auxContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_ref_aux].
     * @param ctx the parse tree
     */
    fun exitTable_ref_aux(ctx: plsqlParser.Table_ref_auxContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.join_clause].
     * @param ctx the parse tree
     */
    fun enterJoin_clause(ctx: plsqlParser.Join_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.join_clause].
     * @param ctx the parse tree
     */
    fun exitJoin_clause(ctx: plsqlParser.Join_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.join_on_part].
     * @param ctx the parse tree
     */
    fun enterJoin_on_part(ctx: plsqlParser.Join_on_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.join_on_part].
     * @param ctx the parse tree
     */
    fun exitJoin_on_part(ctx: plsqlParser.Join_on_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.join_using_part].
     * @param ctx the parse tree
     */
    fun enterJoin_using_part(ctx: plsqlParser.Join_using_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.join_using_part].
     * @param ctx the parse tree
     */
    fun exitJoin_using_part(ctx: plsqlParser.Join_using_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.join_type].
     * @param ctx the parse tree
     */
    fun enterJoin_type(ctx: plsqlParser.Join_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.join_type].
     * @param ctx the parse tree
     */
    fun exitJoin_type(ctx: plsqlParser.Join_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.query_partition_clause].
     * @param ctx the parse tree
     */
    fun enterQuery_partition_clause(ctx: plsqlParser.Query_partition_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.query_partition_clause].
     * @param ctx the parse tree
     */
    fun exitQuery_partition_clause(ctx: plsqlParser.Query_partition_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.flashback_query_clause].
     * @param ctx the parse tree
     */
    fun enterFlashback_query_clause(ctx: plsqlParser.Flashback_query_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.flashback_query_clause].
     * @param ctx the parse tree
     */
    fun exitFlashback_query_clause(ctx: plsqlParser.Flashback_query_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.pivot_clause].
     * @param ctx the parse tree
     */
    fun enterPivot_clause(ctx: plsqlParser.Pivot_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.pivot_clause].
     * @param ctx the parse tree
     */
    fun exitPivot_clause(ctx: plsqlParser.Pivot_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.pivot_element].
     * @param ctx the parse tree
     */
    fun enterPivot_element(ctx: plsqlParser.Pivot_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.pivot_element].
     * @param ctx the parse tree
     */
    fun exitPivot_element(ctx: plsqlParser.Pivot_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.pivot_for_clause].
     * @param ctx the parse tree
     */
    fun enterPivot_for_clause(ctx: plsqlParser.Pivot_for_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.pivot_for_clause].
     * @param ctx the parse tree
     */
    fun exitPivot_for_clause(ctx: plsqlParser.Pivot_for_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.pivot_in_clause].
     * @param ctx the parse tree
     */
    fun enterPivot_in_clause(ctx: plsqlParser.Pivot_in_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.pivot_in_clause].
     * @param ctx the parse tree
     */
    fun exitPivot_in_clause(ctx: plsqlParser.Pivot_in_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.pivot_in_clause_element].
     * @param ctx the parse tree
     */
    fun enterPivot_in_clause_element(ctx: plsqlParser.Pivot_in_clause_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.pivot_in_clause_element].
     * @param ctx the parse tree
     */
    fun exitPivot_in_clause_element(ctx: plsqlParser.Pivot_in_clause_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.pivot_in_clause_elements].
     * @param ctx the parse tree
     */
    fun enterPivot_in_clause_elements(ctx: plsqlParser.Pivot_in_clause_elementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.pivot_in_clause_elements].
     * @param ctx the parse tree
     */
    fun exitPivot_in_clause_elements(ctx: plsqlParser.Pivot_in_clause_elementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.unpivot_clause].
     * @param ctx the parse tree
     */
    fun enterUnpivot_clause(ctx: plsqlParser.Unpivot_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.unpivot_clause].
     * @param ctx the parse tree
     */
    fun exitUnpivot_clause(ctx: plsqlParser.Unpivot_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.unpivot_in_clause].
     * @param ctx the parse tree
     */
    fun enterUnpivot_in_clause(ctx: plsqlParser.Unpivot_in_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.unpivot_in_clause].
     * @param ctx the parse tree
     */
    fun exitUnpivot_in_clause(ctx: plsqlParser.Unpivot_in_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.unpivot_in_elements].
     * @param ctx the parse tree
     */
    fun enterUnpivot_in_elements(ctx: plsqlParser.Unpivot_in_elementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.unpivot_in_elements].
     * @param ctx the parse tree
     */
    fun exitUnpivot_in_elements(ctx: plsqlParser.Unpivot_in_elementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.hierarchical_query_clause].
     * @param ctx the parse tree
     */
    fun enterHierarchical_query_clause(ctx: plsqlParser.Hierarchical_query_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.hierarchical_query_clause].
     * @param ctx the parse tree
     */
    fun exitHierarchical_query_clause(ctx: plsqlParser.Hierarchical_query_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.start_part].
     * @param ctx the parse tree
     */
    fun enterStart_part(ctx: plsqlParser.Start_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.start_part].
     * @param ctx the parse tree
     */
    fun exitStart_part(ctx: plsqlParser.Start_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.group_by_clause].
     * @param ctx the parse tree
     */
    fun enterGroup_by_clause(ctx: plsqlParser.Group_by_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.group_by_clause].
     * @param ctx the parse tree
     */
    fun exitGroup_by_clause(ctx: plsqlParser.Group_by_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.group_by_elements].
     * @param ctx the parse tree
     */
    fun enterGroup_by_elements(ctx: plsqlParser.Group_by_elementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.group_by_elements].
     * @param ctx the parse tree
     */
    fun exitGroup_by_elements(ctx: plsqlParser.Group_by_elementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.rollup_cube_clause].
     * @param ctx the parse tree
     */
    fun enterRollup_cube_clause(ctx: plsqlParser.Rollup_cube_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.rollup_cube_clause].
     * @param ctx the parse tree
     */
    fun exitRollup_cube_clause(ctx: plsqlParser.Rollup_cube_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.grouping_sets_clause].
     * @param ctx the parse tree
     */
    fun enterGrouping_sets_clause(ctx: plsqlParser.Grouping_sets_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.grouping_sets_clause].
     * @param ctx the parse tree
     */
    fun exitGrouping_sets_clause(ctx: plsqlParser.Grouping_sets_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.grouping_sets_elements].
     * @param ctx the parse tree
     */
    fun enterGrouping_sets_elements(ctx: plsqlParser.Grouping_sets_elementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.grouping_sets_elements].
     * @param ctx the parse tree
     */
    fun exitGrouping_sets_elements(ctx: plsqlParser.Grouping_sets_elementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.having_clause].
     * @param ctx the parse tree
     */
    fun enterHaving_clause(ctx: plsqlParser.Having_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.having_clause].
     * @param ctx the parse tree
     */
    fun exitHaving_clause(ctx: plsqlParser.Having_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_clause].
     * @param ctx the parse tree
     */
    fun enterModel_clause(ctx: plsqlParser.Model_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_clause].
     * @param ctx the parse tree
     */
    fun exitModel_clause(ctx: plsqlParser.Model_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cell_reference_options].
     * @param ctx the parse tree
     */
    fun enterCell_reference_options(ctx: plsqlParser.Cell_reference_optionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cell_reference_options].
     * @param ctx the parse tree
     */
    fun exitCell_reference_options(ctx: plsqlParser.Cell_reference_optionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.return_rows_clause].
     * @param ctx the parse tree
     */
    fun enterReturn_rows_clause(ctx: plsqlParser.Return_rows_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.return_rows_clause].
     * @param ctx the parse tree
     */
    fun exitReturn_rows_clause(ctx: plsqlParser.Return_rows_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.reference_model].
     * @param ctx the parse tree
     */
    fun enterReference_model(ctx: plsqlParser.Reference_modelContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.reference_model].
     * @param ctx the parse tree
     */
    fun exitReference_model(ctx: plsqlParser.Reference_modelContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.main_model].
     * @param ctx the parse tree
     */
    fun enterMain_model(ctx: plsqlParser.Main_modelContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.main_model].
     * @param ctx the parse tree
     */
    fun exitMain_model(ctx: plsqlParser.Main_modelContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_column_clauses].
     * @param ctx the parse tree
     */
    fun enterModel_column_clauses(ctx: plsqlParser.Model_column_clausesContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_column_clauses].
     * @param ctx the parse tree
     */
    fun exitModel_column_clauses(ctx: plsqlParser.Model_column_clausesContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_column_partition_part].
     * @param ctx the parse tree
     */
    fun enterModel_column_partition_part(ctx: plsqlParser.Model_column_partition_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_column_partition_part].
     * @param ctx the parse tree
     */
    fun exitModel_column_partition_part(ctx: plsqlParser.Model_column_partition_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_column_list].
     * @param ctx the parse tree
     */
    fun enterModel_column_list(ctx: plsqlParser.Model_column_listContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_column_list].
     * @param ctx the parse tree
     */
    fun exitModel_column_list(ctx: plsqlParser.Model_column_listContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_column].
     * @param ctx the parse tree
     */
    fun enterModel_column(ctx: plsqlParser.Model_columnContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_column].
     * @param ctx the parse tree
     */
    fun exitModel_column(ctx: plsqlParser.Model_columnContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_rules_clause].
     * @param ctx the parse tree
     */
    fun enterModel_rules_clause(ctx: plsqlParser.Model_rules_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_rules_clause].
     * @param ctx the parse tree
     */
    fun exitModel_rules_clause(ctx: plsqlParser.Model_rules_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_rules_part].
     * @param ctx the parse tree
     */
    fun enterModel_rules_part(ctx: plsqlParser.Model_rules_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_rules_part].
     * @param ctx the parse tree
     */
    fun exitModel_rules_part(ctx: plsqlParser.Model_rules_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_rules_element].
     * @param ctx the parse tree
     */
    fun enterModel_rules_element(ctx: plsqlParser.Model_rules_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_rules_element].
     * @param ctx the parse tree
     */
    fun exitModel_rules_element(ctx: plsqlParser.Model_rules_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cell_assignment].
     * @param ctx the parse tree
     */
    fun enterCell_assignment(ctx: plsqlParser.Cell_assignmentContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cell_assignment].
     * @param ctx the parse tree
     */
    fun exitCell_assignment(ctx: plsqlParser.Cell_assignmentContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_iterate_clause].
     * @param ctx the parse tree
     */
    fun enterModel_iterate_clause(ctx: plsqlParser.Model_iterate_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_iterate_clause].
     * @param ctx the parse tree
     */
    fun exitModel_iterate_clause(ctx: plsqlParser.Model_iterate_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.until_part].
     * @param ctx the parse tree
     */
    fun enterUntil_part(ctx: plsqlParser.Until_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.until_part].
     * @param ctx the parse tree
     */
    fun exitUntil_part(ctx: plsqlParser.Until_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.order_by_clause].
     * @param ctx the parse tree
     */
    fun enterOrder_by_clause(ctx: plsqlParser.Order_by_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.order_by_clause].
     * @param ctx the parse tree
     */
    fun exitOrder_by_clause(ctx: plsqlParser.Order_by_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.order_by_elements].
     * @param ctx the parse tree
     */
    fun enterOrder_by_elements(ctx: plsqlParser.Order_by_elementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.order_by_elements].
     * @param ctx the parse tree
     */
    fun exitOrder_by_elements(ctx: plsqlParser.Order_by_elementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.for_update_clause].
     * @param ctx the parse tree
     */
    fun enterFor_update_clause(ctx: plsqlParser.For_update_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.for_update_clause].
     * @param ctx the parse tree
     */
    fun exitFor_update_clause(ctx: plsqlParser.For_update_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.for_update_of_part].
     * @param ctx the parse tree
     */
    fun enterFor_update_of_part(ctx: plsqlParser.For_update_of_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.for_update_of_part].
     * @param ctx the parse tree
     */
    fun exitFor_update_of_part(ctx: plsqlParser.For_update_of_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.for_update_options].
     * @param ctx the parse tree
     */
    fun enterFor_update_options(ctx: plsqlParser.For_update_optionsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.for_update_options].
     * @param ctx the parse tree
     */
    fun exitFor_update_options(ctx: plsqlParser.For_update_optionsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.limit_clause].
     * @param ctx the parse tree
     */
    fun enterLimit_clause(ctx: plsqlParser.Limit_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.limit_clause].
     * @param ctx the parse tree
     */
    fun exitLimit_clause(ctx: plsqlParser.Limit_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.update_statement].
     * @param ctx the parse tree
     */
    fun enterUpdate_statement(ctx: plsqlParser.Update_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.update_statement].
     * @param ctx the parse tree
     */
    fun exitUpdate_statement(ctx: plsqlParser.Update_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.update_set_clause].
     * @param ctx the parse tree
     */
    fun enterUpdate_set_clause(ctx: plsqlParser.Update_set_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.update_set_clause].
     * @param ctx the parse tree
     */
    fun exitUpdate_set_clause(ctx: plsqlParser.Update_set_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.column_based_update_set_clause].
     * @param ctx the parse tree
     */
    fun enterColumn_based_update_set_clause(ctx: plsqlParser.Column_based_update_set_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.column_based_update_set_clause].
     * @param ctx the parse tree
     */
    fun exitColumn_based_update_set_clause(ctx: plsqlParser.Column_based_update_set_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.delete_statement].
     * @param ctx the parse tree
     */
    fun enterDelete_statement(ctx: plsqlParser.Delete_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.delete_statement].
     * @param ctx the parse tree
     */
    fun exitDelete_statement(ctx: plsqlParser.Delete_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.insert_statement].
     * @param ctx the parse tree
     */
    fun enterInsert_statement(ctx: plsqlParser.Insert_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.insert_statement].
     * @param ctx the parse tree
     */
    fun exitInsert_statement(ctx: plsqlParser.Insert_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.single_table_insert].
     * @param ctx the parse tree
     */
    fun enterSingle_table_insert(ctx: plsqlParser.Single_table_insertContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.single_table_insert].
     * @param ctx the parse tree
     */
    fun exitSingle_table_insert(ctx: plsqlParser.Single_table_insertContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.multi_table_insert].
     * @param ctx the parse tree
     */
    fun enterMulti_table_insert(ctx: plsqlParser.Multi_table_insertContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.multi_table_insert].
     * @param ctx the parse tree
     */
    fun exitMulti_table_insert(ctx: plsqlParser.Multi_table_insertContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.multi_table_element].
     * @param ctx the parse tree
     */
    fun enterMulti_table_element(ctx: plsqlParser.Multi_table_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.multi_table_element].
     * @param ctx the parse tree
     */
    fun exitMulti_table_element(ctx: plsqlParser.Multi_table_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.conditional_insert_clause].
     * @param ctx the parse tree
     */
    fun enterConditional_insert_clause(ctx: plsqlParser.Conditional_insert_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.conditional_insert_clause].
     * @param ctx the parse tree
     */
    fun exitConditional_insert_clause(ctx: plsqlParser.Conditional_insert_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.conditional_insert_when_part].
     * @param ctx the parse tree
     */
    fun enterConditional_insert_when_part(ctx: plsqlParser.Conditional_insert_when_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.conditional_insert_when_part].
     * @param ctx the parse tree
     */
    fun exitConditional_insert_when_part(ctx: plsqlParser.Conditional_insert_when_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.conditional_insert_else_part].
     * @param ctx the parse tree
     */
    fun enterConditional_insert_else_part(ctx: plsqlParser.Conditional_insert_else_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.conditional_insert_else_part].
     * @param ctx the parse tree
     */
    fun exitConditional_insert_else_part(ctx: plsqlParser.Conditional_insert_else_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.insert_into_clause].
     * @param ctx the parse tree
     */
    fun enterInsert_into_clause(ctx: plsqlParser.Insert_into_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.insert_into_clause].
     * @param ctx the parse tree
     */
    fun exitInsert_into_clause(ctx: plsqlParser.Insert_into_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.values_clause].
     * @param ctx the parse tree
     */
    fun enterValues_clause(ctx: plsqlParser.Values_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.values_clause].
     * @param ctx the parse tree
     */
    fun exitValues_clause(ctx: plsqlParser.Values_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.merge_statement].
     * @param ctx the parse tree
     */
    fun enterMerge_statement(ctx: plsqlParser.Merge_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.merge_statement].
     * @param ctx the parse tree
     */
    fun exitMerge_statement(ctx: plsqlParser.Merge_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.merge_update_clause].
     * @param ctx the parse tree
     */
    fun enterMerge_update_clause(ctx: plsqlParser.Merge_update_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.merge_update_clause].
     * @param ctx the parse tree
     */
    fun exitMerge_update_clause(ctx: plsqlParser.Merge_update_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.merge_element].
     * @param ctx the parse tree
     */
    fun enterMerge_element(ctx: plsqlParser.Merge_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.merge_element].
     * @param ctx the parse tree
     */
    fun exitMerge_element(ctx: plsqlParser.Merge_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.merge_update_delete_part].
     * @param ctx the parse tree
     */
    fun enterMerge_update_delete_part(ctx: plsqlParser.Merge_update_delete_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.merge_update_delete_part].
     * @param ctx the parse tree
     */
    fun exitMerge_update_delete_part(ctx: plsqlParser.Merge_update_delete_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.merge_insert_clause].
     * @param ctx the parse tree
     */
    fun enterMerge_insert_clause(ctx: plsqlParser.Merge_insert_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.merge_insert_clause].
     * @param ctx the parse tree
     */
    fun exitMerge_insert_clause(ctx: plsqlParser.Merge_insert_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.selected_tableview].
     * @param ctx the parse tree
     */
    fun enterSelected_tableview(ctx: plsqlParser.Selected_tableviewContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.selected_tableview].
     * @param ctx the parse tree
     */
    fun exitSelected_tableview(ctx: plsqlParser.Selected_tableviewContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lock_table_statement].
     * @param ctx the parse tree
     */
    fun enterLock_table_statement(ctx: plsqlParser.Lock_table_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lock_table_statement].
     * @param ctx the parse tree
     */
    fun exitLock_table_statement(ctx: plsqlParser.Lock_table_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.wait_nowait_part].
     * @param ctx the parse tree
     */
    fun enterWait_nowait_part(ctx: plsqlParser.Wait_nowait_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.wait_nowait_part].
     * @param ctx the parse tree
     */
    fun exitWait_nowait_part(ctx: plsqlParser.Wait_nowait_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lock_table_element].
     * @param ctx the parse tree
     */
    fun enterLock_table_element(ctx: plsqlParser.Lock_table_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lock_table_element].
     * @param ctx the parse tree
     */
    fun exitLock_table_element(ctx: plsqlParser.Lock_table_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.lock_mode].
     * @param ctx the parse tree
     */
    fun enterLock_mode(ctx: plsqlParser.Lock_modeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.lock_mode].
     * @param ctx the parse tree
     */
    fun exitLock_mode(ctx: plsqlParser.Lock_modeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.general_table_ref].
     * @param ctx the parse tree
     */
    fun enterGeneral_table_ref(ctx: plsqlParser.General_table_refContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.general_table_ref].
     * @param ctx the parse tree
     */
    fun exitGeneral_table_ref(ctx: plsqlParser.General_table_refContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.static_returning_clause].
     * @param ctx the parse tree
     */
    fun enterStatic_returning_clause(ctx: plsqlParser.Static_returning_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.static_returning_clause].
     * @param ctx the parse tree
     */
    fun exitStatic_returning_clause(ctx: plsqlParser.Static_returning_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.error_logging_clause].
     * @param ctx the parse tree
     */
    fun enterError_logging_clause(ctx: plsqlParser.Error_logging_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.error_logging_clause].
     * @param ctx the parse tree
     */
    fun exitError_logging_clause(ctx: plsqlParser.Error_logging_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.error_logging_into_part].
     * @param ctx the parse tree
     */
    fun enterError_logging_into_part(ctx: plsqlParser.Error_logging_into_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.error_logging_into_part].
     * @param ctx the parse tree
     */
    fun exitError_logging_into_part(ctx: plsqlParser.Error_logging_into_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.error_logging_reject_part].
     * @param ctx the parse tree
     */
    fun enterError_logging_reject_part(ctx: plsqlParser.Error_logging_reject_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.error_logging_reject_part].
     * @param ctx the parse tree
     */
    fun exitError_logging_reject_part(ctx: plsqlParser.Error_logging_reject_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.dml_table_expression_clause].
     * @param ctx the parse tree
     */
    fun enterDml_table_expression_clause(ctx: plsqlParser.Dml_table_expression_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.dml_table_expression_clause].
     * @param ctx the parse tree
     */
    fun exitDml_table_expression_clause(ctx: plsqlParser.Dml_table_expression_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_collection_expression].
     * @param ctx the parse tree
     */
    fun enterTable_collection_expression(ctx: plsqlParser.Table_collection_expressionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_collection_expression].
     * @param ctx the parse tree
     */
    fun exitTable_collection_expression(ctx: plsqlParser.Table_collection_expressionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.subquery_restriction_clause].
     * @param ctx the parse tree
     */
    fun enterSubquery_restriction_clause(ctx: plsqlParser.Subquery_restriction_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.subquery_restriction_clause].
     * @param ctx the parse tree
     */
    fun exitSubquery_restriction_clause(ctx: plsqlParser.Subquery_restriction_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sample_clause].
     * @param ctx the parse tree
     */
    fun enterSample_clause(ctx: plsqlParser.Sample_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sample_clause].
     * @param ctx the parse tree
     */
    fun exitSample_clause(ctx: plsqlParser.Sample_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.seed_part].
     * @param ctx the parse tree
     */
    fun enterSeed_part(ctx: plsqlParser.Seed_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.seed_part].
     * @param ctx the parse tree
     */
    fun exitSeed_part(ctx: plsqlParser.Seed_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cursor_expression].
     * @param ctx the parse tree
     */
    fun enterCursor_expression(ctx: plsqlParser.Cursor_expressionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cursor_expression].
     * @param ctx the parse tree
     */
    fun exitCursor_expression(ctx: plsqlParser.Cursor_expressionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.expression_list].
     * @param ctx the parse tree
     */
    fun enterExpression_list(ctx: plsqlParser.Expression_listContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.expression_list].
     * @param ctx the parse tree
     */
    fun exitExpression_list(ctx: plsqlParser.Expression_listContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.condition].
     * @param ctx the parse tree
     */
    fun enterCondition(ctx: plsqlParser.ConditionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.condition].
     * @param ctx the parse tree
     */
    fun exitCondition(ctx: plsqlParser.ConditionContext?)

    /**
     * Enter a parse tree produced by the `IgnoreExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterIgnoreExpr(ctx: plsqlParser.IgnoreExprContext?)

    /**
     * Exit a parse tree produced by the `IgnoreExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitIgnoreExpr(ctx: plsqlParser.IgnoreExprContext?)

    /**
     * Enter a parse tree produced by the `AndExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterAndExpr(ctx: plsqlParser.AndExprContext?)

    /**
     * Exit a parse tree produced by the `AndExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitAndExpr(ctx: plsqlParser.AndExprContext?)

    /**
     * Enter a parse tree produced by the `LikeExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterLikeExpr(ctx: plsqlParser.LikeExprContext?)

    /**
     * Exit a parse tree produced by the `LikeExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitLikeExpr(ctx: plsqlParser.LikeExprContext?)

    /**
     * Enter a parse tree produced by the `RelExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterRelExpr(ctx: plsqlParser.RelExprContext?)

    /**
     * Exit a parse tree produced by the `RelExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitRelExpr(ctx: plsqlParser.RelExprContext?)

    /**
     * Enter a parse tree produced by the `MemberExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterMemberExpr(ctx: plsqlParser.MemberExprContext?)

    /**
     * Exit a parse tree produced by the `MemberExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitMemberExpr(ctx: plsqlParser.MemberExprContext?)

    /**
     * Enter a parse tree produced by the `BetweenExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterBetweenExpr(ctx: plsqlParser.BetweenExprContext?)

    /**
     * Exit a parse tree produced by the `BetweenExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitBetweenExpr(ctx: plsqlParser.BetweenExprContext?)

    /**
     * Enter a parse tree produced by the `CursorExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterCursorExpr(ctx: plsqlParser.CursorExprContext?)

    /**
     * Exit a parse tree produced by the `CursorExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitCursorExpr(ctx: plsqlParser.CursorExprContext?)

    /**
     * Enter a parse tree produced by the `IsExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterIsExpr(ctx: plsqlParser.IsExprContext?)

    /**
     * Exit a parse tree produced by the `IsExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitIsExpr(ctx: plsqlParser.IsExprContext?)

    /**
     * Enter a parse tree produced by the `NotExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterNotExpr(ctx: plsqlParser.NotExprContext?)

    /**
     * Exit a parse tree produced by the `NotExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitNotExpr(ctx: plsqlParser.NotExprContext?)

    /**
     * Enter a parse tree produced by the `InExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterInExpr(ctx: plsqlParser.InExprContext?)

    /**
     * Exit a parse tree produced by the `InExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitInExpr(ctx: plsqlParser.InExprContext?)

    /**
     * Enter a parse tree produced by the `ParenExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterParenExpr(ctx: plsqlParser.ParenExprContext?)

    /**
     * Exit a parse tree produced by the `ParenExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitParenExpr(ctx: plsqlParser.ParenExprContext?)

    /**
     * Enter a parse tree produced by the `OrExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun enterOrExpr(ctx: plsqlParser.OrExprContext?)

    /**
     * Exit a parse tree produced by the `OrExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     */
    fun exitOrExpr(ctx: plsqlParser.OrExprContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.is_part].
     * @param ctx the parse tree
     */
    fun enterIs_part(ctx: plsqlParser.Is_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.is_part].
     * @param ctx the parse tree
     */
    fun exitIs_part(ctx: plsqlParser.Is_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cursor_part].
     * @param ctx the parse tree
     */
    fun enterCursor_part(ctx: plsqlParser.Cursor_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cursor_part].
     * @param ctx the parse tree
     */
    fun exitCursor_part(ctx: plsqlParser.Cursor_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.multiset_type].
     * @param ctx the parse tree
     */
    fun enterMultiset_type(ctx: plsqlParser.Multiset_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.multiset_type].
     * @param ctx the parse tree
     */
    fun exitMultiset_type(ctx: plsqlParser.Multiset_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.relational_operator].
     * @param ctx the parse tree
     */
    fun enterRelational_operator(ctx: plsqlParser.Relational_operatorContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.relational_operator].
     * @param ctx the parse tree
     */
    fun exitRelational_operator(ctx: plsqlParser.Relational_operatorContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.like_type].
     * @param ctx the parse tree
     */
    fun enterLike_type(ctx: plsqlParser.Like_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.like_type].
     * @param ctx the parse tree
     */
    fun exitLike_type(ctx: plsqlParser.Like_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.like_escape_part].
     * @param ctx the parse tree
     */
    fun enterLike_escape_part(ctx: plsqlParser.Like_escape_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.like_escape_part].
     * @param ctx the parse tree
     */
    fun exitLike_escape_part(ctx: plsqlParser.Like_escape_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.between_elements].
     * @param ctx the parse tree
     */
    fun enterBetween_elements(ctx: plsqlParser.Between_elementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.between_elements].
     * @param ctx the parse tree
     */
    fun exitBetween_elements(ctx: plsqlParser.Between_elementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.concatenation].
     * @param ctx the parse tree
     */
    fun enterConcatenation(ctx: plsqlParser.ConcatenationContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.concatenation].
     * @param ctx the parse tree
     */
    fun exitConcatenation(ctx: plsqlParser.ConcatenationContext?)

    /**
     * Enter a parse tree produced by the `BinaryExpr`
     * labeled alternative in [plsqlParser.binary_expression].
     * @param ctx the parse tree
     */
    fun enterBinaryExpr(ctx: plsqlParser.BinaryExprContext?)

    /**
     * Exit a parse tree produced by the `BinaryExpr`
     * labeled alternative in [plsqlParser.binary_expression].
     * @param ctx the parse tree
     */
    fun exitBinaryExpr(ctx: plsqlParser.BinaryExprContext?)

    /**
     * Enter a parse tree produced by the `IgnoreBinaryExpr`
     * labeled alternative in [plsqlParser.binary_expression].
     * @param ctx the parse tree
     */
    fun enterIgnoreBinaryExpr(ctx: plsqlParser.IgnoreBinaryExprContext?)

    /**
     * Exit a parse tree produced by the `IgnoreBinaryExpr`
     * labeled alternative in [plsqlParser.binary_expression].
     * @param ctx the parse tree
     */
    fun exitIgnoreBinaryExpr(ctx: plsqlParser.IgnoreBinaryExprContext?)

    /**
     * Enter a parse tree produced by the `ParenBinaryExpr`
     * labeled alternative in [plsqlParser.binary_expression].
     * @param ctx the parse tree
     */
    fun enterParenBinaryExpr(ctx: plsqlParser.ParenBinaryExprContext?)

    /**
     * Exit a parse tree produced by the `ParenBinaryExpr`
     * labeled alternative in [plsqlParser.binary_expression].
     * @param ctx the parse tree
     */
    fun exitParenBinaryExpr(ctx: plsqlParser.ParenBinaryExprContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.interval_expression].
     * @param ctx the parse tree
     */
    fun enterInterval_expression(ctx: plsqlParser.Interval_expressionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.interval_expression].
     * @param ctx the parse tree
     */
    fun exitInterval_expression(ctx: plsqlParser.Interval_expressionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_expression].
     * @param ctx the parse tree
     */
    fun enterModel_expression(ctx: plsqlParser.Model_expressionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_expression].
     * @param ctx the parse tree
     */
    fun exitModel_expression(ctx: plsqlParser.Model_expressionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.model_expression_element].
     * @param ctx the parse tree
     */
    fun enterModel_expression_element(ctx: plsqlParser.Model_expression_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.model_expression_element].
     * @param ctx the parse tree
     */
    fun exitModel_expression_element(ctx: plsqlParser.Model_expression_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.single_column_for_loop].
     * @param ctx the parse tree
     */
    fun enterSingle_column_for_loop(ctx: plsqlParser.Single_column_for_loopContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.single_column_for_loop].
     * @param ctx the parse tree
     */
    fun exitSingle_column_for_loop(ctx: plsqlParser.Single_column_for_loopContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.for_like_part].
     * @param ctx the parse tree
     */
    fun enterFor_like_part(ctx: plsqlParser.For_like_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.for_like_part].
     * @param ctx the parse tree
     */
    fun exitFor_like_part(ctx: plsqlParser.For_like_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.for_increment_decrement_type].
     * @param ctx the parse tree
     */
    fun enterFor_increment_decrement_type(ctx: plsqlParser.For_increment_decrement_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.for_increment_decrement_type].
     * @param ctx the parse tree
     */
    fun exitFor_increment_decrement_type(ctx: plsqlParser.For_increment_decrement_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.multi_column_for_loop].
     * @param ctx the parse tree
     */
    fun enterMulti_column_for_loop(ctx: plsqlParser.Multi_column_for_loopContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.multi_column_for_loop].
     * @param ctx the parse tree
     */
    fun exitMulti_column_for_loop(ctx: plsqlParser.Multi_column_for_loopContext?)

    /**
     * Enter a parse tree produced by the `IgnoreUnaryExpr`
     * labeled alternative in [plsqlParser.unary_expression].
     * @param ctx the parse tree
     */
    fun enterIgnoreUnaryExpr(ctx: plsqlParser.IgnoreUnaryExprContext?)

    /**
     * Exit a parse tree produced by the `IgnoreUnaryExpr`
     * labeled alternative in [plsqlParser.unary_expression].
     * @param ctx the parse tree
     */
    fun exitIgnoreUnaryExpr(ctx: plsqlParser.IgnoreUnaryExprContext?)

    /**
     * Enter a parse tree produced by the `UnaryExpr`
     * labeled alternative in [plsqlParser.unary_expression].
     * @param ctx the parse tree
     */
    fun enterUnaryExpr(ctx: plsqlParser.UnaryExprContext?)

    /**
     * Exit a parse tree produced by the `UnaryExpr`
     * labeled alternative in [plsqlParser.unary_expression].
     * @param ctx the parse tree
     */
    fun exitUnaryExpr(ctx: plsqlParser.UnaryExprContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.case_statement].
     * @param ctx the parse tree
     */
    fun enterCase_statement(ctx: plsqlParser.Case_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.case_statement].
     * @param ctx the parse tree
     */
    fun exitCase_statement(ctx: plsqlParser.Case_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.simple_case_statement].
     * @param ctx the parse tree
     */
    fun enterSimple_case_statement(ctx: plsqlParser.Simple_case_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.simple_case_statement].
     * @param ctx the parse tree
     */
    fun exitSimple_case_statement(ctx: plsqlParser.Simple_case_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.simple_case_when_part].
     * @param ctx the parse tree
     */
    fun enterSimple_case_when_part(ctx: plsqlParser.Simple_case_when_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.simple_case_when_part].
     * @param ctx the parse tree
     */
    fun exitSimple_case_when_part(ctx: plsqlParser.Simple_case_when_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.searched_case_statement].
     * @param ctx the parse tree
     */
    fun enterSearched_case_statement(ctx: plsqlParser.Searched_case_statementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.searched_case_statement].
     * @param ctx the parse tree
     */
    fun exitSearched_case_statement(ctx: plsqlParser.Searched_case_statementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.searched_case_when_part].
     * @param ctx the parse tree
     */
    fun enterSearched_case_when_part(ctx: plsqlParser.Searched_case_when_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.searched_case_when_part].
     * @param ctx the parse tree
     */
    fun exitSearched_case_when_part(ctx: plsqlParser.Searched_case_when_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.case_else_part].
     * @param ctx the parse tree
     */
    fun enterCase_else_part(ctx: plsqlParser.Case_else_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.case_else_part].
     * @param ctx the parse tree
     */
    fun exitCase_else_part(ctx: plsqlParser.Case_else_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.atom].
     * @param ctx the parse tree
     */
    fun enterAtom(ctx: plsqlParser.AtomContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.atom].
     * @param ctx the parse tree
     */
    fun exitAtom(ctx: plsqlParser.AtomContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.expression_or_vector].
     * @param ctx the parse tree
     */
    fun enterExpression_or_vector(ctx: plsqlParser.Expression_or_vectorContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.expression_or_vector].
     * @param ctx the parse tree
     */
    fun exitExpression_or_vector(ctx: plsqlParser.Expression_or_vectorContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.vector_expr].
     * @param ctx the parse tree
     */
    fun enterVector_expr(ctx: plsqlParser.Vector_exprContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.vector_expr].
     * @param ctx the parse tree
     */
    fun exitVector_expr(ctx: plsqlParser.Vector_exprContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.quantified_expression].
     * @param ctx the parse tree
     */
    fun enterQuantified_expression(ctx: plsqlParser.Quantified_expressionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.quantified_expression].
     * @param ctx the parse tree
     */
    fun exitQuantified_expression(ctx: plsqlParser.Quantified_expressionContext?)

    /**
     * Enter a parse tree produced by the `AggregateCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun enterAggregateCall(ctx: plsqlParser.AggregateCallContext?)

    /**
     * Exit a parse tree produced by the `AggregateCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun exitAggregateCall(ctx: plsqlParser.AggregateCallContext?)

    /**
     * Enter a parse tree produced by the `TodoCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun enterTodoCall(ctx: plsqlParser.TodoCallContext?)

    /**
     * Exit a parse tree produced by the `TodoCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun exitTodoCall(ctx: plsqlParser.TodoCallContext?)

    /**
     * Enter a parse tree produced by the `XmlCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun enterXmlCall(ctx: plsqlParser.XmlCallContext?)

    /**
     * Exit a parse tree produced by the `XmlCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun exitXmlCall(ctx: plsqlParser.XmlCallContext?)

    /**
     * Enter a parse tree produced by the `CastCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun enterCastCall(ctx: plsqlParser.CastCallContext?)

    /**
     * Exit a parse tree produced by the `CastCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun exitCastCall(ctx: plsqlParser.CastCallContext?)

    /**
     * Enter a parse tree produced by the `ExtractCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun enterExtractCall(ctx: plsqlParser.ExtractCallContext?)

    /**
     * Exit a parse tree produced by the `ExtractCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun exitExtractCall(ctx: plsqlParser.ExtractCallContext?)

    /**
     * Enter a parse tree produced by the `WithinOrOverCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun enterWithinOrOverCall(ctx: plsqlParser.WithinOrOverCallContext?)

    /**
     * Exit a parse tree produced by the `WithinOrOverCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     */
    fun exitWithinOrOverCall(ctx: plsqlParser.WithinOrOverCallContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.aggregate_windowed_function].
     * @param ctx the parse tree
     */
    fun enterAggregate_windowed_function(ctx: plsqlParser.Aggregate_windowed_functionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.aggregate_windowed_function].
     * @param ctx the parse tree
     */
    fun exitAggregate_windowed_function(ctx: plsqlParser.Aggregate_windowed_functionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.over_clause_keyword].
     * @param ctx the parse tree
     */
    fun enterOver_clause_keyword(ctx: plsqlParser.Over_clause_keywordContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.over_clause_keyword].
     * @param ctx the parse tree
     */
    fun exitOver_clause_keyword(ctx: plsqlParser.Over_clause_keywordContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.within_or_over_clause_keyword].
     * @param ctx the parse tree
     */
    fun enterWithin_or_over_clause_keyword(ctx: plsqlParser.Within_or_over_clause_keywordContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.within_or_over_clause_keyword].
     * @param ctx the parse tree
     */
    fun exitWithin_or_over_clause_keyword(ctx: plsqlParser.Within_or_over_clause_keywordContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.standard_prediction_function_keyword].
     * @param ctx the parse tree
     */
    fun enterStandard_prediction_function_keyword(ctx: plsqlParser.Standard_prediction_function_keywordContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.standard_prediction_function_keyword].
     * @param ctx the parse tree
     */
    fun exitStandard_prediction_function_keyword(ctx: plsqlParser.Standard_prediction_function_keywordContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.over_clause].
     * @param ctx the parse tree
     */
    fun enterOver_clause(ctx: plsqlParser.Over_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.over_clause].
     * @param ctx the parse tree
     */
    fun exitOver_clause(ctx: plsqlParser.Over_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.windowing_clause].
     * @param ctx the parse tree
     */
    fun enterWindowing_clause(ctx: plsqlParser.Windowing_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.windowing_clause].
     * @param ctx the parse tree
     */
    fun exitWindowing_clause(ctx: plsqlParser.Windowing_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.windowing_type].
     * @param ctx the parse tree
     */
    fun enterWindowing_type(ctx: plsqlParser.Windowing_typeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.windowing_type].
     * @param ctx the parse tree
     */
    fun exitWindowing_type(ctx: plsqlParser.Windowing_typeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.windowing_elements].
     * @param ctx the parse tree
     */
    fun enterWindowing_elements(ctx: plsqlParser.Windowing_elementsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.windowing_elements].
     * @param ctx the parse tree
     */
    fun exitWindowing_elements(ctx: plsqlParser.Windowing_elementsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.using_clause].
     * @param ctx the parse tree
     */
    fun enterUsing_clause(ctx: plsqlParser.Using_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.using_clause].
     * @param ctx the parse tree
     */
    fun exitUsing_clause(ctx: plsqlParser.Using_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.using_element].
     * @param ctx the parse tree
     */
    fun enterUsing_element(ctx: plsqlParser.Using_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.using_element].
     * @param ctx the parse tree
     */
    fun exitUsing_element(ctx: plsqlParser.Using_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.collect_order_by_part].
     * @param ctx the parse tree
     */
    fun enterCollect_order_by_part(ctx: plsqlParser.Collect_order_by_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.collect_order_by_part].
     * @param ctx the parse tree
     */
    fun exitCollect_order_by_part(ctx: plsqlParser.Collect_order_by_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.within_or_over_part].
     * @param ctx the parse tree
     */
    fun enterWithin_or_over_part(ctx: plsqlParser.Within_or_over_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.within_or_over_part].
     * @param ctx the parse tree
     */
    fun exitWithin_or_over_part(ctx: plsqlParser.Within_or_over_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cost_matrix_clause].
     * @param ctx the parse tree
     */
    fun enterCost_matrix_clause(ctx: plsqlParser.Cost_matrix_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cost_matrix_clause].
     * @param ctx the parse tree
     */
    fun exitCost_matrix_clause(ctx: plsqlParser.Cost_matrix_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xml_passing_clause].
     * @param ctx the parse tree
     */
    fun enterXml_passing_clause(ctx: plsqlParser.Xml_passing_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xml_passing_clause].
     * @param ctx the parse tree
     */
    fun exitXml_passing_clause(ctx: plsqlParser.Xml_passing_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xml_attributes_clause].
     * @param ctx the parse tree
     */
    fun enterXml_attributes_clause(ctx: plsqlParser.Xml_attributes_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xml_attributes_clause].
     * @param ctx the parse tree
     */
    fun exitXml_attributes_clause(ctx: plsqlParser.Xml_attributes_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xml_namespaces_clause].
     * @param ctx the parse tree
     */
    fun enterXml_namespaces_clause(ctx: plsqlParser.Xml_namespaces_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xml_namespaces_clause].
     * @param ctx the parse tree
     */
    fun exitXml_namespaces_clause(ctx: plsqlParser.Xml_namespaces_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xml_table_column].
     * @param ctx the parse tree
     */
    fun enterXml_table_column(ctx: plsqlParser.Xml_table_columnContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xml_table_column].
     * @param ctx the parse tree
     */
    fun exitXml_table_column(ctx: plsqlParser.Xml_table_columnContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xml_general_default_part].
     * @param ctx the parse tree
     */
    fun enterXml_general_default_part(ctx: plsqlParser.Xml_general_default_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xml_general_default_part].
     * @param ctx the parse tree
     */
    fun exitXml_general_default_part(ctx: plsqlParser.Xml_general_default_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xml_multiuse_expression_element].
     * @param ctx the parse tree
     */
    fun enterXml_multiuse_expression_element(ctx: plsqlParser.Xml_multiuse_expression_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xml_multiuse_expression_element].
     * @param ctx the parse tree
     */
    fun exitXml_multiuse_expression_element(ctx: plsqlParser.Xml_multiuse_expression_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmlroot_param_version_part].
     * @param ctx the parse tree
     */
    fun enterXmlroot_param_version_part(ctx: plsqlParser.Xmlroot_param_version_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmlroot_param_version_part].
     * @param ctx the parse tree
     */
    fun exitXmlroot_param_version_part(ctx: plsqlParser.Xmlroot_param_version_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmlroot_param_standalone_part].
     * @param ctx the parse tree
     */
    fun enterXmlroot_param_standalone_part(ctx: plsqlParser.Xmlroot_param_standalone_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmlroot_param_standalone_part].
     * @param ctx the parse tree
     */
    fun exitXmlroot_param_standalone_part(ctx: plsqlParser.Xmlroot_param_standalone_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmlserialize_param_enconding_part].
     * @param ctx the parse tree
     */
    fun enterXmlserialize_param_enconding_part(ctx: plsqlParser.Xmlserialize_param_enconding_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmlserialize_param_enconding_part].
     * @param ctx the parse tree
     */
    fun exitXmlserialize_param_enconding_part(ctx: plsqlParser.Xmlserialize_param_enconding_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmlserialize_param_version_part].
     * @param ctx the parse tree
     */
    fun enterXmlserialize_param_version_part(ctx: plsqlParser.Xmlserialize_param_version_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmlserialize_param_version_part].
     * @param ctx the parse tree
     */
    fun exitXmlserialize_param_version_part(ctx: plsqlParser.Xmlserialize_param_version_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xmlserialize_param_ident_part].
     * @param ctx the parse tree
     */
    fun enterXmlserialize_param_ident_part(ctx: plsqlParser.Xmlserialize_param_ident_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xmlserialize_param_ident_part].
     * @param ctx the parse tree
     */
    fun exitXmlserialize_param_ident_part(ctx: plsqlParser.Xmlserialize_param_ident_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sql_plus_command].
     * @param ctx the parse tree
     */
    fun enterSql_plus_command(ctx: plsqlParser.Sql_plus_commandContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sql_plus_command].
     * @param ctx the parse tree
     */
    fun exitSql_plus_command(ctx: plsqlParser.Sql_plus_commandContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.whenever_command].
     * @param ctx the parse tree
     */
    fun enterWhenever_command(ctx: plsqlParser.Whenever_commandContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.whenever_command].
     * @param ctx the parse tree
     */
    fun exitWhenever_command(ctx: plsqlParser.Whenever_commandContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.set_command].
     * @param ctx the parse tree
     */
    fun enterSet_command(ctx: plsqlParser.Set_commandContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.set_command].
     * @param ctx the parse tree
     */
    fun exitSet_command(ctx: plsqlParser.Set_commandContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.exit_command].
     * @param ctx the parse tree
     */
    fun enterExit_command(ctx: plsqlParser.Exit_commandContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.exit_command].
     * @param ctx the parse tree
     */
    fun exitExit_command(ctx: plsqlParser.Exit_commandContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.prompt_command].
     * @param ctx the parse tree
     */
    fun enterPrompt_command(ctx: plsqlParser.Prompt_commandContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.prompt_command].
     * @param ctx the parse tree
     */
    fun exitPrompt_command(ctx: plsqlParser.Prompt_commandContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.show_errors_command].
     * @param ctx the parse tree
     */
    fun enterShow_errors_command(ctx: plsqlParser.Show_errors_commandContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.show_errors_command].
     * @param ctx the parse tree
     */
    fun exitShow_errors_command(ctx: plsqlParser.Show_errors_commandContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.partition_extension_clause].
     * @param ctx the parse tree
     */
    fun enterPartition_extension_clause(ctx: plsqlParser.Partition_extension_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.partition_extension_clause].
     * @param ctx the parse tree
     */
    fun exitPartition_extension_clause(ctx: plsqlParser.Partition_extension_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.column_alias].
     * @param ctx the parse tree
     */
    fun enterColumn_alias(ctx: plsqlParser.Column_aliasContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.column_alias].
     * @param ctx the parse tree
     */
    fun exitColumn_alias(ctx: plsqlParser.Column_aliasContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_alias].
     * @param ctx the parse tree
     */
    fun enterTable_alias(ctx: plsqlParser.Table_aliasContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_alias].
     * @param ctx the parse tree
     */
    fun exitTable_alias(ctx: plsqlParser.Table_aliasContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.alias_quoted_string].
     * @param ctx the parse tree
     */
    fun enterAlias_quoted_string(ctx: plsqlParser.Alias_quoted_stringContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.alias_quoted_string].
     * @param ctx the parse tree
     */
    fun exitAlias_quoted_string(ctx: plsqlParser.Alias_quoted_stringContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.where_clause].
     * @param ctx the parse tree
     */
    fun enterWhere_clause(ctx: plsqlParser.Where_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.where_clause].
     * @param ctx the parse tree
     */
    fun exitWhere_clause(ctx: plsqlParser.Where_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.current_of_clause].
     * @param ctx the parse tree
     */
    fun enterCurrent_of_clause(ctx: plsqlParser.Current_of_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.current_of_clause].
     * @param ctx the parse tree
     */
    fun exitCurrent_of_clause(ctx: plsqlParser.Current_of_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.into_clause].
     * @param ctx the parse tree
     */
    fun enterInto_clause(ctx: plsqlParser.Into_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.into_clause].
     * @param ctx the parse tree
     */
    fun exitInto_clause(ctx: plsqlParser.Into_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.xml_column_name].
     * @param ctx the parse tree
     */
    fun enterXml_column_name(ctx: plsqlParser.Xml_column_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.xml_column_name].
     * @param ctx the parse tree
     */
    fun exitXml_column_name(ctx: plsqlParser.Xml_column_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cost_class_name].
     * @param ctx the parse tree
     */
    fun enterCost_class_name(ctx: plsqlParser.Cost_class_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cost_class_name].
     * @param ctx the parse tree
     */
    fun exitCost_class_name(ctx: plsqlParser.Cost_class_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.attribute_name].
     * @param ctx the parse tree
     */
    fun enterAttribute_name(ctx: plsqlParser.Attribute_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.attribute_name].
     * @param ctx the parse tree
     */
    fun exitAttribute_name(ctx: plsqlParser.Attribute_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.savepoint_name].
     * @param ctx the parse tree
     */
    fun enterSavepoint_name(ctx: plsqlParser.Savepoint_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.savepoint_name].
     * @param ctx the parse tree
     */
    fun exitSavepoint_name(ctx: plsqlParser.Savepoint_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.rollback_segment_name].
     * @param ctx the parse tree
     */
    fun enterRollback_segment_name(ctx: plsqlParser.Rollback_segment_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.rollback_segment_name].
     * @param ctx the parse tree
     */
    fun exitRollback_segment_name(ctx: plsqlParser.Rollback_segment_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_var_name].
     * @param ctx the parse tree
     */
    fun enterTable_var_name(ctx: plsqlParser.Table_var_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_var_name].
     * @param ctx the parse tree
     */
    fun exitTable_var_name(ctx: plsqlParser.Table_var_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.schema_name].
     * @param ctx the parse tree
     */
    fun enterSchema_name(ctx: plsqlParser.Schema_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.schema_name].
     * @param ctx the parse tree
     */
    fun exitSchema_name(ctx: plsqlParser.Schema_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.routine_name].
     * @param ctx the parse tree
     */
    fun enterRoutine_name(ctx: plsqlParser.Routine_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.routine_name].
     * @param ctx the parse tree
     */
    fun exitRoutine_name(ctx: plsqlParser.Routine_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.package_name].
     * @param ctx the parse tree
     */
    fun enterPackage_name(ctx: plsqlParser.Package_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.package_name].
     * @param ctx the parse tree
     */
    fun exitPackage_name(ctx: plsqlParser.Package_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.implementation_type_name].
     * @param ctx the parse tree
     */
    fun enterImplementation_type_name(ctx: plsqlParser.Implementation_type_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.implementation_type_name].
     * @param ctx the parse tree
     */
    fun exitImplementation_type_name(ctx: plsqlParser.Implementation_type_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.parameter_name].
     * @param ctx the parse tree
     */
    fun enterParameter_name(ctx: plsqlParser.Parameter_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.parameter_name].
     * @param ctx the parse tree
     */
    fun exitParameter_name(ctx: plsqlParser.Parameter_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.reference_model_name].
     * @param ctx the parse tree
     */
    fun enterReference_model_name(ctx: plsqlParser.Reference_model_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.reference_model_name].
     * @param ctx the parse tree
     */
    fun exitReference_model_name(ctx: plsqlParser.Reference_model_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.main_model_name].
     * @param ctx the parse tree
     */
    fun enterMain_model_name(ctx: plsqlParser.Main_model_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.main_model_name].
     * @param ctx the parse tree
     */
    fun exitMain_model_name(ctx: plsqlParser.Main_model_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.aggregate_function_name].
     * @param ctx the parse tree
     */
    fun enterAggregate_function_name(ctx: plsqlParser.Aggregate_function_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.aggregate_function_name].
     * @param ctx the parse tree
     */
    fun exitAggregate_function_name(ctx: plsqlParser.Aggregate_function_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.query_name].
     * @param ctx the parse tree
     */
    fun enterQuery_name(ctx: plsqlParser.Query_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.query_name].
     * @param ctx the parse tree
     */
    fun exitQuery_name(ctx: plsqlParser.Query_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.constraint_name].
     * @param ctx the parse tree
     */
    fun enterConstraint_name(ctx: plsqlParser.Constraint_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.constraint_name].
     * @param ctx the parse tree
     */
    fun exitConstraint_name(ctx: plsqlParser.Constraint_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.label_name].
     * @param ctx the parse tree
     */
    fun enterLabel_name(ctx: plsqlParser.Label_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.label_name].
     * @param ctx the parse tree
     */
    fun exitLabel_name(ctx: plsqlParser.Label_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.type_name].
     * @param ctx the parse tree
     */
    fun enterType_name(ctx: plsqlParser.Type_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.type_name].
     * @param ctx the parse tree
     */
    fun exitType_name(ctx: plsqlParser.Type_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.sequence_name].
     * @param ctx the parse tree
     */
    fun enterSequence_name(ctx: plsqlParser.Sequence_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.sequence_name].
     * @param ctx the parse tree
     */
    fun exitSequence_name(ctx: plsqlParser.Sequence_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.exception_name].
     * @param ctx the parse tree
     */
    fun enterException_name(ctx: plsqlParser.Exception_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.exception_name].
     * @param ctx the parse tree
     */
    fun exitException_name(ctx: plsqlParser.Exception_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.function_name].
     * @param ctx the parse tree
     */
    fun enterFunction_name(ctx: plsqlParser.Function_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.function_name].
     * @param ctx the parse tree
     */
    fun exitFunction_name(ctx: plsqlParser.Function_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.procedure_name].
     * @param ctx the parse tree
     */
    fun enterProcedure_name(ctx: plsqlParser.Procedure_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.procedure_name].
     * @param ctx the parse tree
     */
    fun exitProcedure_name(ctx: plsqlParser.Procedure_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.trigger_name].
     * @param ctx the parse tree
     */
    fun enterTrigger_name(ctx: plsqlParser.Trigger_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.trigger_name].
     * @param ctx the parse tree
     */
    fun exitTrigger_name(ctx: plsqlParser.Trigger_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.variable_name].
     * @param ctx the parse tree
     */
    fun enterVariable_name(ctx: plsqlParser.Variable_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.variable_name].
     * @param ctx the parse tree
     */
    fun exitVariable_name(ctx: plsqlParser.Variable_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.index_name].
     * @param ctx the parse tree
     */
    fun enterIndex_name(ctx: plsqlParser.Index_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.index_name].
     * @param ctx the parse tree
     */
    fun exitIndex_name(ctx: plsqlParser.Index_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.cursor_name].
     * @param ctx the parse tree
     */
    fun enterCursor_name(ctx: plsqlParser.Cursor_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.cursor_name].
     * @param ctx the parse tree
     */
    fun exitCursor_name(ctx: plsqlParser.Cursor_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.record_name].
     * @param ctx the parse tree
     */
    fun enterRecord_name(ctx: plsqlParser.Record_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.record_name].
     * @param ctx the parse tree
     */
    fun exitRecord_name(ctx: plsqlParser.Record_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.collection_name].
     * @param ctx the parse tree
     */
    fun enterCollection_name(ctx: plsqlParser.Collection_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.collection_name].
     * @param ctx the parse tree
     */
    fun exitCollection_name(ctx: plsqlParser.Collection_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.link_name].
     * @param ctx the parse tree
     */
    fun enterLink_name(ctx: plsqlParser.Link_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.link_name].
     * @param ctx the parse tree
     */
    fun exitLink_name(ctx: plsqlParser.Link_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.column_name].
     * @param ctx the parse tree
     */
    fun enterColumn_name(ctx: plsqlParser.Column_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.column_name].
     * @param ctx the parse tree
     */
    fun exitColumn_name(ctx: plsqlParser.Column_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.role_name].
     * @param ctx the parse tree
     */
    fun enterRole_name(ctx: plsqlParser.Role_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.role_name].
     * @param ctx the parse tree
     */
    fun exitRole_name(ctx: plsqlParser.Role_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.tableview_name].
     * @param ctx the parse tree
     */
    fun enterTableview_name(ctx: plsqlParser.Tableview_nameContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.tableview_name].
     * @param ctx the parse tree
     */
    fun exitTableview_name(ctx: plsqlParser.Tableview_nameContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.dot_id].
     * @param ctx the parse tree
     */
    fun enterDot_id(ctx: plsqlParser.Dot_idContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.dot_id].
     * @param ctx the parse tree
     */
    fun exitDot_id(ctx: plsqlParser.Dot_idContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.star].
     * @param ctx the parse tree
     */
    fun enterStar(ctx: plsqlParser.StarContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.star].
     * @param ctx the parse tree
     */
    fun exitStar(ctx: plsqlParser.StarContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.keep_clause].
     * @param ctx the parse tree
     */
    fun enterKeep_clause(ctx: plsqlParser.Keep_clauseContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.keep_clause].
     * @param ctx the parse tree
     */
    fun exitKeep_clause(ctx: plsqlParser.Keep_clauseContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.function_argument].
     * @param ctx the parse tree
     */
    fun enterFunction_argument(ctx: plsqlParser.Function_argumentContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.function_argument].
     * @param ctx the parse tree
     */
    fun exitFunction_argument(ctx: plsqlParser.Function_argumentContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.function_argument_analytic].
     * @param ctx the parse tree
     */
    fun enterFunction_argument_analytic(ctx: plsqlParser.Function_argument_analyticContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.function_argument_analytic].
     * @param ctx the parse tree
     */
    fun exitFunction_argument_analytic(ctx: plsqlParser.Function_argument_analyticContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.function_argument_modeling].
     * @param ctx the parse tree
     */
    fun enterFunction_argument_modeling(ctx: plsqlParser.Function_argument_modelingContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.function_argument_modeling].
     * @param ctx the parse tree
     */
    fun exitFunction_argument_modeling(ctx: plsqlParser.Function_argument_modelingContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.respect_or_ignore_nulls].
     * @param ctx the parse tree
     */
    fun enterRespect_or_ignore_nulls(ctx: plsqlParser.Respect_or_ignore_nullsContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.respect_or_ignore_nulls].
     * @param ctx the parse tree
     */
    fun exitRespect_or_ignore_nulls(ctx: plsqlParser.Respect_or_ignore_nullsContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.argument].
     * @param ctx the parse tree
     */
    fun enterArgument(ctx: plsqlParser.ArgumentContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.argument].
     * @param ctx the parse tree
     */
    fun exitArgument(ctx: plsqlParser.ArgumentContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.type_spec].
     * @param ctx the parse tree
     */
    fun enterType_spec(ctx: plsqlParser.Type_specContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.type_spec].
     * @param ctx the parse tree
     */
    fun exitType_spec(ctx: plsqlParser.Type_specContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.datatype].
     * @param ctx the parse tree
     */
    fun enterDatatype(ctx: plsqlParser.DatatypeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.datatype].
     * @param ctx the parse tree
     */
    fun exitDatatype(ctx: plsqlParser.DatatypeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.precision_part].
     * @param ctx the parse tree
     */
    fun enterPrecision_part(ctx: plsqlParser.Precision_partContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.precision_part].
     * @param ctx the parse tree
     */
    fun exitPrecision_part(ctx: plsqlParser.Precision_partContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.native_datatype_element].
     * @param ctx the parse tree
     */
    fun enterNative_datatype_element(ctx: plsqlParser.Native_datatype_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.native_datatype_element].
     * @param ctx the parse tree
     */
    fun exitNative_datatype_element(ctx: plsqlParser.Native_datatype_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.bind_variable].
     * @param ctx the parse tree
     */
    fun enterBind_variable(ctx: plsqlParser.Bind_variableContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.bind_variable].
     * @param ctx the parse tree
     */
    fun exitBind_variable(ctx: plsqlParser.Bind_variableContext?)

    /**
     * Enter a parse tree produced by the `FuncCall`
     * labeled alternative in [plsqlParser.general_element].
     * @param ctx the parse tree
     */
    fun enterFuncCall(ctx: plsqlParser.FuncCallContext?)

    /**
     * Exit a parse tree produced by the `FuncCall`
     * labeled alternative in [plsqlParser.general_element].
     * @param ctx the parse tree
     */
    fun exitFuncCall(ctx: plsqlParser.FuncCallContext?)

    /**
     * Enter a parse tree produced by the `Identifier`
     * labeled alternative in [plsqlParser.general_element].
     * @param ctx the parse tree
     */
    fun enterIdentifier(ctx: plsqlParser.IdentifierContext?)

    /**
     * Exit a parse tree produced by the `Identifier`
     * labeled alternative in [plsqlParser.general_element].
     * @param ctx the parse tree
     */
    fun exitIdentifier(ctx: plsqlParser.IdentifierContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.table_element].
     * @param ctx the parse tree
     */
    fun enterTable_element(ctx: plsqlParser.Table_elementContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.table_element].
     * @param ctx the parse tree
     */
    fun exitTable_element(ctx: plsqlParser.Table_elementContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.constant].
     * @param ctx the parse tree
     */
    fun enterConstant(ctx: plsqlParser.ConstantContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.constant].
     * @param ctx the parse tree
     */
    fun exitConstant(ctx: plsqlParser.ConstantContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.numeric].
     * @param ctx the parse tree
     */
    fun enterNumeric(ctx: plsqlParser.NumericContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.numeric].
     * @param ctx the parse tree
     */
    fun exitNumeric(ctx: plsqlParser.NumericContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.numeric_negative].
     * @param ctx the parse tree
     */
    fun enterNumeric_negative(ctx: plsqlParser.Numeric_negativeContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.numeric_negative].
     * @param ctx the parse tree
     */
    fun exitNumeric_negative(ctx: plsqlParser.Numeric_negativeContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.quoted_string].
     * @param ctx the parse tree
     */
    fun enterQuoted_string(ctx: plsqlParser.Quoted_stringContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.quoted_string].
     * @param ctx the parse tree
     */
    fun exitQuoted_string(ctx: plsqlParser.Quoted_stringContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.r_id].
     * @param ctx the parse tree
     */
    fun enterR_id(ctx: plsqlParser.R_idContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.r_id].
     * @param ctx the parse tree
     */
    fun exitR_id(ctx: plsqlParser.R_idContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.id_expression].
     * @param ctx the parse tree
     */
    fun enterId_expression(ctx: plsqlParser.Id_expressionContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.id_expression].
     * @param ctx the parse tree
     */
    fun exitId_expression(ctx: plsqlParser.Id_expressionContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.not_equal_op].
     * @param ctx the parse tree
     */
    fun enterNot_equal_op(ctx: plsqlParser.Not_equal_opContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.not_equal_op].
     * @param ctx the parse tree
     */
    fun exitNot_equal_op(ctx: plsqlParser.Not_equal_opContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.greater_than_or_equals_op].
     * @param ctx the parse tree
     */
    fun enterGreater_than_or_equals_op(ctx: plsqlParser.Greater_than_or_equals_opContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.greater_than_or_equals_op].
     * @param ctx the parse tree
     */
    fun exitGreater_than_or_equals_op(ctx: plsqlParser.Greater_than_or_equals_opContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.less_than_or_equals_op].
     * @param ctx the parse tree
     */
    fun enterLess_than_or_equals_op(ctx: plsqlParser.Less_than_or_equals_opContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.less_than_or_equals_op].
     * @param ctx the parse tree
     */
    fun exitLess_than_or_equals_op(ctx: plsqlParser.Less_than_or_equals_opContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.concatenation_op].
     * @param ctx the parse tree
     */
    fun enterConcatenation_op(ctx: plsqlParser.Concatenation_opContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.concatenation_op].
     * @param ctx the parse tree
     */
    fun exitConcatenation_op(ctx: plsqlParser.Concatenation_opContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.outer_join_sign].
     * @param ctx the parse tree
     */
    fun enterOuter_join_sign(ctx: plsqlParser.Outer_join_signContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.outer_join_sign].
     * @param ctx the parse tree
     */
    fun exitOuter_join_sign(ctx: plsqlParser.Outer_join_signContext?)

    /**
     * Enter a parse tree produced by [plsqlParser.regular_id].
     * @param ctx the parse tree
     */
    fun enterRegular_id(ctx: plsqlParser.Regular_idContext?)

    /**
     * Exit a parse tree produced by [plsqlParser.regular_id].
     * @param ctx the parse tree
     */
    fun exitRegular_id(ctx: plsqlParser.Regular_idContext?)
}
