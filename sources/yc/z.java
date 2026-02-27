package yc;

import com.paymaya.domain.model.UpdateProfileFieldType;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21140a;

    static {
        int[] iArr = new int[UpdateProfileFieldType.values().length];
        try {
            iArr[UpdateProfileFieldType.GENDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpdateProfileFieldType.CIVIL_STATUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UpdateProfileFieldType.EDUCATIONAL_ATTAINMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UpdateProfileFieldType.TIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UpdateProfileFieldType.SSS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[UpdateProfileFieldType.MIDDLE_NAME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f21140a = iArr;
    }
}
