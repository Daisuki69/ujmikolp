package com.paymaya.domain.model;

import We.s;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import androidx.media3.datasource.cache.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import y4.C2506b;
import y4.C2507c;
import y4.C2508d;

/* JADX INFO: loaded from: classes4.dex */
public final class QRPHDetails {
    private String acquirerId;
    private String acquirerRequiredInfo;
    private QRAdditionalData additionalData;
    private C2506b additionalDataPayload;
    private String convenienceFeeFixed;
    private String convenienceFeePercentage;
    private String convenienceIndicator;
    private String creditAccountNumber;
    private String globalUniqueIdentifier;
    private C2507c languageData;
    private String merchantCategoryCode;
    private String merchantCity;
    private String merchantCountryCode;
    private String merchantCrc;
    private String merchantCreditAccountNumber;
    private String merchantId;
    private String merchantMobileNumber;
    private String merchantName;
    private String merchantPostalCode;
    private String mobileNumber;
    private C2508d p2mMerchantAccountInformation;
    private C2508d p2pMerchantAccountInformation;
    private String payloadFormatIndicator;
    private String payloadInformationIndicator;
    private String paymentType;
    private String pointOfInitiation;
    private String proxyNotifFlag;
    private String transactionAmount;
    private String transactionCurrencyCode;

