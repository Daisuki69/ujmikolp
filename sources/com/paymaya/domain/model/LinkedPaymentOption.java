package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class LinkedPaymentOption implements Parcelable {
    public static final Parcelable.Creator<LinkedPaymentOption> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("last_four")
    private final String lastFourDigits;

    @InterfaceC1497a
    @InterfaceC1498b("payment_token_id")
    private final String paymentId;

    @InterfaceC1497a
    @InterfaceC1498b("payment_option")
    private final String paymentOption;

    public static final class Creator implements Parcelable.Creator<LinkedPaymentOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkedPaymentOption createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new LinkedPaymentOption(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkedPaymentOption[] newArray(int i) {
            return new LinkedPaymentOption[i];
        }
    }

    public LinkedPaymentOption(String paymentId, String lastFourDigits, String paymentOption) {
        j.g(paymentId, "paymentId");
        j.g(lastFourDigits, "lastFourDigits");
        j.g(paymentOption, "paymentOption");
        this.paymentId = paymentId;
        this.lastFourDigits = lastFourDigits;
        this.paymentOption = paymentOption;
    }

    public static /* synthetic */ LinkedPaymentOption copy$default(LinkedPaymentOption linkedPaymentOption, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkedPaymentOption.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = linkedPaymentOption.lastFourDigits;
        }
        if ((i & 4) != 0) {
            str3 = linkedPaymentOption.paymentOption;
        }
        return linkedPaymentOption.copy(str, str2, str3);
    }

    public final String component1() {
        return this.paymentId;
    }

    public final String component2() {
        return this.lastFourDigits;
    }

    public final String component3() {
        return this.paymentOption;
    }

    public final LinkedPaymentOption copy(String paymentId, String lastFourDigits, String paymentOption) {
        j.g(paymentId, "paymentId");
        j.g(lastFourDigits, "lastFourDigits");
        j.g(paymentOption, "paymentOption");
        return new LinkedPaymentOption(paymentId, lastFourDigits, paymentOption);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkedPaymentOption)) {
            return false;
        }
        LinkedPaymentOption linkedPaymentOption = (LinkedPaymentOption) obj;
        return j.b(this.paymentId, linkedPaymentOption.paymentId) && j.b(this.lastFourDigits, linkedPaymentOption.lastFourDigits) && j.b(this.paymentOption, linkedPaymentOption.paymentOption);
    }

    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentOption() {
        return this.paymentOption;
    }

    public int hashCode() {
        return this.paymentOption.hashCode() + AbstractC1414e.c(this.paymentId.hashCode() * 31, 31, this.lastFourDigits);
    }

    public String toString() {
        String str = this.paymentId;
        String str2 = this.lastFourDigits;
        return s.p(s.x("LinkedPaymentOption(paymentId=", str, ", lastFourDigits=", str2, ", paymentOption="), this.paymentOption, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.paymentId);
        dest.writeString(this.lastFourDigits);
        dest.writeString(this.paymentOption);
    }
}
