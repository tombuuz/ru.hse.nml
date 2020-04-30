package ru.hse.nml;

import com.intellij.lang.ASTFactory;
import com.intellij.psi.tree.IElementType;
import ru.hse.nml.grammar.NmlParser;
import ru.hse.nml.psi.declarationNode;

import java.util.HashMap;
import java.util.Map;

public class NmlASTFactory extends ASTFactory {
    private static final Map<IElementType, PsiElementFactory> ruleElementTypeToPsiFactory = new HashMap<>();
    static {
            ruleElementTypeToPsiFactory.put(NmlTokenType.RULE_ELEMENT_TYPES.get(NmlParser.RULE_declaration), declarationNode.Factory.INSTANCE);
    }


}
