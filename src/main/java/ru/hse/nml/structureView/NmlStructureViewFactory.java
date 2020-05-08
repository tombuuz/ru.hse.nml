package ru.hse.nml.structureView;

import com.intellij.ide.structureView.*;
import com.intellij.ide.structureView.impl.common.PsiTreeElementBase;
import com.intellij.lang.PsiStructureViewFactory;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.psiOldOld.PsiNmlFileFileBase;

import java.util.Collection;
import java.util.Collections;

public class NmlStructureViewFactory implements PsiStructureViewFactory {

    /** fake a blank Treeview with a warning */
    public static class DummyViewTreeElement extends PsiTreeElementBase<PsiElement> {
        public DummyViewTreeElement(PsiElement psiElement) {
            super(psiElement);
        }

        @NotNull
        @Override
        public Collection<StructureViewTreeElement> getChildrenBase() {
            return Collections.emptyList();
        }

        @Nullable
        @Override
        public String getPresentableText() {
            return "Sorry .g not supported (use .g4)";
        }
    }

    @Nullable
    @Override
    public StructureViewBuilder getStructureViewBuilder(final PsiFile psiFile) {
        return new TreeBasedStructureViewBuilder() {
            @NotNull
            @Override
            public StructureViewModel createStructureViewModel(@Nullable Editor editor) {
                VirtualFile grammarFile = psiFile.getVirtualFile();
                if ( grammarFile==null || !grammarFile.getName().endsWith(".nml") ) {
                    return new StructureViewModelBase(psiFile, new DummyViewTreeElement(psiFile));
                }
                return new NmlStructureViewModel((PsiNmlFileFileBase) psiFile);
            }
        };
    }
}
