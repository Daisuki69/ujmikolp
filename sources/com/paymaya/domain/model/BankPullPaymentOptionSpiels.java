package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class BankPullPaymentOptionSpiels implements Parcelable {
    public static final Parcelable.Creator<BankPullPaymentOptionSpiels> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("amount")
    private final String amount;

    public static final class Creator implements Parcelable.Creator<BankPullPaymentOptionSpiels> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankPullPaymentOptionSpiels createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new BankPullPaymentOptionSpiels(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankPullPaymentOptionSpiels[] newArray(int i) {
            return new BankPullPaymentOptionSpiels[i];
        }
    }

    public BankPullPaymentOptionSpiels(String str) {
        this.amount = str;
    }

    public static /* synthetic */ BankPullPaymentOptionSpiels copy$default(BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankPullPaymentOptionSpiels.amount;
        }
        return bankPullPaymentOptionSpiels.copy(str);
    }

    public final String component1() {
        return this.amount;
    }

    public final BankPullPaymentOptionSpiels copy(String str) {
        return new BankPullPaymentOptionSpiels(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BankPullPaymentOptionSpiels) && j.b(this.amount, ((BankPullPaymentOptionSpiels) obj).amount);
    }

    public final String getAmount() {
        return this.amount;
    }

    public int hashCode() {
        String str = this.amount;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("BankPullPaymentOptionSpiels(amount=", this.amount, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.amount);
    }
}
