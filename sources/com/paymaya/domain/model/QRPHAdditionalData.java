package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class QRPHAdditionalData implements Parcelable {
    public static final Parcelable.Creator<QRPHAdditionalData> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("additional_mobile_number")
    private final String additionalMobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b("additional_request_data")
    private final String additionalRequestData;

    @InterfaceC1497a
    @InterfaceC1498b("bill_number")
    private final String billNumber;

    @InterfaceC1497a
    @InterfaceC1498b("customer_label")
    private final String customerLabel;

    @InterfaceC1497a
    @InterfaceC1498b("loyalty_number")
    private final String loyaltyNumber;

    @InterfaceC1497a
    @InterfaceC1498b("merchant_category_code")
    private final String merchantCategoryCode;

    @InterfaceC1497a
    @InterfaceC1498b("merchant_city")
    private final String merchantCity;

    @InterfaceC1497a
    @InterfaceC1498b("merchant_mobile_number")
    private final String merchantMobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b("merchant_postal_code")
    private final String merchantPostalCode;

    @InterfaceC1497a
    @InterfaceC1498b("payment_type")
    private final String paymentType;

    @InterfaceC1497a
    @InterfaceC1498b("reference_label")
    private final String referenceLabel;

    @InterfaceC1497a
    @InterfaceC1498b("store_label")
    private final String storeLabel;

    @InterfaceC1497a
    @InterfaceC1498b("terminal_label")
    private final String terminalLabel;

    @InterfaceC1497a
    @InterfaceC1498b("unique_id")
    private final String uniqueId;

    public static final class Creator implements Parcelable.Creator<QRPHAdditionalData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHAdditionalData createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new QRPHAdditionalData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHAdditionalData[] newArray(int i) {
            return new QRPHAdditionalData[i];
        }
    }

    public QRPHAdditionalData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String component1() {
        return this.uniqueId;
    }

    public final String component10() {
        return this.referenceLabel;
    }

    public final String component11() {
        return this.terminalLabel;
    }

    public final String component12() {
        return this.additionalRequestData;
    }

    public final String component13() {
        return this.additionalMobileNumber;
    }

    public final String component14() {
        return this.customerLabel;
    }

    public final String component2() {
        return this.paymentType;
    }

    public final String component3() {
        return this.merchantMobileNumber;
    }

    public final String component4() {
        return this.loyaltyNumber;
    }

    public final String component5() {
        return this.merchantCategoryCode;
    }

    public final String component6() {
        return this.merchantCity;
    }

    public final String component7() {
        return this.merchantPostalCode;
    }

    public final String component8() {
        return this.billNumber;
    }

    public final String component9() {
        return this.storeLabel;
    }

    public final QRPHAdditionalData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        return new QRPHAdditionalData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRPHAdditionalData)) {
            return false;
        }
        QRPHAdditionalData qRPHAdditionalData = (QRPHAdditionalData) obj;
        return j.b(this.uniqueId, qRPHAdditionalData.uniqueId) && j.b(this.paymentType, qRPHAdditionalData.paymentType) && j.b(this.merchantMobileNumber, qRPHAdditionalData.merchantMobileNumber) && j.b(this.loyaltyNumber, qRPHAdditionalData.loyaltyNumber) && j.b(this.merchantCategoryCode, qRPHAdditionalData.merchantCategoryCode) && j.b(this.merchantCity, qRPHAdditionalData.merchantCity) && j.b(this.merchantPostalCode, qRPHAdditionalData.merchantPostalCode) && j.b(this.billNumber, qRPHAdditionalData.billNumber) && j.b(this.storeLabel, qRPHAdditionalData.storeLabel) && j.b(this.referenceLabel, qRPHAdditionalData.referenceLabel) && j.b(this.terminalLabel, qRPHAdditionalData.terminalLabel) && j.b(this.additionalRequestData, qRPHAdditionalData.additionalRequestData) && j.b(this.additionalMobileNumber, qRPHAdditionalData.additionalMobileNumber) && j.b(this.customerLabel, qRPHAdditionalData.customerLabel);
    }

    public final String getAdditionalMobileNumber() {
        return this.additionalMobileNumber;
    }

    public final String getAdditionalRequestData() {
        return this.additionalRequestData;
    }

    public final String getBillNumber() {
        return this.billNumber;
    }

    public final String getCustomerLabel() {
        return this.customerLabel;
    }

    public final String getLoyaltyNumber() {
        return this.loyaltyNumber;
    }

    public final String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    public final String getMerchantCity() {
        return this.merchantCity;
    }

    public final String getMerchantMobileNumber() {
        return this.merchantMobileNumber;
    }

    public final String getMerchantPostalCode() {
        return this.merchantPostalCode;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final String getReferenceLabel() {
        return this.referenceLabel;
    }

    public final String getStoreLabel() {
        return this.storeLabel;
    }

    public final String getTerminalLabel() {
        return this.terminalLabel;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        String str = this.uniqueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantMobileNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.loyaltyNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.merchantCategoryCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.merchantCity;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.merchantPostalCode;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.billNumber;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.storeLabel;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.referenceLabel;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.terminalLabel;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.additionalRequestData;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.additionalMobileNumber;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.customerLabel;
        return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
    }

    public String toString() {
        String str = this.uniqueId;
        String str2 = this.paymentType;
        String str3 = this.merchantMobileNumber;
        String str4 = this.loyaltyNumber;
        String str5 = this.merchantCategoryCode;
        String str6 = this.merchantCity;
        String str7 = this.merchantPostalCode;
        String str8 = this.billNumber;
        String str9 = this.storeLabel;
        String str10 = this.referenceLabel;
        String str11 = this.terminalLabel;
        String str12 = this.additionalRequestData;
        String str13 = this.additionalMobileNumber;
        String str14 = this.customerLabel;
        StringBuilder sbX = s.x("QRPHAdditionalData(uniqueId=", str, ", paymentType=", str2, ", merchantMobileNumber=");
        c.A(sbX, str3, ", loyaltyNumber=", str4, ", merchantCategoryCode=");
        c.A(sbX, str5, ", merchantCity=", str6, ", merchantPostalCode=");
        c.A(sbX, str7, ", billNumber=", str8, ", storeLabel=");
        c.A(sbX, str9, ", referenceLabel=", str10, ", terminalLabel=");
        c.A(sbX, str11, ", additionalRequestData=", str12, ", additionalMobileNumber=");
        return a.p(sbX, str13, ", customerLabel=", str14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.uniqueId);
        dest.writeString(this.paymentType);
        dest.writeString(this.merchantMobileNumber);
        dest.writeString(this.loyaltyNumber);
        dest.writeString(this.merchantCategoryCode);
        dest.writeString(this.merchantCity);
        dest.writeString(this.merchantPostalCode);
        dest.writeString(this.billNumber);
        dest.writeString(this.storeLabel);
        dest.writeString(this.referenceLabel);
        dest.writeString(this.terminalLabel);
        dest.writeString(this.additionalRequestData);
        dest.writeString(this.additionalMobileNumber);
        dest.writeString(this.customerLabel);
    }

    public QRPHAdditionalData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.uniqueId = str;
        this.paymentType = str2;
        this.merchantMobileNumber = str3;
        this.loyaltyNumber = str4;
        this.merchantCategoryCode = str5;
        this.merchantCity = str6;
        this.merchantPostalCode = str7;
        this.billNumber = str8;
        this.storeLabel = str9;
        this.referenceLabel = str10;
        this.terminalLabel = str11;
        this.additionalRequestData = str12;
        this.additionalMobileNumber = str13;
        this.customerLabel = str14;
    }

    public /* synthetic */ QRPHAdditionalData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14);
    }
}
