package com.paymaya.domain.model;

import W2.e;
import We.s;
import androidx.annotation.NonNull;
import com.paymaya.domain.model.ServiceAvailabilityConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_ServiceAvailabilityConfig<T extends ServiceAvailabilityConfig> {
    private String mAbsolutePath;
    private e mRemoteConfig = e.f();
    protected T mTarget;

    public Remote_ServiceAvailabilityConfig(@NonNull T t5, String str) {
        this.mTarget = t5;
        this.mAbsolutePath = str;
    }

    public Remote_AvailabilityConfig mAccountLimitsAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mAccountLimitsAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "account_limits_"));
    }

    public Remote_AvailabilityConfig mAddMoneyViaCardService() {
        return new Remote_AvailabilityConfig(this.mTarget.mAddMoneyViaCardService(), s.p(new StringBuilder(), this.mAbsolutePath, "add_money_via_card_service_"));
    }

    public Remote_AvailabilityConfig mBankTransferAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mBankTransferAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "send_money_via_bank_"));
    }

    public Remote_AvailabilityConfig mCardsAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mCardsAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "cards_"));
    }

    public Remote_AvailabilityConfig mCashInViaBankServiceAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mCashInViaBankServiceAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "bank_pull_service_"));
    }

    public Remote_AvailabilityConfig mCryptoAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mCryptoAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "crypto_"));
    }

    public Remote_AvailabilityConfig mCryptoV2Availability() {
        return new Remote_AvailabilityConfig(this.mTarget.mCryptoV2Availability(), s.p(new StringBuilder(), this.mAbsolutePath, "crypto_v2_"));
    }

    public Remote_AvailabilityConfig mFavoritesAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mFavoritesAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "my_favorites_"));
    }

    public Remote_AvailabilityConfig mFundsAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mFundsAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "funds_"));
    }

    public Remote_AvailabilityConfig mInboxAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mInboxAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "inbox_"));
    }

    public Remote_AvailabilityConfig mLoadAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mLoadAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "load_"));
    }

    public Remote_AvailabilityConfig mLoanAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mLoanAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "loan_service_"));
    }

    public Remote_AvailabilityConfig mMayaCreditAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mMayaCreditAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_credit_"));
    }

    public Remote_AvailabilityConfig mMerchantPaymentAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mMerchantPaymentAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "purchase_service_"));
    }

    public Remote_AvailabilityConfig mMissionsAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mMissionsAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "missions_"));
    }

    public Remote_AvailabilityConfig mPayBillsAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mPayBillsAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "pay_bills_"));
    }

    public Remote_AvailabilityConfig mQROffUsAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mQROffUsAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "qr_off_us_"));
    }

    public Remote_AvailabilityConfig mSendMoneyAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mSendMoneyAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "send_money_"));
    }

    public Remote_AvailabilityConfig mShopPurchaseHistoryAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mShopPurchaseHistoryAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "shop_purchase_history_"));
    }

    public Remote_AvailabilityConfig mShopServiceAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mShopServiceAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "shop_service_"));
    }

    public Remote_AvailabilityConfig mTravelAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mTravelAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "transport_"));
    }

    public Remote_AvailabilityConfig mVouchersAvailability() {
        return new Remote_AvailabilityConfig(this.mTarget.mVouchersAvailability(), s.p(new StringBuilder(), this.mAbsolutePath, "vouchers_service_"));
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        mSendMoneyAvailability().setDefaultRemoteConfig(map);
        mPayBillsAvailability().setDefaultRemoteConfig(map);
        mShopServiceAvailability().setDefaultRemoteConfig(map);
        mShopPurchaseHistoryAvailability().setDefaultRemoteConfig(map);
        mMerchantPaymentAvailability().setDefaultRemoteConfig(map);
        mAddMoneyViaCardService().setDefaultRemoteConfig(map);
        mBankTransferAvailability().setDefaultRemoteConfig(map);
        mLoanAvailability().setDefaultRemoteConfig(map);
        mVouchersAvailability().setDefaultRemoteConfig(map);
        mFavoritesAvailability().setDefaultRemoteConfig(map);
        mInboxAvailability().setDefaultRemoteConfig(map);
        mAccountLimitsAvailability().setDefaultRemoteConfig(map);
        mTravelAvailability().setDefaultRemoteConfig(map);
        mMissionsAvailability().setDefaultRemoteConfig(map);
        mMayaCreditAvailability().setDefaultRemoteConfig(map);
        mFundsAvailability().setDefaultRemoteConfig(map);
        mCryptoAvailability().setDefaultRemoteConfig(map);
        mCryptoV2Availability().setDefaultRemoteConfig(map);
        mCashInViaBankServiceAvailability().setDefaultRemoteConfig(map);
        mLoadAvailability().setDefaultRemoteConfig(map);
        mCardsAvailability().setDefaultRemoteConfig(map);
        mQROffUsAvailability().setDefaultRemoteConfig(map);
    }

    public void updateConfig() {
        ServiceAvailabilityConfig.Builder builder = this.mTarget.toBuilder();
        Remote_AvailabilityConfig remote_AvailabilityConfigMSendMoneyAvailability = mSendMoneyAvailability();
        remote_AvailabilityConfigMSendMoneyAvailability.updateConfig();
        builder.mSendMoneyAvailability(remote_AvailabilityConfigMSendMoneyAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMPayBillsAvailability = mPayBillsAvailability();
        remote_AvailabilityConfigMPayBillsAvailability.updateConfig();
        builder.mPayBillsAvailability(remote_AvailabilityConfigMPayBillsAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMShopServiceAvailability = mShopServiceAvailability();
        remote_AvailabilityConfigMShopServiceAvailability.updateConfig();
        builder.mShopServiceAvailability(remote_AvailabilityConfigMShopServiceAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMShopPurchaseHistoryAvailability = mShopPurchaseHistoryAvailability();
        remote_AvailabilityConfigMShopPurchaseHistoryAvailability.updateConfig();
        builder.mShopPurchaseHistoryAvailability(remote_AvailabilityConfigMShopPurchaseHistoryAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMMerchantPaymentAvailability = mMerchantPaymentAvailability();
        remote_AvailabilityConfigMMerchantPaymentAvailability.updateConfig();
        builder.mMerchantPaymentAvailability(remote_AvailabilityConfigMMerchantPaymentAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMAddMoneyViaCardService = mAddMoneyViaCardService();
        remote_AvailabilityConfigMAddMoneyViaCardService.updateConfig();
        builder.mAddMoneyViaCardService(remote_AvailabilityConfigMAddMoneyViaCardService.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMBankTransferAvailability = mBankTransferAvailability();
        remote_AvailabilityConfigMBankTransferAvailability.updateConfig();
        builder.mBankTransferAvailability(remote_AvailabilityConfigMBankTransferAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMLoanAvailability = mLoanAvailability();
        remote_AvailabilityConfigMLoanAvailability.updateConfig();
        builder.mLoanAvailability(remote_AvailabilityConfigMLoanAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMVouchersAvailability = mVouchersAvailability();
        remote_AvailabilityConfigMVouchersAvailability.updateConfig();
        builder.mVouchersAvailability(remote_AvailabilityConfigMVouchersAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMFavoritesAvailability = mFavoritesAvailability();
        remote_AvailabilityConfigMFavoritesAvailability.updateConfig();
        builder.mFavoritesAvailability(remote_AvailabilityConfigMFavoritesAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMInboxAvailability = mInboxAvailability();
        remote_AvailabilityConfigMInboxAvailability.updateConfig();
        builder.mInboxAvailability(remote_AvailabilityConfigMInboxAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMAccountLimitsAvailability = mAccountLimitsAvailability();
        remote_AvailabilityConfigMAccountLimitsAvailability.updateConfig();
        builder.mAccountLimitsAvailability(remote_AvailabilityConfigMAccountLimitsAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMTravelAvailability = mTravelAvailability();
        remote_AvailabilityConfigMTravelAvailability.updateConfig();
        builder.mTravelAvailability(remote_AvailabilityConfigMTravelAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMMissionsAvailability = mMissionsAvailability();
        remote_AvailabilityConfigMMissionsAvailability.updateConfig();
        builder.mMissionsAvailability(remote_AvailabilityConfigMMissionsAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMMayaCreditAvailability = mMayaCreditAvailability();
        remote_AvailabilityConfigMMayaCreditAvailability.updateConfig();
        builder.mMayaCreditAvailability(remote_AvailabilityConfigMMayaCreditAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMFundsAvailability = mFundsAvailability();
        remote_AvailabilityConfigMFundsAvailability.updateConfig();
        builder.mFundsAvailability(remote_AvailabilityConfigMFundsAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMCryptoAvailability = mCryptoAvailability();
        remote_AvailabilityConfigMCryptoAvailability.updateConfig();
        builder.mCryptoAvailability(remote_AvailabilityConfigMCryptoAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMCryptoV2Availability = mCryptoV2Availability();
        remote_AvailabilityConfigMCryptoV2Availability.updateConfig();
        builder.mCryptoV2Availability(remote_AvailabilityConfigMCryptoV2Availability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMCashInViaBankServiceAvailability = mCashInViaBankServiceAvailability();
        remote_AvailabilityConfigMCashInViaBankServiceAvailability.updateConfig();
        builder.mCashInViaBankServiceAvailability(remote_AvailabilityConfigMCashInViaBankServiceAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMLoadAvailability = mLoadAvailability();
        remote_AvailabilityConfigMLoadAvailability.updateConfig();
        builder.mLoadAvailability(remote_AvailabilityConfigMLoadAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMCardsAvailability = mCardsAvailability();
        remote_AvailabilityConfigMCardsAvailability.updateConfig();
        builder.mCardsAvailability(remote_AvailabilityConfigMCardsAvailability.mTarget);
        Remote_AvailabilityConfig remote_AvailabilityConfigMQROffUsAvailability = mQROffUsAvailability();
        remote_AvailabilityConfigMQROffUsAvailability.updateConfig();
        builder.mQROffUsAvailability(remote_AvailabilityConfigMQROffUsAvailability.mTarget);
        this.mTarget = (T) builder.build();
    }
}
