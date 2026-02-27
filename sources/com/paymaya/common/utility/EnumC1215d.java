package com.paymaya.common.utility;

import com.paymaya.domain.model.DataPrivacyProvision;

/* JADX INFO: renamed from: com.paymaya.common.utility.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC1215d implements InterfaceC1214c {
    WIZARD_V2("WIZARD_V2"),
    NEW_WIZARD("NEW_WIZARD"),
    WELCOME("WELCOME"),
    FORCED_UPDATE("FORCED_UPDATE"),
    LOGIN("LOGIN"),
    REGISTRATION("REGISTRATION"),
    VERIFICATION("VERIFICATION"),
    OTP("OTP"),
    DATA_PRIVACY("DATA_PRIVACY"),
    DASHBOARD("DASHBOARD"),
    ACTIVITY("ACTIVITY"),
    SEND_MONEY("SEND_MONEY"),
    /* JADX INFO: Fake field, exist only in values array */
    SEND_MONEY_SCREEN("SEND_MONEY_SCREEN"),
    SEND_MONEY_CONFIRMATION("SEND_MONEY_CONFIRMATION"),
    /* JADX INFO: Fake field, exist only in values array */
    SEND_MONEY_SUCCESS("SEND_MONEY_SUCCESS"),
    BANK_TRANSFER("BANK_TRANSFER"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("BANK_TRANSFER_MFA_SETUP"),
    BANK_TRANSFER_SCREEN("BANK_TRANSFER_SCREEN"),
    BANK_TRANSFER_BANK_LIST("BANK_TRANSFER_BANK_LIST"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("BANK_TRANSFER_PROCESSING"),
    BANK_TRANSFER_CONFIRMATION("BANK_TRANSFER_CONFIRMATION"),
    PAY_BILLS("PAY_BILLS"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("PAY_BILLS_SEARCH"),
    SCAN("SCAN"),
    SCAN_QR("SCAN_QR"),
    SHOP("SHOP"),
    SHOP_SEARCH("SHOP_SEARCH"),
    SHOP_PROVIDER("SHOP_PROVIDER"),
    SHOP_PROVIDER_SUBCATEGORY("SHOP_PROVIDER_SUBCATEGORY"),
    MY_CARDS("MY_CARDS"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("PHYSICAL_CARD"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("MY_CARDS_SETTINGS"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("RESET_PIN"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("BLOCK_CARD"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("VIRTUAL_CARD"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("KYC"),
    EKYC("EKYC"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("EKYC_V5"),
    EKYC_V6("EKYC_V6"),
    SETTINGS("SETTINGS"),
    CHANGE_PASSWORD("CHANGE_PASSWORD"),
    ACCOUNT_RECOVERY("ACCOUNT_RECOVERY"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("ADD_MONEY"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("MONEY_IN"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("SEVEN_CONNECT"),
    P2M("P2M"),
    DYNAMIC_P2M("DYNAMIC_P2M"),
    MENU("MENU"),
    INBOX("INBOX"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("INBOX_FLUTTER"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("INVITE_CODE"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("INVITE_FRIENDS"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("VIDEO_CALL"),
    WESTERN_UNION("WESTERN_UNION"),
    SUPPORT("SUPPORT"),
    PERSONAL_QR("PERSONAL_QR"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("MY_LOANS"),
    SESSION_TIMEOUT("SESSION_TIMEOUT"),
    SHORTCUT("SHORTCUT"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("PADALA"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("CLAIM"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("CUSTOMER_DETAILS"),
    REQUEST_MONEY("REQUEST_MONEY"),
    PROFILE("PROFILE"),
    DEEP_LINK("DEEP_LINK"),
    MISSIONS("MISSIONS"),
    FOOD("FOOD"),
    GOVERNMENT("GOVERNMENT"),
    RETAIL("RETAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("BPI"),
    VOUCHER("VOUCHER"),
    VOUCHER_REMINDER("VOUCHER_REMINDER"),
    ACCOUNT_LIMITS("ACCOUNT_LIMITS"),
    MY_FAVORITES("MY_FAVORITES"),
    BARCODE("BARCODE"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("PADALA_TOP_UP"),
    MOBILE_NUMBER("MOBILE_NUMBER"),
    CHANGE_MOBILE("CHANGE_MOBILE"),
    ENTER_NEW_MOBILE_NUMBER("ENTER_NEW_MOBILE_NUMBER"),
    RECEIPT("RECEIPT"),
    ADD_TO_FAVORITES("ADD_TO_FAVORITES"),
    ACTIVITY_LIST("ACTIVITY_LIST"),
    TRANSPORT("TRANSPORT"),
    TRAVEL("TRAVEL"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("MORE_SERVICES"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("PREVIEW"),
    SET_PUBLIC_NAME("SET_PUBLIC_NAME"),
    WEBVIEW("WEBVIEW"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("DISCLOSURE"),
    EDD("EDD"),
    BANK_PULL("BANK_PULL"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("LOCATION_OFF"),
    LOCATION_PERMISSION("LOCATION_PERMISSION"),
    INVEST("INVEST"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("MINI_APP"),
    QRPH("QRPH"),
    MAYA_CREDIT("MAYA_CREDIT"),
    CREDIT("CREDIT"),
    LOANS("LOANS"),
    LOANS_CREDIT_CARD("CC"),
    PURCHASE_FINANCING("PF"),
    LUCKY_GAMES("LUCKY_GAMES"),
    WALLET(DataPrivacyProvision.ID_WALLET),
    SERVICES("SERVICES"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("NAV"),
    SAVINGS(DataPrivacyProvision.ID_SAVINGS),
    CASH_IN("CASH_IN"),
    FUNDS("FUNDS"),
    FACE_AUTH_PROMPT("FACE_AUTH_PROMPT"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("FACE_AUTH"),
    FACE_AUTH_FAIL("FACE_AUTH_FAIL"),
    PUSH_APPROVAL("PUSH_APPROVAL"),
    AUTO_CASH_IN("AUTO_CASH_IN"),
    CREATOR_STORE("CREATOR_STORE"),
    MERCHANT_REWARDS("MERCHANT_REWARDS"),
    INSURANCE("INSURANCE"),
    PAYLATER("PAYLATER"),
    STOCKS("STOCKS"),
    STREAM("STREAM"),
    LOGOUT("LOGOUT"),
    APPSFLYER("APPSFLYER"),
    REMITTANCE("REMITTANCE"),
    STOCKS_GAME("STOCKS_GAME"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("MAYA_FUNDS"),
    MAINTENANCE("MAINTENANCE"),
    /* JADX INFO: Fake field, exist only in values array */
    AGE_RESTRICTED("AGE_RESTRICTED"),
    ERROR("ERROR"),
    IN_APP_REVIEW("IN_APP_REVIEW"),
    ACTION_CARD("ACTION_CARD"),
    CRYPTO("CRYPTO"),
    ESIMS("ESIMS"),
    SPARK_HACKATHON("SPARK_HACKATHON"),
    /* JADX INFO: Fake field, exist only in values array */
    QR("QR"),
    MANAGE_DEVICES("MANAGE_DEVICES"),
    MAYA_APP("MAYA_APP"),
    PAL("PAL"),
    SPLIT("SPLIT"),
    MAYA_XP("MAYA_XP"),
    DEFAULT("MODULE");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10786a;

    EnumC1215d(String str) {
        this.f10786a = str;
    }

    @Override // com.paymaya.common.utility.InterfaceC1214c
    public final String getValue() {
        return this.f10786a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return We.s.p(new StringBuilder("MODULE{value='"), this.f10786a, "'}");
    }
}
