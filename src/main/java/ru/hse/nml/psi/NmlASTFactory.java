package ru.hse.nml.psi;

import com.intellij.lang.ASTFactory;
import com.intellij.lang.ParserDefinition;
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.psi.impl.source.tree.FileElement;
import com.intellij.psi.impl.source.tree.LeafElement;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.NmlLexer;
import ru.hse.nml.NmlTypes;
import ru.hse.nml.psi.leaf.LeafIdentification;

public class NmlASTFactory extends ASTFactory {

    /** Create an internal parse tree node. FileElement for root or a parse tree CompositeElement (not
     *  PSI) for the token.
     *  The FileElement is a parse tree node, which is converted to a PsiFile
     *  by {@link ParserDefinition#createFile}.
     */
    @NotNull
    @Override
    public CompositeElement createComposite(IElementType type) {
        if (type instanceof IFileElementType) {
            return new FileElement(type, null);
        }
        return new CompositeElement(type);
    }

    /** Create PSI nodes out of tokens so even parse tree sees them as such.
     *  Does not see whitespace tokens.
     */
    @Override
    public LeafElement createLeaf(IElementType type, CharSequence text) {
        LeafElement t;
        if ( type == NmlTypes.TOKEN_ELEMENT_TYPES.get(NmlLexer.ID) ) {
            t = new LeafIdentification(type, text);
        }
        else {
            t = new LeafPsiElement(type, text);

        }
        return t;
    }



}
