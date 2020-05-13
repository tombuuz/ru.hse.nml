package ru.hse.nml.psi.ruleNode;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.NmlLexer;
import ru.hse.nml.NmlTypes;
import ru.hse.nml.psi.leaf.TemplateIdentification;

public class NodeRuleOp extends TemplateNodeRuleOp {

    public static final Logger LOG = Logger.getInstance("ru.hse.nml.psiGeneral.ruleNode.NodeRuleOp");

    public NodeRuleOp(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public IElementType getRuleRefType() {
        return NmlTypes.TOKEN_ELEMENT_TYPES.get(NmlLexer.OP);
    }

    @Nullable
    @Override
    public TemplateIdentification getId() {
        TemplateIdentification rr = PsiTreeUtil.getChildOfType(this, TemplateIdentification.class);
        if ( rr==null ) {
            LOG.error("can't find  child of "+this.getText(), (Throwable)null);
        }
        return rr;
    }
}
