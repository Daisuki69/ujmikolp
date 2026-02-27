package com.dynatrace.agent.common.connectivity;

import android.os.Build;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalBuild {
    public static final LocalBuild INSTANCE = new LocalBuild();

    private LocalBuild() {
    }

    public final String getManufacturer() {
        String MANUFACTURER = Build.MANUFACTURER;
        j.f(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    public final String getModel() {
        String MODEL = Build.MODEL;
        j.f(MODEL, "MODEL");
        return MODEL;
    }

    public final String getOs() {
        String RELEASE = Build.VERSION.RELEASE;
        j.f(RELEASE, "RELEASE");
        return RELEASE;
    }

    public final String getTestTags() {
        return Build.TAGS;
    }

    public final int getVersionSdk() {
        return Build.VERSION.SDK_INT;
    }
}
