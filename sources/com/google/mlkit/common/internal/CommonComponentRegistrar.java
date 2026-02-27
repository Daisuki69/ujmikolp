package com.google.mlkit.common.internal;

import K3.d;
import Kh.I;
import M2.b;
import b2.C0859a;
import b2.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import mg.c;
import n3.C1916a;
import o3.C1960c;
import p3.C2010a;
import p3.C2011b;
import p3.g;
import p3.k;
import q3.C2161a;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C0859a c0859a = k.f19037b;
        d dVarB = C0859a.b(C2161a.class);
        dVarB.c(h.c(g.class));
        dVarB.f = new C1916a(27);
        C0859a c0859aD = dVarB.d();
        d dVarB2 = C0859a.b(p3.h.class);
        dVarB2.f = new C2011b(27);
        C0859a c0859aD2 = dVarB2.d();
        d dVarB3 = C0859a.b(o3.d.class);
        dVarB3.c(new h(2, 0, C1960c.class));
        dVarB3.f = new z2.d(27);
        C0859a c0859aD3 = dVarB3.d();
        d dVarB4 = C0859a.b(p3.d.class);
        dVarB4.c(new h(1, 1, p3.h.class));
        dVarB4.f = new I(28);
        C0859a c0859aD4 = dVarB4.d();
        d dVarB5 = C0859a.b(C2010a.class);
        dVarB5.f = new b(28);
        C0859a c0859aD5 = dVarB5.d();
        d dVarB6 = C0859a.b(C2011b.class);
        dVarB6.c(h.c(C2010a.class));
        dVarB6.f = new N4.d(28);
        C0859a c0859aD6 = dVarB6.d();
        d dVarB7 = C0859a.b(C1916a.class);
        dVarB7.c(h.c(g.class));
        dVarB7.f = new c(28);
        C0859a c0859aD7 = dVarB7.d();
        d dVarB8 = C0859a.b(C1960c.class);
        dVarB8.c = 1;
        dVarB8.c(new h(1, 1, C1916a.class));
        dVarB8.f = new C1916a(28);
        return zzaf.zzi(c0859a, c0859aD, c0859aD2, c0859aD3, c0859aD4, c0859aD5, c0859aD6, c0859aD7, dVarB8.d());
    }
}
