package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class QRPHMerchantAdditionalInfo implements Parcelable {
    public static final Parcelable.Creator<QRPHMerchantAdditionalInfo> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("acquirer_required_information")
    private final String acquirerRequiredInformation;

    @InterfaceC1497a
    @InterfaceC1498b("country_code")
    private final String countryCode;

    @InterfaceC1497a
    @InterfaceC1498b("globally_unique_payment_system_id")
    private final String globallyUniquePaymentSystemId;

    @InterfaceC1497a
    @InterfaceC1498b("loyalty_number")
    private final String loyaltyNumber;

    @InterfaceC1497a
    @InterfaceC1498b("merchant_credit_account_number")
    private final String merchantCreditAccountNumber;

    @InterfaceC1497a
    @InterfaceC1498b("merchant_postal_code")
    private final String merchantPostalCode;

    @InterfaceC1497a
    @InterfaceC1498b("proxy_notif_flag")
    private final String proxyNotifFlag;

    public static final class Creator implements Parcelable.Creator<QRPHMerchantAdditionalInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHMerchantAdditionalInfo createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new QRPHMerchantAdditionalInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRPHMerchantAdditionalInfo[] newArray(int i) {
            return new QRPHMerchantAdditionalInfo[i];
        }
    }

    public QRPHMerchantAdditionalInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.globallyUniquePaymentSystemId = str;
        this.loyaltyNumber = str2;
        this.proxyNotifFlag = str3;
        this.acquirerRequiredInformation = str4;
        this.merchantCreditAccountNumber = str5;
        this.countryCode = str6;
        this.merchantPostalCode = str7;
    }

    public static /* synthetic */ QRPHMerchantAdditionalInfo copy$default(QRPHMerchantAdditionalInfo qRPHMerchantAdditionalInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qRPHMerchantAdditionalInfo.globallyUniquePaymentSystemId;
        }
        if ((i & 2) != 0) {
            str2 = qRPHMerchantAdditionalInfo.loyaltyNumber;
        }
        if ((i & 4) != 0) {
            str3 = qRPHMerchantAdditionalInfo.proxyNotifFlag;
        }
        if ((i & 8) != 0) {
            str4 = qRPHMerchantAdditionalInfo.acquirerRequiredInformation;
        }
        if ((i & 16) != 0) {
            str5 = qRPHMerchantAdditionalInfo.merchantCreditAccountNumber;
        }
        if ((i & 32) != 0) {
            str6 = qRPHMerchantAdditionalInfo.countryCode;
        }
        if ((i & 64) != 0) {
            str7 = qRPHMerchantAdditionalInfo.merchantPostalCode;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return qRPHMerchantAdditionalInfo.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public final String component1() {
        return this.globallyUniquePaymentSystemId;
    }

    public final String component2() {
        return this.loyaltyNumber;
    }

    public final String component3() {
        return this.proxyNotifFlag;
    }

    public final String component4() {
        return this.acquirerRequiredInformation;
    }

    public final String component5() {
        return this.merchantCreditAccountNumber;
    }

    public final String component6() {
        return this.countryCode;
    }

    public final String component7() {
        return this.merchantPostalCode;
    }

    public final QRPHMerchantAdditionalInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new QRPHMerchantAdditionalInfo(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRPHMerchantAdditionalInfo)) {
            return false;
        }
        QRPHMerchantAdditionalInfo qRPHMerchantAdditionalInfo = (QRPHMerchantAdditionalInfo) obj;
        return j.b(this.globallyUniquePaymentSystemId, qRPHMerchantAdditionalInfo.globallyUniquePaymentSystemId) && j.b(this.loyaltyNumber, qRPHMerchantAdditionalInfo.loyaltyNumber) && j.b(this.proxyNotifFlag, qRPHMerchantAdditionalInfo.proxyNotifFlag) && j.b(this.acquirerRequiredInformation, qRPHMerchantAdditionalInfo.acquirerRequiredInformation) && j.b(this.merchantCreditAccountNumber, qRPHMerchantAdditionalInfo.merchantCreditAccountNumber) && j.b(this.countryCode, qRPHMerchantAdditionalInfo.countryCode) && j.b(this.merchantPostalCode, qRPHMerchantAdditionalInfo.merchantPostalCode);
    }

    public final String getAcquirerRequiredInformation() {
        return this.acquirerRequiredInformation;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getGloballyUniquePaymentSystemId() {
        return this.globallyUniquePaymentSystemId;
    }

    public final String getLoyaltyNumber() {
        return this.loyaltyNumber;
    }

    public final String getMerchantCreditAccountNumber() {
        return this.merchantCreditAccountNumber;
    }

    public final String getMerchantPostalCode() {
        return this.merchantPostalCode;
    }

    public final String getProxyNotifFlag() {
        return this.proxyNotifFlag;
    }

    public int hashCode() {
        String str = this.globallyUniquePaymentSystemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loyaltyNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.proxyNotifFlag;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acquirerRequiredInformation;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.merchantCreditAccountNumber;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.countryCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.merchantPostalCode;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.globallyUniquePaymentSystemId;
        String str2 = this.loyaltyNumber;
        String str3 = this.proxyNotifFlag;
        String str4 = this.acquirerRequiredInformation;
        String str5 = this.merchantCreditAccountNumber;
        String str6 = this.countryCode;
        String str7 = this.merchantPostalCode;
        StringBuilder sbX = s.x("QRPHMerchantAdditionalInfo(globallyUniquePaymentSystemId=", str, ", loyaltyNumber=", str2, ", proxyNotifFlag=");
        c.A(sbX, str3, ", acquirerRequiredInformation=", str4, ", merchantCreditAccountNumber=");
        c.A(sbX, str5, ", countryCode=", str6, ", merchantPostalCode=");
        return s.p(sbX, str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.globallyUniquePaymentSystemId);
        dest.writeString(this.loyaltyNumber);
        dest.writeString(this.proxyNotifFlag);
        dest.writeString(this.acquirerRequiredInformation);
        dest.writeString(this.merchantCreditAccountNumber);
        dest.writeString(this.countryCode);
        dest.writeString(this.merchantPostalCode);
    }
}
