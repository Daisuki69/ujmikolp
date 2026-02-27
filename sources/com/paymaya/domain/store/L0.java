package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.ShopProviderCategory;
import java.util.List;
import n3.C1916a;

/* JADX INFO: loaded from: classes4.dex */
public final class L0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.paymaya.data.database.repository.F f11368b;
    public final PayMayaClientApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f11369d;

    public L0(com.paymaya.data.database.repository.F mShopProviderCategoryRepository, PayMayaClientApi mPayMayaClientApi, com.paymaya.data.preference.a mPreference) {
        kotlin.jvm.internal.j.g(mShopProviderCategoryRepository, "mShopProviderCategoryRepository");
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f11368b = mShopProviderCategoryRepository;
        this.c = mPayMayaClientApi;
        this.f11369d = mPreference;
    }

    public final ShopProviderCategory a() {
        C1916a c1916a = new C1916a(8);
        com.paymaya.data.database.repository.F f = this.f11368b;
        f.getClass();
        if (f.a(c1916a).isEmpty()) {
            return null;
        }
        return (ShopProviderCategory) f.a(c1916a).get(0);
    }

    public final List b() {
        return this.f11368b.a(new Kh.I(9));
    }
}
