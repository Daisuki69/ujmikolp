package com.paymaya.data.api;

import Ah.a;
import Ah.p;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.domain.model.AddMoneyViaCardSettings;
import com.paymaya.domain.model.Bank;
import com.paymaya.domain.model.BankPullSettings;
import com.paymaya.domain.model.BankTransfer;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.BillerV3Transaction;
import com.paymaya.domain.model.BillsPayRequest;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.CreditCardDetails;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FavoriteLimits;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PadalaCreateTransfer;
import com.paymaya.domain.model.PadalaTransfer;
import com.paymaya.domain.model.PullFundsDetails;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.VaultedCard;
import java.util.List;
import java.util.Map;
import okhttp3.RequestBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes3.dex */
public interface PayMayaCardApi {
    @POST("v1/cards/activate/plus")
    p<CreditCardDetails> activatePhysicalCard(@Body RequestBody requestBody);

    @POST("v1/cards/activate/virtual")
    p<CreditCardDetails> activateVirtualCard(@Body RequestBody requestBody);

    @POST("v2/banktransfers/otp")
    p<OTP> bankTransferOTP(@Body RequestBody requestBody);

    @PUT("v3/bills/pay/{payment_id}/checkout")
    p<BillerV3Transaction> checkoutBillsPaymentV3(@Path("payment_id") String str, @Body RequestBody requestBody);

    @POST("v1/bankpullfunds/{bank}")
    p<CreatePullFunds> createBankPullFunds(@Path("bank") String str, @Body RequestBody requestBody);

    @POST("v2/bankpullfunds/{bank}")
    p<CreatePullFunds> createBankPullFundsV2(@Path("bank") String str, @Body RequestBody requestBody);

    @POST("v1/banktransfers")
    p<BankTransfer> createBankTransfer(@Body BankTransfer bankTransfer);

    @POST("v2/banktransfers")
    p<BankTransfer> createBankTransferV2(@Body BankTransfer bankTransfer);

    @POST("v3/banktransfers")
    p<BankTransferV3CreateResponse> createBankTransferV3(@Body BankTransferV3 bankTransferV3, @Header("session_id") String str, @Header(CmcdConfiguration.KEY_CONTENT_ID) String str2, @Header("client_app_version") String str3, @Header("client_os_name") String str4);

    @POST("v2/bills/pay")
    p<BillerTransaction> createBillsPaymentV2(@Body BillsPayRequest billsPayRequest);

    @POST("v2/bills/pay")
    p<BillerTransaction> createBillsPaymentV2(@Body RequestBody requestBody);

    @POST("v3/bills/pay")
    p<BillerV3Transaction> createBillsPaymentV3(@Body BillsPayRequest billsPayRequest);

    @POST("v1/favourites")
    a createFavorite(@Body FavoriteDetails favoriteDetails);

    @POST("v1/merchant/pay")
    p<MerchantPayment> createMerchantPayment(@Body RequestBody requestBody);

    @POST("v3/merchant/pay")
    p<MerchantPayment> createMerchantPaymentV3(@Body RequestBody requestBody);

    @POST("v3/p2p/transfers")
    p<Transfer> createP2PTransferV3(@Body RequestBody requestBody, @Header("session_id") String str, @Header(CmcdConfiguration.KEY_CONTENT_ID) String str2, @Header("client_app_version") String str3, @Header("client_os_name") String str4);

    @POST("v3/p2p/transfers")
    p<Transfer> createP2PTransferV3WithNewHeader(@Body RequestBody requestBody, @Header("session_id") String str, @Header(CmcdConfiguration.KEY_CONTENT_ID) String str2, @Header("client_app_version") String str3, @Header("client_os_name") String str4, @Header("xx-app-install-id") String str5);

    @POST("v2/transfers")
    p<PadalaTransfer> createPadalaTransfer(@Body PadalaCreateTransfer padalaCreateTransfer);

    @POST("v1/pullfunds")
    p<CreatePullFunds> createPullFunds(@Body RequestBody requestBody);

    @POST("v1/qrph/merchant/pay")
    p<QRPHMerchantPaymentTransaction> createQRPHMerchantPayment(@Body RequestBody requestBody);

    @DELETE("v1/favourites/{favorite_id}")
    a deleteFavorite(@Path("favorite_id") String str);

    @DELETE("v1/bankpullfunds/payment/tokens/{payment_token_id}")
    a deletePaymentToken(@Path("payment_token_id") String str);

    @DELETE("v1/pullfunds/cards/{card_token_id}")
    a deleteVaultedCard(@Path("card_token_id") String str);

    @PUT("v1/bankpullfunds/{purchase_id}/execute")
    p<ExecutePullFunds> executeBankPullFunds(@Path("purchase_id") String str, @Body RequestBody requestBody);

    @PUT("v2/bankpullfunds/{purchase_id}/execute")
    p<ExecutePullFunds> executeBankPullFundsV2(@Path("purchase_id") String str, @Body RequestBody requestBody);

