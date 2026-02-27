package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditServiceFee implements Parcelable {
    public static final Parcelable.Creator<CreditServiceFee> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("feeRate")
    private final String feeRate;

    public static final class Creator implements Parcelable.Creator<CreditServiceFee> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditServiceFee createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditServiceFee(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditServiceFee[] newArray(int i) {
            return new CreditServiceFee[i];
        }
    }

    public CreditServiceFee(String feeRate) {
        j.g(feeRate, "feeRate");
        this.feeRate = feeRate;
    }

    public static /* synthetic */ CreditServiceFee copy$default(CreditServiceFee creditServiceFee, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditServiceFee.feeRate;
        }
        return creditServiceFee.copy(str);
    }

    public final String component1() {
        return this.feeRate;
    }

    public final CreditServiceFee copy(String feeRate) {
        j.g(feeRate, "feeRate");
        return new CreditServiceFee(feeRate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreditServiceFee) && j.b(this.feeRate, ((CreditServiceFee) obj).feeRate);
    }

    public final String getFeeRate() {
        return this.feeRate;
    }

    public int hashCode() {
        return this.feeRate.hashCode();
    }

    public String toString() {
        return s.j("CreditServiceFee(feeRate=", this.feeRate, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.feeRate);
    }
}
