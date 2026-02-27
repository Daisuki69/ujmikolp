package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditWalletBannerDetails implements Parcelable {
    public static final Parcelable.Creator<CreditWalletBannerDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("available_credit")
    private final double availableCredit;

    public static final class Creator implements Parcelable.Creator<CreditWalletBannerDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditWalletBannerDetails createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditWalletBannerDetails(parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditWalletBannerDetails[] newArray(int i) {
            return new CreditWalletBannerDetails[i];
        }
    }

    public CreditWalletBannerDetails(double d10) {
        this.availableCredit = d10;
    }

    public static /* synthetic */ CreditWalletBannerDetails copy$default(CreditWalletBannerDetails creditWalletBannerDetails, double d10, int i, Object obj) {
        if ((i & 1) != 0) {
            d10 = creditWalletBannerDetails.availableCredit;
        }
        return creditWalletBannerDetails.copy(d10);
    }

    public final double component1() {
        return this.availableCredit;
    }

    public final CreditWalletBannerDetails copy(double d10) {
        return new CreditWalletBannerDetails(d10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreditWalletBannerDetails) && Double.compare(this.availableCredit, ((CreditWalletBannerDetails) obj).availableCredit) == 0;
    }

    public final double getAvailableCredit() {
        return this.availableCredit;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.availableCredit);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public String toString() {
        return "CreditWalletBannerDetails(availableCredit=" + this.availableCredit + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeDouble(this.availableCredit);
    }
}
