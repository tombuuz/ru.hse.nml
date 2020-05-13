package ru.hse.nml.structureView;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.icon.NmlIcons;
import ru.hse.nml.psi.ruleNode.NodeRuleLet;
import ru.hse.nml.psi.ruleNode.NodeRuleMem;
import ru.hse.nml.psi.ruleNode.NodeRuleOp;
import ru.hse.nml.psi.ruleNode.NodeRuleType;

import javax.swing.*;

public class NmlItemPresentation implements ItemPresentation {

    protected final PsiElement element;
    protected final Icon Icon;

    protected NmlItemPresentation(PsiElement element) {
        this.element = element;
        if (element instanceof NodeRuleLet){
            this.Icon = NmlIcons.LET;
        }
        else if(element instanceof NodeRuleType){
            this.Icon = NmlIcons.TYPE;
        }
        else if(element instanceof NodeRuleMem){
            this.Icon = NmlIcons.MEM;
        }
        else if(element instanceof NodeRuleOp){
            this.Icon = NmlIcons.OP;
        }
        else{
            this.Icon = NmlIcons.FILE;
        }
    }

    @Nullable
    public String getLocationString() {
        return null;
    }

    @Override
    public String getPresentableText() {
        if(element instanceof NodeRuleLet){
            return "let: " + ((NodeRuleLet) element).getId().getText();
        }
        else if(element instanceof NodeRuleType){
            return "type: " + ((NodeRuleType) element).getId().getText();
        }
        else if(element instanceof NodeRuleMem){
            return "mem: " + ((NodeRuleMem) element).getId().getText();
        }
        else if(element instanceof NodeRuleOp){
            return "op: " + ((NodeRuleOp) element).getId().getText();
        }
        return "n/a";
    }

    @Nullable
    public Icon getIcon(boolean open) {
        return Icon;
    }
}
