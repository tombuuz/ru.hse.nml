package ru.hse.nml.structureView;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.navigation.NavigationItem;
import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.PsiRecursiveElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.psiOldOld.PsiNmlFileFileBase;
import ru.hse.nml.psi.ruleNode.NodeRuleLet;
import ru.hse.nml.psi.ruleNode.NodeRuleMem;
import ru.hse.nml.psi.ruleNode.NodeRuleOp;
import ru.hse.nml.psi.ruleNode.NodeRuleType;

import java.util.ArrayList;
import java.util.List;

public class NmlStructureViewElement implements StructureViewTreeElement, SortableTreeElement {
    private final PsiElement myElement;

    public NmlStructureViewElement(NavigatablePsiElement element){
        this.myElement = element;
    }

    @Override
    public Object getValue() {
        return myElement;
    }

    @Override
    public void navigate(boolean requestFocus) {
        if (myElement instanceof NavigationItem) {
            ((NavigationItem) myElement).navigate(requestFocus);
        }
    }
    @Override
    public boolean canNavigate() {
        return myElement instanceof NavigationItem &&
                ((NavigationItem)myElement).canNavigate();    }
    @Override
    public boolean canNavigateToSource() {
        return myElement instanceof NavigationItem &&
                ((NavigationItem)myElement).canNavigateToSource();
    }


    @NotNull
    @Override
    public String getAlphaSortKey() {
        return myElement instanceof PsiNamedElement ? ((PsiNamedElement) myElement).getName() : "";

    }
    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new NmlItemPresentation(myElement);
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        List<TreeElement> treeElements = new ArrayList<>();

        if (myElement instanceof PsiNmlFileFileBase) {
            new PsiRecursiveElementVisitor() {
                @Override
                public void visitElement(PsiElement element) {
                    if ( element instanceof NodeRuleLet
                            || element instanceof NodeRuleType
                            || element instanceof NodeRuleMem
                            || element instanceof NodeRuleOp) {
                        treeElements.add(new NmlStructureViewElement((NavigatablePsiElement)element));
                        return;
                    }
                    super.visitElement(element);
                }
            }.visitElement(myElement);
        } else if ( myElement instanceof NodeRuleLet ) {
            NodeRuleLet[] nodes = PsiTreeUtil.getChildrenOfType(myElement, NodeRuleLet.class);

            if ( nodes != null ) {
                for ( NodeRuleLet node : nodes ) {
                    treeElements.add(new NmlStructureViewElement(PsiTreeUtil.findChildOfType(node, NodeRuleLet.class)));
                }
            }
        } else if (myElement instanceof NodeRuleType) {
            NodeRuleType[] nodes = PsiTreeUtil.getChildrenOfType(myElement, NodeRuleType.class);

            if ( nodes != null ) {
                for ( NodeRuleType node : nodes ) {

                    treeElements.add(new NmlStructureViewElement(PsiTreeUtil.findChildOfType(node, NodeRuleType.class)));
                }
            }
        } else if (myElement instanceof NodeRuleMem) {
            NodeRuleMem[] nodes = PsiTreeUtil.getChildrenOfType(myElement, NodeRuleMem.class);

            if ( nodes != null ) {
                for ( NodeRuleMem node : nodes ) {
                    treeElements.add(new NmlStructureViewElement(PsiTreeUtil.findChildOfType(node, NodeRuleMem.class)));
                }
            }
        } else if (myElement instanceof NodeRuleOp) {
            NodeRuleOp[] nodes = PsiTreeUtil.getChildrenOfType(myElement, NodeRuleOp.class);

            if ( nodes != null ) {
                for ( NodeRuleOp node : nodes ) {
                    treeElements.add(new NmlStructureViewElement(PsiTreeUtil.findChildOfType(node, NodeRuleOp.class)));
                }
            }
        }
        return treeElements.toArray(new TreeElement[0]);
    }


}
