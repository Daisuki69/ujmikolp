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
public final class KycDnfbpGuide implements Parcelable {
    public static final Parcelable.Creator<KycDnfbpGuide> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("income_sources")
    private final List<KycIncomeSources> incomeSources;

    @InterfaceC1497a
    @InterfaceC1498b("job_titles")
    private final List<KycJobTitles> jobTitles;

    @InterfaceC1497a
    @InterfaceC1498b("question")
    private final KycQuestion question;

    @InterfaceC1497a
    @InterfaceC1498b("summary_tooltip")
    private final KycSummaryToolTip summaryToolTip;

    @InterfaceC1497a
    @InterfaceC1498b("tool_tip")
    private final KycToolTip toolTip;

    @InterfaceC1497a
    @InterfaceC1498b("work_nature")
    private final KycWorkNature workNature;

    public static final class Creator implements Parcelable.Creator<KycDnfbpGuide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDnfbpGuide createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            j.g(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            KycWorkNature kycWorkNatureCreateFromParcel = parcel.readInt() == 0 ? null : KycWorkNature.CREATOR.createFromParcel(parcel);
            KycToolTip kycToolTipCreateFromParcel = parcel.readInt() == 0 ? null : KycToolTip.CREATOR.createFromParcel(parcel);
            int I4 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int I9 = 0;
                while (I9 != i) {
                    I9 = AbstractC1213b.I(KycJobTitles.CREATOR, parcel, arrayList, I9, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i4 = parcel.readInt();
                arrayList2 = new ArrayList(i4);
                while (I4 != i4) {
                    I4 = AbstractC1213b.I(KycIncomeSources.CREATOR, parcel, arrayList2, I4, 1);
                }
            }
            return new KycDnfbpGuide(numValueOf, kycWorkNatureCreateFromParcel, kycToolTipCreateFromParcel, arrayList, arrayList2, parcel.readInt() == 0 ? null : KycQuestion.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? KycSummaryToolTip.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycDnfbpGuide[] newArray(int i) {
            return new KycDnfbpGuide[i];
        }
    }

    public KycDnfbpGuide() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycDnfbpGuide copy$default(KycDnfbpGuide kycDnfbpGuide, Integer num, KycWorkNature kycWorkNature, KycToolTip kycToolTip, List list, List list2, KycQuestion kycQuestion, KycSummaryToolTip kycSummaryToolTip, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycDnfbpGuide.id;
        }
        if ((i & 2) != 0) {
            kycWorkNature = kycDnfbpGuide.workNature;
        }
        if ((i & 4) != 0) {
            kycToolTip = kycDnfbpGuide.toolTip;
        }
        if ((i & 8) != 0) {
            list = kycDnfbpGuide.jobTitles;
        }
        if ((i & 16) != 0) {
            list2 = kycDnfbpGuide.incomeSources;
        }
        if ((i & 32) != 0) {
            kycQuestion = kycDnfbpGuide.question;
        }
        if ((i & 64) != 0) {
            kycSummaryToolTip = kycDnfbpGuide.summaryToolTip;
        }
        KycQuestion kycQuestion2 = kycQuestion;
        KycSummaryToolTip kycSummaryToolTip2 = kycSummaryToolTip;
        List list3 = list2;
        KycToolTip kycToolTip2 = kycToolTip;
        return kycDnfbpGuide.copy(num, kycWorkNature, kycToolTip2, list, list3, kycQuestion2, kycSummaryToolTip2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final KycWorkNature component2() {
        return this.workNature;
    }

    public final KycToolTip component3() {
        return this.toolTip;
    }

    public final List<KycJobTitles> component4() {
        return this.jobTitles;
    }

    public final List<KycIncomeSources> component5() {
        return this.incomeSources;
    }

    public final KycQuestion component6() {
        return this.question;
    }

    public final KycSummaryToolTip component7() {
        return this.summaryToolTip;
    }

    public final KycDnfbpGuide copy(Integer num, KycWorkNature kycWorkNature, KycToolTip kycToolTip, List<KycJobTitles> list, List<KycIncomeSources> list2, KycQuestion kycQuestion, KycSummaryToolTip kycSummaryToolTip) {
        return new KycDnfbpGuide(num, kycWorkNature, kycToolTip, list, list2, kycQuestion, kycSummaryToolTip);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDnfbpGuide)) {
            return false;
        }
        KycDnfbpGuide kycDnfbpGuide = (KycDnfbpGuide) obj;
        return j.b(this.id, kycDnfbpGuide.id) && j.b(this.workNature, kycDnfbpGuide.workNature) && j.b(this.toolTip, kycDnfbpGuide.toolTip) && j.b(this.jobTitles, kycDnfbpGuide.jobTitles) && j.b(this.incomeSources, kycDnfbpGuide.incomeSources) && j.b(this.question, kycDnfbpGuide.question) && j.b(this.summaryToolTip, kycDnfbpGuide.summaryToolTip);
    }

    public final Integer getId() {
        return this.id;
    }

    public final List<KycIncomeSources> getIncomeSources() {
        return this.incomeSources;
    }

    public final List<KycJobTitles> getJobTitles() {
        return this.jobTitles;
    }

    public final KycQuestion getQuestion() {
        return this.question;
    }

    public final KycSummaryToolTip getSummaryToolTip() {
        return this.summaryToolTip;
    }

    public final KycToolTip getToolTip() {
        return this.toolTip;
    }

    public final KycWorkNature getWorkNature() {
        return this.workNature;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        KycWorkNature kycWorkNature = this.workNature;
        int iHashCode2 = (iHashCode + (kycWorkNature == null ? 0 : kycWorkNature.hashCode())) * 31;
        KycToolTip kycToolTip = this.toolTip;
        int iHashCode3 = (iHashCode2 + (kycToolTip == null ? 0 : kycToolTip.hashCode())) * 31;
        List<KycJobTitles> list = this.jobTitles;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<KycIncomeSources> list2 = this.incomeSources;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        KycQuestion kycQuestion = this.question;
        int iHashCode6 = (iHashCode5 + (kycQuestion == null ? 0 : kycQuestion.hashCode())) * 31;
        KycSummaryToolTip kycSummaryToolTip = this.summaryToolTip;
        return iHashCode6 + (kycSummaryToolTip != null ? kycSummaryToolTip.hashCode() : 0);
    }

    public String toString() {
        return "KycDnfbpGuide(id=" + this.id + ", workNature=" + this.workNature + ", toolTip=" + this.toolTip + ", jobTitles=" + this.jobTitles + ", incomeSources=" + this.incomeSources + ", question=" + this.question + ", summaryToolTip=" + this.summaryToolTip + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num);
        }
        KycWorkNature kycWorkNature = this.workNature;
        if (kycWorkNature == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycWorkNature.writeToParcel(dest, i);
        }
        KycToolTip kycToolTip = this.toolTip;
        if (kycToolTip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycToolTip.writeToParcel(dest, i);
        }
        List<KycJobTitles> list = this.jobTitles;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itP = AbstractC1213b.P(dest, 1, list);
            while (itP.hasNext()) {
                ((KycJobTitles) itP.next()).writeToParcel(dest, i);
            }
        }
        List<KycIncomeSources> list2 = this.incomeSources;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itP2 = AbstractC1213b.P(dest, 1, list2);
            while (itP2.hasNext()) {
                ((KycIncomeSources) itP2.next()).writeToParcel(dest, i);
            }
        }
        KycQuestion kycQuestion = this.question;
        if (kycQuestion == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycQuestion.writeToParcel(dest, i);
        }
        KycSummaryToolTip kycSummaryToolTip = this.summaryToolTip;
        if (kycSummaryToolTip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycSummaryToolTip.writeToParcel(dest, i);
        }
    }

    public KycDnfbpGuide(Integer num, KycWorkNature kycWorkNature, KycToolTip kycToolTip, List<KycJobTitles> list, List<KycIncomeSources> list2, KycQuestion kycQuestion, KycSummaryToolTip kycSummaryToolTip) {
        this.id = num;
        this.workNature = kycWorkNature;
        this.toolTip = kycToolTip;
        this.jobTitles = list;
        this.incomeSources = list2;
        this.question = kycQuestion;
        this.summaryToolTip = kycSummaryToolTip;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public KycDnfbpGuide(java.lang.Integer r2, com.paymaya.domain.model.KycWorkNature r3, com.paymaya.domain.model.KycToolTip r4, java.util.List r5, java.util.List r6, com.paymaya.domain.model.KycQuestion r7, com.paymaya.domain.model.KycSummaryToolTip r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L9
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L9:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lf
            r3 = r0
        Lf:
            r10 = r9 & 4
            if (r10 == 0) goto L14
            r4 = r0
        L14:
            r10 = r9 & 8
            if (r10 == 0) goto L1a
            cj.C r5 = cj.C1112C.f9377a
        L1a:
            r10 = r9 & 16
            if (r10 == 0) goto L20
            cj.C r6 = cj.C1112C.f9377a
        L20:
            r10 = r9 & 32
            if (r10 == 0) goto L25
            r7 = r0
        L25:
            r9 = r9 & 64
            if (r9 == 0) goto L32
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3a
        L32:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.domain.model.KycDnfbpGuide.<init>(java.lang.Integer, com.paymaya.domain.model.KycWorkNature, com.paymaya.domain.model.KycToolTip, java.util.List, java.util.List, com.paymaya.domain.model.KycQuestion, com.paymaya.domain.model.KycSummaryToolTip, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
