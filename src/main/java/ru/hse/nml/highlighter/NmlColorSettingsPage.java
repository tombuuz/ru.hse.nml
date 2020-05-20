package ru.hse.nml.highlighter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.icon.NmlIcons;

import javax.swing.*;
import java.util.Map;

/*
 * The properties of this class will be shown at "Preferences | Editor | Color Scheme"
 */
public class NmlColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("String", NmlSyntaxHighlighter.STRING),
            new AttributesDescriptor("Block Comment", NmlSyntaxHighlighter.COMMENT_BLOCK),
            new AttributesDescriptor("Line Comment", NmlSyntaxHighlighter.COMMENT_LINE),
            new AttributesDescriptor("Identifier", NmlSyntaxHighlighter.ID),
            new AttributesDescriptor("Number", NmlSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Keyword", NmlSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Operation Sign", NmlSyntaxHighlighter.OPERATION_SIGN),
            new AttributesDescriptor("Comma", NmlSyntaxHighlighter.COMMA),
            new AttributesDescriptor("Parentheses", NmlSyntaxHighlighter.PARENTHESES),
            new AttributesDescriptor("Brackets", NmlSyntaxHighlighter.BRACKETS),
            new AttributesDescriptor("FUNCTION CALL", NmlSyntaxHighlighter.FUNCTION_CALL),
            new AttributesDescriptor("LABEL", NmlSyntaxHighlighter.LABEL)
};

    @Nullable
    @Override
    public Icon getIcon() {
        return NmlIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new NmlSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "demo text will be here";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "nML";
    }
}
