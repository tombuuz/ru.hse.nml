package ru.hse.nml.psiG;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;

/**
 * This interface supports constructing a {@link PsiElement} from an {@link ASTNode}.
 */
public interface PsiElementFactoryG {
    PsiElement createElement(ASTNode node);
}
