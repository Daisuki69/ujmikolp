package com.dynatrace.android.agent.conf;

import com.dynatrace.android.compose.DependencyChecker;

/* JADX INFO: loaded from: classes2.dex */
public final class ComposeDependencyChecker {
    public static boolean hasComposeDependency() {
        return DependencyChecker.INSTANCE.check();
    }
}
