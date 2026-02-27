package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditAmount implements Parcelable {
    public static final Parcelable.Creator<CreditAmount> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("fee")
    private final double fee;

    @InterfaceC1497a
    @InterfaceC1498b("interest")
    private final double interest;

    @InterfaceC1497a
    @InterfaceC1498b("penalty")
    private final double penalty;

    @InterfaceC1497a
    @InterfaceC1498b("principal")
    private final double principal;

    @InterfaceC1497a
    @InterfaceC1498b("total")
    private final double total;

    public static final class Creator implements Parcelable.Creator<CreditAmount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditAmount createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditAmount(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditAmount[] newArray(int i) {
            return new CreditAmount[i];
        }
    }

    public CreditAmount(double d10, double d11, double d12, double d13, double d14) {
        this.fee = d10;
        this.interest = d11;
        this.penalty = d12;
        this.principal = d13;
        this.total = d14;
    }

    public static /* synthetic */ CreditAmount copy$default(CreditAmount creditAmount, double d10, double d11, double d12, double d13, double d14, int i, Object obj) {
        if ((i & 1) != 0) {
            d10 = creditAmount.fee;
        }
        double d15 = d10;
        if ((i & 2) != 0) {
            d11 = creditAmount.interest;
        }
        return creditAmount.copy(d15, d11, (i & 4) != 0 ? creditAmount.penalty : d12, (i & 8) != 0 ? creditAmount.principal : d13, (i & 16) != 0 ? creditAmount.total : d14);
    }

    public final double component1() {
        return this.fee;
    }

    public final double component2() {
        return this.interest;
    }

    public final double component3() {
        return this.penalty;
    }

    public final double component4() {
        return this.principal;
    }

    public final double component5() {
        return this.total;
    }

    public final CreditAmount copy(double d10, double d11, double d12, double d13, double d14) {
        return new CreditAmount(d10, d11, d12, d13, d14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditAmount)) {
            return false;
        }
        CreditAmount creditAmount = (CreditAmount) obj;
        return Double.compare(this.fee, creditAmount.fee) == 0 && Double.compare(this.interest, creditAmount.interest) == 0 && Double.compare(this.penalty, creditAmount.penalty) == 0 && Double.compare(this.principal, creditAmount.principal) == 0 && Double.compare(this.total, creditAmount.total) == 0;
    }

    public final double getFee() {
        return this.fee;
    }

    public final double getInterest() {
        return this.interest;
    }

    public final double getPenalty() {
        return this.penalty;
    }

    public final double getPrincipal() {
        return this.principal;
    }

    public final double getTotal() {
        return this.total;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.fee);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.interest);
        int i = ((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31;
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.penalty);
        int i4 = (i + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)))) * 31;
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.principal);
        int i6 = (i4 + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)))) * 31;
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.total);
        return i6 + ((int) ((jDoubleToLongBits5 >>> 32) ^ jDoubleToLongBits5));
    }

    public String toString() {
        return "CreditAmount(fee=" + this.fee + ", interest=" + this.interest + ", penalty=" + this.penalty + ", principal=" + this.principal + ", total=" + this.total + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeDouble(this.fee);
        dest.writeDouble(this.interest);
        dest.writeDouble(this.penalty);
        dest.writeDouble(this.principal);
        dest.writeDouble(this.total);
    }
}
