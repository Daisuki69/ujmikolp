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
public final class KycSubmissionContentDataV3 {

    @InterfaceC1497a
    @InterfaceC1498b("additionalDocs")
    private final List<KycAdditionalDocUrlV2> additionalDocs;

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
    private final List<KycIdUrlV2> ids;

    @InterfaceC1497a
    @InterfaceC1498b("incomeSource")
    private final String incomeSource;

    @InterfaceC1497a
    @InterfaceC1498b("jobTitle")
    private final String jobTitle;

    @InterfaceC1497a
    @InterfaceC1498b("lastName")
    private final String lastName;

    @InterfaceC1497a
    @InterfaceC1498b("liveness")
    private final KycLivenessV2 liveness;

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
    @InterfaceC1498b("purposeOfAccount")
    private final String purposeOfAccount;

    @InterfaceC1497a
    @InterfaceC1498b("questionnaire")
    private final List<FormattedQuestionnaireItem> questionnaire;

    @InterfaceC1497a
    @InterfaceC1498b("workNature")
    private final String workNature;

    public KycSubmissionContentDataV3() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycSubmissionContentDataV3 copy$default(KycSubmissionContentDataV3 kycSubmissionContentDataV3, String str, String str2, String str3, KycBirthPlace kycBirthPlace, String str4, KycAddress kycAddress, KycAddress kycAddress2, String str5, String str6, String str7, String str8, String str9, String str10, List list, KycLivenessV2 kycLivenessV2, List list2, List list3, int i, Object obj) {
        List list4;
        List list5;
        String str11;
        KycSubmissionContentDataV3 kycSubmissionContentDataV32;
        KycLivenessV2 kycLivenessV22;
        String str12;
        String str13;
        KycBirthPlace kycBirthPlace2;
        String str14;
        KycAddress kycAddress3;
        KycAddress kycAddress4;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        List list6;
        String str21 = (i & 1) != 0 ? kycSubmissionContentDataV3.lastName : str;
        String str22 = (i & 2) != 0 ? kycSubmissionContentDataV3.middleName : str2;
        String str23 = (i & 4) != 0 ? kycSubmissionContentDataV3.firstName : str3;
        KycBirthPlace kycBirthPlace3 = (i & 8) != 0 ? kycSubmissionContentDataV3.birthPlace : kycBirthPlace;
        String str24 = (i & 16) != 0 ? kycSubmissionContentDataV3.birthDate : str4;
        KycAddress kycAddress5 = (i & 32) != 0 ? kycSubmissionContentDataV3.permanentAddress : kycAddress;
        KycAddress kycAddress6 = (i & 64) != 0 ? kycSubmissionContentDataV3.presentAddress : kycAddress2;
        String str25 = (i & 128) != 0 ? kycSubmissionContentDataV3.nationality : str5;
        String str26 = (i & 256) != 0 ? kycSubmissionContentDataV3.workNature : str6;
        String str27 = (i & 512) != 0 ? kycSubmissionContentDataV3.incomeSource : str7;
        String str28 = (i & 1024) != 0 ? kycSubmissionContentDataV3.employmentDetail : str8;
        String str29 = (i & 2048) != 0 ? kycSubmissionContentDataV3.jobTitle : str9;
        String str30 = (i & 4096) != 0 ? kycSubmissionContentDataV3.purposeOfAccount : str10;
        List list7 = (i & 8192) != 0 ? kycSubmissionContentDataV3.questionnaire : list;
        String str31 = str21;
        KycLivenessV2 kycLivenessV23 = (i & 16384) != 0 ? kycSubmissionContentDataV3.liveness : kycLivenessV2;
        List list8 = (i & 32768) != 0 ? kycSubmissionContentDataV3.ids : list2;
        if ((i & 65536) != 0) {
            list5 = list8;
            list4 = kycSubmissionContentDataV3.additionalDocs;
            kycLivenessV22 = kycLivenessV23;
            str12 = str22;
            str13 = str23;
            kycBirthPlace2 = kycBirthPlace3;
            str14 = str24;
            kycAddress3 = kycAddress5;
            kycAddress4 = kycAddress6;
            str15 = str25;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            list6 = list7;
            str11 = str31;
            kycSubmissionContentDataV32 = kycSubmissionContentDataV3;
        } else {
            list4 = list3;
            list5 = list8;
            str11 = str31;
            kycSubmissionContentDataV32 = kycSubmissionContentDataV3;
            kycLivenessV22 = kycLivenessV23;
            str12 = str22;
            str13 = str23;
            kycBirthPlace2 = kycBirthPlace3;
            str14 = str24;
            kycAddress3 = kycAddress5;
            kycAddress4 = kycAddress6;
            str15 = str25;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            list6 = list7;
        }
        return kycSubmissionContentDataV32.copy(str11, str12, str13, kycBirthPlace2, str14, kycAddress3, kycAddress4, str15, str16, str17, str18, str19, str20, list6, kycLivenessV22, list5, list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycSubmissionContentDataV3 generateV3ContentData$default(KycSubmissionContentDataV3 kycSubmissionContentDataV3, KycSubmissionContentDataV2 kycSubmissionContentDataV2, String str, String str2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            list = null;
        }
        return kycSubmissionContentDataV3.generateV3ContentData(kycSubmissionContentDataV2, str, str2, list);
    }

    public final String component1() {
        return this.lastName;
    }

    public final String component10() {
        return this.incomeSource;
    }

    public final String component11() {
        return this.employmentDetail;
    }

    public final String component12() {
        return this.jobTitle;
    }

    public final String component13() {
        return this.purposeOfAccount;
    }

    public final List<FormattedQuestionnaireItem> component14() {
        return this.questionnaire;
    }

    public final KycLivenessV2 component15() {
        return this.liveness;
    }

    public final List<KycIdUrlV2> component16() {
        return this.ids;
    }

    public final List<KycAdditionalDocUrlV2> component17() {
        return this.additionalDocs;
    }

    public final String component2() {
        return this.middleName;
    }

    public final String component3() {
        return this.firstName;
    }

    public final KycBirthPlace component4() {
        return this.birthPlace;
    }

    public final String component5() {
        return this.birthDate;
    }

    public final KycAddress component6() {
        return this.permanentAddress;
    }

    public final KycAddress component7() {
        return this.presentAddress;
    }

    public final String component8() {
        return this.nationality;
    }

    public final String component9() {
        return this.workNature;
    }

    public final KycSubmissionContentDataV3 copy(String str, String str2, String str3, KycBirthPlace kycBirthPlace, String str4, KycAddress kycAddress, KycAddress kycAddress2, String str5, String str6, String str7, String str8, String str9, String str10, List<FormattedQuestionnaireItem> list, KycLivenessV2 kycLivenessV2, List<KycIdUrlV2> list2, List<KycAdditionalDocUrlV2> list3) {
        return new KycSubmissionContentDataV3(str, str2, str3, kycBirthPlace, str4, kycAddress, kycAddress2, str5, str6, str7, str8, str9, str10, list, kycLivenessV2, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycSubmissionContentDataV3)) {
            return false;
        }
        KycSubmissionContentDataV3 kycSubmissionContentDataV3 = (KycSubmissionContentDataV3) obj;
        return j.b(this.lastName, kycSubmissionContentDataV3.lastName) && j.b(this.middleName, kycSubmissionContentDataV3.middleName) && j.b(this.firstName, kycSubmissionContentDataV3.firstName) && j.b(this.birthPlace, kycSubmissionContentDataV3.birthPlace) && j.b(this.birthDate, kycSubmissionContentDataV3.birthDate) && j.b(this.permanentAddress, kycSubmissionContentDataV3.permanentAddress) && j.b(this.presentAddress, kycSubmissionContentDataV3.presentAddress) && j.b(this.nationality, kycSubmissionContentDataV3.nationality) && j.b(this.workNature, kycSubmissionContentDataV3.workNature) && j.b(this.incomeSource, kycSubmissionContentDataV3.incomeSource) && j.b(this.employmentDetail, kycSubmissionContentDataV3.employmentDetail) && j.b(this.jobTitle, kycSubmissionContentDataV3.jobTitle) && j.b(this.purposeOfAccount, kycSubmissionContentDataV3.purposeOfAccount) && j.b(this.questionnaire, kycSubmissionContentDataV3.questionnaire) && j.b(this.liveness, kycSubmissionContentDataV3.liveness) && j.b(this.ids, kycSubmissionContentDataV3.ids) && j.b(this.additionalDocs, kycSubmissionContentDataV3.additionalDocs);
    }

