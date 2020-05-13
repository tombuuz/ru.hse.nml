package ru.hse.nml.psiOld;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class SingleDeclaration extends ASTWrapperPsiElement implements PsiNamedElement{
    public SingleDeclaration(@NotNull ASTNode node) {
        super(node);
    }
}
