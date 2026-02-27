package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralEligibilityV2 implements Parcelable {
    public static final Parcelable.Creator<ReferralEligibilityV2> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("data")
    private final ReferralEligibilityData data;

    public static final class Creator implements Parcelable.Creator<ReferralEligibilityV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralEligibilityV2 createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReferralEligibilityV2(ReferralEligibilityData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralEligibilityV2[] newArray(int i) {
            return new ReferralEligibilityV2[i];
        }
    }

    public ReferralEligibilityV2(ReferralEligibilityData data) {
        j.g(data, "data");
        this.data = data;
    }

    public static /* synthetic */ ReferralEligibilityV2 copy$default(ReferralEligibilityV2 referralEligibilityV2, ReferralEligibilityData referralEligibilityData, int i, Object obj) {
        if ((i & 1) != 0) {
            referralEligibilityData = referralEligibilityV2.data;
        }
        return referralEligibilityV2.copy(referralEligibilityData);
    }

    public final ReferralEligibilityData component1() {
        return this.data;
    }

    public final ReferralEligibilityV2 copy(ReferralEligibilityData data) {
        j.g(data, "data");
        return new ReferralEligibilityV2(data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReferralEligibilityV2) && j.b(this.data, ((ReferralEligibilityV2) obj).data);
    }

    public final ReferralEligibilityData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "ReferralEligibilityV2(data=" + this.data + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.data.writeToParcel(dest, i);
    }
}
