package io.flutter.plugins.webviewflutter;

import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class OverScrollMode {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ OverScrollMode[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final OverScrollMode ALWAYS = new OverScrollMode("ALWAYS", 0, 0);
    public static final OverScrollMode IF_CONTENT_SCROLLS = new OverScrollMode("IF_CONTENT_SCROLLS", 1, 1);
    public static final OverScrollMode NEVER = new OverScrollMode("NEVER", 2, 2);
    public static final OverScrollMode UNKNOWN = new OverScrollMode("UNKNOWN", 3, 3);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OverScrollMode ofRaw(int i) {
            for (OverScrollMode overScrollMode : OverScrollMode.values()) {
                if (overScrollMode.getRaw() == i) {
                    return overScrollMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OverScrollMode[] $values() {
        return new OverScrollMode[]{ALWAYS, IF_CONTENT_SCROLLS, NEVER, UNKNOWN};
    }

    static {
        OverScrollMode[] overScrollModeArr$values = $values();
        $VALUES = overScrollModeArr$values;
        $ENTRIES = v0.h(overScrollModeArr$values);
        Companion = new Companion(null);
    }

    private OverScrollMode(String str, int i, int i4) {
        this.raw = i4;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static OverScrollMode valueOf(String str) {
        return (OverScrollMode) Enum.valueOf(OverScrollMode.class, str);
    }

    public static OverScrollMode[] values() {
        return (OverScrollMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
