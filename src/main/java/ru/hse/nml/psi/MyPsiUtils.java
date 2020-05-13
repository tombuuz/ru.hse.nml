package ru.hse.nml.psi;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.impl.PsiFileFactoryImpl;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.util.PsiElementFilter;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.NmlLanguage;
import ru.hse.nml.NmlTypes;
import ru.hse.nml.NmlParser;
import ru.hse.nml.psi.leaf.TemplateIdentification;
import ru.hse.nml.psi.ruleNode.NodeDeclare;
import ru.hse.nml.psi.ruleNode.NodeRuleLet;
import ru.hse.nml.psi.ruleNode.TemplateNodeRuleLet;
import ru.hse.nml.psiOld.NodeLetDef;
import ru.hse.nml.psiOldOld.PsiNmlElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyPsiUtils {

    public static PsiElement createLeafFromText(Project project, PsiElement context,
                                                String text, IElementType type)
    {
        PsiFileFactoryImpl factory = (PsiFileFactoryImpl) PsiFileFactory.getInstance(project);
        PsiElement el = factory.createElementFromText(text,
                NmlLanguage.INSTANCE,
                type,
                context);
        return PsiTreeUtil.getDeepestFirst(el); // forces parsing of file!!
        // start rule depends on root passed in
    }

    /**
     * Non-recursive search for an element of type T amongst given {@code element} children.
     *
     * @param element a PSI element to start search from.
     * @param aClass  element type to search for.
     * @param <T>     element type to search for.
     * @return first found element, or null if nothing found.
     */
    @Nullable
    @Contract("null, _ -> null")
    public static <T extends PsiElement> T getChildOfType(@Nullable PsiElement element, @NotNull Class<T> aClass) {
        if (element == null) return null;
        for (PsiElement child = element.getFirstChild(); child != null; child = child.getNextSibling()) {
            if (aClass.isInstance(child)) {
                return aClass.cast(child);
            }
        }
        return null;
    }

    public static PsiElement findChildOfType(PsiElement root, final IElementType tokenType) {
        List<PsiElement> elems = new ArrayList<PsiElement>();
        for (PsiElement child : root.getChildren()) {
            if ( child.getNode().getElementType() == tokenType ) {
                return child;
            }
        }
        return null;
    }

    /**
     * Like PsiTreeUtil.findChildrenOfType, except no collection is created and it doesnt use recursion.
     * @param parent the element whose children will be searched
     * @param types the types to search for
     * @return an iterable that will traverse the psi tree depth-first, including only the elements
     * whose type is contained in the provided tokenset.
     */
    public static Iterable<PsiElement> findChildrenOfType(final PsiElement parent, final TokenSet types) {
        PsiElement[] psiElements = PsiTreeUtil.collectElements(parent, new PsiElementFilter() {
            @Override
            public boolean isAccepted(PsiElement input) {
                if ( input==null ) return false;
                ASTNode node = input.getNode();
                if ( node==null ) return false;
                return types.contains(node.getElementType());
            }
        });
        return Arrays.asList(psiElements);
    }


    public static String findTokenVocabIfAny(PsiNmlElement file) {
        String vocabName = null;
        PsiElement[] options = collectNodesWithName(file, "option");
        for (PsiElement o : options) {
            PsiElement[] tokenVocab = collectChildrenWithText(o, "tokenVocab");
            if ( tokenVocab.length>0 ) {
                PsiElement optionNode = tokenVocab[0].getParent();// tokenVocab[0] is id node
                PsiElement[] ids = collectChildrenOfType(optionNode, NmlTypes.RULE_ELEMENT_TYPES.get(NmlParser.RULE_declaration));
                vocabName = ids[0].getText();
            }
        }
        return vocabName;
    }

    /** Search all internal and leaf nodes looking for token or internal node
     *  with specific text.
     *  This saves having to create lots of java classes just to identify psi nodes.
     */
    public static PsiElement[] collectNodesWithName(PsiElement root, final String tokenText) {
        return PsiTreeUtil.collectElements(root, new PsiElementFilter() {
            @Override
            public boolean isAccepted(PsiElement element) {
                String tokenTypeName = element.getNode().getElementType().toString();
                return tokenTypeName.equals(tokenText);
            }
        });
    }

    public static PsiElement[] collectChildrenWithText(PsiElement root, final String text) {
        List<PsiElement> elems = new ArrayList<PsiElement>();
        for (PsiElement child : root.getChildren()) {
            if ( child.getText().equals(text) ) {
                elems.add(child);
            }
        }
        return elems.toArray(new PsiElement[elems.size()]);
    }

    public static PsiElement[] collectChildrenOfType(PsiElement root, final IElementType tokenType) {
        List<PsiElement> elems = new ArrayList<PsiElement>();
        for (PsiElement child : root.getChildren()) {
            if ( child.getNode().getElementType() == tokenType ) {
                elems.add(child);
            }
        }
        return elems.toArray(new PsiElement[elems.size()]);
    }


    /**
     * Finds the first {@link NodeRuleLet} and others matching the {@code ruleName} defined in
     * the given {@code grammar}.
     *
     * Rule specs can be either children of the {@link RulesNode}, or under one of the {@code mode}s defined in
     * the grammar. This means we have to walk the whole grammar to find matching candidates.
     */
    public static PsiElement findSpecNode(NodeDeclare grammar, final String ruleName) {
        PsiElementFilter definitionFilter = new PsiElementFilter() {
            @Override
            public boolean isAccepted(PsiElement element1) {
                if (!(element1 instanceof TemplateNodeRuleLet)) {
                    return false;
                }
                TemplateIdentification id = ((TemplateNodeRuleLet) element1).getId();
                return id != null && id.getText().equals(ruleName);
            }
        };

        PsiElement[] ruleSpec = PsiTreeUtil.collectElements(grammar, definitionFilter);
        if (ruleSpec.length > 0) {
            return ruleSpec[0];
        }
        return null;
    }

}
