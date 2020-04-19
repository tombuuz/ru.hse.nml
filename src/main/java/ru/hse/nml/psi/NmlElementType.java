package ru.hse.nml.psi;

import com.intellij.psi.tree.IElementType;
import ru.hse.nml.NmlLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class NmlElementType extends IElementType{

    public NmlElementType(@NotNull @NonNls String debugName){
        super(debugName, NmlLanguage.INSTANCE);
    }
}
