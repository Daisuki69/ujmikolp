package com.paymaya.domain.model;

import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_ServiceAvailabilityConfig;
import com.paymaya.domain.model.C$AutoValue_ServiceAvailabilityConfig;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ServiceAvailabilityConfig {

    public static abstract class Builder {
        public abstract ServiceAvailabilityConfig build();

        public abstract Builder mAccountLimitsAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mAddMoneyViaCardService(AvailabilityConfig availabilityConfig);

        public abstract Builder mBankTransferAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mCardsAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mCashInViaBankServiceAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mCryptoAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mCryptoV2Availability(AvailabilityConfig availabilityConfig);

        public abstract Builder mFavoritesAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mFundsAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mInboxAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mLoadAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mLoanAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mMayaCreditAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mMerchantPaymentAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mMissionsAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mPayBillsAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mQROffUsAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mSendMoneyAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mShopPurchaseHistoryAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mShopServiceAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mTravelAvailability(AvailabilityConfig availabilityConfig);

        public abstract Builder mVouchersAvailability(AvailabilityConfig availabilityConfig);
    }

    public static Builder sBuilder() {
        return new C$AutoValue_ServiceAvailabilityConfig.Builder().mSendMoneyAvailability(AvailabilityConfig.sBuilder().build()).mPayBillsAvailability(AvailabilityConfig.sBuilder().build()).mShopServiceAvailability(AvailabilityConfig.sBuilder().build()).mShopPurchaseHistoryAvailability(AvailabilityConfig.sBuilder().build()).mMerchantPaymentAvailability(AvailabilityConfig.sBuilder().build()).mAddMoneyViaCardService(AvailabilityConfig.sBuilder().build()).mBankTransferAvailability(AvailabilityConfig.sBuilder().build()).mLoanAvailability(AvailabilityConfig.sBuilder().build()).mVouchersAvailability(AvailabilityConfig.sBuilder().build()).mFavoritesAvailability(AvailabilityConfig.sBuilder().build()).mInboxAvailability(AvailabilityConfig.sBuilder().build()).mAccountLimitsAvailability(AvailabilityConfig.sBuilder().build()).mTravelAvailability(AvailabilityConfig.sBuilder().build()).mMissionsAvailability(AvailabilityConfig.sBuilder().build()).mMayaCreditAvailability(AvailabilityConfig.sBuilder().build()).mFundsAvailability(AvailabilityConfig.sBuilder().build()).mCashInViaBankServiceAvailability(AvailabilityConfig.sBuilder().build()).mLoadAvailability(AvailabilityConfig.sBuilder().build()).mCardsAvailability(AvailabilityConfig.sBuilder().build()).mCryptoAvailability(AvailabilityConfig.sBuilder().build()).mCryptoV2Availability(AvailabilityConfig.sBuilder().build()).mQROffUsAvailability(AvailabilityConfig.sBuilder().build());
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_ServiceAvailabilityConfig.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("account_limits")
    public abstract AvailabilityConfig mAccountLimitsAvailability();

    @InterfaceC1498b("add_money_via_card_service")
    public abstract AvailabilityConfig mAddMoneyViaCardService();

    @InterfaceC1498b("send_money_via_bank")
    public abstract AvailabilityConfig mBankTransferAvailability();

    @Nullable
    @InterfaceC1498b("cards")
    public abstract AvailabilityConfig mCardsAvailability();

    @Nullable
    @InterfaceC1498b("bank_pull_service")
    public abstract AvailabilityConfig mCashInViaBankServiceAvailability();

    @Nullable
    @InterfaceC1498b("crypto")
    public abstract AvailabilityConfig mCryptoAvailability();

    @Nullable
    @InterfaceC1498b("crypto_v2")
    public abstract AvailabilityConfig mCryptoV2Availability();

    @InterfaceC1498b("my_favorites")
    public abstract AvailabilityConfig mFavoritesAvailability();

    @Nullable
    @InterfaceC1498b("funds")
    public abstract AvailabilityConfig mFundsAvailability();

    @InterfaceC1498b("inbox")
    public abstract AvailabilityConfig mInboxAvailability();

    @Nullable
    @InterfaceC1498b("load")
    public abstract AvailabilityConfig mLoadAvailability();

    @InterfaceC1498b("loan_service")
    public abstract AvailabilityConfig mLoanAvailability();

    @Nullable
    @InterfaceC1498b("maya_credit")
    public abstract AvailabilityConfig mMayaCreditAvailability();

    @InterfaceC1498b("purchase_service")
    public abstract AvailabilityConfig mMerchantPaymentAvailability();

    @InterfaceC1498b("missions")
    public abstract AvailabilityConfig mMissionsAvailability();

    @InterfaceC1498b("pay_bills")
    public abstract AvailabilityConfig mPayBillsAvailability();

    @Nullable
    @InterfaceC1498b("qr_off_us")
    public abstract AvailabilityConfig mQROffUsAvailability();

    @InterfaceC1498b("send_money")
    public abstract AvailabilityConfig mSendMoneyAvailability();

    @InterfaceC1498b("shop_purchase_history")
    public abstract AvailabilityConfig mShopPurchaseHistoryAvailability();

    @InterfaceC1498b("shop_service")
    public abstract AvailabilityConfig mShopServiceAvailability();

    @InterfaceC1498b("transport")
    public abstract AvailabilityConfig mTravelAvailability();

    @InterfaceC1498b("vouchers_service")
    public abstract AvailabilityConfig mVouchersAvailability();

    public abstract Builder toBuilder();
}
