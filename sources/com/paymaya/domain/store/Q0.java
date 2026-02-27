package com.paymaya.domain.store;

import M8.T2;
import com.paymaya.data.api.PayMayaClientApi;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class Q0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11383b;
    public final com.paymaya.data.database.repository.D c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f11384d;

    public Q0(PayMayaClientApi mPayMayaClientApi, com.paymaya.data.database.repository.D mShopPurchaseHistoryRepository, com.paymaya.data.preference.a mPreference) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mShopPurchaseHistoryRepository, "mShopPurchaseHistoryRepository");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f11383b = mPayMayaClientApi;
        this.c = mShopPurchaseHistoryRepository;
        this.f11384d = mPreference;
    }

    public final Lh.f a() {
        HashMap mapS = T2.s();
        mapS.put("limit", String.valueOf(5));
        mapS.put("page", String.valueOf(1));
        mapS.put("buy_again", "true");
        return new Lh.f(new Lh.i(this.f11383b.getShopPurchaseHistoryHead().d(new T(this, 3)), new com.google.firebase.messaging.n(26), null), new Y.e(24, this, mapS), 0);
    }
}
