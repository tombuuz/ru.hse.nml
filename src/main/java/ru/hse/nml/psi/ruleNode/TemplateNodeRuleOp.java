package ru.hse.nml.psi.ruleNode;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.psi.leaf.TemplateIdentification;
import ru.hse.nml.psi.MyPsiUtils;

public abstract class TemplateNodeRuleOp extends ASTWrapperPsiElement implements PsiNamedElement {

    protected String name = null;

    public TemplateNodeRuleOp(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String getName() {
        if ( name!=null ) return name;
        TemplateIdentification id = getId();
        if ( id!=null ) {
            return id.getText();
        }
        return "unknown-name";
    }

    @Nullable
    public abstract TemplateIdentification getId();

    @Override
    public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
		/*
		From doc: "Creating a fully correct AST node from scratch is
		          quite difficult. Thus, surprisingly, the easiest way to
		          get the replacement node is to create a dummy file in the
		          custom language so that it would contain the necessary
		          node in its parse tree, build the parse tree and
		          extract the necessary node from it.
		 */
//		System.out.println("rename "+this+" to "+name);
        TemplateIdentification id = getId();
        id.replace(MyPsiUtils.createLeafFromText(getProject(),
                getContext(),
                name, getRuleRefType()));
        this.name = name;
        return this;
    }

    public abstract IElementType getRuleRefType();



    @Override
    public void subtreeChanged() {
        super.subtreeChanged();
        name = null;
    }

    @Override
    public int getTextOffset() {
        TemplateIdentification id = getId();
        if ( id!=null ) return id.getTextOffset();
        return super.getTextOffset();
    }
}
