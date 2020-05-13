package ru.hse.nml.psiOld;

import com.intellij.lang.Language;
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor;
import org.antlr.v4.runtime.Lexer;
import ru.hse.nml.NmlLanguage;
import ru.hse.nml.NmlLexer;

public class NmlLexerAdaptorA extends ANTLRLexerAdaptor {
    /**
     * Constructs a new instance of {@link ANTLRLexerAdaptor} with
     * the specified {@link Language} and underlying ANTLR {@link
     * Lexer}.
     *
     * @param language The language.
     * @param lexer    The underlying ANTLR lexer.
     */
    public NmlLexerAdaptorA(NmlLanguage language, NmlLexer lexer) {
        super(language, lexer);
    }


}
