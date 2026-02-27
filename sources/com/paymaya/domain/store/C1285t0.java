package com.paymaya.domain.store;

import D8.C0193a;
import M8.T2;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProductV3Base;
import java.util.HashMap;

/* JADX INFO: renamed from: com.paymaya.domain.store.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1285t0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11482b;
    public final com.paymaya.data.database.repository.A c;

    public C1285t0(PayMayaClientApi mPayMayaClientApi, com.paymaya.data.database.repository.A mProductV3Repository) {
        kotlin.jvm.internal.j.g(mPayMayaClientApi, "mPayMayaClientApi");
        kotlin.jvm.internal.j.g(mProductV3Repository, "mProductV3Repository");
        this.f11482b = mPayMayaClientApi;
        this.c = mProductV3Repository;
    }

    public static Ah.p e(C1285t0 c1285t0, String str, String str2, int i) {
        c1285t0.getClass();
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        map.put("category", str);
        map.put("keyword", str2);
        map.put("limit", String.valueOf(30));
        map.putAll(T2.t());
        Ah.p<ProductV3Base> productsV3 = c1285t0.f11482b.getProductsV3(map);
        kotlin.jvm.internal.j.f(productsV3, "getProductsV3(...)");
        return productsV3;
    }

    public static Ah.p f(C1285t0 c1285t0, String str, String str2, String providerName, int i) {
        c1285t0.getClass();
        kotlin.jvm.internal.j.g(providerName, "providerName");
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        map.put("category", str);
        map.put("provider", providerName);
        map.put("keyword", str2);
        map.put("limit", String.valueOf(30));
        map.putAll(T2.t());
        Ah.p<ProductV3Base> productsV3 = c1285t0.f11482b.getProductsV3(map);
        kotlin.jvm.internal.j.f(productsV3, "getProductsV3(...)");
        return productsV3;
    }

    public final Ah.p a(String str) {
        Ah.p<ProductV3> productV3Details = this.f11482b.getProductV3Details(str, T2.s());
        kotlin.jvm.internal.j.f(productV3Details, "getProductV3Details(...)");
        return productV3Details;
    }

    public final Lh.d b(String str, int i, String str2, boolean z4) {
        HashMap mapS = T2.s();
        mapS.put("provider", str);
        if (!str2.isEmpty()) {
            mapS.put("category", str2);
        }
        mapS.put("page", String.valueOf(i));
        mapS.put("limit", String.valueOf(10));
        mapS.put("sortBy", "priority,providerDisplayName,name");
        return new Lh.d(this.f11482b.getProductsV3(mapS).d(Z.f11413k), new B1.a(z4, this, str, str2), 2);
    }

    public final Lh.d c(int i, String providerName, boolean z4) {
        kotlin.jvm.internal.j.g(providerName, "providerName");
        HashMap mapS = T2.s();
        mapS.put("provider", providerName);
        mapS.put("page", String.valueOf(i));
        mapS.put("limit", String.valueOf(10));
        return new Lh.d(this.f11482b.getProductsV3(mapS).d(Z.f11414l), new C0193a(z4, this, providerName, 4), 2);
    }

    public final Ah.p d() {
        HashMap mapQ = androidx.media3.datasource.cache.c.q("category", "popular", "page", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        mapQ.put("limit", "5");
        mapQ.putAll(T2.t());
        Ah.p<ProductV3Base> productsV3 = this.f11482b.getProductsV3(mapQ);
        kotlin.jvm.internal.j.f(productsV3, "getProductsV3(...)");
        return productsV3;
    }
}
