package ru.hse.nml.structureViewNew;

import com.intellij.ide.projectView.PresentationData;
import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.SortableTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.NavigatablePsiElement;
import org.jetbrains.annotations.NotNull;

public class NmlStructureViewElementNew implements StructureViewTreeElement, SortableTreeElement {
    private final NavigatablePsiElement myElement;

    public NmlStructureViewElementNew(NavigatablePsiElement element){
        this.myElement = element;
    }

    @Override
    public Object getValue() {
        return myElement;
    }

    @Override
    public void navigate(boolean requestFocus) {
        myElement.navigate(requestFocus);
    }

    @Override
    public boolean canNavigate() {
        return myElement.canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return myElement.canNavigateToSource();
    }

    @NotNull
    @Override
    public String getAlphaSortKey() {
        String name = myElement.getName();
        return name != null ? name : "";
    }


    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        ItemPresentation presentation = myElement.getPresentation();
        return presentation != null ? presentation : new PresentationData();
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        return null;
/*
        if (myElement instanceof PsiNmlFileBase) {
            List<TreeElement> treeElements = new ArrayList<>(5);
            for(int i = 0; i < 5; i++){
                treeElements.add(new TreeElement() {
                    @NotNull
                    @Override
                    public ItemPresentation getPresentation() {
                        return new ItemPresentation() {
                            @Nullable
                            @Override
                            public String getPresentableText() {
                                return "presentable";
                            }

                            @Nullable
                            @Override
                            public String getLocationString() {
                                return "locate";
                            }

                            @Nullable
                            @Override
                            public Icon getIcon(boolean unused) {
                                return NmlIcons.FUNCTION;
                            }
                        };
                    }

                    @NotNull
                    @Override
                    public TreeElement[] getChildren() {
                        return new TreeElement[0];
                    }
                });
            }
            return treeElements.toArray(new TreeElement[treeElements.size()]);
        }
        return EMPTY_ARRAY;
*/


/*        if (myElement instanceof PsiNmlFileBase) {
            List<LeafIdentification> properties = PsiTreeUtil.getChildrenOfTypeAsList(myElement, LeafIdentification.class);
            List<TreeElement> treeElements = new ArrayList<>(properties.size());
            for (PsiElement property : properties) {
                treeElements.add(new NmlStructureViewElementNew((NavigatablePsiElement) property));
            }
            return treeElements.toArray(new TreeElement[0]);
        }
        return EMPTY_ARRAY;*/
    }






}
