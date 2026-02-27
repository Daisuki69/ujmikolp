package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentDetails implements Parcelable {
    public static final Parcelable.Creator<PaymentDetails> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("payment_id")
    private final String paymentId;

    @InterfaceC1497a
    @InterfaceC1498b("payment_method_redirect_url")
    private final String paymentMethodRedirectUrl;

    @InterfaceC1497a
    @InterfaceC1498b("payment_option_selected")
    private final String paymentOptionSelected;

    public static final class Creator implements Parcelable.Creator<PaymentDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentDetails createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new PaymentDetails(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentDetails[] newArray(int i) {
            return new PaymentDetails[i];
        }
    }

    public PaymentDetails(String paymentId, String paymentMethodRedirectUrl, String str) {
        j.g(paymentId, "paymentId");
        j.g(paymentMethodRedirectUrl, "paymentMethodRedirectUrl");
        this.paymentId = paymentId;
        this.paymentMethodRedirectUrl = paymentMethodRedirectUrl;
        this.paymentOptionSelected = str;
    }

    public static /* synthetic */ PaymentDetails copy$default(PaymentDetails paymentDetails, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentDetails.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = paymentDetails.paymentMethodRedirectUrl;
        }
        if ((i & 4) != 0) {
            str3 = paymentDetails.paymentOptionSelected;
        }
        return paymentDetails.copy(str, str2, str3);
    }

    public final String component1() {
        return this.paymentId;
    }

    public final String component2() {
        return this.paymentMethodRedirectUrl;
    }

    public final String component3() {
        return this.paymentOptionSelected;
    }

    public final PaymentDetails copy(String paymentId, String paymentMethodRedirectUrl, String str) {
        j.g(paymentId, "paymentId");
        j.g(paymentMethodRedirectUrl, "paymentMethodRedirectUrl");
        return new PaymentDetails(paymentId, paymentMethodRedirectUrl, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentDetails)) {
            return false;
        }
        PaymentDetails paymentDetails = (PaymentDetails) obj;
        return j.b(this.paymentId, paymentDetails.paymentId) && j.b(this.paymentMethodRedirectUrl, paymentDetails.paymentMethodRedirectUrl) && j.b(this.paymentOptionSelected, paymentDetails.paymentOptionSelected);
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentMethodRedirectUrl() {
        return this.paymentMethodRedirectUrl;
    }

    public final String getPaymentOptionSelected() {
        return this.paymentOptionSelected;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(this.paymentId.hashCode() * 31, 31, this.paymentMethodRedirectUrl);
        String str = this.paymentOptionSelected;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.paymentId;
        String str2 = this.paymentMethodRedirectUrl;
        return s.p(s.x("PaymentDetails(paymentId=", str, ", paymentMethodRedirectUrl=", str2, ", paymentOptionSelected="), this.paymentOptionSelected, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.paymentId);
        dest.writeString(this.paymentMethodRedirectUrl);
        dest.writeString(this.paymentOptionSelected);
    }
}
