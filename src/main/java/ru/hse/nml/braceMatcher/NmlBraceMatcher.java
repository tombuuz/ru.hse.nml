package ru.hse.nml.braceMatcher;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.grammar.NmlLexer;
import ru.hse.nml.NmlTypes;

/**
 * Description: Helps to automatically close braces.
 * todo: In arrows part, we assumed comparing operators as arrows. Need to add arrows in grammar and change it.
 */
public class NmlBraceMatcher implements PairedBraceMatcher {

    private final BracePair parens = new BracePair(
            NmlTypes.getTokenElementType(NmlLexer.LPAREN),
            NmlTypes.getTokenElementType(NmlLexer.RPAREN),
            true
    );
    private final BracePair bracks = new BracePair(
            NmlTypes.getTokenElementType(NmlLexer.LBRACK),
            NmlTypes.getTokenElementType(NmlLexer.RBRACK),
            true
    );
    private final BracePair braces = new BracePair(
            NmlTypes.getTokenElementType(NmlLexer.LBRACE),
            NmlTypes.getTokenElementType(NmlLexer.RBRACE),
            true
    );
    private final BracePair arrows = new BracePair(
            NmlTypes.getTokenElementType(NmlLexer.LE),
            NmlTypes.getTokenElementType(NmlLexer.GRE),
            true
    );


    private final BracePair[] pairs = new BracePair[]{parens, braces, bracks /*arrows*/};

    @NotNull
    @Override
    public BracePair[] getPairs() {
        return pairs;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return openingBraceOffset;
    }
}
