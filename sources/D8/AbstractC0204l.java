package D8;

import com.paymaya.domain.model.KycFieldType;

/* JADX INFO: renamed from: D8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0204l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1053a;

    static {
        int[] iArr = new int[KycFieldType.values().length];
        try {
            iArr[KycFieldType.NATURE_OF_WORK_OTHERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[KycFieldType.COMPANY_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[KycFieldType.MIDDLE_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KycFieldType.BIRTH_STATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[KycFieldType.PERMANENT_COUNTRY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[KycFieldType.PERMANENT_CITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[KycFieldType.PERMANENT_STATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[KycFieldType.PERMANENT_BARANGAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[KycFieldType.PERMANENT_FULL_ADDRESS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[KycFieldType.PERMANENT_ZIP_CODE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[KycFieldType.ID_EXPIRATION_DATE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[KycFieldType.CURRENT_ADDITIONAL_ADDRESS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[KycFieldType.PERMANENT_ADDITIONAL_ADDRESS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[KycFieldType.FIRST_NAME.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[KycFieldType.LAST_NAME.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f1053a = iArr;
    }
}
