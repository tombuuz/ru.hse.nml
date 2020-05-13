package ru.hse.nml.psiOld;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;

public class NodeLetDef extends SingleDeclaration {

    public NodeLetDef(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
        return null;
    }

    public static class Factory implements PsiElementFactory {
        public static NodeDeclaration.Factory INSTANCE = new NodeDeclaration.Factory();

        @Override
        public PsiElement createElement(ASTNode node) {
            return new NodeLetDef(node);
        }
    }
}
