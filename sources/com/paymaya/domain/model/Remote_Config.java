package com.paymaya.domain.model;

import D.CallableC0170c;
import W2.b;
import W2.f;
import W2.g;
import W4.d;
import W4.e;
import We.s;
import X2.q;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.media3.datasource.cache.c;
import c2.EnumC1067j;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.paymaya.domain.model.Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import yk.a;

/* JADX INFO: loaded from: classes4.dex */
public class Remote_Config<T extends Config> implements e {
    private String mAbsolutePath = "";
    private W2.e mRemoteConfig = W2.e.f();
    protected T mTarget;

    public Remote_Config(@NonNull T t5) {
        this.mTarget = t5;
        setDefaultRemoteConfig(new HashMap());
        f fVar = new f();
        if (43200 < 0) {
            throw new IllegalArgumentException(c.i(43200L, "Minimum interval between fetches has to be a non-negative number. ", " is an invalid argument"));
        }
        fVar.f6221b = 43200L;
        f fVar2 = new f(fVar);
        W2.e eVar = this.mRemoteConfig;
        eVar.getClass();
        Tasks.call(eVar.f6217b, new CallableC0170c(9, eVar, fVar2));
    }

    public void activate(final d dVar) {
        this.mRemoteConfig.a().addOnCompleteListener(new OnCompleteListener<Boolean>() { // from class: com.paymaya.domain.model.Remote_Config.6
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NonNull Task<Boolean> task) {
                if (task.isSuccessful()) {
                    Remote_Config.this.updateConfig();
                    ((B5.d) dVar).a(Remote_Config.this.mTarget);
                    return;
                }
                d dVar2 = dVar;
                task.getException();
                ((B5.d) dVar2).getClass();
                a.d();
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.paymaya.domain.model.Remote_Config.5
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(@NonNull Exception exc) {
                ((B5.d) dVar).getClass();
                a.d();
            }
        });
    }