    @PUT("v1/banktransfers/{id}/execute")
    p<BankTransfer> executeBankTransfer(@Path(TtmlNode.ATTR_ID) String str);

    @PUT("v2/banktransfers/execute")
    p<BankTransfer> executeBankTransferV2(@Body RequestBody requestBody);

    @PUT("v3/banktransfers/{transfer_id}/execute")
    p<BankTransferV3> executeBankTransferV3(@Path("transfer_id") String str);

    @PUT("v2/bills/pay/{payment_id}/execute")
    p<BillerTransaction> executeBillsPaymentV2(@Path("payment_id") String str, @Body RequestBody requestBody);

    @PUT("v2/merchant/pay/{payment_id}/execute")
    p<MerchantPayment> executeDynamicMerchantPaymentV2(@Path("payment_id") String str);

    @PUT("v3/merchant/pay/{payment_id}/execute")
    p<MerchantPayment> executeDynamicMerchantPaymentV3(@Path("payment_id") String str);

    @PUT("v1/merchant/{merchant_id}/pay/{payment_id}/execute")
    p<MerchantPayment> executeMerchantPayment(@Path("merchant_id") String str, @Path("payment_id") String str2);

    @PUT("v2/merchant/pay/{payment_id}/execute")
    p<MerchantPayment> executeMerchantPaymentV2(@Path("payment_id") String str, @Query("merchant_id") String str2);

    @PUT("v3/merchant/pay/{payment_id}/execute")
    p<MerchantPayment> executeMerchantPaymentV3(@Path("payment_id") String str, @Query("merchant_id") String str2);

    @PUT("v3/p2p/transfers/execute")
    p<Transfer> executeP2PTransferV3(@Body RequestBody requestBody, @Header("session_id") String str, @Header(CmcdConfiguration.KEY_CONTENT_ID) String str2, @Header("client_app_version") String str3, @Header("client_os_name") String str4);

    @PUT("v3/p2p/transfers/{transfer_id}/execute")
    p<Transfer> executeP2PTransferV3WithTransferId(@Path("transfer_id") String str, @Body RequestBody requestBody, @Header("session_id") String str2, @Header(CmcdConfiguration.KEY_CONTENT_ID) String str3, @Header("client_app_version") String str4, @Header("client_os_name") String str5);

    @PUT("v2/transfers/{transfer_id}/execute")
    p<PadalaTransfer> executePadalaTransfer(@Path("transfer_id") String str);

    @PUT("v1/pullfunds/{purchase_id}/execute")
    p<ExecutePullFunds> executePullFunds(@Path("purchase_id") String str, @Body RequestBody requestBody);

    @PUT("v1/qrph/merchant/pay/{payment_id}/execute")
    p<QRPHMerchantPaymentTransaction> executeQRPHMerchantPayment(@Path("payment_id") String str);

    @GET("v1/pullfunds/settings")
    p<AddMoneyViaCardSettings> getAddMoneyViaCardSettings();

    @GET("v1/favourites/limit")
    p<FavoriteLimits> getAllFavoriteLimits();

    @GET("v1/favourites")
    p<List<Favorite>> getAllFavorites();

    @GET("v1/bankpullfunds/settings")
    p<BankPullSettings> getBankPullSettings(@QueryMap Map<String, String> map);

    @GET("v2/bankpullfunds/settings")
    p<BankPullSettings> getBankPullSettingsV2(@QueryMap Map<String, String> map);

    @GET("v1/banks")
    p<List<Bank>> getBanks();

    @HEAD("v1/banks")
    @Headers({"Connection: close"})
    p<Response<Void>> getBanksHead();

    @GET("v1/favourites/{favorite_id}")
    p<FavoriteDetails> getFavoriteDetails(@Path("favorite_id") String str);

    @GET("v1/favourites/limit")
    p<Map<String, FavoriteCount>> getFavoriteLimit(@Query(SessionDescription.ATTR_TYPE) String str);

    @GET("v1/favourites")
    p<List<Favorite>> getFavorites(@QueryMap Map<String, String> map);

    @GET("v1/bankpullfunds/payment/tokens")
    p<Map<String, List<LinkedPaymentOption>>> getPaymentTokens();

    @GET("v1/pullfunds/{type}/{id}")
    p<PullFundsDetails> getPullFundsDetails(@Path(SessionDescription.ATTR_TYPE) String str, @Path(TtmlNode.ATTR_ID) String str2);

    @GET("v1/pullfunds/cards")
    p<List<VaultedCard>> getVaultedCards();

    @GET("v1/cards/{fundsource}?csc=1")
    p<CreditCardDetails> getVirtualCardDetails(@Path("fundsource") String str);

    @PUT("v1/cards/{fundsource}/renew")
    a renewVirtualCard(@Path("fundsource") String str);

    @POST("v1/p2p/transfers/otp")
    p<OTP> transferOTPP2P(@Body RequestBody requestBody);

    @PUT("v1/favourites/{favorite_id}")
    a updateFavorite(@Path("favorite_id") String str, @Body FavoriteDetails favoriteDetails);
}
