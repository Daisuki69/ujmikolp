package com.google.mlkit.vision.barcode.internal;

import K3.d;
import b2.C0859a;
import b2.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import oi.C1986d;
import p3.g;
import p3.t;
import v3.C2340c;
import v3.e;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        d dVarB = C0859a.b(e.class);
        dVarB.c(h.c(g.class));
        dVarB.f = new t();
        C0859a c0859aD = dVarB.d();
        d dVarB2 = C0859a.b(C2340c.class);
        dVarB2.c(h.c(e.class));
        dVarB2.c(h.c(p3.d.class));
        dVarB2.c(h.c(g.class));
        dVarB2.f = new C1986d(4);
        return zzcs.zzh(c0859aD, dVarB2.d());
    }
}
