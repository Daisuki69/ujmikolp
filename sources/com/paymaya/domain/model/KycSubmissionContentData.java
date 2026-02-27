package com.paymaya.domain.model;

import We.s;
import androidx.media3.datasource.cache.c;
import cj.C1112C;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycSubmissionContentData {

    @InterfaceC1497a
    @InterfaceC1498b("additionalDocs")
    private final List<KycAdditionalDocUrl> additionalDocs;

    @InterfaceC1497a
    @InterfaceC1498b("birthDate")
    private final String birthDate;

    @InterfaceC1497a
    @InterfaceC1498b("birthPlace")
    private final KycBirthPlace birthPlace;

    @InterfaceC1497a
    @InterfaceC1498b("employmentDetail")
    private final String employmentDetail;

    @InterfaceC1497a
    @InterfaceC1498b("firstName")
    private final String firstName;

    @InterfaceC1497a
    @InterfaceC1498b("ids")
    private final List<KycIdUrl> ids;

    @InterfaceC1497a
    @InterfaceC1498b("incomeSource")
    private final String incomeSource;

    @InterfaceC1497a
    @InterfaceC1498b("lastName")
    private final String lastName;

    @InterfaceC1497a
    @InterfaceC1498b("livenessVideoUrl")
    private final String livenessVideoUrl;

    @InterfaceC1497a
    @InterfaceC1498b("middleName")
    private final String middleName;

    @InterfaceC1497a
    @InterfaceC1498b("nationality")
    private final String nationality;

    @InterfaceC1497a
    @InterfaceC1498b("permanentAddress")
    private final KycAddress permanentAddress;

    @InterfaceC1497a
    @InterfaceC1498b("presentAddress")
    private final KycAddress presentAddress;

    @InterfaceC1497a
    @InterfaceC1498b("workNature")
    private final String workNature;

    public KycSubmissionContentData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component10() {
        return this.workNature;
    }

    public final String component11() {
        return this.employmentDetail;
    }

    public final String component12() {
        return this.livenessVideoUrl;
    }

    public final List<KycIdUrl> component13() {
        return this.ids;
    }

    public final List<KycAdditionalDocUrl> component14() {
        return this.additionalDocs;
    }

    public final String component2() {
        return this.middleName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.birthDate;
    }

    public final KycBirthPlace component5() {
        return this.birthPlace;
    }

    public final String component6() {
        return this.nationality;
    }

    public final KycAddress component7() {
        return this.presentAddress;
    }

    public final KycAddress component8() {
        return this.permanentAddress;
    }

    public final String component9() {
        return this.incomeSource;
    }

    public final KycSubmissionContentData copy(String str, String str2, String str3, String str4, KycBirthPlace kycBirthPlace, String str5, KycAddress kycAddress, KycAddress kycAddress2, String str6, String str7, String str8, String str9, List<KycIdUrl> list, List<KycAdditionalDocUrl> list2) {
        return new KycSubmissionContentData(str, str2, str3, str4, kycBirthPlace, str5, kycAddress, kycAddress2, str6, str7, str8, str9, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycSubmissionContentData)) {
            return false;
        }
        KycSubmissionContentData kycSubmissionContentData = (KycSubmissionContentData) obj;
        return j.b(this.firstName, kycSubmissionContentData.firstName) && j.b(this.middleName, kycSubmissionContentData.middleName) && j.b(this.lastName, kycSubmissionContentData.lastName) && j.b(this.birthDate, kycSubmissionContentData.birthDate) && j.b(this.birthPlace, kycSubmissionContentData.birthPlace) && j.b(this.nationality, kycSubmissionContentData.nationality) && j.b(this.presentAddress, kycSubmissionContentData.presentAddress) && j.b(this.permanentAddress, kycSubmissionContentData.permanentAddress) && j.b(this.incomeSource, kycSubmissionContentData.incomeSource) && j.b(this.workNature, kycSubmissionContentData.workNature) && j.b(this.employmentDetail, kycSubmissionContentData.employmentDetail) && j.b(this.livenessVideoUrl, kycSubmissionContentData.livenessVideoUrl) && j.b(this.ids, kycSubmissionContentData.ids) && j.b(this.additionalDocs, kycSubmissionContentData.additionalDocs);
    }

    public final List<KycAdditionalDocUrl> getAdditionalDocs() {
        return this.additionalDocs;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final KycBirthPlace getBirthPlace() {
        return this.birthPlace;
    }

    public final String getEmploymentDetail() {
        return this.employmentDetail;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final List<KycIdUrl> getIds() {
        return this.ids;
    }

    public final String getIncomeSource() {
        return this.incomeSource;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLivenessVideoUrl() {
        return this.livenessVideoUrl;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getNationality() {
        return this.nationality;
    }

    public final KycAddress getPermanentAddress() {
        return this.permanentAddress;
    }

    public final KycAddress getPresentAddress() {
        return this.presentAddress;
    }

    public final String getWorkNature() {
        return this.workNature;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.birthDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        KycBirthPlace kycBirthPlace = this.birthPlace;
        int iHashCode5 = (iHashCode4 + (kycBirthPlace == null ? 0 : kycBirthPlace.hashCode())) * 31;
        String str5 = this.nationality;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        KycAddress kycAddress = this.presentAddress;
        int iHashCode7 = (iHashCode6 + (kycAddress == null ? 0 : kycAddress.hashCode())) * 31;
        KycAddress kycAddress2 = this.permanentAddress;
        int iHashCode8 = (iHashCode7 + (kycAddress2 == null ? 0 : kycAddress2.hashCode())) * 31;
        String str6 = this.incomeSource;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.workNature;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.employmentDetail;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.livenessVideoUrl;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<KycIdUrl> list = this.ids;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        List<KycAdditionalDocUrl> list2 = this.additionalDocs;
        return iHashCode13 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.middleName;
        String str3 = this.lastName;
        String str4 = this.birthDate;
        KycBirthPlace kycBirthPlace = this.birthPlace;
        String str5 = this.nationality;
        KycAddress kycAddress = this.presentAddress;
        KycAddress kycAddress2 = this.permanentAddress;
        String str6 = this.incomeSource;
        String str7 = this.workNature;
        String str8 = this.employmentDetail;
        String str9 = this.livenessVideoUrl;
        List<KycIdUrl> list = this.ids;
        List<KycAdditionalDocUrl> list2 = this.additionalDocs;
        StringBuilder sbX = s.x("KycSubmissionContentData(firstName=", str, ", middleName=", str2, ", lastName=");
        c.A(sbX, str3, ", birthDate=", str4, ", birthPlace=");
        sbX.append(kycBirthPlace);
        sbX.append(", nationality=");
        sbX.append(str5);
        sbX.append(", presentAddress=");
        sbX.append(kycAddress);
        sbX.append(", permanentAddress=");
        sbX.append(kycAddress2);
        sbX.append(", incomeSource=");
        c.A(sbX, str6, ", workNature=", str7, ", employmentDetail=");
        c.A(sbX, str8, ", livenessVideoUrl=", str9, ", ids=");
        sbX.append(list);
        sbX.append(", additionalDocs=");
        sbX.append(list2);
        sbX.append(")");
        return sbX.toString();
    }

    public KycSubmissionContentData(String str, String str2, String str3, String str4, KycBirthPlace kycBirthPlace, String str5, KycAddress kycAddress, KycAddress kycAddress2, String str6, String str7, String str8, String str9, List<KycIdUrl> list, List<KycAdditionalDocUrl> list2) {
        this.firstName = str;
        this.middleName = str2;
        this.lastName = str3;
        this.birthDate = str4;
        this.birthPlace = kycBirthPlace;
        this.nationality = str5;
        this.presentAddress = kycAddress;
        this.permanentAddress = kycAddress2;
        this.incomeSource = str6;
        this.workNature = str7;
        this.employmentDetail = str8;
        this.livenessVideoUrl = str9;
        this.ids = list;
        this.additionalDocs = list2;
    }

    public KycSubmissionContentData(String str, String str2, String str3, String str4, KycBirthPlace kycBirthPlace, String str5, KycAddress kycAddress, KycAddress kycAddress2, String str6, String str7, String str8, String str9, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : kycBirthPlace, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : kycAddress, (i & 128) != 0 ? null : kycAddress2, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? C1112C.f9377a : list, (i & 8192) != 0 ? null : list2);
    }
}
