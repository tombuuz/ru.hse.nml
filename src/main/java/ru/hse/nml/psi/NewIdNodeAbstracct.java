package ru.hse.nml.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.psiNew.MyPsiUtils;

public abstract class NewIdNodeAbstracct extends LeafPsiElement implements PsiNamedElement {

    protected String name = null;

    public NewIdNodeAbstracct(@NotNull IElementType type, CharSequence text) {
        super(type, text);
    }

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
        this.replace(MyPsiUtils.createLeafFromText(getProject(),
                getContext(),
                name, getRuleRefType()));
        this.name = name;
        return this;
    }

    public abstract IElementType getRuleRefType();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + getElementType().toString() + ")";
    }
}
