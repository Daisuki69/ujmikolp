package E9;

import com.paymaya.domain.model.MissionsV2ListItem;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1340a;

    static {
        int[] iArr = new int[MissionsV2ListItem.VIEW_TYPE_MISSION_V2.values().length];
        try {
            iArr[MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MissionsV2ListItem.VIEW_TYPE_MISSION_V2.VIEW_TYPE_MISSION_COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f1340a = iArr;
    }
}
