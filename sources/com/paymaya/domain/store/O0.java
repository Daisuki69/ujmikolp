package com.paymaya.domain.store;

import M8.T2;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderBase;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class O0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11378b;
    public final com.paymaya.data.database.repository.B c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.database.repository.F f11379d;
    public final com.paymaya.data.preference.a e;

    public O0(PayMayaClientApi mPayMayaClientApi, com.paymaya.data.database.repository.B mShopProviderRepository, com.paymaya.data.database.repository.F mShopProviderCategoryRepository, com.paymaya.data.preference.a mPreference) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mShopProviderRepository, "mShopProviderRepository");
        kotlin.jvm.internal.j.g(mShopProviderCategoryRepository, "mShopProviderCategoryRepository");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f11378b = mPayMayaClientApi;
        this.c = mShopProviderRepository;
        this.f11379d = mShopProviderCategoryRepository;
        this.e = mPreference;
    }

    public final Lh.f a() {
        return new Lh.f(this.f11378b.getShopProvidersV3Head().d(new M(this, 2)), new L(this, 3), 0);
    }

    public final Lh.f b(String categoryCode) {
        kotlin.jvm.internal.j.g(categoryCode, "categoryCode");
        HashMap mapS = T2.s();
        mapS.put("category", categoryCode);
        return new Lh.f(this.f11378b.getShopProvidersCategoryHead(mapS).d(new M0(this, categoryCode)), new U8.c(16, this, mapS, categoryCode), 0);
    }

    public final Lh.d c(String categoryCode) {
        kotlin.jvm.internal.j.g(categoryCode, "categoryCode");
        HashMap mapS = T2.s();
        mapS.put("category", categoryCode);
        mapS.put("page", String.valueOf(1));
        Ah.p<ShopProviderBase> shopProviders = this.f11378b.getShopProviders(mapS);
        A0 a02 = new A0(this, 1);
        shopProviders.getClass();
        return new Lh.d(shopProviders, a02, 2);
    }

    public final ShopProvider d(String name) {
        kotlin.jvm.internal.j.g(name, "name");
        M5.d dVar = new M5.d(name);
        com.paymaya.data.database.repository.B b8 = this.c;
        b8.getClass();
        if (b8.b(dVar).isEmpty()) {
            return null;
        }
        return (ShopProvider) b8.b(dVar).get(0);
    }
}