    public QRPHDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911, null);
    }

    public static /* synthetic */ QRPHDetails copy$default(QRPHDetails qRPHDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, QRAdditionalData qRAdditionalData, C2506b c2506b, C2508d c2508d, C2508d c2508d2, String str21, C2507c c2507c, String str22, String str23, String str24, int i, Object obj) {
        String str25;
        String str26;
        String str27 = (i & 1) != 0 ? qRPHDetails.acquirerRequiredInfo : str;
        String str28 = (i & 2) != 0 ? qRPHDetails.mobileNumber : str2;
        String str29 = (i & 4) != 0 ? qRPHDetails.proxyNotifFlag : str3;
        String str30 = (i & 8) != 0 ? qRPHDetails.creditAccountNumber : str4;
        String str31 = (i & 16) != 0 ? qRPHDetails.globalUniqueIdentifier : str5;
        String str32 = (i & 32) != 0 ? qRPHDetails.acquirerId : str6;
        String str33 = (i & 64) != 0 ? qRPHDetails.paymentType : str7;
        String str34 = (i & 128) != 0 ? qRPHDetails.merchantCountryCode : str8;
        String str35 = (i & 256) != 0 ? qRPHDetails.merchantCity : str9;
        String str36 = (i & 512) != 0 ? qRPHDetails.merchantId : str10;
        String str37 = (i & 1024) != 0 ? qRPHDetails.merchantMobileNumber : str11;
        String str38 = (i & 2048) != 0 ? qRPHDetails.merchantName : str12;
        String str39 = (i & 4096) != 0 ? qRPHDetails.merchantPostalCode : str13;
        String str40 = (i & 8192) != 0 ? qRPHDetails.payloadFormatIndicator : str14;
        String str41 = str27;
        String str42 = (i & 16384) != 0 ? qRPHDetails.pointOfInitiation : str15;
        String str43 = (i & 32768) != 0 ? qRPHDetails.transactionCurrencyCode : str16;
        String str44 = (i & 65536) != 0 ? qRPHDetails.merchantCategoryCode : str17;
        String str45 = (i & 131072) != 0 ? qRPHDetails.merchantCrc : str18;
        String str46 = (i & 262144) != 0 ? qRPHDetails.merchantCreditAccountNumber : str19;
        String str47 = (i & 524288) != 0 ? qRPHDetails.transactionAmount : str20;
        QRAdditionalData qRAdditionalData2 = (i & 1048576) != 0 ? qRPHDetails.additionalData : qRAdditionalData;
        C2506b c2506b2 = (i & 2097152) != 0 ? qRPHDetails.additionalDataPayload : c2506b;
        C2508d c2508d3 = (i & 4194304) != 0 ? qRPHDetails.p2pMerchantAccountInformation : c2508d;
        C2508d c2508d4 = (i & 8388608) != 0 ? qRPHDetails.p2mMerchantAccountInformation : c2508d2;
        String str48 = (i & 16777216) != 0 ? qRPHDetails.payloadInformationIndicator : str21;
        C2507c c2507c2 = (i & 33554432) != 0 ? qRPHDetails.languageData : c2507c;
        String str49 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? qRPHDetails.convenienceIndicator : str22;
        String str50 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? qRPHDetails.convenienceFeeFixed : str23;
        if ((i & 268435456) != 0) {
            str26 = str50;
            str25 = qRPHDetails.convenienceFeePercentage;
        } else {
            str25 = str24;
            str26 = str50;
        }
        return qRPHDetails.copy(str41, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str42, str43, str44, str45, str46, str47, qRAdditionalData2, c2506b2, c2508d3, c2508d4, str48, c2507c2, str49, str26, str25);
    }

    public final String component1() {
        return this.acquirerRequiredInfo;
    }

    public final String component10() {
        return this.merchantId;
    }

    public final String component11() {
        return this.merchantMobileNumber;
    }

    public final String component12() {
        return this.merchantName;
    }

    public final String component13() {
        return this.merchantPostalCode;
    }

    public final String component14() {
        return this.payloadFormatIndicator;
    }

    public final String component15() {
        return this.pointOfInitiation;
    }

    public final String component16() {
        return this.transactionCurrencyCode;
    }

    public final String component17() {
        return this.merchantCategoryCode;
    }

    public final String component18() {
        return this.merchantCrc;
    }

    public final String component19() {
        return this.merchantCreditAccountNumber;
    }

    public final String component2() {
        return this.mobileNumber;
    }

    public final String component20() {
        return this.transactionAmount;
    }

    public final QRAdditionalData component21() {
        return this.additionalData;
    }

    public final C2506b component22() {
        return this.additionalDataPayload;
    }

    public final C2508d component23() {
        return this.p2pMerchantAccountInformation;
    }

    public final C2508d component24() {
        return this.p2mMerchantAccountInformation;
    }

    public final String component25() {
        return this.payloadInformationIndicator;
    }

    public final C2507c component26() {
        return this.languageData;
    }

    public final String component27() {
        return this.convenienceIndicator;
    }

    public final String component28() {
        return this.convenienceFeeFixed;
    }

    public final String component29() {
        return this.convenienceFeePercentage;
    }

    public final String component3() {
        return this.proxyNotifFlag;
    }

    public final String component4() {
        return this.creditAccountNumber;
    }

    public final String component5() {
        return this.globalUniqueIdentifier;
    }

    public final String component6() {
        return this.acquirerId;
    }

    public final String component7() {
        return this.paymentType;
    }

    public final String component8() {
        return this.merchantCountryCode;
    }

    public final String component9() {
        return this.merchantCity;
    }

    public final QRPHDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, QRAdditionalData qRAdditionalData, C2506b c2506b, C2508d c2508d, C2508d c2508d2, String str21, C2507c c2507c, String str22, String str23, String str24) {
        return new QRPHDetails(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, qRAdditionalData, c2506b, c2508d, c2508d2, str21, c2507c, str22, str23, str24);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRPHDetails)) {
            return false;
        }
        QRPHDetails qRPHDetails = (QRPHDetails) obj;
        return j.b(this.acquirerRequiredInfo, qRPHDetails.acquirerRequiredInfo) && j.b(this.mobileNumber, qRPHDetails.mobileNumber) && j.b(this.proxyNotifFlag, qRPHDetails.proxyNotifFlag) && j.b(this.creditAccountNumber, qRPHDetails.creditAccountNumber) && j.b(this.globalUniqueIdentifier, qRPHDetails.globalUniqueIdentifier) && j.b(this.acquirerId, qRPHDetails.acquirerId) && j.b(this.paymentType, qRPHDetails.paymentType) && j.b(this.merchantCountryCode, qRPHDetails.merchantCountryCode) && j.b(this.merchantCity, qRPHDetails.merchantCity) && j.b(this.merchantId, qRPHDetails.merchantId) && j.b(this.merchantMobileNumber, qRPHDetails.merchantMobileNumber) && j.b(this.merchantName, qRPHDetails.merchantName) && j.b(this.merchantPostalCode, qRPHDetails.merchantPostalCode) && j.b(this.payloadFormatIndicator, qRPHDetails.payloadFormatIndicator) && j.b(this.pointOfInitiation, qRPHDetails.pointOfInitiation) && j.b(this.transactionCurrencyCode, qRPHDetails.transactionCurrencyCode) && j.b(this.merchantCategoryCode, qRPHDetails.merchantCategoryCode) && j.b(this.merchantCrc, qRPHDetails.merchantCrc) && j.b(this.merchantCreditAccountNumber, qRPHDetails.merchantCreditAccountNumber) && j.b(this.transactionAmount, qRPHDetails.transactionAmount) && j.b(this.additionalData, qRPHDetails.additionalData) && j.b(this.additionalDataPayload, qRPHDetails.additionalDataPayload) && j.b(this.p2pMerchantAccountInformation, qRPHDetails.p2pMerchantAccountInformation) && j.b(this.p2mMerchantAccountInformation, qRPHDetails.p2mMerchantAccountInformation) && j.b(this.payloadInformationIndicator, qRPHDetails.payloadInformationIndicator) && j.b(this.languageData, qRPHDetails.languageData) && j.b(this.convenienceIndicator, qRPHDetails.convenienceIndicator) && j.b(this.convenienceFeeFixed, qRPHDetails.convenienceFeeFixed) && j.b(this.convenienceFeePercentage, qRPHDetails.convenienceFeePercentage);
    }

    public final String getAcquirerId() {
        return this.acquirerId;
    }

    public final String getAcquirerRequiredInfo() {
        return this.acquirerRequiredInfo;
    }

    public final QRAdditionalData getAdditionalData() {
        return this.additionalData;
    }

    public final C2506b getAdditionalDataPayload() {
        return this.additionalDataPayload;
    }

    public final String getConvenienceFeeFixed() {
        return this.convenienceFeeFixed;
    }

    public final String getConvenienceFeePercentage() {
        return this.convenienceFeePercentage;
    }

    public final String getConvenienceIndicator() {
        return this.convenienceIndicator;
    }

    public final String getCreditAccountNumber() {
        return this.creditAccountNumber;
    }

    public final String getGlobalUniqueIdentifier() {
        return this.globalUniqueIdentifier;
    }

    public final C2507c getLanguageData() {
        return this.languageData;
    }

    public final String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    public final String getMerchantCity() {
        return this.merchantCity;
    }

    public final String getMerchantCountryCode() {
        return this.merchantCountryCode;
    }

    public final String getMerchantCrc() {
        return this.merchantCrc;
    }

    public final String getMerchantCreditAccountNumber() {
        return this.merchantCreditAccountNumber;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getMerchantMobileNumber() {
        return this.merchantMobileNumber;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getMerchantPostalCode() {
        return this.merchantPostalCode;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final C2508d getP2mMerchantAccountInformation() {
        return this.p2mMerchantAccountInformation;
    }

    public final C2508d getP2pMerchantAccountInformation() {
        return this.p2pMerchantAccountInformation;
    }

    public final String getPayloadFormatIndicator() {
        return this.payloadFormatIndicator;
    }

    public final String getPayloadInformationIndicator() {
        return this.payloadInformationIndicator;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final String getPointOfInitiation() {
        return this.pointOfInitiation;
    }

    public final String getProxyNotifFlag() {
        return this.proxyNotifFlag;
    }

    public final String getTransactionAmount() {
        return this.transactionAmount;
    }

    public final String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    public int hashCode() {
        String str = this.acquirerRequiredInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mobileNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.proxyNotifFlag;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.creditAccountNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.globalUniqueIdentifier;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.acquirerId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentType;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.merchantCountryCode;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.merchantCity;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.merchantId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.merchantMobileNumber;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.merchantName;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.merchantPostalCode;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.payloadFormatIndicator;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.pointOfInitiation;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.transactionCurrencyCode;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.merchantCategoryCode;
        int iHashCode17 = (iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.merchantCrc;
        int iHashCode18 = (iHashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.merchantCreditAccountNumber;
        int iHashCode19 = (iHashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.transactionAmount;
        int iHashCode20 = (iHashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        QRAdditionalData qRAdditionalData = this.additionalData;
        int iHashCode21 = (iHashCode20 + (qRAdditionalData == null ? 0 : qRAdditionalData.hashCode())) * 31;
        C2506b c2506b = this.additionalDataPayload;
        int iHashCode22 = (iHashCode21 + (c2506b == null ? 0 : c2506b.hashCode())) * 31;
        C2508d c2508d = this.p2pMerchantAccountInformation;
        int iHashCode23 = (iHashCode22 + (c2508d == null ? 0 : c2508d.hashCode())) * 31;
        C2508d c2508d2 = this.p2mMerchantAccountInformation;
        int iHashCode24 = (iHashCode23 + (c2508d2 == null ? 0 : c2508d2.hashCode())) * 31;
        String str21 = this.payloadInformationIndicator;
        int iHashCode25 = (iHashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        C2507c c2507c = this.languageData;
        int iHashCode26 = (iHashCode25 + (c2507c == null ? 0 : c2507c.hashCode())) * 31;
        String str22 = this.convenienceIndicator;
        int iHashCode27 = (iHashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.convenienceFeeFixed;
        int iHashCode28 = (iHashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.convenienceFeePercentage;
        return iHashCode28 + (str24 != null ? str24.hashCode() : 0);
    }

    public final void setAcquirerId(String str) {
        this.acquirerId = str;
    }

    public final void setAcquirerRequiredInfo(String str) {
        this.acquirerRequiredInfo = str;
    }

    public final void setAdditionalData(QRAdditionalData qRAdditionalData) {
        this.additionalData = qRAdditionalData;
    }

    public final void setAdditionalDataPayload(C2506b c2506b) {
        this.additionalDataPayload = c2506b;
    }

    public final void setConvenienceFeeFixed(String str) {
        this.convenienceFeeFixed = str;
    }

    public final void setConvenienceFeePercentage(String str) {
        this.convenienceFeePercentage = str;
    }

    public final void setConvenienceIndicator(String str) {
        this.convenienceIndicator = str;
    }

    public final void setCreditAccountNumber(String str) {
        this.creditAccountNumber = str;
    }

    public final void setGlobalUniqueIdentifier(String str) {
        this.globalUniqueIdentifier = str;
    }

    public final void setLanguageData(C2507c c2507c) {
        this.languageData = c2507c;
    }

    public final void setMerchantCategoryCode(String str) {
        this.merchantCategoryCode = str;
    }

    public final void setMerchantCity(String str) {
        this.merchantCity = str;
    }

    public final void setMerchantCountryCode(String str) {
        this.merchantCountryCode = str;
    }

    public final void setMerchantCrc(String str) {
        this.merchantCrc = str;
    }

    public final void setMerchantCreditAccountNumber(String str) {
        this.merchantCreditAccountNumber = str;
    }

    public final void setMerchantId(String str) {
        this.merchantId = str;
    }

    public final void setMerchantMobileNumber(String str) {
        this.merchantMobileNumber = str;
    }

    public final void setMerchantName(String str) {
        this.merchantName = str;
    }

    public final void setMerchantPostalCode(String str) {
        this.merchantPostalCode = str;
    }

    public final void setMobileNumber(String str) {
        this.mobileNumber = str;
    }

    public final void setP2mMerchantAccountInformation(C2508d c2508d) {
        this.p2mMerchantAccountInformation = c2508d;
    }

    public final void setP2pMerchantAccountInformation(C2508d c2508d) {
        this.p2pMerchantAccountInformation = c2508d;
    }

    public final void setPayloadFormatIndicator(String str) {
        this.payloadFormatIndicator = str;
    }

    public final void setPayloadInformationIndicator(String str) {
        this.payloadInformationIndicator = str;
    }

    public final void setPaymentType(String str) {
        this.paymentType = str;
    }

    public final void setPointOfInitiation(String str) {
        this.pointOfInitiation = str;
    }

    public final void setProxyNotifFlag(String str) {
        this.proxyNotifFlag = str;
    }

    public final void setTransactionAmount(String str) {
        this.transactionAmount = str;
    }

    public final void setTransactionCurrencyCode(String str) {
        this.transactionCurrencyCode = str;
    }

    public String toString() {
        String str = this.acquirerRequiredInfo;
        String str2 = this.mobileNumber;
        String str3 = this.proxyNotifFlag;
        String str4 = this.creditAccountNumber;
        String str5 = this.globalUniqueIdentifier;
        String str6 = this.acquirerId;
        String str7 = this.paymentType;
        String str8 = this.merchantCountryCode;
        String str9 = this.merchantCity;
        String str10 = this.merchantId;
        String str11 = this.merchantMobileNumber;
        String str12 = this.merchantName;
        String str13 = this.merchantPostalCode;
        String str14 = this.payloadFormatIndicator;
        String str15 = this.pointOfInitiation;
        String str16 = this.transactionCurrencyCode;
        String str17 = this.merchantCategoryCode;
        String str18 = this.merchantCrc;
        String str19 = this.merchantCreditAccountNumber;
        String str20 = this.transactionAmount;
        QRAdditionalData qRAdditionalData = this.additionalData;
        C2506b c2506b = this.additionalDataPayload;
        C2508d c2508d = this.p2pMerchantAccountInformation;
        C2508d c2508d2 = this.p2mMerchantAccountInformation;
        String str21 = this.payloadInformationIndicator;
        C2507c c2507c = this.languageData;
        String str22 = this.convenienceIndicator;
        String str23 = this.convenienceFeeFixed;
        String str24 = this.convenienceFeePercentage;
        StringBuilder sbX = s.x("QRPHDetails(acquirerRequiredInfo=", str, ", mobileNumber=", str2, ", proxyNotifFlag=");
        c.A(sbX, str3, ", creditAccountNumber=", str4, ", globalUniqueIdentifier=");
        c.A(sbX, str5, ", acquirerId=", str6, ", paymentType=");
        c.A(sbX, str7, ", merchantCountryCode=", str8, ", merchantCity=");
        c.A(sbX, str9, ", merchantId=", str10, ", merchantMobileNumber=");
        c.A(sbX, str11, ", merchantName=", str12, ", merchantPostalCode=");
        c.A(sbX, str13, ", payloadFormatIndicator=", str14, ", pointOfInitiation=");
        c.A(sbX, str15, ", transactionCurrencyCode=", str16, ", merchantCategoryCode=");
        c.A(sbX, str17, ", merchantCrc=", str18, ", merchantCreditAccountNumber=");
        c.A(sbX, str19, ", transactionAmount=", str20, ", additionalData=");
        sbX.append(qRAdditionalData);
        sbX.append(", additionalDataPayload=");
        sbX.append(c2506b);
        sbX.append(", p2pMerchantAccountInformation=");
        sbX.append(c2508d);
        sbX.append(", p2mMerchantAccountInformation=");
        sbX.append(c2508d2);
        sbX.append(", payloadInformationIndicator=");
        sbX.append(str21);
        sbX.append(", languageData=");
        sbX.append(c2507c);
        sbX.append(", convenienceIndicator=");
        c.A(sbX, str22, ", convenienceFeeFixed=", str23, ", convenienceFeePercentage=");
        return s.p(sbX, str24, ")");
    }

    public QRPHDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, QRAdditionalData qRAdditionalData, C2506b c2506b, C2508d c2508d, C2508d c2508d2, String str21, C2507c c2507c, String str22, String str23, String str24) {
        this.acquirerRequiredInfo = str;
        this.mobileNumber = str2;
        this.proxyNotifFlag = str3;
        this.creditAccountNumber = str4;
        this.globalUniqueIdentifier = str5;
        this.acquirerId = str6;
        this.paymentType = str7;
        this.merchantCountryCode = str8;
        this.merchantCity = str9;
        this.merchantId = str10;
        this.merchantMobileNumber = str11;
        this.merchantName = str12;
        this.merchantPostalCode = str13;
        this.payloadFormatIndicator = str14;
        this.pointOfInitiation = str15;
        this.transactionCurrencyCode = str16;
        this.merchantCategoryCode = str17;
        this.merchantCrc = str18;
        this.merchantCreditAccountNumber = str19;
        this.transactionAmount = str20;
        this.additionalData = qRAdditionalData;
        this.additionalDataPayload = c2506b;
        this.p2pMerchantAccountInformation = c2508d;
        this.p2mMerchantAccountInformation = c2508d2;
        this.payloadInformationIndicator = str21;
        this.languageData = c2507c;
        this.convenienceIndicator = str22;
        this.convenienceFeeFixed = str23;
        this.convenienceFeePercentage = str24;
    }

    public /* synthetic */ QRPHDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, QRAdditionalData qRAdditionalData, C2506b c2506b, C2508d c2508d, C2508d c2508d2, String str21, C2507c c2507c, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : qRAdditionalData, (i & 2097152) != 0 ? null : c2506b, (i & 4194304) != 0 ? null : c2508d, (i & 8388608) != 0 ? null : c2508d2, (i & 16777216) != 0 ? null : str21, (i & 33554432) != 0 ? null : c2507c, (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : str22, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str23, (i & 268435456) != 0 ? null : str24);
    }
}
