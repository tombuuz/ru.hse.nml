package ru.hse.nml.psi.declaration;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.psi.NmlElementType;
import ru.hse.nml.psi.PsiNmlElement;

public class PsiOpDef extends PsiNmlElement {
    public PsiOpDef(@NotNull ASTNode node) {
        super(node);
    }
}
