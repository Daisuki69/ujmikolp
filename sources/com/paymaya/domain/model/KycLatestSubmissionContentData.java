package com.paymaya.domain.model;

import We.s;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycLatestSubmissionContentData {

    @InterfaceC1497a
    @InterfaceC1498b("additionalDocs")
    private final List<KycAdditionalDocType> additionalDocs;

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
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("ids")
    private final List<KycId> ids;

    @InterfaceC1497a
    @InterfaceC1498b("incomeSource")
    private final String incomeSource;

    @InterfaceC1497a
    @InterfaceC1498b("lastName")
    private final String lastName;

    @InterfaceC1497a
    @InterfaceC1498b("liveness")
    private final KycLiveness liveness;

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
    @InterfaceC1498b("referenceId")
    private final String referenceId;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    @InterfaceC1497a
    @InterfaceC1498b("workNature")
    private final String workNature;

    public KycLatestSubmissionContentData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycLatestSubmissionContentData copy$default(KycLatestSubmissionContentData kycLatestSubmissionContentData, String str, String str2, String str3, String str4, String str5, String str6, String str7, KycBirthPlace kycBirthPlace, String str8, KycAddress kycAddress, KycAddress kycAddress2, String str9, String str10, String str11, KycLiveness kycLiveness, List list, List list2, int i, Object obj) {
        List list3;
        List list4;
        String str12;
        KycLatestSubmissionContentData kycLatestSubmissionContentData2;
        KycLiveness kycLiveness2;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        KycBirthPlace kycBirthPlace2;
        String str19;
        KycAddress kycAddress3;
        KycAddress kycAddress4;
        String str20;
        String str21;
        String str22;
        String str23 = (i & 1) != 0 ? kycLatestSubmissionContentData.id : str;
        String str24 = (i & 2) != 0 ? kycLatestSubmissionContentData.firstName : str2;
        String str25 = (i & 4) != 0 ? kycLatestSubmissionContentData.middleName : str3;
        String str26 = (i & 8) != 0 ? kycLatestSubmissionContentData.lastName : str4;
        String str27 = (i & 16) != 0 ? kycLatestSubmissionContentData.birthDate : str5;
        String str28 = (i & 32) != 0 ? kycLatestSubmissionContentData.referenceId : str6;
        String str29 = (i & 64) != 0 ? kycLatestSubmissionContentData.status : str7;
        KycBirthPlace kycBirthPlace3 = (i & 128) != 0 ? kycLatestSubmissionContentData.birthPlace : kycBirthPlace;
        String str30 = (i & 256) != 0 ? kycLatestSubmissionContentData.nationality : str8;
        KycAddress kycAddress5 = (i & 512) != 0 ? kycLatestSubmissionContentData.presentAddress : kycAddress;
        KycAddress kycAddress6 = (i & 1024) != 0 ? kycLatestSubmissionContentData.permanentAddress : kycAddress2;
        String str31 = (i & 2048) != 0 ? kycLatestSubmissionContentData.incomeSource : str9;
        String str32 = (i & 4096) != 0 ? kycLatestSubmissionContentData.workNature : str10;
        String str33 = (i & 8192) != 0 ? kycLatestSubmissionContentData.employmentDetail : str11;
        String str34 = str23;
        KycLiveness kycLiveness3 = (i & 16384) != 0 ? kycLatestSubmissionContentData.liveness : kycLiveness;
        List list5 = (i & 32768) != 0 ? kycLatestSubmissionContentData.ids : list;
        if ((i & 65536) != 0) {
            list4 = list5;
            list3 = kycLatestSubmissionContentData.additionalDocs;
            kycLiveness2 = kycLiveness3;
            str13 = str24;
            str14 = str25;
            str15 = str26;
            str16 = str27;
            str17 = str28;
            str18 = str29;
            kycBirthPlace2 = kycBirthPlace3;
            str19 = str30;
            kycAddress3 = kycAddress5;
            kycAddress4 = kycAddress6;
            str20 = str31;
            str21 = str32;
            str22 = str33;
            str12 = str34;
            kycLatestSubmissionContentData2 = kycLatestSubmissionContentData;
        } else {
            list3 = list2;
            list4 = list5;
            str12 = str34;
            kycLatestSubmissionContentData2 = kycLatestSubmissionContentData;
            kycLiveness2 = kycLiveness3;
            str13 = str24;
            str14 = str25;
            str15 = str26;
            str16 = str27;
            str17 = str28;
            str18 = str29;
            kycBirthPlace2 = kycBirthPlace3;
            str19 = str30;
            kycAddress3 = kycAddress5;
            kycAddress4 = kycAddress6;
            str20 = str31;
            str21 = str32;
            str22 = str33;
        }
        return kycLatestSubmissionContentData2.copy(str12, str13, str14, str15, str16, str17, str18, kycBirthPlace2, str19, kycAddress3, kycAddress4, str20, str21, str22, kycLiveness2, list4, list3);
    }

    public final String component1() {
        return this.id;
    }

    public final KycAddress component10() {
        return this.presentAddress;
    }

    public final KycAddress component11() {
        return this.permanentAddress;
    }

    public final String component12() {
        return this.incomeSource;
    }

    public final String component13() {
        return this.workNature;
    }

    public final String component14() {
        return this.employmentDetail;
    }

    public final KycLiveness component15() {
        return this.liveness;
    }

    public final List<KycId> component16() {
        return this.ids;
    }

    public final List<KycAdditionalDocType> component17() {
        return this.additionalDocs;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.middleName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final String component5() {
        return this.birthDate;
    }

    public final String component6() {
        return this.referenceId;
    }

    public final String component7() {
        return this.status;
    }

    public final KycBirthPlace component8() {
        return this.birthPlace;
    }

    public final String component9() {
        return this.nationality;
    }

    public final KycLatestSubmissionContentData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, KycBirthPlace kycBirthPlace, String str8, KycAddress kycAddress, KycAddress kycAddress2, String str9, String str10, String str11, KycLiveness kycLiveness, List<KycId> list, List<KycAdditionalDocType> list2) {
        return new KycLatestSubmissionContentData(str, str2, str3, str4, str5, str6, str7, kycBirthPlace, str8, kycAddress, kycAddress2, str9, str10, str11, kycLiveness, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycLatestSubmissionContentData)) {
            return false;
        }
        KycLatestSubmissionContentData kycLatestSubmissionContentData = (KycLatestSubmissionContentData) obj;
        return j.b(this.id, kycLatestSubmissionContentData.id) && j.b(this.firstName, kycLatestSubmissionContentData.firstName) && j.b(this.middleName, kycLatestSubmissionContentData.middleName) && j.b(this.lastName, kycLatestSubmissionContentData.lastName) && j.b(this.birthDate, kycLatestSubmissionContentData.birthDate) && j.b(this.referenceId, kycLatestSubmissionContentData.referenceId) && j.b(this.status, kycLatestSubmissionContentData.status) && j.b(this.birthPlace, kycLatestSubmissionContentData.birthPlace) && j.b(this.nationality, kycLatestSubmissionContentData.nationality) && j.b(this.presentAddress, kycLatestSubmissionContentData.presentAddress) && j.b(this.permanentAddress, kycLatestSubmissionContentData.permanentAddress) && j.b(this.incomeSource, kycLatestSubmissionContentData.incomeSource) && j.b(this.workNature, kycLatestSubmissionContentData.workNature) && j.b(this.employmentDetail, kycLatestSubmissionContentData.employmentDetail) && j.b(this.liveness, kycLatestSubmissionContentData.liveness) && j.b(this.ids, kycLatestSubmissionContentData.ids) && j.b(this.additionalDocs, kycLatestSubmissionContentData.additionalDocs);
    }

    public final List<KycAdditionalDocType> getAdditionalDocs() {
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

    public final String getId() {
        return this.id;
    }

    public final List<KycId> getIds() {
        return this.ids;
    }

    public final String getIncomeSource() {
        return this.incomeSource;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final KycLiveness getLiveness() {
        return this.liveness;
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

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getWorkNature() {
        return this.workNature;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthDate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.referenceId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.status;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        KycBirthPlace kycBirthPlace = this.birthPlace;
        int iHashCode8 = (iHashCode7 + (kycBirthPlace == null ? 0 : kycBirthPlace.hashCode())) * 31;
        String str8 = this.nationality;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        KycAddress kycAddress = this.presentAddress;
        int iHashCode10 = (iHashCode9 + (kycAddress == null ? 0 : kycAddress.hashCode())) * 31;
        KycAddress kycAddress2 = this.permanentAddress;
        int iHashCode11 = (iHashCode10 + (kycAddress2 == null ? 0 : kycAddress2.hashCode())) * 31;
        String str9 = this.incomeSource;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.workNature;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.employmentDetail;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        KycLiveness kycLiveness = this.liveness;
        int iHashCode15 = (iHashCode14 + (kycLiveness == null ? 0 : kycLiveness.hashCode())) * 31;
        List<KycId> list = this.ids;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        List<KycAdditionalDocType> list2 = this.additionalDocs;
        return iHashCode16 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.firstName;
        String str3 = this.middleName;
        String str4 = this.lastName;
        String str5 = this.birthDate;
        String str6 = this.referenceId;
        String str7 = this.status;
        KycBirthPlace kycBirthPlace = this.birthPlace;
        String str8 = this.nationality;
        KycAddress kycAddress = this.presentAddress;
        KycAddress kycAddress2 = this.permanentAddress;
        String str9 = this.incomeSource;
        String str10 = this.workNature;
        String str11 = this.employmentDetail;
        KycLiveness kycLiveness = this.liveness;
        List<KycId> list = this.ids;
        List<KycAdditionalDocType> list2 = this.additionalDocs;
        StringBuilder sbX = s.x("KycLatestSubmissionContentData(id=", str, ", firstName=", str2, ", middleName=");
        c.A(sbX, str3, ", lastName=", str4, ", birthDate=");
        c.A(sbX, str5, ", referenceId=", str6, ", status=");
        sbX.append(str7);
        sbX.append(", birthPlace=");
        sbX.append(kycBirthPlace);
        sbX.append(", nationality=");
        sbX.append(str8);
        sbX.append(", presentAddress=");
        sbX.append(kycAddress);
        sbX.append(", permanentAddress=");
        sbX.append(kycAddress2);
        sbX.append(", incomeSource=");
        sbX.append(str9);
        sbX.append(", workNature=");
        c.A(sbX, str10, ", employmentDetail=", str11, ", liveness=");
        sbX.append(kycLiveness);
        sbX.append(", ids=");
        sbX.append(list);
        sbX.append(", additionalDocs=");
        return s.r(sbX, list2, ")");
    }

    public KycLatestSubmissionContentData(String str, String str2, String str3, String str4, String str5, String str6, String str7, KycBirthPlace kycBirthPlace, String str8, KycAddress kycAddress, KycAddress kycAddress2, String str9, String str10, String str11, KycLiveness kycLiveness, List<KycId> list, List<KycAdditionalDocType> list2) {
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.birthDate = str5;
        this.referenceId = str6;
        this.status = str7;
        this.birthPlace = kycBirthPlace;
        this.nationality = str8;
        this.presentAddress = kycAddress;
        this.permanentAddress = kycAddress2;
        this.incomeSource = str9;
        this.workNature = str10;
        this.employmentDetail = str11;
        this.liveness = kycLiveness;
        this.ids = list;
        this.additionalDocs = list2;
    }

    public KycLatestSubmissionContentData(String str, String str2, String str3, String str4, String str5, String str6, String str7, KycBirthPlace kycBirthPlace, String str8, KycAddress kycAddress, KycAddress kycAddress2, String str9, String str10, String str11, KycLiveness kycLiveness, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : kycBirthPlace, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : kycAddress, (i & 1024) != 0 ? null : kycAddress2, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : kycLiveness, (i & 32768) != 0 ? C1112C.f9377a : list, (i & 65536) != 0 ? C1112C.f9377a : list2);
    }
}
