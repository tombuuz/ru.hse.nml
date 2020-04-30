package ru.hse.nml;

import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import ru.hse.nml.grammar.NmlParser;

public class NmlGrammarParser extends ANTLRParserAdaptor {
    /**
     * Create a jetbrains adaptor for an ANTLR parser object. When
     * the IDE requests a {@link #parse(IElementType, PsiBuilder)},
     * the token stream will be set on the parser.
     *
     * @param language
     * @param parser
     */
    public NmlGrammarParser() {
        super(NmlLanguage.INSTANCE, new NmlParser(null));
    }

    @Override
    protected ParseTree parse(Parser parser, IElementType root) {
        return null;
    }
}
