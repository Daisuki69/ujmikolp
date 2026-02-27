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
public final class KycPreSubmissionContent {

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
    private final List<KycOcrId> ids;

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
    @InterfaceC1498b("workNature")
    private final String workNature;

    public KycPreSubmissionContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.incomeSource;
    }

    public final String component11() {
        return this.workNature;
    }

    public final String component12() {
        return this.employmentDetail;
    }

    public final KycLiveness component13() {
        return this.liveness;
    }

    public final List<KycOcrId> component14() {
        return this.ids;
    }

    public final List<KycAdditionalDocType> component15() {
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
        return this.nationality;
    }

    public final String component6() {
        return this.birthDate;
    }

    public final KycBirthPlace component7() {
        return this.birthPlace;
    }

    public final KycAddress component8() {
        return this.presentAddress;
    }

    public final KycAddress component9() {
        return this.permanentAddress;
    }

    public final KycPreSubmissionContent copy(String str, String str2, String str3, String str4, String str5, String str6, KycBirthPlace kycBirthPlace, KycAddress kycAddress, KycAddress kycAddress2, String str7, String str8, String str9, KycLiveness kycLiveness, List<KycOcrId> list, List<KycAdditionalDocType> list2) {
        return new KycPreSubmissionContent(str, str2, str3, str4, str5, str6, kycBirthPlace, kycAddress, kycAddress2, str7, str8, str9, kycLiveness, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycPreSubmissionContent)) {
            return false;
        }
        KycPreSubmissionContent kycPreSubmissionContent = (KycPreSubmissionContent) obj;
        return j.b(this.id, kycPreSubmissionContent.id) && j.b(this.firstName, kycPreSubmissionContent.firstName) && j.b(this.middleName, kycPreSubmissionContent.middleName) && j.b(this.lastName, kycPreSubmissionContent.lastName) && j.b(this.nationality, kycPreSubmissionContent.nationality) && j.b(this.birthDate, kycPreSubmissionContent.birthDate) && j.b(this.birthPlace, kycPreSubmissionContent.birthPlace) && j.b(this.presentAddress, kycPreSubmissionContent.presentAddress) && j.b(this.permanentAddress, kycPreSubmissionContent.permanentAddress) && j.b(this.incomeSource, kycPreSubmissionContent.incomeSource) && j.b(this.workNature, kycPreSubmissionContent.workNature) && j.b(this.employmentDetail, kycPreSubmissionContent.employmentDetail) && j.b(this.liveness, kycPreSubmissionContent.liveness) && j.b(this.ids, kycPreSubmissionContent.ids) && j.b(this.additionalDocs, kycPreSubmissionContent.additionalDocs);
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

    public final List<KycOcrId> getIds() {
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
        String str5 = this.nationality;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.birthDate;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        KycBirthPlace kycBirthPlace = this.birthPlace;
        int iHashCode7 = (iHashCode6 + (kycBirthPlace == null ? 0 : kycBirthPlace.hashCode())) * 31;
        KycAddress kycAddress = this.presentAddress;
        int iHashCode8 = (iHashCode7 + (kycAddress == null ? 0 : kycAddress.hashCode())) * 31;
        KycAddress kycAddress2 = this.permanentAddress;
        int iHashCode9 = (iHashCode8 + (kycAddress2 == null ? 0 : kycAddress2.hashCode())) * 31;
        String str7 = this.incomeSource;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.workNature;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.employmentDetail;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        KycLiveness kycLiveness = this.liveness;
        int iHashCode13 = (iHashCode12 + (kycLiveness == null ? 0 : kycLiveness.hashCode())) * 31;
        List<KycOcrId> list = this.ids;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        List<KycAdditionalDocType> list2 = this.additionalDocs;
        return iHashCode14 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.firstName;
        String str3 = this.middleName;
        String str4 = this.lastName;
        String str5 = this.nationality;
        String str6 = this.birthDate;
        KycBirthPlace kycBirthPlace = this.birthPlace;
        KycAddress kycAddress = this.presentAddress;
        KycAddress kycAddress2 = this.permanentAddress;
        String str7 = this.incomeSource;
        String str8 = this.workNature;
        String str9 = this.employmentDetail;
        KycLiveness kycLiveness = this.liveness;
        List<KycOcrId> list = this.ids;
        List<KycAdditionalDocType> list2 = this.additionalDocs;
        StringBuilder sbX = s.x("KycPreSubmissionContent(id=", str, ", firstName=", str2, ", middleName=");
        c.A(sbX, str3, ", lastName=", str4, ", nationality=");
        c.A(sbX, str5, ", birthDate=", str6, ", birthPlace=");
        sbX.append(kycBirthPlace);
        sbX.append(", presentAddress=");
        sbX.append(kycAddress);
        sbX.append(", permanentAddress=");
        sbX.append(kycAddress2);
        sbX.append(", incomeSource=");
        sbX.append(str7);
        sbX.append(", workNature=");
        c.A(sbX, str8, ", employmentDetail=", str9, ", liveness=");
        sbX.append(kycLiveness);
        sbX.append(", ids=");
        sbX.append(list);
        sbX.append(", additionalDocs=");
        return s.r(sbX, list2, ")");
    }

    public KycPreSubmissionContent(String str, String str2, String str3, String str4, String str5, String str6, KycBirthPlace kycBirthPlace, KycAddress kycAddress, KycAddress kycAddress2, String str7, String str8, String str9, KycLiveness kycLiveness, List<KycOcrId> list, List<KycAdditionalDocType> list2) {
        this.id = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.nationality = str5;
        this.birthDate = str6;
        this.birthPlace = kycBirthPlace;
        this.presentAddress = kycAddress;
        this.permanentAddress = kycAddress2;
        this.incomeSource = str7;
        this.workNature = str8;
        this.employmentDetail = str9;
        this.liveness = kycLiveness;
        this.ids = list;
        this.additionalDocs = list2;
    }

    public KycPreSubmissionContent(String str, String str2, String str3, String str4, String str5, String str6, KycBirthPlace kycBirthPlace, KycAddress kycAddress, KycAddress kycAddress2, String str7, String str8, String str9, KycLiveness kycLiveness, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : kycBirthPlace, (i & 128) != 0 ? null : kycAddress, (i & 256) != 0 ? null : kycAddress2, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) == 0 ? kycLiveness : null, (i & 8192) != 0 ? C1112C.f9377a : list, (i & 16384) != 0 ? C1112C.f9377a : list2);
    }
}
