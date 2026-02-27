package com.paymaya.domain.store;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1132s;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.C1243g;
import com.paymaya.data.database.repository.C1244h;
import com.paymaya.data.database.repository.C1246j;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerV3Response;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.paymaya.domain.store.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1273n extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaClientApi f11463b;
    public final C1244h c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1243g f11464d;
    public final C1246j e;
    public final com.paymaya.data.preference.a f;

    public C1273n(PayMayaClientApi payMayaClientApi, C1244h c1244h, C1243g c1243g, C1246j c1246j, com.paymaya.data.preference.a aVar) {
        this.f11463b = payMayaClientApi;
        this.c = c1244h;
        this.f11464d = c1243g;
        this.e = c1246j;
        this.f = aVar;
    }

    public final Biller a(String str) {
        M5.a aVar = new M5.a(0);
        aVar.f3080b = str;
        C1244h c1244h = this.c;
        if (c1244h.b(aVar).isEmpty()) {
            return null;
        }
        return (Biller) c1244h.b(aVar).get(0);
    }

    public final Ah.p b(String str) {
        boolean zIsMayaBillsPayV3EndpointConfigEnabled = this.f.e().isMayaBillsPayV3EndpointConfigEnabled();
        PayMayaClientApi payMayaClientApi = this.f11463b;
        if (zIsMayaBillsPayV3EndpointConfigEnabled) {
            Ah.p<BillerV3Response> billerDetailsV3 = payMayaClientApi.getBillerDetailsV3(str, I5.b.a(null, null, null, null, null, 63));
            C1271m c1271m = new C1271m(this, 3);
            billerDetailsV3.getClass();
            return new Lh.d(billerDetailsV3, c1271m, 2).d(new com.google.firebase.messaging.n(20));
        }
        HashMap map = new HashMap();
        map.put("device_type", "android");
        Ah.p<Biller> billersDetails = payMayaClientApi.getBillersDetails(str, map);
        C1244h c1244h = this.c;
        Objects.requireNonNull(c1244h);
        androidx.work.impl.e eVar = new androidx.work.impl.e(c1244h, 22);
        billersDetails.getClass();
        return new Lh.d(billersDetails, eVar, 2);
    }

    public final Ah.p c(String str) {
        boolean zIsMayaBillsPayV3EndpointConfigEnabled = this.f.e().isMayaBillsPayV3EndpointConfigEnabled();
        PayMayaClientApi payMayaClientApi = this.f11463b;
        if (zIsMayaBillsPayV3EndpointConfigEnabled) {
            Ah.p<BillerV3Response> billerDetailsV3 = payMayaClientApi.getBillerDetailsV3(str, I5.b.a(null, null, null, null, null, 63));
            C1271m c1271m = new C1271m(this, 0);
            billerDetailsV3.getClass();
            return new Lh.d(billerDetailsV3, c1271m, 2).d(new com.google.firebase.messaging.n(17));
        }
        Ah.p<BillerDetails> billerDetailsNoFilter = payMayaClientApi.getBillerDetailsNoFilter(str);
        C1271m c1271m2 = new C1271m(this, 1);
        billerDetailsNoFilter.getClass();
        return new Lh.d(billerDetailsNoFilter, c1271m2, 2);
    }

    public final Ah.p d(int i, String searchKeyword) {
        boolean zIsMayaBillsPayV3EndpointConfigEnabled = this.f.e().isMayaBillsPayV3EndpointConfigEnabled();
        PayMayaClientApi payMayaClientApi = this.f11463b;
        if (zIsMayaBillsPayV3EndpointConfigEnabled) {
            kotlin.jvm.internal.j.g(searchKeyword, "searchKeyword");
            return new Ih.D(new Ih.l(payMayaClientApi.getBillersListV3(I5.b.a(Boolean.FALSE, Integer.valueOf(i), searchKeyword, null, C1132s.g("confirmation_url", TtmlNode.TAG_METADATA, "paymentMethods"), 24)).d(new com.google.firebase.messaging.n(18)).i().b(new com.google.firebase.messaging.n(19)), new com.google.firebase.messaging.n(20), 1));
        }
        HashMap mapP = androidx.media3.datasource.cache.c.p("device_type", "android");
        mapP.put("device_resolution", com.paymaya.common.utility.C.f10391a);
        mapP.put("exclude_with_fees", "false");
        mapP.put("keyword", searchKeyword);
        mapP.put("fields", "confirmationUrl,metadata");
        return payMayaClientApi.getBillersListSearchAPI(mapP);
    }

    public final Lh.h e(int i, String str) {
        boolean zIsMayaBillsPayV3EndpointConfigEnabled = this.f.e().isMayaBillsPayV3EndpointConfigEnabled();
        PayMayaClientApi payMayaClientApi = this.f11463b;
        if (zIsMayaBillsPayV3EndpointConfigEnabled) {
            return new Lh.d(new Ih.D(new Ih.l(payMayaClientApi.getBillersListV3(I5.b.a(null, Integer.valueOf(i), null, str, cj.r.c("paymentMethods"), 21)).d(new com.google.firebase.messaging.n(18)).i().b(new com.google.firebase.messaging.n(19)), new com.google.firebase.messaging.n(20), 1)), new G6.b(this, i, str, 7), 2).h(Th.e.c);
        }
        HashMap mapP = androidx.media3.datasource.cache.c.p("device_type", "android");
        mapP.put("device_resolution", com.paymaya.common.utility.C.f10391a);
        mapP.put("exclude_with_fees", "false");
        Ah.p<List<Biller>> categoryBillerList = payMayaClientApi.getCategoryBillerList(str, mapP);
        androidx.camera.lifecycle.a aVar = new androidx.camera.lifecycle.a(24, this, str);
        categoryBillerList.getClass();
        return new Lh.d(categoryBillerList, aVar, 2).h(Th.e.c);
    }
}
