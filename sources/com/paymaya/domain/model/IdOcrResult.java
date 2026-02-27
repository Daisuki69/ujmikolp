package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class IdOcrResult implements Parcelable {
    public static final Parcelable.Creator<IdOcrResult> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("address")
    private final String address;

    @InterfaceC1497a
    @InterfaceC1498b("agency_code")
    private final String agencyCode;

    @InterfaceC1497a
    @InterfaceC1498b("birthdate")
    private final String birthDate;

    @InterfaceC1497a
    @InterfaceC1498b("birthplace")
    private final String birthPlace;

    @InterfaceC1497a
    @InterfaceC1498b("civil_status")
    private final String civilStatus;

    @InterfaceC1497a
    @InterfaceC1498b("country_code")
    private final String countryCode;

    @InterfaceC1497a
    @InterfaceC1498b("exp_date")
    private final String expirationDate;

    @InterfaceC1497a
    @InterfaceC1498b("firstname")
    private final String firstName;

    @InterfaceC1497a
    @InterfaceC1498b("height")
    private final String height;

    @InterfaceC1497a
    @InterfaceC1498b("id_no")
    private final String idNumber;

    @InterfaceC1497a
    @InterfaceC1498b("id_type")
    private final String idType;

    @InterfaceC1497a
    @InterfaceC1498b("issue_date")
    private final String issueDate;

    @InterfaceC1497a
    @InterfaceC1498b("issuing_authority")
    private final String issuingAuthority;

    @InterfaceC1497a
    @InterfaceC1498b("issuing_office")
    private final String issuingOffice;

    @InterfaceC1497a
    @InterfaceC1498b("lastname")
    private final String lastName;

    @InterfaceC1497a
    @InterfaceC1498b("maiden_middle_name")
    private final String maidenMiddleName;

    @InterfaceC1497a
    @InterfaceC1498b("middlename")
    private final String middleName;

    @InterfaceC1497a
    @InterfaceC1498b("nationality")
    private final String nationality;

    @InterfaceC1497a
    @InterfaceC1498b("profession")
    private final String profession;

    @InterfaceC1497a
    @InterfaceC1498b("purpose")
    private final String purpose;

    @InterfaceC1497a
    @InterfaceC1498b("reg_date")
    private final String registrationDate;

    @InterfaceC1497a
    @InterfaceC1498b("remarks")
    private final String remarks;

    @InterfaceC1497a
    @InterfaceC1498b("sex")
    private final String sex;

    @InterfaceC1497a
    @InterfaceC1498b("weight")
    private final String weight;

    public static final class Creator implements Parcelable.Creator<IdOcrResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdOcrResult createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new IdOcrResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdOcrResult[] newArray(int i) {
            return new IdOcrResult[i];
        }
    }

    public IdOcrResult(String idType, String idNumber, String lastName, String firstName, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        j.g(idType, "idType");
        j.g(idNumber, "idNumber");
        j.g(lastName, "lastName");
        j.g(firstName, "firstName");
        this.idType = idType;
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = str;
        this.birthDate = str2;
        this.address = str3;
        this.sex = str4;
        this.nationality = str5;
        this.weight = str6;
        this.height = str7;
        this.expirationDate = str8;
        this.agencyCode = str9;
        this.maidenMiddleName = str10;
        this.birthPlace = str11;
        this.civilStatus = str12;
        this.purpose = str13;
        this.remarks = str14;
        this.issuingOffice = str15;
        this.countryCode = str16;
        this.issueDate = str17;
        this.issuingAuthority = str18;
        this.registrationDate = str19;
        this.profession = str20;
    }

    public static /* synthetic */ IdOcrResult copy$default(IdOcrResult idOcrResult, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, Object obj) {
        String str25;
        String str26;
        String str27 = (i & 1) != 0 ? idOcrResult.idType : str;
        String str28 = (i & 2) != 0 ? idOcrResult.idNumber : str2;
        String str29 = (i & 4) != 0 ? idOcrResult.lastName : str3;
        String str30 = (i & 8) != 0 ? idOcrResult.firstName : str4;
        String str31 = (i & 16) != 0 ? idOcrResult.middleName : str5;
        String str32 = (i & 32) != 0 ? idOcrResult.birthDate : str6;
        String str33 = (i & 64) != 0 ? idOcrResult.address : str7;
        String str34 = (i & 128) != 0 ? idOcrResult.sex : str8;
        String str35 = (i & 256) != 0 ? idOcrResult.nationality : str9;
        String str36 = (i & 512) != 0 ? idOcrResult.weight : str10;
        String str37 = (i & 1024) != 0 ? idOcrResult.height : str11;
        String str38 = (i & 2048) != 0 ? idOcrResult.expirationDate : str12;
        String str39 = (i & 4096) != 0 ? idOcrResult.agencyCode : str13;
        String str40 = (i & 8192) != 0 ? idOcrResult.maidenMiddleName : str14;
        String str41 = str27;
        String str42 = (i & 16384) != 0 ? idOcrResult.birthPlace : str15;
        String str43 = (i & 32768) != 0 ? idOcrResult.civilStatus : str16;
        String str44 = (i & 65536) != 0 ? idOcrResult.purpose : str17;
        String str45 = (i & 131072) != 0 ? idOcrResult.remarks : str18;
        String str46 = (i & 262144) != 0 ? idOcrResult.issuingOffice : str19;
        String str47 = (i & 524288) != 0 ? idOcrResult.countryCode : str20;
        String str48 = (i & 1048576) != 0 ? idOcrResult.issueDate : str21;
        String str49 = (i & 2097152) != 0 ? idOcrResult.issuingAuthority : str22;
        String str50 = (i & 4194304) != 0 ? idOcrResult.registrationDate : str23;
        if ((i & 8388608) != 0) {
            str26 = str50;
            str25 = idOcrResult.profession;
        } else {
            str25 = str24;
            str26 = str50;
        }
        return idOcrResult.copy(str41, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str42, str43, str44, str45, str46, str47, str48, str49, str26, str25);
    }

    public final String component1() {
        return this.idType;
    }

    public final String component10() {
        return this.weight;
    }

    public final String component11() {
        return this.height;
    }

    public final String component12() {
        return this.expirationDate;
    }

    public final String component13() {
        return this.agencyCode;
    }

    public final String component14() {
        return this.maidenMiddleName;
    }

    public final String component15() {
        return this.birthPlace;
    }

    public final String component16() {
        return this.civilStatus;
    }

    public final String component17() {
        return this.purpose;
    }

    public final String component18() {
        return this.remarks;
    }

    public final String component19() {
        return this.issuingOffice;
    }

    public final String component2() {
        return this.idNumber;
    }

    public final String component20() {
        return this.countryCode;
    }

    public final String component21() {
        return this.issueDate;
    }

    public final String component22() {
        return this.issuingAuthority;
    }

    public final String component23() {
        return this.registrationDate;
    }

    public final String component24() {
        return this.profession;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.firstName;
    }

    public final String component5() {
        return this.middleName;
    }

    public final String component6() {
        return this.birthDate;
    }

    public final String component7() {
        return this.address;
    }

    public final String component8() {
        return this.sex;
    }

    public final String component9() {
        return this.nationality;
    }

    public final IdOcrResult copy(String idType, String idNumber, String lastName, String firstName, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20) {
        j.g(idType, "idType");
        j.g(idNumber, "idNumber");
        j.g(lastName, "lastName");
        j.g(firstName, "firstName");
        return new IdOcrResult(idType, idNumber, lastName, firstName, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdOcrResult)) {
            return false;
        }
        IdOcrResult idOcrResult = (IdOcrResult) obj;
        return j.b(this.idType, idOcrResult.idType) && j.b(this.idNumber, idOcrResult.idNumber) && j.b(this.lastName, idOcrResult.lastName) && j.b(this.firstName, idOcrResult.firstName) && j.b(this.middleName, idOcrResult.middleName) && j.b(this.birthDate, idOcrResult.birthDate) && j.b(this.address, idOcrResult.address) && j.b(this.sex, idOcrResult.sex) && j.b(this.nationality, idOcrResult.nationality) && j.b(this.weight, idOcrResult.weight) && j.b(this.height, idOcrResult.height) && j.b(this.expirationDate, idOcrResult.expirationDate) && j.b(this.agencyCode, idOcrResult.agencyCode) && j.b(this.maidenMiddleName, idOcrResult.maidenMiddleName) && j.b(this.birthPlace, idOcrResult.birthPlace) && j.b(this.civilStatus, idOcrResult.civilStatus) && j.b(this.purpose, idOcrResult.purpose) && j.b(this.remarks, idOcrResult.remarks) && j.b(this.issuingOffice, idOcrResult.issuingOffice) && j.b(this.countryCode, idOcrResult.countryCode) && j.b(this.issueDate, idOcrResult.issueDate) && j.b(this.issuingAuthority, idOcrResult.issuingAuthority) && j.b(this.registrationDate, idOcrResult.registrationDate) && j.b(this.profession, idOcrResult.profession);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAgencyCode() {
        return this.agencyCode;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getBirthPlace() {
        return this.birthPlace;
    }

    public final String getCivilStatus() {
        return this.civilStatus;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getIdNumber() {
        return this.idNumber;
    }

    public final String getIdType() {
        return this.idType;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getIssuingAuthority() {
        return this.issuingAuthority;
    }

    public final String getIssuingOffice() {
        return this.issuingOffice;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMaidenMiddleName() {
        return this.maidenMiddleName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getNationality() {
        return this.nationality;
    }

    public final String getProfession() {
        return this.profession;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public final String getRegistrationDate() {
        return this.registrationDate;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getSex() {
        return this.sex;
    }

    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.idType.hashCode() * 31, 31, this.idNumber), 31, this.lastName), 31, this.firstName);
        String str = this.middleName;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.birthDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.address;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sex;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nationality;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.weight;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.height;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.expirationDate;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.agencyCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.maidenMiddleName;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.birthPlace;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.civilStatus;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.purpose;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.remarks;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.issuingOffice;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.countryCode;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.issueDate;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.issuingAuthority;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.registrationDate;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.profession;
        return iHashCode19 + (str20 != null ? str20.hashCode() : 0);
    }

    public String toString() {
        String str = this.idType;
        String str2 = this.idNumber;
        String str3 = this.lastName;
        String str4 = this.firstName;
        String str5 = this.middleName;
        String str6 = this.birthDate;
        String str7 = this.address;
        String str8 = this.sex;
        String str9 = this.nationality;
        String str10 = this.weight;
        String str11 = this.height;
        String str12 = this.expirationDate;
        String str13 = this.agencyCode;
        String str14 = this.maidenMiddleName;
        String str15 = this.birthPlace;
        String str16 = this.civilStatus;
        String str17 = this.purpose;
        String str18 = this.remarks;
        String str19 = this.issuingOffice;
        String str20 = this.countryCode;
        String str21 = this.issueDate;
        String str22 = this.issuingAuthority;
        String str23 = this.registrationDate;
        String str24 = this.profession;
        StringBuilder sbX = s.x("IdOcrResult(idType=", str, ", idNumber=", str2, ", lastName=");
        c.A(sbX, str3, ", firstName=", str4, ", middleName=");
        c.A(sbX, str5, ", birthDate=", str6, ", address=");
        c.A(sbX, str7, ", sex=", str8, ", nationality=");
        c.A(sbX, str9, ", weight=", str10, ", height=");
        c.A(sbX, str11, ", expirationDate=", str12, ", agencyCode=");
        c.A(sbX, str13, ", maidenMiddleName=", str14, ", birthPlace=");
        c.A(sbX, str15, ", civilStatus=", str16, ", purpose=");
        c.A(sbX, str17, ", remarks=", str18, ", issuingOffice=");
        c.A(sbX, str19, ", countryCode=", str20, ", issueDate=");
        c.A(sbX, str21, ", issuingAuthority=", str22, ", registrationDate=");
        return a.p(sbX, str23, ", profession=", str24, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.idType);
        dest.writeString(this.idNumber);
        dest.writeString(this.lastName);
        dest.writeString(this.firstName);
        dest.writeString(this.middleName);
        dest.writeString(this.birthDate);
        dest.writeString(this.address);
        dest.writeString(this.sex);
        dest.writeString(this.nationality);
        dest.writeString(this.weight);
        dest.writeString(this.height);
        dest.writeString(this.expirationDate);
        dest.writeString(this.agencyCode);
        dest.writeString(this.maidenMiddleName);
        dest.writeString(this.birthPlace);
        dest.writeString(this.civilStatus);
        dest.writeString(this.purpose);
        dest.writeString(this.remarks);
        dest.writeString(this.issuingOffice);
        dest.writeString(this.countryCode);
        dest.writeString(this.issueDate);
        dest.writeString(this.issuingAuthority);
        dest.writeString(this.registrationDate);
        dest.writeString(this.profession);
    }
}
