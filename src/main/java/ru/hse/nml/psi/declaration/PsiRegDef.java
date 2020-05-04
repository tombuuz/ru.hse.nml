package ru.hse.nml.psi.declaration;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.psi.NmlElementType;
import ru.hse.nml.psi.PsiNmlElement;

public class PsiRegDef extends PsiNmlElement {

    public PsiRegDef(@NotNull ASTNode node) {
        super(node);
    }
}
