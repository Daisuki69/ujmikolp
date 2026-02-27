package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycIncomeSources implements Parcelable {
    public static final Parcelable.Creator<KycIncomeSources> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("income_src")
    private final KycIncomeSource incomeSource;

    @InterfaceC1497a
    @InterfaceC1498b("question")
    private final KycQuestion question;

    @InterfaceC1497a
    @InterfaceC1498b("summary_tooltip")
    private final KycSummaryToolTip summaryToolTip;

    @InterfaceC1497a
    @InterfaceC1498b("tool_tip")
    private final KycToolTip toolTip;

    public static final class Creator implements Parcelable.Creator<KycIncomeSources> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycIncomeSources createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new KycIncomeSources(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : KycIncomeSource.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : KycToolTip.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : KycQuestion.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? KycSummaryToolTip.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycIncomeSources[] newArray(int i) {
            return new KycIncomeSources[i];
        }
    }

    public KycIncomeSources() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ KycIncomeSources copy$default(KycIncomeSources kycIncomeSources, Integer num, KycIncomeSource kycIncomeSource, KycToolTip kycToolTip, KycQuestion kycQuestion, KycSummaryToolTip kycSummaryToolTip, int i, Object obj) {
        if ((i & 1) != 0) {
            num = kycIncomeSources.id;
        }
        if ((i & 2) != 0) {
            kycIncomeSource = kycIncomeSources.incomeSource;
        }
        if ((i & 4) != 0) {
            kycToolTip = kycIncomeSources.toolTip;
        }
        if ((i & 8) != 0) {
            kycQuestion = kycIncomeSources.question;
        }
        if ((i & 16) != 0) {
            kycSummaryToolTip = kycIncomeSources.summaryToolTip;
        }
        KycSummaryToolTip kycSummaryToolTip2 = kycSummaryToolTip;
        KycToolTip kycToolTip2 = kycToolTip;
        return kycIncomeSources.copy(num, kycIncomeSource, kycToolTip2, kycQuestion, kycSummaryToolTip2);
    }

    public final Integer component1() {
        return this.id;
    }

    public final KycIncomeSource component2() {
        return this.incomeSource;
    }

    public final KycToolTip component3() {
        return this.toolTip;
    }

    public final KycQuestion component4() {
        return this.question;
    }

    public final KycSummaryToolTip component5() {
        return this.summaryToolTip;
    }

    public final KycIncomeSources copy(Integer num, KycIncomeSource kycIncomeSource, KycToolTip kycToolTip, KycQuestion kycQuestion, KycSummaryToolTip kycSummaryToolTip) {
        return new KycIncomeSources(num, kycIncomeSource, kycToolTip, kycQuestion, kycSummaryToolTip);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycIncomeSources)) {
            return false;
        }
        KycIncomeSources kycIncomeSources = (KycIncomeSources) obj;
        return j.b(this.id, kycIncomeSources.id) && j.b(this.incomeSource, kycIncomeSources.incomeSource) && j.b(this.toolTip, kycIncomeSources.toolTip) && j.b(this.question, kycIncomeSources.question) && j.b(this.summaryToolTip, kycIncomeSources.summaryToolTip);
    }

    public final Integer getId() {
        return this.id;
    }

    public final KycIncomeSource getIncomeSource() {
        return this.incomeSource;
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

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        KycIncomeSource kycIncomeSource = this.incomeSource;
        int iHashCode2 = (iHashCode + (kycIncomeSource == null ? 0 : kycIncomeSource.hashCode())) * 31;
        KycToolTip kycToolTip = this.toolTip;
        int iHashCode3 = (iHashCode2 + (kycToolTip == null ? 0 : kycToolTip.hashCode())) * 31;
        KycQuestion kycQuestion = this.question;
        int iHashCode4 = (iHashCode3 + (kycQuestion == null ? 0 : kycQuestion.hashCode())) * 31;
        KycSummaryToolTip kycSummaryToolTip = this.summaryToolTip;
        return iHashCode4 + (kycSummaryToolTip != null ? kycSummaryToolTip.hashCode() : 0);
    }

    public String toString() {
        return "KycIncomeSources(id=" + this.id + ", incomeSource=" + this.incomeSource + ", toolTip=" + this.toolTip + ", question=" + this.question + ", summaryToolTip=" + this.summaryToolTip + ")";
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
        KycIncomeSource kycIncomeSource = this.incomeSource;
        if (kycIncomeSource == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycIncomeSource.writeToParcel(dest, i);
        }
        KycToolTip kycToolTip = this.toolTip;
        if (kycToolTip == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            kycToolTip.writeToParcel(dest, i);
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

    public KycIncomeSources(Integer num, KycIncomeSource kycIncomeSource, KycToolTip kycToolTip, KycQuestion kycQuestion, KycSummaryToolTip kycSummaryToolTip) {
        this.id = num;
        this.incomeSource = kycIncomeSource;
        this.toolTip = kycToolTip;
        this.question = kycQuestion;
        this.summaryToolTip = kycSummaryToolTip;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ KycIncomeSources(java.lang.Integer r2, com.paymaya.domain.model.KycIncomeSource r3, com.paymaya.domain.model.KycToolTip r4, com.paymaya.domain.model.KycQuestion r5, com.paymaya.domain.model.KycSummaryToolTip r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L9
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L9:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lf
            r3 = r0
        Lf:
            r8 = r7 & 4
            if (r8 == 0) goto L14
            r4 = r0
        L14:
            r8 = r7 & 8
            if (r8 == 0) goto L19
            r5 = r0
        L19:
            r7 = r7 & 16
            if (r7 == 0) goto L24
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2a
        L24:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2a:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.domain.model.KycIncomeSources.<init>(java.lang.Integer, com.paymaya.domain.model.KycIncomeSource, com.paymaya.domain.model.KycToolTip, com.paymaya.domain.model.KycQuestion, com.paymaya.domain.model.KycSummaryToolTip, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
