package ru.hse.nml.psiG;

import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public abstract class NmlElementNodeG extends LeafPsiElement implements PsiNamedElement {
    public NmlElementNodeG(@NotNull IElementType type, CharSequence text) {
        super(type, text);
    }
}
