package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class QRPHMerchantPaymentRequest implements Parcelable {
    public static final Parcelable.Creator<QRPHMerchantPaymentRequest> CREATOR = new Creator();
    private Amount amount;
    private QRPHMerchantDetails merchantDetails;
    private String pointOfInitiation;
    private String qrPayload;
    private String type;

    public static final class Creator implements Parcelable.Creator<QRPHMerchantPaymentRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHMerchantPaymentRequest createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new QRPHMerchantPaymentRequest((Amount) parcel.readParcelable(QRPHMerchantPaymentRequest.class.getClassLoader()), QRPHMerchantDetails.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHMerchantPaymentRequest[] newArray(int i) {
            return new QRPHMerchantPaymentRequest[i];
        }
    }

    public QRPHMerchantPaymentRequest(Amount amount, QRPHMerchantDetails merchantDetails, String pointOfInitiation, String str, String str2) {
        j.g(merchantDetails, "merchantDetails");
        j.g(pointOfInitiation, "pointOfInitiation");
        this.amount = amount;
        this.merchantDetails = merchantDetails;
        this.pointOfInitiation = pointOfInitiation;
        this.qrPayload = str;
        this.type = str2;
    }

    public static /* synthetic */ QRPHMerchantPaymentRequest copy$default(QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest, Amount amount, QRPHMerchantDetails qRPHMerchantDetails, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            amount = qRPHMerchantPaymentRequest.amount;
        }
        if ((i & 2) != 0) {
            qRPHMerchantDetails = qRPHMerchantPaymentRequest.merchantDetails;
        }
        if ((i & 4) != 0) {
            str = qRPHMerchantPaymentRequest.pointOfInitiation;
        }
        if ((i & 8) != 0) {
            str2 = qRPHMerchantPaymentRequest.qrPayload;
        }
        if ((i & 16) != 0) {
            str3 = qRPHMerchantPaymentRequest.type;
        }
        String str4 = str3;
        String str5 = str;
        return qRPHMerchantPaymentRequest.copy(amount, qRPHMerchantDetails, str5, str2, str4);
    }

    public final String analyticsEventQRType() {
        return isStaticPointOfInitiation() ? "Static" : "Dynamic";
    }

    public final Amount component1() {
        return this.amount;
    }

    public final QRPHMerchantDetails component2() {
        return this.merchantDetails;
    }

    public final String component3() {
        return this.pointOfInitiation;
    }

    public final String component4() {
        return this.qrPayload;
    }

    public final String component5() {
        return this.type;
    }

    public final QRPHMerchantPaymentRequest copy(Amount amount, QRPHMerchantDetails merchantDetails, String pointOfInitiation, String str, String str2) {
        j.g(merchantDetails, "merchantDetails");
        j.g(pointOfInitiation, "pointOfInitiation");
        return new QRPHMerchantPaymentRequest(amount, merchantDetails, pointOfInitiation, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRPHMerchantPaymentRequest)) {
            return false;
        }
        QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = (QRPHMerchantPaymentRequest) obj;
        return j.b(this.amount, qRPHMerchantPaymentRequest.amount) && j.b(this.merchantDetails, qRPHMerchantPaymentRequest.merchantDetails) && j.b(this.pointOfInitiation, qRPHMerchantPaymentRequest.pointOfInitiation) && j.b(this.qrPayload, qRPHMerchantPaymentRequest.qrPayload) && j.b(this.type, qRPHMerchantPaymentRequest.type);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final QRPHMerchantDetails getMerchantDetails() {
        return this.merchantDetails;
    }

    public final String getPointOfInitiation() {
        return this.pointOfInitiation;
    }

    public final String getQrPayload() {
        return this.qrPayload;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Amount amount = this.amount;
        int iC = AbstractC1414e.c((this.merchantDetails.hashCode() + ((amount == null ? 0 : amount.hashCode()) * 31)) * 31, 31, this.pointOfInitiation);
        String str = this.qrPayload;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isDynamicPointOfInitiation() {
        return j.b(this.pointOfInitiation, "12");
    }

    public final boolean isStaticPointOfInitiation() {
        return j.b(this.pointOfInitiation, "11");
    }

    public final void setAmount(Amount amount) {
        this.amount = amount;
    }

    public final void setMerchantDetails(QRPHMerchantDetails qRPHMerchantDetails) {
        j.g(qRPHMerchantDetails, "<set-?>");
        this.merchantDetails = qRPHMerchantDetails;
    }

    public final void setPointOfInitiation(String str) {
        j.g(str, "<set-?>");
        this.pointOfInitiation = str;
    }

    public final void setQrPayload(String str) {
        this.qrPayload = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        Amount amount = this.amount;
        QRPHMerchantDetails qRPHMerchantDetails = this.merchantDetails;
        String str = this.pointOfInitiation;
        String str2 = this.qrPayload;
        String str3 = this.type;
        StringBuilder sb2 = new StringBuilder("QRPHMerchantPaymentRequest(amount=");
        sb2.append(amount);
        sb2.append(", merchantDetails=");
        sb2.append(qRPHMerchantDetails);
        sb2.append(", pointOfInitiation=");
        c.A(sb2, str, ", qrPayload=", str2, ", type=");
        return s.p(sb2, str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeParcelable(this.amount, i);
        this.merchantDetails.writeToParcel(dest, i);
        dest.writeString(this.pointOfInitiation);
        dest.writeString(this.qrPayload);
        dest.writeString(this.type);
    }
}
