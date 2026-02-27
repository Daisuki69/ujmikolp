package io.flutter.plugins.webviewflutter;

import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class MixedContentMode {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ MixedContentMode[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final MixedContentMode ALWAYS_ALLOW = new MixedContentMode("ALWAYS_ALLOW", 0, 0);
    public static final MixedContentMode COMPATIBILITY_MODE = new MixedContentMode("COMPATIBILITY_MODE", 1, 1);
    public static final MixedContentMode NEVER_ALLOW = new MixedContentMode("NEVER_ALLOW", 2, 2);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MixedContentMode ofRaw(int i) {
            for (MixedContentMode mixedContentMode : MixedContentMode.values()) {
                if (mixedContentMode.getRaw() == i) {
                    return mixedContentMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MixedContentMode[] $values() {
        return new MixedContentMode[]{ALWAYS_ALLOW, COMPATIBILITY_MODE, NEVER_ALLOW};
    }

    static {
        MixedContentMode[] mixedContentModeArr$values = $values();
        $VALUES = mixedContentModeArr$values;
        $ENTRIES = v0.h(mixedContentModeArr$values);
        Companion = new Companion(null);
    }

    private MixedContentMode(String str, int i, int i4) {
        this.raw = i4;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static MixedContentMode valueOf(String str) {
        return (MixedContentMode) Enum.valueOf(MixedContentMode.class, str);
    }

    public static MixedContentMode[] values() {
        return (MixedContentMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
