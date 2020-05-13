package ru.hse.nml.findUsageProvider;

import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NmlFindUsageProvider implements FindUsagesProvider {
    @Override
    public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
        return true;
    }

    @Nullable
    @Override
    public String getHelpId(@NotNull PsiElement psiElement) {
        return null;
    }

    @NotNull
    @Override
    public String getType(@NotNull PsiElement element) {
        return null;
    }

    @NotNull
    @Override
    public String getDescriptiveName(@NotNull PsiElement element) {
        return null;
    }

    @NotNull
    @Override
    public String getNodeText(@NotNull PsiElement element, boolean useFullName) {
        return null;
    }
}
