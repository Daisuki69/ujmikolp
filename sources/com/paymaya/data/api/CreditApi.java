package com.paymaya.data.api;

import Ah.a;
import Ah.p;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.ContactReferenceData;
import com.paymaya.domain.model.ContactReferencePatchRequest;
import com.paymaya.domain.model.ContactReferencePatchResponse;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditAgreements;
import com.paymaya.domain.model.CreditApplication;
import com.paymaya.domain.model.CreditBillingStatement;
import com.paymaya.domain.model.CreditConsent;
import com.paymaya.domain.model.CreditContactReferenceResponse;
import com.paymaya.domain.model.CreditDisbursementCalculatedFees;
import com.paymaya.domain.model.CreditEligibility;
import com.paymaya.domain.model.CreditInitialEligibility;
import com.paymaya.domain.model.CreditServiceFee;
import com.paymaya.domain.model.CreditTransaction;
import com.paymaya.domain.model.CreditWalletBanner;
import com.paymaya.domain.model.FileUrl;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PersonalDetailsData;
import com.paymaya.domain.model.PersonalDetailsPatchRequest;
import com.paymaya.domain.model.PersonalDetailsPatchResponse;
import com.paymaya.domain.model.RiskChallenge;
import java.util.List;
import java.util.Map;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes3.dex */
public interface CreditApi {
    @POST("api/v1/disbursement/calculate")
    p<CreditDisbursementCalculatedFees> calculateDisbursementFees(@HeaderMap Map<String, String> map, @Body RequestBody requestBody);

    @GET("api/v1/customers/contact-reference")
    p<CreditContactReferenceResponse> getContactReference(@HeaderMap Map<String, String> map);

    @GET("api/v1/customers/contact-reference")
    p<ContactReferenceData> getContactReferenceData(@HeaderMap Map<String, String> map);

    @GET("api/v1/accounts/{id}")
    p<CreditAccount> getCreditAccount(@HeaderMap Map<String, String> map, @Path(TtmlNode.ATTR_ID) String str);

    @GET("api/v1/applications/current")
    p<CreditApplication> getCreditApplication(@HeaderMap Map<String, String> map);

    @GET("api/v1/accounts/{accountId}/statements/current")
    p<Response<CreditBillingStatement>> getCreditBillingStatement(@HeaderMap Map<String, String> map, @Path("accountId") String str);

    @GET("api/v1/accounts/{accountId}/statements/{statementId}/file/url")
    p<FileUrl> getCreditBillingStatementFile(@HeaderMap Map<String, String> map, @Path("accountId") String str, @Path("statementId") String str2);

    @GET("api/v1/customers/fee-rate")
    p<CreditServiceFee> getCreditServiceFee(@HeaderMap Map<String, String> map);

    @GET("api/v1/accounts/{accountId}/transactions")
    p<CreditTransaction> getCreditTransactions(@HeaderMap Map<String, String> map, @Path("accountId") String str, @QueryMap Map<String, String> map2);

    @GET("api/v1/wallet-banner")
    p<CreditWalletBanner> getCreditWalletBanner(@HeaderMap Map<String, String> map);

    @POST("api/v1/customers/applications/eligible")
    p<CreditEligibility> getEligibilityAndCreditScore(@HeaderMap Map<String, String> map, @Body RequestBody requestBody);

    @GET("api/v1/customers/applications/eligible/terms-agreements")
    p<CreditAgreements> getEligibilityTermsAndAgreements(@HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

    @POST("api/v1/customers/applications/eligible/initial")
    p<CreditInitialEligibility> getInitialEligibility(@Body RequestBody requestBody);

    @GET("api/v1/consents")
    p<List<CreditConsent>> getMayaCreditConsents(@HeaderMap Map<String, String> map);

    @GET("api/v1/customers")
    p<PersonalDetailsData> getPersonalDetails(@HeaderMap Map<String, String> map);

    @POST("api/v1/risk-challenge")
    p<RiskChallenge> getRiskChallenge(@HeaderMap Map<String, String> map, @Body RequestBody requestBody);

    @PATCH("api/v1/customers/contact-reference")
    p<ContactReferencePatchResponse> patchContactReference(@HeaderMap Map<String, String> map, @Body ContactReferencePatchRequest contactReferencePatchRequest);

    @PATCH("api/v1/customers")
    p<PersonalDetailsPatchResponse> patchPersonalDetails(@HeaderMap Map<String, String> map, @Body PersonalDetailsPatchRequest personalDetailsPatchRequest);

    @POST("api/v1/consents")
    a postMayaCreditOptIn(@HeaderMap Map<String, String> map, @Body RequestBody requestBody);

    @POST("api/v1/applications/resend")
    a resendCreditVerification(@HeaderMap Map<String, String> map, @Body RequestBody requestBody);

    @POST("api/v1/applications")
    p<OTP> submitCreditApplication(@HeaderMap Map<String, String> map, @Body RequestBody requestBody);

    @POST("api/v1/disbursements")
    a submitCreditTransfer(@HeaderMap Map<String, String> map, @Body RequestBody requestBody);

    @POST("api/v1/customers/applications/verify")
    a verifyCreditApplicationWithCreditScore(@HeaderMap Map<String, String> map, @Body RequestBody requestBody);
}
