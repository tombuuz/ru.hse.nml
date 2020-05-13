package ru.hse.nml.psiG;

import com.intellij.lang.ASTNode;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public class PsiNmlElementG extends ANTLRPsiNode {
    public PsiNmlElementG(@NotNull ASTNode node) {
        super(node);
    }
}
