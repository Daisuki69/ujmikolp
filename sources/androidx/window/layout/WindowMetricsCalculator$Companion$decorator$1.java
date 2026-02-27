package androidx.window.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowMetricsCalculator$Companion$decorator$1 extends k implements Function1<WindowMetricsCalculator, WindowMetricsCalculator> {
    public static final WindowMetricsCalculator$Companion$decorator$1 INSTANCE = new WindowMetricsCalculator$Companion$decorator$1();

    public WindowMetricsCalculator$Companion$decorator$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator it) {
        j.g(it, "it");
        return it;
    }
}
