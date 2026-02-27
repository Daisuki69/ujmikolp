package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class ReferralEligibilityData implements Parcelable {
    public static final Parcelable.Creator<ReferralEligibilityData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("friend")
    private final boolean canBeReferred;

    @InterfaceC1497a
    @InterfaceC1498b("advocate")
    private final boolean canRefer;

    public static final class Creator implements Parcelable.Creator<ReferralEligibilityData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralEligibilityData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new ReferralEligibilityData(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralEligibilityData[] newArray(int i) {
            return new ReferralEligibilityData[i];
        }
    }

    public ReferralEligibilityData(boolean z4, boolean z5) {
        this.canBeReferred = z4;
        this.canRefer = z5;
    }

    public static /* synthetic */ ReferralEligibilityData copy$default(ReferralEligibilityData referralEligibilityData, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = referralEligibilityData.canBeReferred;
        }
        if ((i & 2) != 0) {
            z5 = referralEligibilityData.canRefer;
        }
        return referralEligibilityData.copy(z4, z5);
    }

    public final boolean component1() {
        return this.canBeReferred;
    }

    public final boolean component2() {
        return this.canRefer;
    }

    public final ReferralEligibilityData copy(boolean z4, boolean z5) {
        return new ReferralEligibilityData(z4, z5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralEligibilityData)) {
            return false;
        }
        ReferralEligibilityData referralEligibilityData = (ReferralEligibilityData) obj;
        return this.canBeReferred == referralEligibilityData.canBeReferred && this.canRefer == referralEligibilityData.canRefer;
    }

    public final boolean getCanBeReferred() {
        return this.canBeReferred;
    }

    public final boolean getCanRefer() {
        return this.canRefer;
    }

    public int hashCode() {
        return ((this.canBeReferred ? 1231 : 1237) * 31) + (this.canRefer ? 1231 : 1237);
    }

    public String toString() {
        return "ReferralEligibilityData(canBeReferred=" + this.canBeReferred + ", canRefer=" + this.canRefer + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeInt(this.canBeReferred ? 1 : 0);
        dest.writeInt(this.canRefer ? 1 : 0);
    }
}
