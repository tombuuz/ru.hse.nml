package ru.hse.nml.psiOld;

import org.antlr.intellij.adaptor.lexer.ANTLRLexerState;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.misc.IntegerStack;
import org.jetbrains.annotations.Nullable;

public class NmlLexerStateA extends ANTLRLexerState {

    private final int currentRuleType;

    /**
     * Constructs a new instance of {@link ANTLRLexerState}
     * containing the mode and mode stack information for an ANTLR
     * lexer.
     *
     * @param mode      The current lexer mode, {@link Lexer#_mode}.
     * @param modeStack The lexer mode stack, {@link Lexer#_modeStack}, or {@code null} .
     */
    public NmlLexerStateA(int mode, @Nullable IntegerStack modeStack, int currentRuleType) {
        super(mode, modeStack);
        this.currentRuleType = currentRuleType;
    }

    public int getCurrentRuleType() {
        return currentRuleType;
    }

    @Override
    public void apply(Lexer lexer) {
        super.apply(lexer);

    }
}
