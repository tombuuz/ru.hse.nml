package ru.hse.nml.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.NmlLanguage;
import ru.hse.nml.grammar.NmlLexer;

public class NmlSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey ID =
            TextAttributesKey.createTextAttributesKey("NML_ID", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey STRING =
            TextAttributesKey.createTextAttributesKey("NML_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT_BLOCK =
            TextAttributesKey.createTextAttributesKey("NML_COMMENT_BLOCK", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey COMMENT_LINE =
            TextAttributesKey.createTextAttributesKey("NML_COMMENT_LINE", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey NUMBER =
            TextAttributesKey.createTextAttributesKey("NML_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey KEYWORD =
            TextAttributesKey.createTextAttributesKey("NML_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey OPERATION_SIGN =
            TextAttributesKey.createTextAttributesKey("NML_OPERATION_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey COMMA =
            TextAttributesKey.createTextAttributesKey("NML_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey PARENTHESES =
            TextAttributesKey.createTextAttributesKey("NML_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACKETS =
            TextAttributesKey.createTextAttributesKey("NML_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey FUNCTION_CALL =
            TextAttributesKey.createTextAttributesKey("NML_FUNCTION_CALL", DefaultLanguageHighlighterColors.FUNCTION_CALL);





    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    /*
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT_BLOCK, COMMENT_LINE};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
     */


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        NmlLexer lexer = new NmlLexer(null);
        return new ANTLRLexerAdaptor(NmlLanguage.INSTANCE, lexer);
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if ( !(tokenType instanceof TokenIElementType)) return EMPTY_KEYS;

        TokenIElementType myType = (TokenIElementType)tokenType;
        int type = myType.getANTLRTokenType();
        TextAttributesKey attrKey;
        switch (type) {
            case NmlLexer.ID:
                attrKey = ID;
                break;
            case NmlLexer.STRING_LITERAL:
                attrKey = STRING;
                break;
            case NmlLexer.BLOCK_COMMENT:
                attrKey = COMMENT_BLOCK;
                break;
            case NmlLexer.LINE_COMMENT:
                attrKey = COMMENT_LINE;
                break;
            case NmlLexer.NUMBER_LITERAL:
                attrKey = NUMBER;
                break;
            case NmlLexer.PLUS:
            case NmlLexer.MINUS:
            case NmlLexer.MUL:
            case NmlLexer.DIV:
            case NmlLexer.REM:
            case NmlLexer.DOUBLE_STAR:
            case NmlLexer.LEFT_SHIFT:
            case NmlLexer.RIGHT_SHIFT:
            case NmlLexer.ROTATE_LEFT:
            case NmlLexer.ROTATE_RIGHT:
                attrKey = OPERATION_SIGN;
                break;
            case NmlLexer.VAR:
            case NmlLexer.LET:
            case NmlLexer.TYPE:
            case NmlLexer.REG:
            case NmlLexer.MODE:
            case NmlLexer.OP:
            case NmlLexer.SYNTAX:
            case NmlLexer.IMAGE:
            case NmlLexer.ACTION:
            case NmlLexer.SIGN_EXTEND:
            case NmlLexer.ZERO_EXTEND:
            case NmlLexer.TRACE:
            case NmlLexer.CAST:
            case NmlLexer.CARD:
            case NmlLexer.COERCE:
            case NmlLexer.INT:
                attrKey = KEYWORD;
                break;
            case NmlLexer.COMMA:
                attrKey = COMMA;
                break;
            case NmlLexer.LPAREN:
            case NmlLexer.RPAREN:
                attrKey = PARENTHESES;
                break;
            case NmlLexer.LBRACE:
            case NmlLexer.RBRACE:
                attrKey = BRACKETS;
                break;
            default:
                return EMPTY_KEYS;
        }
        return new TextAttributesKey[]{attrKey};
    }
}
