package com.dynatrace.agent.communication.network.request;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Compression {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ Compression[] $VALUES;
    private final String description;
    public static final Compression UNCOMPRESSED = new Compression("UNCOMPRESSED", 0, "uncompressed");
    public static final Compression GZIP = new Compression("GZIP", 1, "gzip");

    private static final /* synthetic */ Compression[] $values() {
        return new Compression[]{UNCOMPRESSED, GZIP};
    }

    static {
        Compression[] compressionArr$values = $values();
        $VALUES = compressionArr$values;
        $ENTRIES = v0.h(compressionArr$values);
    }

    private Compression(String str, int i, String str2) {
        this.description = str2;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static Compression valueOf(String str) {
        return (Compression) Enum.valueOf(Compression.class, str);
    }

    public static Compression[] values() {
        return (Compression[]) $VALUES.clone();
    }

    public final String getDescription() {
        return this.description;
    }
}
