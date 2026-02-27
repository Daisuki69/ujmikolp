package io.flutter.plugins.googlemobileads.nativetemplates;

import android.graphics.Typeface;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public enum FlutterNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    /* JADX INFO: renamed from: io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle;

        static {
            int[] iArr = new int[FlutterNativeTemplateFontStyle.values().length];
            $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle = iArr;
            try {
                iArr[FlutterNativeTemplateFontStyle.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle[FlutterNativeTemplateFontStyle.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle[FlutterNativeTemplateFontStyle.ITALIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle[FlutterNativeTemplateFontStyle.MONOSPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static FlutterNativeTemplateFontStyle fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        Log.w("NativeTemplateFontStyle", "Invalid index for NativeTemplateFontStyle: " + i);
        return NORMAL;
    }

    public Typeface getTypeface() {
        int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.defaultFromStyle(2) : Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
