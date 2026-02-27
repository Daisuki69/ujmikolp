package com.paymaya.domain.model;

import We.s;
import androidx.media3.datasource.cache.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class QRAdditionalData {
    private String additionalMobileNumber;
    private String additionalRequestData;
    private String billNumber;
    private String customerLabel;
    private String globalUniqueIdentifier;
    private String loyaltyNumber;
    private String merchantPostalCode;
    private String purpose;
    private String referenceId;
    private String storeName;
    private String terminalId;

    public QRAdditionalData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ QRAdditionalData copy$default(QRAdditionalData qRAdditionalData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qRAdditionalData.globalUniqueIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = qRAdditionalData.billNumber;
        }
        if ((i & 4) != 0) {
            str3 = qRAdditionalData.additionalMobileNumber;
        }
        if ((i & 8) != 0) {
            str4 = qRAdditionalData.storeName;
        }
        if ((i & 16) != 0) {
            str5 = qRAdditionalData.merchantPostalCode;
        }
        if ((i & 32) != 0) {
            str6 = qRAdditionalData.loyaltyNumber;
        }
        if ((i & 64) != 0) {
            str7 = qRAdditionalData.referenceId;
        }
        if ((i & 128) != 0) {
            str8 = qRAdditionalData.customerLabel;
        }
        if ((i & 256) != 0) {
            str9 = qRAdditionalData.terminalId;
        }
        if ((i & 512) != 0) {
            str10 = qRAdditionalData.purpose;
        }
        if ((i & 1024) != 0) {
            str11 = qRAdditionalData.additionalRequestData;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return qRAdditionalData.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    public final String component1() {
        return this.globalUniqueIdentifier;
    }

    public final String component10() {
        return this.purpose;
    }

    public final String component11() {
        return this.additionalRequestData;
    }

    public final String component2() {
        return this.billNumber;
    }

    public final String component3() {
        return this.additionalMobileNumber;
    }

    public final String component4() {
        return this.storeName;
    }

    public final String component5() {
        return this.merchantPostalCode;
    }

    public final String component6() {
        return this.loyaltyNumber;
    }

    public final String component7() {
        return this.referenceId;
    }

    public final String component8() {
        return this.customerLabel;
    }

    public final String component9() {
        return this.terminalId;
    }

    public final QRAdditionalData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new QRAdditionalData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRAdditionalData)) {
            return false;
        }
        QRAdditionalData qRAdditionalData = (QRAdditionalData) obj;
        return j.b(this.globalUniqueIdentifier, qRAdditionalData.globalUniqueIdentifier) && j.b(this.billNumber, qRAdditionalData.billNumber) && j.b(this.additionalMobileNumber, qRAdditionalData.additionalMobileNumber) && j.b(this.storeName, qRAdditionalData.storeName) && j.b(this.merchantPostalCode, qRAdditionalData.merchantPostalCode) && j.b(this.loyaltyNumber, qRAdditionalData.loyaltyNumber) && j.b(this.referenceId, qRAdditionalData.referenceId) && j.b(this.customerLabel, qRAdditionalData.customerLabel) && j.b(this.terminalId, qRAdditionalData.terminalId) && j.b(this.purpose, qRAdditionalData.purpose) && j.b(this.additionalRequestData, qRAdditionalData.additionalRequestData);
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

    public final String getGlobalUniqueIdentifier() {
        return this.globalUniqueIdentifier;
    }

    public final String getLoyaltyNumber() {
        return this.loyaltyNumber;
    }

    public final String getMerchantPostalCode() {
        return this.merchantPostalCode;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public final String getTerminalId() {
        return this.terminalId;
    }

    public int hashCode() {
        String str = this.globalUniqueIdentifier;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.billNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.additionalMobileNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storeName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.merchantPostalCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.loyaltyNumber;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referenceId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.customerLabel;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.terminalId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.purpose;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.additionalRequestData;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void setAdditionalMobileNumber(String str) {
        this.additionalMobileNumber = str;
    }

    public final void setAdditionalRequestData(String str) {
        this.additionalRequestData = str;
    }

    public final void setBillNumber(String str) {
        this.billNumber = str;
    }

    public final void setCustomerLabel(String str) {
        this.customerLabel = str;
    }

    public final void setGlobalUniqueIdentifier(String str) {
        this.globalUniqueIdentifier = str;
    }

    public final void setLoyaltyNumber(String str) {
        this.loyaltyNumber = str;
    }

    public final void setMerchantPostalCode(String str) {
        this.merchantPostalCode = str;
    }

    public final void setPurpose(String str) {
        this.purpose = str;
    }

    public final void setReferenceId(String str) {
        this.referenceId = str;
    }

    public final void setStoreName(String str) {
        this.storeName = str;
    }

    public final void setTerminalId(String str) {
        this.terminalId = str;
    }

    public String toString() {
        String str = this.globalUniqueIdentifier;
        String str2 = this.billNumber;
        String str3 = this.additionalMobileNumber;
        String str4 = this.storeName;
        String str5 = this.merchantPostalCode;
        String str6 = this.loyaltyNumber;
        String str7 = this.referenceId;
        String str8 = this.customerLabel;
        String str9 = this.terminalId;
        String str10 = this.purpose;
        String str11 = this.additionalRequestData;
        StringBuilder sbX = s.x("QRAdditionalData(globalUniqueIdentifier=", str, ", billNumber=", str2, ", additionalMobileNumber=");
        c.A(sbX, str3, ", storeName=", str4, ", merchantPostalCode=");
        c.A(sbX, str5, ", loyaltyNumber=", str6, ", referenceId=");
        c.A(sbX, str7, ", customerLabel=", str8, ", terminalId=");
        c.A(sbX, str9, ", purpose=", str10, ", additionalRequestData=");
        return s.p(sbX, str11, ")");
    }

    public QRAdditionalData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.globalUniqueIdentifier = str;
        this.billNumber = str2;
        this.additionalMobileNumber = str3;
        this.storeName = str4;
        this.merchantPostalCode = str5;
        this.loyaltyNumber = str6;
        this.referenceId = str7;
        this.customerLabel = str8;
        this.terminalId = str9;
        this.purpose = str10;
        this.additionalRequestData = str11;
    }

    public /* synthetic */ QRAdditionalData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11);
    }
}
