package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import qj.o;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ Function1<Editable, Unit> $afterTextChanged;
    final /* synthetic */ o $beforeTextChanged;
    final /* synthetic */ o $onTextChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public TextViewKt$addTextChangedListener$textWatcher$1(Function1<? super Editable, Unit> function1, o oVar, o oVar2) {
        this.$afterTextChanged = function1;
        this.$beforeTextChanged = oVar;
        this.$onTextChanged = oVar2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6));
    }
}
