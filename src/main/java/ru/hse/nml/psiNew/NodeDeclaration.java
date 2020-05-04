package ru.hse.nml.psiNew;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public class NodeDeclaration extends ASTWrapperPsiElement {

    public NodeDeclaration(@NotNull ASTNode node) {
        super(node);
    }

    public static class Factory implements PsiElementFactory{
        public static Factory INSTANCE = new Factory();

        @Override
        public PsiElement createElement(ASTNode node) {
            return new NodeDeclaration(node);
        }
    }
}
