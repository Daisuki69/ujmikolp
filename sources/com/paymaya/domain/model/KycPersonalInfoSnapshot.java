package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import androidx.media3.datasource.cache.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycPersonalInfoSnapshot implements Parcelable {
    private final String addDocsBirthCertPath;
    private final String addDocsParentConsentPath;
    private final String addDocsParentPrimaryPath;
    private final String birthDate;
    private final String companyName;
    private final String currentBarangay;
    private final String currentCity;
    private final String currentCountry;
    private final String currentProvince;
    private final String currentStreet;
    private final String currentZipCode;
    private final String firstName;
    private final String idSessionId;
    private final String incomeSource;
    private final String jobTitle;
    private final String lastName;
    private final String middleName;
    private final String nationality;
    private final String permanentBarangay;
    private final String permanentCity;
    private final String permanentCountry;
    private final String permanentProvince;
    private final String permanentStreet;
    private final String permanentZipCode;
    private final String pobCity;
    private final String pobCountry;
    private final String pobProvince;
    private final String primaryIdExpiry;
    private final String primaryIdNumber;
    private final String primaryIdType;
    private final String secondaryIdExpiry;
    private final String secondaryIdNumber;
    private final String secondaryIdType;
    private final boolean useCurrentAddress;
    private final String workNature;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KycPersonalInfoSnapshot> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KycPersonalInfoSnapshot emptySnapshot() {
            return new KycPersonalInfoSnapshot(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null);
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<KycPersonalInfoSnapshot> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycPersonalInfoSnapshot createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycPersonalInfoSnapshot(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycPersonalInfoSnapshot[] newArray(int i) {
            return new KycPersonalInfoSnapshot[i];
        }
    }

    public KycPersonalInfoSnapshot(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z4, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34) {
        this.workNature = str;
        this.jobTitle = str2;
        this.incomeSource = str3;
        this.companyName = str4;
        this.firstName = str5;
        this.middleName = str6;
        this.lastName = str7;
        this.nationality = str8;
        this.birthDate = str9;
        this.pobCountry = str10;
        this.pobProvince = str11;
        this.pobCity = str12;
        this.currentCountry = str13;
        this.currentProvince = str14;
        this.currentCity = str15;
        this.currentBarangay = str16;
        this.currentStreet = str17;
        this.currentZipCode = str18;
        this.permanentCountry = str19;
        this.permanentProvince = str20;
        this.permanentCity = str21;
        this.permanentBarangay = str22;
        this.permanentStreet = str23;
        this.permanentZipCode = str24;
        this.useCurrentAddress = z4;
        this.primaryIdType = str25;
        this.primaryIdNumber = str26;
        this.primaryIdExpiry = str27;
        this.idSessionId = str28;
        this.secondaryIdType = str29;
        this.secondaryIdNumber = str30;
        this.secondaryIdExpiry = str31;
        this.addDocsBirthCertPath = str32;
        this.addDocsParentPrimaryPath = str33;
        this.addDocsParentConsentPath = str34;
    }

    public static /* synthetic */ KycPersonalInfoSnapshot copy$default(KycPersonalInfoSnapshot kycPersonalInfoSnapshot, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z4, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, int i, int i4, Object obj) {
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        boolean z5;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        String str55;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60;
        String str61;
        String str62;
        String str63;
        String str64;
        String str65;
        String str66;
        String str67;
        String str68 = (i & 1) != 0 ? kycPersonalInfoSnapshot.workNature : str;
        String str69 = (i & 2) != 0 ? kycPersonalInfoSnapshot.jobTitle : str2;
        String str70 = (i & 4) != 0 ? kycPersonalInfoSnapshot.incomeSource : str3;
        String str71 = (i & 8) != 0 ? kycPersonalInfoSnapshot.companyName : str4;
        String str72 = (i & 16) != 0 ? kycPersonalInfoSnapshot.firstName : str5;
        String str73 = (i & 32) != 0 ? kycPersonalInfoSnapshot.middleName : str6;
        String str74 = (i & 64) != 0 ? kycPersonalInfoSnapshot.lastName : str7;
        String str75 = (i & 128) != 0 ? kycPersonalInfoSnapshot.nationality : str8;
        String str76 = (i & 256) != 0 ? kycPersonalInfoSnapshot.birthDate : str9;
        String str77 = (i & 512) != 0 ? kycPersonalInfoSnapshot.pobCountry : str10;
        String str78 = (i & 1024) != 0 ? kycPersonalInfoSnapshot.pobProvince : str11;
        String str79 = (i & 2048) != 0 ? kycPersonalInfoSnapshot.pobCity : str12;
        String str80 = (i & 4096) != 0 ? kycPersonalInfoSnapshot.currentCountry : str13;
        String str81 = (i & 8192) != 0 ? kycPersonalInfoSnapshot.currentProvince : str14;
        String str82 = str68;
        String str83 = (i & 16384) != 0 ? kycPersonalInfoSnapshot.currentCity : str15;
        String str84 = (i & 32768) != 0 ? kycPersonalInfoSnapshot.currentBarangay : str16;
        String str85 = (i & 65536) != 0 ? kycPersonalInfoSnapshot.currentStreet : str17;
        String str86 = (i & 131072) != 0 ? kycPersonalInfoSnapshot.currentZipCode : str18;
        String str87 = (i & 262144) != 0 ? kycPersonalInfoSnapshot.permanentCountry : str19;
        String str88 = (i & 524288) != 0 ? kycPersonalInfoSnapshot.permanentProvince : str20;
        String str89 = (i & 1048576) != 0 ? kycPersonalInfoSnapshot.permanentCity : str21;
        String str90 = (i & 2097152) != 0 ? kycPersonalInfoSnapshot.permanentBarangay : str22;
        String str91 = (i & 4194304) != 0 ? kycPersonalInfoSnapshot.permanentStreet : str23;
        String str92 = (i & 8388608) != 0 ? kycPersonalInfoSnapshot.permanentZipCode : str24;
        boolean z8 = (i & 16777216) != 0 ? kycPersonalInfoSnapshot.useCurrentAddress : z4;
        String str93 = (i & 33554432) != 0 ? kycPersonalInfoSnapshot.primaryIdType : str25;
        String str94 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? kycPersonalInfoSnapshot.primaryIdNumber : str26;
        String str95 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? kycPersonalInfoSnapshot.primaryIdExpiry : str27;
        String str96 = (i & 268435456) != 0 ? kycPersonalInfoSnapshot.idSessionId : str28;
        String str97 = (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? kycPersonalInfoSnapshot.secondaryIdType : str29;
        String str98 = (i & 1073741824) != 0 ? kycPersonalInfoSnapshot.secondaryIdNumber : str30;
        String str99 = (i & Integer.MIN_VALUE) != 0 ? kycPersonalInfoSnapshot.secondaryIdExpiry : str31;
        String str100 = (i4 & 1) != 0 ? kycPersonalInfoSnapshot.addDocsBirthCertPath : str32;
        String str101 = (i4 & 2) != 0 ? kycPersonalInfoSnapshot.addDocsParentPrimaryPath : str33;
        if ((i4 & 4) != 0) {
            str36 = str101;
            str35 = kycPersonalInfoSnapshot.addDocsParentConsentPath;
            str38 = str88;
            str39 = str89;
            str40 = str90;
            str41 = str91;
            str42 = str92;
            z5 = z8;
            str43 = str93;
            str44 = str94;
            str45 = str95;
            str46 = str96;
            str47 = str97;
            str48 = str98;
            str49 = str99;
            str50 = str100;
            str51 = str83;
            str53 = str72;
            str54 = str73;
            str55 = str74;
            str56 = str75;
            str57 = str76;
            str58 = str77;
            str59 = str78;
            str60 = str79;
            str61 = str80;
            str62 = str81;
            str63 = str84;
            str64 = str85;
            str65 = str86;
            str37 = str87;
            str66 = str69;
            str67 = str70;
            str52 = str71;
        } else {
            str35 = str34;
            str36 = str101;
            str37 = str87;
            str38 = str88;
            str39 = str89;
            str40 = str90;
            str41 = str91;
            str42 = str92;
            z5 = z8;
            str43 = str93;
            str44 = str94;
            str45 = str95;
            str46 = str96;
            str47 = str97;
            str48 = str98;
            str49 = str99;
            str50 = str100;
            str51 = str83;
            str52 = str71;
            str53 = str72;
            str54 = str73;
            str55 = str74;
            str56 = str75;
            str57 = str76;
            str58 = str77;
            str59 = str78;
            str60 = str79;
            str61 = str80;
            str62 = str81;
            str63 = str84;
            str64 = str85;
            str65 = str86;
            str66 = str69;
            str67 = str70;
        }
        return kycPersonalInfoSnapshot.copy(str82, str66, str67, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str51, str63, str64, str65, str37, str38, str39, str40, str41, str42, z5, str43, str44, str45, str46, str47, str48, str49, str50, str36, str35);
    }

    public final String component1() {
        return this.workNature;
    }

    public final String component10() {
        return this.pobCountry;
    }

    public final String component11() {
        return this.pobProvince;
    }

    public final String component12() {
        return this.pobCity;
    }

    public final String component13() {
        return this.currentCountry;
    }

    public final String component14() {
        return this.currentProvince;
    }

    public final String component15() {
        return this.currentCity;
    }

    public final String component16() {
        return this.currentBarangay;
    }

    public final String component17() {
        return this.currentStreet;
    }

    public final String component18() {
        return this.currentZipCode;
    }

    public final String component19() {
        return this.permanentCountry;
    }

    public final String component2() {
        return this.jobTitle;
    }

    public final String component20() {
        return this.permanentProvince;
    }

    public final String component21() {
        return this.permanentCity;
    }

    public final String component22() {
        return this.permanentBarangay;
    }

    public final String component23() {
        return this.permanentStreet;
    }

    public final String component24() {
        return this.permanentZipCode;
    }

    public final boolean component25() {
        return this.useCurrentAddress;
    }

    public final String component26() {
        return this.primaryIdType;
    }

    public final String component27() {
        return this.primaryIdNumber;
    }

    public final String component28() {
        return this.primaryIdExpiry;
    }

    public final String component29() {
        return this.idSessionId;
    }

    public final String component3() {
        return this.incomeSource;
    }

    public final String component30() {
        return this.secondaryIdType;
    }

    public final String component31() {
        return this.secondaryIdNumber;
    }

    public final String component32() {
        return this.secondaryIdExpiry;
    }

    public final String component33() {
        return this.addDocsBirthCertPath;
    }

    public final String component34() {
        return this.addDocsParentPrimaryPath;
    }

    public final String component35() {
        return this.addDocsParentConsentPath;
    }

    public final String component4() {
        return this.companyName;
    }

    public final String component5() {
        return this.firstName;
    }

    public final String component6() {
        return this.middleName;
    }

    public final String component7() {
        return this.lastName;
    }

    public final String component8() {
        return this.nationality;
    }

    public final String component9() {
        return this.birthDate;
    }

    public final KycPersonalInfoSnapshot copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z4, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34) {
        return new KycPersonalInfoSnapshot(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, z4, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycPersonalInfoSnapshot)) {
            return false;
        }
        KycPersonalInfoSnapshot kycPersonalInfoSnapshot = (KycPersonalInfoSnapshot) obj;
        return j.b(this.workNature, kycPersonalInfoSnapshot.workNature) && j.b(this.jobTitle, kycPersonalInfoSnapshot.jobTitle) && j.b(this.incomeSource, kycPersonalInfoSnapshot.incomeSource) && j.b(this.companyName, kycPersonalInfoSnapshot.companyName) && j.b(this.firstName, kycPersonalInfoSnapshot.firstName) && j.b(this.middleName, kycPersonalInfoSnapshot.middleName) && j.b(this.lastName, kycPersonalInfoSnapshot.lastName) && j.b(this.nationality, kycPersonalInfoSnapshot.nationality) && j.b(this.birthDate, kycPersonalInfoSnapshot.birthDate) && j.b(this.pobCountry, kycPersonalInfoSnapshot.pobCountry) && j.b(this.pobProvince, kycPersonalInfoSnapshot.pobProvince) && j.b(this.pobCity, kycPersonalInfoSnapshot.pobCity) && j.b(this.currentCountry, kycPersonalInfoSnapshot.currentCountry) && j.b(this.currentProvince, kycPersonalInfoSnapshot.currentProvince) && j.b(this.currentCity, kycPersonalInfoSnapshot.currentCity) && j.b(this.currentBarangay, kycPersonalInfoSnapshot.currentBarangay) && j.b(this.currentStreet, kycPersonalInfoSnapshot.currentStreet) && j.b(this.currentZipCode, kycPersonalInfoSnapshot.currentZipCode) && j.b(this.permanentCountry, kycPersonalInfoSnapshot.permanentCountry) && j.b(this.permanentProvince, kycPersonalInfoSnapshot.permanentProvince) && j.b(this.permanentCity, kycPersonalInfoSnapshot.permanentCity) && j.b(this.permanentBarangay, kycPersonalInfoSnapshot.permanentBarangay) && j.b(this.permanentStreet, kycPersonalInfoSnapshot.permanentStreet) && j.b(this.permanentZipCode, kycPersonalInfoSnapshot.permanentZipCode) && this.useCurrentAddress == kycPersonalInfoSnapshot.useCurrentAddress && j.b(this.primaryIdType, kycPersonalInfoSnapshot.primaryIdType) && j.b(this.primaryIdNumber, kycPersonalInfoSnapshot.primaryIdNumber) && j.b(this.primaryIdExpiry, kycPersonalInfoSnapshot.primaryIdExpiry) && j.b(this.idSessionId, kycPersonalInfoSnapshot.idSessionId) && j.b(this.secondaryIdType, kycPersonalInfoSnapshot.secondaryIdType) && j.b(this.secondaryIdNumber, kycPersonalInfoSnapshot.secondaryIdNumber) && j.b(this.secondaryIdExpiry, kycPersonalInfoSnapshot.secondaryIdExpiry) && j.b(this.addDocsBirthCertPath, kycPersonalInfoSnapshot.addDocsBirthCertPath) && j.b(this.addDocsParentPrimaryPath, kycPersonalInfoSnapshot.addDocsParentPrimaryPath) && j.b(this.addDocsParentConsentPath, kycPersonalInfoSnapshot.addDocsParentConsentPath);
    }

    public final String getAddDocsBirthCertPath() {
        return this.addDocsBirthCertPath;
    }

    public final String getAddDocsParentConsentPath() {
        return this.addDocsParentConsentPath;
    }

    public final String getAddDocsParentPrimaryPath() {
        return this.addDocsParentPrimaryPath;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final String getCurrentBarangay() {
        return this.currentBarangay;
    }

    public final String getCurrentCity() {
        return this.currentCity;
    }

    public final String getCurrentCountry() {
        return this.currentCountry;
    }

    public final String getCurrentProvince() {
        return this.currentProvince;
    }

    public final String getCurrentStreet() {
        return this.currentStreet;
    }

    public final String getCurrentZipCode() {
        return this.currentZipCode;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getIdSessionId() {
        return this.idSessionId;
    }

    public final String getIncomeSource() {
        return this.incomeSource;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getNationality() {
        return this.nationality;
    }

    public final String getPermanentBarangay() {
        return this.permanentBarangay;
    }

    public final String getPermanentCity() {
        return this.permanentCity;
    }

    public final String getPermanentCountry() {
        return this.permanentCountry;
    }

    public final String getPermanentProvince() {
        return this.permanentProvince;
    }

    public final String getPermanentStreet() {
        return this.permanentStreet;
    }

    public final String getPermanentZipCode() {
        return this.permanentZipCode;
    }

    public final String getPobCity() {
        return this.pobCity;
    }

    public final String getPobCountry() {
        return this.pobCountry;
    }

    public final String getPobProvince() {
        return this.pobProvince;
    }

    public final String getPrimaryIdExpiry() {
        return this.primaryIdExpiry;
    }

    public final String getPrimaryIdNumber() {
        return this.primaryIdNumber;
    }

    public final String getPrimaryIdType() {
        return this.primaryIdType;
    }

    public final String getSecondaryIdExpiry() {
        return this.secondaryIdExpiry;
    }

    public final String getSecondaryIdNumber() {
        return this.secondaryIdNumber;
    }

    public final String getSecondaryIdType() {
        return this.secondaryIdType;
    }

    public final boolean getUseCurrentAddress() {
        return this.useCurrentAddress;
    }

    public final String getWorkNature() {
        return this.workNature;
    }

    public int hashCode() {
        String str = this.workNature;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jobTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.incomeSource;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.companyName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.middleName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.nationality;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.birthDate;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pobCountry;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.pobProvince;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.pobCity;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.currentCountry;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.currentProvince;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.currentCity;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.currentBarangay;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.currentStreet;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.currentZipCode;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.permanentCountry;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.permanentProvince;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.permanentCity;
        int iHashCode21 = (iHashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.permanentBarangay;
        int iHashCode22 = (iHashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.permanentStreet;
        int iHashCode23 = (iHashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.permanentZipCode;
        int iHashCode24 = (((iHashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31) + (this.useCurrentAddress ? 1231 : 1237)) * 31;
        String str25 = this.primaryIdType;
        int iHashCode25 = (iHashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.primaryIdNumber;
        int iHashCode26 = (iHashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.primaryIdExpiry;
        int iHashCode27 = (iHashCode26 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.idSessionId;
        int iHashCode28 = (iHashCode27 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.secondaryIdType;
        int iHashCode29 = (iHashCode28 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.secondaryIdNumber;
        int iHashCode30 = (iHashCode29 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.secondaryIdExpiry;
        int iHashCode31 = (iHashCode30 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.addDocsBirthCertPath;
        int iHashCode32 = (iHashCode31 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.addDocsParentPrimaryPath;
        int iHashCode33 = (iHashCode32 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.addDocsParentConsentPath;
        return iHashCode33 + (str34 != null ? str34.hashCode() : 0);
    }

    public String toString() {
        String str = this.workNature;
        String str2 = this.jobTitle;
        String str3 = this.incomeSource;
        String str4 = this.companyName;
        String str5 = this.firstName;
        String str6 = this.middleName;
        String str7 = this.lastName;
        String str8 = this.nationality;
        String str9 = this.birthDate;
        String str10 = this.pobCountry;
        String str11 = this.pobProvince;
        String str12 = this.pobCity;
        String str13 = this.currentCountry;
        String str14 = this.currentProvince;
        String str15 = this.currentCity;
        String str16 = this.currentBarangay;
        String str17 = this.currentStreet;
        String str18 = this.currentZipCode;
        String str19 = this.permanentCountry;
        String str20 = this.permanentProvince;
        String str21 = this.permanentCity;
        String str22 = this.permanentBarangay;
        String str23 = this.permanentStreet;
        String str24 = this.permanentZipCode;
        boolean z4 = this.useCurrentAddress;
        String str25 = this.primaryIdType;
        String str26 = this.primaryIdNumber;
        String str27 = this.primaryIdExpiry;
        String str28 = this.idSessionId;
        String str29 = this.secondaryIdType;
        String str30 = this.secondaryIdNumber;
        String str31 = this.secondaryIdExpiry;
        String str32 = this.addDocsBirthCertPath;
        String str33 = this.addDocsParentPrimaryPath;
        String str34 = this.addDocsParentConsentPath;
        StringBuilder sbX = s.x("KycPersonalInfoSnapshot(workNature=", str, ", jobTitle=", str2, ", incomeSource=");
        c.A(sbX, str3, ", companyName=", str4, ", firstName=");
        c.A(sbX, str5, ", middleName=", str6, ", lastName=");
        c.A(sbX, str7, ", nationality=", str8, ", birthDate=");
        c.A(sbX, str9, ", pobCountry=", str10, ", pobProvince=");
        c.A(sbX, str11, ", pobCity=", str12, ", currentCountry=");
        c.A(sbX, str13, ", currentProvince=", str14, ", currentCity=");
        c.A(sbX, str15, ", currentBarangay=", str16, ", currentStreet=");
        c.A(sbX, str17, ", currentZipCode=", str18, ", permanentCountry=");
        c.A(sbX, str19, ", permanentProvince=", str20, ", permanentCity=");
        c.A(sbX, str21, ", permanentBarangay=", str22, ", permanentStreet=");
        c.A(sbX, str23, ", permanentZipCode=", str24, ", useCurrentAddress=");
        sbX.append(z4);
        sbX.append(", primaryIdType=");
        sbX.append(str25);
        sbX.append(", primaryIdNumber=");
        c.A(sbX, str26, ", primaryIdExpiry=", str27, ", idSessionId=");
        c.A(sbX, str28, ", secondaryIdType=", str29, ", secondaryIdNumber=");
        c.A(sbX, str30, ", secondaryIdExpiry=", str31, ", addDocsBirthCertPath=");
        c.A(sbX, str32, ", addDocsParentPrimaryPath=", str33, ", addDocsParentConsentPath=");
        return s.p(sbX, str34, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.workNature);
        dest.writeString(this.jobTitle);
        dest.writeString(this.incomeSource);
        dest.writeString(this.companyName);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.lastName);
        dest.writeString(this.nationality);
        dest.writeString(this.birthDate);
        dest.writeString(this.pobCountry);
        dest.writeString(this.pobProvince);
        dest.writeString(this.pobCity);
        dest.writeString(this.currentCountry);
        dest.writeString(this.currentProvince);
        dest.writeString(this.currentCity);
        dest.writeString(this.currentBarangay);
        dest.writeString(this.currentStreet);
        dest.writeString(this.currentZipCode);
        dest.writeString(this.permanentCountry);
        dest.writeString(this.permanentProvince);
        dest.writeString(this.permanentCity);
        dest.writeString(this.permanentBarangay);
        dest.writeString(this.permanentStreet);
        dest.writeString(this.permanentZipCode);
        dest.writeInt(this.useCurrentAddress ? 1 : 0);
        dest.writeString(this.primaryIdType);
        dest.writeString(this.primaryIdNumber);
        dest.writeString(this.primaryIdExpiry);
        dest.writeString(this.idSessionId);
        dest.writeString(this.secondaryIdType);
        dest.writeString(this.secondaryIdNumber);
        dest.writeString(this.secondaryIdExpiry);
        dest.writeString(this.addDocsBirthCertPath);
        dest.writeString(this.addDocsParentPrimaryPath);
        dest.writeString(this.addDocsParentConsentPath);
    }

    public /* synthetic */ KycPersonalInfoSnapshot(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z4, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, int i, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, z4, (i & 33554432) != 0 ? null : str25, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : str26, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str27, (i & 268435456) != 0 ? null : str28, (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str29, (i & 1073741824) != 0 ? null : str30, (i & Integer.MIN_VALUE) != 0 ? null : str31, str32, str33, str34);
    }
}
