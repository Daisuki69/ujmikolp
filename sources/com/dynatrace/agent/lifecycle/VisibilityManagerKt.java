package com.dynatrace.agent.lifecycle;

import android.app.Activity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class VisibilityManagerKt {
    public static final int toIdHash(Activity activity) {
        j.g(activity, "<this>");
        return System.identityHashCode(activity);
    }
}
