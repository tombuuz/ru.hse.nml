package ru.hse.nml.completion;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import ru.hse.nml.NmlLanguage;
import ru.hse.nml.icon.NmlIcons;

public class NmlCompletionContributor extends CompletionContributor {

    private static final String[] FUNCTIONS;
    private static final String[] CONDITIONS;

    static {
        FUNCTIONS = new String[] {"sign_extend", "zero_extend", "coerce",
                                    "cast", "int_to_float", "float_to_int",
                                    "float_to_float",
                                    "format", "trace", "exception", "mark",
                                    "unpredicted", "undefined", "assert",
                                    "function", "shared", "@rev"};
        CONDITIONS = new String[] {"if", "then", "else", "elif", "endif", "return"};


    }





    public NmlCompletionContributor() {
        extend( CompletionType.BASIC,
                PlatformPatterns.psiElement().withLanguage(NmlLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(CompletionParameters parameters,
                                               ProcessingContext context,
                                               CompletionResultSet resultSet) {

                        for (String keyword : FUNCTIONS) {
                            resultSet.addElement(LookupElementBuilder.create(keyword)
                                    .withIcon(NmlIcons.FUNCTION)
                                    .withTypeText("keyword")
                            );
                        }
                        resultSet.addElement(LookupElementBuilder.create("let").withIcon(NmlIcons.LET).withTypeText("keyword"));
                        resultSet.addElement(LookupElementBuilder.create("type").withIcon(NmlIcons.TYPE).withTypeText("keyword"));
                        resultSet.addElement(LookupElementBuilder.create("mem").withIcon(NmlIcons.MEM).withTypeText("keyword"));
                        resultSet.addElement(LookupElementBuilder.create("reg").withIcon(NmlIcons.REG).withTypeText("keyword"));
                        resultSet.addElement(LookupElementBuilder.create("var").withIcon(NmlIcons.VAR).withTypeText("keyword"));
                        resultSet.addElement(LookupElementBuilder.create("mode").withIcon(NmlIcons.MODE).withTypeText("keyword"));
                        resultSet.addElement(LookupElementBuilder.create("op").withIcon(NmlIcons.OP).withTypeText("keyword"));

                    }
                }
        );
    }
}
