package ru.hse.nml.psi.ruleNode;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;

public class NodeDeclare extends ASTWrapperPsiElement {
    public NodeDeclare(@NotNull ASTNode node) {
        super(node);
    }
}
