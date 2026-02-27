package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class SliderValueChangedCallback implements Function1<Float, Unit> {
    public static final int $stable = 8;
    private final Function1<Float, Unit> onValueChange;
    private final SliderValueFinishedCallback onValueChangeFinished;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderValueChangedCallback(Function1<? super Float, Unit> onValueChange, SliderValueFinishedCallback onValueChangeFinished) {
        j.g(onValueChange, "onValueChange");
        j.g(onValueChangeFinished, "onValueChangeFinished");
        this.onValueChange = onValueChange;
        this.onValueChangeFinished = onValueChangeFinished;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return Unit.f18162a;
    }

    public void invoke(float f) {
        this.onValueChangeFinished.setPuckPosition(f);
        this.onValueChange.invoke(Float.valueOf(f));
    }
}
