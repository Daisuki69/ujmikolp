package com.paymaya.common.utility;

import com.google.gson.reflect.TypeToken;
import com.paymaya.domain.model.AccessToken;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.AccountLimitAmount;
import com.paymaya.domain.model.AccountLimitCount;
import com.paymaya.domain.model.AccountLimitType;
import com.paymaya.domain.model.AccountLimits;
import com.paymaya.domain.model.AccountName;
import com.paymaya.domain.model.AccountType;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.AddMoneyViaCardConfig;
import com.paymaya.domain.model.Address;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.AppEventsV2;
import com.paymaya.domain.model.AvailabilityConfig;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.Bank;
import com.paymaya.domain.model.BankAccount;
import com.paymaya.domain.model.BankTransfer;
import com.paymaya.domain.model.BankTransferBank;
import com.paymaya.domain.model.BankTransferRecipient;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerCategory;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerDynamicField;
import com.paymaya.domain.model.BillerField;
import com.paymaya.domain.model.BillerInput;
import com.paymaya.domain.model.BillerMetadata;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.BillsPayAccountNumberConfig;
import com.paymaya.domain.model.BillsPayRequest;
import com.paymaya.domain.model.BillsPayRequestDetails;
import com.paymaya.domain.model.BirthPlace;
import com.paymaya.domain.model.BlockReason;
import com.paymaya.domain.model.CardProfile;
import com.paymaya.domain.model.ChangeMin;
import com.paymaya.domain.model.Config;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.Country;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.CreditCard;
import com.paymaya.domain.model.CreditCardDetails;
import com.paymaya.domain.model.DashboardSettingsConfig;
import com.paymaya.domain.model.DashboardSettingsTab;
import com.paymaya.domain.model.Details;
import com.paymaya.domain.model.DisplayName;
import com.paymaya.domain.model.ECommAppEventV2Config;
import com.paymaya.domain.model.Ekyc;
import com.paymaya.domain.model.EkycAccountType;
import com.paymaya.domain.model.EkycAdditionalDocument;
import com.paymaya.domain.model.EkycIdentification;
import com.paymaya.domain.model.EnabledConfig;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteContentPreview;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FavoriteLimits;
import com.paymaya.domain.model.Fee;
import com.paymaya.domain.model.FileUploadRequest;
import com.paymaya.domain.model.FileUploadResponse;
import com.paymaya.domain.model.FormSeries;
import com.paymaya.domain.model.FreelancerHubConfig;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.GovernmentIdentification;
import com.paymaya.domain.model.IdentificationType;
import com.paymaya.domain.model.Identity;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.ImageUrlIOS;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.InAppReviewConfig;
import com.paymaya.domain.model.InboxMessage;
import com.paymaya.domain.model.IncomeSource;
import com.paymaya.domain.model.InstapayAccount;
import com.paymaya.domain.model.LoadConfig;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.LoanInstance;
import com.paymaya.domain.model.LoanProductDetails;
import com.paymaya.domain.model.MFAConfig;
import com.paymaya.domain.model.MaintenanceConfig;
import com.paymaya.domain.model.MaintenanceDate;
import com.paymaya.domain.model.MayaComplianceConfig;
import com.paymaya.domain.model.MayaEKycV6Config;
import com.paymaya.domain.model.MayaEnabledConfig;
import com.paymaya.domain.model.MayaForgotPasswordConfig;
import com.paymaya.domain.model.MayaMfaConfig;
import com.paymaya.domain.model.MayaRegistrationConfig;
import com.paymaya.domain.model.MayaRegistrationV2Config;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.Meta;
import com.paymaya.domain.model.Mission;
import com.paymaya.domain.model.MissionAction;
import com.paymaya.domain.model.MissionBase;
import com.paymaya.domain.model.MissionMechanics;
import com.paymaya.domain.model.MissionProgress;
import com.paymaya.domain.model.MissionReward;
import com.paymaya.domain.model.MissionValidity;
import com.paymaya.domain.model.MoneyInCode;
import com.paymaya.domain.model.MoneyInTopUpCode;
import com.paymaya.domain.model.Nationality;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.Operator;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.OrderProviderField;
import com.paymaya.domain.model.PadalaCreateTransfer;
import com.paymaya.domain.model.PadalaTransfer;
import com.paymaya.domain.model.PayId;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PrivacyPolicy;
import com.paymaya.domain.model.Product;
import com.paymaya.domain.model.ProductProviderDetails;
import com.paymaya.domain.model.ProductProviderField;
import com.paymaya.domain.model.ProductType;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.ProfileBadgesConfig;
import com.paymaya.domain.model.PullFundsCard;
import com.paymaya.domain.model.PullFundsConfig;
import com.paymaya.domain.model.PullFundsPartner;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.PushToken;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.domain.model.QRRecipient;
import com.paymaya.domain.model.RedirectUrls;
import com.paymaya.domain.model.ReferralCode;
import com.paymaya.domain.model.ReferralMechanicsConfig;
import com.paymaya.domain.model.Region;
import com.paymaya.domain.model.Registration;
import com.paymaya.domain.model.Route;
import com.paymaya.domain.model.ScheduledNotification;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.model.SendMoneyConfig;
import com.paymaya.domain.model.ServiceAvailabilityConfig;
import com.paymaya.domain.model.SettingsDisplayName;
import com.paymaya.domain.model.SevenElevenPushNotification;
import com.paymaya.domain.model.ShopCategory;
import com.paymaya.domain.model.ShopCategoryBase;
import com.paymaya.domain.model.ShopConfig;
import com.paymaya.domain.model.ShopHome;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import com.paymaya.domain.model.ShopPurchaseHistoryPushNotification;
import com.paymaya.domain.model.Stop;
import com.paymaya.domain.model.SubmitEkycReference;
import com.paymaya.domain.model.Success;
import com.paymaya.domain.model.Term;
import com.paymaya.domain.model.TicketPurchaseAmount;
import com.paymaya.domain.model.TicketPurchaseAmountDetails;
import com.paymaya.domain.model.TicketPurchaseConfirmation;
import com.paymaya.domain.model.TicketPurchaseIssuer;
import com.paymaya.domain.model.Transaction;
import com.paymaya.domain.model.TransactionDetail;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.domain.model.TransferEntity;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.model.TransferSender;
import com.paymaya.domain.model.TransferTarget;
import com.paymaya.domain.model.TransferToken;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.domain.model.UIValue;
import com.paymaya.domain.model.UpgradePlus;
import com.paymaya.domain.model.UpgradePlusReference;
import com.paymaya.domain.model.User;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.model.UserProfileConfig;
import com.paymaya.domain.model.Validation;
import com.paymaya.domain.model.VaultedCard;
import com.paymaya.domain.model.VerifyLoans;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherBase;
import com.paymaya.domain.model.VoucherDenomination;
import com.paymaya.domain.model.VoucherNotificationSettings;
import com.paymaya.domain.model.VoucherRedeemTransaction;
import com.paymaya.domain.model.WesternUnionTransaction;
import com.paymaya.domain.model.WhitelistedLoan;
import com.paymaya.domain.model.WorkNature;
import com.paymaya.domain.store.AbstractC1259g;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValueGson_PayMayaAutoValueTypeAdapterFactory extends PayMayaAutoValueTypeAdapterFactory {
    @Override // com.google.gson.z
    public final com.google.gson.y a(com.google.gson.j jVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (AccessToken.class.isAssignableFrom(rawType)) {
            return AccessToken.typeAdapter(jVar);
        }
        if (AccountBalance.class.isAssignableFrom(rawType)) {
            return AccountBalance.typeAdapter(jVar);
        }
        if (AccountLimitAmount.class.isAssignableFrom(rawType)) {
            return AccountLimitAmount.typeAdapter(jVar);
        }
        if (AccountLimitCount.class.isAssignableFrom(rawType)) {
            return AccountLimitCount.typeAdapter(jVar);
        }
        if (AccountLimitType.class.isAssignableFrom(rawType)) {
            return AccountLimitType.typeAdapter(jVar);
        }
        if (AccountLimits.class.isAssignableFrom(rawType)) {
            return AccountLimits.typeAdapter(jVar);
        }
        if (AccountName.class.isAssignableFrom(rawType)) {
            return AccountName.typeAdapter(jVar);
        }
        if (AccountType.class.isAssignableFrom(rawType)) {
            return AccountType.typeAdapter(jVar);
        }
        if (ActivityDescription.class.isAssignableFrom(rawType)) {
            return ActivityDescription.typeAdapter(jVar);
        }
        if (AddMoneyViaCardConfig.class.isAssignableFrom(rawType)) {
            return AddMoneyViaCardConfig.typeAdapter(jVar);
        }
        if (Address.class.isAssignableFrom(rawType)) {
            return Address.typeAdapter(jVar);
        }
        if (AbstractC1259g.class.isAssignableFrom(rawType)) {
            return AbstractC1259g.a(jVar);
        }
        if (Amount.class.isAssignableFrom(rawType)) {
            return Amount.typeAdapter(jVar);
        }
        if (AppEventsV2.class.isAssignableFrom(rawType)) {
            return AppEventsV2.typeAdapter(jVar);
        }
        if (AvailabilityConfig.class.isAssignableFrom(rawType)) {
            return AvailabilityConfig.typeAdapter(jVar);
        }
        if (BackUpIdentity.class.isAssignableFrom(rawType)) {
            return BackUpIdentity.typeAdapter(jVar);
        }
        if (Bank.class.isAssignableFrom(rawType)) {
            return Bank.typeAdapter(jVar);
        }
        if (BankAccount.class.isAssignableFrom(rawType)) {
            return BankAccount.typeAdapter(jVar);
        }
        if (BankTransfer.class.isAssignableFrom(rawType)) {
            return BankTransfer.typeAdapter(jVar);
        }
        if (BankTransferBank.class.isAssignableFrom(rawType)) {
            return BankTransferBank.typeAdapter(jVar);
        }
        if (BankTransferRecipient.class.isAssignableFrom(rawType)) {
            return BankTransferRecipient.typeAdapter(jVar);
        }
        if (Biller.class.isAssignableFrom(rawType)) {
            return Biller.typeAdapter(jVar);
        }
        if (BillerCategory.class.isAssignableFrom(rawType)) {
            return BillerCategory.typeAdapter(jVar);
        }
        if (BillerDetails.class.isAssignableFrom(rawType)) {
            return BillerDetails.typeAdapter(jVar);
        }
        if (BillerDynamicField.class.isAssignableFrom(rawType)) {
            return BillerDynamicField.typeAdapter(jVar);
        }
        if (BillerField.class.isAssignableFrom(rawType)) {
            return BillerField.typeAdapter(jVar);
        }
        if (BillerInput.class.isAssignableFrom(rawType)) {
            return BillerInput.typeAdapter(jVar);
        }
        if (BillerMetadata.class.isAssignableFrom(rawType)) {
            return BillerMetadata.typeAdapter(jVar);
        }
        if (BillerTransaction.class.isAssignableFrom(rawType)) {
            return BillerTransaction.typeAdapter(jVar);
        }
        if (BillsPayAccountNumberConfig.class.isAssignableFrom(rawType)) {
            return BillsPayAccountNumberConfig.typeAdapter(jVar);
        }
        if (BillsPayRequest.class.isAssignableFrom(rawType)) {
            return BillsPayRequest.typeAdapter(jVar);
        }
        if (BillsPayRequestDetails.class.isAssignableFrom(rawType)) {
            return BillsPayRequestDetails.typeAdapter(jVar);
        }
        if (BirthPlace.class.isAssignableFrom(rawType)) {
            return BirthPlace.typeAdapter(jVar);
        }
        if (BlockReason.class.isAssignableFrom(rawType)) {
            return BlockReason.typeAdapter(jVar);
        }
        if (CardProfile.class.isAssignableFrom(rawType)) {
            return CardProfile.typeAdapter(jVar);
        }
        if (ChangeMin.class.isAssignableFrom(rawType)) {
            return ChangeMin.typeAdapter(jVar);
        }
        if (Config.class.isAssignableFrom(rawType)) {
            return Config.typeAdapter(jVar);
        }
        if (Consent.class.isAssignableFrom(rawType)) {
            return Consent.typeAdapter(jVar);
        }
        if (Country.class.isAssignableFrom(rawType)) {
            return Country.typeAdapter(jVar);
        }
        if (CreatePullFunds.class.isAssignableFrom(rawType)) {
            return CreatePullFunds.typeAdapter(jVar);
        }
        if (CreditCard.class.isAssignableFrom(rawType)) {
            return CreditCard.typeAdapter(jVar);
        }
        if (CreditCardDetails.class.isAssignableFrom(rawType)) {
            return CreditCardDetails.typeAdapter(jVar);
        }
        if (DashboardSettingsConfig.class.isAssignableFrom(rawType)) {
            return DashboardSettingsConfig.typeAdapter(jVar);
        }
        if (DashboardSettingsTab.class.isAssignableFrom(rawType)) {
            return DashboardSettingsTab.typeAdapter(jVar);
        }
        if (Details.class.isAssignableFrom(rawType)) {
            return Details.typeAdapter(jVar);
        }
        if (DisplayName.class.isAssignableFrom(rawType)) {
            return DisplayName.typeAdapter(jVar);
        }
        if (ECommAppEventV2Config.class.isAssignableFrom(rawType)) {
            return ECommAppEventV2Config.typeAdapter(jVar);
        }
        if (Ekyc.class.isAssignableFrom(rawType)) {
            return Ekyc.typeAdapter(jVar);
        }
        if (EkycAccountType.class.isAssignableFrom(rawType)) {
            return EkycAccountType.typeAdapter(jVar);
        }
        if (EkycAdditionalDocument.class.isAssignableFrom(rawType)) {
            return EkycAdditionalDocument.typeAdapter(jVar);
        }
        if (EkycIdentification.class.isAssignableFrom(rawType)) {
            return EkycIdentification.typeAdapter(jVar);
        }
        if (EnabledConfig.class.isAssignableFrom(rawType)) {
            return EnabledConfig.typeAdapter(jVar);
        }
        if (ExecutePullFunds.class.isAssignableFrom(rawType)) {
            return ExecutePullFunds.typeAdapter(jVar);
        }
        if (Favorite.class.isAssignableFrom(rawType)) {
            return Favorite.typeAdapter(jVar);
        }
        if (FavoriteContentPreview.class.isAssignableFrom(rawType)) {
            return FavoriteContentPreview.typeAdapter(jVar);
        }
        if (FavoriteCount.class.isAssignableFrom(rawType)) {
            return FavoriteCount.typeAdapter(jVar);
        }
        if (FavoriteDetails.class.isAssignableFrom(rawType)) {
            return FavoriteDetails.typeAdapter(jVar);
        }
        if (FavoriteLimits.class.isAssignableFrom(rawType)) {
            return FavoriteLimits.typeAdapter(jVar);
        }
        if (Fee.class.isAssignableFrom(rawType)) {
            return Fee.typeAdapter(jVar);
        }
        if (FileUploadRequest.class.isAssignableFrom(rawType)) {
            return FileUploadRequest.typeAdapter(jVar);
        }
        if (FileUploadResponse.class.isAssignableFrom(rawType)) {
            return FileUploadResponse.typeAdapter(jVar);
        }
        if (FormSeries.class.isAssignableFrom(rawType)) {
            return FormSeries.typeAdapter(jVar);
        }
        if (FreelancerHubConfig.class.isAssignableFrom(rawType)) {
            return FreelancerHubConfig.typeAdapter(jVar);
        }
        if (FundSource.class.isAssignableFrom(rawType)) {
            return FundSource.typeAdapter(jVar);
        }
        if (GovernmentIdentification.class.isAssignableFrom(rawType)) {
            return GovernmentIdentification.typeAdapter(jVar);
        }
        if (IdentificationType.class.isAssignableFrom(rawType)) {
            return IdentificationType.typeAdapter(jVar);
        }
        if (Identity.class.isAssignableFrom(rawType)) {
            return Identity.typeAdapter(jVar);
        }
        if (ImageUrl.class.isAssignableFrom(rawType)) {
            return ImageUrl.typeAdapter(jVar);
        }
        if (ImageUrlIOS.class.isAssignableFrom(rawType)) {
            return ImageUrlIOS.typeAdapter(jVar);
        }
        if (ImageUrlUnfiltered.class.isAssignableFrom(rawType)) {
            return ImageUrlUnfiltered.typeAdapter(jVar);
        }
        if (InAppReviewConfig.class.isAssignableFrom(rawType)) {
            return InAppReviewConfig.typeAdapter(jVar);
        }
        if (InboxMessage.class.isAssignableFrom(rawType)) {
            return InboxMessage.typeAdapter(jVar);
        }
        if (IncomeSource.class.isAssignableFrom(rawType)) {
            return IncomeSource.typeAdapter(jVar);
        }
        if (InstapayAccount.class.isAssignableFrom(rawType)) {
            return InstapayAccount.typeAdapter(jVar);
        }
        if (LoadConfig.class.isAssignableFrom(rawType)) {
            return LoadConfig.typeAdapter(jVar);
        }
        if (LoadUpPartner.class.isAssignableFrom(rawType)) {
            return LoadUpPartner.typeAdapter(jVar);
        }
        if (LoanInstance.class.isAssignableFrom(rawType)) {
            return LoanInstance.typeAdapter(jVar);
        }
        if (LoanProductDetails.class.isAssignableFrom(rawType)) {
            return LoanProductDetails.typeAdapter(jVar);
        }
        if (MFAConfig.class.isAssignableFrom(rawType)) {
            return MFAConfig.typeAdapter(jVar);
        }
        if (MaintenanceConfig.class.isAssignableFrom(rawType)) {
            return MaintenanceConfig.typeAdapter(jVar);
        }
        if (MaintenanceDate.class.isAssignableFrom(rawType)) {
            return MaintenanceDate.typeAdapter(jVar);
        }
        if (MayaComplianceConfig.class.isAssignableFrom(rawType)) {
            return MayaComplianceConfig.typeAdapter(jVar);
        }
        if (MayaEKycV6Config.class.isAssignableFrom(rawType)) {
            return MayaEKycV6Config.typeAdapter(jVar);
        }
        if (MayaEnabledConfig.class.isAssignableFrom(rawType)) {
            return MayaEnabledConfig.typeAdapter(jVar);
        }
        if (MayaForgotPasswordConfig.class.isAssignableFrom(rawType)) {
            return MayaForgotPasswordConfig.typeAdapter(jVar);
        }
        if (MayaMfaConfig.class.isAssignableFrom(rawType)) {
            return MayaMfaConfig.typeAdapter(jVar);
        }
        if (MayaRegistrationConfig.class.isAssignableFrom(rawType)) {
            return MayaRegistrationConfig.typeAdapter(jVar);
        }
        if (MayaRegistrationV2Config.class.isAssignableFrom(rawType)) {
            return MayaRegistrationV2Config.typeAdapter(jVar);
        }
        if (MerchantPayment.class.isAssignableFrom(rawType)) {
            return MerchantPayment.typeAdapter(jVar);
        }
        if (Meta.class.isAssignableFrom(rawType)) {
            return Meta.typeAdapter(jVar);
        }
        if (Mission.class.isAssignableFrom(rawType)) {
            return Mission.typeAdapter(jVar);
        }
        if (MissionAction.class.isAssignableFrom(rawType)) {
            return MissionAction.typeAdapter(jVar);
        }
        if (MissionBase.class.isAssignableFrom(rawType)) {
            return MissionBase.typeAdapter(jVar);
        }
        if (MissionMechanics.class.isAssignableFrom(rawType)) {
            return MissionMechanics.typeAdapter(jVar);
        }
        if (MissionProgress.class.isAssignableFrom(rawType)) {
            return MissionProgress.typeAdapter(jVar);
        }
        if (MissionReward.class.isAssignableFrom(rawType)) {
            return MissionReward.typeAdapter(jVar);
        }
        if (MissionValidity.class.isAssignableFrom(rawType)) {
            return MissionValidity.typeAdapter(jVar);
        }
        if (MoneyInCode.class.isAssignableFrom(rawType)) {
            return MoneyInCode.typeAdapter(jVar);
        }
        if (MoneyInTopUpCode.class.isAssignableFrom(rawType)) {
            return MoneyInTopUpCode.typeAdapter(jVar);
        }
        if (Nationality.class.isAssignableFrom(rawType)) {
            return Nationality.typeAdapter(jVar);
        }
        if (OTP.class.isAssignableFrom(rawType)) {
            return OTP.typeAdapter(jVar);
        }
        if (OnlinePayment.class.isAssignableFrom(rawType)) {
            return OnlinePayment.typeAdapter(jVar);
        }
        if (Operator.class.isAssignableFrom(rawType)) {
            return Operator.typeAdapter(jVar);
        }
        if (Order.class.isAssignableFrom(rawType)) {
            return Order.typeAdapter(jVar);
        }
        if (OrderProviderField.class.isAssignableFrom(rawType)) {
            return OrderProviderField.typeAdapter(jVar);
        }
        if (PadalaCreateTransfer.class.isAssignableFrom(rawType)) {
            return PadalaCreateTransfer.typeAdapter(jVar);
        }
        if (PadalaTransfer.class.isAssignableFrom(rawType)) {
            return PadalaTransfer.typeAdapter(jVar);
        }
        if (PayId.class.isAssignableFrom(rawType)) {
            return PayId.typeAdapter(jVar);
        }
        if (PayMayaError.class.isAssignableFrom(rawType)) {
            return PayMayaError.typeAdapter(jVar);
        }
        if (PrivacyPolicy.class.isAssignableFrom(rawType)) {
            return PrivacyPolicy.typeAdapter(jVar);
        }
        if (Product.class.isAssignableFrom(rawType)) {
            return Product.typeAdapter(jVar);
        }
        if (ProductProviderDetails.class.isAssignableFrom(rawType)) {
            return ProductProviderDetails.typeAdapter(jVar);
        }
        if (ProductProviderField.class.isAssignableFrom(rawType)) {
            return ProductProviderField.typeAdapter(jVar);
        }
        if (ProductType.class.isAssignableFrom(rawType)) {
            return ProductType.typeAdapter(jVar);
        }
        if (Profile.class.isAssignableFrom(rawType)) {
            return Profile.typeAdapter(jVar);
        }
        if (ProfileBadgesConfig.class.isAssignableFrom(rawType)) {
            return ProfileBadgesConfig.typeAdapter(jVar);
        }
        if (PullFundsCard.class.isAssignableFrom(rawType)) {
            return PullFundsCard.typeAdapter(jVar);
        }
        if (PullFundsConfig.class.isAssignableFrom(rawType)) {
            return PullFundsConfig.typeAdapter(jVar);
        }
        if (PullFundsPartner.class.isAssignableFrom(rawType)) {
            return PullFundsPartner.typeAdapter(jVar);
        }
        if (PurchasedTicket.class.isAssignableFrom(rawType)) {
            return PurchasedTicket.typeAdapter(jVar);
        }
        if (PushToken.class.isAssignableFrom(rawType)) {
            return PushToken.typeAdapter(jVar);
        }
        if (QRMerchant.class.isAssignableFrom(rawType)) {
            return QRMerchant.typeAdapter(jVar);
        }
        if (QRRecipient.class.isAssignableFrom(rawType)) {
            return QRRecipient.typeAdapter(jVar);
        }
        if (RedirectUrls.class.isAssignableFrom(rawType)) {
            return RedirectUrls.typeAdapter(jVar);
        }
        if (ReferralCode.class.isAssignableFrom(rawType)) {
            return ReferralCode.typeAdapter(jVar);
        }
        if (ReferralMechanicsConfig.class.isAssignableFrom(rawType)) {
            return ReferralMechanicsConfig.typeAdapter(jVar);
        }
        if (Region.class.isAssignableFrom(rawType)) {
            return Region.typeAdapter(jVar);
        }
        if (Registration.class.isAssignableFrom(rawType)) {
            return Registration.typeAdapter(jVar);
        }
        if (Route.class.isAssignableFrom(rawType)) {
            return Route.typeAdapter(jVar);
        }
        if (ScheduledNotification.class.isAssignableFrom(rawType)) {
            return ScheduledNotification.typeAdapter(jVar);
        }
        if (SecondaryFeature.class.isAssignableFrom(rawType)) {
            return SecondaryFeature.typeAdapter(jVar);
        }
        if (SendMoneyConfig.class.isAssignableFrom(rawType)) {
            return SendMoneyConfig.typeAdapter(jVar);
        }
        if (ServiceAvailabilityConfig.class.isAssignableFrom(rawType)) {
            return ServiceAvailabilityConfig.typeAdapter(jVar);
        }
        if (SettingsDisplayName.class.isAssignableFrom(rawType)) {
            return SettingsDisplayName.typeAdapter(jVar);
        }
        if (SevenElevenPushNotification.class.isAssignableFrom(rawType)) {
            return SevenElevenPushNotification.typeAdapter(jVar);
        }
        if (ShopCategory.class.isAssignableFrom(rawType)) {
            return ShopCategory.typeAdapter(jVar);
        }
        if (ShopCategoryBase.class.isAssignableFrom(rawType)) {
            return ShopCategoryBase.typeAdapter(jVar);
        }
        if (ShopConfig.class.isAssignableFrom(rawType)) {
            return ShopConfig.typeAdapter(jVar);
        }
        if (ShopHome.class.isAssignableFrom(rawType)) {
            return ShopHome.typeAdapter(jVar);
        }
        if (ShopPurchaseHistory.class.isAssignableFrom(rawType)) {
            return ShopPurchaseHistory.typeAdapter(jVar);
        }
        if (ShopPurchaseHistoryBase.class.isAssignableFrom(rawType)) {
            return ShopPurchaseHistoryBase.typeAdapter(jVar);
        }
        if (ShopPurchaseHistoryPushNotification.class.isAssignableFrom(rawType)) {
            return ShopPurchaseHistoryPushNotification.typeAdapter(jVar);
        }
        if (Stop.class.isAssignableFrom(rawType)) {
            return Stop.typeAdapter(jVar);
        }
        if (SubmitEkycReference.class.isAssignableFrom(rawType)) {
            return SubmitEkycReference.typeAdapter(jVar);
        }
        if (Success.class.isAssignableFrom(rawType)) {
            return Success.typeAdapter(jVar);
        }
        if (Term.class.isAssignableFrom(rawType)) {
            return Term.typeAdapter(jVar);
        }
        if (TicketPurchaseAmount.class.isAssignableFrom(rawType)) {
            return TicketPurchaseAmount.typeAdapter(jVar);
        }
        if (TicketPurchaseAmountDetails.class.isAssignableFrom(rawType)) {
            return TicketPurchaseAmountDetails.typeAdapter(jVar);
        }
        if (TicketPurchaseConfirmation.class.isAssignableFrom(rawType)) {
            return TicketPurchaseConfirmation.typeAdapter(jVar);
        }
        if (TicketPurchaseIssuer.class.isAssignableFrom(rawType)) {
            return TicketPurchaseIssuer.typeAdapter(jVar);
        }
        if (Transaction.class.isAssignableFrom(rawType)) {
            return Transaction.typeAdapter(jVar);
        }
        if (TransactionDetail.class.isAssignableFrom(rawType)) {
            return TransactionDetail.typeAdapter(jVar);
        }
        if (Transfer.class.isAssignableFrom(rawType)) {
            return Transfer.typeAdapter(jVar);
        }
        if (TransferAppLink.class.isAssignableFrom(rawType)) {
            return TransferAppLink.typeAdapter(jVar);
        }
        if (TransferEntity.class.isAssignableFrom(rawType)) {
            return TransferEntity.typeAdapter(jVar);
        }
        if (TransferRecipient.class.isAssignableFrom(rawType)) {
            return TransferRecipient.typeAdapter(jVar);
        }
        if (TransferSender.class.isAssignableFrom(rawType)) {
            return TransferSender.typeAdapter(jVar);
        }
        if (TransferTarget.class.isAssignableFrom(rawType)) {
            return TransferTarget.typeAdapter(jVar);
        }
        if (TransferToken.class.isAssignableFrom(rawType)) {
            return TransferToken.typeAdapter(jVar);
        }
        if (UIComponent.class.isAssignableFrom(rawType)) {
            return UIComponent.typeAdapter(jVar);
        }
        if (UIValue.class.isAssignableFrom(rawType)) {
            return UIValue.typeAdapter(jVar);
        }
        if (UpgradePlus.class.isAssignableFrom(rawType)) {
            return UpgradePlus.typeAdapter(jVar);
        }
        if (UpgradePlusReference.class.isAssignableFrom(rawType)) {
            return UpgradePlusReference.typeAdapter(jVar);
        }
        if (User.class.isAssignableFrom(rawType)) {
            return User.typeAdapter(jVar);
        }
        if (UserActivity.class.isAssignableFrom(rawType)) {
            return UserActivity.typeAdapter(jVar);
        }
        if (UserProfileConfig.class.isAssignableFrom(rawType)) {
            return UserProfileConfig.typeAdapter(jVar);
        }
        if (Validation.class.isAssignableFrom(rawType)) {
            return Validation.typeAdapter(jVar);
        }
        if (VaultedCard.class.isAssignableFrom(rawType)) {
            return VaultedCard.typeAdapter(jVar);
        }
        if (VerifyLoans.class.isAssignableFrom(rawType)) {
            return VerifyLoans.typeAdapter(jVar);
        }
        if (Voucher.class.isAssignableFrom(rawType)) {
            return Voucher.typeAdapter(jVar);
        }
        if (VoucherBase.class.isAssignableFrom(rawType)) {
            return VoucherBase.typeAdapter(jVar);
        }
        if (VoucherDenomination.class.isAssignableFrom(rawType)) {
            return VoucherDenomination.typeAdapter(jVar);
        }
        if (VoucherNotificationSettings.class.isAssignableFrom(rawType)) {
            return VoucherNotificationSettings.typeAdapter(jVar);
        }
        if (VoucherRedeemTransaction.class.isAssignableFrom(rawType)) {
            return VoucherRedeemTransaction.typeAdapter(jVar);
        }
        if (WesternUnionTransaction.class.isAssignableFrom(rawType)) {
            return WesternUnionTransaction.typeAdapter(jVar);
        }
        if (WhitelistedLoan.class.isAssignableFrom(rawType)) {
            return WhitelistedLoan.typeAdapter(jVar);
        }
        if (WorkNature.class.isAssignableFrom(rawType)) {
            return WorkNature.typeAdapter(jVar);
        }
        return null;
    }
}
