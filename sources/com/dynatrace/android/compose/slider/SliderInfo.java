package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class SliderInfo {
    public static final int $stable = 0;
    private final float puckPosition;
    private final Function1<Float, Unit> source;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderInfo(float f, Function1<? super Float, Unit> source) {
        j.g(source, "source");
        this.puckPosition = f;
        this.source = source;
    }

    public final float getPuckPosition() {
        return this.puckPosition;
    }

    public final Function1<Float, Unit> getSource() {
        return this.source;
    }

    public String toString() {
        return "SliderInfo{puckPosition=" + this.puckPosition + ", source=" + this.source.getClass().getName() + '}';
    }
}
