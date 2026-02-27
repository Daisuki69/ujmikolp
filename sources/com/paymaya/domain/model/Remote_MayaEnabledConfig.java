package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.MayaEnabledConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_MayaEnabledConfig<T extends MayaEnabledConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_MayaEnabledConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public String ekycZoloz() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "ekyc_zoloz_3");
    }

    public String mAuthorizeRequest() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "push_approval_2");
    }

    public String mCashinMayaSavingsButton() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "cashin_maya_savings_button");
    }

    public String mCashinWalletSettings() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "cashin_wallet_settings");
    }

    public String mCashinWalletSettingsAutoCashInOption() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "cashin_wallet_settings_auto_cash_in_option");
    }

    public String mCheckoutOnQR() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "checkout_on_qr");
    }

    public String mCredit() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "credit");
    }

    public String mCreditV2() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "credit_v2");
    }

    public String mCreditV3() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "credit_v3");
    }

    public String mLoans() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "loans");
    }

    public String mPayBills() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "pay_bills");
    }

    public String mQRReceipt() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "qr_receipt");
    }

    public String mQRScan() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "qr_scan");
    }

    public String mQrP2pAdjustments() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "qrp2p_adjustment");
    }

    public String mRequestMoney() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "request_money");
    }

    public String mRestrictedLogin() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "restricted_login_flow");
    }

    public String mShop() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shop");
    }

    public String mShopCheckout() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shop_checkout");
    }

    public String mShopHistoryReceipt() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shop_history_receipt");
    }

    public String mShopReceipt() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "shop_receipt");
    }

    public String mUsername() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "username");
    }

    public String mVouchersReceipt() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "vouchers_receipt");
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "credit"), this.mTarget.mCredit());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "restricted_login_flow"), this.mTarget.mRestrictedLogin());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "loans"), this.mTarget.mLoans());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "qr_scan"), this.mTarget.mQRScan());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "request_money"), this.mTarget.mRequestMoney());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "credit_v2"), this.mTarget.mCreditV2());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "pay_bills"), this.mTarget.mPayBills());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "qrp2p_adjustment"), this.mTarget.mQrP2pAdjustments());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "credit_v3"), this.mTarget.mCreditV3());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shop"), this.mTarget.mShop());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shop_history_receipt"), this.mTarget.mShopHistoryReceipt());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "qr_receipt"), this.mTarget.mQRReceipt());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "vouchers_receipt"), this.mTarget.mVouchersReceipt());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shop_receipt"), this.mTarget.mShopReceipt());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "shop_checkout"), this.mTarget.mShopCheckout());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "username"), this.mTarget.mUsername());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "ekyc_zoloz_3"), this.mTarget.ekycZoloz());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "push_approval_2"), this.mTarget.mAuthorizeRequest());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "cashin_maya_savings_button"), this.mTarget.mCashinMayaSavingsButton());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "cashin_wallet_settings"), this.mTarget.mCashinWalletSettings());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "cashin_wallet_settings_auto_cash_in_option"), this.mTarget.mCashinWalletSettingsAutoCashInOption());
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "checkout_on_qr"), this.mTarget.mCheckoutOnQR());
    }

    public void updateConfig() {
        MayaEnabledConfig.Builder builder = this.mTarget.toBuilder();
        builder.mCredit(Boolean.valueOf(this.mRemoteConfig.c(mCredit())));
        builder.mRestrictedLogin(Boolean.valueOf(this.mRemoteConfig.c(mRestrictedLogin())));
        builder.mLoans(Boolean.valueOf(this.mRemoteConfig.c(mLoans())));
        builder.mQRScan(Boolean.valueOf(this.mRemoteConfig.c(mQRScan())));
        builder.mRequestMoney(Boolean.valueOf(this.mRemoteConfig.c(mRequestMoney())));
        builder.mCreditV2(Boolean.valueOf(this.mRemoteConfig.c(mCreditV2())));
        builder.mPayBills(Boolean.valueOf(this.mRemoteConfig.c(mPayBills())));
        builder.mQrP2pAdjustments(Boolean.valueOf(this.mRemoteConfig.c(mQrP2pAdjustments())));
        builder.mCreditV3(Boolean.valueOf(this.mRemoteConfig.c(mCreditV3())));
        builder.mShop(Boolean.valueOf(this.mRemoteConfig.c(mShop())));
        builder.mShopHistoryReceipt(Boolean.valueOf(this.mRemoteConfig.c(mShopHistoryReceipt())));
        builder.mQRReceipt(Boolean.valueOf(this.mRemoteConfig.c(mQRReceipt())));
        builder.mVouchersReceipt(Boolean.valueOf(this.mRemoteConfig.c(mVouchersReceipt())));
        builder.mShopReceipt(Boolean.valueOf(this.mRemoteConfig.c(mShopReceipt())));
        builder.mShopCheckout(Boolean.valueOf(this.mRemoteConfig.c(mShopCheckout())));
        builder.mUsername(Boolean.valueOf(this.mRemoteConfig.c(mUsername())));
        builder.ekycZoloz(Boolean.valueOf(this.mRemoteConfig.c(ekycZoloz())));
        builder.mAuthorizeRequest(Boolean.valueOf(this.mRemoteConfig.c(mAuthorizeRequest())));
        builder.mCashinMayaSavingsButton(Boolean.valueOf(this.mRemoteConfig.c(mCashinMayaSavingsButton())));
        builder.mCashinWalletSettings(Boolean.valueOf(this.mRemoteConfig.c(mCashinWalletSettings())));
        builder.mCashinWalletSettingsAutoCashInOption(Boolean.valueOf(this.mRemoteConfig.c(mCashinWalletSettingsAutoCashInOption())));
        builder.mCheckoutOnQR(Boolean.valueOf(this.mRemoteConfig.c(mCheckoutOnQR())));
        this.mTarget = (T) builder.build();
    }
}
