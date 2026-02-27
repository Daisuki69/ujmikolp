package io.flutter.plugins.webviewflutter;

import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class FileChooserMode {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ FileChooserMode[] $VALUES;
    public static final Companion Companion;
    public static final FileChooserMode OPEN = new FileChooserMode("OPEN", 0, 0);
    public static final FileChooserMode OPEN_MULTIPLE = new FileChooserMode("OPEN_MULTIPLE", 1, 1);
    public static final FileChooserMode SAVE = new FileChooserMode("SAVE", 2, 2);
    public static final FileChooserMode UNKNOWN = new FileChooserMode("UNKNOWN", 3, 3);
    private final int raw;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FileChooserMode ofRaw(int i) {
            for (FileChooserMode fileChooserMode : FileChooserMode.values()) {
                if (fileChooserMode.getRaw() == i) {
                    return fileChooserMode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FileChooserMode[] $values() {
        return new FileChooserMode[]{OPEN, OPEN_MULTIPLE, SAVE, UNKNOWN};
    }

    static {
        FileChooserMode[] fileChooserModeArr$values = $values();
        $VALUES = fileChooserModeArr$values;
        $ENTRIES = v0.h(fileChooserModeArr$values);
        Companion = new Companion(null);
    }

    private FileChooserMode(String str, int i, int i4) {
        this.raw = i4;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static FileChooserMode valueOf(String str) {
        return (FileChooserMode) Enum.valueOf(FileChooserMode.class, str);
    }

    public static FileChooserMode[] values() {
        return (FileChooserMode[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
