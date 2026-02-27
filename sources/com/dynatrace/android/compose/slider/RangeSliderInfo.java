package com.dynatrace.android.compose.slider;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import wj.c;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class RangeSliderInfo {
    public static final int $stable = 0;
    private final float endPuckPosition;
    private final Function1<c, Unit> source;
    private final float startPuckPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderInfo(float f, float f3, Function1<? super c, Unit> source) {
        j.g(source, "source");
        this.startPuckPosition = f;
        this.endPuckPosition = f3;
        this.source = source;
    }

    public final float getEndPuckPosition() {
        return this.endPuckPosition;
    }

    public final Function1<c, Unit> getSource() {
        return this.source;
    }

    public final float getStartPuckPosition() {
        return this.startPuckPosition;
    }

    public String toString() {
        return "RangeSliderInfo{startPuckPosition=" + this.startPuckPosition + ", endPuckPosition=" + this.endPuckPosition + ", source=" + this.source.getClass().getName() + '}';
    }
}
