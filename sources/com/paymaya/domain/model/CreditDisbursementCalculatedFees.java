package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AppsFlyerProperties;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditDisbursementCalculatedFees implements Parcelable {
    public static final Parcelable.Creator<CreditDisbursementCalculatedFees> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(AppsFlyerProperties.CURRENCY_CODE)
    private final String currencyCode;

    @InterfaceC1497a
    @InterfaceC1498b("dst")
    private final Double dst;

    @InterfaceC1497a
    @InterfaceC1498b("feeRate")
    private final Double feeRate;

    @InterfaceC1497a
    @InterfaceC1498b("loanAccountId")
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("principal")
    private final Double principal;

    @InterfaceC1497a
    @InterfaceC1498b("serviceFee")
    private final Double serviceFee;

    @InterfaceC1497a
    @InterfaceC1498b("total")
    private final Double total;

    public static final class Creator implements Parcelable.Creator<CreditDisbursementCalculatedFees> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditDisbursementCalculatedFees createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new CreditDisbursementCalculatedFees(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditDisbursementCalculatedFees[] newArray(int i) {
            return new CreditDisbursementCalculatedFees[i];
        }
    }

    public CreditDisbursementCalculatedFees() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ CreditDisbursementCalculatedFees copy$default(CreditDisbursementCalculatedFees creditDisbursementCalculatedFees, String str, Double d10, String str2, Double d11, Double d12, Double d13, Double d14, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditDisbursementCalculatedFees.id;
        }
        if ((i & 2) != 0) {
            d10 = creditDisbursementCalculatedFees.principal;
        }
        if ((i & 4) != 0) {
            str2 = creditDisbursementCalculatedFees.currencyCode;
        }
        if ((i & 8) != 0) {
            d11 = creditDisbursementCalculatedFees.serviceFee;
        }
        if ((i & 16) != 0) {
            d12 = creditDisbursementCalculatedFees.feeRate;
        }
        if ((i & 32) != 0) {
            d13 = creditDisbursementCalculatedFees.dst;
        }
        if ((i & 64) != 0) {
            d14 = creditDisbursementCalculatedFees.total;
        }
        Double d15 = d13;
        Double d16 = d14;
        Double d17 = d12;
        String str3 = str2;
        return creditDisbursementCalculatedFees.copy(str, d10, str3, d11, d17, d15, d16);
    }

    public final String component1() {
        return this.id;
    }

    public final Double component2() {
        return this.principal;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final Double component4() {
        return this.serviceFee;
    }

    public final Double component5() {
        return this.feeRate;
    }

    public final Double component6() {
        return this.dst;
    }

    public final Double component7() {
        return this.total;
    }

    public final CreditDisbursementCalculatedFees copy(String str, Double d10, String str2, Double d11, Double d12, Double d13, Double d14) {
        return new CreditDisbursementCalculatedFees(str, d10, str2, d11, d12, d13, d14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditDisbursementCalculatedFees)) {
            return false;
        }
        CreditDisbursementCalculatedFees creditDisbursementCalculatedFees = (CreditDisbursementCalculatedFees) obj;
        return j.b(this.id, creditDisbursementCalculatedFees.id) && j.b(this.principal, creditDisbursementCalculatedFees.principal) && j.b(this.currencyCode, creditDisbursementCalculatedFees.currencyCode) && j.b(this.serviceFee, creditDisbursementCalculatedFees.serviceFee) && j.b(this.feeRate, creditDisbursementCalculatedFees.feeRate) && j.b(this.dst, creditDisbursementCalculatedFees.dst) && j.b(this.total, creditDisbursementCalculatedFees.total);
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Double getDst() {
        return this.dst;
    }

    public final Double getFeeRate() {
        return this.feeRate;
    }

    public final String getId() {
        return this.id;
    }

    public final Double getPrincipal() {
        return this.principal;
    }

    public final Double getServiceFee() {
        return this.serviceFee;
    }

    public final Double getTotal() {
        return this.total;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.principal;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str2 = this.currencyCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d11 = this.serviceFee;
        int iHashCode4 = (iHashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.feeRate;
        int iHashCode5 = (iHashCode4 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.dst;
        int iHashCode6 = (iHashCode5 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.total;
        return iHashCode6 + (d14 != null ? d14.hashCode() : 0);
    }

    public String toString() {
        return "CreditDisbursementCalculatedFees(id=" + this.id + ", principal=" + this.principal + ", currencyCode=" + this.currencyCode + ", serviceFee=" + this.serviceFee + ", feeRate=" + this.feeRate + ", dst=" + this.dst + ", total=" + this.total + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        Double d10 = this.principal;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        dest.writeString(this.currencyCode);
        Double d11 = this.serviceFee;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        Double d12 = this.feeRate;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        Double d13 = this.dst;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
        Double d14 = this.total;
        if (d14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d14.doubleValue());
        }
    }

    public CreditDisbursementCalculatedFees(String str, Double d10, String str2, Double d11, Double d12, Double d13, Double d14) {
        this.id = str;
        this.principal = d10;
        this.currencyCode = str2;
        this.serviceFee = d11;
        this.feeRate = d12;
        this.dst = d13;
        this.total = d14;
    }

    public /* synthetic */ CreditDisbursementCalculatedFees(String str, Double d10, String str2, Double d11, Double d12, Double d13, Double d14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d10, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : d11, (i & 16) != 0 ? null : d12, (i & 32) != 0 ? null : d13, (i & 64) != 0 ? null : d14);
    }
}
