package ru.hse.nml.structureView;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.icon.NmlIcons;
import ru.hse.nml.psi.ruleNode.NodeRuleType;

import javax.swing.*;

public class NmlItemPresentationType implements ItemPresentation {

    protected final PsiElement element;

    protected NmlItemPresentationType(PsiElement element) {
        this.element = element;
    }

    @Nullable
    @Override
    public String getPresentableText() {
        if(element instanceof NodeRuleType){
            return ((NodeRuleType) element).getId().getText();
        }
        return "n/a";
    }

    @Nullable
    @Override
    public String getLocationString() {
        return null;
    }

    @Nullable
    @Override
    public Icon getIcon(boolean unused) {
        return NmlIcons.FILE;
    }
}
