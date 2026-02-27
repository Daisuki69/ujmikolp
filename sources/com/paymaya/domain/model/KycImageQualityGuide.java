package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.webkit.ProxyConfig;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycImageQualityGuide implements Parcelable {
    public static final Parcelable.Creator<KycImageQualityGuide> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("allowed_ids")
    private final List<KycAllowedId> allowedIds;

    @InterfaceC1497a
    @InterfaceC1498b("feedback")
    private final KycImageQualityFeedback feedback;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("confidence_thresholds")
    private final List<ConfidenceThreshold> thresholds;

    public static final class Creator implements Parcelable.Creator<KycImageQualityGuide> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycImageQualityGuide createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            KycImageQualityFeedback kycImageQualityFeedbackCreateFromParcel = KycImageQualityFeedback.CREATOR.createFromParcel(parcel);
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int I4 = 0;
            int I9 = 0;
            while (I9 != i4) {
                I9 = AbstractC1213b.I(ConfidenceThreshold.CREATOR, parcel, arrayList, I9, 1);
            }
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            while (I4 != i6) {
                I4 = AbstractC1213b.I(KycAllowedId.CREATOR, parcel, arrayList2, I4, 1);
            }
            return new KycImageQualityGuide(i, kycImageQualityFeedbackCreateFromParcel, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycImageQualityGuide[] newArray(int i) {
            return new KycImageQualityGuide[i];
        }
    }

    public KycImageQualityGuide(int i, KycImageQualityFeedback feedback, List<ConfidenceThreshold> thresholds, List<KycAllowedId> allowedIds) {
        j.g(feedback, "feedback");
        j.g(thresholds, "thresholds");
        j.g(allowedIds, "allowedIds");
        this.id = i;
        this.feedback = feedback;
        this.thresholds = thresholds;
        this.allowedIds = allowedIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycImageQualityGuide copy$default(KycImageQualityGuide kycImageQualityGuide, int i, KycImageQualityFeedback kycImageQualityFeedback, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycImageQualityGuide.id;
        }
        if ((i4 & 2) != 0) {
            kycImageQualityFeedback = kycImageQualityGuide.feedback;
        }
        if ((i4 & 4) != 0) {
            list = kycImageQualityGuide.thresholds;
        }
        if ((i4 & 8) != 0) {
            list2 = kycImageQualityGuide.allowedIds;
        }
        return kycImageQualityGuide.copy(i, kycImageQualityFeedback, list, list2);
    }

    private final boolean getHasZeroPassingThreshold() {
        return getThreshold() == 0;
    }

    private final int getThreshold() {
        Object next;
        Integer threshold;
        Iterator<T> it = this.thresholds.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (j.b(((ConfidenceThreshold) next).getDecision(), ConfidenceThreshold.DECISION_PASSED)) {
                break;
            }
        }
        ConfidenceThreshold confidenceThreshold = (ConfidenceThreshold) next;
        if (confidenceThreshold == null || (threshold = confidenceThreshold.getThreshold()) == null) {
            return 0;
        }
        return threshold.intValue();
    }

    private final boolean isAcceptableAsPaper(String str) {
        Object next;
        Iterator<T> it = this.allowedIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (j.b(((KycAllowedId) next).getKey(), str)) {
                break;
            }
        }
        KycAllowedId kycAllowedId = (KycAllowedId) next;
        return j.b(kycAllowedId != null ? kycAllowedId.getAction() : null, KycAllowedId.ACTION_ALLOW);
    }

    public final String action(String idType) {
        Object next;
        String action;
        j.g(idType, "idType");
        Iterator<T> it = this.allowedIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (j.b(((KycAllowedId) next).getKey(), idType)) {
                break;
            }
        }
        KycAllowedId kycAllowedId = (KycAllowedId) next;
        return (kycAllowedId == null || (action = kycAllowedId.getAction()) == null) ? "" : action;
    }

    public final int component1() {
        return this.id;
    }

    public final KycImageQualityFeedback component2() {
        return this.feedback;
    }

    public final List<ConfidenceThreshold> component3() {
        return this.thresholds;
    }

    public final List<KycAllowedId> component4() {
        return this.allowedIds;
    }

    public final KycImageQualityGuide copy(int i, KycImageQualityFeedback feedback, List<ConfidenceThreshold> thresholds, List<KycAllowedId> allowedIds) {
        j.g(feedback, "feedback");
        j.g(thresholds, "thresholds");
        j.g(allowedIds, "allowedIds");
        return new KycImageQualityGuide(i, feedback, thresholds, allowedIds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycImageQualityGuide)) {
            return false;
        }
        KycImageQualityGuide kycImageQualityGuide = (KycImageQualityGuide) obj;
        return this.id == kycImageQualityGuide.id && j.b(this.feedback, kycImageQualityGuide.feedback) && j.b(this.thresholds, kycImageQualityGuide.thresholds) && j.b(this.allowedIds, kycImageQualityGuide.allowedIds);
    }

    public final List<KycAllowedId> getAllowedIds() {
        return this.allowedIds;
    }

    public final KycImageQualityFeedback getFeedback() {
        return this.feedback;
    }

    public final int getId() {
        return this.id;
    }

    public final List<ConfidenceThreshold> getThresholds() {
        return this.thresholds;
    }

    public int hashCode() {
        return this.allowedIds.hashCode() + AbstractC1414e.d(this.thresholds, (this.feedback.hashCode() + (this.id * 31)) * 31, 31);
    }

    public final boolean isActionAllowed(String str) {
        Object next;
        Iterator<T> it = this.allowedIds.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (j.b(((KycAllowedId) next).getKey(), ProxyConfig.MATCH_ALL_SCHEMES)) {
                break;
            }
        }
        KycAllowedId kycAllowedId = (KycAllowedId) next;
        return isAcceptableAsPaper(str) || j.b(kycAllowedId != null ? kycAllowedId.getAction() : null, KycAllowedId.ACTION_ALLOW);
    }

    public final boolean matchesFeedback(String str) {
        return j.b(this.feedback.getKey(), str);
    }

    public final boolean passesThreshold(Float f) {
        return (f != null ? f.floatValue() : 0.0f) >= ((float) getThreshold());
    }

    public String toString() {
        return "KycImageQualityGuide(id=" + this.id + ", feedback=" + this.feedback + ", thresholds=" + this.thresholds + ", allowedIds=" + this.allowedIds + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        this.feedback.writeToParcel(dest, i);
        Iterator itQ = AbstractC1213b.Q(this.thresholds, dest);
        while (itQ.hasNext()) {
            ((ConfidenceThreshold) itQ.next()).writeToParcel(dest, i);
        }
        Iterator itQ2 = AbstractC1213b.Q(this.allowedIds, dest);
        while (itQ2.hasNext()) {
            ((KycAllowedId) itQ2.next()).writeToParcel(dest, i);
        }
    }

    public KycImageQualityGuide(int i, KycImageQualityFeedback kycImageQualityFeedback, List list, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, kycImageQualityFeedback, (i4 & 4) != 0 ? C1112C.f9377a : list, (i4 & 8) != 0 ? C1112C.f9377a : list2);
    }
}
