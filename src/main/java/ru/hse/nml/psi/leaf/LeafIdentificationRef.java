package ru.hse.nml.psi.leaf;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.psi.ruleNode.NodeDeclare;
import ru.hse.nml.psi.MyPsiUtils;

public class LeafIdentificationRef extends PsiReferenceBase<TemplateIdentification> {

        private TemplateIdentification psiElement;
        private String ruleName;

        public LeafIdentificationRef(@NotNull TemplateIdentification element, String type) {
            super(element, new TextRange(0, type.length()));
            this.psiElement = element;
            this.ruleName = type;
        }

        /** Called upon jump to*/
        @Nullable
        @Override
        public PsiElement resolve() {
            /*
            PsiFile tokenVocabFile = TokenVocabResolver.resolveTokenVocabFile(getElement());

            if (tokenVocabFile != null) {
                return tokenVocabFile;
            }

            PsiFile importedFile = ImportResolver.resolveImportedFile(getElement());
            if ( importedFile!=null ) {
                return importedFile;
            }*/

            NodeDeclare grammar = PsiTreeUtil.getContextOfType(getElement(), NodeDeclare.class);
            PsiElement specNode = MyPsiUtils.findSpecNode(grammar, ruleName);

            if (specNode != null) {
                return specNode;
            }

            /*
            // Look for a rule defined in an imported grammar
            specNode = ImportResolver.resolveInImportedFiles(getElement().getContainingFile(), ruleName);

            if (specNode != null) {
                return specNode;
            }

            // Look for a lexer rule in the tokenVocab file if it exists
            if (getElement() instanceof LexerRuleRefNode) {
                return TokenVocabResolver.resolveInTokenVocab(getElement(), ruleName);
            }*/

            return null;
        }


        /** Using for completion. Returns list of rules and tokens; the prefix
         *  of current element is used as filter by IDEA later.
         */
        @NotNull
        @Override
        public Object[] getVariants() {
            String prefix = myElement.getText();
            NodeDeclare rules = PsiTreeUtil.getContextOfType(myElement, NodeDeclare.class);
            return new String[]{rules.getText()};

/*            // find all(token, parser)
            Collection<? extends TemplateNodeRuleLet> ruleSpecNodes =
                    PsiTreeUtil.findChildrenOfAnyType(rules,
                            new Class[] {
                                    NodeRuleLet.class}
                    );
            return ruleSpecNodes.toArray();
*/
        }
}
