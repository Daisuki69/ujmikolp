package com.paymaya.data.api;

import Ah.a;
import Ah.d;
import Ah.p;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.AccountLimits;
import com.paymaya.domain.model.AccountUsage;
import com.paymaya.domain.model.AlternativeContact;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerCategory;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerV3Response;
import com.paymaya.domain.model.BillersPagedListV3Response;
import com.paymaya.domain.model.BlockReason;
import com.paymaya.domain.model.ChangeMin;
import com.paymaya.domain.model.Config;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.ContactReferenceData;
import com.paymaya.domain.model.ContactReferencePatchRequest;
import com.paymaya.domain.model.ContactReferencePatchResponse;
import com.paymaya.domain.model.Country;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditApplication;
import com.paymaya.domain.model.CreditBillingStatement;
import com.paymaya.domain.model.CreditConsent;
import com.paymaya.domain.model.CreditContactReferenceResponse;
import com.paymaya.domain.model.CreditDisbursementCalculatedFees;
import com.paymaya.domain.model.CreditEligibility;
import com.paymaya.domain.model.CreditScore;
import com.paymaya.domain.model.CreditServiceFee;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.CreditTransaction;
import com.paymaya.domain.model.CustomerAccessToken;
import com.paymaya.domain.model.CustomerAccount;
import com.paymaya.domain.model.DecoratedActivity;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.DeviceExtract;
import com.paymaya.domain.model.DeviceInformationResponse;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.model.EDDSettings;
import com.paymaya.domain.model.Ekyc;
import com.paymaya.domain.model.EkycAccountType;
import com.paymaya.domain.model.FileUrl;
import com.paymaya.domain.model.FinancialDocument;
import com.paymaya.domain.model.IdOcr;
import com.paymaya.domain.model.IdOcrAsync;
import com.paymaya.domain.model.IdentificationType;
import com.paymaya.domain.model.IncomeSource;
import com.paymaya.domain.model.LightData;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.LoanInstance;
import com.paymaya.domain.model.LoanProductDetails;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.MFAChallengeVerificationResult;
import com.paymaya.domain.model.MissionBase;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Base;
import com.paymaya.domain.model.MoneyInCode;
import com.paymaya.domain.model.MoneyInTopUpCode;
import com.paymaya.domain.model.Nationality;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.Operator;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PayId;
import com.paymaya.domain.model.PlayMayaWebViewParameters;
import com.paymaya.domain.model.Product;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import com.paymaya.domain.model.Profile;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.PushToken;
import com.paymaya.domain.model.RecommendationResponse;
import com.paymaya.domain.model.Registration;
import com.paymaya.domain.model.Restriction;
import com.paymaya.domain.model.Restrictions;
import com.paymaya.domain.model.Route;
import com.paymaya.domain.model.SavingsConsent;
import com.paymaya.domain.model.SettingsDisplayName;
import com.paymaya.domain.model.ShopCategory;
import com.paymaya.domain.model.ShopCategoryBase;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopProviderCategoryBase;
import com.paymaya.domain.model.ShopProviderSubcategoryBase;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import com.paymaya.domain.model.ShopPurchaseOfficialReceipt;
import com.paymaya.domain.model.SubmitEkycReference;
import com.paymaya.domain.model.Success;
import com.paymaya.domain.model.ThirdPartyMerchantWebViewParameters;
import com.paymaya.domain.model.TicketPurchaseConfirmation;
import com.paymaya.domain.model.UpgradePlus;
import com.paymaya.domain.model.UpgradePlusReference;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.model.Validation;
import com.paymaya.domain.model.VerifyLoans;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherBase;
import com.paymaya.domain.model.VoucherRedeemTransaction;
import com.paymaya.domain.model.WesternUnionTransaction;
import com.paymaya.domain.model.WhitelistedLoan;
import com.paymaya.domain.model.WorkNature;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes3.dex */
public interface PayMayaClientApi {
    @POST("v1/cards/block/{fundSourceID}")
    p<Success> blockCard(@Path("fundSourceID") String str, @Body RequestBody requestBody);

    @POST("api/v1/disbursement/calculate")
    p<CreditDisbursementCalculatedFees> calculateDisbursementFees(@Body RequestBody requestBody);

    @PUT("v1/accounts/password")
    p<Success> changePassword(@Body RequestBody requestBody);

    @POST("v3/orders")
    p<Order> createPurchaseOrder(@Body RequestBody requestBody);

