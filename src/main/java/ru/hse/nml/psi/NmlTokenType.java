package ru.hse.nml.psi;

        import com.intellij.psi.tree.IElementType;
        import ru.hse.nml.NmlLanguage;
        import org.jetbrains.annotations.*;

public class NmlTokenType extends IElementType{

    public NmlTokenType(@NotNull @NonNls String debugName){
        super(debugName, NmlLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "NmlTokenType." + super.toString();
    }
}
