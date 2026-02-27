package com.paymaya.domain.store;

import com.paymaya.data.api.MayaPayBillsClientApi;
import com.paymaya.data.api.PayMayaCardApi;
import com.paymaya.data.database.repository.C1245i;
import com.paymaya.domain.model.BillerInput;

/* JADX INFO: renamed from: com.paymaya.domain.store.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1277p extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaCardApi f11469b;
    public final MayaPayBillsClientApi c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1245i f11470d;
    public final com.paymaya.data.preference.a e;

    public C1277p(PayMayaCardApi payMayaCardApi, MayaPayBillsClientApi mayaPayBillsClientApi, C1245i c1245i, com.paymaya.data.preference.a aVar) {
        this.f11469b = payMayaCardApi;
        this.c = mayaPayBillsClientApi;
        this.f11470d = c1245i;
        this.e = aVar;
    }

    public final Ah.p a(BillerInput billerInput) {
        return this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled() ? this.c.createBillsPaymentV3(billerInput.toBillsPayRequest()).d(new com.google.firebase.messaging.n(21)) : this.f11469b.createBillsPaymentV2(billerInput.toBillsPayRequest());
    }
}
