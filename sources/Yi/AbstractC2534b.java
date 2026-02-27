package yi;

import io.split.android.client.service.sseclient.notifications.ControlNotification;

/* JADX INFO: renamed from: yi.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC2534b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21285a;

    static {
        int[] iArr = new int[ControlNotification.ControlType.values().length];
        f21285a = iArr;
        try {
            iArr[ControlNotification.ControlType.STREAMING_PAUSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21285a[ControlNotification.ControlType.STREAMING_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21285a[ControlNotification.ControlType.STREAMING_RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f21285a[ControlNotification.ControlType.STREAMING_RESET.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
