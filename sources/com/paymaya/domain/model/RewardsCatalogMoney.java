package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RewardsCatalogMoney implements Parcelable {
    public static final Parcelable.Creator<RewardsCatalogMoney> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("currency")
    private final String currency;

    @InterfaceC1497a
    @InterfaceC1498b("value")
    private final double value;

    public static final class Creator implements Parcelable.Creator<RewardsCatalogMoney> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogMoney createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new RewardsCatalogMoney(parcel.readString(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsCatalogMoney[] newArray(int i) {
            return new RewardsCatalogMoney[i];
        }
    }

    public RewardsCatalogMoney(String currency, double d10) {
        j.g(currency, "currency");
        this.currency = currency;
        this.value = d10;
    }

    public static /* synthetic */ RewardsCatalogMoney copy$default(RewardsCatalogMoney rewardsCatalogMoney, String str, double d10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsCatalogMoney.currency;
        }
        if ((i & 2) != 0) {
            d10 = rewardsCatalogMoney.value;
        }
        return rewardsCatalogMoney.copy(str, d10);
    }

    public final String component1() {
        return this.currency;
    }

    public final double component2() {
        return this.value;
    }

    public final RewardsCatalogMoney copy(String currency, double d10) {
        j.g(currency, "currency");
        return new RewardsCatalogMoney(currency, d10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsCatalogMoney)) {
            return false;
        }
        RewardsCatalogMoney rewardsCatalogMoney = (RewardsCatalogMoney) obj;
        return j.b(this.currency, rewardsCatalogMoney.currency) && Double.compare(this.value, rewardsCatalogMoney.value) == 0;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.currency.hashCode() * 31;
        long jDoubleToLongBits = Double.doubleToLongBits(this.value);
        return iHashCode + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    public String toString() {
        return "RewardsCatalogMoney(currency=" + this.currency + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.currency);
        dest.writeDouble(this.value);
    }
}
