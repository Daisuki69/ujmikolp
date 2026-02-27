package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class TriToggleableComposeCallback implements Function0<Object>, ToggleableDataProvider {
    public static final int $stable = 0;
    private final Function0<Object> source;
    private final ToggleableState state;

    public TriToggleableComposeCallback(Function0<? extends Object> source, ToggleableState state) {
        j.g(source, "source");
        j.g(state, "state");
        this.source = source;
        this.state = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return this.source.invoke();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public String providesSourceName() {
        return this.source.getClass().getName();
    }

    @Override // com.dynatrace.android.compose.ToggleableDataProvider
    public ToggleableState providesToggleableState() {
        return this.state;
    }
}
