package ru.hse.nml.reference;

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.psi.leaf.LeafIdentification;
import ru.hse.nml.psi.leaf.LeafIdentificationRef;
import ru.hse.nml.psi.leaf.TemplateIdentification;
import ru.hse.nml.psi.ruleNode.NodeDeclare;
import ru.hse.nml.psiOld.NodeLetDef;

public class NmlReferenceContributor  extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(PsiReferenceRegistrar registrar) {
        PsiReferenceProvider provider = new PsiReferenceProvider() {
            @NotNull
            @Override
            public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                         @NotNull ProcessingContext context)
            {
                NodeLetDef ruleRef = (NodeLetDef) element;
                LeafIdentificationRef ref = new LeafIdentificationRef((TemplateIdentification) element, ruleRef.getText());
                return new PsiReference[]{ref};
            }
        };
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(LeafIdentification.class),
                provider);

    }
}
