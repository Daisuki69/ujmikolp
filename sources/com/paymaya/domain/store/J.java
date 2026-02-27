package com.paymaya.domain.store;

import com.paymaya.common.utility.C1219h;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements G4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f11360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5.a f11361b;

    public J(K k8, C5.a aVar) {
        this.f11360a = k8;
        this.f11361b = aVar;
    }

    @Override // G4.a
    public final void a(K4.F f) {
        K.b(this.f11360a, this.f11361b, "threat-event", f);
    }

    @Override // G4.a
    public final void b(M8.A0 a02) {
        K k8 = this.f11360a;
        k8.getClass();
        K.e(a02);
        yk.a.f();
        K.a(k8, a02, "threat-event");
    }

    public final void c(String extractor, Throwable th2) {
        kotlin.jvm.internal.j.g(extractor, "extractor");
        this.f11360a.getClass();
        K.f(th2);
    }

    @Override // G4.a
    public final void onSuccess() {
        yk.a.f();
        K k8 = this.f11360a;
        k8.getClass();
        C1219h c1219hE = C1219h.e("DEVICE_EXTRACTION_SUCCESS");
        c1219hE.g("event_trigger", "threat-event");
        c1219hE.l();
        k8.f11363b.b(c1219hE);
    }
}
