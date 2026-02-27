package com.paymaya.domain.store;

import android.content.SharedPreferences;
import com.paymaya.common.utility.C1219h;
import dOYHB6.yFtIp6.svM7M6;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements G4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f11354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f11355b;
    public final /* synthetic */ String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5.a f11356d;

    public I(K k8, H h, String str, C5.a aVar) {
        this.f11354a = k8;
        this.f11355b = h;
        this.c = str;
        this.f11356d = aVar;
    }

    @Override // G4.a
    public final void a(K4.F f) {
        yk.a.f();
        K.b(this.f11354a, this.f11356d, this.c, f);
    }

    @Override // G4.a
    public final void b(M8.A0 a02) {
        K k8 = this.f11354a;
        k8.getClass();
        String strE = K.e(a02);
        yk.a.f();
        Uh.b bVar = k8.e;
        if (bVar != null) {
            bVar.onError(new Throwable(strE));
        }
        H h = this.f11355b;
        if (h != null) {
            h.onError(new Throwable(strE));
        }
        K.a(k8, a02, this.c);
    }

    public final void c(String extractor, Throwable th2) {
        kotlin.jvm.internal.j.g(extractor, "extractor");
        this.f11354a.getClass();
        K.f(th2);
    }

    @Override // G4.a
    public final void onSuccess() {
        yk.a.f();
        K k8 = this.f11354a;
        Uh.b bVar = k8.e;
        if (bVar != null) {
            bVar.onComplete();
        }
        H h = this.f11355b;
        if (h != null) {
            SharedPreferences sharedPreferences = S1.r.f5623a;
            if (sharedPreferences != null) {
                svM7M6.getString(sharedPreferences, "DDID", null);
            }
            h.onSuccess();
        }
        C1219h c1219hE = C1219h.e("DEVICE_EXTRACTION_SUCCESS");
        c1219hE.g("event_trigger", this.c);
        c1219hE.l();
        k8.f11363b.b(c1219hE);
        androidx.camera.core.impl.a.A(k8.f11364d.f11330b, "has_data_extracted", true);
    }
}
