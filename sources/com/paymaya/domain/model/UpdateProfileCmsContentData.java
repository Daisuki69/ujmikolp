package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdateProfileCmsContentData implements Parcelable {
    public static final Parcelable.Creator<UpdateProfileCmsContentData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("contact_reference_disclaimer")
    private final ContactReferenceDisclaimer contactReferenceDisclaimer;

    @InterfaceC1497a
    @InterfaceC1498b("contact_reference_learn_more")
    private final ContactReferenceLearnMore contactReferenceLearnMore;

    @InterfaceC1497a
    @InterfaceC1498b("contact_reference_relationships")
    private final List<ContactReferenceRelationship> contactReferenceRelationships;

    @InterfaceC1497a
    @InterfaceC1498b("educational_attainments")
    private final List<EducationalAttainment> educationalAttainments;

    @InterfaceC1497a
    @InterfaceC1498b("genders")
    private final List<Gender> genders;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("income_proofs")
    private final List<IncomeProof> incomeProofs;

    @InterfaceC1497a
    @InterfaceC1498b("income_sources")
    private final List<UpdateProfileIncomeSource> incomeSources;

    @InterfaceC1497a
    @InterfaceC1498b("job_titles")
    private final List<JobTitle> jobTitles;

    @InterfaceC1497a
    @InterfaceC1498b("marital_statuses")
    private final List<MaritalStatus> maritalStatuses;

    @InterfaceC1497a
    @InterfaceC1498b("validation_rules")
    private final List<ValidationRule> validationRules;

    @InterfaceC1497a
    @InterfaceC1498b("work_natures")
    private final List<UpdateProfileWorkNature> workNatures;

    public static final class Creator implements Parcelable.Creator<UpdateProfileCmsContentData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileCmsContentData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            j.g(parcel, "parcel");
            int I4 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i);
                int I9 = 0;
                while (I9 != i) {
                    I9 = AbstractC1213b.I(Gender.CREATOR, parcel, arrayList10, I9, 1);
                }
                arrayList = arrayList10;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i4 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(i4);
                int I10 = 0;
                while (I10 != i4) {
                    I10 = AbstractC1213b.I(IncomeProof.CREATOR, parcel, arrayList11, I10, 1);
                }
                arrayList2 = arrayList11;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i6 = parcel.readInt();
                ArrayList arrayList12 = new ArrayList(i6);
                int I11 = 0;
                while (I11 != i6) {
                    I11 = AbstractC1213b.I(UpdateProfileIncomeSource.CREATOR, parcel, arrayList12, I11, 1);
                }
                arrayList3 = arrayList12;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList13 = new ArrayList(i10);
                int I12 = 0;
                while (I12 != i10) {
                    I12 = AbstractC1213b.I(JobTitle.CREATOR, parcel, arrayList13, I12, 1);
                }
                arrayList4 = arrayList13;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(i11);
                int I13 = 0;
                while (I13 != i11) {
                    I13 = AbstractC1213b.I(MaritalStatus.CREATOR, parcel, arrayList14, I13, 1);
                }
                arrayList5 = arrayList14;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(i12);
                int I14 = 0;
                while (I14 != i12) {
                    I14 = AbstractC1213b.I(EducationalAttainment.CREATOR, parcel, arrayList15, I14, 1);
                }
                arrayList6 = arrayList15;
            }
            if (parcel.readInt() == 0) {
                arrayList7 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList16 = new ArrayList(i13);
                int I15 = 0;
                while (I15 != i13) {
                    I15 = AbstractC1213b.I(ValidationRule.CREATOR, parcel, arrayList16, I15, 1);
                }
                arrayList7 = arrayList16;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList17 = new ArrayList(i14);
                int I16 = 0;
                while (I16 != i14) {
                    I16 = AbstractC1213b.I(UpdateProfileWorkNature.CREATOR, parcel, arrayList17, I16, 1);
                }
                arrayList8 = arrayList17;
            }
            if (parcel.readInt() == 0) {
                arrayList9 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList18 = new ArrayList(i15);
                while (I4 != i15) {
                    I4 = AbstractC1213b.I(ContactReferenceRelationship.CREATOR, parcel, arrayList18, I4, 1);
                }
                arrayList9 = arrayList18;
            }
            return new UpdateProfileCmsContentData(arrayList, numValueOf, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, parcel.readInt() == 0 ? null : ContactReferenceDisclaimer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ContactReferenceLearnMore.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateProfileCmsContentData[] newArray(int i) {
            return new UpdateProfileCmsContentData[i];
        }
    }

    public UpdateProfileCmsContentData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateProfileCmsContentData copy$default(UpdateProfileCmsContentData updateProfileCmsContentData, List list, Integer num, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, ContactReferenceDisclaimer contactReferenceDisclaimer, ContactReferenceLearnMore contactReferenceLearnMore, int i, Object obj) {
        if ((i & 1) != 0) {
            list = updateProfileCmsContentData.genders;
        }
        if ((i & 2) != 0) {
            num = updateProfileCmsContentData.id;
        }
        if ((i & 4) != 0) {
            list2 = updateProfileCmsContentData.incomeProofs;
        }
        if ((i & 8) != 0) {
            list3 = updateProfileCmsContentData.incomeSources;
        }
        if ((i & 16) != 0) {
            list4 = updateProfileCmsContentData.jobTitles;
        }
        if ((i & 32) != 0) {
            list5 = updateProfileCmsContentData.maritalStatuses;
        }
        if ((i & 64) != 0) {
            list6 = updateProfileCmsContentData.educationalAttainments;
        }
        if ((i & 128) != 0) {
            list7 = updateProfileCmsContentData.validationRules;
        }
        if ((i & 256) != 0) {
            list8 = updateProfileCmsContentData.workNatures;
        }
        if ((i & 512) != 0) {
            list9 = updateProfileCmsContentData.contactReferenceRelationships;
        }
        if ((i & 1024) != 0) {
            contactReferenceDisclaimer = updateProfileCmsContentData.contactReferenceDisclaimer;
        }
        if ((i & 2048) != 0) {
            contactReferenceLearnMore = updateProfileCmsContentData.contactReferenceLearnMore;
        }
        ContactReferenceDisclaimer contactReferenceDisclaimer2 = contactReferenceDisclaimer;
        ContactReferenceLearnMore contactReferenceLearnMore2 = contactReferenceLearnMore;
        List list10 = list8;
        List list11 = list9;
        List list12 = list6;
        List list13 = list7;
        List list14 = list4;
        List list15 = list5;
        return updateProfileCmsContentData.copy(list, num, list2, list3, list14, list15, list12, list13, list10, list11, contactReferenceDisclaimer2, contactReferenceLearnMore2);
    }

    public final List<Gender> component1() {
        return this.genders;
    }

    public final List<ContactReferenceRelationship> component10() {
        return this.contactReferenceRelationships;
    }

    public final ContactReferenceDisclaimer component11() {
        return this.contactReferenceDisclaimer;
    }

    public final ContactReferenceLearnMore component12() {
        return this.contactReferenceLearnMore;
    }

    public final Integer component2() {
        return this.id;
    }

    public final List<IncomeProof> component3() {
        return this.incomeProofs;
    }

    public final List<UpdateProfileIncomeSource> component4() {
        return this.incomeSources;
    }

    public final List<JobTitle> component5() {
        return this.jobTitles;
    }

    public final List<MaritalStatus> component6() {
        return this.maritalStatuses;
    }

    public final List<EducationalAttainment> component7() {
        return this.educationalAttainments;
    }

    public final List<ValidationRule> component8() {
        return this.validationRules;
    }

    public final List<UpdateProfileWorkNature> component9() {
        return this.workNatures;
    }

    public final UpdateProfileCmsContentData copy(List<Gender> list, Integer num, List<IncomeProof> list2, List<UpdateProfileIncomeSource> list3, List<JobTitle> list4, List<MaritalStatus> list5, List<EducationalAttainment> list6, List<ValidationRule> list7, List<UpdateProfileWorkNature> list8, List<ContactReferenceRelationship> list9, ContactReferenceDisclaimer contactReferenceDisclaimer, ContactReferenceLearnMore contactReferenceLearnMore) {
        return new UpdateProfileCmsContentData(list, num, list2, list3, list4, list5, list6, list7, list8, list9, contactReferenceDisclaimer, contactReferenceLearnMore);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProfileCmsContentData)) {
            return false;
        }
        UpdateProfileCmsContentData updateProfileCmsContentData = (UpdateProfileCmsContentData) obj;
        return j.b(this.genders, updateProfileCmsContentData.genders) && j.b(this.id, updateProfileCmsContentData.id) && j.b(this.incomeProofs, updateProfileCmsContentData.incomeProofs) && j.b(this.incomeSources, updateProfileCmsContentData.incomeSources) && j.b(this.jobTitles, updateProfileCmsContentData.jobTitles) && j.b(this.maritalStatuses, updateProfileCmsContentData.maritalStatuses) && j.b(this.educationalAttainments, updateProfileCmsContentData.educationalAttainments) && j.b(this.validationRules, updateProfileCmsContentData.validationRules) && j.b(this.workNatures, updateProfileCmsContentData.workNatures) && j.b(this.contactReferenceRelationships, updateProfileCmsContentData.contactReferenceRelationships) && j.b(this.contactReferenceDisclaimer, updateProfileCmsContentData.contactReferenceDisclaimer) && j.b(this.contactReferenceLearnMore, updateProfileCmsContentData.contactReferenceLearnMore);
    }

    public final ContactReferenceDisclaimer getContactReferenceDisclaimer() {
        return this.contactReferenceDisclaimer;
    }

    public final ContactReferenceLearnMore getContactReferenceLearnMore() {
        return this.contactReferenceLearnMore;
    }

    public final List<ContactReferenceRelationship> getContactReferenceRelationships() {
        return this.contactReferenceRelationships;
    }

    public final List<EducationalAttainment> getEducationalAttainments() {
        return this.educationalAttainments;
    }

    public final List<Gender> getGenders() {
        return this.genders;
    }

    public final Integer getId() {
        return this.id;
    }

    public final List<IncomeProof> getIncomeProofs() {
        return this.incomeProofs;
    }

    public final List<UpdateProfileIncomeSource> getIncomeSources() {
        return this.incomeSources;
    }

    public final List<JobTitle> getJobTitles() {
        return this.jobTitles;
    }

    public final List<MaritalStatus> getMaritalStatuses() {
        return this.maritalStatuses;
    }

    public final List<ValidationRule> getValidationRules() {
        return this.validationRules;
    }

    public final List<UpdateProfileWorkNature> getWorkNatures() {
        return this.workNatures;
    }

    public int hashCode() {
        List<Gender> list = this.genders;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.id;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<IncomeProof> list2 = this.incomeProofs;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UpdateProfileIncomeSource> list3 = this.incomeSources;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<JobTitle> list4 = this.jobTitles;
        int iHashCode5 = (iHashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<MaritalStatus> list5 = this.maritalStatuses;
        int iHashCode6 = (iHashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<EducationalAttainment> list6 = this.educationalAttainments;
        int iHashCode7 = (iHashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<ValidationRule> list7 = this.validationRules;
        int iHashCode8 = (iHashCode7 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<UpdateProfileWorkNature> list8 = this.workNatures;
        int iHashCode9 = (iHashCode8 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<ContactReferenceRelationship> list9 = this.contactReferenceRelationships;
        int iHashCode10 = (iHashCode9 + (list9 == null ? 0 : list9.hashCode())) * 31;
        ContactReferenceDisclaimer contactReferenceDisclaimer = this.contactReferenceDisclaimer;
        int iHashCode11 = (iHashCode10 + (contactReferenceDisclaimer == null ? 0 : contactReferenceDisclaimer.hashCode())) * 31;
        ContactReferenceLearnMore contactReferenceLearnMore = this.contactReferenceLearnMore;
        return iHashCode11 + (contactReferenceLearnMore != null ? contactReferenceLearnMore.hashCode() : 0);
    }

    public String toString() {
        return "UpdateProfileCmsContentData(genders=" + this.genders + ", id=" + this.id + ", incomeProofs=" + this.incomeProofs + ", incomeSources=" + this.incomeSources + ", jobTitles=" + this.jobTitles + ", maritalStatuses=" + this.maritalStatuses + ", educationalAttainments=" + this.educationalAttainments + ", validationRules=" + this.validationRules + ", workNatures=" + this.workNatures + ", contactReferenceRelationships=" + this.contactReferenceRelationships + ", contactReferenceDisclaimer=" + this.contactReferenceDisclaimer + ", contactReferenceLearnMore=" + this.contactReferenceLearnMore + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        List<Gender> list = this.genders;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((Gender) itP.next()).writeToParcel(dest, i);
            }
        }
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        List<IncomeProof> list2 = this.incomeProofs;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP2 = AbstractC1213b.P(dest, 1, list2);
            while (itP2.hasNext()) {
                ((IncomeProof) itP2.next()).writeToParcel(dest, i);
            }
        }
        List<UpdateProfileIncomeSource> list3 = this.incomeSources;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP3 = AbstractC1213b.P(dest, 1, list3);
            while (itP3.hasNext()) {
                ((UpdateProfileIncomeSource) itP3.next()).writeToParcel(dest, i);
            }
        }
        List<JobTitle> list4 = this.jobTitles;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP4 = AbstractC1213b.P(dest, 1, list4);
            while (itP4.hasNext()) {
                ((JobTitle) itP4.next()).writeToParcel(dest, i);
            }
        }
        List<MaritalStatus> list5 = this.maritalStatuses;
        if (list5 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP5 = AbstractC1213b.P(dest, 1, list5);
            while (itP5.hasNext()) {
                ((MaritalStatus) itP5.next()).writeToParcel(dest, i);
            }
        }
        List<EducationalAttainment> list6 = this.educationalAttainments;
        if (list6 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP6 = AbstractC1213b.P(dest, 1, list6);
            while (itP6.hasNext()) {
                ((EducationalAttainment) itP6.next()).writeToParcel(dest, i);
            }
        }
        List<ValidationRule> list7 = this.validationRules;
        if (list7 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP7 = AbstractC1213b.P(dest, 1, list7);
            while (itP7.hasNext()) {
                ((ValidationRule) itP7.next()).writeToParcel(dest, i);
            }
        }
        List<UpdateProfileWorkNature> list8 = this.workNatures;
        if (list8 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP8 = AbstractC1213b.P(dest, 1, list8);
            while (itP8.hasNext()) {
                ((UpdateProfileWorkNature) itP8.next()).writeToParcel(dest, i);
            }
        }
        List<ContactReferenceRelationship> list9 = this.contactReferenceRelationships;
        if (list9 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP9 = AbstractC1213b.P(dest, 1, list9);
            while (itP9.hasNext()) {
                ((ContactReferenceRelationship) itP9.next()).writeToParcel(dest, i);
            }
        }
        ContactReferenceDisclaimer contactReferenceDisclaimer = this.contactReferenceDisclaimer;
        if (contactReferenceDisclaimer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactReferenceDisclaimer.writeToParcel(dest, i);
        }
        ContactReferenceLearnMore contactReferenceLearnMore = this.contactReferenceLearnMore;
        if (contactReferenceLearnMore == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            contactReferenceLearnMore.writeToParcel(dest, i);
        }
    }

    public UpdateProfileCmsContentData(List<Gender> list, Integer num, List<IncomeProof> list2, List<UpdateProfileIncomeSource> list3, List<JobTitle> list4, List<MaritalStatus> list5, List<EducationalAttainment> list6, List<ValidationRule> list7, List<UpdateProfileWorkNature> list8, List<ContactReferenceRelationship> list9, ContactReferenceDisclaimer contactReferenceDisclaimer, ContactReferenceLearnMore contactReferenceLearnMore) {
        this.genders = list;
        this.id = num;
        this.incomeProofs = list2;
        this.incomeSources = list3;
        this.jobTitles = list4;
        this.maritalStatuses = list5;
        this.educationalAttainments = list6;
        this.validationRules = list7;
        this.workNatures = list8;
        this.contactReferenceRelationships = list9;
        this.contactReferenceDisclaimer = contactReferenceDisclaimer;
        this.contactReferenceLearnMore = contactReferenceLearnMore;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public UpdateProfileCmsContentData(java.util.List r2, java.lang.Integer r3, java.util.List r4, java.util.List r5, java.util.List r6, java.util.List r7, java.util.List r8, java.util.List r9, java.util.List r10, java.util.List r11, com.paymaya.domain.model.ContactReferenceDisclaimer r12, com.paymaya.domain.model.ContactReferenceLearnMore r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r1 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L6
            cj.C r2 = cj.C1112C.f9377a
        L6:
            r15 = r14 & 2
            if (r15 == 0) goto Lf
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        Lf:
            r15 = r14 & 4
            if (r15 == 0) goto L15
            cj.C r4 = cj.C1112C.f9377a
        L15:
            r15 = r14 & 8
            if (r15 == 0) goto L1b
            cj.C r5 = cj.C1112C.f9377a
        L1b:
            r15 = r14 & 16
            if (r15 == 0) goto L21
            cj.C r6 = cj.C1112C.f9377a
        L21:
            r15 = r14 & 32
            if (r15 == 0) goto L27
            cj.C r7 = cj.C1112C.f9377a
        L27:
            r15 = r14 & 64
            if (r15 == 0) goto L2d
            cj.C r8 = cj.C1112C.f9377a
        L2d:
            r15 = r14 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto L33
            cj.C r9 = cj.C1112C.f9377a
        L33:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L39
            cj.C r10 = cj.C1112C.f9377a
        L39:
            r15 = r14 & 512(0x200, float:7.17E-43)
            if (r15 == 0) goto L3f
            cj.C r11 = cj.C1112C.f9377a
        L3f:
            r15 = r14 & 1024(0x400, float:1.435E-42)
            r0 = 0
            if (r15 == 0) goto L45
            r12 = r0
        L45:
            r14 = r14 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L57
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L64
        L57:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L64:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.domain.model.UpdateProfileCmsContentData.<init>(java.util.List, java.lang.Integer, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, com.paymaya.domain.model.ContactReferenceDisclaimer, com.paymaya.domain.model.ContactReferenceLearnMore, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
