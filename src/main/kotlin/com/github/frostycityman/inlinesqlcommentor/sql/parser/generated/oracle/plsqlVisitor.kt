// Generated from oracle/plsql.g4 by ANTLR 4.13.2
package com.github.frostycityman.inlinesqlcommentor.sql.parser.generated

import org.antlr.v4.runtime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by [plsqlParser].
 *
 * @param <T> The return type of the visit operation. Use [Void] for
 * operations with no return type.
</T> */
interface plsqlVisitor<T> : ParseTreeVisitor<T?> {
    /**
     * Visit a parse tree produced by [plsqlParser.swallow_to_semi].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSwallow_to_semi(ctx: plsqlParser.Swallow_to_semiContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.compilation_unit].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCompilation_unit(ctx: plsqlParser.Compilation_unitContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sql_script].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSql_script(ctx: plsqlParser.Sql_scriptContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sql_explain].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSql_explain(ctx: plsqlParser.Sql_explainContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.unit_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUnit_statement(ctx: plsqlParser.Unit_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.unit_statement_body].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUnit_statement_body(ctx: plsqlParser.Unit_statement_bodyContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_role].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_role(ctx: plsqlParser.Create_roleContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.role_option].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRole_option(ctx: plsqlParser.Role_optionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.refresh_materialized_view].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRefresh_materialized_view(ctx: plsqlParser.Refresh_materialized_viewContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_materialized_view].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_materialized_view(ctx: plsqlParser.Create_materialized_viewContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_mv_refresh].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_mv_refresh(ctx: plsqlParser.Create_mv_refreshContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.build_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBuild_clause(ctx: plsqlParser.Build_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_permission].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_permission(ctx: plsqlParser.Alter_permissionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.permission_options].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPermission_options(ctx: plsqlParser.Permission_optionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_view].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_view(ctx: plsqlParser.Create_viewContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.view_options].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitView_options(ctx: plsqlParser.View_optionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.view_alias_constraint].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitView_alias_constraint(ctx: plsqlParser.View_alias_constraintContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_index].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_index(ctx: plsqlParser.Create_indexContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cluster_index_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCluster_index_clause(ctx: plsqlParser.Cluster_index_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cluster_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCluster_name(ctx: plsqlParser.Cluster_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.index_attributes].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndex_attributes(ctx: plsqlParser.Index_attributesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.tablespace].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTablespace(ctx: plsqlParser.TablespaceContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.key_compression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitKey_compression(ctx: plsqlParser.Key_compressionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sort_or_nosort].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSort_or_nosort(ctx: plsqlParser.Sort_or_nosortContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.visible_or_invisible].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitVisible_or_invisible(ctx: plsqlParser.Visible_or_invisibleContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.parallel_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitParallel_clause(ctx: plsqlParser.Parallel_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_index_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_index_clause(ctx: plsqlParser.Table_index_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.index_expr].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndex_expr(ctx: plsqlParser.Index_exprContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.index_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndex_properties(ctx: plsqlParser.Index_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.global_partitioned_index].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitGlobal_partitioned_index(ctx: plsqlParser.Global_partitioned_indexContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.index_partitioning_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndex_partitioning_clause(ctx: plsqlParser.Index_partitioning_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.partition_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPartition_name(ctx: plsqlParser.Partition_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.literal].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLiteral(ctx: plsqlParser.LiteralContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.string_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitString_function(ctx: plsqlParser.String_functionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.expressions].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitExpressions(ctx: plsqlParser.ExpressionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.individual_hash_partitions].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndividual_hash_partitions(ctx: plsqlParser.Individual_hash_partitionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.partitioning_storage_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPartitioning_storage_clause(ctx: plsqlParser.Partitioning_storage_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_compression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_compression(ctx: plsqlParser.Table_compressionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lob_partitioning_storage].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLob_partitioning_storage(ctx: plsqlParser.Lob_partitioning_storageContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lob_item].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLob_item(ctx: plsqlParser.Lob_itemContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lob_segname].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLob_segname(ctx: plsqlParser.Lob_segnameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.varray_item].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitVarray_item(ctx: plsqlParser.Varray_itemContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.hash_partitions_by_quantity].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitHash_partitions_by_quantity(ctx: plsqlParser.Hash_partitions_by_quantityContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.hash_partition_quantity].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitHash_partition_quantity(ctx: plsqlParser.Hash_partition_quantityContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.local_partitioned_index].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLocal_partitioned_index(ctx: plsqlParser.Local_partitioned_indexContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.on_range_partitioned_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOn_range_partitioned_table(ctx: plsqlParser.On_range_partitioned_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.on_list_partitioned_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOn_list_partitioned_table(ctx: plsqlParser.On_list_partitioned_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.on_hash_partitioned_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOn_hash_partitioned_table(ctx: plsqlParser.On_hash_partitioned_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.on_comp_partitioned_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOn_comp_partitioned_table(ctx: plsqlParser.On_comp_partitioned_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.index_subpartition_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndex_subpartition_clause(ctx: plsqlParser.Index_subpartition_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subpartition_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubpartition_name(ctx: plsqlParser.Subpartition_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.domain_index_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDomain_index_clause(ctx: plsqlParser.Domain_index_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.indextype].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndextype(ctx: plsqlParser.IndextypeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.odci_parameters].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOdci_parameters(ctx: plsqlParser.Odci_parametersContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.local_domain_index_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLocal_domain_index_clause(ctx: plsqlParser.Local_domain_index_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmlindex_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmlindex_clause(ctx: plsqlParser.Xmlindex_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.local_xmlindex_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLocal_xmlindex_clause(ctx: plsqlParser.Local_xmlindex_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.bitmap_join_index_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBitmap_join_index_clause(ctx: plsqlParser.Bitmap_join_index_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_table(ctx: plsqlParser.Create_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.relational_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRelational_table(ctx: plsqlParser.Relational_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.relational_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRelational_properties(ctx: plsqlParser.Relational_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.column_definition].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitColumn_definition(ctx: plsqlParser.Column_definitionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.inline_ref_constraint].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitInline_ref_constraint(ctx: plsqlParser.Inline_ref_constraintContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.virtual_column_definition].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitVirtual_column_definition(ctx: plsqlParser.Virtual_column_definitionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.out_of_line_constraint].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOut_of_line_constraint(ctx: plsqlParser.Out_of_line_constraintContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.foreign_key_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitForeign_key_clause(ctx: plsqlParser.Foreign_key_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.on_delete_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOn_delete_clause(ctx: plsqlParser.On_delete_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.out_of_line_ref_constraint].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOut_of_line_ref_constraint(ctx: plsqlParser.Out_of_line_ref_constraintContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.supplemental_logging_props].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSupplemental_logging_props(ctx: plsqlParser.Supplemental_logging_propsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.supplemental_log_grp_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSupplemental_log_grp_clause(ctx: plsqlParser.Supplemental_log_grp_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.log_grp].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLog_grp(ctx: plsqlParser.Log_grpContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.supplemental_id_key_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSupplemental_id_key_clause(ctx: plsqlParser.Supplemental_id_key_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.physical_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPhysical_properties(ctx: plsqlParser.Physical_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.deferred_segment_creation].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDeferred_segment_creation(ctx: plsqlParser.Deferred_segment_creationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.segment_attributes_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSegment_attributes_clause(ctx: plsqlParser.Segment_attributes_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.physical_attributes_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPhysical_attributes_clause(ctx: plsqlParser.Physical_attributes_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.storage_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitStorage_clause(ctx: plsqlParser.Storage_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.size_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSize_clause(ctx: plsqlParser.Size_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.logging_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLogging_clause(ctx: plsqlParser.Logging_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.column_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitColumn_properties(ctx: plsqlParser.Column_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.object_type_col_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitObject_type_col_properties(ctx: plsqlParser.Object_type_col_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.substitutable_column_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubstitutable_column_clause(ctx: plsqlParser.Substitutable_column_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.nested_table_col_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNested_table_col_properties(ctx: plsqlParser.Nested_table_col_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.nested_item].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNested_item(ctx: plsqlParser.Nested_itemContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.object_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitObject_properties(ctx: plsqlParser.Object_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.inline_constraint].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitInline_constraint(ctx: plsqlParser.Inline_constraintContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.references_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReferences_clause(ctx: plsqlParser.References_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.paren_column_list].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitParen_column_list(ctx: plsqlParser.Paren_column_listContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.column_list].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitColumn_list(ctx: plsqlParser.Column_listContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.check_constraint].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCheck_constraint(ctx: plsqlParser.Check_constraintContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.constraint_state].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConstraint_state(ctx: plsqlParser.Constraint_stateContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.using_index_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUsing_index_clause(ctx: plsqlParser.Using_index_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.varray_col_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitVarray_col_properties(ctx: plsqlParser.Varray_col_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.varray_storage_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitVarray_storage_clause(ctx: plsqlParser.Varray_storage_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lob_storage_parameters].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLob_storage_parameters(ctx: plsqlParser.Lob_storage_parametersContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lob_parameters].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLob_parameters(ctx: plsqlParser.Lob_parametersContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lob_retention_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLob_retention_clause(ctx: plsqlParser.Lob_retention_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lob_deduplicate_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLob_deduplicate_clause(ctx: plsqlParser.Lob_deduplicate_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lob_compression_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLob_compression_clause(ctx: plsqlParser.Lob_compression_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.encryption_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitEncryption_spec(ctx: plsqlParser.Encryption_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lob_storage_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLob_storage_clause(ctx: plsqlParser.Lob_storage_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmltype_column_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmltype_column_properties(ctx: plsqlParser.Xmltype_column_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmltype_storage].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmltype_storage(ctx: plsqlParser.Xmltype_storageContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmlschema_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmlschema_spec(ctx: plsqlParser.Xmlschema_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.allow_or_disallow].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAllow_or_disallow(ctx: plsqlParser.Allow_or_disallowContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_partitioning_clauses].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_partitioning_clauses(ctx: plsqlParser.Table_partitioning_clausesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.range_partitions].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRange_partitions(ctx: plsqlParser.Range_partitionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.range_values_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRange_values_clause(ctx: plsqlParser.Range_values_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_partition_description].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_partition_description(ctx: plsqlParser.Table_partition_descriptionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.list_partitions].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitList_partitions(ctx: plsqlParser.List_partitionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.list_values_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitList_values_clause(ctx: plsqlParser.List_values_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.hash_partitions].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitHash_partitions(ctx: plsqlParser.Hash_partitionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.composite_range_partitions].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitComposite_range_partitions(ctx: plsqlParser.Composite_range_partitionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subpartition_by_range].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubpartition_by_range(ctx: plsqlParser.Subpartition_by_rangeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subpartition_by_list].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubpartition_by_list(ctx: plsqlParser.Subpartition_by_listContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subpartition_template].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubpartition_template(ctx: plsqlParser.Subpartition_templateContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.range_subpartition_desc].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRange_subpartition_desc(ctx: plsqlParser.Range_subpartition_descContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.list_subpartition_desc].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitList_subpartition_desc(ctx: plsqlParser.List_subpartition_descContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.individual_hash_subparts].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndividual_hash_subparts(ctx: plsqlParser.Individual_hash_subpartsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.hash_subpartition_quantity].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitHash_subpartition_quantity(ctx: plsqlParser.Hash_subpartition_quantityContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subpartition_by_hash].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubpartition_by_hash(ctx: plsqlParser.Subpartition_by_hashContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.range_partition_desc].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRange_partition_desc(ctx: plsqlParser.Range_partition_descContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.hash_subparts_by_quantity].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitHash_subparts_by_quantity(ctx: plsqlParser.Hash_subparts_by_quantityContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.composite_list_partitions].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitComposite_list_partitions(ctx: plsqlParser.Composite_list_partitionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.list_partition_desc].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitList_partition_desc(ctx: plsqlParser.List_partition_descContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.composite_hash_partitions].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitComposite_hash_partitions(ctx: plsqlParser.Composite_hash_partitionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.reference_partitioning].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReference_partitioning(ctx: plsqlParser.Reference_partitioningContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.reference_partition_desc].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReference_partition_desc(ctx: plsqlParser.Reference_partition_descContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.system_partitioning].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSystem_partitioning(ctx: plsqlParser.System_partitioningContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.enable_disable_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitEnable_disable_clause(ctx: plsqlParser.Enable_disable_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.exceptions_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitExceptions_clause(ctx: plsqlParser.Exceptions_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.row_movement_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRow_movement_clause(ctx: plsqlParser.Row_movement_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.flashback_archive_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFlashback_archive_clause(ctx: plsqlParser.Flashback_archive_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.object_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitObject_table(ctx: plsqlParser.Object_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.object_table_substitution].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitObject_table_substitution(ctx: plsqlParser.Object_table_substitutionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.oid_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOid_clause(ctx: plsqlParser.Oid_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.oid_index_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOid_index_clause(ctx: plsqlParser.Oid_index_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmltype_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmltype_table(ctx: plsqlParser.Xmltype_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmltype_virtual_columns].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmltype_virtual_columns(ctx: plsqlParser.Xmltype_virtual_columnsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_table(ctx: plsqlParser.Drop_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_table].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_table(ctx: plsqlParser.Alter_tableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_table_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_table_properties(ctx: plsqlParser.Alter_table_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_table_properties_1].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_table_properties_1(ctx: plsqlParser.Alter_table_properties_1Context?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.supplemental_table_logging].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSupplemental_table_logging(ctx: plsqlParser.Supplemental_table_loggingContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.allocate_extent_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAllocate_extent_clause(ctx: plsqlParser.Allocate_extent_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.deallocate_unused_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDeallocate_unused_clause(ctx: plsqlParser.Deallocate_unused_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.upgrade_table_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUpgrade_table_clause(ctx: plsqlParser.Upgrade_table_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.records_per_block_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRecords_per_block_clause(ctx: plsqlParser.Records_per_block_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_iot_clauses].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_iot_clauses(ctx: plsqlParser.Alter_iot_clausesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.index_org_table_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndex_org_table_clause(ctx: plsqlParser.Index_org_table_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.mapping_table_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMapping_table_clause(ctx: plsqlParser.Mapping_table_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.index_org_overflow_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndex_org_overflow_clause(ctx: plsqlParser.Index_org_overflow_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_overflow_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_overflow_clause(ctx: plsqlParser.Alter_overflow_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.add_overflow_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAdd_overflow_clause(ctx: plsqlParser.Add_overflow_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.shrink_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitShrink_clause(ctx: plsqlParser.Shrink_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_mapping_table_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_mapping_table_clause(ctx: plsqlParser.Alter_mapping_table_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.constraint_clauses].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConstraint_clauses(ctx: plsqlParser.Constraint_clausesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.old_constraint_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOld_constraint_name(ctx: plsqlParser.Old_constraint_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.new_constraint_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNew_constraint_name(ctx: plsqlParser.New_constraint_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_constraint_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_constraint_clause(ctx: plsqlParser.Drop_constraint_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_primary_key_or_unique_or_generic_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_primary_key_or_unique_or_generic_clause(ctx: plsqlParser.Drop_primary_key_or_unique_or_generic_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.column_clauses].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitColumn_clauses(ctx: plsqlParser.Column_clausesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.add_modify_drop_column_clauses].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAdd_modify_drop_column_clauses(ctx: plsqlParser.Add_modify_drop_column_clausesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.add_column_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAdd_column_clause(ctx: plsqlParser.Add_column_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.modify_column_clauses].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModify_column_clauses(ctx: plsqlParser.Modify_column_clausesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_column_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_column_clause(ctx: plsqlParser.Alter_column_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.modify_col_properties].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModify_col_properties(ctx: plsqlParser.Modify_col_propertiesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.modify_col_substitutable].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModify_col_substitutable(ctx: plsqlParser.Modify_col_substitutableContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_column_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_column_clause(ctx: plsqlParser.Drop_column_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.rename_column_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRename_column_clause(ctx: plsqlParser.Rename_column_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.old_column_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOld_column_name(ctx: plsqlParser.Old_column_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.new_column_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNew_column_name(ctx: plsqlParser.New_column_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.modify_collection_retrieval].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModify_collection_retrieval(ctx: plsqlParser.Modify_collection_retrievalContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.collection_item].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCollection_item(ctx: plsqlParser.Collection_itemContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.modify_lob_storage_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModify_lob_storage_clause(ctx: plsqlParser.Modify_lob_storage_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.modify_lob_parameters].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModify_lob_parameters(ctx: plsqlParser.Modify_lob_parametersContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_function(ctx: plsqlParser.Drop_functionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_function(ctx: plsqlParser.Alter_functionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_function_body].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_function_body(ctx: plsqlParser.Create_function_bodyContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.parallel_enable_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitParallel_enable_clause(ctx: plsqlParser.Parallel_enable_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.partition_by_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPartition_by_clause(ctx: plsqlParser.Partition_by_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.result_cache_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitResult_cache_clause(ctx: plsqlParser.Result_cache_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.relies_on_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRelies_on_part(ctx: plsqlParser.Relies_on_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.streaming_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitStreaming_clause(ctx: plsqlParser.Streaming_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_package].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_package(ctx: plsqlParser.Drop_packageContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_package].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_package(ctx: plsqlParser.Alter_packageContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_package].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_package(ctx: plsqlParser.Create_packageContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.package_body].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPackage_body(ctx: plsqlParser.Package_bodyContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.package_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPackage_spec(ctx: plsqlParser.Package_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.package_obj_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPackage_obj_spec(ctx: plsqlParser.Package_obj_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.procedure_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitProcedure_spec(ctx: plsqlParser.Procedure_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.function_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFunction_spec(ctx: plsqlParser.Function_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.package_obj_body].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPackage_obj_body(ctx: plsqlParser.Package_obj_bodyContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_procedure].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_procedure(ctx: plsqlParser.Drop_procedureContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_procedure].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_procedure(ctx: plsqlParser.Alter_procedureContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_procedure_body].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_procedure_body(ctx: plsqlParser.Create_procedure_bodyContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_trigger].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_trigger(ctx: plsqlParser.Drop_triggerContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_trigger].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_trigger(ctx: plsqlParser.Alter_triggerContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_trigger].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_trigger(ctx: plsqlParser.Create_triggerContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.trigger_follows_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTrigger_follows_clause(ctx: plsqlParser.Trigger_follows_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.trigger_when_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTrigger_when_clause(ctx: plsqlParser.Trigger_when_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.simple_dml_trigger].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSimple_dml_trigger(ctx: plsqlParser.Simple_dml_triggerContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.for_each_row].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFor_each_row(ctx: plsqlParser.For_each_rowContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.compound_dml_trigger].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCompound_dml_trigger(ctx: plsqlParser.Compound_dml_triggerContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.non_dml_trigger].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNon_dml_trigger(ctx: plsqlParser.Non_dml_triggerContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.trigger_body].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTrigger_body(ctx: plsqlParser.Trigger_bodyContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.routine_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRoutine_clause(ctx: plsqlParser.Routine_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.compound_trigger_block].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCompound_trigger_block(ctx: plsqlParser.Compound_trigger_blockContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.timing_point_section].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTiming_point_section(ctx: plsqlParser.Timing_point_sectionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.non_dml_event].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNon_dml_event(ctx: plsqlParser.Non_dml_eventContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.dml_event_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDml_event_clause(ctx: plsqlParser.Dml_event_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.dml_event_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDml_event_element(ctx: plsqlParser.Dml_event_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.dml_event_nested_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDml_event_nested_clause(ctx: plsqlParser.Dml_event_nested_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.referencing_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReferencing_clause(ctx: plsqlParser.Referencing_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.referencing_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReferencing_element(ctx: plsqlParser.Referencing_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_type(ctx: plsqlParser.Drop_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_type(ctx: plsqlParser.Alter_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.compile_type_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCompile_type_clause(ctx: plsqlParser.Compile_type_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.replace_type_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReplace_type_clause(ctx: plsqlParser.Replace_type_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_method_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_method_spec(ctx: plsqlParser.Alter_method_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_method_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_method_element(ctx: plsqlParser.Alter_method_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_attribute_definition].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_attribute_definition(ctx: plsqlParser.Alter_attribute_definitionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.attribute_definition].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAttribute_definition(ctx: plsqlParser.Attribute_definitionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_collection_clauses].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_collection_clauses(ctx: plsqlParser.Alter_collection_clausesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.dependent_handling_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDependent_handling_clause(ctx: plsqlParser.Dependent_handling_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.dependent_exceptions_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDependent_exceptions_part(ctx: plsqlParser.Dependent_exceptions_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_type(ctx: plsqlParser.Create_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.type_definition].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitType_definition(ctx: plsqlParser.Type_definitionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.object_type_def].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitObject_type_def(ctx: plsqlParser.Object_type_defContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.object_as_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitObject_as_part(ctx: plsqlParser.Object_as_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.object_under_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitObject_under_part(ctx: plsqlParser.Object_under_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.nested_table_type_def].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNested_table_type_def(ctx: plsqlParser.Nested_table_type_defContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sqlj_object_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSqlj_object_type(ctx: plsqlParser.Sqlj_object_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.type_body].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitType_body(ctx: plsqlParser.Type_bodyContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.type_body_elements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitType_body_elements(ctx: plsqlParser.Type_body_elementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.map_order_func_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMap_order_func_declaration(ctx: plsqlParser.Map_order_func_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subprog_decl_in_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubprog_decl_in_type(ctx: plsqlParser.Subprog_decl_in_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.proc_decl_in_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitProc_decl_in_type(ctx: plsqlParser.Proc_decl_in_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.func_decl_in_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFunc_decl_in_type(ctx: plsqlParser.Func_decl_in_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.constructor_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConstructor_declaration(ctx: plsqlParser.Constructor_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.modifier_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModifier_clause(ctx: plsqlParser.Modifier_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.object_member_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitObject_member_spec(ctx: plsqlParser.Object_member_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sqlj_object_type_attr].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSqlj_object_type_attr(ctx: plsqlParser.Sqlj_object_type_attrContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.element_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitElement_spec(ctx: plsqlParser.Element_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.element_spec_options].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitElement_spec_options(ctx: plsqlParser.Element_spec_optionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subprogram_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubprogram_spec(ctx: plsqlParser.Subprogram_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.type_procedure_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitType_procedure_spec(ctx: plsqlParser.Type_procedure_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.type_function_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitType_function_spec(ctx: plsqlParser.Type_function_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.constructor_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConstructor_spec(ctx: plsqlParser.Constructor_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.map_order_function_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMap_order_function_spec(ctx: plsqlParser.Map_order_function_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.pragma_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPragma_clause(ctx: plsqlParser.Pragma_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.pragma_elements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPragma_elements(ctx: plsqlParser.Pragma_elementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.type_elements_parameter].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitType_elements_parameter(ctx: plsqlParser.Type_elements_parameterContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.drop_sequence].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDrop_sequence(ctx: plsqlParser.Drop_sequenceContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alter_sequence].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlter_sequence(ctx: plsqlParser.Alter_sequenceContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.create_sequence].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCreate_sequence(ctx: plsqlParser.Create_sequenceContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sequence_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSequence_spec(ctx: plsqlParser.Sequence_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sequence_start_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSequence_start_clause(ctx: plsqlParser.Sequence_start_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.invoker_rights_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitInvoker_rights_clause(ctx: plsqlParser.Invoker_rights_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.compiler_parameters_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCompiler_parameters_clause(ctx: plsqlParser.Compiler_parameters_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.call_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCall_spec(ctx: plsqlParser.Call_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.java_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitJava_spec(ctx: plsqlParser.Java_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.c_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitC_spec(ctx: plsqlParser.C_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.c_agent_in_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitC_agent_in_clause(ctx: plsqlParser.C_agent_in_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.c_parameters_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitC_parameters_clause(ctx: plsqlParser.C_parameters_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.parameter].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitParameter(ctx: plsqlParser.ParameterContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.default_value_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDefault_value_part(ctx: plsqlParser.Default_value_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.declare_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDeclare_spec(ctx: plsqlParser.Declare_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.variable_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitVariable_declaration(ctx: plsqlParser.Variable_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subtype_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubtype_declaration(ctx: plsqlParser.Subtype_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cursor_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCursor_declaration(ctx: plsqlParser.Cursor_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.parameter_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitParameter_spec(ctx: plsqlParser.Parameter_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.exception_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitException_declaration(ctx: plsqlParser.Exception_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.pragma_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPragma_declaration(ctx: plsqlParser.Pragma_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.record_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRecord_declaration(ctx: plsqlParser.Record_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.record_type_dec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRecord_type_dec(ctx: plsqlParser.Record_type_decContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.field_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitField_spec(ctx: plsqlParser.Field_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.record_var_dec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRecord_var_dec(ctx: plsqlParser.Record_var_decContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_declaration(ctx: plsqlParser.Table_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_type_dec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_type_dec(ctx: plsqlParser.Table_type_decContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_indexed_by_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_indexed_by_part(ctx: plsqlParser.Table_indexed_by_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.varray_type_def].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitVarray_type_def(ctx: plsqlParser.Varray_type_defContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_var_dec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_var_dec(ctx: plsqlParser.Table_var_decContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.seq_of_statements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSeq_of_statements(ctx: plsqlParser.Seq_of_statementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.label_declaration].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLabel_declaration(ctx: plsqlParser.Label_declarationContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitStatement(ctx: plsqlParser.StatementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.assignment_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAssignment_statement(ctx: plsqlParser.Assignment_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.continue_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitContinue_statement(ctx: plsqlParser.Continue_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.exit_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitExit_statement(ctx: plsqlParser.Exit_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.goto_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitGoto_statement(ctx: plsqlParser.Goto_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.if_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIf_statement(ctx: plsqlParser.If_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.elsif_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitElsif_part(ctx: plsqlParser.Elsif_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.else_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitElse_part(ctx: plsqlParser.Else_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.loop_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLoop_statement(ctx: plsqlParser.Loop_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cursor_loop_param].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCursor_loop_param(ctx: plsqlParser.Cursor_loop_paramContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.forall_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitForall_statement(ctx: plsqlParser.Forall_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.bounds_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBounds_clause(ctx: plsqlParser.Bounds_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.between_bound].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBetween_bound(ctx: plsqlParser.Between_boundContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lower_bound].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLower_bound(ctx: plsqlParser.Lower_boundContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.upper_bound].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUpper_bound(ctx: plsqlParser.Upper_boundContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.null_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNull_statement(ctx: plsqlParser.Null_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.raise_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRaise_statement(ctx: plsqlParser.Raise_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.return_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReturn_statement(ctx: plsqlParser.Return_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.function_call].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFunction_call(ctx: plsqlParser.Function_callContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.body].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBody(ctx: plsqlParser.BodyContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.exception_handler].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitException_handler(ctx: plsqlParser.Exception_handlerContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.trigger_block].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTrigger_block(ctx: plsqlParser.Trigger_blockContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.block].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBlock(ctx: plsqlParser.BlockContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sql_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSql_statement(ctx: plsqlParser.Sql_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.execute_immediate].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitExecute_immediate(ctx: plsqlParser.Execute_immediateContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.dynamic_returning_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDynamic_returning_clause(ctx: plsqlParser.Dynamic_returning_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.data_manipulation_language_statements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitData_manipulation_language_statements(ctx: plsqlParser.Data_manipulation_language_statementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cursor_manipulation_statements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCursor_manipulation_statements(ctx: plsqlParser.Cursor_manipulation_statementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.close_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitClose_statement(ctx: plsqlParser.Close_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.open_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOpen_statement(ctx: plsqlParser.Open_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.fetch_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFetch_statement(ctx: plsqlParser.Fetch_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.open_for_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOpen_for_statement(ctx: plsqlParser.Open_for_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.transaction_control_statements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTransaction_control_statements(ctx: plsqlParser.Transaction_control_statementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.set_transaction_command].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSet_transaction_command(ctx: plsqlParser.Set_transaction_commandContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.set_constraint_command].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSet_constraint_command(ctx: plsqlParser.Set_constraint_commandContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.commit_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCommit_statement(ctx: plsqlParser.Commit_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.write_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWrite_clause(ctx: plsqlParser.Write_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.rollback_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRollback_statement(ctx: plsqlParser.Rollback_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.savepoint_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSavepoint_statement(ctx: plsqlParser.Savepoint_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.explain_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitExplain_statement(ctx: plsqlParser.Explain_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.select_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSelect_statement(ctx: plsqlParser.Select_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subquery_factoring_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubquery_factoring_clause(ctx: plsqlParser.Subquery_factoring_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.factoring_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFactoring_element(ctx: plsqlParser.Factoring_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.search_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSearch_clause(ctx: plsqlParser.Search_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cycle_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCycle_clause(ctx: plsqlParser.Cycle_clauseContext?): T?

    /**
     * Visit a parse tree produced by the `SubqueryParen`
     * labeled alternative in [plsqlParser.subquery].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubqueryParen(ctx: plsqlParser.SubqueryParenContext?): T?

    /**
     * Visit a parse tree produced by the `IgnoreSubquery`
     * labeled alternative in [plsqlParser.subquery].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIgnoreSubquery(ctx: plsqlParser.IgnoreSubqueryContext?): T?

    /**
     * Visit a parse tree produced by the `SubqueryCompound`
     * labeled alternative in [plsqlParser.subquery].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubqueryCompound(ctx: plsqlParser.SubqueryCompoundContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subquery_operation_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubquery_operation_part(ctx: plsqlParser.Subquery_operation_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.query_block].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitQuery_block(ctx: plsqlParser.Query_blockContext?): T?

    /**
     * Visit a parse tree produced by the `Star1`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitStar1(ctx: plsqlParser.Star1Context?): T?

    /**
     * Visit a parse tree produced by the `StarTable`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitStarTable(ctx: plsqlParser.StarTableContext?): T?

    /**
     * Visit a parse tree produced by the `IgnoreTableview_name`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIgnoreTableview_name(ctx: plsqlParser.IgnoreTableview_nameContext?): T?

    /**
     * Visit a parse tree produced by the `Alias_expr`
     * labeled alternative in [plsqlParser.selected_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlias_expr(ctx: plsqlParser.Alias_exprContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.from_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFrom_clause(ctx: plsqlParser.From_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_ref_pivot].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_ref_pivot(ctx: plsqlParser.Table_ref_pivotContext?): T?

    /**
     * Visit a parse tree produced by the `JoinExpr`
     * labeled alternative in [plsqlParser.table_ref].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitJoinExpr(ctx: plsqlParser.JoinExprContext?): T?

    /**
     * Visit a parse tree produced by the `TableRefSimple`
     * labeled alternative in [plsqlParser.table_ref].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTableRefSimple(ctx: plsqlParser.TableRefSimpleContext?): T?

    /**
     * Visit a parse tree produced by the `TableRefAux`
     * labeled alternative in [plsqlParser.table_ref].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTableRefAux(ctx: plsqlParser.TableRefAuxContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_ref_aux].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_ref_aux(ctx: plsqlParser.Table_ref_auxContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.join_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitJoin_clause(ctx: plsqlParser.Join_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.join_on_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitJoin_on_part(ctx: plsqlParser.Join_on_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.join_using_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitJoin_using_part(ctx: plsqlParser.Join_using_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.join_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitJoin_type(ctx: plsqlParser.Join_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.query_partition_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitQuery_partition_clause(ctx: plsqlParser.Query_partition_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.flashback_query_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFlashback_query_clause(ctx: plsqlParser.Flashback_query_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.pivot_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPivot_clause(ctx: plsqlParser.Pivot_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.pivot_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPivot_element(ctx: plsqlParser.Pivot_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.pivot_for_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPivot_for_clause(ctx: plsqlParser.Pivot_for_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.pivot_in_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPivot_in_clause(ctx: plsqlParser.Pivot_in_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.pivot_in_clause_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPivot_in_clause_element(ctx: plsqlParser.Pivot_in_clause_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.pivot_in_clause_elements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPivot_in_clause_elements(ctx: plsqlParser.Pivot_in_clause_elementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.unpivot_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUnpivot_clause(ctx: plsqlParser.Unpivot_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.unpivot_in_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUnpivot_in_clause(ctx: plsqlParser.Unpivot_in_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.unpivot_in_elements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUnpivot_in_elements(ctx: plsqlParser.Unpivot_in_elementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.hierarchical_query_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitHierarchical_query_clause(ctx: plsqlParser.Hierarchical_query_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.start_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitStart_part(ctx: plsqlParser.Start_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.group_by_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitGroup_by_clause(ctx: plsqlParser.Group_by_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.group_by_elements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitGroup_by_elements(ctx: plsqlParser.Group_by_elementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.rollup_cube_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRollup_cube_clause(ctx: plsqlParser.Rollup_cube_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.grouping_sets_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitGrouping_sets_clause(ctx: plsqlParser.Grouping_sets_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.grouping_sets_elements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitGrouping_sets_elements(ctx: plsqlParser.Grouping_sets_elementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.having_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitHaving_clause(ctx: plsqlParser.Having_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_clause(ctx: plsqlParser.Model_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cell_reference_options].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCell_reference_options(ctx: plsqlParser.Cell_reference_optionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.return_rows_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReturn_rows_clause(ctx: plsqlParser.Return_rows_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.reference_model].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReference_model(ctx: plsqlParser.Reference_modelContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.main_model].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMain_model(ctx: plsqlParser.Main_modelContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_column_clauses].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_column_clauses(ctx: plsqlParser.Model_column_clausesContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_column_partition_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_column_partition_part(ctx: plsqlParser.Model_column_partition_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_column_list].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_column_list(ctx: plsqlParser.Model_column_listContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_column].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_column(ctx: plsqlParser.Model_columnContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_rules_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_rules_clause(ctx: plsqlParser.Model_rules_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_rules_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_rules_part(ctx: plsqlParser.Model_rules_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_rules_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_rules_element(ctx: plsqlParser.Model_rules_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cell_assignment].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCell_assignment(ctx: plsqlParser.Cell_assignmentContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_iterate_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_iterate_clause(ctx: plsqlParser.Model_iterate_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.until_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUntil_part(ctx: plsqlParser.Until_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.order_by_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOrder_by_clause(ctx: plsqlParser.Order_by_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.order_by_elements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOrder_by_elements(ctx: plsqlParser.Order_by_elementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.for_update_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFor_update_clause(ctx: plsqlParser.For_update_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.for_update_of_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFor_update_of_part(ctx: plsqlParser.For_update_of_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.for_update_options].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFor_update_options(ctx: plsqlParser.For_update_optionsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.limit_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLimit_clause(ctx: plsqlParser.Limit_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.update_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUpdate_statement(ctx: plsqlParser.Update_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.update_set_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUpdate_set_clause(ctx: plsqlParser.Update_set_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.column_based_update_set_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitColumn_based_update_set_clause(ctx: plsqlParser.Column_based_update_set_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.delete_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDelete_statement(ctx: plsqlParser.Delete_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.insert_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitInsert_statement(ctx: plsqlParser.Insert_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.single_table_insert].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSingle_table_insert(ctx: plsqlParser.Single_table_insertContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.multi_table_insert].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMulti_table_insert(ctx: plsqlParser.Multi_table_insertContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.multi_table_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMulti_table_element(ctx: plsqlParser.Multi_table_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.conditional_insert_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConditional_insert_clause(ctx: plsqlParser.Conditional_insert_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.conditional_insert_when_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConditional_insert_when_part(ctx: plsqlParser.Conditional_insert_when_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.conditional_insert_else_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConditional_insert_else_part(ctx: plsqlParser.Conditional_insert_else_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.insert_into_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitInsert_into_clause(ctx: plsqlParser.Insert_into_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.values_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitValues_clause(ctx: plsqlParser.Values_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.merge_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMerge_statement(ctx: plsqlParser.Merge_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.merge_update_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMerge_update_clause(ctx: plsqlParser.Merge_update_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.merge_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMerge_element(ctx: plsqlParser.Merge_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.merge_update_delete_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMerge_update_delete_part(ctx: plsqlParser.Merge_update_delete_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.merge_insert_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMerge_insert_clause(ctx: plsqlParser.Merge_insert_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.selected_tableview].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSelected_tableview(ctx: plsqlParser.Selected_tableviewContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lock_table_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLock_table_statement(ctx: plsqlParser.Lock_table_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.wait_nowait_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWait_nowait_part(ctx: plsqlParser.Wait_nowait_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lock_table_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLock_table_element(ctx: plsqlParser.Lock_table_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.lock_mode].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLock_mode(ctx: plsqlParser.Lock_modeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.general_table_ref].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitGeneral_table_ref(ctx: plsqlParser.General_table_refContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.static_returning_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitStatic_returning_clause(ctx: plsqlParser.Static_returning_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.error_logging_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitError_logging_clause(ctx: plsqlParser.Error_logging_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.error_logging_into_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitError_logging_into_part(ctx: plsqlParser.Error_logging_into_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.error_logging_reject_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitError_logging_reject_part(ctx: plsqlParser.Error_logging_reject_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.dml_table_expression_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDml_table_expression_clause(ctx: plsqlParser.Dml_table_expression_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_collection_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_collection_expression(ctx: plsqlParser.Table_collection_expressionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.subquery_restriction_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSubquery_restriction_clause(ctx: plsqlParser.Subquery_restriction_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sample_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSample_clause(ctx: plsqlParser.Sample_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.seed_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSeed_part(ctx: plsqlParser.Seed_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cursor_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCursor_expression(ctx: plsqlParser.Cursor_expressionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.expression_list].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitExpression_list(ctx: plsqlParser.Expression_listContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.condition].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCondition(ctx: plsqlParser.ConditionContext?): T?

    /**
     * Visit a parse tree produced by the `IgnoreExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIgnoreExpr(ctx: plsqlParser.IgnoreExprContext?): T?

    /**
     * Visit a parse tree produced by the `AndExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAndExpr(ctx: plsqlParser.AndExprContext?): T?

    /**
     * Visit a parse tree produced by the `LikeExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLikeExpr(ctx: plsqlParser.LikeExprContext?): T?

    /**
     * Visit a parse tree produced by the `RelExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRelExpr(ctx: plsqlParser.RelExprContext?): T?

    /**
     * Visit a parse tree produced by the `MemberExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMemberExpr(ctx: plsqlParser.MemberExprContext?): T?

    /**
     * Visit a parse tree produced by the `BetweenExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBetweenExpr(ctx: plsqlParser.BetweenExprContext?): T?

    /**
     * Visit a parse tree produced by the `CursorExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCursorExpr(ctx: plsqlParser.CursorExprContext?): T?

    /**
     * Visit a parse tree produced by the `IsExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIsExpr(ctx: plsqlParser.IsExprContext?): T?

    /**
     * Visit a parse tree produced by the `NotExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNotExpr(ctx: plsqlParser.NotExprContext?): T?

    /**
     * Visit a parse tree produced by the `InExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitInExpr(ctx: plsqlParser.InExprContext?): T?

    /**
     * Visit a parse tree produced by the `ParenExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitParenExpr(ctx: plsqlParser.ParenExprContext?): T?

    /**
     * Visit a parse tree produced by the `OrExpr`
     * labeled alternative in [plsqlParser.expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOrExpr(ctx: plsqlParser.OrExprContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.is_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIs_part(ctx: plsqlParser.Is_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cursor_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCursor_part(ctx: plsqlParser.Cursor_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.multiset_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMultiset_type(ctx: plsqlParser.Multiset_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.relational_operator].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRelational_operator(ctx: plsqlParser.Relational_operatorContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.like_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLike_type(ctx: plsqlParser.Like_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.like_escape_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLike_escape_part(ctx: plsqlParser.Like_escape_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.between_elements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBetween_elements(ctx: plsqlParser.Between_elementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.concatenation].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConcatenation(ctx: plsqlParser.ConcatenationContext?): T?

    /**
     * Visit a parse tree produced by the `BinaryExpr`
     * labeled alternative in [plsqlParser.binary_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBinaryExpr(ctx: plsqlParser.BinaryExprContext?): T?

    /**
     * Visit a parse tree produced by the `IgnoreBinaryExpr`
     * labeled alternative in [plsqlParser.binary_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIgnoreBinaryExpr(ctx: plsqlParser.IgnoreBinaryExprContext?): T?

    /**
     * Visit a parse tree produced by the `ParenBinaryExpr`
     * labeled alternative in [plsqlParser.binary_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitParenBinaryExpr(ctx: plsqlParser.ParenBinaryExprContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.interval_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitInterval_expression(ctx: plsqlParser.Interval_expressionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_expression(ctx: plsqlParser.Model_expressionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.model_expression_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitModel_expression_element(ctx: plsqlParser.Model_expression_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.single_column_for_loop].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSingle_column_for_loop(ctx: plsqlParser.Single_column_for_loopContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.for_like_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFor_like_part(ctx: plsqlParser.For_like_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.for_increment_decrement_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFor_increment_decrement_type(ctx: plsqlParser.For_increment_decrement_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.multi_column_for_loop].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMulti_column_for_loop(ctx: plsqlParser.Multi_column_for_loopContext?): T?

    /**
     * Visit a parse tree produced by the `IgnoreUnaryExpr`
     * labeled alternative in [plsqlParser.unary_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIgnoreUnaryExpr(ctx: plsqlParser.IgnoreUnaryExprContext?): T?

    /**
     * Visit a parse tree produced by the `UnaryExpr`
     * labeled alternative in [plsqlParser.unary_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUnaryExpr(ctx: plsqlParser.UnaryExprContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.case_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCase_statement(ctx: plsqlParser.Case_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.simple_case_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSimple_case_statement(ctx: plsqlParser.Simple_case_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.simple_case_when_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSimple_case_when_part(ctx: plsqlParser.Simple_case_when_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.searched_case_statement].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSearched_case_statement(ctx: plsqlParser.Searched_case_statementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.searched_case_when_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSearched_case_when_part(ctx: plsqlParser.Searched_case_when_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.case_else_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCase_else_part(ctx: plsqlParser.Case_else_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.atom].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAtom(ctx: plsqlParser.AtomContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.expression_or_vector].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitExpression_or_vector(ctx: plsqlParser.Expression_or_vectorContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.vector_expr].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitVector_expr(ctx: plsqlParser.Vector_exprContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.quantified_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitQuantified_expression(ctx: plsqlParser.Quantified_expressionContext?): T?

    /**
     * Visit a parse tree produced by the `AggregateCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAggregateCall(ctx: plsqlParser.AggregateCallContext?): T?

    /**
     * Visit a parse tree produced by the `TodoCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTodoCall(ctx: plsqlParser.TodoCallContext?): T?

    /**
     * Visit a parse tree produced by the `XmlCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmlCall(ctx: plsqlParser.XmlCallContext?): T?

    /**
     * Visit a parse tree produced by the `CastCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCastCall(ctx: plsqlParser.CastCallContext?): T?

    /**
     * Visit a parse tree produced by the `ExtractCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitExtractCall(ctx: plsqlParser.ExtractCallContext?): T?

    /**
     * Visit a parse tree produced by the `WithinOrOverCall`
     * labeled alternative in [plsqlParser.standard_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWithinOrOverCall(ctx: plsqlParser.WithinOrOverCallContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.aggregate_windowed_function].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAggregate_windowed_function(ctx: plsqlParser.Aggregate_windowed_functionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.over_clause_keyword].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOver_clause_keyword(ctx: plsqlParser.Over_clause_keywordContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.within_or_over_clause_keyword].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWithin_or_over_clause_keyword(ctx: plsqlParser.Within_or_over_clause_keywordContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.standard_prediction_function_keyword].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitStandard_prediction_function_keyword(ctx: plsqlParser.Standard_prediction_function_keywordContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.over_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOver_clause(ctx: plsqlParser.Over_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.windowing_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWindowing_clause(ctx: plsqlParser.Windowing_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.windowing_type].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWindowing_type(ctx: plsqlParser.Windowing_typeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.windowing_elements].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWindowing_elements(ctx: plsqlParser.Windowing_elementsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.using_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUsing_clause(ctx: plsqlParser.Using_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.using_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitUsing_element(ctx: plsqlParser.Using_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.collect_order_by_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCollect_order_by_part(ctx: plsqlParser.Collect_order_by_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.within_or_over_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWithin_or_over_part(ctx: plsqlParser.Within_or_over_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cost_matrix_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCost_matrix_clause(ctx: plsqlParser.Cost_matrix_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xml_passing_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXml_passing_clause(ctx: plsqlParser.Xml_passing_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xml_attributes_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXml_attributes_clause(ctx: plsqlParser.Xml_attributes_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xml_namespaces_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXml_namespaces_clause(ctx: plsqlParser.Xml_namespaces_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xml_table_column].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXml_table_column(ctx: plsqlParser.Xml_table_columnContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xml_general_default_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXml_general_default_part(ctx: plsqlParser.Xml_general_default_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xml_multiuse_expression_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXml_multiuse_expression_element(ctx: plsqlParser.Xml_multiuse_expression_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmlroot_param_version_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmlroot_param_version_part(ctx: plsqlParser.Xmlroot_param_version_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmlroot_param_standalone_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmlroot_param_standalone_part(ctx: plsqlParser.Xmlroot_param_standalone_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmlserialize_param_enconding_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmlserialize_param_enconding_part(ctx: plsqlParser.Xmlserialize_param_enconding_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmlserialize_param_version_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmlserialize_param_version_part(ctx: plsqlParser.Xmlserialize_param_version_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xmlserialize_param_ident_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXmlserialize_param_ident_part(ctx: plsqlParser.Xmlserialize_param_ident_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sql_plus_command].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSql_plus_command(ctx: plsqlParser.Sql_plus_commandContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.whenever_command].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWhenever_command(ctx: plsqlParser.Whenever_commandContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.set_command].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSet_command(ctx: plsqlParser.Set_commandContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.exit_command].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitExit_command(ctx: plsqlParser.Exit_commandContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.prompt_command].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPrompt_command(ctx: plsqlParser.Prompt_commandContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.show_errors_command].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitShow_errors_command(ctx: plsqlParser.Show_errors_commandContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.partition_extension_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPartition_extension_clause(ctx: plsqlParser.Partition_extension_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.column_alias].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitColumn_alias(ctx: plsqlParser.Column_aliasContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_alias].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_alias(ctx: plsqlParser.Table_aliasContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.alias_quoted_string].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAlias_quoted_string(ctx: plsqlParser.Alias_quoted_stringContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.where_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitWhere_clause(ctx: plsqlParser.Where_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.current_of_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCurrent_of_clause(ctx: plsqlParser.Current_of_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.into_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitInto_clause(ctx: plsqlParser.Into_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.xml_column_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitXml_column_name(ctx: plsqlParser.Xml_column_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cost_class_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCost_class_name(ctx: plsqlParser.Cost_class_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.attribute_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAttribute_name(ctx: plsqlParser.Attribute_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.savepoint_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSavepoint_name(ctx: plsqlParser.Savepoint_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.rollback_segment_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRollback_segment_name(ctx: plsqlParser.Rollback_segment_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_var_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_var_name(ctx: plsqlParser.Table_var_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.schema_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSchema_name(ctx: plsqlParser.Schema_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.routine_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRoutine_name(ctx: plsqlParser.Routine_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.package_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPackage_name(ctx: plsqlParser.Package_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.implementation_type_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitImplementation_type_name(ctx: plsqlParser.Implementation_type_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.parameter_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitParameter_name(ctx: plsqlParser.Parameter_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.reference_model_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitReference_model_name(ctx: plsqlParser.Reference_model_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.main_model_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitMain_model_name(ctx: plsqlParser.Main_model_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.aggregate_function_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitAggregate_function_name(ctx: plsqlParser.Aggregate_function_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.query_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitQuery_name(ctx: plsqlParser.Query_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.constraint_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConstraint_name(ctx: plsqlParser.Constraint_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.label_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLabel_name(ctx: plsqlParser.Label_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.type_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitType_name(ctx: plsqlParser.Type_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.sequence_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitSequence_name(ctx: plsqlParser.Sequence_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.exception_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitException_name(ctx: plsqlParser.Exception_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.function_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFunction_name(ctx: plsqlParser.Function_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.procedure_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitProcedure_name(ctx: plsqlParser.Procedure_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.trigger_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTrigger_name(ctx: plsqlParser.Trigger_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.variable_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitVariable_name(ctx: plsqlParser.Variable_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.index_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIndex_name(ctx: plsqlParser.Index_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.cursor_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCursor_name(ctx: plsqlParser.Cursor_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.record_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRecord_name(ctx: plsqlParser.Record_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.collection_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitCollection_name(ctx: plsqlParser.Collection_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.link_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLink_name(ctx: plsqlParser.Link_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.column_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitColumn_name(ctx: plsqlParser.Column_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.role_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRole_name(ctx: plsqlParser.Role_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.tableview_name].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTableview_name(ctx: plsqlParser.Tableview_nameContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.dot_id].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDot_id(ctx: plsqlParser.Dot_idContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.star].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitStar(ctx: plsqlParser.StarContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.keep_clause].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitKeep_clause(ctx: plsqlParser.Keep_clauseContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.function_argument].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFunction_argument(ctx: plsqlParser.Function_argumentContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.function_argument_analytic].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFunction_argument_analytic(ctx: plsqlParser.Function_argument_analyticContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.function_argument_modeling].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFunction_argument_modeling(ctx: plsqlParser.Function_argument_modelingContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.respect_or_ignore_nulls].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRespect_or_ignore_nulls(ctx: plsqlParser.Respect_or_ignore_nullsContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.argument].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitArgument(ctx: plsqlParser.ArgumentContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.type_spec].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitType_spec(ctx: plsqlParser.Type_specContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.datatype].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitDatatype(ctx: plsqlParser.DatatypeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.precision_part].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitPrecision_part(ctx: plsqlParser.Precision_partContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.native_datatype_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNative_datatype_element(ctx: plsqlParser.Native_datatype_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.bind_variable].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitBind_variable(ctx: plsqlParser.Bind_variableContext?): T?

    /**
     * Visit a parse tree produced by the `FuncCall`
     * labeled alternative in [plsqlParser.general_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitFuncCall(ctx: plsqlParser.FuncCallContext?): T?

    /**
     * Visit a parse tree produced by the `Identifier`
     * labeled alternative in [plsqlParser.general_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitIdentifier(ctx: plsqlParser.IdentifierContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.table_element].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitTable_element(ctx: plsqlParser.Table_elementContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.constant].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConstant(ctx: plsqlParser.ConstantContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.numeric].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNumeric(ctx: plsqlParser.NumericContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.numeric_negative].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNumeric_negative(ctx: plsqlParser.Numeric_negativeContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.quoted_string].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitQuoted_string(ctx: plsqlParser.Quoted_stringContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.r_id].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitR_id(ctx: plsqlParser.R_idContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.id_expression].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitId_expression(ctx: plsqlParser.Id_expressionContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.not_equal_op].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitNot_equal_op(ctx: plsqlParser.Not_equal_opContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.greater_than_or_equals_op].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitGreater_than_or_equals_op(ctx: plsqlParser.Greater_than_or_equals_opContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.less_than_or_equals_op].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitLess_than_or_equals_op(ctx: plsqlParser.Less_than_or_equals_opContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.concatenation_op].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitConcatenation_op(ctx: plsqlParser.Concatenation_opContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.outer_join_sign].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitOuter_join_sign(ctx: plsqlParser.Outer_join_signContext?): T?

    /**
     * Visit a parse tree produced by [plsqlParser.regular_id].
     * @param ctx the parse tree
     * @return the visitor result
     */
    fun visitRegular_id(ctx: plsqlParser.Regular_idContext?): T?
}
