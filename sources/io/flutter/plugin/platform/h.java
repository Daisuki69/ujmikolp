package io.flutter.plugin.platform;

import io.flutter.embedding.engine.systemchannels.PlatformChannel;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17228b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[PlatformChannel.Brightness.values().length];
        c = iArr;
        try {
            iArr[PlatformChannel.Brightness.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[PlatformChannel.Brightness.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[PlatformChannel.SystemUiOverlay.values().length];
        f17228b = iArr2;
        try {
            iArr2[PlatformChannel.SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f17228b[PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr3 = new int[PlatformChannel.HapticFeedbackType.values().length];
        f17227a = iArr3;
        try {
            iArr3[PlatformChannel.HapticFeedbackType.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17227a[PlatformChannel.HapticFeedbackType.LIGHT_IMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f17227a[PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f17227a[PlatformChannel.HapticFeedbackType.HEAVY_IMPACT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f17227a[PlatformChannel.HapticFeedbackType.SELECTION_CLICK.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
