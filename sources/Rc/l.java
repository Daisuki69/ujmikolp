package rc;

import com.paymaya.domain.model.UpdateProfileFieldType;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f19912b;

    static {
        int[] iArr = new int[AbstractC2217b.d(109).length];
        try {
            iArr[86] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f19911a = iArr;
        int[] iArr2 = new int[UpdateProfileFieldType.values().length];
        try {
            iArr2[UpdateProfileFieldType.EMAIL_ADDRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[UpdateProfileFieldType.GENDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[UpdateProfileFieldType.CIVIL_STATUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[UpdateProfileFieldType.EDUCATIONAL_ATTAINMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[UpdateProfileFieldType.FIRST_NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[UpdateProfileFieldType.MIDDLE_NAME.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[UpdateProfileFieldType.LAST_NAME.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[UpdateProfileFieldType.TIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[UpdateProfileFieldType.ALTERNATE_CONTACT.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[UpdateProfileFieldType.SSS.ordinal()] = 10;
        } catch (NoSuchFieldError unused11) {
        }
        f19912b = iArr2;
    }
}
