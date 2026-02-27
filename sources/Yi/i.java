package yi;

import io.split.android.client.service.sseclient.notifications.NotificationType;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21306a;

    static {
        int[] iArr = new int[NotificationType.values().length];
        f21306a = iArr;
        try {
            iArr[NotificationType.CONTROL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f21306a[NotificationType.OCCUPANCY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f21306a[NotificationType.SPLIT_KILL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f21306a[NotificationType.SPLIT_UPDATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f21306a[NotificationType.RULE_BASED_SEGMENT_UPDATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f21306a[NotificationType.MEMBERSHIPS_MS_UPDATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f21306a[NotificationType.MEMBERSHIPS_LS_UPDATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
