package ru.hse.nml;


import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import ru.hse.nml.grammar.NmlLexer;

import java.util.List;

public class NmlTokenType {
    public static IElementType BAD_TOKEN_TYPE = new IElementType("BAD_TOKEN", NmlLanguage.INSTANCE);

    public static final List<TokenIElementType> TOKEN_ELEMENT_TYPES =
            PSIElementTypeFactory.getTokenIElementTypes(NmlLanguage.INSTANCE);
    public static final List<RuleIElementType> RULE_ELEMENT_TYPES =
            PSIElementTypeFactory.getRuleIElementTypes(NmlLanguage.INSTANCE);

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

    public static final TokenSet KEYWORDS =
            PSIElementTypeFactory.createTokenSet(
                    NmlLanguage.INSTANCE
            );

    public static final TokenSet STRING =
            PSIElementTypeFactory.createTokenSet(
                    NmlLanguage.INSTANCE,
                    NmlLexer.STRING_LITERAL
            );
}
