package ru.hse.nml.psiOld;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTFactory;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.psi.impl.source.tree.FileElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import ru.hse.nml.NmlParser;
import ru.hse.nml.NmlTypes;

import java.util.HashMap;
import java.util.Map;


public class NmlASTFactory extends ASTFactory {

    private static final Map<RuleIElementType, PsiElementFactory> ruleElementTypeToPsiFactory = new HashMap<>();

    static {
        ruleElementTypeToPsiFactory.put(NmlTypes.RULE_ELEMENT_TYPES.get(NmlParser.RULE_declaration), NodeDeclaration.Factory.INSTANCE);
        ruleElementTypeToPsiFactory.put(NmlTypes.RULE_ELEMENT_TYPES.get(NmlParser.RULE_letDef), NodeLetDef.Factory.INSTANCE);
/*        ruleElementTypeToPsiFactory.put(NmlTypes.RULE_ELEMENT_TYPES.get(NmlParser.RULE_typeDef),);
        ruleElementTypeToPsiFactory.put(NmlTypes.RULE_ELEMENT_TYPES.get(NmlParser.RULE_memDef),);
        ruleElementTypeToPsiFactory.put(NmlTypes.RULE_ELEMENT_TYPES.get(NmlParser.RULE_regDef),);
        ruleElementTypeToPsiFactory.put(NmlTypes.RULE_ELEMENT_TYPES.get(NmlParser.RULE_varDef),);
        ruleElementTypeToPsiFactory.put(NmlTypes.RULE_ELEMENT_TYPES.get(NmlParser.RULE_modeDef),);
        ruleElementTypeToPsiFactory.put(NmlTypes.RULE_ELEMENT_TYPES.get(NmlParser.RULE_opDef),);*/
    }


    /** Create a FileElement for root or a parse tree CompositeElement (not
     *  PSI) for the token. This impl is more or less the default.
     */
    @Override
    public CompositeElement createComposite(IElementType type) {
        if (type instanceof IFileElementType) {
            return new FileElement(type, null);
        }
        return new CompositeElement(type);
    }



    public static PsiElement createInternalParseTreeNode(ASTNode node) {
        PsiElement t;
        IElementType tokenType = node.getElementType();
        PsiElementFactory factory = ruleElementTypeToPsiFactory.get(tokenType);
        if (factory != null) {
            t = factory.createElement(node);
        }
        else {
            t = new ASTWrapperPsiElement(node);
        }
        return t;
    }
}
