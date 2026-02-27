package yc;

import com.paymaya.domain.model.UpdateProfileFieldType;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21126a;

    static {
        int[] iArr = new int[UpdateProfileFieldType.values().length];
        try {
            iArr[UpdateProfileFieldType.MIDDLE_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpdateProfileFieldType.MOBILE_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f21126a = iArr;
    }
}
