package ru.hse.nml;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.hse.nml.icon.NmlIcons;

import javax.swing.*;


public class NmlFileType extends LanguageFileType {

    public static final NmlFileType INSTANCE = new NmlFileType();

    private NmlFileType(){
        super(NmlLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "nML";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "nML language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "nml";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return NmlIcons.FILE;
    }
}