    @POST("v2/client_vouchers/redeem")
    p<VoucherRedeemTransaction> createRedeemVoucher(@Body RequestBody requestBody);

    @POST("v1/transport/tickets")
    p<TicketPurchaseConfirmation> createTicketPurchase(@Body RequestBody requestBody);

    @DELETE("v1/push/tokens")
    a deregisterPushToken();

    @POST("v2/missions/enter_code")
    p<MissionV2> enterMissionCode(@Body RequestBody requestBody);

    @PUT("v3/orders/{orderTokenId}/execute")
    p<Order> executePurchaseOrder(@Path("orderTokenId") String str);

    @PUT("v2/client_vouchers/redeem/{redeem_voucher_id}/execute")
    p<VoucherRedeemTransaction> executeRedeemVoucher(@Path("redeem_voucher_id") String str);

    @PUT("v1/transport/tickets/{ticket_purchase_id}/purchase")
    p<PurchasedTicket> executeTicketPurchase(@Path("ticket_purchase_id") String str);

    @PUT("v1/top_up/wu/execute/{transaction_number}")
    p<WesternUnionTransaction> executeWUTransaction(@Path("transaction_number") String str, @Body RequestBody requestBody);

    @GET("v1/accounts/limit")
    p<AccountLimits> getAccountLimits();

    @GET("v1/customers/account/restrictions")
    p<List<Restriction>> getAccountRestrictions();

    @GET("v1/usages")
    p<List<AccountUsage>> getAccountUsages();

    @HEAD("v1/usages")
    @Headers({"Connection: close"})
    p<Response<Void>> getAccountUsagesHead();

    @GET("v1/action_cards/recommendations")
    p<RecommendationResponse> getActionCardRecommendations(@Query("size") int i);

    @HEAD("v1/action_cards/recommendations")
    @Headers({"Connection: close"})
    p<Response<Void>> getActionCardRecommendationsHead();

    @GET("v1/activities")
    p<List<UserActivity>> getActivities(@QueryMap Map<String, String> map);

    @GET("v1/activities/{activityId}")
    p<UserActivity> getActivityDetails(@Path("activityId") String str);

    @GET("v1/app_settings")
    p<Config> getAppSettings();

    @HEAD("v1/app_settings")
    @Headers({"Connection: close"})
    p<Response<Void>> getAppSettingsHead();

    @GET("v1/accounts/balance")
    p<AccountBalance> getBalance();

    @GET("v1/billers/{slug}")
    p<BillerDetails> getBillerDetailsNoFilter(@Path("slug") String str);

    @GET("v3/billers/{slug}")
    p<BillerV3Response> getBillerDetailsV3(@Path("slug") String str, @QueryMap Map<String, String> map);

    @GET("v1/billers/{slug}")
    p<Biller> getBillersDetails(@Path("slug") String str, @QueryMap Map<String, String> map);

    @GET("v2/billers")
    p<List<Biller>> getBillersListSearchAPI(@QueryMap Map<String, String> map);

    @GET("v3/billers")
    p<BillersPagedListV3Response> getBillersListV3(@QueryMap Map<String, String> map);

    @GET("v1/reasons")
    p<List<BlockReason>> getBlockReasons();

    @GET("v1/catalogue/categories")
    p<List<ShopCategory>> getCategories();

    @GET("v2/billers/categories/{slug}")
    p<List<Biller>> getCategoryBillerList(@Path("slug") String str, @QueryMap Map<String, String> map);

    @GET("v1/catalogue/categories/{categoryId}")
    p<ShopCategory> getCategoryDetails(@Path("categoryId") String str);

    @GET("v2/billers/categories")
    p<List<BillerCategory>> getCategoryList(@QueryMap Map<String, String> map);

    @GET("v1/privacy_policy/consents")
    p<List<Consent>> getConsent();

    @GET("v1/mayacredits/customers/contactReference")
    p<ContactReferenceData> getContactReference();

    @GET("v1/countries")
    p<List<Country>> getCountries();

    @HEAD("v1/countries")
    @Headers({"Connection: close"})
    p<Response<Void>> getCountryHead();

    @GET("v1/mayacredits/accounts/{id}")
    p<CreditAccount> getCreditAccount(@Path(TtmlNode.ATTR_ID) String str);

    @GET("v1/mayacredits/applications/current")
    p<CreditApplication> getCreditApplication();

    @GET("v1/mayacredits/accounts/{accountId}/statements/current")
    p<Response<CreditBillingStatement>> getCreditBillingStatement(@Path("accountId") String str);

