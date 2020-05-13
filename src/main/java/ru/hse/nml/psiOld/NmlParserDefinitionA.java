package ru.hse.nml.psiOld;

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
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.NmlLanguage;
import ru.hse.nml.NmlLexer;
import ru.hse.nml.NmlParser;
import ru.hse.nml.psi.PsiNmlFileBase;

public class NmlParserDefinitionA implements ParserDefinition {
    public static final IFileElementType FILE =
            new IFileElementType(NmlLanguage.INSTANCE);

    public NmlParserDefinitionA(){
        PSIElementTypeFactory.defineLanguageIElementTypes(
                NmlLanguage.INSTANCE,
                NmlLexer.tokenNames,
                NmlParser.ruleNames
        );
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

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        NmlLexer lexer = new NmlLexer(null);
        return new ANTLRLexerAdaptor(NmlLanguage.INSTANCE, lexer);
    }

    @Override
    public PsiParser createParser(Project project) {
        return new ANTLRParserAdaptor(NmlLanguage.INSTANCE, new ru.hse.nml.NmlParser(null)) {
            @Override
            protected ParseTree parse(Parser parser, IElementType root) {
                if (root instanceof IFileElementType) {
                    return ((ru.hse.nml.NmlParser) parser).specification();
                }
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
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
    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITESPACES;
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return NmlASTFactory.createInternalParseTreeNode(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new PsiNmlFileBase(viewProvider);
    }
}
