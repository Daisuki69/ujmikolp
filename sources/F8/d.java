package F8;

import com.paymaya.domain.model.KycFieldType;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1557a;

    static {
        int[] iArr = new int[KycFieldType.values().length];
        try {
            iArr[KycFieldType.FIRST_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KycFieldType.MIDDLE_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KycFieldType.LAST_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KycFieldType.BIRTH_DATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[KycFieldType.AMLC_CERT_EXPIRY_DATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[KycFieldType.NATIONAL_ID.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f1557a = iArr;
    }
}
