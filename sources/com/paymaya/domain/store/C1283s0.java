package com.paymaya.domain.store;

import M8.T2;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.paymaya.domain.store.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1283s0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11480b;
    public com.paymaya.data.database.repository.D c;

    public final Lh.d a(int i, String str) {
        HashMap mapS = T2.s();
        mapS.put("status", str);
        mapS.put("page", String.valueOf(i));
        Ah.p<ShopPurchaseHistoryBase> shopPurchaseHistory = this.f11480b.getShopPurchaseHistory(mapS);
        G6.b bVar = new G6.b(this, str, i, 8);
        shopPurchaseHistory.getClass();
        return new Lh.d(shopPurchaseHistory, bVar, 2);
    }

    public final List b(String str) {
        F1.k kVar = new F1.k(3);
        kVar.f1526b = str;
        return this.c.a(kVar);
    }
}