    public final KycSubmissionContentDataV3 generateV3ContentData(KycSubmissionContentDataV2 contentDataV2, String jobTitle, String purposeOfAccount, List<FormattedQuestionnaireItem> list) {
        j.g(contentDataV2, "contentDataV2");
        j.g(jobTitle, "jobTitle");
        j.g(purposeOfAccount, "purposeOfAccount");
        String firstName = contentDataV2.getFirstName();
        String middleName = contentDataV2.getMiddleName();
        String lastName = contentDataV2.getLastName();
        String birthDate = contentDataV2.getBirthDate();
        KycBirthPlace birthPlace = contentDataV2.getBirthPlace();
        String nationality = contentDataV2.getNationality();
        KycAddress presentAddress = contentDataV2.getPresentAddress();
        return new KycSubmissionContentDataV3(lastName, middleName, firstName, birthPlace, birthDate, contentDataV2.getPermanentAddress(), presentAddress, nationality, contentDataV2.getWorkNature(), contentDataV2.getIncomeSource(), contentDataV2.getEmploymentDetail(), jobTitle, purposeOfAccount, list, contentDataV2.getLiveness(), contentDataV2.getIds(), contentDataV2.getAdditionalDocs());
    }

    public final List<KycAdditionalDocUrlV2> getAdditionalDocs() {
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

    public final List<KycIdUrlV2> getIds() {
        return this.ids;
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

    public final KycLivenessV2 getLiveness() {
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

    public final String getPurposeOfAccount() {
        return this.purposeOfAccount;
    }

    public final List<FormattedQuestionnaireItem> getQuestionnaire() {
        return this.questionnaire;
    }

    public final String getWorkNature() {
        return this.workNature;
    }

    public int hashCode() {
        String str = this.lastName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        KycBirthPlace kycBirthPlace = this.birthPlace;
        int iHashCode4 = (iHashCode3 + (kycBirthPlace == null ? 0 : kycBirthPlace.hashCode())) * 31;
        String str4 = this.birthDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        KycAddress kycAddress = this.permanentAddress;
        int iHashCode6 = (iHashCode5 + (kycAddress == null ? 0 : kycAddress.hashCode())) * 31;
        KycAddress kycAddress2 = this.presentAddress;
        int iHashCode7 = (iHashCode6 + (kycAddress2 == null ? 0 : kycAddress2.hashCode())) * 31;
        String str5 = this.nationality;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.workNature;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.incomeSource;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.employmentDetail;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.jobTitle;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.purposeOfAccount;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<FormattedQuestionnaireItem> list = this.questionnaire;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        KycLivenessV2 kycLivenessV2 = this.liveness;
        int iHashCode15 = (iHashCode14 + (kycLivenessV2 == null ? 0 : kycLivenessV2.hashCode())) * 31;
        List<KycIdUrlV2> list2 = this.ids;
        int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<KycAdditionalDocUrlV2> list3 = this.additionalDocs;
        return iHashCode16 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        String str = this.lastName;
        String str2 = this.middleName;
        String str3 = this.firstName;
        KycBirthPlace kycBirthPlace = this.birthPlace;
        String str4 = this.birthDate;
        KycAddress kycAddress = this.permanentAddress;
        KycAddress kycAddress2 = this.presentAddress;
        String str5 = this.nationality;
        String str6 = this.workNature;
        String str7 = this.incomeSource;
        String str8 = this.employmentDetail;
        String str9 = this.jobTitle;
        String str10 = this.purposeOfAccount;
        List<FormattedQuestionnaireItem> list = this.questionnaire;
        KycLivenessV2 kycLivenessV2 = this.liveness;
        List<KycIdUrlV2> list2 = this.ids;
        List<KycAdditionalDocUrlV2> list3 = this.additionalDocs;
        StringBuilder sbX = s.x("KycSubmissionContentDataV3(lastName=", str, ", middleName=", str2, ", firstName=");
        sbX.append(str3);
        sbX.append(", birthPlace=");
        sbX.append(kycBirthPlace);
        sbX.append(", birthDate=");
        sbX.append(str4);
        sbX.append(", permanentAddress=");
        sbX.append(kycAddress);
        sbX.append(", presentAddress=");
        sbX.append(kycAddress2);
        sbX.append(", nationality=");
        sbX.append(str5);
        sbX.append(", workNature=");
        c.A(sbX, str6, ", incomeSource=", str7, ", employmentDetail=");
        c.A(sbX, str8, ", jobTitle=", str9, ", purposeOfAccount=");
        sbX.append(str10);
        sbX.append(", questionnaire=");
        sbX.append(list);
        sbX.append(", liveness=");
        sbX.append(kycLivenessV2);
        sbX.append(", ids=");
        sbX.append(list2);
        sbX.append(", additionalDocs=");
        return s.r(sbX, list3, ")");
    }

    public KycSubmissionContentDataV3(String str, String str2, String str3, KycBirthPlace kycBirthPlace, String str4, KycAddress kycAddress, KycAddress kycAddress2, String str5, String str6, String str7, String str8, String str9, String str10, List<FormattedQuestionnaireItem> list, KycLivenessV2 kycLivenessV2, List<KycIdUrlV2> list2, List<KycAdditionalDocUrlV2> list3) {
        this.lastName = str;
        this.middleName = str2;
        this.firstName = str3;
        this.birthPlace = kycBirthPlace;
        this.birthDate = str4;
        this.permanentAddress = kycAddress;
        this.presentAddress = kycAddress2;
        this.nationality = str5;
        this.workNature = str6;
        this.incomeSource = str7;
        this.employmentDetail = str8;
        this.jobTitle = str9;
        this.purposeOfAccount = str10;
        this.questionnaire = list;
        this.liveness = kycLivenessV2;
        this.ids = list2;
        this.additionalDocs = list3;
    }

    public KycSubmissionContentDataV3(String str, String str2, String str3, KycBirthPlace kycBirthPlace, String str4, KycAddress kycAddress, KycAddress kycAddress2, String str5, String str6, String str7, String str8, String str9, String str10, List list, KycLivenessV2 kycLivenessV2, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : kycBirthPlace, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : kycAddress, (i & 64) != 0 ? null : kycAddress2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : str10, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : kycLivenessV2, (i & 32768) != 0 ? C1112C.f9377a : list2, (i & 65536) != 0 ? null : list3);
    }
}
