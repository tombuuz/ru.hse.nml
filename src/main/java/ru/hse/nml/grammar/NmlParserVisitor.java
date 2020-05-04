// Generated from /Users/tomoo/proj/ru.hse.nml/src/main/antlr/ru/hse/nml/grammar/NmlParser.g4 by ANTLR 4.8
package ru.hse.nml.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ru.hse.nml.grammar.NmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ru.hse.nml.grammar.NmlParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#letDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDef(ru.hse.nml.grammar.NmlParser.LetDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#letExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpr(ru.hse.nml.grammar.NmlParser.LetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(ru.hse.nml.grammar.NmlParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpr(ru.hse.nml.grammar.NmlParser.TypeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeExprDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExprDataType(ru.hse.nml.grammar.NmlParser.TypeExprDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#typeExprValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExprValue(ru.hse.nml.grammar.NmlParser.TypeExprValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemDef(ru.hse.nml.grammar.NmlParser.MemDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemAccess(ru.hse.nml.grammar.NmlParser.MemAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemSize(ru.hse.nml.grammar.NmlParser.MemSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemType(ru.hse.nml.grammar.NmlParser.MemTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(ru.hse.nml.grammar.NmlParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#varSizeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSizeType(ru.hse.nml.grammar.NmlParser.VarSizeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegDef(ru.hse.nml.grammar.NmlParser.RegDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegSize(ru.hse.nml.grammar.NmlParser.RegSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegType(ru.hse.nml.grammar.NmlParser.RegTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeDef(ru.hse.nml.grammar.NmlParser.ModeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAccess(ru.hse.nml.grammar.NmlParser.ModeAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeType(ru.hse.nml.grammar.NmlParser.ModeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeOr(ru.hse.nml.grammar.NmlParser.ModeOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAnd(ru.hse.nml.grammar.NmlParser.ModeAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeParamList(ru.hse.nml.grammar.NmlParser.ModeParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAssignPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAssignPart(ru.hse.nml.grammar.NmlParser.ModeAssignPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAssignPartMini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAssignPartMini(ru.hse.nml.grammar.NmlParser.ModeAssignPartMiniContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAttrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAttrList(ru.hse.nml.grammar.NmlParser.ModeAttrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignInitPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignInitPart(ru.hse.nml.grammar.NmlParser.AssignInitPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeSyntaxPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeSyntaxPart(ru.hse.nml.grammar.NmlParser.ModeSyntaxPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeImagePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeImagePart(ru.hse.nml.grammar.NmlParser.ModeImagePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeActionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeActionPart(ru.hse.nml.grammar.NmlParser.ModeActionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeRev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeRev(ru.hse.nml.grammar.NmlParser.ModeRevContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeSyntax(ru.hse.nml.grammar.NmlParser.ModeSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeImage(ru.hse.nml.grammar.NmlParser.ModeImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeAction(ru.hse.nml.grammar.NmlParser.ModeActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpDef(ru.hse.nml.grammar.NmlParser.OpDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opNonException}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNonException(ru.hse.nml.grammar.NmlParser.OpNonExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAccess(ru.hse.nml.grammar.NmlParser.OpAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpType(ru.hse.nml.grammar.NmlParser.OpTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAndRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAndRule(ru.hse.nml.grammar.NmlParser.OpAndRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opException}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpException(ru.hse.nml.grammar.NmlParser.OpExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opOrRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpOrRule(ru.hse.nml.grammar.NmlParser.OpOrRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpParameterList(ru.hse.nml.grammar.NmlParser.OpParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpParameter(ru.hse.nml.grammar.NmlParser.OpParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAttrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAttrList(ru.hse.nml.grammar.NmlParser.OpAttrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opSyntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpSyntax(ru.hse.nml.grammar.NmlParser.OpSyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpImage(ru.hse.nml.grammar.NmlParser.OpImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#opAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAction(ru.hse.nml.grammar.NmlParser.OpActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ru.hse.nml.grammar.NmlParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ru.hse.nml.grammar.NmlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#regularStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularStatement(ru.hse.nml.grammar.NmlParser.RegularStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(ru.hse.nml.grammar.NmlParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(ru.hse.nml.grammar.NmlParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatementRightParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatementRightParen(ru.hse.nml.grammar.NmlParser.AssignStatementRightParenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatementRight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatementRight(ru.hse.nml.grammar.NmlParser.AssignStatementRightContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#assignStatementRightVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatementRightVar(ru.hse.nml.grammar.NmlParser.AssignStatementRightVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#exceptionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionStatement(ru.hse.nml.grammar.NmlParser.ExceptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#markStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkStatement(ru.hse.nml.grammar.NmlParser.MarkStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(ru.hse.nml.grammar.NmlParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#booleanState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanState(ru.hse.nml.grammar.NmlParser.BooleanStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#booleanVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVal(ru.hse.nml.grammar.NmlParser.BooleanValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#elifState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifState(ru.hse.nml.grammar.NmlParser.ElifStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(ru.hse.nml.grammar.NmlParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#formatString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatString(ru.hse.nml.grammar.NmlParser.FormatStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#formatParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatParameter(ru.hse.nml.grammar.NmlParser.FormatParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#formatParameterMini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatParameterMini(ru.hse.nml.grammar.NmlParser.FormatParameterMiniContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#syntaImageActionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntaImageActionCall(ru.hse.nml.grammar.NmlParser.SyntaImageActionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sIAPar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIAPar(ru.hse.nml.grammar.NmlParser.SIAParContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sIAParMini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIAParMini(ru.hse.nml.grammar.NmlParser.SIAParMiniContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#modeCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeCall(ru.hse.nml.grammar.NmlParser.ModeCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(ru.hse.nml.grammar.NmlParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#locationNoDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationNoDot(ru.hse.nml.grammar.NmlParser.LocationNoDotContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#locationDCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationDCol(ru.hse.nml.grammar.NmlParser.LocationDColContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#locationDColNoDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationDColNoDot(ru.hse.nml.grammar.NmlParser.LocationDColNoDotContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#zero_extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZero_extend(ru.hse.nml.grammar.NmlParser.Zero_extendContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#sign_extend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign_extend(ru.hse.nml.grammar.NmlParser.Sign_extendContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#coerce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoerce(ru.hse.nml.grammar.NmlParser.CoerceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#coerceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoerceType(ru.hse.nml.grammar.NmlParser.CoerceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#coerceNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoerceNumber(ru.hse.nml.grammar.NmlParser.CoerceNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#cast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(ru.hse.nml.grammar.NmlParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastType(ru.hse.nml.grammar.NmlParser.CastTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#castNumberPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastNumberPart(ru.hse.nml.grammar.NmlParser.CastNumberPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#castNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastNumber(ru.hse.nml.grammar.NmlParser.CastNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrace(ru.hse.nml.grammar.NmlParser.TraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#traceString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceString(ru.hse.nml.grammar.NmlParser.TraceStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#traceVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceVars(ru.hse.nml.grammar.NmlParser.TraceVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#traceVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraceVar(ru.hse.nml.grammar.NmlParser.TraceVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memoryAddressDCol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryAddressDCol(ru.hse.nml.grammar.NmlParser.MemoryAddressDColContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memoryAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryAddress(ru.hse.nml.grammar.NmlParser.MemoryAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#memTypePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemTypePart(ru.hse.nml.grammar.NmlParser.MemTypePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#operatorArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorArith(ru.hse.nml.grammar.NmlParser.OperatorArithContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#operatorCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCompare(ru.hse.nml.grammar.NmlParser.OperatorCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ru.hse.nml.grammar.NmlParser#numberExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(NmlParser.NumberExprContext ctx);
}