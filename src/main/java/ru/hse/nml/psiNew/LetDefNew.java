package ru.hse.nml.psiNew;

import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree;
import org.jetbrains.annotations.NotNull;

public class LetDefNew extends IdentifierDefSubtree {
    public LetDefNew(@NotNull ASTNode node, @NotNull IElementType idElementType) {
        super(node, idElementType);
    }
}
