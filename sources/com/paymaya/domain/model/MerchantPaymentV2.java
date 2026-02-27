package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MerchantPaymentV2 implements Parcelable {
    public static final Parcelable.Creator<MerchantPaymentV2> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("amount")
    private final Amount amount;

    @InterfaceC1497a
    @InterfaceC1498b("created_date")
    private final String createdDate;

    @InterfaceC1497a
    @InterfaceC1498b("customer")
    private final String customer;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("merchant")
    private final QRPHMerchantDetails merchant;

    @InterfaceC1497a
    @InterfaceC1498b("merchant_fulfillment")
    private final MerchantFulfillment merchantFulfillment;

    @InterfaceC1497a
    @InterfaceC1498b("payment_details")
    private final PaymentDetails paymentDetails;

    @InterfaceC1497a
    @InterfaceC1498b("qr_payload")
    private final String qrPayload;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    @InterfaceC1497a
    @InterfaceC1498b(SessionDescription.ATTR_TYPE)
    private final String type;

    @InterfaceC1497a
    @InterfaceC1498b("updated_date")
    private final String updatedDate;

    public static final class Creator implements Parcelable.Creator<MerchantPaymentV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantPaymentV2 createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new MerchantPaymentV2(parcel.readString(), parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(MerchantPaymentV2.class.getClassLoader()), parcel.readString(), QRPHMerchantDetails.CREATOR.createFromParcel(parcel), PaymentDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MerchantFulfillment.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MerchantPaymentV2[] newArray(int i) {
            return new MerchantPaymentV2[i];
        }
    }

    public MerchantPaymentV2(String id, String customer, String type, Amount amount, String qrPayload, QRPHMerchantDetails merchant, PaymentDetails paymentDetails, MerchantFulfillment merchantFulfillment, String status, String createdDate, String str) {
        j.g(id, "id");
        j.g(customer, "customer");
        j.g(type, "type");
        j.g(amount, "amount");
        j.g(qrPayload, "qrPayload");
        j.g(merchant, "merchant");
        j.g(paymentDetails, "paymentDetails");
        j.g(status, "status");
        j.g(createdDate, "createdDate");
        this.id = id;
        this.customer = customer;
        this.type = type;
        this.amount = amount;
        this.qrPayload = qrPayload;
        this.merchant = merchant;
        this.paymentDetails = paymentDetails;
        this.merchantFulfillment = merchantFulfillment;
        this.status = status;
        this.createdDate = createdDate;
        this.updatedDate = str;
    }

    public static /* synthetic */ MerchantPaymentV2 copy$default(MerchantPaymentV2 merchantPaymentV2, String str, String str2, String str3, Amount amount, String str4, QRPHMerchantDetails qRPHMerchantDetails, PaymentDetails paymentDetails, MerchantFulfillment merchantFulfillment, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = merchantPaymentV2.id;
        }
        if ((i & 2) != 0) {
            str2 = merchantPaymentV2.customer;
        }
        if ((i & 4) != 0) {
            str3 = merchantPaymentV2.type;
        }
        if ((i & 8) != 0) {
            amount = merchantPaymentV2.amount;
        }
        if ((i & 16) != 0) {
            str4 = merchantPaymentV2.qrPayload;
        }
        if ((i & 32) != 0) {
            qRPHMerchantDetails = merchantPaymentV2.merchant;
        }
        if ((i & 64) != 0) {
            paymentDetails = merchantPaymentV2.paymentDetails;
        }
        if ((i & 128) != 0) {
            merchantFulfillment = merchantPaymentV2.merchantFulfillment;
        }
        if ((i & 256) != 0) {
            str5 = merchantPaymentV2.status;
        }
        if ((i & 512) != 0) {
            str6 = merchantPaymentV2.createdDate;
        }
        if ((i & 1024) != 0) {
            str7 = merchantPaymentV2.updatedDate;
        }
        String str8 = str6;
        String str9 = str7;
        MerchantFulfillment merchantFulfillment2 = merchantFulfillment;
        String str10 = str5;
        QRPHMerchantDetails qRPHMerchantDetails2 = qRPHMerchantDetails;
        PaymentDetails paymentDetails2 = paymentDetails;
        String str11 = str4;
        String str12 = str3;
        return merchantPaymentV2.copy(str, str2, str12, amount, str11, qRPHMerchantDetails2, paymentDetails2, merchantFulfillment2, str10, str8, str9);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.createdDate;
    }

    public final String component11() {
        return this.updatedDate;
    }

    public final String component2() {
        return this.customer;
    }

    public final String component3() {
        return this.type;
    }

    public final Amount component4() {
        return this.amount;
    }

    public final String component5() {
        return this.qrPayload;
    }

    public final QRPHMerchantDetails component6() {
        return this.merchant;
    }

    public final PaymentDetails component7() {
        return this.paymentDetails;
    }

    public final MerchantFulfillment component8() {
        return this.merchantFulfillment;
    }

    public final String component9() {
        return this.status;
    }

    public final MerchantPaymentV2 copy(String id, String customer, String type, Amount amount, String qrPayload, QRPHMerchantDetails merchant, PaymentDetails paymentDetails, MerchantFulfillment merchantFulfillment, String status, String createdDate, String str) {
        j.g(id, "id");
        j.g(customer, "customer");
        j.g(type, "type");
        j.g(amount, "amount");
        j.g(qrPayload, "qrPayload");
        j.g(merchant, "merchant");
        j.g(paymentDetails, "paymentDetails");
        j.g(status, "status");
        j.g(createdDate, "createdDate");
        return new MerchantPaymentV2(id, customer, type, amount, qrPayload, merchant, paymentDetails, merchantFulfillment, status, createdDate, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantPaymentV2)) {
            return false;
        }
        MerchantPaymentV2 merchantPaymentV2 = (MerchantPaymentV2) obj;
        return j.b(this.id, merchantPaymentV2.id) && j.b(this.customer, merchantPaymentV2.customer) && j.b(this.type, merchantPaymentV2.type) && j.b(this.amount, merchantPaymentV2.amount) && j.b(this.qrPayload, merchantPaymentV2.qrPayload) && j.b(this.merchant, merchantPaymentV2.merchant) && j.b(this.paymentDetails, merchantPaymentV2.paymentDetails) && j.b(this.merchantFulfillment, merchantPaymentV2.merchantFulfillment) && j.b(this.status, merchantPaymentV2.status) && j.b(this.createdDate, merchantPaymentV2.createdDate) && j.b(this.updatedDate, merchantPaymentV2.updatedDate);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final String getCustomer() {
        return this.customer;
    }

    public final String getId() {
        return this.id;
    }

    public final QRPHMerchantDetails getMerchant() {
        return this.merchant;
    }

    public final MerchantFulfillment getMerchantFulfillment() {
        return this.merchantFulfillment;
    }

    public final PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public final String getQrPayload() {
        return this.qrPayload;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    public int hashCode() {
        int iHashCode = (this.paymentDetails.hashCode() + ((this.merchant.hashCode() + AbstractC1414e.c((this.amount.hashCode() + AbstractC1414e.c(AbstractC1414e.c(this.id.hashCode() * 31, 31, this.customer), 31, this.type)) * 31, 31, this.qrPayload)) * 31)) * 31;
        MerchantFulfillment merchantFulfillment = this.merchantFulfillment;
        int iC = AbstractC1414e.c(AbstractC1414e.c((iHashCode + (merchantFulfillment == null ? 0 : merchantFulfillment.hashCode())) * 31, 31, this.status), 31, this.createdDate);
        String str = this.updatedDate;
        return iC + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.customer;
        String str3 = this.type;
        Amount amount = this.amount;
        String str4 = this.qrPayload;
        QRPHMerchantDetails qRPHMerchantDetails = this.merchant;
        PaymentDetails paymentDetails = this.paymentDetails;
        MerchantFulfillment merchantFulfillment = this.merchantFulfillment;
        String str5 = this.status;
        String str6 = this.createdDate;
        String str7 = this.updatedDate;
        StringBuilder sbX = s.x("MerchantPaymentV2(id=", str, ", customer=", str2, ", type=");
        sbX.append(str3);
        sbX.append(", amount=");
        sbX.append(amount);
        sbX.append(", qrPayload=");
        sbX.append(str4);
        sbX.append(", merchant=");
        sbX.append(qRPHMerchantDetails);
        sbX.append(", paymentDetails=");
        sbX.append(paymentDetails);
        sbX.append(", merchantFulfillment=");
        sbX.append(merchantFulfillment);
        sbX.append(", status=");
        c.A(sbX, str5, ", createdDate=", str6, ", updatedDate=");
        return s.p(sbX, str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.customer);
        dest.writeString(this.type);
        dest.writeParcelable(this.amount, i);
        dest.writeString(this.qrPayload);
        this.merchant.writeToParcel(dest, i);
        this.paymentDetails.writeToParcel(dest, i);
        MerchantFulfillment merchantFulfillment = this.merchantFulfillment;
        if (merchantFulfillment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            merchantFulfillment.writeToParcel(dest, i);
        }
        dest.writeString(this.status);
        dest.writeString(this.createdDate);
        dest.writeString(this.updatedDate);
    }
}
