package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import wj.c;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class RangeSliderValueChangedCallback implements Function1<c, Unit> {
    public static final int $stable = 8;
    private final Function1<c, Unit> onValueChange;
    private final RangeSliderValueFinishedCallback onValueChangeFinished;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderValueChangedCallback(Function1<? super c, Unit> onValueChange, RangeSliderValueFinishedCallback onValueChangeFinished) {
        j.g(onValueChange, "onValueChange");
        j.g(onValueChangeFinished, "onValueChangeFinished");
        this.onValueChange = onValueChange;
        this.onValueChangeFinished = onValueChangeFinished;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((c) obj);
        return Unit.f18162a;
    }

    public void invoke(c value) {
        j.g(value, "value");
        this.onValueChangeFinished.setPuckPositions(value);
        this.onValueChange.invoke(value);
    }
}
