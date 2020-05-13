package ru.hse.nml.psiG;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;

import ru.hse.nml.NmlLanguage;
import ru.hse.nml.NmlLexer;
import ru.hse.nml.NmlParser;
import ru.hse.nml.psi.PsiNmlFileBase;

import java.util.List;

/** The general interface between IDEA and nML. */

public class DefinitionTemp implements ParserDefinition {
    /**
     * Initialize AST ROOT file
     */
    public static final IFileElementType FILE =
            new IFileElementType(NmlLanguage.INSTANCE);

    /**
     * Set element types : ID, COMMENTS, WHITESPACES, STRING
     */
    public static TokenIElementType ID;

    static {
        PSIElementTypeFactory.defineLanguageIElementTypes(NmlLanguage.INSTANCE,
                NmlParser.tokenNames, NmlParser.ruleNames);
        List<TokenIElementType> tokenIElementTypes =
                PSIElementTypeFactory.getTokenIElementTypes(NmlLanguage.INSTANCE);
        ID = tokenIElementTypes.get(NmlLexer.ID);
    }

    public static final TokenSet COMMENTS =
            PSIElementTypeFactory.createTokenSet(
                    NmlLanguage.INSTANCE,
                    NmlLexer.BLOCK_COMMENT,
                    NmlLexer.LINE_COMMENT
            );
    public static final TokenSet WHITESPACES =
            PSIElementTypeFactory.createTokenSet(
                    NmlLanguage.INSTANCE,
                    NmlLexer.WS
            );
    public static final TokenSet STRING =
            PSIElementTypeFactory.createTokenSet(
                    NmlLanguage.INSTANCE,
                    NmlLexer.STRING_LITERAL
            );

    /**
     * Define lexer and parser (PSI tree).
     */
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        NmlLexer lexer = new NmlLexer(null);
        return new ANTLRLexerAdaptor(NmlLanguage.INSTANCE, lexer);
    }

    @Override
    public PsiParser createParser(Project project) {
        final NmlParser parser = new NmlParser(null);
        return new ANTLRParserAdaptor(NmlLanguage.INSTANCE, parser) {
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                return ((NmlParser) parser).specification();
            }
        };

    }

    /**
     * Get TokenSet of WhiteSpace, Comment, String which are automatically skipped by PsiBuilder.
     */
    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITESPACES;
    }
    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }
    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return STRING;
    }


    /**
     *
     */
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    /**
     * Create the root of PSI tree (a PsiFile).
     */
    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new PsiNmlFileBase(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    /**
     * Convert form NON-LEAF parse node (aka. AST) to PSI node.
     *
     * ANTLRPsiNode:
     *
     * RuleIElementType:
     *
     */
    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        IElementType elementType = node.getElementType();
        if( elementType instanceof TokenIElementType){
            return new ANTLRPsiNode(node);
        }
        if (!(elementType instanceof RuleIElementType)){
            return new ANTLRPsiNode(node);
        }
        return new ANTLRPsiNode(node);
        /*RuleIElementType ruleIElementType = (RuleIElementType) elementType;
        switch (ruleIElementType.getRuleIndex()){
            case NmlParser.RULE_letDef:
                return new PsiLetDef(node);
            case NmlParser.RULE_typeDef:
                return new PsiTypeDef(node);
            case NmlParser.RULE_memDef:
                return new PsiMemDef(node);
            case NmlParser.RULE_regDef:
                return new PsiRegDef(node);
            case NmlParser.RULE_varDef:
                return new PsiVarDef(node);
            case NmlParser.RULE_modeDef:
                return new PsiModeDef(node);
            case NmlParser.RULE_opDef:
                return new PsiOpDef(node);
            default:
                return new ASTWrapperPsiElement(node);
        }*/
    }
}
