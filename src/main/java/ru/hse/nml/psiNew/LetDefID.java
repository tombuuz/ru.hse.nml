package ru.hse.nml.psiNew;

import com.intellij.lang.ASTNode;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.psi.ANTLRPsiLeafNode;
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode;
import org.jetbrains.annotations.NotNull;

public class LetDefID extends ANTLRPsiNode {
    public LetDefID(@NotNull ASTNode node) {
        super(node);
    }
}
