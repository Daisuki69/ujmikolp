package com.dynatrace.agent.lifecycle.model;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AppStartupType {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ AppStartupType[] $VALUES;
    private final String value;
    public static final AppStartupType COLD = new AppStartupType("COLD", 0, "cold");
    public static final AppStartupType WARM = new AppStartupType("WARM", 1, "warm");
    public static final AppStartupType HOT = new AppStartupType("HOT", 2, "hot");

    private static final /* synthetic */ AppStartupType[] $values() {
        return new AppStartupType[]{COLD, WARM, HOT};
    }

    static {
        AppStartupType[] appStartupTypeArr$values = $values();
        $VALUES = appStartupTypeArr$values;
        $ENTRIES = v0.h(appStartupTypeArr$values);
    }

    private AppStartupType(String str, int i, String str2) {
        this.value = str2;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static AppStartupType valueOf(String str) {
        return (AppStartupType) Enum.valueOf(AppStartupType.class, str);
    }

    public static AppStartupType[] values() {
        return (AppStartupType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
