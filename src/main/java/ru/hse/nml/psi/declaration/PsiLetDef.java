package ru.hse.nml.psi.declaration;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.psi.PsiNmlElement;

public class PsiLetDef extends PsiNmlElement {
    public PsiLetDef(@NotNull ASTNode node) {
        super(node);
    }
}
