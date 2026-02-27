package com.dynatrace.agent.common.connectivity;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class NetworkType {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ NetworkType[] $VALUES;
    public static final NetworkType WIFI = new NetworkType("WIFI", 0);
    public static final NetworkType CELLULAR = new NetworkType("CELLULAR", 1);
    public static final NetworkType ETHERNET = new NetworkType("ETHERNET", 2);
    public static final NetworkType OTHER = new NetworkType("OTHER", 3);
    public static final NetworkType NONE = new NetworkType("NONE", 4);

    private static final /* synthetic */ NetworkType[] $values() {
        return new NetworkType[]{WIFI, CELLULAR, ETHERNET, OTHER, NONE};
    }

    static {
        NetworkType[] networkTypeArr$values = $values();
        $VALUES = networkTypeArr$values;
        $ENTRIES = v0.h(networkTypeArr$values);
    }

    private NetworkType(String str, int i) {
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }
}
