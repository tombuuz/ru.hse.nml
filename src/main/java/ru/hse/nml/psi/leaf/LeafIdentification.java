package ru.hse.nml.psi.leaf;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.grammar.NmlLexer;
import ru.hse.nml.NmlTypes;

public class LeafIdentification extends TemplateIdentification {
    public LeafIdentification(@NotNull IElementType type, CharSequence text) {
        super(type, text);
    }

    @Override
    public IElementType getRuleRefType() {
         return NmlTypes.TOKEN_ELEMENT_TYPES.get(NmlLexer.ID);
    }

/*    @Override
    public PsiReference getReference() {
        return new GrammarElementRef(this, getText());
    }*/
}
