package com.dynatrace.android.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class DependencyChecker {
    public static final int $stable = 0;
    public static final DependencyChecker INSTANCE = new DependencyChecker();

    private DependencyChecker() {
    }

    public final boolean check() {
        try {
            Modifier.Companion companion = Modifier.Companion;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
