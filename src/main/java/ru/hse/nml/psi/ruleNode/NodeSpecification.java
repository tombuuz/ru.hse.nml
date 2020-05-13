package ru.hse.nml.psi.ruleNode;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class NodeSpecification extends ASTWrapperPsiElement {
    public NodeSpecification(@NotNull ASTNode node) {
        super(node);
    }
}