    public void fetchAndActivate(final W4.f fVar) {
        this.mRemoteConfig.f.a(43200L).onSuccessTask(EnumC1067j.f9268a, new C2.f(20)).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.paymaya.domain.model.Remote_Config.1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NonNull Task<Void> task) {
                if (!task.isSuccessful()) {
                    task.getException().printStackTrace();
                    ((B5.d) fVar).a(Remote_Config.this.mTarget);
                    return;
                }
                Remote_Config.this.mRemoteConfig.a();
                Remote_Config.this.updateConfig();
                ((B5.d) fVar).a(Remote_Config.this.mTarget);
            }
        });
    }

    @Override // W4.e
    public void fetchLiveAndActivate(final d dVar) {
        W2.e eVar = this.mRemoteConfig;
        W2.c cVar = new W2.c() { // from class: com.paymaya.domain.model.Remote_Config.4
            @Override // W2.c
            public void onError(@NonNull FirebaseRemoteConfigException firebaseRemoteConfigException) {
                ((B5.d) dVar).getClass();
                a.d();
            }

            @Override // W2.c
            public void onUpdate(@NonNull b bVar) {
                if (new ArrayList(((W2.a) bVar).f6214a).isEmpty()) {
                    return;
                }
                dVar.getClass();
                Remote_Config.this.activate(dVar);
            }
        };
        U8.c cVar2 = eVar.i;
        synchronized (cVar2) {
            ((LinkedHashSet) cVar2.f5964b).add(cVar);
            cVar2.c();
        }
    }

    @Override // W4.e
    public boolean getBooleanConfig(String str) {
        try {
            g rawValue = getRawValue(str);
            if (rawValue == null) {
                return false;
            }
            return ((q) rawValue).a();
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public g getRawValue(String str) {
        q qVarE = this.mRemoteConfig.f6219g.e(str);
        int i = qVarE.f6524b;
        if (i == 0 || i == 1) {
            return null;
        }
        return qVarE;
    }

    public Remote_AppEventsV2 mAppEventsV2() {
        return new Remote_AppEventsV2(this.mTarget.mAppEventsV2(), s.p(new StringBuilder(), this.mAbsolutePath, "app_events_v2_"));
    }

    public String mAppMaintenance() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "app_maintenance");
    }

    public Remote_EnabledConfig mBNPLDeepFreezeConfig() {
        return new Remote_EnabledConfig(this.mTarget.mBNPLDeepFreezeConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "bnpl_deep_freeze_"));
    }

    public Remote_EnabledConfig mBankPullSettingsV2Config() {
        return new Remote_EnabledConfig(this.mTarget.mBankPullSettingsV2Config(), s.p(new StringBuilder(), this.mAbsolutePath, "bank_pull_settings_v2_"));
    }

    public Remote_EnabledConfig mBankTransferConfig() {
        return new Remote_EnabledConfig(this.mTarget.mBankTransferConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "bank_transfer_"));
    }

    public String mBankTransferFee() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "bank_transfer_fee");
    }

    public Remote_EnabledConfig mBillerPlaceHolderConfig() {
        return new Remote_EnabledConfig(this.mTarget.mBillerPlaceHolderConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "biller_placeholder_"));
    }

    public Remote_BillsPayAccountNumberConfig mBillsPayAccountNumberConfig() {
        return new Remote_BillsPayAccountNumberConfig(this.mTarget.mBillsPayAccountNumberConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "pay_bills_"));
    }

    public Remote_EnabledConfig mBillsPayHandleBillableWithOtherFields() {
        return new Remote_EnabledConfig(this.mTarget.mBillsPayHandleBillableWithOtherFields(), s.p(new StringBuilder(), this.mAbsolutePath, "bills_pay_handle_billable_with_other_fields_"));
    }

    public Remote_EnabledConfig mCameraXConfig() {
        return new Remote_EnabledConfig(this.mTarget.mCameraXConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "cameraX_"));
    }

    public Remote_EnabledConfig mCardDetailsProtectionConfig() {
        return new Remote_EnabledConfig(this.mTarget.mCardDetailsProtectionConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "card_details_protection_"));
    }

    public Remote_EnabledConfig mCashInLimitSpielConfig() {
        return new Remote_EnabledConfig(this.mTarget.mCashInLimitSpielConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "cash_in_with_account_limit_"));
    }

    public Remote_EnabledConfig mChangeMinConfig() {
        return new Remote_EnabledConfig(this.mTarget.mChangeMinConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "change_min_"));
    }

    public Remote_EnabledConfig mConsumerOnboardingSetPasswordConfig() {
        return new Remote_EnabledConfig(this.mTarget.mConsumerOnboardingSetPasswordConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "consumer_onboarding_setpassword_non_production_only_"));
    }

    public Remote_EnabledConfig mCustomerRestrictionsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mCustomerRestrictionsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "customer_restrictions_"));
    }

    public Remote_EnabledConfig mEDDConfig() {
        return new Remote_EnabledConfig(this.mTarget.mEDDConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "edd_"));
    }

    public Remote_ECommAppEventV2Config mEcommAppEventV2Config() {
        return new Remote_ECommAppEventV2Config(this.mTarget.mEcommAppEventV2Config(), s.p(new StringBuilder(), this.mAbsolutePath, "ecomm_app_event_v2_config_"));
    }

    public Remote_EnabledConfig mEddRestrictionsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mEddRestrictionsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "edd_restrictions_"));
    }

    public Remote_FreelancerHubConfig mFreelancerHubConfig() {
        return new Remote_FreelancerHubConfig(this.mTarget.mFreelancerHubConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "freelancer_hub_config_"));
    }

    public Remote_EnabledConfig mFundsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mFundsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "funds_"));
    }

    public Remote_EnabledConfig mFundsCreatorStoreConfig() {
        return new Remote_EnabledConfig(this.mTarget.mFundsCreatorStoreConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "funds_creator_store_"));
    }

    public Remote_EnabledConfig mGamesConfigurableIntroConfig() {
        return new Remote_EnabledConfig(this.mTarget.mGamesConfigurableIntroConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "games_configurable_intro_non_production_only_"));
    }

    public String mGamesInterstitialConfig() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "games_interstitial");
    }

    public Remote_EnabledConfig mICLDblConfig() {
        return new Remote_EnabledConfig(this.mTarget.mICLDblConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "icl_dbl_"));
    }

    public Remote_EnabledConfig mIDClassificationConfig() {
        return new Remote_EnabledConfig(this.mTarget.mIDClassificationConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "id_classification_"));
    }

    public Remote_InAppReviewConfig mInAppReviewConfig() {
        return new Remote_InAppReviewConfig(this.mTarget.mInAppReviewConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "in_app_review_enabled_"));
    }

    public Remote_EnabledConfig mInboxV4Config() {
        return new Remote_EnabledConfig(this.mTarget.mInboxV4Config(), s.p(new StringBuilder(), this.mAbsolutePath, "inbox_v4_"));
    }

    public Remote_EnabledConfig mInboxV4ManageNotifsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mInboxV4ManageNotifsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "inbox_v4_manage_notifs_"));
    }

    public Remote_EnabledConfig mInboxV4MayaSupportConfig() {
        return new Remote_EnabledConfig(this.mTarget.mInboxV4MayaSupportConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "inbox_v4_maya_support_"));
    }

    public Remote_EnabledConfig mInstaPayQRConfig() {
        return new Remote_EnabledConfig(this.mTarget.mInstaPayQRConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "instapay_qr_"));
    }

    public Remote_EnabledConfig mKountConfig() {
        return new Remote_EnabledConfig(this.mTarget.mKountConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "amvc_fingerprinting_"));
    }

    public Remote_EnabledConfig mKycCompletedCallbackConfig() {
        return new Remote_EnabledConfig(this.mTarget.mKycCompletedCallbackConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "kyc_completed_callback_"));
    }

    public Remote_EnabledConfig mKycPersonalInfoV2Config() {
        return new Remote_EnabledConfig(this.mTarget.mKycPersonalInfoV2Config(), s.p(new StringBuilder(), this.mAbsolutePath, "kyc_personal_info_v2_non_production_only_"));
    }

    public String mKycVersion() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "kyc");
    }

    public Remote_EnabledConfig mLandersCreditCardCashbackTileConfig() {
        return new Remote_EnabledConfig(this.mTarget.mLandersCreditCardCashbackTileConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "landers_credit_card_cashback_tile_"));
    }

    public Remote_LoadConfig mLoadConfig() {
        return new Remote_LoadConfig(this.mTarget.mLoadConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "load_v2_config_"));
    }

    public Remote_EnabledConfig mLoadV2Config() {
        return new Remote_EnabledConfig(this.mTarget.mLoadV2Config(), s.p(new StringBuilder(), this.mAbsolutePath, "load_v2_"));
    }

    public Remote_EnabledConfig mLoyaltyForceUpdateConfig() {
        return new Remote_EnabledConfig(this.mTarget.mLoyaltyForceUpdateConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "loyalty_force_update_"));
    }

    public Remote_MFAConfig mMFAConfig() {
        return new Remote_MFAConfig(this.mTarget.mMFAConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "mfa_"));
    }

    public Remote_MaintenanceConfig mMaintenanceConfig() {
        return new Remote_MaintenanceConfig(this.mTarget.mMaintenanceConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maintenance_"));
    }

    public Remote_EnabledConfig mManageDevicesConfig() {
        return new Remote_EnabledConfig(this.mTarget.mManageDevicesConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "manage_devices_non_production_only_"));
    }

    public Remote_EnabledConfig mMandatoryIDClassificationConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMandatoryIDClassificationConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "mandatory_id_classification_"));
    }

    public Remote_EnabledConfig mMayaBillerReminderConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaBillerReminderConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_biller_reminder_"));
    }

    public Remote_EnabledConfig mMayaBillsPayDisableAccountNumberInputField() {
        return new Remote_EnabledConfig(this.mTarget.mMayaBillsPayDisableAccountNumberInputField(), s.p(new StringBuilder(), this.mAbsolutePath, "bills_pay_disable_account_number_field_"));
    }

    public Remote_EnabledConfig mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "bills_pay_handle_other_fields_from_deep_link_"));
    }

    public Remote_EnabledConfig mMayaBillsPayReceiptExpandableTransactionDetailsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaBillsPayReceiptExpandableTransactionDetailsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_billspay_receipt_expandable_transaction_details_"));
    }

    public Remote_EnabledConfig mMayaBillsPaySkipWalletValidation() {
        return new Remote_EnabledConfig(this.mTarget.mMayaBillsPaySkipWalletValidation(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_bills_pay_skip_wallet_validation_"));
    }

    public Remote_EnabledConfig mMayaBillsPayV3EndpointConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaBillsPayV3EndpointConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "pay_bills_v3_endpoint_"));
    }

    public Remote_EnabledConfig mMayaCashInBankPullV3Config() {
        return new Remote_EnabledConfig(this.mTarget.mMayaCashInBankPullV3Config(), s.p(new StringBuilder(), this.mAbsolutePath, "cashin_bank_pull_v3_"));
    }

    public Remote_MayaComplianceConfig mMayaComplianceConfig() {
        return new Remote_MayaComplianceConfig(this.mTarget.mMayaComplianceConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_compliance_"));
    }

    public Remote_MayaEKycV6Config mMayaEKycV6Config() {
        return new Remote_MayaEKycV6Config(this.mTarget.mMayaEKycV6Config(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_ekyc_v6_"));
    }

    public Remote_MayaEnabledConfig mMayaEnabledConfig() {
        return new Remote_MayaEnabledConfig(this.mTarget.mMayaEnabledConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_enabled_"));
    }

    public Remote_MayaForgotPasswordConfig mMayaForgotPasswordConfig() {
        return new Remote_MayaForgotPasswordConfig(this.mTarget.mMayaForgotPasswordConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_forgot_password_"));
    }

    public Remote_EnabledConfig mMayaInstaFillWalletSettingsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaInstaFillWalletSettingsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_insta_fill_wallet_settings_non_production_only_"));
    }

    public Remote_EnabledConfig mMayaInstallmentCashLoanInitialEligibilityConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaInstallmentCashLoanInitialEligibilityConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "initial_eligibility_check_"));
    }

    public Remote_EnabledConfig mMayaInstallmentCashLoansConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaInstallmentCashLoansConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "installment_cash_loans_"));
    }

    public Remote_EnabledConfig mMayaLoansDeviceScoringConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaLoansDeviceScoringConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "loans_device_scoring_"));
    }

    public Remote_EnabledConfig mMayaLoansSimplifiedCheckoutConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaLoansSimplifiedCheckoutConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "loans_simplified_checkout_"));
    }

    public Remote_EnabledConfig mMayaLoansV3Config() {
        return new Remote_EnabledConfig(this.mTarget.mMayaLoansV3Config(), s.p(new StringBuilder(), this.mAbsolutePath, "loans_v3_"));
    }

    public Remote_MayaMfaConfig mMayaMfaConfig() {
        return new Remote_MayaMfaConfig(this.mTarget.mMayaMfaConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_mfa_"));
    }

    public Remote_EnabledConfig mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_paybills_billers_item_list_accepts_maya_credit_subtext_"));
    }

    public Remote_EnabledConfig mMayaPayBillsPayWithMayaCreditFragmentConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaPayBillsPayWithMayaCreditFragmentConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_paybills_pay_with_maya_credit_"));
    }

    public Remote_EnabledConfig mMayaPayBillsPayWithMayaCreditNewTagConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaPayBillsPayWithMayaCreditNewTagConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_paybills_pay_with_maya_credit_new_tag_"));
    }

    public Remote_EnabledConfig mMayaPayBillsPayWithMayaCreditSoonConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaPayBillsPayWithMayaCreditSoonConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_paybills_pay_with_maya_credit_soon_"));
    }

    public Remote_EnabledConfig mMayaPayBillsViewInitialReceiptConfirmationScreenConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaPayBillsViewInitialReceiptConfirmationScreenConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_paybills_view_initial_receipt_confirmation_screen_non_production_only_"));
    }

    public Remote_MayaRegistrationConfig mMayaRegistrationConfig() {
        return new Remote_MayaRegistrationConfig(this.mTarget.mMayaRegistrationConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_registration_"));
    }

    public Remote_EnabledConfig mMayaRegistrationSubmitInviteCode() {
        return new Remote_EnabledConfig(this.mTarget.mMayaRegistrationSubmitInviteCode(), s.p(new StringBuilder(), this.mAbsolutePath, "registration_submit_invite_code_"));
    }

    public Remote_MayaRegistrationV2Config mMayaRegistrationV2Config() {
        return new Remote_MayaRegistrationV2Config(this.mTarget.mMayaRegistrationV2Config(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_registration_v2_"));
    }

    public Remote_EnabledConfig mMayaShopProviderSubcategoriesConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaShopProviderSubcategoriesConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_shop_provider_subcategories_"));
    }

    public Remote_EnabledConfig mMayaTransactionLimitWalletSettingsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaTransactionLimitWalletSettingsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_wallet_transaction_limit_wallet_settings_non_production_only_"));
    }

    public Remote_EnabledConfig mMayaUseBillsPayClientAPICheckoutFlowV3Config() {
        return new Remote_EnabledConfig(this.mTarget.mMayaUseBillsPayClientAPICheckoutFlowV3Config(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_billspay_client_api_checkout_flow_v3_"));
    }

    public Remote_EnabledConfig mMayaUseBillsPayInitialReceiptEntrypointConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMayaUseBillsPayInitialReceiptEntrypointConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "maya_billspay_initial_receipt_entrypoint_non_production_only_"));
    }

    public Remote_EnabledConfig mMerchantV3EndpointConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMerchantV3EndpointConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "merchant_v3_endpoint_"));
    }

    public Remote_EnabledConfig mMgmRedesignConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMgmRedesignConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "mgm_redesign_"));
    }

    public Remote_EnabledConfig mMissionsV2Config() {
        return new Remote_EnabledConfig(this.mTarget.mMissionsV2Config(), s.p(new StringBuilder(), this.mAbsolutePath, "missions_v2_"));
    }

    public Remote_EnabledConfig mMissionsV2EnterCodeConfig() {
        return new Remote_EnabledConfig(this.mTarget.mMissionsV2EnterCodeConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "missions_v2_enter_code_"));
    }

    public Remote_ProfileBadgesConfig mProfileBadgesConfig() {
        return new Remote_ProfileBadgesConfig(this.mTarget.mProfileBadgesConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "profile_badges_"));
    }

    public Remote_PullFundsConfig mPullFundsConfig() {
        return new Remote_PullFundsConfig(this.mTarget.mPullFundsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "pull_funds_"));
    }

    public Remote_EnabledConfig mQRScreensUpdateConfig() {
        return new Remote_EnabledConfig(this.mTarget.mQRScreensUpdateConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "qr_screen_update_"));
    }

    public Remote_EnabledConfig mQrphEnhancementsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mQrphEnhancementsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "qrph_enhancements_"));
    }

    public Remote_EnabledConfig mReKyc10MinutesTestConfig() {
        return new Remote_EnabledConfig(this.mTarget.mReKyc10MinutesTestConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "re_kyc_10_minutes_test_non_production_only_"));
    }

    public Remote_EnabledConfig mReKycEnhancementConfig() {
        return new Remote_EnabledConfig(this.mTarget.mReKycEnhancementConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "re_kyc_flow_v2_non_production_only_"));
    }

    public Remote_EnabledConfig mReKycFlowConfig() {
        return new Remote_EnabledConfig(this.mTarget.mReKycFlowConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "re_kyc_flow_"));
    }

    public Remote_EnabledConfig mRealTimeImageQualityFeedbackConfig() {
        return new Remote_EnabledConfig(this.mTarget.mRealTimeImageQualityFeedbackConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "real_time_image_quality_feedback_non_production_only_"));
    }

    public Remote_ReferralMechanicsConfig mReferralMechanicsConfig() {
        return new Remote_ReferralMechanicsConfig(this.mTarget.mReferralMechanicsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "referral_"));
    }

    public Remote_EnabledConfig mRegistrationRestrictionsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mRegistrationRestrictionsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "registration_restrictions_"));
    }

    public Remote_EnabledConfig mRequestMoneyTileUpdateConfig() {
        return new Remote_EnabledConfig(this.mTarget.mRequestMoneyTileUpdateConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "request_money_tile_update_"));
    }

    public Remote_EnabledConfig mRequestMoneyV2Config() {
        return new Remote_EnabledConfig(this.mTarget.mRequestMoneyV2Config(), s.p(new StringBuilder(), this.mAbsolutePath, "request_money_v2_"));
    }

    public String mResendCodeCountdown() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "resend_code_countdown");
    }

    public Remote_EnabledConfig mRewardsConfig() {
        return new Remote_EnabledConfig(this.mTarget.mRewardsConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "rewards_"));
    }

    public Remote_ShopConfig mShopConfig() {
        return new Remote_ShopConfig(this.mTarget.mShopConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "shop_"));
    }

    public Remote_EnabledConfig mShopPurchaseDigitalORConfig() {
        return new Remote_EnabledConfig(this.mTarget.mShopPurchaseDigitalORConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "shop_purchase_digital_or_"));
    }

    public Remote_EnabledConfig mShowIdQualityScoreConfig() {
        return new Remote_EnabledConfig(this.mTarget.mShowIdQualityScoreConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "show_id_quality_score_non_production_only_"));
    }

    public Remote_EnabledConfig mShowIdScoreConfig() {
        return new Remote_EnabledConfig(this.mTarget.mShowIdScoreConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "show_id_score_non_production_only_"));
    }

    public Remote_EnabledConfig mShowOtherIDsZolozFlowConfig() {
        return new Remote_EnabledConfig(this.mTarget.mShowOtherIDsZolozFlowConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "show_other_ids_zoloz_flow_"));
    }

    public String mSplitMaxTimeoutDuration() {
        return s.p(new StringBuilder(), this.mAbsolutePath, "split_max_timeout");
    }

    public Remote_EnabledConfig mTopUpServiceConfig() {
        return new Remote_EnabledConfig(this.mTarget.mTopUpServiceConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "top_up_service_"));
    }

    public Remote_EnabledConfig mUnifiedLendingExperienceReskinConfig() {
        return new Remote_EnabledConfig(this.mTarget.mUnifiedLendingExperienceReskinConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "unified_lending_experience_reskin_"));
    }

    public Remote_UserProfileConfig mUserProfileConfig() {
        return new Remote_UserProfileConfig(this.mTarget.mUserProfileConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "user_profile_"));
    }

    public Remote_EnabledConfig mVoucherCalendarReminderConfig() {
        return new Remote_EnabledConfig(this.mTarget.mVoucherCalendarReminderConfig(), s.p(new StringBuilder(), this.mAbsolutePath, "voucher_calendar_reminder_"));
    }

    public void setDefaultRemoteConfig(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        mMaintenanceConfig().setDefaultRemoteConfig(map);
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "app_maintenance"), this.mTarget.mAppMaintenance());
        mReferralMechanicsConfig().setDefaultRemoteConfig(map);
        mShopConfig().setDefaultRemoteConfig(map);
        mBillsPayAccountNumberConfig().setDefaultRemoteConfig(map);
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "resend_code_countdown"), Integer.valueOf(this.mTarget.mResendCodeCountdown()));
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "kyc"), this.mTarget.mKycVersion());
        mBankTransferConfig().setDefaultRemoteConfig(map);
        mInstaPayQRConfig().setDefaultRemoteConfig(map);
        mRewardsConfig().setDefaultRemoteConfig(map);
        mPullFundsConfig().setDefaultRemoteConfig(map);
        mMFAConfig().setDefaultRemoteConfig(map);
        mChangeMinConfig().setDefaultRemoteConfig(map);
        mTopUpServiceConfig().setDefaultRemoteConfig(map);
        mShopPurchaseDigitalORConfig().setDefaultRemoteConfig(map);
        mKountConfig().setDefaultRemoteConfig(map);
        mIDClassificationConfig().setDefaultRemoteConfig(map);
        mEDDConfig().setDefaultRemoteConfig(map);
        mMissionsV2Config().setDefaultRemoteConfig(map);
        mMissionsV2EnterCodeConfig().setDefaultRemoteConfig(map);
        mMandatoryIDClassificationConfig().setDefaultRemoteConfig(map);
        mMerchantV3EndpointConfig().setDefaultRemoteConfig(map);
        mVoucherCalendarReminderConfig().setDefaultRemoteConfig(map);
        mRequestMoneyV2Config().setDefaultRemoteConfig(map);
        mProfileBadgesConfig().setDefaultRemoteConfig(map);
        mCashInLimitSpielConfig().setDefaultRemoteConfig(map);
        mBillerPlaceHolderConfig().setDefaultRemoteConfig(map);
        mQrphEnhancementsConfig().setDefaultRemoteConfig(map);
        mMayaEnabledConfig().setDefaultRemoteConfig(map);
        mMayaRegistrationSubmitInviteCode().setDefaultRemoteConfig(map);
        mQRScreensUpdateConfig().setDefaultRemoteConfig(map);
        mShowOtherIDsZolozFlowConfig().setDefaultRemoteConfig(map);
        mReKycFlowConfig().setDefaultRemoteConfig(map);
        mMayaCashInBankPullV3Config().setDefaultRemoteConfig(map);
        mMayaLoansDeviceScoringConfig().setDefaultRemoteConfig(map);
        mMayaLoansV3Config().setDefaultRemoteConfig(map);
        mMayaLoansSimplifiedCheckoutConfig().setDefaultRemoteConfig(map);
        mMayaInstallmentCashLoansConfig().setDefaultRemoteConfig(map);
        mUnifiedLendingExperienceReskinConfig().setDefaultRemoteConfig(map);
        mMayaInstallmentCashLoanInitialEligibilityConfig().setDefaultRemoteConfig(map);
        mFundsConfig().setDefaultRemoteConfig(map);
        mMayaBillsPayV3EndpointConfig().setDefaultRemoteConfig(map);
        mMayaBillerReminderConfig().setDefaultRemoteConfig(map);
        mBankPullSettingsV2Config().setDefaultRemoteConfig(map);
        mInboxV4Config().setDefaultRemoteConfig(map);
        mInboxV4ManageNotifsConfig().setDefaultRemoteConfig(map);
        mMayaEKycV6Config().setDefaultRemoteConfig(map);
        mMayaComplianceConfig().setDefaultRemoteConfig(map);
        mUserProfileConfig().setDefaultRemoteConfig(map);
        mMayaShopProviderSubcategoriesConfig().setDefaultRemoteConfig(map);
        mMayaPayBillsPayWithMayaCreditFragmentConfig().setDefaultRemoteConfig(map);
        mMayaPayBillsPayWithMayaCreditNewTagConfig().setDefaultRemoteConfig(map);
        mMayaPayBillsPayWithMayaCreditSoonConfig().setDefaultRemoteConfig(map);
        mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig().setDefaultRemoteConfig(map);
        mMayaUseBillsPayClientAPICheckoutFlowV3Config().setDefaultRemoteConfig(map);
        mMayaBillsPayReceiptExpandableTransactionDetailsConfig().setDefaultRemoteConfig(map);
        mMayaBillsPaySkipWalletValidation().setDefaultRemoteConfig(map);
        mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig().setDefaultRemoteConfig(map);
        mMayaBillsPayDisableAccountNumberInputField().setDefaultRemoteConfig(map);
        mBNPLDeepFreezeConfig().setDefaultRemoteConfig(map);
        mCameraXConfig().setDefaultRemoteConfig(map);
        mInAppReviewConfig().setDefaultRemoteConfig(map);
        mInboxV4MayaSupportConfig().setDefaultRemoteConfig(map);
        mFundsCreatorStoreConfig().setDefaultRemoteConfig(map);
        mRequestMoneyTileUpdateConfig().setDefaultRemoteConfig(map);
        mMayaRegistrationConfig().setDefaultRemoteConfig(map);
        mMayaRegistrationV2Config().setDefaultRemoteConfig(map);
        mLoadV2Config().setDefaultRemoteConfig(map);
        mLoadConfig().setDefaultRemoteConfig(map);
        mLandersCreditCardCashbackTileConfig().setDefaultRemoteConfig(map);
        mLoyaltyForceUpdateConfig().setDefaultRemoteConfig(map);
        mKycCompletedCallbackConfig().setDefaultRemoteConfig(map);
        mRegistrationRestrictionsConfig().setDefaultRemoteConfig(map);
        mEddRestrictionsConfig().setDefaultRemoteConfig(map);
        mCustomerRestrictionsConfig().setDefaultRemoteConfig(map);
        mMayaMfaConfig().setDefaultRemoteConfig(map);
        mMayaForgotPasswordConfig().setDefaultRemoteConfig(map);
        mICLDblConfig().setDefaultRemoteConfig(map);
        mAppEventsV2().setDefaultRemoteConfig(map);
        mEcommAppEventV2Config().setDefaultRemoteConfig(map);
        mCardDetailsProtectionConfig().setDefaultRemoteConfig(map);
        mMgmRedesignConfig().setDefaultRemoteConfig(map);
        map.put(s.p(new StringBuilder(), this.mAbsolutePath, "split_max_timeout"), this.mTarget.mSplitMaxTimeoutDuration());
        mGamesConfigurableIntroConfig().setDefaultRemoteConfig(map);
        mReKycEnhancementConfig().setDefaultRemoteConfig(map);
        mRealTimeImageQualityFeedbackConfig().setDefaultRemoteConfig(map);
        mReKyc10MinutesTestConfig().setDefaultRemoteConfig(map);
        mShowIdScoreConfig().setDefaultRemoteConfig(map);
        mShowIdQualityScoreConfig().setDefaultRemoteConfig(map);
        mKycPersonalInfoV2Config().setDefaultRemoteConfig(map);
        mConsumerOnboardingSetPasswordConfig().setDefaultRemoteConfig(map);
        mMayaTransactionLimitWalletSettingsConfig().setDefaultRemoteConfig(map);
        mMayaInstaFillWalletSettingsConfig().setDefaultRemoteConfig(map);
        mMayaPayBillsViewInitialReceiptConfirmationScreenConfig().setDefaultRemoteConfig(map);
        mMayaUseBillsPayInitialReceiptEntrypointConfig().setDefaultRemoteConfig(map);
        mBillsPayHandleBillableWithOtherFields().setDefaultRemoteConfig(map);
        mManageDevicesConfig().setDefaultRemoteConfig(map);
        mFreelancerHubConfig().setDefaultRemoteConfig(map);
        W2.e eVar = this.mRemoteConfig;
        eVar.getClass();
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put(entry.getKey(), new String((byte[]) value));
            } else {
                map2.put(entry.getKey(), value.toString());
            }
        }
        try {
            X2.e eVarC = X2.f.c();
            eVarC.f6481b = new JSONObject(map2);
            eVar.e.e(eVarC.a()).onSuccessTask(EnumC1067j.f9268a, new C2.f(19));
        } catch (JSONException e) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e);
            Tasks.forResult(null);
        }
    }

    public void updateConfig() {
        Config.Builder builder = this.mTarget.toBuilder();
        Remote_MaintenanceConfig remote_MaintenanceConfigMMaintenanceConfig = mMaintenanceConfig();
        remote_MaintenanceConfigMMaintenanceConfig.updateConfig();
        builder.mMaintenanceConfig(remote_MaintenanceConfigMMaintenanceConfig.mTarget);
        builder.mAppMaintenance(Boolean.valueOf(this.mRemoteConfig.c(mAppMaintenance())));
        Remote_ReferralMechanicsConfig remote_ReferralMechanicsConfigMReferralMechanicsConfig = mReferralMechanicsConfig();
        remote_ReferralMechanicsConfigMReferralMechanicsConfig.updateConfig();
        builder.mReferralMechanicsConfig(remote_ReferralMechanicsConfigMReferralMechanicsConfig.mTarget);
        Remote_ShopConfig remote_ShopConfigMShopConfig = mShopConfig();
        remote_ShopConfigMShopConfig.updateConfig();
        builder.mShopConfig(remote_ShopConfigMShopConfig.mTarget);
        Remote_BillsPayAccountNumberConfig remote_BillsPayAccountNumberConfigMBillsPayAccountNumberConfig = mBillsPayAccountNumberConfig();
        remote_BillsPayAccountNumberConfigMBillsPayAccountNumberConfig.updateConfig();
        builder.mBillsPayAccountNumberConfig(remote_BillsPayAccountNumberConfigMBillsPayAccountNumberConfig.mTarget);
        builder.mResendCodeCountdown((int) this.mRemoteConfig.d(mResendCodeCountdown()));
        builder.mKycVersion(this.mRemoteConfig.g(mKycVersion()));
        Remote_EnabledConfig remote_EnabledConfigMBankTransferConfig = mBankTransferConfig();
        remote_EnabledConfigMBankTransferConfig.updateConfig();
        builder.mBankTransferConfig(remote_EnabledConfigMBankTransferConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMInstaPayQRConfig = mInstaPayQRConfig();
        remote_EnabledConfigMInstaPayQRConfig.updateConfig();
        builder.mInstaPayQRConfig(remote_EnabledConfigMInstaPayQRConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMRewardsConfig = mRewardsConfig();
        remote_EnabledConfigMRewardsConfig.updateConfig();
        builder.mRewardsConfig(remote_EnabledConfigMRewardsConfig.mTarget);
        Remote_PullFundsConfig remote_PullFundsConfigMPullFundsConfig = mPullFundsConfig();
        remote_PullFundsConfigMPullFundsConfig.updateConfig();
        builder.mPullFundsConfig(remote_PullFundsConfigMPullFundsConfig.mTarget);
        Remote_MFAConfig remote_MFAConfigMMFAConfig = mMFAConfig();
        remote_MFAConfigMMFAConfig.updateConfig();
        builder.mMFAConfig(remote_MFAConfigMMFAConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMChangeMinConfig = mChangeMinConfig();
        remote_EnabledConfigMChangeMinConfig.updateConfig();
        builder.mChangeMinConfig(remote_EnabledConfigMChangeMinConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMTopUpServiceConfig = mTopUpServiceConfig();
        remote_EnabledConfigMTopUpServiceConfig.updateConfig();
        builder.mTopUpServiceConfig(remote_EnabledConfigMTopUpServiceConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMShopPurchaseDigitalORConfig = mShopPurchaseDigitalORConfig();
        remote_EnabledConfigMShopPurchaseDigitalORConfig.updateConfig();
        builder.mShopPurchaseDigitalORConfig(remote_EnabledConfigMShopPurchaseDigitalORConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMKountConfig = mKountConfig();
        remote_EnabledConfigMKountConfig.updateConfig();
        builder.mKountConfig(remote_EnabledConfigMKountConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMIDClassificationConfig = mIDClassificationConfig();
        remote_EnabledConfigMIDClassificationConfig.updateConfig();
        builder.mIDClassificationConfig(remote_EnabledConfigMIDClassificationConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMEDDConfig = mEDDConfig();
        remote_EnabledConfigMEDDConfig.updateConfig();
        builder.mEDDConfig(remote_EnabledConfigMEDDConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMissionsV2Config = mMissionsV2Config();
        remote_EnabledConfigMMissionsV2Config.updateConfig();
        builder.mMissionsV2Config(remote_EnabledConfigMMissionsV2Config.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMissionsV2EnterCodeConfig = mMissionsV2EnterCodeConfig();
        remote_EnabledConfigMMissionsV2EnterCodeConfig.updateConfig();
        builder.mMissionsV2EnterCodeConfig(remote_EnabledConfigMMissionsV2EnterCodeConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMandatoryIDClassificationConfig = mMandatoryIDClassificationConfig();
        remote_EnabledConfigMMandatoryIDClassificationConfig.updateConfig();
        builder.mMandatoryIDClassificationConfig(remote_EnabledConfigMMandatoryIDClassificationConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMerchantV3EndpointConfig = mMerchantV3EndpointConfig();
        remote_EnabledConfigMMerchantV3EndpointConfig.updateConfig();
        builder.mMerchantV3EndpointConfig(remote_EnabledConfigMMerchantV3EndpointConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMVoucherCalendarReminderConfig = mVoucherCalendarReminderConfig();
        remote_EnabledConfigMVoucherCalendarReminderConfig.updateConfig();
        builder.mVoucherCalendarReminderConfig(remote_EnabledConfigMVoucherCalendarReminderConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMRequestMoneyV2Config = mRequestMoneyV2Config();
        remote_EnabledConfigMRequestMoneyV2Config.updateConfig();
        builder.mRequestMoneyV2Config(remote_EnabledConfigMRequestMoneyV2Config.mTarget);
        Remote_ProfileBadgesConfig remote_ProfileBadgesConfigMProfileBadgesConfig = mProfileBadgesConfig();
        remote_ProfileBadgesConfigMProfileBadgesConfig.updateConfig();
        builder.mProfileBadgesConfig(remote_ProfileBadgesConfigMProfileBadgesConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMCashInLimitSpielConfig = mCashInLimitSpielConfig();
        remote_EnabledConfigMCashInLimitSpielConfig.updateConfig();
        builder.mCashInLimitSpielConfig(remote_EnabledConfigMCashInLimitSpielConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMBillerPlaceHolderConfig = mBillerPlaceHolderConfig();
        remote_EnabledConfigMBillerPlaceHolderConfig.updateConfig();
        builder.mBillerPlaceHolderConfig(remote_EnabledConfigMBillerPlaceHolderConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMQrphEnhancementsConfig = mQrphEnhancementsConfig();
        remote_EnabledConfigMQrphEnhancementsConfig.updateConfig();
        builder.mQrphEnhancementsConfig(remote_EnabledConfigMQrphEnhancementsConfig.mTarget);
        Remote_MayaEnabledConfig remote_MayaEnabledConfigMMayaEnabledConfig = mMayaEnabledConfig();
        remote_MayaEnabledConfigMMayaEnabledConfig.updateConfig();
        builder.mMayaEnabledConfig(remote_MayaEnabledConfigMMayaEnabledConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaRegistrationSubmitInviteCode = mMayaRegistrationSubmitInviteCode();
        remote_EnabledConfigMMayaRegistrationSubmitInviteCode.updateConfig();
        builder.mMayaRegistrationSubmitInviteCode(remote_EnabledConfigMMayaRegistrationSubmitInviteCode.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMQRScreensUpdateConfig = mQRScreensUpdateConfig();
        remote_EnabledConfigMQRScreensUpdateConfig.updateConfig();
        builder.mQRScreensUpdateConfig(remote_EnabledConfigMQRScreensUpdateConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMShowOtherIDsZolozFlowConfig = mShowOtherIDsZolozFlowConfig();
        remote_EnabledConfigMShowOtherIDsZolozFlowConfig.updateConfig();
        builder.mShowOtherIDsZolozFlowConfig(remote_EnabledConfigMShowOtherIDsZolozFlowConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMReKycFlowConfig = mReKycFlowConfig();
        remote_EnabledConfigMReKycFlowConfig.updateConfig();
        builder.mReKycFlowConfig(remote_EnabledConfigMReKycFlowConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaCashInBankPullV3Config = mMayaCashInBankPullV3Config();
        remote_EnabledConfigMMayaCashInBankPullV3Config.updateConfig();
        builder.mMayaCashInBankPullV3Config(remote_EnabledConfigMMayaCashInBankPullV3Config.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaLoansDeviceScoringConfig = mMayaLoansDeviceScoringConfig();
        remote_EnabledConfigMMayaLoansDeviceScoringConfig.updateConfig();
        builder.mMayaLoansDeviceScoringConfig(remote_EnabledConfigMMayaLoansDeviceScoringConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaLoansV3Config = mMayaLoansV3Config();
        remote_EnabledConfigMMayaLoansV3Config.updateConfig();
        builder.mMayaLoansV3Config(remote_EnabledConfigMMayaLoansV3Config.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaLoansSimplifiedCheckoutConfig = mMayaLoansSimplifiedCheckoutConfig();
        remote_EnabledConfigMMayaLoansSimplifiedCheckoutConfig.updateConfig();
        builder.mMayaLoansSimplifiedCheckoutConfig(remote_EnabledConfigMMayaLoansSimplifiedCheckoutConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaInstallmentCashLoansConfig = mMayaInstallmentCashLoansConfig();
        remote_EnabledConfigMMayaInstallmentCashLoansConfig.updateConfig();
        builder.mMayaInstallmentCashLoansConfig(remote_EnabledConfigMMayaInstallmentCashLoansConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMUnifiedLendingExperienceReskinConfig = mUnifiedLendingExperienceReskinConfig();
        remote_EnabledConfigMUnifiedLendingExperienceReskinConfig.updateConfig();
        builder.mUnifiedLendingExperienceReskinConfig(remote_EnabledConfigMUnifiedLendingExperienceReskinConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaInstallmentCashLoanInitialEligibilityConfig = mMayaInstallmentCashLoanInitialEligibilityConfig();
        remote_EnabledConfigMMayaInstallmentCashLoanInitialEligibilityConfig.updateConfig();
        builder.mMayaInstallmentCashLoanInitialEligibilityConfig(remote_EnabledConfigMMayaInstallmentCashLoanInitialEligibilityConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMFundsConfig = mFundsConfig();
        remote_EnabledConfigMFundsConfig.updateConfig();
        builder.mFundsConfig(remote_EnabledConfigMFundsConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaBillsPayV3EndpointConfig = mMayaBillsPayV3EndpointConfig();
        remote_EnabledConfigMMayaBillsPayV3EndpointConfig.updateConfig();
        builder.mMayaBillsPayV3EndpointConfig(remote_EnabledConfigMMayaBillsPayV3EndpointConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaBillerReminderConfig = mMayaBillerReminderConfig();
        remote_EnabledConfigMMayaBillerReminderConfig.updateConfig();
        builder.mMayaBillerReminderConfig(remote_EnabledConfigMMayaBillerReminderConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMBankPullSettingsV2Config = mBankPullSettingsV2Config();
        remote_EnabledConfigMBankPullSettingsV2Config.updateConfig();
        builder.mBankPullSettingsV2Config(remote_EnabledConfigMBankPullSettingsV2Config.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMInboxV4Config = mInboxV4Config();
        remote_EnabledConfigMInboxV4Config.updateConfig();
        builder.mInboxV4Config(remote_EnabledConfigMInboxV4Config.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMInboxV4ManageNotifsConfig = mInboxV4ManageNotifsConfig();
        remote_EnabledConfigMInboxV4ManageNotifsConfig.updateConfig();
        builder.mInboxV4ManageNotifsConfig(remote_EnabledConfigMInboxV4ManageNotifsConfig.mTarget);
        Remote_MayaEKycV6Config remote_MayaEKycV6ConfigMMayaEKycV6Config = mMayaEKycV6Config();
        remote_MayaEKycV6ConfigMMayaEKycV6Config.updateConfig();
        builder.mMayaEKycV6Config(remote_MayaEKycV6ConfigMMayaEKycV6Config.mTarget);
        Remote_MayaComplianceConfig remote_MayaComplianceConfigMMayaComplianceConfig = mMayaComplianceConfig();
        remote_MayaComplianceConfigMMayaComplianceConfig.updateConfig();
        builder.mMayaComplianceConfig(remote_MayaComplianceConfigMMayaComplianceConfig.mTarget);
        Remote_UserProfileConfig remote_UserProfileConfigMUserProfileConfig = mUserProfileConfig();
        remote_UserProfileConfigMUserProfileConfig.updateConfig();
        builder.mUserProfileConfig(remote_UserProfileConfigMUserProfileConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaShopProviderSubcategoriesConfig = mMayaShopProviderSubcategoriesConfig();
        remote_EnabledConfigMMayaShopProviderSubcategoriesConfig.updateConfig();
        builder.mMayaShopProviderSubcategoriesConfig(remote_EnabledConfigMMayaShopProviderSubcategoriesConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaPayBillsPayWithMayaCreditFragmentConfig = mMayaPayBillsPayWithMayaCreditFragmentConfig();
        remote_EnabledConfigMMayaPayBillsPayWithMayaCreditFragmentConfig.updateConfig();
        builder.mMayaPayBillsPayWithMayaCreditFragmentConfig(remote_EnabledConfigMMayaPayBillsPayWithMayaCreditFragmentConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaPayBillsPayWithMayaCreditNewTagConfig = mMayaPayBillsPayWithMayaCreditNewTagConfig();
        remote_EnabledConfigMMayaPayBillsPayWithMayaCreditNewTagConfig.updateConfig();
        builder.mMayaPayBillsPayWithMayaCreditNewTagConfig(remote_EnabledConfigMMayaPayBillsPayWithMayaCreditNewTagConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaPayBillsPayWithMayaCreditSoonConfig = mMayaPayBillsPayWithMayaCreditSoonConfig();
        remote_EnabledConfigMMayaPayBillsPayWithMayaCreditSoonConfig.updateConfig();
        builder.mMayaPayBillsPayWithMayaCreditSoonConfig(remote_EnabledConfigMMayaPayBillsPayWithMayaCreditSoonConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig = mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig();
        remote_EnabledConfigMMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig.updateConfig();
        builder.mMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig(remote_EnabledConfigMMayaPayBillsBillersItemListAcceptsMayaCreditSubtextConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaUseBillsPayClientAPICheckoutFlowV3Config = mMayaUseBillsPayClientAPICheckoutFlowV3Config();
        remote_EnabledConfigMMayaUseBillsPayClientAPICheckoutFlowV3Config.updateConfig();
        builder.mMayaUseBillsPayClientAPICheckoutFlowV3Config(remote_EnabledConfigMMayaUseBillsPayClientAPICheckoutFlowV3Config.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaBillsPayReceiptExpandableTransactionDetailsConfig = mMayaBillsPayReceiptExpandableTransactionDetailsConfig();
        remote_EnabledConfigMMayaBillsPayReceiptExpandableTransactionDetailsConfig.updateConfig();
        builder.mMayaBillsPayReceiptExpandableTransactionDetailsConfig(remote_EnabledConfigMMayaBillsPayReceiptExpandableTransactionDetailsConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaBillsPaySkipWalletValidation = mMayaBillsPaySkipWalletValidation();
        remote_EnabledConfigMMayaBillsPaySkipWalletValidation.updateConfig();
        builder.mMayaBillsPaySkipWalletValidation(remote_EnabledConfigMMayaBillsPaySkipWalletValidation.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaBillsPayHandleDeepLinkWithOtherFieldsConfig = mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig();
        remote_EnabledConfigMMayaBillsPayHandleDeepLinkWithOtherFieldsConfig.updateConfig();
        builder.mMayaBillsPayHandleDeepLinkWithOtherFieldsConfig(remote_EnabledConfigMMayaBillsPayHandleDeepLinkWithOtherFieldsConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaBillsPayDisableAccountNumberInputField = mMayaBillsPayDisableAccountNumberInputField();
        remote_EnabledConfigMMayaBillsPayDisableAccountNumberInputField.updateConfig();
        builder.mMayaBillsPayDisableAccountNumberInputField(remote_EnabledConfigMMayaBillsPayDisableAccountNumberInputField.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMBNPLDeepFreezeConfig = mBNPLDeepFreezeConfig();
        remote_EnabledConfigMBNPLDeepFreezeConfig.updateConfig();
        builder.mBNPLDeepFreezeConfig(remote_EnabledConfigMBNPLDeepFreezeConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMCameraXConfig = mCameraXConfig();
        remote_EnabledConfigMCameraXConfig.updateConfig();
        builder.mCameraXConfig(remote_EnabledConfigMCameraXConfig.mTarget);
        Remote_InAppReviewConfig remote_InAppReviewConfigMInAppReviewConfig = mInAppReviewConfig();
        remote_InAppReviewConfigMInAppReviewConfig.updateConfig();
        builder.mInAppReviewConfig(remote_InAppReviewConfigMInAppReviewConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMInboxV4MayaSupportConfig = mInboxV4MayaSupportConfig();
        remote_EnabledConfigMInboxV4MayaSupportConfig.updateConfig();
        builder.mInboxV4MayaSupportConfig(remote_EnabledConfigMInboxV4MayaSupportConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMFundsCreatorStoreConfig = mFundsCreatorStoreConfig();
        remote_EnabledConfigMFundsCreatorStoreConfig.updateConfig();
        builder.mFundsCreatorStoreConfig(remote_EnabledConfigMFundsCreatorStoreConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMRequestMoneyTileUpdateConfig = mRequestMoneyTileUpdateConfig();
        remote_EnabledConfigMRequestMoneyTileUpdateConfig.updateConfig();
        builder.mRequestMoneyTileUpdateConfig(remote_EnabledConfigMRequestMoneyTileUpdateConfig.mTarget);
        Remote_MayaRegistrationConfig remote_MayaRegistrationConfigMMayaRegistrationConfig = mMayaRegistrationConfig();
        remote_MayaRegistrationConfigMMayaRegistrationConfig.updateConfig();
        builder.mMayaRegistrationConfig(remote_MayaRegistrationConfigMMayaRegistrationConfig.mTarget);
        Remote_MayaRegistrationV2Config remote_MayaRegistrationV2ConfigMMayaRegistrationV2Config = mMayaRegistrationV2Config();
        remote_MayaRegistrationV2ConfigMMayaRegistrationV2Config.updateConfig();
        builder.mMayaRegistrationV2Config(remote_MayaRegistrationV2ConfigMMayaRegistrationV2Config.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMLoadV2Config = mLoadV2Config();
        remote_EnabledConfigMLoadV2Config.updateConfig();
        builder.mLoadV2Config(remote_EnabledConfigMLoadV2Config.mTarget);
        Remote_LoadConfig remote_LoadConfigMLoadConfig = mLoadConfig();
        remote_LoadConfigMLoadConfig.updateConfig();
        builder.mLoadConfig(remote_LoadConfigMLoadConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMLandersCreditCardCashbackTileConfig = mLandersCreditCardCashbackTileConfig();
        remote_EnabledConfigMLandersCreditCardCashbackTileConfig.updateConfig();
        builder.mLandersCreditCardCashbackTileConfig(remote_EnabledConfigMLandersCreditCardCashbackTileConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMLoyaltyForceUpdateConfig = mLoyaltyForceUpdateConfig();
        remote_EnabledConfigMLoyaltyForceUpdateConfig.updateConfig();
        builder.mLoyaltyForceUpdateConfig(remote_EnabledConfigMLoyaltyForceUpdateConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMKycCompletedCallbackConfig = mKycCompletedCallbackConfig();
        remote_EnabledConfigMKycCompletedCallbackConfig.updateConfig();
        builder.mKycCompletedCallbackConfig(remote_EnabledConfigMKycCompletedCallbackConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMRegistrationRestrictionsConfig = mRegistrationRestrictionsConfig();
        remote_EnabledConfigMRegistrationRestrictionsConfig.updateConfig();
        builder.mRegistrationRestrictionsConfig(remote_EnabledConfigMRegistrationRestrictionsConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMEddRestrictionsConfig = mEddRestrictionsConfig();
        remote_EnabledConfigMEddRestrictionsConfig.updateConfig();
        builder.mEddRestrictionsConfig(remote_EnabledConfigMEddRestrictionsConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMCustomerRestrictionsConfig = mCustomerRestrictionsConfig();
        remote_EnabledConfigMCustomerRestrictionsConfig.updateConfig();
        builder.mCustomerRestrictionsConfig(remote_EnabledConfigMCustomerRestrictionsConfig.mTarget);
        Remote_MayaMfaConfig remote_MayaMfaConfigMMayaMfaConfig = mMayaMfaConfig();
        remote_MayaMfaConfigMMayaMfaConfig.updateConfig();
        builder.mMayaMfaConfig(remote_MayaMfaConfigMMayaMfaConfig.mTarget);
        Remote_MayaForgotPasswordConfig remote_MayaForgotPasswordConfigMMayaForgotPasswordConfig = mMayaForgotPasswordConfig();
        remote_MayaForgotPasswordConfigMMayaForgotPasswordConfig.updateConfig();
        builder.mMayaForgotPasswordConfig(remote_MayaForgotPasswordConfigMMayaForgotPasswordConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMICLDblConfig = mICLDblConfig();
        remote_EnabledConfigMICLDblConfig.updateConfig();
        builder.mICLDblConfig(remote_EnabledConfigMICLDblConfig.mTarget);
        Remote_AppEventsV2 remote_AppEventsV2MAppEventsV2 = mAppEventsV2();
        remote_AppEventsV2MAppEventsV2.updateConfig();
        builder.mAppEventsV2(remote_AppEventsV2MAppEventsV2.mTarget);
        Remote_ECommAppEventV2Config remote_ECommAppEventV2ConfigMEcommAppEventV2Config = mEcommAppEventV2Config();
        remote_ECommAppEventV2ConfigMEcommAppEventV2Config.updateConfig();
        builder.mEcommAppEventV2Config(remote_ECommAppEventV2ConfigMEcommAppEventV2Config.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMCardDetailsProtectionConfig = mCardDetailsProtectionConfig();
        remote_EnabledConfigMCardDetailsProtectionConfig.updateConfig();
        builder.mCardDetailsProtectionConfig(remote_EnabledConfigMCardDetailsProtectionConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMgmRedesignConfig = mMgmRedesignConfig();
        remote_EnabledConfigMMgmRedesignConfig.updateConfig();
        builder.mMgmRedesignConfig(remote_EnabledConfigMMgmRedesignConfig.mTarget);
        builder.mSplitMaxTimeoutDuration(Integer.valueOf((int) this.mRemoteConfig.d(mSplitMaxTimeoutDuration())));
        Remote_EnabledConfig remote_EnabledConfigMGamesConfigurableIntroConfig = mGamesConfigurableIntroConfig();
        remote_EnabledConfigMGamesConfigurableIntroConfig.updateConfig();
        builder.mGamesConfigurableIntroConfig(remote_EnabledConfigMGamesConfigurableIntroConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMReKycEnhancementConfig = mReKycEnhancementConfig();
        remote_EnabledConfigMReKycEnhancementConfig.updateConfig();
        builder.mReKycEnhancementConfig(remote_EnabledConfigMReKycEnhancementConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMRealTimeImageQualityFeedbackConfig = mRealTimeImageQualityFeedbackConfig();
        remote_EnabledConfigMRealTimeImageQualityFeedbackConfig.updateConfig();
        builder.mRealTimeImageQualityFeedbackConfig(remote_EnabledConfigMRealTimeImageQualityFeedbackConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMReKyc10MinutesTestConfig = mReKyc10MinutesTestConfig();
        remote_EnabledConfigMReKyc10MinutesTestConfig.updateConfig();
        builder.mReKyc10MinutesTestConfig(remote_EnabledConfigMReKyc10MinutesTestConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMShowIdScoreConfig = mShowIdScoreConfig();
        remote_EnabledConfigMShowIdScoreConfig.updateConfig();
        builder.mShowIdScoreConfig(remote_EnabledConfigMShowIdScoreConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMShowIdQualityScoreConfig = mShowIdQualityScoreConfig();
        remote_EnabledConfigMShowIdQualityScoreConfig.updateConfig();
        builder.mShowIdQualityScoreConfig(remote_EnabledConfigMShowIdQualityScoreConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMKycPersonalInfoV2Config = mKycPersonalInfoV2Config();
        remote_EnabledConfigMKycPersonalInfoV2Config.updateConfig();
        builder.mKycPersonalInfoV2Config(remote_EnabledConfigMKycPersonalInfoV2Config.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMConsumerOnboardingSetPasswordConfig = mConsumerOnboardingSetPasswordConfig();
        remote_EnabledConfigMConsumerOnboardingSetPasswordConfig.updateConfig();
        builder.mConsumerOnboardingSetPasswordConfig(remote_EnabledConfigMConsumerOnboardingSetPasswordConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaTransactionLimitWalletSettingsConfig = mMayaTransactionLimitWalletSettingsConfig();
        remote_EnabledConfigMMayaTransactionLimitWalletSettingsConfig.updateConfig();
        builder.mMayaTransactionLimitWalletSettingsConfig(remote_EnabledConfigMMayaTransactionLimitWalletSettingsConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaInstaFillWalletSettingsConfig = mMayaInstaFillWalletSettingsConfig();
        remote_EnabledConfigMMayaInstaFillWalletSettingsConfig.updateConfig();
        builder.mMayaInstaFillWalletSettingsConfig(remote_EnabledConfigMMayaInstaFillWalletSettingsConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaPayBillsViewInitialReceiptConfirmationScreenConfig = mMayaPayBillsViewInitialReceiptConfirmationScreenConfig();
        remote_EnabledConfigMMayaPayBillsViewInitialReceiptConfirmationScreenConfig.updateConfig();
        builder.mMayaPayBillsViewInitialReceiptConfirmationScreenConfig(remote_EnabledConfigMMayaPayBillsViewInitialReceiptConfirmationScreenConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMMayaUseBillsPayInitialReceiptEntrypointConfig = mMayaUseBillsPayInitialReceiptEntrypointConfig();
        remote_EnabledConfigMMayaUseBillsPayInitialReceiptEntrypointConfig.updateConfig();
        builder.mMayaUseBillsPayInitialReceiptEntrypointConfig(remote_EnabledConfigMMayaUseBillsPayInitialReceiptEntrypointConfig.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMBillsPayHandleBillableWithOtherFields = mBillsPayHandleBillableWithOtherFields();
        remote_EnabledConfigMBillsPayHandleBillableWithOtherFields.updateConfig();
        builder.mBillsPayHandleBillableWithOtherFields(remote_EnabledConfigMBillsPayHandleBillableWithOtherFields.mTarget);
        Remote_EnabledConfig remote_EnabledConfigMManageDevicesConfig = mManageDevicesConfig();
        remote_EnabledConfigMManageDevicesConfig.updateConfig();
        builder.mManageDevicesConfig(remote_EnabledConfigMManageDevicesConfig.mTarget);
        Remote_FreelancerHubConfig remote_FreelancerHubConfigMFreelancerHubConfig = mFreelancerHubConfig();
        remote_FreelancerHubConfigMFreelancerHubConfig.updateConfig();
        builder.mFreelancerHubConfig(remote_FreelancerHubConfigMFreelancerHubConfig.mTarget);
        this.mTarget = (T) builder.build();
    }

    @Override // W4.e
    public T getConfig() {
        return this.mTarget;
    }

    @Override // W4.e
    public void setConfig(@NonNull T t5) {
        this.mTarget = t5;
        setDefaultRemoteConfig(new HashMap());
        updateConfig();
    }

    @Override // W4.e
    public void fetchAndActivate(final d dVar) {
        this.mRemoteConfig.f.a(43200L).onSuccessTask(EnumC1067j.f9268a, new C2.f(20)).addOnCompleteListener(new OnCompleteListener<Void>() { // from class: com.paymaya.domain.model.Remote_Config.3
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Remote_Config.this.activate(dVar);
                    return;
                }
                task.getException().printStackTrace();
                d dVar2 = dVar;
                task.getException();
                ((B5.d) dVar2).getClass();
                a.d();
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.paymaya.domain.model.Remote_Config.2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(@NonNull Exception exc) {
                ((B5.d) dVar).getClass();
                a.d();
            }
        });
    }
}
