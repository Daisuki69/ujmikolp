package com.paymaya.domain.model;

import W4.e;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AutoValue_Config;
import com.paymaya.domain.model.C$AutoValue_Config;
import g3.InterfaceC1498b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Config {
    private static final String KYC_VERSION = "v1";
    private static final int RESEND_CODE_COUNTDOWN = 30000;
    private static final int SPLIT_MAX_TIMEOUT_DURATION_IN_S = 10;

    public static abstract class Builder {
        public abstract Config build();

        public abstract Builder mAppEventsV2(AppEventsV2 appEventsV2);

        public abstract Builder mAppMaintenance(Boolean bool);

        public abstract Builder mAppMaintenanceBypass(Boolean bool);

        public abstract Builder mBNPLDeepFreezeConfig(EnabledConfig enabledConfig);

        public abstract Builder mBankPullSettingsV2Config(EnabledConfig enabledConfig);

        public abstract Builder mBankTransferConfig(EnabledConfig enabledConfig);

        public abstract Builder mBankTransferFee(BigDecimal bigDecimal);

        public abstract Builder mBillerPlaceHolderConfig(EnabledConfig enabledConfig);

        public abstract Builder mBillsPayAccountNumberConfig(BillsPayAccountNumberConfig billsPayAccountNumberConfig);

        public abstract Builder mBillsPayHandleBillableWithOtherFields(EnabledConfig enabledConfig);

        public abstract Builder mCameraXConfig(EnabledConfig enabledConfig);

        public abstract Builder mCardDetailsProtectionConfig(EnabledConfig enabledConfig);

        public abstract Builder mCashInLimitSpielConfig(EnabledConfig enabledConfig);

        public abstract Builder mChangeMinConfig(EnabledConfig enabledConfig);

        public abstract Builder mConsumerOnboardingSetPasswordConfig(EnabledConfig enabledConfig);

        public abstract Builder mCustomerRestrictionsConfig(EnabledConfig enabledConfig);

        public abstract Builder mDashboardSettingsConfig(DashboardSettingsConfig dashboardSettingsConfig);

        public abstract Builder mEDDConfig(EnabledConfig enabledConfig);

        public abstract Builder mEcommAppEventV2Config(ECommAppEventV2Config eCommAppEventV2Config);

        public abstract Builder mEddRestrictionsConfig(EnabledConfig enabledConfig);

        public abstract Builder mFreelancerHubConfig(FreelancerHubConfig freelancerHubConfig);

        public abstract Builder mFundsConfig(EnabledConfig enabledConfig);

        public abstract Builder mFundsCreatorStoreConfig(EnabledConfig enabledConfig);

        public abstract Builder mGamesConfigurableIntroConfig(EnabledConfig enabledConfig);

        public abstract Builder mGamesInterstitialConfig(GamesInterstitialConfig gamesInterstitialConfig);

        public abstract Builder mICLDblConfig(EnabledConfig enabledConfig);

        public abstract Builder mIDClassificationConfig(EnabledConfig enabledConfig);

        public abstract Builder mInAppReviewConfig(InAppReviewConfig inAppReviewConfig);

        public abstract Builder mInboxV4Config(EnabledConfig enabledConfig);

        public abstract Builder mInboxV4ManageNotifsConfig(EnabledConfig enabledConfig);

        public abstract Builder mInboxV4MayaSupportConfig(EnabledConfig enabledConfig);

        public abstract Builder mInstaPayQRConfig(EnabledConfig enabledConfig);

        public abstract Builder mKountConfig(EnabledConfig enabledConfig);

        public abstract Builder mKycCMSv8Config(EnabledConfig enabledConfig);

        public abstract Builder mKycCompletedCallbackConfig(EnabledConfig enabledConfig);

        public abstract Builder mKycPersonalInfoV2Config(EnabledConfig enabledConfig);

        public abstract Builder mKycVersion(String str);

        public abstract Builder mLandersCreditCardCashbackTileConfig(EnabledConfig enabledConfig);

        public abstract Builder mLoadConfig(LoadConfig loadConfig);

        public abstract Builder mLoadV2Config(EnabledConfig enabledConfig);

        public abstract Builder mLoyaltyForceUpdateConfig(EnabledConfig enabledConfig);

        public abstract Builder mMFAConfig(MFAConfig mFAConfig);

        public abstract Builder mMaintenanceConfig(MaintenanceConfig maintenanceConfig);

        public abstract Builder mManageDevicesConfig(EnabledConfig enabledConfig);

        public abstract Builder mMandatoryIDClassificationConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaBillerReminderConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaBillsPayDisableAccountNumberInputField(EnabledConfig enabledConfig);

        public abstract Builder mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaBillsPayReceiptExpandableTransactionDetailsConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaBillsPaySkipWalletValidation(EnabledConfig enabledConfig);

        public abstract Builder mMayaBillsPayV3EndpointConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaCashInBankPullV3Config(EnabledConfig enabledConfig);

        public abstract Builder mMayaComplianceConfig(MayaComplianceConfig mayaComplianceConfig);

        public abstract Builder mMayaEKycV6Config(MayaEKycV6Config mayaEKycV6Config);

        public abstract Builder mMayaEnabledConfig(MayaEnabledConfig mayaEnabledConfig);

        public abstract Builder mMayaForgotPasswordConfig(MayaForgotPasswordConfig mayaForgotPasswordConfig);

        public abstract Builder mMayaInstaFillWalletSettingsConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaInstallmentCashLoanInitialEligibilityConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaInstallmentCashLoansConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaLoansDeviceScoringConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaLoansSimplifiedCheckoutConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaLoansV3Config(EnabledConfig enabledConfig);

        public abstract Builder mMayaMfaConfig(MayaMfaConfig mayaMfaConfig);

        public abstract Builder mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaPayBillsPayWithMayaCreditFragmentConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaPayBillsPayWithMayaCreditNewTagConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaPayBillsPayWithMayaCreditSoonConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaPayBillsViewInitialReceiptConfirmationScreenConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaRegistrationConfig(MayaRegistrationConfig mayaRegistrationConfig);

        public abstract Builder mMayaRegistrationSubmitInviteCode(EnabledConfig enabledConfig);

        public abstract Builder mMayaRegistrationV2Config(MayaRegistrationV2Config mayaRegistrationV2Config);

        public abstract Builder mMayaServicesCategoryV2(ServicesFeatureCoreAndCategories servicesFeatureCoreAndCategories);

        public abstract Builder mMayaServicesMasterList(List<SecondaryFeature> list);

        public abstract Builder mMayaShopProviderSubcategoriesConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaTransactionLimitWalletSettingsConfig(EnabledConfig enabledConfig);

        public abstract Builder mMayaUseBillsPayClientAPICheckoutFlowV3Config(EnabledConfig enabledConfig);

        public abstract Builder mMayaUseBillsPayInitialReceiptEntrypointConfig(EnabledConfig enabledConfig);

        public abstract Builder mMerchantV3EndpointConfig(EnabledConfig enabledConfig);

        public abstract Builder mMgmRedesignConfig(EnabledConfig enabledConfig);

        public abstract Builder mMissionsV2Config(EnabledConfig enabledConfig);

        public abstract Builder mMissionsV2EnterCodeConfig(EnabledConfig enabledConfig);

        public abstract Builder mProfileBadgesConfig(ProfileBadgesConfig profileBadgesConfig);

        public abstract Builder mPullFundsConfig(PullFundsConfig pullFundsConfig);

        public abstract Builder mQRScreensUpdateConfig(EnabledConfig enabledConfig);

        public abstract Builder mQrphEnhancementsConfig(EnabledConfig enabledConfig);

        public abstract Builder mReKyc10MinutesTestConfig(EnabledConfig enabledConfig);

        public abstract Builder mReKycEnhancementConfig(EnabledConfig enabledConfig);

        public abstract Builder mReKycFlowConfig(EnabledConfig enabledConfig);

        public abstract Builder mRealTimeImageQualityFeedbackConfig(EnabledConfig enabledConfig);

        public abstract Builder mReferralMechanicsConfig(ReferralMechanicsConfig referralMechanicsConfig);

        public abstract Builder mRegistrationRestrictionsConfig(EnabledConfig enabledConfig);

        public abstract Builder mRequestMoneyTileUpdateConfig(EnabledConfig enabledConfig);

        public abstract Builder mRequestMoneyV2Config(EnabledConfig enabledConfig);

        public abstract Builder mResendCodeCountdown(int i);

        public abstract Builder mRewardsConfig(EnabledConfig enabledConfig);

        public abstract Builder mShopConfig(ShopConfig shopConfig);

        public abstract Builder mShopPurchaseDigitalORConfig(EnabledConfig enabledConfig);

        public abstract Builder mShowDnfbpFromProfileConfig(EnabledConfig enabledConfig);

        public abstract Builder mShowIdQualityScoreConfig(EnabledConfig enabledConfig);

        public abstract Builder mShowIdScoreConfig(EnabledConfig enabledConfig);

        public abstract Builder mShowOtherIDsZolozFlowConfig(EnabledConfig enabledConfig);

        public abstract Builder mSplitMaxTimeoutDuration(Integer num);

        public abstract Builder mTopUpServiceConfig(EnabledConfig enabledConfig);

        public abstract Builder mUnifiedLendingExperienceReskinConfig(EnabledConfig enabledConfig);

        public abstract Builder mUserProfileConfig(UserProfileConfig userProfileConfig);

        public abstract Builder mVoucherCalendarReminderConfig(EnabledConfig enabledConfig);
    }

    public static e getInstance(Config config) {
        return new Remote_Config(config);
    }

    public static Builder sBuilder() {
        Builder builderMMaintenanceConfig = new C$AutoValue_Config.Builder().mMaintenanceConfig(MaintenanceConfig.sBuilder().build());
        Boolean bool = Boolean.FALSE;
        return builderMMaintenanceConfig.mAppMaintenance(bool).mAppMaintenanceBypass(bool).mMayaServicesMasterList(new ArrayList()).mMayaServicesCategoryV2(new ServicesFeatureCoreAndCategories()).mReferralMechanicsConfig(ReferralMechanicsConfig.sBuilder().build()).mShopConfig(ShopConfig.sBuilder().build()).mBillsPayAccountNumberConfig(BillsPayAccountNumberConfig.sBuilder().build()).mResendCodeCountdown(30000).mKycVersion(KYC_VERSION).mBankTransferConfig(EnabledConfig.sBuilder().build()).mInstaPayQRConfig(EnabledConfig.sBuilder().build()).mRewardsConfig(EnabledConfig.sBuilder().build()).mPullFundsConfig(PullFundsConfig.sBuilder().build()).mMFAConfig(MFAConfig.sBuilder().build()).mTopUpServiceConfig(EnabledConfig.sBuilder().build()).mVoucherCalendarReminderConfig(EnabledConfig.sBuilder().build()).mShopPurchaseDigitalORConfig(EnabledConfig.sBuilder().build()).mChangeMinConfig(EnabledConfig.sBuilder().build()).mMissionsV2Config(EnabledConfig.sBuilder().mIsEnabled(true).build()).mKountConfig(EnabledConfig.sBuilder().build()).mEDDConfig(EnabledConfig.sBuilder().build()).mIDClassificationConfig(EnabledConfig.sBuilder().build()).mMandatoryIDClassificationConfig(EnabledConfig.sBuilder().build()).mMissionsV2EnterCodeConfig(EnabledConfig.sBuilder().build()).mMerchantV3EndpointConfig(EnabledConfig.sBuilder().build()).mRequestMoneyV2Config(EnabledConfig.sBuilder().build()).mProfileBadgesConfig(ProfileBadgesConfig.sBuilder().build()).mBillerPlaceHolderConfig(EnabledConfig.sBuilder().build()).mCashInLimitSpielConfig(EnabledConfig.sBuilder().build()).mQrphEnhancementsConfig(EnabledConfig.sBuilder().build()).mMayaBillerReminderConfig(EnabledConfig.sBuilder().build()).mReKycEnhancementConfig(EnabledConfig.sBuilder().build()).mRealTimeImageQualityFeedbackConfig(EnabledConfig.sBuilder().build()).mShowOtherIDsZolozFlowConfig(EnabledConfig.sBuilder().build()).mReKycFlowConfig(EnabledConfig.sBuilder().build()).mReKyc10MinutesTestConfig(EnabledConfig.sBuilder().build()).mShowIdScoreConfig(EnabledConfig.sBuilder().build()).mShowIdQualityScoreConfig(EnabledConfig.sBuilder().build()).mKycPersonalInfoV2Config(EnabledConfig.sBuilder().build()).mKycCMSv8Config(EnabledConfig.sBuilder().build()).mShowDnfbpFromProfileConfig(EnabledConfig.sBuilder().build()).mKycCompletedCallbackConfig(EnabledConfig.sBuilder().build()).mRegistrationRestrictionsConfig(EnabledConfig.sBuilder().build()).mEddRestrictionsConfig(EnabledConfig.sBuilder().build()).mCustomerRestrictionsConfig(EnabledConfig.sBuilder().build()).mUserProfileConfig(UserProfileConfig.sBuilder().build()).mMayaLoansDeviceScoringConfig(EnabledConfig.sBuilder().build()).mMayaLoansSimplifiedCheckoutConfig(EnabledConfig.sBuilder().build()).mMayaLoansV3Config(EnabledConfig.sBuilder().build()).mMayaInstallmentCashLoansConfig(EnabledConfig.sBuilder().build()).mUnifiedLendingExperienceReskinConfig(EnabledConfig.sBuilder().build()).mMayaInstallmentCashLoanInitialEligibilityConfig(EnabledConfig.sBuilder().build()).mMayaEnabledConfig(MayaEnabledConfig.sBuilder().build()).mMayaRegistrationSubmitInviteCode(EnabledConfig.sBuilder().build()).mFundsConfig(EnabledConfig.sBuilder().build()).mFundsCreatorStoreConfig(EnabledConfig.sBuilder().build()).mMayaBillsPayV3EndpointConfig(EnabledConfig.sBuilder().build()).mMayaTransactionLimitWalletSettingsConfig(EnabledConfig.sBuilder().build()).mMayaInstaFillWalletSettingsConfig(EnabledConfig.sBuilder().build()).mMayaPayBillsPayWithMayaCreditFragmentConfig(EnabledConfig.sBuilder().build()).mMayaPayBillsPayWithMayaCreditNewTagConfig(EnabledConfig.sBuilder().build()).mMayaPayBillsPayWithMayaCreditSoonConfig(EnabledConfig.sBuilder().build()).mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig(EnabledConfig.sBuilder().build()).mMayaUseBillsPayClientAPICheckoutFlowV3Config(EnabledConfig.sBuilder().build()).mMayaPayBillsViewInitialReceiptConfirmationScreenConfig(EnabledConfig.sBuilder().build()).mMayaUseBillsPayInitialReceiptEntrypointConfig(EnabledConfig.sBuilder().build()).mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig(EnabledConfig.sBuilder().build()).mMayaBillsPayDisableAccountNumberInputField(EnabledConfig.sBuilder().build()).mBillsPayHandleBillableWithOtherFields(EnabledConfig.sBuilder().build()).mMayaBillsPaySkipWalletValidation(EnabledConfig.sBuilder().build()).mMayaBillsPayReceiptExpandableTransactionDetailsConfig(EnabledConfig.sBuilder().build()).mQRScreensUpdateConfig(EnabledConfig.sBuilder().build()).mInboxV4Config(EnabledConfig.sBuilder().build()).mMayaCashInBankPullV3Config(EnabledConfig.sBuilder().build()).mBNPLDeepFreezeConfig(EnabledConfig.sBuilder().build()).mDashboardSettingsConfig(DashboardSettingsConfig.sBuilder().build()).mBankPullSettingsV2Config(EnabledConfig.sBuilder().build()).mMayaShopProviderSubcategoriesConfig(EnabledConfig.sBuilder().build()).mMayaEKycV6Config(MayaEKycV6Config.sBuilder().build()).mMayaComplianceConfig(MayaComplianceConfig.sBuilder().build()).mInboxV4ManageNotifsConfig(EnabledConfig.sBuilder().build()).mConsumerOnboardingSetPasswordConfig(EnabledConfig.sBuilder().build()).mCameraXConfig(EnabledConfig.sBuilder().build()).mLandersCreditCardCashbackTileConfig(EnabledConfig.sBuilder().build()).mLoyaltyForceUpdateConfig(EnabledConfig.sBuilder().build()).mInAppReviewConfig(InAppReviewConfig.sBuilder().build()).mInboxV4MayaSupportConfig(EnabledConfig.sBuilder().build()).mLoadV2Config(EnabledConfig.sBuilder().build()).mRequestMoneyTileUpdateConfig(EnabledConfig.sBuilder().build()).mMayaRegistrationConfig(MayaRegistrationConfig.sBuilder().build()).mMayaRegistrationV2Config(MayaRegistrationV2Config.sBuilder().build()).mICLDblConfig(EnabledConfig.sBuilder().build()).mGamesConfigurableIntroConfig(EnabledConfig.sBuilder().build()).mMayaMfaConfig(MayaMfaConfig.sBuilder().build()).mMayaForgotPasswordConfig(MayaForgotPasswordConfig.sBuilder().build()).mLoadConfig(LoadConfig.sBuilder().build()).mEcommAppEventV2Config(ECommAppEventV2Config.sBuilder().build()).mAppEventsV2(AppEventsV2.sBuilder().build()).mManageDevicesConfig(EnabledConfig.sBuilder().build()).mCardDetailsProtectionConfig(EnabledConfig.sBuilder().build()).mGamesInterstitialConfig(new GamesInterstitialConfig()).mMgmRedesignConfig(EnabledConfig.sBuilder().build()).mFreelancerHubConfig(FreelancerHubConfig.sBuilder().build()).mSplitMaxTimeoutDuration(10);
    }

    public static y typeAdapter(j jVar) {
        return new AutoValue_Config.GsonTypeAdapter(jVar);
    }

    public BigDecimal bankTransferFee() {
        BigDecimal bigDecimalMBankTransferFee = mBankTransferFee();
        return bigDecimalMBankTransferFee != null ? bigDecimalMBankTransferFee : BigDecimal.ZERO;
    }

    public Map<String, Boolean> getCardsFlutterToggles() {
        HashMap map = new HashMap();
        map.put("card_details_protection", Boolean.valueOf(isCardDetailsProtectionConfigEnabled()));
        map.put("landers_credit_card_cashback_tile", Boolean.valueOf(isLandersCreditCardCashbackTileEnabled()));
        map.put("loyalty_force_update", Boolean.valueOf(isLoyaltyForceUpdateEnabled()));
        return map;
    }

    public List<DashboardSettingsTab> getDashboardSettingsTabs() {
        return mDashboardSettingsConfig().mTabs();
    }

    public List<String> getDashboardSettingsWalletTiles() {
        return mDashboardSettingsConfig().mWalletTiles();
    }

    public Map<String, Boolean> getFlutterAvailability() {
        HashMap map = new HashMap();
        map.put("load", Boolean.valueOf(isLoadAvailable()));
        map.put("cards", Boolean.valueOf(isCardsAvailable()));
        map.put("add_money_via_card_service", Boolean.valueOf(isAddMoneyViaCardServiceAvailable()));
        map.put("bank_pull_service", Boolean.valueOf(isCashInViaBankServiceAvailable()));
        return map;
    }

    public Map<String, Boolean> getFlutterToggles() {
        HashMap map = new HashMap();
        map.put("device_scoring", Boolean.valueOf(isMayaLoansDeviceScoringEnabled()));
        map.put("simplified_checkout", Boolean.valueOf(isMayaLoansSimplifiedCheckoutEnabled()));
        map.put("loans_v3_enabled", Boolean.valueOf(isMayaLoansV3Enabled()));
        map.put("icl_enabled", Boolean.valueOf(isMayaLoansInstallmentCashLoanEnabled()));
        map.put("unified_lending_experience_reskin", Boolean.valueOf(isUnifiedLendingExperienceReskingEnabled()));
        map.put("initial_eligibility_check", Boolean.valueOf(isMayaInstallmentCashLoanInitialEligibilityEnabled()));
        map.put("bnpl_deep_freeze", Boolean.valueOf(isBNPLDeepFreezeEnabled()));
        map.put("icl_dbl", Boolean.valueOf(isICLDblEnabled()));
        return map;
    }

    public Map<String, Boolean> getInboxFlutterToggles() {
        HashMap map = new HashMap();
        map.put("manage_notifs_toggle", Boolean.valueOf(isInboxV4ManageNotifsEnabled()));
        map.put("maya_support_toggle", Boolean.valueOf(isInboxV4MayaSupportEnabled()));
        return map;
    }

    public Map<String, Boolean> getLoadFlutterToggles() {
        HashMap map = new HashMap();
        map.put("load_favorites", Boolean.valueOf(isLoadFavoritesEnabled()));
        map.put("load_recommender", Boolean.valueOf(isLoadRecommenderEnabled()));
        return map;
    }

    public int getMayaServicesBanner() {
        return mMayaServicesCategoryV2().getBanner();
    }

    public List<ServicesFeatureCategoryV2> getMayaServicesCategoryV2() {
        return mMayaServicesCategoryV2().getCategories();
    }

    public List<String> getMayaServicesCoreItems() {
        return mMayaServicesCategoryV2().getCoreItems();
    }

    public List<SecondaryFeature> getMayaServicesMasterList() {
        return mMayaServicesMasterList();
    }

    public boolean isAccountLimitsAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mAccountLimitsAvailability().isAvailable();
    }

    public boolean isAddMoneyViaCardServiceAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mAddMoneyViaCardService().isAvailable();
    }

    public boolean isAppEventV2BankTransferEnabled() {
        return (mAppEventsV2() == null || mAppEventsV2().mBankTransferEnabled() == null || !mAppEventsV2().mBankTransferEnabled().mIsEnabled()) ? false : true;
    }

    public boolean isAppEventV2SendMoneyEnabled() {
        return (mAppEventsV2() == null || mAppEventsV2().mSendMoneyEnabled() == null || !mAppEventsV2().mSendMoneyEnabled().mIsEnabled()) ? false : true;
    }

    public boolean isAppEventsV2CashInEnabled() {
        return (mAppEventsV2() == null || mAppEventsV2().mCashInEnabled() == null || !mAppEventsV2().mCashInEnabled().mIsEnabled()) ? false : true;
    }

    public boolean isAppMaintenance() {
        return (mMaintenanceConfig().isMaintenance() || isAppMaintenanceEnabled()) && !isAppMaintenanceEnabledBypass();
    }

    public boolean isAppMaintenanceEnabled() {
        return mAppMaintenance() != null && mAppMaintenance().booleanValue();
    }

    public boolean isAppMaintenanceEnabledBypass() {
        return mAppMaintenanceBypass() != null && mAppMaintenanceBypass().booleanValue();
    }

    public boolean isAuthorizeRequestsEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mAuthorizeRequest().booleanValue();
    }

    public boolean isAutoCashinWalletSettingsEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mCashinWalletSettingsAutoCashInOption().booleanValue();
    }

    public boolean isBNPLDeepFreezeEnabled() {
        return mBNPLDeepFreezeConfig() != null && mBNPLDeepFreezeConfig().mIsEnabled();
    }

    public boolean isBankPullSettingsV2Enabled() {
        return mBankPullSettingsV2Config() != null && mBankPullSettingsV2Config().mIsEnabled();
    }

    public boolean isBankTransferAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mBankTransferAvailability().isAvailable();
    }

    public boolean isBankTransferEnabled() {
        return mBankTransferConfig().mIsEnabled();
    }

    public boolean isBillerPlaceHolderEnabled() {
        return mBillerPlaceHolderConfig() != null && mBillerPlaceHolderConfig().mIsEnabled();
    }

    public boolean isBillersItemsListAcceptsMayaCreditSubtextEnabled() {
        return mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig() != null && mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig().mIsEnabled();
    }

    public boolean isBillsPayAccountNumberFieldDisabled() {
        return mMayaBillsPayDisableAccountNumberInputField() != null && mMayaBillsPayDisableAccountNumberInputField().mIsEnabled();
    }

    public boolean isBillsPayClientAPICheckoutFlowV3Enabled() {
        return mMayaUseBillsPayClientAPICheckoutFlowV3Config() != null && mMayaUseBillsPayClientAPICheckoutFlowV3Config().mIsEnabled();
    }

    public boolean isBillsPayEventsV2Enabled() {
        return (mEcommAppEventV2Config() == null || mEcommAppEventV2Config().mBillsPay() == null || !mEcommAppEventV2Config().mBillsPay().booleanValue()) ? false : true;
    }

    public boolean isBillsPayHandleBillableWithOtherFields() {
        return mBillsPayHandleBillableWithOtherFields() != null && mBillsPayHandleBillableWithOtherFields().mIsEnabled();
    }

    public boolean isBillsPayHandleDeepLinkWithOtherFieldsConfig() {
        return mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig() != null && mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig().mIsEnabled();
    }

    public boolean isBillsPayInitialReceiptEntrypointEnabled() {
        return mMayaUseBillsPayInitialReceiptEntrypointConfig() != null && mMayaUseBillsPayInitialReceiptEntrypointConfig().mIsEnabled();
    }

    public boolean isBillsPayReceiptExpandableTransactionDetailsEnabled() {
        return mMayaBillsPayReceiptExpandableTransactionDetailsConfig() != null && mMayaBillsPayReceiptExpandableTransactionDetailsConfig().mIsEnabled();
    }

    public boolean isBillsPayWalletBalanceValidationSkipped() {
        return mMayaBillsPaySkipWalletValidation() != null && mMayaBillsPaySkipWalletValidation().mIsEnabled();
    }

    public boolean isCameraXEnabled() {
        return mCameraXConfig() != null && mCameraXConfig().mIsEnabled();
    }

    public boolean isCardDetailsProtectionConfigEnabled() {
        return mCardDetailsProtectionConfig() != null && mCardDetailsProtectionConfig().mIsEnabled();
    }

    public boolean isCardsAvailable() {
        AvailabilityConfig availabilityConfigMCardsAvailability = mMaintenanceConfig().mServiceAvailabilityConfig().mCardsAvailability();
        return availabilityConfigMCardsAvailability != null && availabilityConfigMCardsAvailability.isAvailable();
    }

    public boolean isCashInLimitSpielEnabled() {
        return mCashInLimitSpielConfig() != null && mCashInLimitSpielConfig().mIsEnabled();
    }

    public boolean isCashInViaBankServiceAvailable() {
        AvailabilityConfig availabilityConfigMCashInViaBankServiceAvailability = mMaintenanceConfig().mServiceAvailabilityConfig().mCashInViaBankServiceAvailability();
        return availabilityConfigMCashInViaBankServiceAvailability != null && availabilityConfigMCashInViaBankServiceAvailability.isAvailable();
    }

    public boolean isCashinWalletSettingsEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mCashinWalletSettings().booleanValue();
    }

    public boolean isChangeMinEnabled() {
        return mChangeMinConfig() != null && mChangeMinConfig().mIsEnabled();
    }

    public boolean isConsentCheckAllEnabled() {
        return (mMayaRegistrationConfig() == null || mMayaRegistrationConfig().mConsentCheckAll() == null || !mMayaRegistrationConfig().mConsentCheckAll().booleanValue()) ? false : true;
    }

    public boolean isConsumerOnboardingSetPasswordEnabled() {
        return mConsumerOnboardingSetPasswordConfig() != null && mConsumerOnboardingSetPasswordConfig().mIsEnabled();
    }

    public boolean isCryptoAvailable() {
        AvailabilityConfig availabilityConfigMCryptoAvailability = mMaintenanceConfig().mServiceAvailabilityConfig().mCryptoAvailability();
        return availabilityConfigMCryptoAvailability != null && availabilityConfigMCryptoAvailability.isAvailable();
    }

    public boolean isCryptoV2Available() {
        AvailabilityConfig availabilityConfigMCryptoV2Availability = mMaintenanceConfig().mServiceAvailabilityConfig().mCryptoV2Availability();
        return availabilityConfigMCryptoV2Availability != null && availabilityConfigMCryptoV2Availability.isAvailable();
    }

    public boolean isCustomerRestrictionsEnabled() {
        return mCustomerRestrictionsConfig() != null && mCustomerRestrictionsConfig().mIsEnabled();
    }

    public boolean isDosriEnabled() {
        return (mMayaComplianceConfig() == null || mMayaComplianceConfig().mDosri() == null || !mMayaComplianceConfig().mDosri().booleanValue()) ? false : true;
    }

    public boolean isEDDEnabled() {
        return mEDDConfig() != null && mEDDConfig().mIsEnabled();
    }

    public boolean isEddRestrictionsEnabled() {
        return mEddRestrictionsConfig() != null && mEddRestrictionsConfig().mIsEnabled();
    }

    public boolean isFaceAuthFormToggleEnabled() {
        return (mMayaMfaConfig() == null || mMayaMfaConfig().mFaceAuthFormAndroid() == null || !mMayaMfaConfig().mFaceAuthFormAndroid().booleanValue()) ? false : true;
    }

    public boolean isFatcaEnabled() {
        return (mMayaComplianceConfig() == null || mMayaComplianceConfig().mFatca() == null || !mMayaComplianceConfig().mFatca().booleanValue()) ? false : true;
    }

    public boolean isFavoritesServiceAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mFavoritesAvailability().isAvailable();
    }

    public boolean isForgotPasswordV2Enabled() {
        return (mMayaForgotPasswordConfig() == null || mMayaForgotPasswordConfig().mFrameworkV2Android() == null || !mMayaForgotPasswordConfig().mFrameworkV2Android().booleanValue()) ? false : true;
    }

    public boolean isFreelancerHubEnabled() {
        return (mFreelancerHubConfig() == null || mFreelancerHubConfig().mEnabled() == null || !mFreelancerHubConfig().mEnabled().booleanValue()) ? false : true;
    }

    public boolean isFundsAvailable() {
        AvailabilityConfig availabilityConfigMFundsAvailability = mMaintenanceConfig().mServiceAvailabilityConfig().mFundsAvailability();
        return availabilityConfigMFundsAvailability != null && availabilityConfigMFundsAvailability.isAvailable();
    }

    public boolean isFundsCreatorStoreEnabled() {
        return mFundsCreatorStoreConfig() != null && mFundsCreatorStoreConfig().mIsEnabled();
    }

    public boolean isFundsEnabled() {
        return mFundsConfig() != null && mFundsConfig().mIsEnabled();
    }

    public boolean isGamesConfigurableIntroEnabled() {
        return mGamesConfigurableIntroConfig() != null && mGamesConfigurableIntroConfig().mIsEnabled();
    }

    public boolean isICLDblEnabled() {
        return mICLDblConfig() != null && mICLDblConfig().mIsEnabled();
    }

    public boolean isIDClassificationEnabled() {
        return mIDClassificationConfig() != null && mIDClassificationConfig().mIsEnabled();
    }

    public boolean isInAppReviewBillsPayEnabled() {
        return isInAppReviewEnabled() && mInAppReviewConfig().mBillsPay().booleanValue();
    }

    public boolean isInAppReviewEnabled() {
        return mInAppReviewConfig() != null && mInAppReviewConfig().mDefault().booleanValue();
    }

    public boolean isInAppReviewPurchaseHistoryEnabled() {
        return isInAppReviewEnabled() && mInAppReviewConfig().mPurchaseHistory().booleanValue();
    }

    public boolean isInAppReviewQrPaymentEnabled() {
        return isInAppReviewEnabled() && mInAppReviewConfig().mQrPayment().booleanValue();
    }

    public boolean isInAppReviewSendMoneyEnabled() {
        return isInAppReviewEnabled() && mInAppReviewConfig().mSendMoney().booleanValue();
    }

    public boolean isInAppReviewShopPurchaseEnabled() {
        return isInAppReviewEnabled() && mInAppReviewConfig().mShopPurchase().booleanValue();
    }

    public boolean isInboxAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mInboxAvailability().isAvailable();
    }

    public boolean isInboxV4Enabled() {
        return mInboxV4Config() != null && mInboxV4Config().mIsEnabled();
    }

    public boolean isInboxV4ManageNotifsEnabled() {
        return mInboxV4ManageNotifsConfig() != null && mInboxV4ManageNotifsConfig().mIsEnabled();
    }

    public boolean isInboxV4MayaSupportEnabled() {
        return mInboxV4MayaSupportConfig() != null && mInboxV4MayaSupportConfig().mIsEnabled();
    }

    public boolean isInstaFillWalletSettingsEnabled() {
        return mMayaInstaFillWalletSettingsConfig() != null && mMayaInstaFillWalletSettingsConfig().mIsEnabled();
    }

    public boolean isInstaPayQREnabled() {
        return mInstaPayQRConfig().mIsEnabled();
    }

    public boolean isInstapayMFAEnabled() {
        return mMFAConfig() != null && mMFAConfig().mInstapayEnabledConfig().mIsEnabled();
    }

    public boolean isKountEnabled() {
        return mKountConfig() != null && mKountConfig().mIsEnabled();
    }

    public boolean isKycCMSv8MockEnabled() {
        return mKycCMSv8Config() != null && mKycCMSv8Config().mIsEnabled();
    }

    public boolean isKycCmsV7InjectTofuFieldsEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mKycCmsV7InjectTofuFields() == null || !mMayaEKycV6Config().mKycCmsV7InjectTofuFields().booleanValue()) ? false : true;
    }

    public boolean isKycCompletedCallbackEnabled() {
        return mKycCompletedCallbackConfig() != null && mKycCompletedCallbackConfig().mIsEnabled();
    }

    public boolean isKycForcePhNationalIdEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mKycForcePhNationalId() == null || !mMayaEKycV6Config().mKycForcePhNationalId().booleanValue()) ? false : true;
    }

    public boolean isKycIdImageQualityEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mKycImageQuality() == null || !mMayaEKycV6Config().mKycImageQuality().booleanValue()) ? false : true;
    }

    public boolean isKycMaintenanceEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mKycMaintenance() == null || !mMayaEKycV6Config().mKycMaintenance().booleanValue()) ? false : true;
    }

    public boolean isKycPersonalInfoV2Enabled() {
        return mKycPersonalInfoV2Config() != null && mKycPersonalInfoV2Config().mIsEnabled();
    }

    public boolean isKycUxTofuRedesignEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mKycUxTofuRedesign() == null || !mMayaEKycV6Config().mKycUxTofuRedesign().booleanValue()) ? false : true;
    }

    public boolean isLandersCreditCardCashbackTileEnabled() {
        return mLandersCreditCardCashbackTileConfig() != null && mLandersCreditCardCashbackTileConfig().mIsEnabled();
    }

    public boolean isLoadAvailable() {
        AvailabilityConfig availabilityConfigMLoadAvailability = mMaintenanceConfig().mServiceAvailabilityConfig().mLoadAvailability();
        return availabilityConfigMLoadAvailability != null && availabilityConfigMLoadAvailability.isAvailable();
    }

    public boolean isLoadFavoritesEnabled() {
        return mLoadConfig() != null && mLoadConfig().mFavorites().booleanValue();
    }

    public boolean isLoadRecommenderEnabled() {
        return mLoadConfig() != null && mLoadConfig().mRecommender().booleanValue();
    }

    public boolean isLoadV2Enabled() {
        return mLoadV2Config() != null && mLoadV2Config().mIsEnabled();
    }

    public boolean isLoanServiceAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mLoanAvailability().isAvailable();
    }

    public boolean isLoansEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mLoans().booleanValue();
    }

    public boolean isLoyaltyForceUpdateEnabled() {
        return mLoyaltyForceUpdateConfig() != null && mLoyaltyForceUpdateConfig().mIsEnabled();
    }

    public boolean isManageDevicesEnabled() {
        return mManageDevicesConfig() != null && mManageDevicesConfig().mIsEnabled();
    }

    public boolean isMandatoryIDClassificationEnabled() {
        return mMandatoryIDClassificationConfig() != null && mMandatoryIDClassificationConfig().mIsEnabled();
    }

    public boolean isMayaBillerReminderEnabled() {
        return mMayaBillerReminderConfig() != null && mMayaBillerReminderConfig().mIsEnabled();
    }

    public boolean isMayaBillsPayV3EndpointConfigEnabled() {
        return mMayaBillsPayV3EndpointConfig() != null && mMayaBillsPayV3EndpointConfig().mIsEnabled();
    }

    public boolean isMayaCashInV3BankPullEnabled() {
        return mMayaCashInBankPullV3Config() != null && mMayaCashInBankPullV3Config().mIsEnabled();
    }

    public boolean isMayaCreditAvailable() {
        AvailabilityConfig availabilityConfigMMayaCreditAvailability = mMaintenanceConfig().mServiceAvailabilityConfig().mMayaCreditAvailability();
        return availabilityConfigMMayaCreditAvailability != null && availabilityConfigMMayaCreditAvailability.isAvailable();
    }

    public boolean isMayaCreditsEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mCredit().booleanValue();
    }

    public boolean isMayaInstallmentCashLoanInitialEligibilityEnabled() {
        return mMayaInstallmentCashLoanInitialEligibilityConfig() != null && mMayaInstallmentCashLoanInitialEligibilityConfig().mIsEnabled();
    }

    public boolean isMayaLoansDeviceScoringEnabled() {
        return mMayaLoansDeviceScoringConfig() != null && mMayaLoansDeviceScoringConfig().mIsEnabled();
    }

    public boolean isMayaLoansInstallmentCashLoanEnabled() {
        return mMayaInstallmentCashLoansConfig() != null && mMayaInstallmentCashLoansConfig().mIsEnabled();
    }

    public boolean isMayaLoansSimplifiedCheckoutEnabled() {
        return mMayaLoansSimplifiedCheckoutConfig() != null && mMayaLoansSimplifiedCheckoutConfig().mIsEnabled();
    }

    public boolean isMayaLoansV3Enabled() {
        return mMayaLoansV3Config() != null && mMayaLoansV3Config().mIsEnabled();
    }

    public boolean isMayaRegistrationSubmitInviteCode() {
        return mMayaRegistrationSubmitInviteCode() != null && mMayaRegistrationSubmitInviteCode().mIsEnabled();
    }

    public boolean isMayaSavingsEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mCashinMayaSavingsButton().booleanValue();
    }

    public boolean isMayaScanQREnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mQRScan().booleanValue();
    }

    public boolean isMayaShopProviderSubcategoriesEnabled() {
        return mMayaShopProviderSubcategoriesConfig() != null && mMayaShopProviderSubcategoriesConfig().mIsEnabled();
    }

    public boolean isMayaShopWithCheckoutFlowEnabled() {
        return isMayaV2ShopEnabled() && mMayaEnabledConfig() != null && mMayaEnabledConfig().mShopCheckout().booleanValue();
    }

    public boolean isMayaV2PayBillsEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mPayBills().booleanValue();
    }

    public boolean isMayaV2RequestMoneyEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mRequestMoney().booleanValue();
    }

    public boolean isMayaV2SetUsernameEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mUsername().booleanValue();
    }

    public boolean isMayaV2ShopEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mShop().booleanValue();
    }

    public boolean isMayaV2TransactionReceiptPayQrEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mQRReceipt().booleanValue();
    }

    public boolean isMayaV2TransactionReceiptShopEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mShopReceipt().booleanValue();
    }

    public boolean isMayaV2TransactionReceiptShopHistoryEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mShopHistoryReceipt().booleanValue();
    }

    public boolean isMayaV2TransactionReceiptVouchersEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mVouchersReceipt().booleanValue();
    }

    public boolean isMerchantPaymentAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().isAvailable();
    }

    public boolean isMerchantV3EndpointEnabled() {
        return mMerchantV3EndpointConfig() != null && mMerchantV3EndpointConfig().mIsEnabled();
    }

    public boolean isMfaFrameworkV1Enabled() {
        return (mMayaMfaConfig() == null || mMayaMfaConfig().mFrameworkV1Android() == null || !mMayaMfaConfig().mFrameworkV1Android().booleanValue()) ? false : true;
    }

    public boolean isMgmRedesignEnabled() {
        return mMgmRedesignConfig() != null && mMgmRedesignConfig().mIsEnabled();
    }

    public boolean isMissionsAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mMissionsAvailability().isAvailable();
    }

    public boolean isMissionsV2Enabled() {
        return mMissionsV2Config() != null && mMissionsV2Config().mIsEnabled();
    }

    public boolean isMissionsV2EnterCodeEnabled() {
        return mMissionsV2EnterCodeConfig() != null && mMissionsV2EnterCodeConfig().mIsEnabled();
    }

    public boolean isOnboardingAndKycFlowEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mOnboardingAndKycFlow() == null || !mMayaEKycV6Config().mOnboardingAndKycFlow().booleanValue()) ? false : true;
    }

    public boolean isOnboardingAndKycFlowV2Enabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mOnboardingAndKycFlowV2() == null || !mMayaEKycV6Config().mOnboardingAndKycFlowV2().booleanValue()) ? false : true;
    }

    public boolean isPartnerOnboardingEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mPartnerOnboarding() == null || !mMayaEKycV6Config().mPartnerOnboarding().booleanValue()) ? false : true;
    }

    public boolean isPayBillsAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mPayBillsAvailability().isAvailable();
    }

    public boolean isPayWithMayaCreditFragmentEnabled() {
        return mMayaPayBillsPayWithMayaCreditFragmentConfig() != null && mMayaPayBillsPayWithMayaCreditFragmentConfig().mIsEnabled();
    }

    public boolean isPayWithMayaCreditNewTagEnabled() {
        return mMayaPayBillsPayWithMayaCreditNewTagConfig() != null && mMayaPayBillsPayWithMayaCreditNewTagConfig().mIsEnabled();
    }

    public boolean isPayWithMayaCreditSoonEnabled() {
        return mMayaPayBillsPayWithMayaCreditSoonConfig() != null && mMayaPayBillsPayWithMayaCreditSoonConfig().mIsEnabled();
    }

    public boolean isQREventsV2Enabled() {
        return (mEcommAppEventV2Config() == null || mEcommAppEventV2Config().mQR() == null || !mEcommAppEventV2Config().mQR().booleanValue()) ? false : true;
    }

    public boolean isQRPHAdjustmentsEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mQrP2pAdjustments().booleanValue();
    }

    public boolean isQRScreensUpdateEnabled() {
        return mQRScreensUpdateConfig() != null && mQRScreensUpdateConfig().mIsEnabled();
    }

    public boolean isQrWithCheckoutFlowEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mCheckoutOnQR().booleanValue();
    }

    public boolean isQrphEnhancementsEnabled() {
        return mQrphEnhancementsConfig() != null && mQrphEnhancementsConfig().mIsEnabled();
    }

    public boolean isReKycEnhancementEnabled() {
        return mReKycEnhancementConfig() != null && mReKycEnhancementConfig().mIsEnabled();
    }

    public boolean isRealTimeImageQualityFeedbackEnabled() {
        return mRealTimeImageQualityFeedbackConfig() != null && mRealTimeImageQualityFeedbackConfig().mIsEnabled();
    }

    public boolean isRegistrationMiddleNameEnabled() {
        return (mMayaRegistrationConfig() == null || mMayaRegistrationConfig().mRequireMiddleName() == null || !mMayaRegistrationConfig().mRequireMiddleName().booleanValue()) ? false : true;
    }

    public boolean isRegistrationRestrictionsEnabled() {
        return mRegistrationRestrictionsConfig() != null && mRegistrationRestrictionsConfig().mIsEnabled();
    }

    public boolean isRegistrationV2Enabled() {
        return (mMayaRegistrationV2Config() == null || mMayaRegistrationV2Config().mShortenedReg() == null || !mMayaRegistrationV2Config().mShortenedReg().booleanValue()) ? false : true;
    }

    public boolean isRekyc10MinutesTestEnabled() {
        return mReKyc10MinutesTestConfig() != null && mReKyc10MinutesTestConfig().mIsEnabled();
    }

    public boolean isRekycFlowEnabled() {
        return mReKycFlowConfig() != null && mReKycFlowConfig().mIsEnabled();
    }

    public boolean isRequestMoneyTileUpdateEnabled() {
        return mRequestMoneyTileUpdateConfig() != null && mRequestMoneyTileUpdateConfig().mIsEnabled();
    }

    public boolean isRequestMoneyV2Enabled() {
        return mRequestMoneyV2Config() != null && mRequestMoneyV2Config().mIsEnabled();
    }

    public boolean isRestrictedLoginEnabled() {
        return mMayaEnabledConfig() != null && mMayaEnabledConfig().mRestrictedLogin().booleanValue();
    }

    public boolean isRewardsEnabled() {
        return mRewardsConfig() != null && mRewardsConfig().mIsEnabled();
    }

    public boolean isSavingsAutoProvisioningEnabled() {
        return (mMayaRegistrationConfig() == null || mMayaRegistrationConfig().mAutoProvision() == null || !mMayaRegistrationConfig().mAutoProvision().booleanValue()) ? false : true;
    }

    public boolean isSendMoneyAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mSendMoneyAvailability().isAvailable();
    }

    public boolean isSendMoneyP2PConfigEnabled() {
        return mMFAConfig() != null && mMFAConfig().mSendMoneyEnabledConfig().mIsEnabled();
    }

    public boolean isShopAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mShopServiceAvailability().isAvailable();
    }

    public boolean isShopEventsV2Enabled() {
        return (mEcommAppEventV2Config() == null || mEcommAppEventV2Config().mShop() == null || !mEcommAppEventV2Config().mShop().booleanValue()) ? false : true;
    }

    public boolean isShopPurchaseDigitalOREnabled() {
        return mShopPurchaseDigitalORConfig() != null && mShopPurchaseDigitalORConfig().mIsEnabled();
    }

    public boolean isShopPurchaseHistoryAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mShopPurchaseHistoryAvailability().isAvailable();
    }

    public boolean isShortenedFlowAddressDropdownEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowAddressDropdown() == null || !mMayaEKycV6Config().mShortenedFlowAddressDropdown().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowBackIdCaptureEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowBackIdCapture() == null || !mMayaEKycV6Config().mShortenedFlowBackIdCapture().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowBlurDetectionEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowBlurDetection() == null || !mMayaEKycV6Config().mShortenedFlowBlurDetection().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowExpandedReKycEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowExpandedReKyc() == null || !mMayaEKycV6Config().mShortenedFlowExpandedReKyc().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowForeignAddressComplianceEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowForeignAddressCompliance() == null || !mMayaEKycV6Config().mShortenedFlowForeignAddressCompliance().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowIdCaptureV21080pEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowIdCaptureV21080p() == null || !mMayaEKycV6Config().mShortenedFlowIdCaptureV21080p().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowIdCaptureV2Enabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowIdCaptureV2() == null || !mMayaEKycV6Config().mShortenedFlowIdCaptureV2().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowIdCaptureV3Enabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowIdCaptureV3() == null || !mMayaEKycV6Config().mShortenedFlowIdCaptureV3().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowPhilsysEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowPhilsys() == null || !mMayaEKycV6Config().mShortenedFlowPhilsys().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowReKycEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowReKyc() == null || !mMayaEKycV6Config().mShortenedFlowReKyc().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowShowOtherIdEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowShowOtherId() == null || !mMayaEKycV6Config().mShortenedFlowShowOtherId().booleanValue()) ? false : true;
    }

    public boolean isShortenedFlowUpgradeEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowUpgrade() == null || !mMayaEKycV6Config().mShortenedFlowUpgrade().booleanValue()) ? false : true;
    }

    public boolean isShowDataPrivacyOnAppLaunch() {
        return (mMayaRegistrationV2Config() == null || mMayaRegistrationV2Config().mShowDataPrivacyOnAppLaunch() == null || !mMayaRegistrationV2Config().mShowDataPrivacyOnAppLaunch().booleanValue()) ? false : true;
    }

    public boolean isShowDnfbpFromProfileEnabled() {
        return mShowDnfbpFromProfileConfig() != null && mShowDnfbpFromProfileConfig().mIsEnabled();
    }

    public boolean isShowIdQualityScoreEnabled() {
        return mShowIdQualityScoreConfig() != null && mShowIdQualityScoreConfig().mIsEnabled();
    }

    public boolean isShowIdScoreEnabled() {
        return mShowIdScoreConfig() != null && mShowIdScoreConfig().mIsEnabled();
    }

    public boolean isShowOtherIDsZolozFlowConfig() {
        return mShowOtherIDsZolozFlowConfig() != null && mShowOtherIDsZolozFlowConfig().mIsEnabled();
    }

    public boolean isSupportSecondaryIdFlowEnabled() {
        return (mMayaEKycV6Config() == null || mMayaEKycV6Config().mShortenedFlowSecondaryIdCapture() == null || !mMayaEKycV6Config().mShortenedFlowSecondaryIdCapture().booleanValue()) ? false : true;
    }

    public boolean isTopUpServiceEnabled() {
        return mTopUpServiceConfig() != null && mTopUpServiceConfig().mIsEnabled();
    }

    public boolean isTransactionWalletLimitWalletSettingsEnabled() {
        return mMayaTransactionLimitWalletSettingsConfig() != null && mMayaTransactionLimitWalletSettingsConfig().mIsEnabled();
    }

    public boolean isTravelAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mTravelAvailability().isAvailable();
    }

    public boolean isUnifiedLendingExperienceReskingEnabled() {
        return mUnifiedLendingExperienceReskinConfig() != null && mUnifiedLendingExperienceReskinConfig().mIsEnabled();
    }

    public boolean isUserProfileUpdateEnabled() {
        return (mUserProfileConfig() == null || mUserProfileConfig().mIsUserProfileUpdateEnabled() == null || !mUserProfileConfig().mIsUserProfileUpdateEnabled().booleanValue()) ? false : true;
    }

    public boolean isViewInitialReceiptConfirmationScreenEnabled() {
        return mMayaPayBillsViewInitialReceiptConfirmationScreenConfig() != null && mMayaPayBillsViewInitialReceiptConfirmationScreenConfig().mIsEnabled();
    }

    public boolean isVoucherCalendarReminderEnabled() {
        return mVoucherCalendarReminderConfig() != null && mVoucherCalendarReminderConfig().mIsEnabled();
    }

    public boolean isVouchersServiceAvailable() {
        return mMaintenanceConfig().mServiceAvailabilityConfig().mVouchersAvailability().isAvailable();
    }

    @Nullable
    @InterfaceC1498b("app_events_v2")
    public abstract AppEventsV2 mAppEventsV2();

    @Nullable
    @InterfaceC1498b("app_maintenance")
    public abstract Boolean mAppMaintenance();

    @Nullable
    public abstract Boolean mAppMaintenanceBypass();

    @Nullable
    @InterfaceC1498b("bnpl_deep_freeze")
    public abstract EnabledConfig mBNPLDeepFreezeConfig();

    @Nullable
    @InterfaceC1498b("bank_pull_settings_v2")
    public abstract EnabledConfig mBankPullSettingsV2Config();

    @InterfaceC1498b("bank_transfer")
    public abstract EnabledConfig mBankTransferConfig();

    @Nullable
    @InterfaceC1498b("bank_transfer_fee")
    public abstract BigDecimal mBankTransferFee();

    @Nullable
    @InterfaceC1498b("biller_placeholder")
    public abstract EnabledConfig mBillerPlaceHolderConfig();

    @InterfaceC1498b("pay_bills")
    public abstract BillsPayAccountNumberConfig mBillsPayAccountNumberConfig();

    @Nullable
    @InterfaceC1498b("bills_pay_handle_billable_with_other_fields")
    public abstract EnabledConfig mBillsPayHandleBillableWithOtherFields();

    @Nullable
    @InterfaceC1498b("cameraX")
    public abstract EnabledConfig mCameraXConfig();

    @Nullable
    @InterfaceC1498b("card_details_protection")
    public abstract EnabledConfig mCardDetailsProtectionConfig();

    @Nullable
    @InterfaceC1498b("cash_in_with_account_limit")
    public abstract EnabledConfig mCashInLimitSpielConfig();

    @InterfaceC1498b("change_min")
    public abstract EnabledConfig mChangeMinConfig();

    @Nullable
    @InterfaceC1498b("consumer_onboarding_setpassword_non_production_only")
    public abstract EnabledConfig mConsumerOnboardingSetPasswordConfig();

    @Nullable
    @InterfaceC1498b("customer_restrictions")
    public abstract EnabledConfig mCustomerRestrictionsConfig();

    @InterfaceC1498b("dashboard_settings")
    public abstract DashboardSettingsConfig mDashboardSettingsConfig();

    @InterfaceC1498b("edd")
    public abstract EnabledConfig mEDDConfig();

    @InterfaceC1498b("ecomm_app_event_v2_config")
    public abstract ECommAppEventV2Config mEcommAppEventV2Config();

    @Nullable
    @InterfaceC1498b("edd_restrictions")
    public abstract EnabledConfig mEddRestrictionsConfig();

    @Nullable
    @InterfaceC1498b("freelancer_hub_config")
    public abstract FreelancerHubConfig mFreelancerHubConfig();

    @Nullable
    @InterfaceC1498b("funds")
    public abstract EnabledConfig mFundsConfig();

    @Nullable
    @InterfaceC1498b("funds_creator_store")
    public abstract EnabledConfig mFundsCreatorStoreConfig();

    @Nullable
    @InterfaceC1498b("games_configurable_intro_non_production_only")
    public abstract EnabledConfig mGamesConfigurableIntroConfig();

    @Nullable
    @InterfaceC1498b("games_interstitial")
    public abstract GamesInterstitialConfig mGamesInterstitialConfig();

    @Nullable
    @InterfaceC1498b("icl_dbl")
    public abstract EnabledConfig mICLDblConfig();

    @Nullable
    @InterfaceC1498b("id_classification")
    public abstract EnabledConfig mIDClassificationConfig();

    @Nullable
    @InterfaceC1498b("in_app_review_enabled")
    public abstract InAppReviewConfig mInAppReviewConfig();

    @Nullable
    @InterfaceC1498b("inbox_v4")
    public abstract EnabledConfig mInboxV4Config();

    @Nullable
    @InterfaceC1498b("inbox_v4_manage_notifs")
    public abstract EnabledConfig mInboxV4ManageNotifsConfig();

    @Nullable
    @InterfaceC1498b("inbox_v4_maya_support")
    public abstract EnabledConfig mInboxV4MayaSupportConfig();

    @InterfaceC1498b("instapay_qr")
    public abstract EnabledConfig mInstaPayQRConfig();

    @Nullable
    @InterfaceC1498b("amvc_fingerprinting")
    public abstract EnabledConfig mKountConfig();

    @Nullable
    @InterfaceC1498b("kyc_cms_v8_non_production_only")
    public abstract EnabledConfig mKycCMSv8Config();

    @Nullable
    @InterfaceC1498b("kyc_completed_callback")
    public abstract EnabledConfig mKycCompletedCallbackConfig();

    @Nullable
    @InterfaceC1498b("kyc_personal_info_v2_non_production_only")
    public abstract EnabledConfig mKycPersonalInfoV2Config();

    @InterfaceC1498b("kyc")
    public abstract String mKycVersion();

    @Nullable
    @InterfaceC1498b("landers_credit_card_cashback_tile")
    public abstract EnabledConfig mLandersCreditCardCashbackTileConfig();

    @Nullable
    @InterfaceC1498b("load_v2_config")
    public abstract LoadConfig mLoadConfig();

    @Nullable
    @InterfaceC1498b("load_v2")
    public abstract EnabledConfig mLoadV2Config();

    @Nullable
    @InterfaceC1498b("loyalty_force_update")
    public abstract EnabledConfig mLoyaltyForceUpdateConfig();

    @InterfaceC1498b("mfa")
    public abstract MFAConfig mMFAConfig();

    @InterfaceC1498b("maintenance")
    public abstract MaintenanceConfig mMaintenanceConfig();

    @Nullable
    @InterfaceC1498b("manage_devices_non_production_only")
    public abstract EnabledConfig mManageDevicesConfig();

    @Nullable
    @InterfaceC1498b("mandatory_id_classification")
    public abstract EnabledConfig mMandatoryIDClassificationConfig();

    @Nullable
    @InterfaceC1498b("maya_biller_reminder")
    public abstract EnabledConfig mMayaBillerReminderConfig();

    @Nullable
    @InterfaceC1498b("bills_pay_disable_account_number_field")
    public abstract EnabledConfig mMayaBillsPayDisableAccountNumberInputField();

    @Nullable
    @InterfaceC1498b("bills_pay_handle_other_fields_from_deep_link")
    public abstract EnabledConfig mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig();

    @Nullable
    @InterfaceC1498b("maya_billspay_receipt_expandable_transaction_details")
    public abstract EnabledConfig mMayaBillsPayReceiptExpandableTransactionDetailsConfig();

    @Nullable
    @InterfaceC1498b("maya_bills_pay_skip_wallet_validation")
    public abstract EnabledConfig mMayaBillsPaySkipWalletValidation();

    @Nullable
    @InterfaceC1498b("pay_bills_v3_endpoint")
    public abstract EnabledConfig mMayaBillsPayV3EndpointConfig();

    @InterfaceC1498b("cashin_bank_pull_v3")
    public abstract EnabledConfig mMayaCashInBankPullV3Config();

    @Nullable
    @InterfaceC1498b("maya_compliance")
    public abstract MayaComplianceConfig mMayaComplianceConfig();

    @Nullable
    @InterfaceC1498b("maya_ekyc_v6")
    public abstract MayaEKycV6Config mMayaEKycV6Config();

    @Nullable
    @InterfaceC1498b("maya_enabled")
    public abstract MayaEnabledConfig mMayaEnabledConfig();

    @Nullable
    @InterfaceC1498b("maya_forgot_password")
    public abstract MayaForgotPasswordConfig mMayaForgotPasswordConfig();

    @Nullable
    @InterfaceC1498b("maya_insta_fill_wallet_settings_non_production_only")
    public abstract EnabledConfig mMayaInstaFillWalletSettingsConfig();

    @Nullable
    @InterfaceC1498b("initial_eligibility_check")
    public abstract EnabledConfig mMayaInstallmentCashLoanInitialEligibilityConfig();

    @Nullable
    @InterfaceC1498b("installment_cash_loans")
    public abstract EnabledConfig mMayaInstallmentCashLoansConfig();

    @Nullable
    @InterfaceC1498b("loans_device_scoring")
    public abstract EnabledConfig mMayaLoansDeviceScoringConfig();

    @Nullable
    @InterfaceC1498b("loans_simplified_checkout")
    public abstract EnabledConfig mMayaLoansSimplifiedCheckoutConfig();

    @Nullable
    @InterfaceC1498b("loans_v3")
    public abstract EnabledConfig mMayaLoansV3Config();

    @Nullable
    @InterfaceC1498b("maya_mfa")
    public abstract MayaMfaConfig mMayaMfaConfig();

    @Nullable
    @InterfaceC1498b("maya_paybills_billers_item_list_accepts_maya_credit_subtext")
    public abstract EnabledConfig mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig();

    @Nullable
    @InterfaceC1498b("maya_paybills_pay_with_maya_credit")
    public abstract EnabledConfig mMayaPayBillsPayWithMayaCreditFragmentConfig();

    @Nullable
    @InterfaceC1498b("maya_paybills_pay_with_maya_credit_new_tag")
    public abstract EnabledConfig mMayaPayBillsPayWithMayaCreditNewTagConfig();

    @Nullable
    @InterfaceC1498b("maya_paybills_pay_with_maya_credit_soon")
    public abstract EnabledConfig mMayaPayBillsPayWithMayaCreditSoonConfig();

    @Nullable
    @InterfaceC1498b("maya_paybills_view_initial_receipt_confirmation_screen_non_production_only")
    public abstract EnabledConfig mMayaPayBillsViewInitialReceiptConfirmationScreenConfig();

    @Nullable
    @InterfaceC1498b("maya_registration")
    public abstract MayaRegistrationConfig mMayaRegistrationConfig();

    @Nullable
    @InterfaceC1498b("registration_submit_invite_code")
    public abstract EnabledConfig mMayaRegistrationSubmitInviteCode();

    @Nullable
    @InterfaceC1498b("maya_registration_v2")
    public abstract MayaRegistrationV2Config mMayaRegistrationV2Config();

    @InterfaceC1498b("maya_services_category_v2")
    public abstract ServicesFeatureCoreAndCategories mMayaServicesCategoryV2();

    @InterfaceC1498b("maya_services_master_list")
    public abstract List<SecondaryFeature> mMayaServicesMasterList();

    @InterfaceC1498b("maya_shop_provider_subcategories")
    public abstract EnabledConfig mMayaShopProviderSubcategoriesConfig();

    @Nullable
    @InterfaceC1498b("maya_wallet_transaction_limit_wallet_settings_non_production_only")
    public abstract EnabledConfig mMayaTransactionLimitWalletSettingsConfig();

    @Nullable
    @InterfaceC1498b("maya_billspay_client_api_checkout_flow_v3")
    public abstract EnabledConfig mMayaUseBillsPayClientAPICheckoutFlowV3Config();

    @Nullable
    @InterfaceC1498b("maya_billspay_initial_receipt_entrypoint_non_production_only")
    public abstract EnabledConfig mMayaUseBillsPayInitialReceiptEntrypointConfig();

    @Nullable
    @InterfaceC1498b("merchant_v3_endpoint")
    public abstract EnabledConfig mMerchantV3EndpointConfig();

    @Nullable
    @InterfaceC1498b("mgm_redesign")
    public abstract EnabledConfig mMgmRedesignConfig();

    @Nullable
    @InterfaceC1498b("missions_v2")
    public abstract EnabledConfig mMissionsV2Config();

    @Nullable
    @InterfaceC1498b("missions_v2_enter_code")
    public abstract EnabledConfig mMissionsV2EnterCodeConfig();

    @Nullable
    @InterfaceC1498b("profile_badges")
    public abstract ProfileBadgesConfig mProfileBadgesConfig();

    @InterfaceC1498b("pull_funds")
    public abstract PullFundsConfig mPullFundsConfig();

    @Nullable
    @InterfaceC1498b("qr_screen_update")
    public abstract EnabledConfig mQRScreensUpdateConfig();

    @Nullable
    @InterfaceC1498b("qrph_enhancements")
    public abstract EnabledConfig mQrphEnhancementsConfig();

    @Nullable
    @InterfaceC1498b("re_kyc_10_minutes_test_non_production_only")
    public abstract EnabledConfig mReKyc10MinutesTestConfig();

    @Nullable
    @InterfaceC1498b("re_kyc_flow_v2_non_production_only")
    public abstract EnabledConfig mReKycEnhancementConfig();

    @Nullable
    @InterfaceC1498b("re_kyc_flow")
    public abstract EnabledConfig mReKycFlowConfig();

    @Nullable
    @InterfaceC1498b("real_time_image_quality_feedback_non_production_only")
    public abstract EnabledConfig mRealTimeImageQualityFeedbackConfig();

    @InterfaceC1498b("referral")
    public abstract ReferralMechanicsConfig mReferralMechanicsConfig();

    @Nullable
    @InterfaceC1498b("registration_restrictions")
    public abstract EnabledConfig mRegistrationRestrictionsConfig();

    @Nullable
    @InterfaceC1498b("request_money_tile_update")
    public abstract EnabledConfig mRequestMoneyTileUpdateConfig();

    @Nullable
    @InterfaceC1498b("request_money_v2")
    public abstract EnabledConfig mRequestMoneyV2Config();

    @InterfaceC1498b("resend_code_countdown")
    public abstract int mResendCodeCountdown();

    @Nullable
    @InterfaceC1498b("rewards")
    public abstract EnabledConfig mRewardsConfig();

    @InterfaceC1498b("shop")
    public abstract ShopConfig mShopConfig();

    @Nullable
    @InterfaceC1498b("shop_purchase_digital_or")
    public abstract EnabledConfig mShopPurchaseDigitalORConfig();

    @Nullable
    @InterfaceC1498b("show_dnfbp_from_profile_non_production_only")
    public abstract EnabledConfig mShowDnfbpFromProfileConfig();

    @Nullable
    @InterfaceC1498b("show_id_quality_score_non_production_only")
    public abstract EnabledConfig mShowIdQualityScoreConfig();

    @Nullable
    @InterfaceC1498b("show_id_score_non_production_only")
    public abstract EnabledConfig mShowIdScoreConfig();

    @Nullable
    @InterfaceC1498b("show_other_ids_zoloz_flow")
    public abstract EnabledConfig mShowOtherIDsZolozFlowConfig();

    @Nullable
    @InterfaceC1498b("split_max_timeout")
    public abstract Integer mSplitMaxTimeoutDuration();

    @Nullable
    @InterfaceC1498b("top_up_service")
    public abstract EnabledConfig mTopUpServiceConfig();

    @Nullable
    @InterfaceC1498b("unified_lending_experience_reskin")
    public abstract EnabledConfig mUnifiedLendingExperienceReskinConfig();

    @Nullable
    @InterfaceC1498b("user_profile")
    public abstract UserProfileConfig mUserProfileConfig();

    @Nullable
    @InterfaceC1498b("voucher_calendar_reminder")
    public abstract EnabledConfig mVoucherCalendarReminderConfig();

    public abstract Builder toBuilder();
}
