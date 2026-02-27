package com.paymaya.common.utility;

import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.paymaya.data.api.deserializer.BillerDeserializer;
import com.paymaya.data.api.deserializer.BillerV3ResponseDeserializer;
import com.paymaya.data.api.deserializer.DecoratedActivityDeserializer;
import com.paymaya.data.api.deserializer.DecorationsDeserializer;
import com.paymaya.data.api.deserializer.EkyAccountTypeDeserializer;
import com.paymaya.data.api.deserializer.FavoriteDetailsDeserializer;
import com.paymaya.data.api.deserializer.FormSeriesDeserializer;
import com.paymaya.data.api.deserializer.LoadUpPartnerDeserializer;
import com.paymaya.data.api.deserializer.LoanInstanceListDeserializer;
import com.paymaya.data.api.deserializer.LoanProductDetailsDeserializer;
import com.paymaya.data.api.deserializer.MerchantPaymentDeserializer;
import com.paymaya.data.api.deserializer.OnlinePaymentDeserializer;
import com.paymaya.data.api.deserializer.OnlinePaymentListDeserializer;
import com.paymaya.data.api.deserializer.OrderDeserializer;
import com.paymaya.data.api.deserializer.ProductListDeserializer;
import com.paymaya.data.api.deserializer.QRMerchantDeserializer;
import com.paymaya.data.api.deserializer.ShopHomeDeserializer;
import com.paymaya.data.api.deserializer.TransferDeserializer;
import com.paymaya.data.api.deserializer.UserActivityListDeserializer;
import com.paymaya.data.api.deserializer.WhitelistedLoanListDeserializer;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerV3Response;
import com.paymaya.domain.model.DecoratedActivity;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.EkycAccountType;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FormSeries;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.LoanInstance;
import com.paymaya.domain.model.LoanProductDetails;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.Product;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.domain.model.ScreensBannerIndex;
import com.paymaya.domain.model.ShopHome;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.UpdaterConfigDetails;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.model.WhitelistedLoan;
import com.paymaya.domain.model.flagconfig.DashboardContentConfigDetails;
import com.paymaya.domain.model.flagconfig.DashboardTabConfig;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.gson.j f10366a;

    static {
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.e.add(new AutoValueGson_PayMayaAutoValueTypeAdapterFactory());
        kVar.b(new UserActivityListDeserializer(), new TypeToken<List<UserActivity>>() { // from class: com.paymaya.common.utility.GsonUtils$1
        }.getType());
        kVar.b(new ProductListDeserializer(), new TypeToken<List<Product>>() { // from class: com.paymaya.common.utility.GsonUtils$2
        }.getType());
        kVar.b(new LoanInstanceListDeserializer(), new TypeToken<List<LoanInstance>>() { // from class: com.paymaya.common.utility.GsonUtils$3
        }.getType());
        kVar.b(new WhitelistedLoanListDeserializer(), new TypeToken<List<WhitelistedLoan>>() { // from class: com.paymaya.common.utility.GsonUtils$4
        }.getType());
        kVar.b(new EkyAccountTypeDeserializer(), new TypeToken<List<EkycAccountType>>() { // from class: com.paymaya.common.utility.GsonUtils$5
        }.getType());
        kVar.b(new FormSeriesDeserializer(), new TypeToken<List<FormSeries>>() { // from class: com.paymaya.common.utility.GsonUtils$6
        }.getType());
        kVar.b(new OnlinePaymentListDeserializer(), new TypeToken<List<OnlinePayment>>() { // from class: com.paymaya.common.utility.GsonUtils$7
        }.getType());
        kVar.b(new OnlinePaymentDeserializer(), new TypeToken<OnlinePayment>() { // from class: com.paymaya.common.utility.GsonUtils$8
        }.getType());
        kVar.b(new DecorationsDeserializer(), new TypeToken<List<Decoration>>() { // from class: com.paymaya.common.utility.GsonUtils$9
        }.getType());
        kVar.b(new OrderDeserializer(), new TypeToken<Order>() { // from class: com.paymaya.common.utility.GsonUtils$10
        }.getType());
        kVar.b(new DecoratedActivityDeserializer(), new TypeToken<DecoratedActivity>() { // from class: com.paymaya.common.utility.GsonUtils$11
        }.getType());
        kVar.b(new MerchantPaymentDeserializer(), new TypeToken<MerchantPayment>() { // from class: com.paymaya.common.utility.GsonUtils$12
        }.getType());
        kVar.b(new LoadUpPartnerDeserializer(), new TypeToken<LoadUpPartner>() { // from class: com.paymaya.common.utility.GsonUtils$13
        }.getType());
        kVar.b(new LoanProductDetailsDeserializer(), new TypeToken<LoanProductDetails>() { // from class: com.paymaya.common.utility.GsonUtils$14
        }.getType());
        kVar.b(new QRMerchantDeserializer(), new TypeToken<QRMerchant>() { // from class: com.paymaya.common.utility.GsonUtils$15
        }.getType());
        kVar.b(new FavoriteDetailsDeserializer(), new TypeToken<FavoriteDetails>() { // from class: com.paymaya.common.utility.GsonUtils$16
        }.getType());
        kVar.b(new BillerDeserializer(), new TypeToken<Biller>() { // from class: com.paymaya.common.utility.GsonUtils$17
        }.getType());
        kVar.b(new BillerV3ResponseDeserializer(), new TypeToken<BillerV3Response>() { // from class: com.paymaya.common.utility.GsonUtils$18
        }.getType());
        kVar.b(new ShopHomeDeserializer(), new TypeToken<ShopHome>() { // from class: com.paymaya.common.utility.GsonUtils$19
        }.getType());
        kVar.b(new TransferDeserializer(), new TypeToken<Transfer>() { // from class: com.paymaya.common.utility.GsonUtils$20
        }.getType());
        kVar.b(DashboardContentConfigDetails.Companion.getDeserializer(), new TypeToken<DashboardContentConfigDetails>() { // from class: com.paymaya.common.utility.GsonUtils$21
        }.getType());
        kVar.b(DashboardTabConfig.Companion.getDeserializer(), new TypeToken<DashboardTabConfig>() { // from class: com.paymaya.common.utility.GsonUtils$22
        }.getType());
        kVar.b(ScreensBannerIndex.Companion.getDeserializer(), new TypeToken<ScreensBannerIndex>() { // from class: com.paymaya.common.utility.GsonUtils$23
        }.getType());
        kVar.b(MaintenanceDynamicConfig.Companion.getDeserializer(), new TypeToken<MaintenanceDynamicConfig>() { // from class: com.paymaya.common.utility.GsonUtils$24
        }.getType());
        kVar.b(UpdaterConfigDetails.Companion.getDeserializer(), new TypeToken<UpdaterConfigDetails>() { // from class: com.paymaya.common.utility.GsonUtils$25
        }.getType());
        Excluder excluderB = kVar.f10023a.clone();
        excluderB.f9877a = true;
        kVar.f10023a = excluderB;
        kVar.f10028l = 1;
        f10366a = kVar.a();
    }
}
