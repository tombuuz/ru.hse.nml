package ru.hse.nml.psiNew;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import org.antlr.intellij.adaptor.psi.ANTLRPsiLeafNode;
import org.antlr.intellij.adaptor.psi.Trees;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.NmlLanguage;
import ru.hse.nml.NmlParserDefinitionOld;

public class IdentificationNodeAbstract extends ANTLRPsiLeafNode implements PsiNamedElement {

    private final IElementType idElementType;

    public IdentificationNodeAbstract(IElementType type, CharSequence text) {
        super(type, text);
        this.idElementType = type;
    }


    @Override
    public String getName() {
        return getText();
    }

    @Override
    public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
        if ( getParent()==null ) return this; // weird but it happened once
		/*
		IElementType elType = getParent().getNode().getElementType();
		String kind = "??? ";
		if ( elType instanceof RuleIElementType ) {
			int ruleIndex = ((RuleIElementType) elType).getRuleIndex();
			if ( ruleIndex == RULE_call_expr ) {
				kind = "call ";
			}
			else if ( ruleIndex == RULE_statement ) {
				kind = "assign ";
			}
			else if ( ruleIndex == RULE_function ) {
				kind = "func def ";
			}
		}
		System.out.println("IdentifierPSINode.setName("+name+") on "+
			                   kind+this+" at "+Integer.toHexString(this.hashCode()));
		*/
        PsiElement newID = Trees.createLeafFromText(getProject(),
                NmlLanguage.INSTANCE,
                getContext(),
                name,
                NmlParserDefinitionOld.ID);
        if ( newID!=null ) {
            return this.replace(newID); // use replace on leaves but replaceChild on ID nodes that are part of defs/decls.
        }
        return this;    }
}
