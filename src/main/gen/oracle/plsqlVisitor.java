// Generated from oracle/plsql.g4 by ANTLR 4.13.2
package com.github.frostycityman.inlinesqlcommentor.sql.parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link plsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface plsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link plsqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwallow_to_semi(plsqlParser.Swallow_to_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#compilation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(plsqlParser.Compilation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sql_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_script(plsqlParser.Sql_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sql_explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_explain(plsqlParser.Sql_explainContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#unit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit_statement(plsqlParser.Unit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#unit_statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit_statement_body(plsqlParser.Unit_statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_role(plsqlParser.Create_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#role_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_option(plsqlParser.Role_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#refresh_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefresh_materialized_view(plsqlParser.Refresh_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_materialized_view(plsqlParser.Create_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_mv_refresh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_mv_refresh(plsqlParser.Create_mv_refreshContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#build_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_clause(plsqlParser.Build_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_permission(plsqlParser.Alter_permissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#permission_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermission_options(plsqlParser.Permission_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(plsqlParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#view_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_options(plsqlParser.View_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#view_alias_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_alias_constraint(plsqlParser.View_alias_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(plsqlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cluster_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_index_clause(plsqlParser.Cluster_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cluster_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_name(plsqlParser.Cluster_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#index_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_attributes(plsqlParser.Index_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#tablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace(plsqlParser.TablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#key_compression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_compression(plsqlParser.Key_compressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sort_or_nosort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_or_nosort(plsqlParser.Sort_or_nosortContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#visible_or_invisible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisible_or_invisible(plsqlParser.Visible_or_invisibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#parallel_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_clause(plsqlParser.Parallel_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_index_clause(plsqlParser.Table_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#index_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_expr(plsqlParser.Index_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#index_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_properties(plsqlParser.Index_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#global_partitioned_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_partitioned_index(plsqlParser.Global_partitioned_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#index_partitioning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_partitioning_clause(plsqlParser.Index_partitioning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_name(plsqlParser.Partition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(plsqlParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#string_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_function(plsqlParser.String_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(plsqlParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#individual_hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual_hash_partitions(plsqlParser.Individual_hash_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#partitioning_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitioning_storage_clause(plsqlParser.Partitioning_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_compression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_compression(plsqlParser.Table_compressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lob_partitioning_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_partitioning_storage(plsqlParser.Lob_partitioning_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lob_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_item(plsqlParser.Lob_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lob_segname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_segname(plsqlParser.Lob_segnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#varray_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_item(plsqlParser.Varray_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#hash_partitions_by_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partitions_by_quantity(plsqlParser.Hash_partitions_by_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#hash_partition_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partition_quantity(plsqlParser.Hash_partition_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#local_partitioned_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_partitioned_index(plsqlParser.Local_partitioned_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#on_range_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_range_partitioned_table(plsqlParser.On_range_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#on_list_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_list_partitioned_table(plsqlParser.On_list_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#on_hash_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_hash_partitioned_table(plsqlParser.On_hash_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#on_comp_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_comp_partitioned_table(plsqlParser.On_comp_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#index_subpartition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_subpartition_clause(plsqlParser.Index_subpartition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subpartition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_name(plsqlParser.Subpartition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#domain_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_index_clause(plsqlParser.Domain_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#indextype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndextype(plsqlParser.IndextypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#odci_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdci_parameters(plsqlParser.Odci_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#local_domain_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_domain_index_clause(plsqlParser.Local_domain_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmlindex_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlindex_clause(plsqlParser.Xmlindex_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#local_xmlindex_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_xmlindex_clause(plsqlParser.Local_xmlindex_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#bitmap_join_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitmap_join_index_clause(plsqlParser.Bitmap_join_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(plsqlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#relational_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_table(plsqlParser.Relational_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#relational_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_properties(plsqlParser.Relational_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(plsqlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#inline_ref_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_ref_constraint(plsqlParser.Inline_ref_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#virtual_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtual_column_definition(plsqlParser.Virtual_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_of_line_constraint(plsqlParser.Out_of_line_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(plsqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#on_delete_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete_clause(plsqlParser.On_delete_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#out_of_line_ref_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_of_line_ref_constraint(plsqlParser.Out_of_line_ref_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#supplemental_logging_props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_logging_props(plsqlParser.Supplemental_logging_propsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#supplemental_log_grp_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_log_grp_clause(plsqlParser.Supplemental_log_grp_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#log_grp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_grp(plsqlParser.Log_grpContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#supplemental_id_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_id_key_clause(plsqlParser.Supplemental_id_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#physical_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_properties(plsqlParser.Physical_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#deferred_segment_creation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_segment_creation(plsqlParser.Deferred_segment_creationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#segment_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_attributes_clause(plsqlParser.Segment_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#physical_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_attributes_clause(plsqlParser.Physical_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_clause(plsqlParser.Storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#size_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize_clause(plsqlParser.Size_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#logging_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogging_clause(plsqlParser.Logging_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#column_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_properties(plsqlParser.Column_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#object_type_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_col_properties(plsqlParser.Object_type_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#substitutable_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutable_column_clause(plsqlParser.Substitutable_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#nested_table_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table_col_properties(plsqlParser.Nested_table_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#nested_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_item(plsqlParser.Nested_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#object_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_properties(plsqlParser.Object_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#inline_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_constraint(plsqlParser.Inline_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#references_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences_clause(plsqlParser.References_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#paren_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_column_list(plsqlParser.Paren_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(plsqlParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#check_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_constraint(plsqlParser.Check_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#constraint_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_state(plsqlParser.Constraint_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#using_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_index_clause(plsqlParser.Using_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#varray_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_col_properties(plsqlParser.Varray_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#varray_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_storage_clause(plsqlParser.Varray_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lob_storage_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_storage_parameters(plsqlParser.Lob_storage_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lob_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_parameters(plsqlParser.Lob_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lob_retention_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_retention_clause(plsqlParser.Lob_retention_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lob_deduplicate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_deduplicate_clause(plsqlParser.Lob_deduplicate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lob_compression_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_compression_clause(plsqlParser.Lob_compression_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#encryption_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryption_spec(plsqlParser.Encryption_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lob_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_storage_clause(plsqlParser.Lob_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmltype_column_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_column_properties(plsqlParser.Xmltype_column_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmltype_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_storage(plsqlParser.Xmltype_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmlschema_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlschema_spec(plsqlParser.Xmlschema_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#allow_or_disallow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllow_or_disallow(plsqlParser.Allow_or_disallowContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_partitioning_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_partitioning_clauses(plsqlParser.Table_partitioning_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#range_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partitions(plsqlParser.Range_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#range_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_values_clause(plsqlParser.Range_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_partition_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_partition_description(plsqlParser.Table_partition_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#list_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partitions(plsqlParser.List_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#list_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_values_clause(plsqlParser.List_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partitions(plsqlParser.Hash_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#composite_range_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_range_partitions(plsqlParser.Composite_range_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subpartition_by_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_by_range(plsqlParser.Subpartition_by_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subpartition_by_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_by_list(plsqlParser.Subpartition_by_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subpartition_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_template(plsqlParser.Subpartition_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#range_subpartition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_subpartition_desc(plsqlParser.Range_subpartition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#list_subpartition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_subpartition_desc(plsqlParser.List_subpartition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#individual_hash_subparts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual_hash_subparts(plsqlParser.Individual_hash_subpartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#hash_subpartition_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subpartition_quantity(plsqlParser.Hash_subpartition_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subpartition_by_hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_by_hash(plsqlParser.Subpartition_by_hashContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#range_partition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partition_desc(plsqlParser.Range_partition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#hash_subparts_by_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subparts_by_quantity(plsqlParser.Hash_subparts_by_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#composite_list_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_list_partitions(plsqlParser.Composite_list_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#list_partition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partition_desc(plsqlParser.List_partition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#composite_hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_hash_partitions(plsqlParser.Composite_hash_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#reference_partitioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_partitioning(plsqlParser.Reference_partitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#reference_partition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_partition_desc(plsqlParser.Reference_partition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#system_partitioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_partitioning(plsqlParser.System_partitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#enable_disable_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_disable_clause(plsqlParser.Enable_disable_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#exceptions_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptions_clause(plsqlParser.Exceptions_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#row_movement_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_movement_clause(plsqlParser.Row_movement_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#flashback_archive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_archive_clause(plsqlParser.Flashback_archive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#object_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_table(plsqlParser.Object_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#object_table_substitution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_table_substitution(plsqlParser.Object_table_substitutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#oid_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_clause(plsqlParser.Oid_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#oid_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_index_clause(plsqlParser.Oid_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmltype_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_table(plsqlParser.Xmltype_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmltype_virtual_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_virtual_columns(plsqlParser.Xmltype_virtual_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(plsqlParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(plsqlParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_table_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_properties(plsqlParser.Alter_table_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_table_properties_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_properties_1(plsqlParser.Alter_table_properties_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#supplemental_table_logging}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_table_logging(plsqlParser.Supplemental_table_loggingContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#allocate_extent_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_extent_clause(plsqlParser.Allocate_extent_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#deallocate_unused_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate_unused_clause(plsqlParser.Deallocate_unused_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#upgrade_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpgrade_table_clause(plsqlParser.Upgrade_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#records_per_block_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecords_per_block_clause(plsqlParser.Records_per_block_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_iot_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_iot_clauses(plsqlParser.Alter_iot_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#index_org_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_org_table_clause(plsqlParser.Index_org_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#mapping_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping_table_clause(plsqlParser.Mapping_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#index_org_overflow_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_org_overflow_clause(plsqlParser.Index_org_overflow_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_overflow_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_overflow_clause(plsqlParser.Alter_overflow_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#add_overflow_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_overflow_clause(plsqlParser.Add_overflow_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#shrink_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShrink_clause(plsqlParser.Shrink_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_mapping_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_mapping_table_clause(plsqlParser.Alter_mapping_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#constraint_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_clauses(plsqlParser.Constraint_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#old_constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_constraint_name(plsqlParser.Old_constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#new_constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_constraint_name(plsqlParser.New_constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_constraint_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_constraint_clause(plsqlParser.Drop_constraint_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_primary_key_or_unique_or_generic_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_primary_key_or_unique_or_generic_clause(plsqlParser.Drop_primary_key_or_unique_or_generic_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_clauses(plsqlParser.Column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#add_modify_drop_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_modify_drop_column_clauses(plsqlParser.Add_modify_drop_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#add_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_column_clause(plsqlParser.Add_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#modify_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_column_clauses(plsqlParser.Modify_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_clause(plsqlParser.Alter_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#modify_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_col_properties(plsqlParser.Modify_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#modify_col_substitutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_col_substitutable(plsqlParser.Modify_col_substitutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_clause(plsqlParser.Drop_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#rename_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_column_clause(plsqlParser.Rename_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#old_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_column_name(plsqlParser.Old_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#new_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_column_name(plsqlParser.New_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#modify_collection_retrieval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_collection_retrieval(plsqlParser.Modify_collection_retrievalContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#collection_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_item(plsqlParser.Collection_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#modify_lob_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_lob_storage_clause(plsqlParser.Modify_lob_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#modify_lob_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_lob_parameters(plsqlParser.Modify_lob_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(plsqlParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function(plsqlParser.Alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_body(plsqlParser.Create_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_enable_clause(plsqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by_clause(plsqlParser.Partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_cache_clause(plsqlParser.Result_cache_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelies_on_part(plsqlParser.Relies_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreaming_clause(plsqlParser.Streaming_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_package(plsqlParser.Drop_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_package(plsqlParser.Alter_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package(plsqlParser.Create_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(plsqlParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(plsqlParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_spec(plsqlParser.Package_obj_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_spec(plsqlParser.Procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_spec(plsqlParser.Function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_body(plsqlParser.Package_obj_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(plsqlParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_procedure(plsqlParser.Alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_body(plsqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger(plsqlParser.Drop_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger(plsqlParser.Alter_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger(plsqlParser.Create_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_follows_clause(plsqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_when_clause(plsqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_dml_trigger(plsqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#for_each_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_row(plsqlParser.For_each_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_dml_trigger(plsqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_trigger(plsqlParser.Non_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#trigger_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_body(plsqlParser.Trigger_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#routine_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_clause(plsqlParser.Routine_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_trigger_block(plsqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_point_section(plsqlParser.Timing_point_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_event(plsqlParser.Non_dml_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_clause(plsqlParser.Dml_event_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_element(plsqlParser.Dml_event_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_nested_clause(plsqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_clause(plsqlParser.Referencing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#referencing_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_element(plsqlParser.Referencing_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(plsqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type(plsqlParser.Alter_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompile_type_clause(plsqlParser.Compile_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_type_clause(plsqlParser.Replace_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_spec(plsqlParser.Alter_method_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_element(plsqlParser.Alter_method_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_attribute_definition(plsqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_definition(plsqlParser.Attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_collection_clauses(plsqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_handling_clause(plsqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_exceptions_part(plsqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(plsqlParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(plsqlParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#object_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_def(plsqlParser.Object_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#object_as_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_as_part(plsqlParser.Object_as_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#object_under_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_under_part(plsqlParser.Object_under_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table_type_def(plsqlParser.Nested_table_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type(plsqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body(plsqlParser.Type_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body_elements(plsqlParser.Type_body_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_func_declaration(plsqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprog_decl_in_type(plsqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_decl_in_type(plsqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_in_type(plsqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(plsqlParser.Constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_clause(plsqlParser.Modifier_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_member_spec(plsqlParser.Object_member_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type_attr(plsqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#element_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec(plsqlParser.Element_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec_options(plsqlParser.Element_spec_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_spec(plsqlParser.Subprogram_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_procedure_spec(plsqlParser.Type_procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_spec(plsqlParser.Type_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_spec(plsqlParser.Constructor_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_function_spec(plsqlParser.Map_order_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_clause(plsqlParser.Pragma_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_elements(plsqlParser.Pragma_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_elements_parameter(plsqlParser.Type_elements_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence(plsqlParser.Drop_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(plsqlParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(plsqlParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_spec(plsqlParser.Sequence_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_start_clause(plsqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoker_rights_clause(plsqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_parameters_clause(plsqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#call_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_spec(plsqlParser.Call_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#java_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_spec(plsqlParser.Java_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#c_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_spec(plsqlParser.C_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_agent_in_clause(plsqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_parameters_clause(plsqlParser.C_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(plsqlParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#default_value_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value_part(plsqlParser.Default_value_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#declare_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_spec(plsqlParser.Declare_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(plsqlParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_declaration(plsqlParser.Subtype_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_declaration(plsqlParser.Cursor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_spec(plsqlParser.Parameter_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_declaration(plsqlParser.Exception_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_declaration(plsqlParser.Pragma_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#record_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_declaration(plsqlParser.Record_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#record_type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_dec(plsqlParser.Record_type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#field_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_spec(plsqlParser.Field_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#record_var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_var_dec(plsqlParser.Record_var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_declaration(plsqlParser.Table_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_dec(plsqlParser.Table_type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_indexed_by_part(plsqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_type_def(plsqlParser.Varray_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_var_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_var_dec(plsqlParser.Table_var_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_of_statements(plsqlParser.Seq_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#label_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_declaration(plsqlParser.Label_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(plsqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(plsqlParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(plsqlParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(plsqlParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(plsqlParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(plsqlParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#elsif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_part(plsqlParser.Elsif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(plsqlParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(plsqlParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_loop_param(plsqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#forall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_statement(plsqlParser.Forall_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds_clause(plsqlParser.Bounds_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#between_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_bound(plsqlParser.Between_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lower_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower_bound(plsqlParser.Lower_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(plsqlParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#null_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_statement(plsqlParser.Null_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#raise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_statement(plsqlParser.Raise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(plsqlParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(plsqlParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(plsqlParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#exception_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_handler(plsqlParser.Exception_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_block(plsqlParser.Trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(plsqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(plsqlParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_immediate(plsqlParser.Execute_immediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_returning_clause(plsqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_manipulation_language_statements(plsqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_manipulation_statements(plsqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#close_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_statement(plsqlParser.Close_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#open_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_statement(plsqlParser.Open_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_statement(plsqlParser.Fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_for_statement(plsqlParser.Open_for_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_control_statements(plsqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_transaction_command(plsqlParser.Set_transaction_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_constraint_command(plsqlParser.Set_constraint_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_statement(plsqlParser.Commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#write_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_clause(plsqlParser.Write_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_statement(plsqlParser.Rollback_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_statement(plsqlParser.Savepoint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#explain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_statement(plsqlParser.Explain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(plsqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_factoring_clause(plsqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#factoring_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoring_element(plsqlParser.Factoring_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#search_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_clause(plsqlParser.Search_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_clause(plsqlParser.Cycle_clauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubqueryParen}
	 * labeled alternative in {@link plsqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryParen(plsqlParser.SubqueryParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreSubquery}
	 * labeled alternative in {@link plsqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreSubquery(plsqlParser.IgnoreSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubqueryCompound}
	 * labeled alternative in {@link plsqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryCompound(plsqlParser.SubqueryCompoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_operation_part(plsqlParser.Subquery_operation_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#query_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_block(plsqlParser.Query_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Star1}
	 * labeled alternative in {@link plsqlParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar1(plsqlParser.Star1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code StarTable}
	 * labeled alternative in {@link plsqlParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTable(plsqlParser.StarTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreTableview_name}
	 * labeled alternative in {@link plsqlParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreTableview_name(plsqlParser.IgnoreTableview_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Alias_expr}
	 * labeled alternative in {@link plsqlParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_expr(plsqlParser.Alias_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(plsqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_ref_pivot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_pivot(plsqlParser.Table_ref_pivotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExpr}
	 * labeled alternative in {@link plsqlParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExpr(plsqlParser.JoinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableRefSimple}
	 * labeled alternative in {@link plsqlParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRefSimple(plsqlParser.TableRefSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableRefAux}
	 * labeled alternative in {@link plsqlParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRefAux(plsqlParser.TableRefAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux(plsqlParser.Table_ref_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(plsqlParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#join_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_on_part(plsqlParser.Join_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#join_using_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_using_part(plsqlParser.Join_using_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(plsqlParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_partition_clause(plsqlParser.Query_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_query_clause(plsqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(plsqlParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#pivot_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_element(plsqlParser.Pivot_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_for_clause(plsqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause(plsqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_element(plsqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_elements(plsqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(plsqlParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_clause(plsqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_elements(plsqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_query_clause(plsqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#start_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_part(plsqlParser.Start_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(plsqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_elements(plsqlParser.Group_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup_cube_clause(plsqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_clause(plsqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_elements(plsqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(plsqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_clause(plsqlParser.Model_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_reference_options(plsqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rows_clause(plsqlParser.Return_rows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#reference_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model(plsqlParser.Reference_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#main_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model(plsqlParser.Main_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_clauses(plsqlParser.Model_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_partition_part(plsqlParser.Model_column_partition_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_list(plsqlParser.Model_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column(plsqlParser.Model_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_clause(plsqlParser.Model_rules_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_part(plsqlParser.Model_rules_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_element(plsqlParser.Model_rules_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_assignment(plsqlParser.Cell_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_iterate_clause(plsqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#until_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_part(plsqlParser.Until_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(plsqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_elements(plsqlParser.Order_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_clause(plsqlParser.For_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_of_part(plsqlParser.For_update_of_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#for_update_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_options(plsqlParser.For_update_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(plsqlParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(plsqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set_clause(plsqlParser.Update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_based_update_set_clause(plsqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(plsqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(plsqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_table_insert(plsqlParser.Single_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_insert(plsqlParser.Multi_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_element(plsqlParser.Multi_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_clause(plsqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_when_part(plsqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_else_part(plsqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into_clause(plsqlParser.Insert_into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(plsqlParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(plsqlParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_clause(plsqlParser.Merge_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#merge_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_element(plsqlParser.Merge_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_delete_part(plsqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_insert_clause(plsqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_tableview(plsqlParser.Selected_tableviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_statement(plsqlParser.Lock_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_nowait_part(plsqlParser.Wait_nowait_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_element(plsqlParser.Lock_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#lock_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_mode(plsqlParser.Lock_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_table_ref(plsqlParser.General_table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_returning_clause(plsqlParser.Static_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_clause(plsqlParser.Error_logging_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_into_part(plsqlParser.Error_logging_into_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_reject_part(plsqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_table_expression_clause(plsqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_collection_expression(plsqlParser.Table_collection_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_restriction_clause(plsqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sample_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_clause(plsqlParser.Sample_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#seed_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed_part(plsqlParser.Seed_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_expression(plsqlParser.Cursor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(plsqlParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(plsqlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreExpr(plsqlParser.IgnoreExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(plsqlParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LikeExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeExpr(plsqlParser.LikeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(plsqlParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpr(plsqlParser.MemberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BetweenExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenExpr(plsqlParser.BetweenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CursorExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorExpr(plsqlParser.CursorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpr(plsqlParser.IsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(plsqlParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpr(plsqlParser.InExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(plsqlParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link plsqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(plsqlParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#is_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_part(plsqlParser.Is_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cursor_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_part(plsqlParser.Cursor_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#multiset_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiset_type(plsqlParser.Multiset_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(plsqlParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#like_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_type(plsqlParser.Like_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#like_escape_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_escape_part(plsqlParser.Like_escape_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#between_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_elements(plsqlParser.Between_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(plsqlParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link plsqlParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(plsqlParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreBinaryExpr}
	 * labeled alternative in {@link plsqlParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreBinaryExpr(plsqlParser.IgnoreBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenBinaryExpr}
	 * labeled alternative in {@link plsqlParser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenBinaryExpr(plsqlParser.ParenBinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#interval_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expression(plsqlParser.Interval_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression(plsqlParser.Model_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression_element(plsqlParser.Model_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_column_for_loop(plsqlParser.Single_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#for_like_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_like_part(plsqlParser.For_like_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#for_increment_decrement_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_increment_decrement_type(plsqlParser.For_increment_decrement_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_column_for_loop(plsqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgnoreUnaryExpr}
	 * labeled alternative in {@link plsqlParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreUnaryExpr(plsqlParser.IgnoreUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link plsqlParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(plsqlParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(plsqlParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_statement(plsqlParser.Simple_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_when_part(plsqlParser.Simple_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_statement(plsqlParser.Searched_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_when_part(plsqlParser.Searched_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#case_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_else_part(plsqlParser.Case_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(plsqlParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#expression_or_vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_or_vector(plsqlParser.Expression_or_vectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#vector_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_expr(plsqlParser.Vector_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified_expression(plsqlParser.Quantified_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AggregateCall}
	 * labeled alternative in {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateCall(plsqlParser.AggregateCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TodoCall}
	 * labeled alternative in {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodoCall(plsqlParser.TodoCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XmlCall}
	 * labeled alternative in {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlCall(plsqlParser.XmlCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CastCall}
	 * labeled alternative in {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastCall(plsqlParser.CastCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExtractCall}
	 * labeled alternative in {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractCall(plsqlParser.ExtractCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithinOrOverCall}
	 * labeled alternative in {@link plsqlParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithinOrOverCall(plsqlParser.WithinOrOverCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_windowed_function(plsqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause_keyword(plsqlParser.Over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_clause_keyword(plsqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_prediction_function_keyword(plsqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(plsqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_clause(plsqlParser.Windowing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#windowing_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_type(plsqlParser.Windowing_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_elements(plsqlParser.Windowing_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(plsqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#using_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_element(plsqlParser.Using_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_order_by_part(plsqlParser.Collect_order_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_part(plsqlParser.Within_or_over_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_matrix_clause(plsqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_passing_clause(plsqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes_clause(plsqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_namespaces_clause(plsqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_table_column(plsqlParser.Xml_table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_general_default_part(plsqlParser.Xml_general_default_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_multiuse_expression_element(plsqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_version_part(plsqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_standalone_part(plsqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_enconding_part(plsqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_version_part(plsqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_ident_part(plsqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_plus_command(plsqlParser.Sql_plus_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#whenever_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenever_command(plsqlParser.Whenever_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#set_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_command(plsqlParser.Set_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#exit_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_command(plsqlParser.Exit_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#prompt_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrompt_command(plsqlParser.Prompt_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#show_errors_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_errors_command(plsqlParser.Show_errors_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_extension_clause(plsqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(plsqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(plsqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#alias_quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_quoted_string(plsqlParser.Alias_quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(plsqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#current_of_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_of_clause(plsqlParser.Current_of_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(plsqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_column_name(plsqlParser.Xml_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_class_name(plsqlParser.Cost_class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(plsqlParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(plsqlParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_segment_name(plsqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_var_name(plsqlParser.Table_var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(plsqlParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#routine_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_name(plsqlParser.Routine_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#package_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_name(plsqlParser.Package_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_type_name(plsqlParser.Implementation_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(plsqlParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model_name(plsqlParser.Reference_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#main_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model_name(plsqlParser.Main_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function_name(plsqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#query_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_name(plsqlParser.Query_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(plsqlParser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(plsqlParser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(plsqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#sequence_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_name(plsqlParser.Sequence_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#exception_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_name(plsqlParser.Exception_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(plsqlParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(plsqlParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(plsqlParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(plsqlParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(plsqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(plsqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#record_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_name(plsqlParser.Record_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#collection_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_name(plsqlParser.Collection_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#link_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_name(plsqlParser.Link_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(plsqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#role_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name(plsqlParser.Role_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#tableview_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableview_name(plsqlParser.Tableview_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#dot_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot_id(plsqlParser.Dot_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(plsqlParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#keep_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep_clause(plsqlParser.Keep_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(plsqlParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_analytic(plsqlParser.Function_argument_analyticContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_modeling(plsqlParser.Function_argument_modelingContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespect_or_ignore_nulls(plsqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(plsqlParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(plsqlParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(plsqlParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#precision_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_part(plsqlParser.Precision_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNative_datatype_element(plsqlParser.Native_datatype_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#bind_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_variable(plsqlParser.Bind_variableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link plsqlParser#general_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(plsqlParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link plsqlParser#general_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(plsqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element(plsqlParser.Table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(plsqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(plsqlParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#numeric_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_negative(plsqlParser.Numeric_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(plsqlParser.Quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#r_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_id(plsqlParser.R_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#id_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_expression(plsqlParser.Id_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#not_equal_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal_op(plsqlParser.Not_equal_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#greater_than_or_equals_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater_than_or_equals_op(plsqlParser.Greater_than_or_equals_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#less_than_or_equals_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_than_or_equals_op(plsqlParser.Less_than_or_equals_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#concatenation_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation_op(plsqlParser.Concatenation_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_sign(plsqlParser.Outer_join_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link plsqlParser#regular_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_id(plsqlParser.Regular_idContext ctx);
}