package androidx.window.layout;

import android.content.Context;
import androidx.window.layout.WindowMetricsCalculator;
import bj.C1036g;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    static {
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
    }

    public static WindowMetrics a(WindowMetricsCalculator windowMetricsCalculator, Context context) {
        j.g(context, "context");
        throw new C1036g("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }

    public static WindowMetrics b(WindowMetricsCalculator windowMetricsCalculator, Context context) {
        j.g(context, "context");
        throw new C1036g("Must override computeMaximumWindowMetrics(context) and provide an implementation.");
    }

    public static WindowMetricsCalculator c() {
        return WindowMetricsCalculator.Companion.getOrCreate();
    }

    public static void d(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.Companion.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    public static void e() {
        WindowMetricsCalculator.Companion.reset();
    }
}
