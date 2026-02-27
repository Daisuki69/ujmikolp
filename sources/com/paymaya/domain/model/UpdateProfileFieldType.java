package com.paymaya.domain.model;

import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class UpdateProfileFieldType {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ UpdateProfileFieldType[] $VALUES;
    private final String cmsName;
    private final String fieldName;
    private final boolean isDate;
    private final int maxLength;
    public static final UpdateProfileFieldType EMAIL_ADDRESS = new UpdateProfileFieldType("EMAIL_ADDRESS", 0, "emailAddress", 255, false, null, 8, null);
    public static final UpdateProfileFieldType GENDER = new UpdateProfileFieldType("GENDER", 1, "", 30, false, null, 8, null);
    public static final UpdateProfileFieldType CIVIL_STATUS = new UpdateProfileFieldType("CIVIL_STATUS", 2, "", 30, false, null, 8, null);
    public static final UpdateProfileFieldType EDUCATIONAL_ATTAINMENT = new UpdateProfileFieldType("EDUCATIONAL_ATTAINMENT", 3, "", 30, false, null, 8, null);
    public static final UpdateProfileFieldType TIN = new UpdateProfileFieldType("TIN", 4, "tinNumber", 12, false, null, 8, null);
    public static final UpdateProfileFieldType ALTERNATE_CONTACT = new UpdateProfileFieldType("ALTERNATE_CONTACT", 5, "alternativeContactNumber", 12, false, "Alternate contact number");
    public static final UpdateProfileFieldType MONTHLY_TAKE_HOME_PAY = new UpdateProfileFieldType("MONTHLY_TAKE_HOME_PAY", 6, "monthlyTakeHomePay", 11, false, 0 == true ? 1 : 0, 8, null);
    public static final UpdateProfileFieldType NATURE_OF_WORK = new UpdateProfileFieldType("NATURE_OF_WORK", 7, "", 255, false, null, 8, null);
    public static final UpdateProfileFieldType JOB_TITLE = new UpdateProfileFieldType("JOB_TITLE", 8, "", 255, false, null, 8, null);
    public static final UpdateProfileFieldType SOURCE_OF_INCOME = new UpdateProfileFieldType("SOURCE_OF_INCOME", 9, "", 255, false, null, 8, null);
    public static final UpdateProfileFieldType NAME_OF_COMPANY = new UpdateProfileFieldType("NAME_OF_COMPANY", 10, "companyName", 255, false, null, 8, null);
    public static final UpdateProfileFieldType RELATION = new UpdateProfileFieldType("RELATION", 11, "", 255, false, null, 8, null);
    public static final UpdateProfileFieldType FIRST_NAME = new UpdateProfileFieldType("FIRST_NAME", 12, "firstName", 255, false, null, 8, null);
    public static final UpdateProfileFieldType MIDDLE_NAME = new UpdateProfileFieldType("MIDDLE_NAME", 13, "middleName", 255, false, null, 8, null);
    public static final UpdateProfileFieldType LAST_NAME = new UpdateProfileFieldType("LAST_NAME", 14, "lastName", 255, false, null, 8, null);
    public static final UpdateProfileFieldType MOBILE_NUMBER = new UpdateProfileFieldType("MOBILE_NUMBER", 15, "mobileNumber", 12, false, "");
    public static final UpdateProfileFieldType SSS = new UpdateProfileFieldType("SSS", 16, "sssNumber", 10, false, 0 == true ? 1 : 0, 8, null);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateProfileFieldType.values().length];
            try {
                iArr[UpdateProfileFieldType.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateProfileFieldType.MIDDLE_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpdateProfileFieldType.LAST_NAME.ordinal()] = 3;
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ UpdateProfileFieldType[] $values() {
        return new UpdateProfileFieldType[]{EMAIL_ADDRESS, GENDER, CIVIL_STATUS, EDUCATIONAL_ATTAINMENT, TIN, ALTERNATE_CONTACT, MONTHLY_TAKE_HOME_PAY, NATURE_OF_WORK, JOB_TITLE, SOURCE_OF_INCOME, NAME_OF_COMPANY, RELATION, FIRST_NAME, MIDDLE_NAME, LAST_NAME, MOBILE_NUMBER, SSS};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        UpdateProfileFieldType[] updateProfileFieldTypeArr$values = $values();
        $VALUES = updateProfileFieldTypeArr$values;
        $ENTRIES = v0.h(updateProfileFieldTypeArr$values);
    }

    private UpdateProfileFieldType(String str, int i, String str2, int i4, boolean z4, String str3) {
        this.cmsName = str2;
        this.maxLength = i4;
        this.isDate = z4;
        this.fieldName = str3;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static UpdateProfileFieldType valueOf(String str) {
        return (UpdateProfileFieldType) Enum.valueOf(UpdateProfileFieldType.class, str);
    }

    public static UpdateProfileFieldType[] values() {
        return (UpdateProfileFieldType[]) $VALUES.clone();
    }

    public final String getCmsName() {
        return this.cmsName;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final boolean isDate() {
        return this.isDate;
    }

    public final boolean isIdNumberType() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i == 4 || i == 5;
    }

    public final boolean isNameType() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public /* synthetic */ UpdateProfileFieldType(String str, int i, String str2, int i4, boolean z4, String str3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, i4, z4, (i6 & 8) != 0 ? "" : str3);
    }
}
