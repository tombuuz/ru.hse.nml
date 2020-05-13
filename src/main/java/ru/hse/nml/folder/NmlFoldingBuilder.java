package ru.hse.nml.folder;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.CustomFoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.jetbrains.annotations.NotNull;
import ru.hse.nml.NmlLexer;
import ru.hse.nml.NmlTypes;
import ru.hse.nml.psi.PsiNmlFileBase;
import ru.hse.nml.psi.MyPsiUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NmlFoldingBuilder extends CustomFoldingBuilder {

    private static final TokenIElementType BLOCK_COMMENT_TOKEN = NmlTypes.getTokenElementType(NmlLexer.BLOCK_COMMENT);
    private static final TokenIElementType BRACES_TOKEN = NmlTypes.getTokenElementType(NmlLexer.LBRACE);

    private static final TokenIElementType LBRACE = NmlTypes.getTokenElementType(NmlLexer.LBRACE);
    private static final TokenIElementType RBRACE = NmlTypes.getTokenElementType(NmlLexer.RBRACE);


    @Override
    protected void buildLanguageFoldRegions(@NotNull List<FoldingDescriptor> descriptors,
                                            @NotNull PsiElement root,
                                            @NotNull Document document,
                                            boolean quick) {

        if (root instanceof PsiNmlFileBase){

            addCommentDescriptors(descriptors, root);
            addBraceDescriptors(descriptors, root);

        }
    }

    private void addBraceDescriptors(List<FoldingDescriptor> descriptors, PsiElement root) {

    }


    private void addCommentDescriptors(List<FoldingDescriptor> descriptors, PsiElement root) {
        Set<PsiElement> processedComments = new HashSet<PsiElement>();
        for (PsiElement comment : MyPsiUtils.findChildrenOfType(root, NmlTypes.COMMENTS)) {
            IElementType type = comment.getNode().getElementType();
            if (type == BLOCK_COMMENT_TOKEN) {
                descriptors.add(new FoldingDescriptor(comment, comment.getTextRange()));
            }
        }
    }

    @Override
    protected String getLanguagePlaceholderText(@NotNull ASTNode node, @NotNull TextRange range) {
        return null;
    }

    @Override
    protected boolean isRegionCollapsedByDefault(@NotNull ASTNode node) {
        return false;
    }
}
