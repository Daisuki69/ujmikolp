package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.common.utility.AbstractC1213b;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ConfidenceThreshold implements Parcelable {
    public static final String DECISION_FAILED = "FAILED";
    public static final String DECISION_PASSED = "PASSED";

    @InterfaceC1497a
    @InterfaceC1498b("decision")
    private final String decision;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final Integer id;

    @InterfaceC1497a
    @InterfaceC1498b("threshold")
    private final Integer threshold;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ConfidenceThreshold> CREATOR = new Creator();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Creator implements Parcelable.Creator<ConfidenceThreshold> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfidenceThreshold createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ConfidenceThreshold(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfidenceThreshold[] newArray(int i) {
            return new ConfidenceThreshold[i];
        }
    }

    public ConfidenceThreshold() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ConfidenceThreshold copy$default(ConfidenceThreshold confidenceThreshold, Integer num, Integer num2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = confidenceThreshold.id;
        }
        if ((i & 2) != 0) {
            num2 = confidenceThreshold.threshold;
        }
        if ((i & 4) != 0) {
            str = confidenceThreshold.decision;
        }
        return confidenceThreshold.copy(num, num2, str);
    }

    public final Integer component1() {
        return this.id;
    }

    public final Integer component2() {
        return this.threshold;
    }

    public final String component3() {
        return this.decision;
    }

    public final ConfidenceThreshold copy(Integer num, Integer num2, String decision) {
        j.g(decision, "decision");
        return new ConfidenceThreshold(num, num2, decision);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfidenceThreshold)) {
            return false;
        }
        ConfidenceThreshold confidenceThreshold = (ConfidenceThreshold) obj;
        return j.b(this.id, confidenceThreshold.id) && j.b(this.threshold, confidenceThreshold.threshold) && j.b(this.decision, confidenceThreshold.decision);
    }

    public final String getDecision() {
        return this.decision;
    }

    public final Integer getId() {
        return this.id;
    }

    public final Integer getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.threshold;
        return this.decision.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public String toString() {
        Integer num = this.id;
        Integer num2 = this.threshold;
        String str = this.decision;
        StringBuilder sb2 = new StringBuilder("ConfidenceThreshold(id=");
        sb2.append(num);
        sb2.append(", threshold=");
        sb2.append(num2);
        sb2.append(", decision=");
        return s.p(sb2, str, ")");
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
        Integer num2 = this.threshold;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.T(dest, 1, num2);
        }
        dest.writeString(this.decision);
    }

    public ConfidenceThreshold(Integer num, Integer num2, String decision) {
        j.g(decision, "decision");
        this.id = num;
        this.threshold = num2;
        this.decision = decision;
    }

    public /* synthetic */ ConfidenceThreshold(Integer num, Integer num2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? "" : str);
    }
}
