package ru.hse.nml.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.PsiElementFactory;

public class declarationNode extends ASTWrapperPsiElement {

    public declarationNode(@NotNull ASTNode node) {
        super(node);
    }

    public static class Factory implements PsiElementFactory{
        public static Factory INSTANCE = new Factory();

        @Override
        public PsiElement createElement(ASTNode node) {
            return new declarationNode(node);
        }
    }
}
