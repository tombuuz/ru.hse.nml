package ru.hse.nml;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.grammar.NmlLexer;

public class NmlSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey STRING =
            TextAttributesKey.createTextAttributesKey("NML_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT_BLOCK =
            TextAttributesKey.createTextAttributesKey("NML_COMMENT_BLOCK", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey COMMENT_LINE =
            TextAttributesKey.createTextAttributesKey("NML_COMMENT_LINE", DefaultLanguageHighlighterColors.LINE_COMMENT);

    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    /*
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT_BLOCK, COMMENT_LINE};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
     */



    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        NmlLexer lexer = new NmlLexer(null);
        return new NmlLexerAdaptor(lexer);
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if ( !(tokenType instanceof TokenIElementType)) return EMPTY_KEYS;

        TokenIElementType myType = (TokenIElementType)tokenType;
        int type = myType.getANTLRTokenType();
        TextAttributesKey attrKey;
        switch (type) {
            case NmlLexer.STRING_LITERAL:
                attrKey = STRING;
                break;
            default:
                return EMPTY_KEYS;
        }
        return new TextAttributesKey[]{attrKey};

        /*
        if (tokenType == NmlTokenType.TOKEN_ELEMENT_TYPES.get(NmlLexer.BLOCK_COMMENT)){
            return COMMENT_KEYS;
        } else if (tokenType == NmlTokenType.TOKEN_ELEMENT_TYPES.get(NmlLexer.LINE_COMMENT)){
            return COMMENT_KEYS;
        } else if (tokenType == NmlTokenType.TOKEN_ELEMENT_TYPES.get(NmlLexer.STRING_LITERAL)){
            return STRING_KEYS;
        }
        else{
            return EMPTY_KEYS;
        }
         */
    }
}
