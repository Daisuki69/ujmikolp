package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;

/* JADX INFO: loaded from: classes4.dex */
public final class P0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11381b;
    public final com.paymaya.data.database.repository.C c;

    public P0(PayMayaClientApi mPayMayaClientApi, com.paymaya.data.database.repository.C mShopProviderSubcategoryRepository) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mShopProviderSubcategoryRepository, "mShopProviderSubcategoryRepository");
        this.f11381b = mPayMayaClientApi;
        this.c = mShopProviderSubcategoryRepository;
    }
}
