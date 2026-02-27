package com.dynatrace.agent.common;

import jj.InterfaceC1685a;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class InstrumentationFlavor {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ InstrumentationFlavor[] $VALUES;
    private final String protocolValue;
    public static final InstrumentationFlavor PLAIN = new InstrumentationFlavor("PLAIN", 0, "pl");
    public static final InstrumentationFlavor XAMARIN = new InstrumentationFlavor("XAMARIN", 1, "xm");
    public static final InstrumentationFlavor CORDOVA = new InstrumentationFlavor("CORDOVA", 2, "cd");
    public static final InstrumentationFlavor FLUTTER = new InstrumentationFlavor("FLUTTER", 3, "fl");
    public static final InstrumentationFlavor REACT_NATIVE = new InstrumentationFlavor("REACT_NATIVE", 4, "rn");
    public static final InstrumentationFlavor JETPACK_COMPOSE = new InstrumentationFlavor("JETPACK_COMPOSE", 5, "jc");
    public static final InstrumentationFlavor MAUI = new InstrumentationFlavor("MAUI", 6, "ma");

    private static final /* synthetic */ InstrumentationFlavor[] $values() {
        return new InstrumentationFlavor[]{PLAIN, XAMARIN, CORDOVA, FLUTTER, REACT_NATIVE, JETPACK_COMPOSE, MAUI};
    }

    static {
        InstrumentationFlavor[] instrumentationFlavorArr$values = $values();
        $VALUES = instrumentationFlavorArr$values;
        $ENTRIES = v0.h(instrumentationFlavorArr$values);
    }

    private InstrumentationFlavor(String str, int i, String str2) {
        this.protocolValue = str2;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static InstrumentationFlavor valueOf(String str) {
        return (InstrumentationFlavor) Enum.valueOf(InstrumentationFlavor.class, str);
    }

    public static InstrumentationFlavor[] values() {
        return (InstrumentationFlavor[]) $VALUES.clone();
    }

    public final String getProtocolValue() {
        return this.protocolValue;
    }
}