    @GET("v1/mayacredits/accounts/{accountId}/statements/{statementId}/file/url")
    p<FileUrl> getCreditBillingStatementFile(@Path("accountId") String str, @Path("statementId") String str2);

    @GET("v1/mayacredits/customers/contactReference")
    p<CreditContactReferenceResponse> getCreditContactReference();

    @GET("v1/mayacredits/customers/creditScore")
    p<CreditScore> getCreditScore();

    @GET("v1/mayacredits/customers/feeRate")
    p<CreditServiceFee> getCreditServiceFee();

    @GET("v1/mayacredits/customers/accounts/{accountId}/transactions")
    p<CreditTransaction> getCreditTransactions(@Path("accountId") String str, @QueryMap Map<String, String> map);

    @GET("auth/v1/accesstoken/customer/{audience}")
    p<CustomerAccessToken> getCustomerAccessToken(@Path("audience") String str);

    @GET("v1/customers/account")
    p<CustomerAccount> getCustomerAccountDetails();

    @GET("v1/customers/restrictions")
    p<Restrictions> getCustomerRestrictions(@QueryMap Map<String, String> map);

    @GET("v1/decorations/transactions")
    p<DecoratedActivity> getDecoratedActivity(@QueryMap Map<String, String> map);

    @GET("v2/decorations/transactions")
    p<DecoratedActivity> getDecoratedActivityV2(@QueryMap Map<String, String> map);

    @GET("v2/decorations/transactions/{transactionId}")
    p<DecoratedActivity> getDecoratedTransactionById(@Path("transactionId") String str);

    @GET("v1/decorations/{decorationId}")
    p<Decoration> getDecorationById(@Path("decorationId") String str, @QueryMap Map<String, String> map);

    @GET("v1/decorations")
    p<List<Decoration>> getDecorations(@QueryMap Map<String, String> map);

    @GET("v1/devices")
    p<DeviceInformationResponse> getDevices(@HeaderMap Map<String, String> map);

    @GET("v1/account_types")
    p<List<EkycAccountType>> getEkycAccountTypes();

    @HEAD("v1/account_types")
    @Headers({"Connection: close"})
    p<Response<Void>> getEkycAccountTypesHead();

    @GET("v3/cards/plus")
    p<Ekyc> getEkycApplicationInfo();

    @GET("v4/cards/plus")
    p<Ekyc> getEkycApplicationInfoV4();

    @GET("v1/kyc/submissions")
    p<Ekyc> getEkycApplicationInfoV5();

    @GET("v1/cards/plus/latest")
    p<Ekyc> getEkycLatestSubmission();

    @POST("v1/mayacredits/customers/applications/eligible")
    p<CreditEligibility> getEligibilityAndCreditScore(@Body RequestBody requestBody);

    @GET("v1/merchants")
    p<List<OnlinePayment>> getFeaturedMerchants(@QueryMap Map<String, String> map);

    @HEAD("v1/merchants")
    @Headers({"Connection: close"})
    p<Response<Void>> getFeaturedMerchantsHead();

    @GET("v1/financial_doc_types")
    p<List<FinancialDocument>> getFinancialDocuments();

    @HEAD("v1/financial_doc_types")
    @Headers({"Connection: close"})
    p<Response<Void>> getFinancialDocumentsHead();

    @GET("v1/kyc/id_ocr/{id}")
    p<IdOcr> getIdOcrAsync(@Path(TtmlNode.ATTR_ID) String str);

    @GET("v1/identification_types")
    p<List<IdentificationType>> getIdentificationTypes();

    @HEAD("v1/identification_types")
    @Headers({"Connection: close"})
    p<Response<Void>> getIdentificationTypesHead();

    @HEAD("v1/income_sources")
    @Headers({"Connection: close"})
    p<Response<Void>> getIncomeSourceHead();

    @HEAD("v2/income_sources")
    @Headers({"Connection: close"})
    p<Response<Void>> getIncomeSourceV2Head();

    @GET("v1/income_sources")
    p<List<IncomeSource>> getIncomeSources();

    @GET("v2/income_sources")
    p<List<IncomeSource>> getIncomeSourcesV2();

    @GET("v1/kyc_settings")
    p<List<EDDSettings>> getKYCSettings();

    @HEAD("v1/kyc_settings")
    @Headers({"Connection: close"})
    p<Response<Void>> getKYCSettingsHead();

