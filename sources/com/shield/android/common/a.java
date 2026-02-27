package com.shield.android.common;

import android.app.Application;
import com.shield.android.common.ShieldModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    static {
        ShieldModule.ParameterKeys parameterKeys = ShieldModule.ParameterKeys;
    }

    public static void a(ShieldModule shieldModule, WeakReference activityReference, ShieldModule.Callback callback) {
        j.g(activityReference, "activityReference");
        j.g(callback, "callback");
    }

    public static void b(ShieldModule shieldModule, HashMap paramsMap) {
        j.g(paramsMap, "paramsMap");
    }

    public static void c(ShieldModule shieldModule, Application application) {
        j.g(application, "application");
    }

    public static void d(ShieldModule shieldModule, boolean z4) {
    }

    public static void e(ShieldModule shieldModule) {
    }
}
