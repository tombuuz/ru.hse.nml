package ru.hse.nml.psiG;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import org.antlr.intellij.adaptor.psi.IdentifierDefSubtree;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NodeTypeDefG extends IdentifierDefSubtree {
    public NodeTypeDefG(@NotNull ASTNode node, @NotNull IElementType idElementType) {
        super(node, idElementType);
    }
}
