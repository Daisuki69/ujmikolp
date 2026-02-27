package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class WrappingToggleableComposeCallback implements Function0<Object>, ToggleableDataProvider {
    public static final int $stable = 0;
    private final boolean checked;
    private final Function0<Object> function;
    private final Function1<Object, Object> source;

    public WrappingToggleableComposeCallback(Function0<? extends Object> function, Function1<Object, ? extends Object> source, boolean z4) {
        j.g(function, "function");
        j.g(source, "source");
        this.function = function;
        this.source = source;
        this.checked = z4;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.function.invoke();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public String providesSourceName() {
        return this.source.getClass().getName();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public ToggleableState providesToggleableState() {
        return ToggleableStateKt.ToggleableState(this.checked);
    }
}
