package androidx.window.layout;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface WindowMetricsCalculatorDecorator {
    WindowMetricsCalculator decorate(WindowMetricsCalculator windowMetricsCalculator);
}
