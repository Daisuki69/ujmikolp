package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MerchantFulfillment implements Parcelable {
    public static final Parcelable.Creator<MerchantFulfillment> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("invoice_number")
    private final String invoiceNumber;

    public static final class Creator implements Parcelable.Creator<MerchantFulfillment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantFulfillment createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MerchantFulfillment(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantFulfillment[] newArray(int i) {
            return new MerchantFulfillment[i];
        }
    }

    public MerchantFulfillment(String str) {
        this.invoiceNumber = str;
    }

    public static /* synthetic */ MerchantFulfillment copy$default(MerchantFulfillment merchantFulfillment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = merchantFulfillment.invoiceNumber;
        }
        return merchantFulfillment.copy(str);
    }

    public final String component1() {
        return this.invoiceNumber;
    }

    public final MerchantFulfillment copy(String str) {
        return new MerchantFulfillment(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MerchantFulfillment) && j.b(this.invoiceNumber, ((MerchantFulfillment) obj).invoiceNumber);
    }

    public final String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public int hashCode() {
        String str = this.invoiceNumber;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("MerchantFulfillment(invoiceNumber=", this.invoiceNumber, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.invoiceNumber);
    }
}
