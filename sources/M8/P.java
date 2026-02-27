package M8;

import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.PersonalInfoConfirmAction;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3207b;

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
            iArr[KycFieldType.FIRST_NAME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[KycFieldType.MIDDLE_NAME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[KycFieldType.LAST_NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[KycFieldType.BIRTH_DATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[KycFieldType.BIRTH_CITY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[KycFieldType.CURRENT_STATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[KycFieldType.CURRENT_CITY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[KycFieldType.CURRENT_BARANGAY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[KycFieldType.CURRENT_FULL_ADDRESS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[KycFieldType.CURRENT_ADDITIONAL_ADDRESS.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[KycFieldType.CURRENT_ZIP_CODE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[KycFieldType.PERMANENT_STATE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[KycFieldType.PERMANENT_CITY.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[KycFieldType.PERMANENT_BARANGAY.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[KycFieldType.PERMANENT_FULL_ADDRESS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[KycFieldType.PERMANENT_ADDITIONAL_ADDRESS.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[KycFieldType.PERMANENT_ZIP_CODE.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[KycFieldType.ID_NUMBER.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[KycFieldType.ID_EXPIRATION_DATE.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[KycFieldType.WORK_NATION.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[KycFieldType.INCOME_SOURCE.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[KycFieldType.NATIONALITY.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[KycFieldType.BIRTH_COUNTRY.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[KycFieldType.BIRTH_STATE.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[KycFieldType.CURRENT_COUNTRY.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[KycFieldType.PERMANENT_COUNTRY.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        f3206a = iArr;
        int[] iArr2 = new int[PersonalInfoConfirmAction.Section.values().length];
        try {
            iArr2[PersonalInfoConfirmAction.Section.WORK.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[PersonalInfoConfirmAction.Section.FULL_NAME.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[PersonalInfoConfirmAction.Section.CURRENT_ADDRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[PersonalInfoConfirmAction.Section.PERMANENT_ADDRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[PersonalInfoConfirmAction.Section.PERMANENT_TOGGLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[PersonalInfoConfirmAction.Section.ID_DETAILS.ordinal()] = 6;
        } catch (NoSuchFieldError unused34) {
        }
        f3207b = iArr2;
    }
}
