// Generated from /Users/tomoo/proj/ru.hse.nml/src/main/antlr/ru/hse/nml/grammar/NmlParser.g4 by ANTLR 4.8
package ru.hse.nml.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ru.hse.nml.grammar.NmlParser}.
 */
public interface NmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ru.hse.nml.grammar.NmlParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ru.hse.nml.grammar.NmlParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#letDef}.
	 * @param ctx the parse tree
	 */
	void enterLetDef(ru.hse.nml.grammar.NmlParser.LetDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#letDef}.
	 * @param ctx the parse tree
	 */
	void exitLetDef(ru.hse.nml.grammar.NmlParser.LetDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void enterLetExpr(ru.hse.nml.grammar.NmlParser.LetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void exitLetExpr(ru.hse.nml.grammar.NmlParser.LetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(ru.hse.nml.grammar.NmlParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(ru.hse.nml.grammar.NmlParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpr(ru.hse.nml.grammar.NmlParser.TypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpr(ru.hse.nml.grammar.NmlParser.TypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeExprDataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeExprDataType(ru.hse.nml.grammar.NmlParser.TypeExprDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeExprDataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeExprDataType(ru.hse.nml.grammar.NmlParser.TypeExprDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeExprValue}.
	 * @param ctx the parse tree
	 */
	void enterTypeExprValue(ru.hse.nml.grammar.NmlParser.TypeExprValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeExprValue}.
	 * @param ctx the parse tree
	 */
	void exitTypeExprValue(ru.hse.nml.grammar.NmlParser.TypeExprValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memDef}.
	 * @param ctx the parse tree
	 */
	void enterMemDef(ru.hse.nml.grammar.NmlParser.MemDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memDef}.
	 * @param ctx the parse tree
	 */
	void exitMemDef(ru.hse.nml.grammar.NmlParser.MemDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemAccess(ru.hse.nml.grammar.NmlParser.MemAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemAccess(ru.hse.nml.grammar.NmlParser.MemAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memSize}.
	 * @param ctx the parse tree
	 */
	void enterMemSize(ru.hse.nml.grammar.NmlParser.MemSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memSize}.
	 * @param ctx the parse tree
	 */
	void exitMemSize(ru.hse.nml.grammar.NmlParser.MemSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memType}.
	 * @param ctx the parse tree
	 */
	void enterMemType(ru.hse.nml.grammar.NmlParser.MemTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memType}.
	 * @param ctx the parse tree
	 */
	void exitMemType(ru.hse.nml.grammar.NmlParser.MemTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(ru.hse.nml.grammar.NmlParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(ru.hse.nml.grammar.NmlParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#varSizeType}.
	 * @param ctx the parse tree
	 */
	void enterVarSizeType(ru.hse.nml.grammar.NmlParser.VarSizeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#varSizeType}.
	 * @param ctx the parse tree
	 */
	void exitVarSizeType(ru.hse.nml.grammar.NmlParser.VarSizeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regDef}.
	 * @param ctx the parse tree
	 */
	void enterRegDef(ru.hse.nml.grammar.NmlParser.RegDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regDef}.
	 * @param ctx the parse tree
	 */
	void exitRegDef(ru.hse.nml.grammar.NmlParser.RegDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regSize}.
	 * @param ctx the parse tree
	 */
	void enterRegSize(ru.hse.nml.grammar.NmlParser.RegSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regSize}.
	 * @param ctx the parse tree
	 */
	void exitRegSize(ru.hse.nml.grammar.NmlParser.RegSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regType}.
	 * @param ctx the parse tree
	 */
	void enterRegType(ru.hse.nml.grammar.NmlParser.RegTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regType}.
	 * @param ctx the parse tree
	 */
	void exitRegType(ru.hse.nml.grammar.NmlParser.RegTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeDef}.
	 * @param ctx the parse tree
	 */
	void enterModeDef(ru.hse.nml.grammar.NmlParser.ModeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeDef}.
	 * @param ctx the parse tree
	 */
	void exitModeDef(ru.hse.nml.grammar.NmlParser.ModeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAccess}.
	 * @param ctx the parse tree
	 */
	void enterModeAccess(ru.hse.nml.grammar.NmlParser.ModeAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAccess}.
	 * @param ctx the parse tree
	 */
	void exitModeAccess(ru.hse.nml.grammar.NmlParser.ModeAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeType}.
	 * @param ctx the parse tree
	 */
	void enterModeType(ru.hse.nml.grammar.NmlParser.ModeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeType}.
	 * @param ctx the parse tree
	 */
	void exitModeType(ru.hse.nml.grammar.NmlParser.ModeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeOr}.
	 * @param ctx the parse tree
	 */
	void enterModeOr(ru.hse.nml.grammar.NmlParser.ModeOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeOr}.
	 * @param ctx the parse tree
	 */
	void exitModeOr(ru.hse.nml.grammar.NmlParser.ModeOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAnd}.
	 * @param ctx the parse tree
	 */
	void enterModeAnd(ru.hse.nml.grammar.NmlParser.ModeAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAnd}.
	 * @param ctx the parse tree
	 */
	void exitModeAnd(ru.hse.nml.grammar.NmlParser.ModeAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeParamList}.
	 * @param ctx the parse tree
	 */
	void enterModeParamList(ru.hse.nml.grammar.NmlParser.ModeParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeParamList}.
	 * @param ctx the parse tree
	 */
	void exitModeParamList(ru.hse.nml.grammar.NmlParser.ModeParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAssignPart}.
	 * @param ctx the parse tree
	 */
	void enterModeAssignPart(ru.hse.nml.grammar.NmlParser.ModeAssignPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAssignPart}.
	 * @param ctx the parse tree
	 */
	void exitModeAssignPart(ru.hse.nml.grammar.NmlParser.ModeAssignPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAssignPartMini}.
	 * @param ctx the parse tree
	 */
	void enterModeAssignPartMini(ru.hse.nml.grammar.NmlParser.ModeAssignPartMiniContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAssignPartMini}.
	 * @param ctx the parse tree
	 */
	void exitModeAssignPartMini(ru.hse.nml.grammar.NmlParser.ModeAssignPartMiniContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAttrList}.
	 * @param ctx the parse tree
	 */
	void enterModeAttrList(ru.hse.nml.grammar.NmlParser.ModeAttrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAttrList}.
	 * @param ctx the parse tree
	 */
	void exitModeAttrList(ru.hse.nml.grammar.NmlParser.ModeAttrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignInitPart}.
	 * @param ctx the parse tree
	 */
	void enterAssignInitPart(ru.hse.nml.grammar.NmlParser.AssignInitPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignInitPart}.
	 * @param ctx the parse tree
	 */
	void exitAssignInitPart(ru.hse.nml.grammar.NmlParser.AssignInitPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeSyntaxPart}.
	 * @param ctx the parse tree
	 */
	void enterModeSyntaxPart(ru.hse.nml.grammar.NmlParser.ModeSyntaxPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeSyntaxPart}.
	 * @param ctx the parse tree
	 */
	void exitModeSyntaxPart(ru.hse.nml.grammar.NmlParser.ModeSyntaxPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeImagePart}.
	 * @param ctx the parse tree
	 */
	void enterModeImagePart(ru.hse.nml.grammar.NmlParser.ModeImagePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeImagePart}.
	 * @param ctx the parse tree
	 */
	void exitModeImagePart(ru.hse.nml.grammar.NmlParser.ModeImagePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeActionPart}.
	 * @param ctx the parse tree
	 */
	void enterModeActionPart(ru.hse.nml.grammar.NmlParser.ModeActionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeActionPart}.
	 * @param ctx the parse tree
	 */
	void exitModeActionPart(ru.hse.nml.grammar.NmlParser.ModeActionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeRev}.
	 * @param ctx the parse tree
	 */
	void enterModeRev(ru.hse.nml.grammar.NmlParser.ModeRevContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeRev}.
	 * @param ctx the parse tree
	 */
	void exitModeRev(ru.hse.nml.grammar.NmlParser.ModeRevContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeSyntax}.
	 * @param ctx the parse tree
	 */
	void enterModeSyntax(ru.hse.nml.grammar.NmlParser.ModeSyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeSyntax}.
	 * @param ctx the parse tree
	 */
	void exitModeSyntax(ru.hse.nml.grammar.NmlParser.ModeSyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeImage}.
	 * @param ctx the parse tree
	 */
	void enterModeImage(ru.hse.nml.grammar.NmlParser.ModeImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeImage}.
	 * @param ctx the parse tree
	 */
	void exitModeImage(ru.hse.nml.grammar.NmlParser.ModeImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAction}.
	 * @param ctx the parse tree
	 */
	void enterModeAction(ru.hse.nml.grammar.NmlParser.ModeActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAction}.
	 * @param ctx the parse tree
	 */
	void exitModeAction(ru.hse.nml.grammar.NmlParser.ModeActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opDef}.
	 * @param ctx the parse tree
	 */
	void enterOpDef(ru.hse.nml.grammar.NmlParser.OpDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opDef}.
	 * @param ctx the parse tree
	 */
	void exitOpDef(ru.hse.nml.grammar.NmlParser.OpDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opNonException}.
	 * @param ctx the parse tree
	 */
	void enterOpNonException(ru.hse.nml.grammar.NmlParser.OpNonExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opNonException}.
	 * @param ctx the parse tree
	 */
	void exitOpNonException(ru.hse.nml.grammar.NmlParser.OpNonExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAccess}.
	 * @param ctx the parse tree
	 */
	void enterOpAccess(ru.hse.nml.grammar.NmlParser.OpAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAccess}.
	 * @param ctx the parse tree
	 */
	void exitOpAccess(ru.hse.nml.grammar.NmlParser.OpAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opType}.
	 * @param ctx the parse tree
	 */
	void enterOpType(ru.hse.nml.grammar.NmlParser.OpTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opType}.
	 * @param ctx the parse tree
	 */
	void exitOpType(ru.hse.nml.grammar.NmlParser.OpTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAndRule}.
	 * @param ctx the parse tree
	 */
	void enterOpAndRule(ru.hse.nml.grammar.NmlParser.OpAndRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAndRule}.
	 * @param ctx the parse tree
	 */
	void exitOpAndRule(ru.hse.nml.grammar.NmlParser.OpAndRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opException}.
	 * @param ctx the parse tree
	 */
	void enterOpException(ru.hse.nml.grammar.NmlParser.OpExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opException}.
	 * @param ctx the parse tree
	 */
	void exitOpException(ru.hse.nml.grammar.NmlParser.OpExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opOrRule}.
	 * @param ctx the parse tree
	 */
	void enterOpOrRule(ru.hse.nml.grammar.NmlParser.OpOrRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opOrRule}.
	 * @param ctx the parse tree
	 */
	void exitOpOrRule(ru.hse.nml.grammar.NmlParser.OpOrRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opParameterList}.
	 * @param ctx the parse tree
	 */
	void enterOpParameterList(ru.hse.nml.grammar.NmlParser.OpParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opParameterList}.
	 * @param ctx the parse tree
	 */
	void exitOpParameterList(ru.hse.nml.grammar.NmlParser.OpParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opParameter}.
	 * @param ctx the parse tree
	 */
	void enterOpParameter(ru.hse.nml.grammar.NmlParser.OpParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opParameter}.
	 * @param ctx the parse tree
	 */
	void exitOpParameter(ru.hse.nml.grammar.NmlParser.OpParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAttrList}.
	 * @param ctx the parse tree
	 */
	void enterOpAttrList(ru.hse.nml.grammar.NmlParser.OpAttrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAttrList}.
	 * @param ctx the parse tree
	 */
	void exitOpAttrList(ru.hse.nml.grammar.NmlParser.OpAttrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opSyntax}.
	 * @param ctx the parse tree
	 */
	void enterOpSyntax(ru.hse.nml.grammar.NmlParser.OpSyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opSyntax}.
	 * @param ctx the parse tree
	 */
	void exitOpSyntax(ru.hse.nml.grammar.NmlParser.OpSyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opImage}.
	 * @param ctx the parse tree
	 */
	void enterOpImage(ru.hse.nml.grammar.NmlParser.OpImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opImage}.
	 * @param ctx the parse tree
	 */
	void exitOpImage(ru.hse.nml.grammar.NmlParser.OpImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAction}.
	 * @param ctx the parse tree
	 */
	void enterOpAction(ru.hse.nml.grammar.NmlParser.OpActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAction}.
	 * @param ctx the parse tree
	 */
	void exitOpAction(ru.hse.nml.grammar.NmlParser.OpActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(ru.hse.nml.grammar.NmlParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(ru.hse.nml.grammar.NmlParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ru.hse.nml.grammar.NmlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ru.hse.nml.grammar.NmlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regularStatement}.
	 * @param ctx the parse tree
	 */
	void enterRegularStatement(ru.hse.nml.grammar.NmlParser.RegularStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regularStatement}.
	 * @param ctx the parse tree
	 */
	void exitRegularStatement(ru.hse.nml.grammar.NmlParser.RegularStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(ru.hse.nml.grammar.NmlParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(ru.hse.nml.grammar.NmlParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(ru.hse.nml.grammar.NmlParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(ru.hse.nml.grammar.NmlParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatementRightParen}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatementRightParen(ru.hse.nml.grammar.NmlParser.AssignStatementRightParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatementRightParen}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatementRightParen(ru.hse.nml.grammar.NmlParser.AssignStatementRightParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatementRight}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatementRight(ru.hse.nml.grammar.NmlParser.AssignStatementRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatementRight}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatementRight(ru.hse.nml.grammar.NmlParser.AssignStatementRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatementRightVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatementRightVar(ru.hse.nml.grammar.NmlParser.AssignStatementRightVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatementRightVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatementRightVar(ru.hse.nml.grammar.NmlParser.AssignStatementRightVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#exceptionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExceptionStatement(ru.hse.nml.grammar.NmlParser.ExceptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#exceptionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExceptionStatement(ru.hse.nml.grammar.NmlParser.ExceptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#markStatement}.
	 * @param ctx the parse tree
	 */
	void enterMarkStatement(ru.hse.nml.grammar.NmlParser.MarkStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#markStatement}.
	 * @param ctx the parse tree
	 */
	void exitMarkStatement(ru.hse.nml.grammar.NmlParser.MarkStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(ru.hse.nml.grammar.NmlParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(ru.hse.nml.grammar.NmlParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#booleanState}.
	 * @param ctx the parse tree
	 */
	void enterBooleanState(ru.hse.nml.grammar.NmlParser.BooleanStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#booleanState}.
	 * @param ctx the parse tree
	 */
	void exitBooleanState(ru.hse.nml.grammar.NmlParser.BooleanStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#booleanVal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVal(ru.hse.nml.grammar.NmlParser.BooleanValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#booleanVal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVal(ru.hse.nml.grammar.NmlParser.BooleanValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#elifState}.
	 * @param ctx the parse tree
	 */
	void enterElifState(ru.hse.nml.grammar.NmlParser.ElifStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#elifState}.
	 * @param ctx the parse tree
	 */
	void exitElifState(ru.hse.nml.grammar.NmlParser.ElifStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(ru.hse.nml.grammar.NmlParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(ru.hse.nml.grammar.NmlParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#formatString}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(ru.hse.nml.grammar.NmlParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#formatString}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(ru.hse.nml.grammar.NmlParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#formatParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormatParameter(ru.hse.nml.grammar.NmlParser.FormatParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#formatParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormatParameter(ru.hse.nml.grammar.NmlParser.FormatParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#formatParameterMini}.
	 * @param ctx the parse tree
	 */
	void enterFormatParameterMini(ru.hse.nml.grammar.NmlParser.FormatParameterMiniContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#formatParameterMini}.
	 * @param ctx the parse tree
	 */
	void exitFormatParameterMini(ru.hse.nml.grammar.NmlParser.FormatParameterMiniContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#syntaImageActionCall}.
	 * @param ctx the parse tree
	 */
	void enterSyntaImageActionCall(ru.hse.nml.grammar.NmlParser.SyntaImageActionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#syntaImageActionCall}.
	 * @param ctx the parse tree
	 */
	void exitSyntaImageActionCall(ru.hse.nml.grammar.NmlParser.SyntaImageActionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sIAPar}.
	 * @param ctx the parse tree
	 */
	void enterSIAPar(ru.hse.nml.grammar.NmlParser.SIAParContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sIAPar}.
	 * @param ctx the parse tree
	 */
	void exitSIAPar(ru.hse.nml.grammar.NmlParser.SIAParContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sIAParMini}.
	 * @param ctx the parse tree
	 */
	void enterSIAParMini(ru.hse.nml.grammar.NmlParser.SIAParMiniContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sIAParMini}.
	 * @param ctx the parse tree
	 */
	void exitSIAParMini(ru.hse.nml.grammar.NmlParser.SIAParMiniContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeCall}.
	 * @param ctx the parse tree
	 */
	void enterModeCall(ru.hse.nml.grammar.NmlParser.ModeCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeCall}.
	 * @param ctx the parse tree
	 */
	void exitModeCall(ru.hse.nml.grammar.NmlParser.ModeCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(ru.hse.nml.grammar.NmlParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(ru.hse.nml.grammar.NmlParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#locationNoDot}.
	 * @param ctx the parse tree
	 */
	void enterLocationNoDot(ru.hse.nml.grammar.NmlParser.LocationNoDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#locationNoDot}.
	 * @param ctx the parse tree
	 */
	void exitLocationNoDot(ru.hse.nml.grammar.NmlParser.LocationNoDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#locationDCol}.
	 * @param ctx the parse tree
	 */
	void enterLocationDCol(ru.hse.nml.grammar.NmlParser.LocationDColContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#locationDCol}.
	 * @param ctx the parse tree
	 */
	void exitLocationDCol(ru.hse.nml.grammar.NmlParser.LocationDColContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#locationDColNoDot}.
	 * @param ctx the parse tree
	 */
	void enterLocationDColNoDot(ru.hse.nml.grammar.NmlParser.LocationDColNoDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#locationDColNoDot}.
	 * @param ctx the parse tree
	 */
	void exitLocationDColNoDot(ru.hse.nml.grammar.NmlParser.LocationDColNoDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#zero_extend}.
	 * @param ctx the parse tree
	 */
	void enterZero_extend(ru.hse.nml.grammar.NmlParser.Zero_extendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#zero_extend}.
	 * @param ctx the parse tree
	 */
	void exitZero_extend(ru.hse.nml.grammar.NmlParser.Zero_extendContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sign_extend}.
	 * @param ctx the parse tree
	 */
	void enterSign_extend(ru.hse.nml.grammar.NmlParser.Sign_extendContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sign_extend}.
	 * @param ctx the parse tree
	 */
	void exitSign_extend(ru.hse.nml.grammar.NmlParser.Sign_extendContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#coerce}.
	 * @param ctx the parse tree
	 */
	void enterCoerce(ru.hse.nml.grammar.NmlParser.CoerceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#coerce}.
	 * @param ctx the parse tree
	 */
	void exitCoerce(ru.hse.nml.grammar.NmlParser.CoerceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#coerceType}.
	 * @param ctx the parse tree
	 */
	void enterCoerceType(ru.hse.nml.grammar.NmlParser.CoerceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#coerceType}.
	 * @param ctx the parse tree
	 */
	void exitCoerceType(ru.hse.nml.grammar.NmlParser.CoerceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#coerceNumber}.
	 * @param ctx the parse tree
	 */
	void enterCoerceNumber(ru.hse.nml.grammar.NmlParser.CoerceNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#coerceNumber}.
	 * @param ctx the parse tree
	 */
	void exitCoerceNumber(ru.hse.nml.grammar.NmlParser.CoerceNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(ru.hse.nml.grammar.NmlParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(ru.hse.nml.grammar.NmlParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(ru.hse.nml.grammar.NmlParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(ru.hse.nml.grammar.NmlParser.CastTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#castNumberPart}.
	 * @param ctx the parse tree
	 */
	void enterCastNumberPart(ru.hse.nml.grammar.NmlParser.CastNumberPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#castNumberPart}.
	 * @param ctx the parse tree
	 */
	void exitCastNumberPart(ru.hse.nml.grammar.NmlParser.CastNumberPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#castNumber}.
	 * @param ctx the parse tree
	 */
	void enterCastNumber(ru.hse.nml.grammar.NmlParser.CastNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#castNumber}.
	 * @param ctx the parse tree
	 */
	void exitCastNumber(ru.hse.nml.grammar.NmlParser.CastNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#trace}.
	 * @param ctx the parse tree
	 */
	void enterTrace(ru.hse.nml.grammar.NmlParser.TraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#trace}.
	 * @param ctx the parse tree
	 */
	void exitTrace(ru.hse.nml.grammar.NmlParser.TraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#traceString}.
	 * @param ctx the parse tree
	 */
	void enterTraceString(ru.hse.nml.grammar.NmlParser.TraceStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#traceString}.
	 * @param ctx the parse tree
	 */
	void exitTraceString(ru.hse.nml.grammar.NmlParser.TraceStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#traceVars}.
	 * @param ctx the parse tree
	 */
	void enterTraceVars(ru.hse.nml.grammar.NmlParser.TraceVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#traceVars}.
	 * @param ctx the parse tree
	 */
	void exitTraceVars(ru.hse.nml.grammar.NmlParser.TraceVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#traceVar}.
	 * @param ctx the parse tree
	 */
	void enterTraceVar(ru.hse.nml.grammar.NmlParser.TraceVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#traceVar}.
	 * @param ctx the parse tree
	 */
	void exitTraceVar(ru.hse.nml.grammar.NmlParser.TraceVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memoryAddressDCol}.
	 * @param ctx the parse tree
	 */
	void enterMemoryAddressDCol(ru.hse.nml.grammar.NmlParser.MemoryAddressDColContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memoryAddressDCol}.
	 * @param ctx the parse tree
	 */
	void exitMemoryAddressDCol(ru.hse.nml.grammar.NmlParser.MemoryAddressDColContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memoryAddress}.
	 * @param ctx the parse tree
	 */
	void enterMemoryAddress(ru.hse.nml.grammar.NmlParser.MemoryAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memoryAddress}.
	 * @param ctx the parse tree
	 */
	void exitMemoryAddress(ru.hse.nml.grammar.NmlParser.MemoryAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memTypePart}.
	 * @param ctx the parse tree
	 */
	void enterMemTypePart(ru.hse.nml.grammar.NmlParser.MemTypePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memTypePart}.
	 * @param ctx the parse tree
	 */
	void exitMemTypePart(ru.hse.nml.grammar.NmlParser.MemTypePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#operatorArith}.
	 * @param ctx the parse tree
	 */
	void enterOperatorArith(ru.hse.nml.grammar.NmlParser.OperatorArithContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#operatorArith}.
	 * @param ctx the parse tree
	 */
	void exitOperatorArith(ru.hse.nml.grammar.NmlParser.OperatorArithContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#operatorCompare}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCompare(ru.hse.nml.grammar.NmlParser.OperatorCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#operatorCompare}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCompare(ru.hse.nml.grammar.NmlParser.OperatorCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#numberExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(ru.hse.nml.grammar.NmlParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#numberExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(NmlParser.NumberExprContext ctx);
}