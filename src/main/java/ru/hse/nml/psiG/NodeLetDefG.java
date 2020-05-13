package ru.hse.nml.psiG;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public class  NodeLetDefG extends ANTLRPsiNode{
    public NodeLetDefG(@NotNull ASTNode node) {
        super(node);
    }

    public static class FactoryG implements PsiElementFactoryG {
        public static FactoryG INSTANCE = new FactoryG();

        @Override
        public PsiElement createElement(ASTNode node) {
            return new NodeLetDefG(node);
        }
    }
}
