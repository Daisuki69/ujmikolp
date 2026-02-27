package com.dynatrace.agent.lifecycle.model;

import androidx.media3.exoplayer.offline.DownloadService;
import jj.InterfaceC1685a;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class VisibilityStatus {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ VisibilityStatus[] $VALUES;
    private final String keyValue;
    public static final VisibilityStatus FOREGROUND = new VisibilityStatus("FOREGROUND", 0, DownloadService.KEY_FOREGROUND);
    public static final VisibilityStatus BACKGROUND = new VisibilityStatus("BACKGROUND", 1, "background");

    private static final /* synthetic */ VisibilityStatus[] $values() {
        return new VisibilityStatus[]{FOREGROUND, BACKGROUND};
    }

    static {
        VisibilityStatus[] visibilityStatusArr$values = $values();
        $VALUES = visibilityStatusArr$values;
        $ENTRIES = v0.h(visibilityStatusArr$values);
    }

    private VisibilityStatus(String str, int i, String str2) {
        this.keyValue = str2;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static VisibilityStatus valueOf(String str) {
        return (VisibilityStatus) Enum.valueOf(VisibilityStatus.class, str);
    }

    public static VisibilityStatus[] values() {
        return (VisibilityStatus[]) $VALUES.clone();
    }

    public final String getKeyValue() {
        return this.keyValue;
    }
}
