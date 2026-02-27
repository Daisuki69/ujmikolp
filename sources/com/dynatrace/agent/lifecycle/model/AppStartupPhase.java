package com.dynatrace.agent.lifecycle.model;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AppStartupPhase {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ AppStartupPhase[] $VALUES;
    private final String value;
    public static final AppStartupPhase APPLICATION_CREATE = new AppStartupPhase("APPLICATION_CREATE", 0, "android.application.on_create");
    public static final AppStartupPhase ACTIVITY_CREATE = new AppStartupPhase("ACTIVITY_CREATE", 1, "android.activity.on_create");
    public static final AppStartupPhase ACTIVITY_START = new AppStartupPhase("ACTIVITY_START", 2, "android.activity.on_start");
    public static final AppStartupPhase ACTIVITY_RESUMED = new AppStartupPhase("ACTIVITY_RESUMED", 3, null);

    private static final /* synthetic */ AppStartupPhase[] $values() {
        return new AppStartupPhase[]{APPLICATION_CREATE, ACTIVITY_CREATE, ACTIVITY_START, ACTIVITY_RESUMED};
    }

    static {
        AppStartupPhase[] appStartupPhaseArr$values = $values();
        $VALUES = appStartupPhaseArr$values;
        $ENTRIES = v0.h(appStartupPhaseArr$values);
    }

    private AppStartupPhase(String str, int i, String str2) {
        this.value = str2;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static AppStartupPhase valueOf(String str) {
        return (AppStartupPhase) Enum.valueOf(AppStartupPhase.class, str);
    }

    public static AppStartupPhase[] values() {
        return (AppStartupPhase[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
