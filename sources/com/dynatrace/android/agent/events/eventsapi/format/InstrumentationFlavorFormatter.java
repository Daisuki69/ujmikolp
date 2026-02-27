package com.dynatrace.android.agent.events.eventsapi.format;

import com.dynatrace.agent.common.InstrumentationFlavor;

/* JADX INFO: loaded from: classes2.dex */
public class InstrumentationFlavorFormatter implements Formatter<InstrumentationFlavor, String> {

    /* JADX INFO: renamed from: com.dynatrace.android.agent.events.eventsapi.format.InstrumentationFlavorFormatter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$agent$common$InstrumentationFlavor;

        static {
            int[] iArr = new int[InstrumentationFlavor.values().length];
            $SwitchMap$com$dynatrace$agent$common$InstrumentationFlavor = iArr;
            try {
                iArr[InstrumentationFlavor.CORDOVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$agent$common$InstrumentationFlavor[InstrumentationFlavor.XAMARIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$agent$common$InstrumentationFlavor[InstrumentationFlavor.FLUTTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$dynatrace$agent$common$InstrumentationFlavor[InstrumentationFlavor.REACT_NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$dynatrace$agent$common$InstrumentationFlavor[InstrumentationFlavor.PLAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$dynatrace$agent$common$InstrumentationFlavor[InstrumentationFlavor.JETPACK_COMPOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$dynatrace$agent$common$InstrumentationFlavor[InstrumentationFlavor.MAUI.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // com.dynatrace.android.agent.events.eventsapi.format.Formatter
    public String format(InstrumentationFlavor instrumentationFlavor) {
        switch (AnonymousClass1.$SwitchMap$com$dynatrace$agent$common$InstrumentationFlavor[instrumentationFlavor.ordinal()]) {
            case 1:
                return "cordova";
            case 2:
                return "xamarin";
            case 3:
                return "flutter";
            case 4:
                return "react native";
            case 5:
                return "plain";
            case 6:
                return "jp_compose";
            case 7:
                return "maui";
            default:
                return null;
        }
    }
}
