// Generated from /Users/tomoo/proj/ru.hse.nml/src/main/antlr/ru/hse/nml/NmlParser.g4 by ANTLR 4.8
package ru.hse.nml.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NmlParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(NmlParser.SpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(NmlParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#letDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDef(NmlParser.LetDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#letExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpr(NmlParser.LetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(NmlParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpr(NmlParser.TypeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#typeExprDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExprDataType(NmlParser.TypeExprDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#typeExprValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExprValue(NmlParser.TypeExprValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#memDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemDef(NmlParser.MemDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#memAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemAccess(NmlParser.MemAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#memSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemSize(NmlParser.MemSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#memType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemType(NmlParser.MemTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(NmlParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#varSizeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSizeType(NmlParser.VarSizeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#regDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegDef(NmlParser.RegDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#regSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegSize(NmlParser.RegSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#regType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegType(NmlParser.RegTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeDef(NmlParser.ModeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAccess(NmlParser.ModeAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeType(NmlParser.ModeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeOr(NmlParser.ModeOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAnd(NmlParser.ModeAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeParamList(NmlParser.ModeParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeAssignPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAssignPart(NmlParser.ModeAssignPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeAssignPartMini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAssignPartMini(NmlParser.ModeAssignPartMiniContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeAttrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAttrList(NmlParser.ModeAttrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#assignInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignInitPart(NmlParser.AssignInitPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeSyntaxPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeSyntaxPart(NmlParser.ModeSyntaxPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeImagePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeImagePart(NmlParser.ModeImagePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeActionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeActionPart(NmlParser.ModeActionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeRev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeRev(NmlParser.ModeRevContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeSyntax(NmlParser.ModeSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeImage(NmlParser.ModeImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAction(NmlParser.ModeActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpDef(NmlParser.OpDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAccess(NmlParser.OpAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpType(NmlParser.OpTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opAndRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAndRule(NmlParser.OpAndRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opOrRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpOrRule(NmlParser.OpOrRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpParameterList(NmlParser.OpParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpParameter(NmlParser.OpParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opAttrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAttrList(NmlParser.OpAttrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSyntax(NmlParser.OpSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpImage(NmlParser.OpImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#opAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAction(NmlParser.OpActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(NmlParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NmlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#regularStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularStatement(NmlParser.RegularStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(NmlParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(NmlParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#assignStatementRightParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatementRightParen(NmlParser.AssignStatementRightParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#assignStatementRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatementRight(NmlParser.AssignStatementRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#assignStatementRightVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatementRightVar(NmlParser.AssignStatementRightVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#exceptionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionStatement(NmlParser.ExceptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#markStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkStatement(NmlParser.MarkStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(NmlParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#booleanState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanState(NmlParser.BooleanStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#booleanVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVal(NmlParser.BooleanValContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#elifState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifState(NmlParser.ElifStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(NmlParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#formatString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatString(NmlParser.FormatStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#formatParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatParameter(NmlParser.FormatParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#formatParameterMini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatParameterMini(NmlParser.FormatParameterMiniContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#syntaImageActionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntaImageActionCall(NmlParser.SyntaImageActionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#sIAPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIAPar(NmlParser.SIAParContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#sIAParMini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIAParMini(NmlParser.SIAParMiniContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#modeCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeCall(NmlParser.ModeCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(NmlParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#locationNoDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationNoDot(NmlParser.LocationNoDotContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#locationDCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationDCol(NmlParser.LocationDColContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#locationDColNoDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationDColNoDot(NmlParser.LocationDColNoDotContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#zero_extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZero_extend(NmlParser.Zero_extendContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#sign_extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_extend(NmlParser.Sign_extendContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#coerce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoerce(NmlParser.CoerceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#coerceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoerceType(NmlParser.CoerceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#coerceNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoerceNumber(NmlParser.CoerceNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(NmlParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastType(NmlParser.CastTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#castNumberPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastNumberPart(NmlParser.CastNumberPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#castNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastNumber(NmlParser.CastNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrace(NmlParser.TraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#traceString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceString(NmlParser.TraceStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#traceVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceVars(NmlParser.TraceVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#traceVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceVar(NmlParser.TraceVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#memoryAddressDCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryAddressDCol(NmlParser.MemoryAddressDColContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#memoryAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryAddress(NmlParser.MemoryAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#memTypePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemTypePart(NmlParser.MemTypePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#operatorArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorArith(NmlParser.OperatorArithContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#operatorCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCompare(NmlParser.OperatorCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link NmlParser#numberExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(NmlParser.NumberExprContext ctx);
}