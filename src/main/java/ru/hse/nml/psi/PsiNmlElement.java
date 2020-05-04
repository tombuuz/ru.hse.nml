package ru.hse.nml.psi;

import com.intellij.lang.ASTNode;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public abstract class PsiNmlElement extends ANTLRPsiNode {
    public PsiNmlElement(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return getNode().getElementType() + " - " + getText() + " - Location: " + getTextRange();
    }
}
