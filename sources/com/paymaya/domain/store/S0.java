package com.paymaya.domain.store;

import com.google.firebase.messaging.FirebaseMessaging;
import com.paymaya.common.utility.C1220i;
import com.paymaya.data.api.MayaInboxNotificationsClientApi;
import com.paymaya.data.api.PayMayaClientApi;
import io.flutter.embedding.engine.FlutterEngineCache;

/* JADX INFO: loaded from: classes4.dex */
public final class S0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.paymaya.data.preference.a f11387b;
    public C1220i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PayMayaClientApi f11388d;
    public L5.a e;
    public MayaInboxNotificationsClientApi f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public A5.m f11389g;
    public S5.c h;

    public final synchronized void a() {
        this.e.f2811a.close();
        this.f11387b.a();
        FlutterEngineCache.getInstance().remove("CRYPTO_V2_FLUTTER");
        FlutterEngineCache.getInstance().remove("funds");
        this.e.b("account_balance", "", null);
        this.e.b("user_activity", "", null);
        this.e.b("fund_source", "", null);
        this.e.b("identity", "", null);
        this.e.b("backup_identity", "", null);
        this.e.b("user", "", null);
        this.e.b("address", "", null);
        this.e.b("block_reason", "", null);
        this.e.b("product_v2", "", null);
        this.e.b("product_v3", "", null);
        this.e.b("biller", "", null);
        this.e.b("biller_transaction", "", null);
        this.e.b("shop_transaction_v2", "", null);
        this.e.b("voucher", "", null);
        this.e.b("voucher_reminder", "", null);
        this.e.b("shop_purchase_history", "", null);
        this.e.b("shop_provider", "", null);
        this.e.b("action_card_recommendation", "", null);
    }

    public final Hh.a b() {
        if (this.f11387b.e().isInboxV4Enabled()) {
            FirebaseMessaging.c().e().addOnCompleteListener(new R0(this));
        }
        this.f11389g.f178d = true;
        PayMayaClientApi payMayaClientApi = this.f11388d;
        Ah.a aVarDeregisterPushToken = payMayaClientApi.deregisterPushToken();
        aVarDeregisterPushToken.getClass();
        Hh.c cVar = new Hh.c(aVarDeregisterPushToken, 2);
        Ah.a aVarSignOut = payMayaClientApi.signOut();
        R0 r02 = new R0(this);
        aVarSignOut.getClass();
        return new Hh.a(cVar, new Hh.a(aVarSignOut, r02, 1), 0);
    }
}
