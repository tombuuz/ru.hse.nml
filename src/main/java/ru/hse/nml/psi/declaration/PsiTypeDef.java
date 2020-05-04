package ru.hse.nml.psi.declaration;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.psi.PsiNmlElement;

public class PsiTypeDef extends PsiNmlElement {
    public PsiTypeDef(@NotNull ASTNode node) {
        super(node);
    }
}
