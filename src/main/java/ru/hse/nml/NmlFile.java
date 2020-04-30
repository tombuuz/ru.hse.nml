package ru.hse.nml;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class NmlFile extends PsiFileBase {

    public NmlFile(@NotNull FileViewProvider viewProvider) {
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

}
