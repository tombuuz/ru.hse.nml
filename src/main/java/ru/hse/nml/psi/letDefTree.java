package ru.hse.nml.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.SymtabUtils;
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.NmlLanguage;

public class letDefTree extends IdentifierDefSubtree implements ScopeNode {

    public letDefTree(@NotNull ASTNode node, @NotNull IElementType idElementType) {
        super(node, idElementType);
    }

    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
        return SymtabUtils.resolve(this, NmlLanguage.INSTANCE, element,
                "/declaration/lefDef/ID");
    }
}