    @POST("v1/kyc/faceauth/lightdata")
    p<LightData> getLightData(@Body RequestBody requestBody);

    @GET("v1/topup/partners/{partnerID}")
    p<LoadUpPartner> getLoadUpPartner(@Path("partnerID") String str);

    @GET("v1/topup/partners")
    p<List<LoadUpPartner>> getLoadUpPartners();

    @GET("v1/loans/instances")
    p<List<LoanInstance>> getLoanInstances();

    @GET("v1/loans/products/{product_key}")
    p<LoanProductDetails> getLoanProductDetails(@Path("product_key") String str, @QueryMap Map<String, String> map);

    @GET("v1/mayacredits/consents")
    p<List<CreditConsent>> getMayaCreditConsents();

    @GET("v1/mayacredits/eligibility")
    p<CreditEligibility> getMayaCreditEligibility();

    @GET("v1/mayacredits/terms")
    p<CreditTerm> getMayaCreditTerms();

    @GET("v1/merchants/{merchant_id}")
    p<OnlinePayment> getMerchant(@Path("merchant_id") String str);

    @GET("v2/missions/{mission_id}")
    p<MissionV2> getMissionDetails(@Path("mission_id") String str, @QueryMap Map<String, String> map);

    @GET("v1/missions")
    p<MissionBase> getMissions(@QueryMap Map<String, String> map);

    @GET("v2/missions")
    p<MissionV2Base> getMissionsV2(@QueryMap Map<String, String> map);

    @POST("v1/alias/moneyin")
    p<MoneyInCode> getMoneyInCode(@Body RequestBody requestBody);

    @POST("v1/topup/code")
    p<MoneyInTopUpCode> getMoneyInTopUp(@Body RequestBody requestBody);

    @GET("v1/nationalities")
    p<List<Nationality>> getNationalities();

    @HEAD("v1/nationalities")
    @Headers({"Connection: close"})
    p<Response<Void>> getNationalityHead();

    @GET("v1/transport/operators")
    p<List<Operator>> getOperators();

    @GET("v1/webview/parameters/playmaya")
    p<PlayMayaWebViewParameters> getPlayMayaWebViewParameters();

    @GET("v2/catalogue/products/{productId}")
    p<Product> getProductV2(@Path("productId") String str, @QueryMap Map<String, String> map);

    @GET("v2/catalogue/products/{productId}")
    p<ProductV3> getProductV3Details(@Path("productId") String str, @QueryMap Map<String, String> map);

    @HEAD("v2/catalogue/products")
    @Headers({"Connection: close"})
    p<Response<Void>> getProductsHead();

    @GET("v2/catalogue/products?sort=priority,amount")
    d<List<Product>> getProductsV2(@QueryMap Map<String, String> map);

    @GET("v2/catalogue/products")
    p<ProductV3Base> getProductsV3(@QueryMap Map<String, String> map);

    @GET("v1/accounts/profile")
    p<Profile> getProfile();

    @GET("v3/orders/receipt/{orderReferenceNumber}")
    p<ShopPurchaseOfficialReceipt> getPurchaseOfficialReceipt(@Path("orderReferenceNumber") String str);

    @GET("v3/orders/{orderTokenId}")
    p<Order> getPurchaseOrderStatus(@Path("orderTokenId") String str);

    @GET("v1/transport/routes")
    p<List<Route>> getRoutes(@Query("operator") String str);

    @GET("v1/settings/{type}")
    p<SettingsDisplayName> getSettingsByType(@Path(SessionDescription.ATTR_TYPE) String str);

    @POST("v1/pay-ids/7eleven")
    p<PayId> getSevenElevenPayID(@Body RequestBody requestBody);

    @POST("v2/pay-ids/7eleven")
    p<PayId> getSevenElevenPayIDV2(@Body RequestBody requestBody);

    @GET("v2/catalogue/categories")
    p<ShopCategoryBase> getShopCategoriesV2();

    @GET("v2/catalogue/providers/categories")
    p<ShopProviderCategoryBase> getShopCategoriesV3(@QueryMap Map<String, String> map);

    @HEAD("v2/catalogue/providers/categories")
    @Headers({"Connection: close"})
    p<Response<Void>> getShopCategoriesV3Head();

    @GET("v2/catalogue/providers/{providerName}/subcategories")
    p<ShopProviderSubcategoryBase> getShopProviderSubcategories(@Path("providerName") String str);

