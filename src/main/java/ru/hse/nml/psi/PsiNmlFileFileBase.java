package ru.hse.nml.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.NmlFileType;
import ru.hse.nml.icon.NmlIcons;
import ru.hse.nml.NmlLanguage;

import javax.swing.*;

public class PsiNmlFileFileBase extends PsiFileBase implements ScopeNode {

    public PsiNmlFileFileBase(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NmlFileType.INSTANCE;
    }

    @Override
    public String toString(){
        return "nML grammar file";
    }

    @Override
    public Icon getIcon(int flags) {
        return NmlIcons.FILE;
    }

    /**
     * Return null since a file scope has no enclosing scope. It is
     * not itself in a scope.
     */
    @Override
    public ScopeNode getContext(){
        return null;
    }

    /**
     * CallSubtree is instance of ANTLRPsiNode
     */
    @Nullable
    @Override
    public PsiElement resolve(PsiNamedElement element) {
        return null;    }
}
