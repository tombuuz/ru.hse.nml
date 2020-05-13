package ru.hse.nml.psiG;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.util.IconLoader;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import org.antlr.intellij.adaptor.psi.ScopeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.NmlFileType;
import ru.hse.nml.NmlLanguage;
import ru.hse.nml.icon.NmlIcons;

import javax.swing.*;

public class NmlFileBaseG extends PsiFileBase{

    protected NmlFileBaseG(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, NmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return NmlFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "nML Language file";
    }

    @Override
    public Icon getIcon(int flags) {
        return IconLoader.getIcon("/icons/icon.png");
    }

    /**
     * Return null since a file scope has no enclosing scope. It is
     * not itself in a scope.
     *
     * todo: a file could be in the scope of all the other files in the project
     */
    @Override
    public ScopeNode getContext() {
        return null;
    }

    @NotNull
    @Override
    public PsiElement[] getChildren() {
        return super.getChildren();
    }


}