    @GET("v2/catalogue/providers")
    p<ShopProviderBase> getShopProviders(@QueryMap Map<String, String> map);

    @HEAD("v2/catalogue/providers")
    @Headers({"Connection: close"})
    p<Response<Void>> getShopProvidersCategoryHead(@QueryMap Map<String, String> map);

    @HEAD("v2/catalogue/providers")
    @Headers({"Connection: close"})
    p<Response<Void>> getShopProvidersV3Head();

    @GET("v3/orders")
    p<ShopPurchaseHistoryBase> getShopPurchaseHistory(@QueryMap Map<String, String> map);

    @HEAD("v3/orders")
    @Headers({"Connection: close"})
    p<Response<Void>> getShopPurchaseHistoryHead();

    @GET("v1/webview/parameters/third-party-merchant/{thirdPartyMerchant}")
    p<ThirdPartyMerchantWebViewParameters> getThirdPartyMerchantWebViewParameters(@Path("thirdPartyMerchant") String str);

    @GET("v2/webview/parameters/third-party-merchant/{thirdPartyMerchant}")
    p<ThirdPartyMerchantWebViewParameters> getThirdPartyMerchantWebViewParametersV2(@Path("thirdPartyMerchant") String str);

    @GET("v1/transport/tickets/rrn/{request_reference_no}")
    p<PurchasedTicket> getTicketDetails(@Path("request_reference_no") String str);

    @HEAD("v1/topup/partners")
    @Headers({"Connection: close"})
    p<Response<Void>> getTopUpPartnersHead();

    @GET("v1/cards/plus")
    p<UpgradePlus> getUpgradePlusApplication();

    @GET("v1/consents")
    p<List<Consent>> getUserConsent();

    @GET("v1/validations")
    p<List<Validation>> getValidations();

    @HEAD("v1/validations")
    @Headers({"Connection: close"})
    p<Response<Void>> getValidationsHead();

    @GET("v2/client_vouchers/{voucher_code}")
    p<Voucher> getVoucherDetails(@Path("voucher_code") String str, @QueryMap Map<String, String> map);

    @GET("v2/client_vouchers")
    p<VoucherBase> getVouchers(@QueryMap Map<String, String> map);

    @GET("v1/loans/whitelist")
    p<List<WhitelistedLoan>> getWhitelistedLoans();

    @HEAD("v1/work_natures")
    @Headers({"Connection: close"})
    p<Response<Void>> getWorkNatureHead();

    @HEAD("v2/work_natures")
    @Headers({"Connection: close"})
    p<Response<Void>> getWorkNatureV2Head();

    @GET("v1/work_natures")
    p<List<WorkNature>> getWorkNatures();

    @GET("v2/work_natures")
    p<List<WorkNature>> getWorkNaturesV2();

    @POST("v5/sessions")
    p<Profile> loginV5(@Body RequestBody requestBody, @HeaderMap Map<String, String> map);

    @PATCH("v1/mayacredits/customers/contactReference")
    p<ContactReferencePatchResponse> patchContactReference(@Body ContactReferencePatchRequest contactReferencePatchRequest);

    @POST("v1/mayacredits/consents")
    a postMayaCreditOptIn(@Body RequestBody requestBody);

    @POST("v2/orders")
    p<Order> postOrdersV2(@Body RequestBody requestBody);

    @POST("v1/loans/instances/verify")
    p<VerifyLoans> postVerifyLoans(@Body RequestBody requestBody);

    @PUT("v1/sessions/refresh")
    p<Success> refreshToken();

    @POST("v2/accounts/register")
    p<Registration> register(@Body RequestBody requestBody, @HeaderMap Map<String, String> map);

    @POST("v1/push/tokens")
    a registerPushToken(@Body PushToken pushToken);

    @POST("v1/identity/auth")
    p<OTP> requestChangeIdentity(@Body RequestBody requestBody);

    @POST("v1/identity/auth/verify")
    p<ChangeMin> requestChangeIdentityVerify(@Body RequestBody requestBody);

    @POST("v1/mayacredits/applications/resend")
    a resendCreditVerification(@Body RequestBody requestBody);

    @POST("v1/loans/instances/otp/resend")
    p<Response<Void>> resendLoanOTP(@Body RequestBody requestBody);

    @GET("v1/mfa/challenges/{challenge_id}/resend")
    p<MFAChallengeInformation> resendMFAChallenge(@Path("challenge_id") String str);

    @POST("v1/otp/resend")
    p<OTP> resendOTP(@Body RequestBody requestBody);

