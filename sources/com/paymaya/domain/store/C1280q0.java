package com.paymaya.domain.store;

import com.paymaya.data.api.ConfigApi;
import com.paymaya.data.api.PayMayaClientApi;
import java.util.Objects;
import retrofit2.Response;

/* JADX INFO: renamed from: com.paymaya.domain.store.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1280q0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConfigApi f11473b;
    public PayMayaClientApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.preference.a f11474d;
    public com.paymaya.data.database.repository.y e;
    public Uh.d f;

    public final void a(String str) {
        Ah.p<Response<Void>> featuredMerchantsHead = this.c.getFeaturedMerchantsHead();
        Uh.d dVar = this.f;
        Objects.requireNonNull(dVar);
        androidx.work.impl.e eVar = new androidx.work.impl.e(dVar, 23);
        featuredMerchantsHead.getClass();
        new Lh.d(featuredMerchantsHead, eVar, 0).f(new Gh.d(1, new androidx.camera.lifecycle.a(25, this, str), Eh.d.f1366d));
    }

    public final void b(String str, String str2) {
        com.paymaya.data.preference.a aVar;
        str.getClass();
        aVar = this.f11474d;
        switch (str) {
            case "retail":
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_retail_date", str2);
                break;
            case "food":
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_food_head_date", str2);
                break;
            case "government":
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_government_date", str2);
                break;
            case "transport":
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_op_transport_date", str2);
                break;
            default:
                aVar.getClass();
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_category_" + str + "_head_date", str2);
                break;
        }
    }
}
