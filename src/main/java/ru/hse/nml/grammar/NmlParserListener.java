// Generated from /Users/tomoo/proj/ru.hse.nml/src/main/antlr/ru/hse/nml/NmlParser.g4 by ANTLR 4.8
package ru.hse.nml.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NmlParser}.
 */
public interface NmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NmlParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(NmlParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(NmlParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(NmlParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(NmlParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#letDef}.
	 * @param ctx the parse tree
	 */
	void enterLetDef(NmlParser.LetDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#letDef}.
	 * @param ctx the parse tree
	 */
	void exitLetDef(NmlParser.LetDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void enterLetExpr(NmlParser.LetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void exitLetExpr(NmlParser.LetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(NmlParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(NmlParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpr(NmlParser.TypeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#typeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpr(NmlParser.TypeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#typeExprDataType}.
	 * @param ctx the parse tree
	 */
	void enterTypeExprDataType(NmlParser.TypeExprDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#typeExprDataType}.
	 * @param ctx the parse tree
	 */
	void exitTypeExprDataType(NmlParser.TypeExprDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#typeExprValue}.
	 * @param ctx the parse tree
	 */
	void enterTypeExprValue(NmlParser.TypeExprValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#typeExprValue}.
	 * @param ctx the parse tree
	 */
	void exitTypeExprValue(NmlParser.TypeExprValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#memDef}.
	 * @param ctx the parse tree
	 */
	void enterMemDef(NmlParser.MemDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#memDef}.
	 * @param ctx the parse tree
	 */
	void exitMemDef(NmlParser.MemDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#memAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemAccess(NmlParser.MemAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#memAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemAccess(NmlParser.MemAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#memSize}.
	 * @param ctx the parse tree
	 */
	void enterMemSize(NmlParser.MemSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#memSize}.
	 * @param ctx the parse tree
	 */
	void exitMemSize(NmlParser.MemSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#memType}.
	 * @param ctx the parse tree
	 */
	void enterMemType(NmlParser.MemTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#memType}.
	 * @param ctx the parse tree
	 */
	void exitMemType(NmlParser.MemTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(NmlParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(NmlParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#varSizeType}.
	 * @param ctx the parse tree
	 */
	void enterVarSizeType(NmlParser.VarSizeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#varSizeType}.
	 * @param ctx the parse tree
	 */
	void exitVarSizeType(NmlParser.VarSizeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#regDef}.
	 * @param ctx the parse tree
	 */
	void enterRegDef(NmlParser.RegDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#regDef}.
	 * @param ctx the parse tree
	 */
	void exitRegDef(NmlParser.RegDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#regSize}.
	 * @param ctx the parse tree
	 */
	void enterRegSize(NmlParser.RegSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#regSize}.
	 * @param ctx the parse tree
	 */
	void exitRegSize(NmlParser.RegSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#regType}.
	 * @param ctx the parse tree
	 */
	void enterRegType(NmlParser.RegTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#regType}.
	 * @param ctx the parse tree
	 */
	void exitRegType(NmlParser.RegTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeDef}.
	 * @param ctx the parse tree
	 */
	void enterModeDef(NmlParser.ModeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeDef}.
	 * @param ctx the parse tree
	 */
	void exitModeDef(NmlParser.ModeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeAccess}.
	 * @param ctx the parse tree
	 */
	void enterModeAccess(NmlParser.ModeAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeAccess}.
	 * @param ctx the parse tree
	 */
	void exitModeAccess(NmlParser.ModeAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeType}.
	 * @param ctx the parse tree
	 */
	void enterModeType(NmlParser.ModeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeType}.
	 * @param ctx the parse tree
	 */
	void exitModeType(NmlParser.ModeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeOr}.
	 * @param ctx the parse tree
	 */
	void enterModeOr(NmlParser.ModeOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeOr}.
	 * @param ctx the parse tree
	 */
	void exitModeOr(NmlParser.ModeOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeAnd}.
	 * @param ctx the parse tree
	 */
	void enterModeAnd(NmlParser.ModeAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeAnd}.
	 * @param ctx the parse tree
	 */
	void exitModeAnd(NmlParser.ModeAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeParamList}.
	 * @param ctx the parse tree
	 */
	void enterModeParamList(NmlParser.ModeParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeParamList}.
	 * @param ctx the parse tree
	 */
	void exitModeParamList(NmlParser.ModeParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeAssignPart}.
	 * @param ctx the parse tree
	 */
	void enterModeAssignPart(NmlParser.ModeAssignPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeAssignPart}.
	 * @param ctx the parse tree
	 */
	void exitModeAssignPart(NmlParser.ModeAssignPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeAssignPartMini}.
	 * @param ctx the parse tree
	 */
	void enterModeAssignPartMini(NmlParser.ModeAssignPartMiniContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeAssignPartMini}.
	 * @param ctx the parse tree
	 */
	void exitModeAssignPartMini(NmlParser.ModeAssignPartMiniContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeAttrList}.
	 * @param ctx the parse tree
	 */
	void enterModeAttrList(NmlParser.ModeAttrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeAttrList}.
	 * @param ctx the parse tree
	 */
	void exitModeAttrList(NmlParser.ModeAttrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#assignInitPart}.
	 * @param ctx the parse tree
	 */
	void enterAssignInitPart(NmlParser.AssignInitPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#assignInitPart}.
	 * @param ctx the parse tree
	 */
	void exitAssignInitPart(NmlParser.AssignInitPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeSyntaxPart}.
	 * @param ctx the parse tree
	 */
	void enterModeSyntaxPart(NmlParser.ModeSyntaxPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeSyntaxPart}.
	 * @param ctx the parse tree
	 */
	void exitModeSyntaxPart(NmlParser.ModeSyntaxPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeImagePart}.
	 * @param ctx the parse tree
	 */
	void enterModeImagePart(NmlParser.ModeImagePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeImagePart}.
	 * @param ctx the parse tree
	 */
	void exitModeImagePart(NmlParser.ModeImagePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeActionPart}.
	 * @param ctx the parse tree
	 */
	void enterModeActionPart(NmlParser.ModeActionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeActionPart}.
	 * @param ctx the parse tree
	 */
	void exitModeActionPart(NmlParser.ModeActionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeRev}.
	 * @param ctx the parse tree
	 */
	void enterModeRev(NmlParser.ModeRevContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeRev}.
	 * @param ctx the parse tree
	 */
	void exitModeRev(NmlParser.ModeRevContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeSyntax}.
	 * @param ctx the parse tree
	 */
	void enterModeSyntax(NmlParser.ModeSyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeSyntax}.
	 * @param ctx the parse tree
	 */
	void exitModeSyntax(NmlParser.ModeSyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeImage}.
	 * @param ctx the parse tree
	 */
	void enterModeImage(NmlParser.ModeImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeImage}.
	 * @param ctx the parse tree
	 */
	void exitModeImage(NmlParser.ModeImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeAction}.
	 * @param ctx the parse tree
	 */
	void enterModeAction(NmlParser.ModeActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeAction}.
	 * @param ctx the parse tree
	 */
	void exitModeAction(NmlParser.ModeActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opDef}.
	 * @param ctx the parse tree
	 */
	void enterOpDef(NmlParser.OpDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opDef}.
	 * @param ctx the parse tree
	 */
	void exitOpDef(NmlParser.OpDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opAccess}.
	 * @param ctx the parse tree
	 */
	void enterOpAccess(NmlParser.OpAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opAccess}.
	 * @param ctx the parse tree
	 */
	void exitOpAccess(NmlParser.OpAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opType}.
	 * @param ctx the parse tree
	 */
	void enterOpType(NmlParser.OpTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opType}.
	 * @param ctx the parse tree
	 */
	void exitOpType(NmlParser.OpTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opAndRule}.
	 * @param ctx the parse tree
	 */
	void enterOpAndRule(NmlParser.OpAndRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opAndRule}.
	 * @param ctx the parse tree
	 */
	void exitOpAndRule(NmlParser.OpAndRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opOrRule}.
	 * @param ctx the parse tree
	 */
	void enterOpOrRule(NmlParser.OpOrRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opOrRule}.
	 * @param ctx the parse tree
	 */
	void exitOpOrRule(NmlParser.OpOrRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opParameterList}.
	 * @param ctx the parse tree
	 */
	void enterOpParameterList(NmlParser.OpParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opParameterList}.
	 * @param ctx the parse tree
	 */
	void exitOpParameterList(NmlParser.OpParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opParameter}.
	 * @param ctx the parse tree
	 */
	void enterOpParameter(NmlParser.OpParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opParameter}.
	 * @param ctx the parse tree
	 */
	void exitOpParameter(NmlParser.OpParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opAttrList}.
	 * @param ctx the parse tree
	 */
	void enterOpAttrList(NmlParser.OpAttrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opAttrList}.
	 * @param ctx the parse tree
	 */
	void exitOpAttrList(NmlParser.OpAttrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opSyntax}.
	 * @param ctx the parse tree
	 */
	void enterOpSyntax(NmlParser.OpSyntaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opSyntax}.
	 * @param ctx the parse tree
	 */
	void exitOpSyntax(NmlParser.OpSyntaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opImage}.
	 * @param ctx the parse tree
	 */
	void enterOpImage(NmlParser.OpImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opImage}.
	 * @param ctx the parse tree
	 */
	void exitOpImage(NmlParser.OpImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#opAction}.
	 * @param ctx the parse tree
	 */
	void enterOpAction(NmlParser.OpActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#opAction}.
	 * @param ctx the parse tree
	 */
	void exitOpAction(NmlParser.OpActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(NmlParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(NmlParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NmlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NmlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#regularStatement}.
	 * @param ctx the parse tree
	 */
	void enterRegularStatement(NmlParser.RegularStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#regularStatement}.
	 * @param ctx the parse tree
	 */
	void exitRegularStatement(NmlParser.RegularStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(NmlParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(NmlParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(NmlParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(NmlParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#assignStatementRightParen}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatementRightParen(NmlParser.AssignStatementRightParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#assignStatementRightParen}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatementRightParen(NmlParser.AssignStatementRightParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#assignStatementRight}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatementRight(NmlParser.AssignStatementRightContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#assignStatementRight}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatementRight(NmlParser.AssignStatementRightContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#assignStatementRightVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatementRightVar(NmlParser.AssignStatementRightVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#assignStatementRightVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatementRightVar(NmlParser.AssignStatementRightVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#exceptionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExceptionStatement(NmlParser.ExceptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#exceptionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExceptionStatement(NmlParser.ExceptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#markStatement}.
	 * @param ctx the parse tree
	 */
	void enterMarkStatement(NmlParser.MarkStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#markStatement}.
	 * @param ctx the parse tree
	 */
	void exitMarkStatement(NmlParser.MarkStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(NmlParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(NmlParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#booleanState}.
	 * @param ctx the parse tree
	 */
	void enterBooleanState(NmlParser.BooleanStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#booleanState}.
	 * @param ctx the parse tree
	 */
	void exitBooleanState(NmlParser.BooleanStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#booleanVal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVal(NmlParser.BooleanValContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#booleanVal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVal(NmlParser.BooleanValContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#elifState}.
	 * @param ctx the parse tree
	 */
	void enterElifState(NmlParser.ElifStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#elifState}.
	 * @param ctx the parse tree
	 */
	void exitElifState(NmlParser.ElifStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#format}.
	 * @param ctx the parse tree
	 */
	void enterFormat(NmlParser.FormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#format}.
	 * @param ctx the parse tree
	 */
	void exitFormat(NmlParser.FormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#formatString}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(NmlParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#formatString}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(NmlParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#formatParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormatParameter(NmlParser.FormatParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#formatParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormatParameter(NmlParser.FormatParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#formatParameterMini}.
	 * @param ctx the parse tree
	 */
	void enterFormatParameterMini(NmlParser.FormatParameterMiniContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#formatParameterMini}.
	 * @param ctx the parse tree
	 */
	void exitFormatParameterMini(NmlParser.FormatParameterMiniContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#syntaImageActionCall}.
	 * @param ctx the parse tree
	 */
	void enterSyntaImageActionCall(NmlParser.SyntaImageActionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#syntaImageActionCall}.
	 * @param ctx the parse tree
	 */
	void exitSyntaImageActionCall(NmlParser.SyntaImageActionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#sIAPar}.
	 * @param ctx the parse tree
	 */
	void enterSIAPar(NmlParser.SIAParContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#sIAPar}.
	 * @param ctx the parse tree
	 */
	void exitSIAPar(NmlParser.SIAParContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#sIAParMini}.
	 * @param ctx the parse tree
	 */
	void enterSIAParMini(NmlParser.SIAParMiniContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#sIAParMini}.
	 * @param ctx the parse tree
	 */
	void exitSIAParMini(NmlParser.SIAParMiniContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#modeCall}.
	 * @param ctx the parse tree
	 */
	void enterModeCall(NmlParser.ModeCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#modeCall}.
	 * @param ctx the parse tree
	 */
	void exitModeCall(NmlParser.ModeCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(NmlParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(NmlParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#locationNoDot}.
	 * @param ctx the parse tree
	 */
	void enterLocationNoDot(NmlParser.LocationNoDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#locationNoDot}.
	 * @param ctx the parse tree
	 */
	void exitLocationNoDot(NmlParser.LocationNoDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#locationDCol}.
	 * @param ctx the parse tree
	 */
	void enterLocationDCol(NmlParser.LocationDColContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#locationDCol}.
	 * @param ctx the parse tree
	 */
	void exitLocationDCol(NmlParser.LocationDColContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#locationDColNoDot}.
	 * @param ctx the parse tree
	 */
	void enterLocationDColNoDot(NmlParser.LocationDColNoDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#locationDColNoDot}.
	 * @param ctx the parse tree
	 */
	void exitLocationDColNoDot(NmlParser.LocationDColNoDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#zero_extend}.
	 * @param ctx the parse tree
	 */
	void enterZero_extend(NmlParser.Zero_extendContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#zero_extend}.
	 * @param ctx the parse tree
	 */
	void exitZero_extend(NmlParser.Zero_extendContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#sign_extend}.
	 * @param ctx the parse tree
	 */
	void enterSign_extend(NmlParser.Sign_extendContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#sign_extend}.
	 * @param ctx the parse tree
	 */
	void exitSign_extend(NmlParser.Sign_extendContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#coerce}.
	 * @param ctx the parse tree
	 */
	void enterCoerce(NmlParser.CoerceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#coerce}.
	 * @param ctx the parse tree
	 */
	void exitCoerce(NmlParser.CoerceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#coerceType}.
	 * @param ctx the parse tree
	 */
	void enterCoerceType(NmlParser.CoerceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#coerceType}.
	 * @param ctx the parse tree
	 */
	void exitCoerceType(NmlParser.CoerceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#coerceNumber}.
	 * @param ctx the parse tree
	 */
	void enterCoerceNumber(NmlParser.CoerceNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#coerceNumber}.
	 * @param ctx the parse tree
	 */
	void exitCoerceNumber(NmlParser.CoerceNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#cast}.
	 * @param ctx the parse tree
	 */
	void enterCast(NmlParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#cast}.
	 * @param ctx the parse tree
	 */
	void exitCast(NmlParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(NmlParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(NmlParser.CastTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#castNumberPart}.
	 * @param ctx the parse tree
	 */
	void enterCastNumberPart(NmlParser.CastNumberPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#castNumberPart}.
	 * @param ctx the parse tree
	 */
	void exitCastNumberPart(NmlParser.CastNumberPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#castNumber}.
	 * @param ctx the parse tree
	 */
	void enterCastNumber(NmlParser.CastNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#castNumber}.
	 * @param ctx the parse tree
	 */
	void exitCastNumber(NmlParser.CastNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#trace}.
	 * @param ctx the parse tree
	 */
	void enterTrace(NmlParser.TraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#trace}.
	 * @param ctx the parse tree
	 */
	void exitTrace(NmlParser.TraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#traceString}.
	 * @param ctx the parse tree
	 */
	void enterTraceString(NmlParser.TraceStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#traceString}.
	 * @param ctx the parse tree
	 */
	void exitTraceString(NmlParser.TraceStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#traceVars}.
	 * @param ctx the parse tree
	 */
	void enterTraceVars(NmlParser.TraceVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#traceVars}.
	 * @param ctx the parse tree
	 */
	void exitTraceVars(NmlParser.TraceVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#traceVar}.
	 * @param ctx the parse tree
	 */
	void enterTraceVar(NmlParser.TraceVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#traceVar}.
	 * @param ctx the parse tree
	 */
	void exitTraceVar(NmlParser.TraceVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#memoryAddressDCol}.
	 * @param ctx the parse tree
	 */
	void enterMemoryAddressDCol(NmlParser.MemoryAddressDColContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#memoryAddressDCol}.
	 * @param ctx the parse tree
	 */
	void exitMemoryAddressDCol(NmlParser.MemoryAddressDColContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#memoryAddress}.
	 * @param ctx the parse tree
	 */
	void enterMemoryAddress(NmlParser.MemoryAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#memoryAddress}.
	 * @param ctx the parse tree
	 */
	void exitMemoryAddress(NmlParser.MemoryAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#memTypePart}.
	 * @param ctx the parse tree
	 */
	void enterMemTypePart(NmlParser.MemTypePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#memTypePart}.
	 * @param ctx the parse tree
	 */
	void exitMemTypePart(NmlParser.MemTypePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#operatorArith}.
	 * @param ctx the parse tree
	 */
	void enterOperatorArith(NmlParser.OperatorArithContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#operatorArith}.
	 * @param ctx the parse tree
	 */
	void exitOperatorArith(NmlParser.OperatorArithContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#operatorCompare}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCompare(NmlParser.OperatorCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#operatorCompare}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCompare(NmlParser.OperatorCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link NmlParser#numberExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(NmlParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NmlParser#numberExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(NmlParser.NumberExprContext ctx);
}