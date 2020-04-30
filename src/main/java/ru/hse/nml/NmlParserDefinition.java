package ru.hse.nml;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.grammar.NmlLexer;
import ru.hse.nml.grammar.NmlParser;

/** The general interface between IDEA and nML. */

public class NmlParserDefinition implements ParserDefinition {
    public static final IFileElementType FILE =
            new IFileElementType(NmlLanguage.INSTANCE);

//    public NmlParserDefinition(){
//        PSIElementTypeFactory.defineLanguageIElementTypes(
//                NmlLanguage.INSTANCE,
//                NmlLexer.tokenNames,
//                NmlParser.ruleNames
//        );
//    }

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        NmlLexer lexer = new NmlLexer(null);
        return new NmlLexerAdaptor(lexer);
    }

    @Override
    public PsiParser createParser(Project project) {
        return new NmlGrammarParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return NmlTokenType.WHITESPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return NmlTokenType.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return NmlTokenType.STRING;
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new NmlFile(viewProvider);
    }

    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return new ANTLRPsiNode(node);
    }
}
