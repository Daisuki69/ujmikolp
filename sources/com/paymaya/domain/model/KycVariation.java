package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
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
public final class KycVariation implements Parcelable {
    public static final Parcelable.Creator<KycVariation> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("confidence_thresholds")
    private final List<ConfidenceThreshold> confidenceThreshold;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final int id;

    @InterfaceC1497a
    @InterfaceC1498b("key")
    private final String key;

    public static final class Creator implements Parcelable.Creator<KycVariation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycVariation createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            int i = parcel.readInt();
            String string = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            int I4 = 0;
            while (I4 != i4) {
                I4 = AbstractC1213b.I(ConfidenceThreshold.CREATOR, parcel, arrayList, I4, 1);
            }
            return new KycVariation(i, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KycVariation[] newArray(int i) {
            return new KycVariation[i];
        }
    }

    public KycVariation(int i, String key, List<ConfidenceThreshold> confidenceThreshold) {
        j.g(key, "key");
        j.g(confidenceThreshold, "confidenceThreshold");
        this.id = i;
        this.key = key;
        this.confidenceThreshold = confidenceThreshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KycVariation copy$default(KycVariation kycVariation, int i, String str, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = kycVariation.id;
        }
        if ((i4 & 2) != 0) {
            str = kycVariation.key;
        }
        if ((i4 & 4) != 0) {
            list = kycVariation.confidenceThreshold;
        }
        return kycVariation.copy(i, str, list);
    }

    public final int component1() {
        return this.id;
    }

    public final String component2() {
        return this.key;
    }

    public final List<ConfidenceThreshold> component3() {
        return this.confidenceThreshold;
    }

    public final KycVariation copy(int i, String key, List<ConfidenceThreshold> confidenceThreshold) {
        j.g(key, "key");
        j.g(confidenceThreshold, "confidenceThreshold");
        return new KycVariation(i, key, confidenceThreshold);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycVariation)) {
            return false;
        }
        KycVariation kycVariation = (KycVariation) obj;
        return this.id == kycVariation.id && j.b(this.key, kycVariation.key) && j.b(this.confidenceThreshold, kycVariation.confidenceThreshold);
    }

    public final List<ConfidenceThreshold> getConfidenceThreshold() {
        return this.confidenceThreshold;
    }

    public final boolean getHasZeroPassingThreshold() {
        return getThreshold() == 0;
    }

    public final int getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getThreshold() {
        Object next;
        Integer threshold;
        Iterator<T> it = this.confidenceThreshold.iterator();
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

    public int hashCode() {
        return this.confidenceThreshold.hashCode() + AbstractC1414e.c(this.id * 31, 31, this.key);
    }

    public String toString() {
        int i = this.id;
        String str = this.key;
        List<ConfidenceThreshold> list = this.confidenceThreshold;
        StringBuilder sb2 = new StringBuilder("KycVariation(id=");
        sb2.append(i);
        sb2.append(", key=");
        sb2.append(str);
        sb2.append(", confidenceThreshold=");
        return s.r(sb2, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.id);
        dest.writeString(this.key);
        Iterator itQ = AbstractC1213b.Q(this.confidenceThreshold, dest);
        while (itQ.hasNext()) {
            ((ConfidenceThreshold) itQ.next()).writeToParcel(dest, i);
        }
    }

    public KycVariation(int i, String str, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i4 & 4) != 0 ? C1112C.f9377a : list);
    }
}
