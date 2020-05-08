package ru.hse.nml.structureView;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.psiOldOld.PsiNmlFileFileBase;
import ru.hse.nml.psi.ruleNode.NodeRuleLet;

public class NmlStructureViewModel extends StructureViewModelBase implements StructureViewModel.ElementInfoProvider {

    PsiNmlFileFileBase rootElement;
    public NmlStructureViewModel(@NotNull PsiNmlFileFileBase psiFile/*, @Nullable Editor editor, @NotNull StructureViewTreeElement root*/) {
        super(psiFile, new NmlStructureViewElement(psiFile));
        this.rootElement = psiFile;
    }

    @NotNull
    @Override
    public StructureViewTreeElement getRoot() {
        return new NmlStructureViewElement(rootElement);
    }

    @Override
    protected PsiFile getPsiFile() {
        return rootElement;
    }

    @NotNull
    public Sorter[] getSorters() {
        return new Sorter[]{Sorter.ALPHA_SORTER};
    }

    @Override
    public boolean isAlwaysShowsPlus(StructureViewTreeElement element) {
        Object value = element.getValue();
        return value instanceof PsiNmlFileFileBase;
    }

    @Override
    public boolean isAlwaysLeaf(StructureViewTreeElement element) {
        return !isAlwaysShowsPlus(element);
    }

    @NotNull
    protected Class[] getSuitableClasses() {
        return new Class[] {PsiNmlFileFileBase.class,
                NodeRuleLet.class};
    }

}
