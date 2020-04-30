package ru.hse.nml;

import com.intellij.lang.Language;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.v4.runtime.Lexer;
import ru.hse.nml.grammar.NmlLexer;

import java.io.Reader;

public class NmlLexerAdaptor extends ANTLRLexerAdaptor {

    /**
     * Constructs a new instance of {@link ANTLRLexerAdaptor} with
     * the specified {@link Language} and underlying ANTLR {@link
     * Lexer}.
     *
     * @param language The language.
     * @param lexer    The underlying ANTLR lexer.
     */
    public NmlLexerAdaptor(NmlLexer lexer) {
        super(NmlLanguage.INSTANCE, lexer);
    }


}
