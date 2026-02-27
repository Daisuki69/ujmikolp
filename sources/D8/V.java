package D8;

import com.paymaya.domain.model.KycFieldType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1024a;

    static {
        int[] iArr = new int[U.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            U u3 = U.f1022a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[KycFieldType.values().length];
        try {
            iArr2[KycFieldType.FIRST_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[KycFieldType.LAST_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[KycFieldType.BIRTH_DATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[KycFieldType.MIDDLE_NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[KycFieldType.SUFFIX.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[KycFieldType.NATIONAL_ID.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f1024a = iArr2;
    }
}
