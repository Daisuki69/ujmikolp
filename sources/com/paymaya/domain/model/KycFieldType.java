package com.paymaya.domain.model;

import jj.InterfaceC1685a;
import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class KycFieldType {
    private static final /* synthetic */ InterfaceC1685a $ENTRIES;
    private static final /* synthetic */ KycFieldType[] $VALUES;
    private final String cmsName;
    private final String formSectionName;
    private final boolean isDate;
    private final int maxLength;
    public static final KycFieldType WORK_NATION = new KycFieldType("WORK_NATION", 0, "", 255, false, KycFormSections.WORK);
    public static final KycFieldType NATURE_OF_WORK_OTHERS = new KycFieldType("NATURE_OF_WORK_OTHERS", 1, "workOthers", 255, false, KycFormSections.WORK);
    public static final KycFieldType JOB_TITLE = new KycFieldType("JOB_TITLE", 2, "", 255, false, KycFormSections.WORK);
    public static final KycFieldType INCOME_SOURCE = new KycFieldType("INCOME_SOURCE", 3, "", 255, false, KycFormSections.WORK);
    public static final KycFieldType COMPANY_NAME = new KycFieldType("COMPANY_NAME", 4, "companyName", 255, false, KycFormSections.WORK);
    public static final KycFieldType FIRST_NAME = new KycFieldType("FIRST_NAME", 5, "firstName", 30, false, KycFormSections.FULL_NAME);
    public static final KycFieldType MIDDLE_NAME = new KycFieldType("MIDDLE_NAME", 6, "middleName", 30, false, KycFormSections.FULL_NAME);
    public static final KycFieldType LAST_NAME = new KycFieldType("LAST_NAME", 7, "lastName", 30, false, KycFormSections.FULL_NAME);
    public static final KycFieldType NATIONALITY = new KycFieldType("NATIONALITY", 8, "", 255, false, KycFormSections.NATIONALITY);
    public static final KycFieldType BIRTH_DATE = new KycFieldType("BIRTH_DATE", 9, "", 10, true, KycFormSections.DATE_OF_BIRTH);
    public static final KycFieldType BIRTH_COUNTRY = new KycFieldType("BIRTH_COUNTRY", 10, "", 255, false, KycFormSections.PLACE_OF_BIRTH);
    public static final KycFieldType BIRTH_STATE = new KycFieldType("BIRTH_STATE", 11, "", 255, false, KycFormSections.PLACE_OF_BIRTH);
    public static final KycFieldType BIRTH_CITY = new KycFieldType("BIRTH_CITY", 12, "city", 255, false, KycFormSections.CURRENT_ADDRESS);
    public static final KycFieldType CURRENT_COUNTRY = new KycFieldType("CURRENT_COUNTRY", 13, "", 255, false, KycFormSections.CURRENT_ADDRESS);
    public static final KycFieldType CURRENT_CITY = new KycFieldType("CURRENT_CITY", 14, "city", 30, false, KycFormSections.CURRENT_ADDRESS);
    public static final KycFieldType CURRENT_STATE = new KycFieldType("CURRENT_STATE", 15, "state", 30, false, KycFormSections.CURRENT_ADDRESS);
    public static final KycFieldType CURRENT_BARANGAY = new KycFieldType("CURRENT_BARANGAY", 16, "barangay", 30, false, KycFormSections.CURRENT_ADDRESS);
    public static final KycFieldType CURRENT_FULL_ADDRESS = new KycFieldType("CURRENT_FULL_ADDRESS", 17, "fullAddress", 80, false, KycFormSections.CURRENT_ADDRESS);
    public static final KycFieldType CURRENT_ADDITIONAL_ADDRESS = new KycFieldType("CURRENT_ADDITIONAL_ADDRESS", 18, "additionalAddress", 50, false, KycFormSections.CURRENT_ADDRESS);
    public static final KycFieldType CURRENT_ZIP_CODE = new KycFieldType("CURRENT_ZIP_CODE", 19, "zipCode", 30, false, KycFormSections.CURRENT_ADDRESS);
    public static final KycFieldType PERMANENT_COUNTRY = new KycFieldType("PERMANENT_COUNTRY", 20, "", 255, false, KycFormSections.PERMANENT_ADDRESS);
    public static final KycFieldType PERMANENT_CITY = new KycFieldType("PERMANENT_CITY", 21, "city", 30, false, KycFormSections.PERMANENT_ADDRESS);
    public static final KycFieldType PERMANENT_STATE = new KycFieldType("PERMANENT_STATE", 22, "state", 30, false, KycFormSections.PERMANENT_ADDRESS);
    public static final KycFieldType PERMANENT_BARANGAY = new KycFieldType("PERMANENT_BARANGAY", 23, "barangay", 30, false, KycFormSections.PERMANENT_ADDRESS);
    public static final KycFieldType PERMANENT_FULL_ADDRESS = new KycFieldType("PERMANENT_FULL_ADDRESS", 24, "fullAddress", 80, false, KycFormSections.PERMANENT_ADDRESS);
    public static final KycFieldType PERMANENT_ADDITIONAL_ADDRESS = new KycFieldType("PERMANENT_ADDITIONAL_ADDRESS", 25, "additionalAddress", 50, false, KycFormSections.PERMANENT_ADDRESS);
    public static final KycFieldType PERMANENT_ZIP_CODE = new KycFieldType("PERMANENT_ZIP_CODE", 26, "zipCode", 30, false, KycFormSections.PERMANENT_ADDRESS);
    public static final KycFieldType ID_NUMBER = new KycFieldType("ID_NUMBER", 27, "idNumber", 30, false, KycFormSections.ID_DETAILS);
    public static final KycFieldType ID_EXPIRATION_DATE = new KycFieldType("ID_EXPIRATION_DATE", 28, "date", 10, true, KycFormSections.ID_DETAILS);
    public static final KycFieldType RELATION = new KycFieldType("RELATION", 29, "", 255, false, KycFormSections.RELATION);
    public static final KycFieldType SUFFIX = new KycFieldType("SUFFIX", 30, "suffix", 10, false, KycFormSections.FULL_NAME);
    public static final KycFieldType NATIONAL_ID = new KycFieldType("NATIONAL_ID", 31, "nationalID", 19, false, KycFormSections.NATIONAL_ID);
    public static final KycFieldType AMLC_CERT_TYPE = new KycFieldType("AMLC_CERT_TYPE", 32, "", 255, false, KycFormSections.ID_DETAILS);
    public static final KycFieldType AMLC_CERT_EXPIRY_DATE = new KycFieldType("AMLC_CERT_EXPIRY_DATE", 33, "date", 10, true, KycFormSections.ID_DETAILS);

    private static final /* synthetic */ KycFieldType[] $values() {
        return new KycFieldType[]{WORK_NATION, NATURE_OF_WORK_OTHERS, JOB_TITLE, INCOME_SOURCE, COMPANY_NAME, FIRST_NAME, MIDDLE_NAME, LAST_NAME, NATIONALITY, BIRTH_DATE, BIRTH_COUNTRY, BIRTH_STATE, BIRTH_CITY, CURRENT_COUNTRY, CURRENT_CITY, CURRENT_STATE, CURRENT_BARANGAY, CURRENT_FULL_ADDRESS, CURRENT_ADDITIONAL_ADDRESS, CURRENT_ZIP_CODE, PERMANENT_COUNTRY, PERMANENT_CITY, PERMANENT_STATE, PERMANENT_BARANGAY, PERMANENT_FULL_ADDRESS, PERMANENT_ADDITIONAL_ADDRESS, PERMANENT_ZIP_CODE, ID_NUMBER, ID_EXPIRATION_DATE, RELATION, SUFFIX, NATIONAL_ID, AMLC_CERT_TYPE, AMLC_CERT_EXPIRY_DATE};
    }

    static {
        KycFieldType[] kycFieldTypeArr$values = $values();
        $VALUES = kycFieldTypeArr$values;
        $ENTRIES = v0.h(kycFieldTypeArr$values);
    }

    private KycFieldType(String str, int i, String str2, int i4, boolean z4, String str3) {
        this.cmsName = str2;
        this.maxLength = i4;
        this.isDate = z4;
        this.formSectionName = str3;
    }

    public static InterfaceC1685a getEntries() {
        return $ENTRIES;
    }

    public static KycFieldType valueOf(String str) {
        return (KycFieldType) Enum.valueOf(KycFieldType.class, str);
    }

    public static KycFieldType[] values() {
        return (KycFieldType[]) $VALUES.clone();
    }

    public final String getCmsName() {
        return this.cmsName;
    }

    public final String getFormSectionName() {
        return this.formSectionName;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final boolean isDate() {
        return this.isDate;
    }

    public /* synthetic */ KycFieldType(String str, int i, String str2, int i4, boolean z4, String str3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, i4, z4, (i6 & 8) != 0 ? str2 : str3);
    }
}
