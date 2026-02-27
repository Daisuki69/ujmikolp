package com.paymaya.domain.model;

import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_MayaEnabledConfig;
import com.paymaya.domain.model.C$AutoValue_MayaEnabledConfig;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaEnabledConfig {

    public static abstract class Builder {
        public abstract MayaEnabledConfig build();

        public abstract Builder ekycZoloz(Boolean bool);

        public abstract Builder mAuthorizeRequest(Boolean bool);

        public abstract Builder mCashinMayaSavingsButton(Boolean bool);

        public abstract Builder mCashinWalletSettings(Boolean bool);

        public abstract Builder mCashinWalletSettingsAutoCashInOption(Boolean bool);

        public abstract Builder mCheckoutOnQR(Boolean bool);

        public abstract Builder mCredit(Boolean bool);

        public abstract Builder mCreditV2(Boolean bool);

        public abstract Builder mCreditV3(Boolean bool);

        public abstract Builder mLoans(Boolean bool);

        public abstract Builder mPayBills(Boolean bool);

        public abstract Builder mQRReceipt(Boolean bool);

        public abstract Builder mQRScan(Boolean bool);

        public abstract Builder mQrP2pAdjustments(Boolean bool);

        public abstract Builder mRequestMoney(Boolean bool);

        public abstract Builder mRestrictedLogin(Boolean bool);

        public abstract Builder mShop(Boolean bool);

        public abstract Builder mShopCheckout(Boolean bool);

        public abstract Builder mShopHistoryReceipt(Boolean bool);

        public abstract Builder mShopReceipt(Boolean bool);

        public abstract Builder mUsername(Boolean bool);

        public abstract Builder mVouchersReceipt(Boolean bool);
    }

    public static Builder sBuilder() {
        C$AutoValue_MayaEnabledConfig.Builder builder = new C$AutoValue_MayaEnabledConfig.Builder();
        Boolean bool = Boolean.TRUE;
        Builder builderMCredit = builder.mCredit(bool);
        Boolean bool2 = Boolean.FALSE;
        return builderMCredit.mRestrictedLogin(bool2).mLoans(bool2).mQRScan(bool).mRequestMoney(bool).mCreditV2(bool).mPayBills(bool2).mQrP2pAdjustments(bool).mCreditV3(bool).mShop(bool).mShopHistoryReceipt(bool).mQRReceipt(bool).mVouchersReceipt(bool).mShopReceipt(bool).mShopCheckout(bool).mUsername(bool2).ekycZoloz(bool2).mAuthorizeRequest(bool2).mCashinMayaSavingsButton(bool2).mCashinMayaSavingsButton(bool2).mCashinWalletSettings(bool2).mCashinWalletSettingsAutoCashInOption(bool2).mCheckoutOnQR(bool2);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_MayaEnabledConfig.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("ekyc_zoloz_3")
    public abstract Boolean ekycZoloz();

    @InterfaceC1498b("push_approval_2")
    public abstract Boolean mAuthorizeRequest();

    @InterfaceC1498b("cashin_maya_savings_button")
    public abstract Boolean mCashinMayaSavingsButton();

    @InterfaceC1498b("cashin_wallet_settings")
    public abstract Boolean mCashinWalletSettings();

    @InterfaceC1498b("cashin_wallet_settings_auto_cash_in_option")
    public abstract Boolean mCashinWalletSettingsAutoCashInOption();

    @InterfaceC1498b("checkout_on_qr")
    public abstract Boolean mCheckoutOnQR();

    @InterfaceC1498b("credit")
    public abstract Boolean mCredit();

    @InterfaceC1498b("credit_v2")
    public abstract Boolean mCreditV2();

    @InterfaceC1498b("credit_v3")
    public abstract Boolean mCreditV3();

    @InterfaceC1498b("loans")
    public abstract Boolean mLoans();

    @InterfaceC1498b("pay_bills")
    public abstract Boolean mPayBills();

    @InterfaceC1498b("qr_receipt")
    public abstract Boolean mQRReceipt();

    @InterfaceC1498b("qr_scan")
    public abstract Boolean mQRScan();

    @InterfaceC1498b("qrp2p_adjustment")
    public abstract Boolean mQrP2pAdjustments();

    @InterfaceC1498b("request_money")
    public abstract Boolean mRequestMoney();

    @InterfaceC1498b("restricted_login_flow")
    public abstract Boolean mRestrictedLogin();

    @InterfaceC1498b("shop")
    public abstract Boolean mShop();

    @InterfaceC1498b("shop_checkout")
    public abstract Boolean mShopCheckout();

    @InterfaceC1498b("shop_history_receipt")
    public abstract Boolean mShopHistoryReceipt();

    @InterfaceC1498b("shop_receipt")
    public abstract Boolean mShopReceipt();

    @InterfaceC1498b("username")
    public abstract Boolean mUsername();

    @InterfaceC1498b("vouchers_receipt")
    public abstract Boolean mVouchersReceipt();

    public abstract Builder toBuilder();
}