    @POST("v1/otp/{transaction_type}/resend")
    p<OTP> resendOTPByTransactionType(@Path("transaction_type") String str, @Body RequestBody requestBody);

    @POST("v1/cards/plus/reference_id/resend")
    p<UpgradePlusReference> resendReferenceId(@Body RequestBody requestBody);

    @POST("v1/accounts/vcode/resend")
    p<Registration> resendVerification(@Body RequestBody requestBody);

    @PUT("v3/orders/events/reset")
    p<Response<Void>> resetOrdersPurchaseHistory();

    @POST("v1/devicedata")
    p<DeviceExtract> sendExtractedData(@HeaderMap HashMap<String, String> map, @Body RequestBody requestBody);

    @POST("v1/accounts/email/verify")
    a sendRecoveryEmail();

    @POST("v3/accounts/verify")
    p<Profile> shieldVerify(@Body RequestBody requestBody, @HeaderMap Map<String, String> map);

    @DELETE("v1/sessions")
    a signOut();

    @POST("v1/mfa/challenges/{transaction_type}/{challenge_id}/start")
    p<MFAChallengeInformation> startMFAChallenge(@Path("transaction_type") String str, @Path("challenge_id") String str2, @Body RequestBody requestBody);

    @POST("v1/mayacredits/applications")
    p<OTP> submitCreditApplication(@Body RequestBody requestBody);

    @POST("v1/mayacredits/disbursements")
    a submitCreditTransfer(@Header("Request-Reference-No") String str, @Body RequestBody requestBody);

    @POST("v1/edd")
    p<UpgradePlusReference> submitEDDInformation(@Body EDD edd);

    @POST("v1/kyc/id_ocr")
    p<IdOcrAsync> submitIdOcrAsync(@Body RequestBody requestBody);

    @POST("v3/cards/plus")
    p<SubmitEkycReference> submitKycApplication(@Body Ekyc ekyc);

    @POST("v4/cards/plus")
    p<SubmitEkycReference> submitKycApplicationV4(@Body Ekyc ekyc);

    @POST("v1/kyc/submissions")
    p<SubmitEkycReference> submitKycApplicationV5(@Body Ekyc ekyc);

    @POST("v1/kyc/faceauth/livedata")
    p<Response<Void>> submitLiveData(@Body RequestBody requestBody);

    @POST("v1/loans/instances")
    p<OTP> submitLoanInstanceOTP(@Body RequestBody requestBody);

    @POST("v2/consents/mayasavings")
    a submitSavingsConsent(@Body List<SavingsConsent> list);

    @POST("v1/cards/plus")
    @Multipart
    p<UpgradePlusReference> submitUpgradePlusApplication(@PartMap Map<String, RequestBody> map, @Part MultipartBody.Part part);

    @PUT("v1/consents")
    p<List<Consent>> updateConsent(@Body RequestBody requestBody);

    @POST("v1/identity/update")
    p<OTP> updateNewIdentity(@Body ChangeMin changeMin);

    @POST("v1/identity/update/verify")
    a updateNewIdentityVerify(@Body RequestBody requestBody);

    @POST("v1/identity/update_via_email/{otp_id}")
    p<AlternativeContact> updateNewIdentityViaEmail(@Path("otp_id") String str, @Body RequestBody requestBody);

    @POST("v1/cards/pin")
    p<Success> updatePin(@Body RequestBody requestBody);

    @PUT("v1/accounts/profile")
    p<Profile> updateProfile(@Body RequestBody requestBody);

    @POST("v1/settings/{type}")
    a updateSettingsByType(@Path(SessionDescription.ATTR_TYPE) String str, @Body RequestBody requestBody);

    @POST("v1/top_up/wu/validate")
    p<WesternUnionTransaction> validateMtcn(@Body RequestBody requestBody);

    @POST("v1/password/validate")
    a validatePassword(@Body RequestBody requestBody);

    @POST("v1/mayacredits/customers/applications/verify")
    a verifyCreditApplicationWithCreditScore(@Body RequestBody requestBody);

    @POST("v1/mfa/challenges/{transaction_type}/{challenge_id}/verify")
    p<MFAChallengeVerificationResult> verifyMFAChallenge(@Path("transaction_type") String str, @Path("challenge_id") String str2, @Body RequestBody requestBody);

    @POST("v1/otp/verify")
    p<Profile> verifyOTP(@Body RequestBody requestBody);
}
