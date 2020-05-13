package ru.hse.nml;

import com.intellij.lang.Language;

public class NmlLanguage extends Language {

    public static final NmlLanguage INSTANCE = new NmlLanguage();

    private NmlLanguage() {
        super("nML");
    }
}
