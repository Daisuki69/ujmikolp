package com.google.mlkit.vision.face.internal;

import A3.e;
import A3.k;
import K3.d;
import b2.C0859a;
import b2.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_face.zzbn;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p3.g;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        d dVarB = C0859a.b(e.class);
        dVarB.c(h.c(g.class));
        dVarB.f = k.f43b;
        C0859a c0859aD = dVarB.d();
        d dVarB2 = C0859a.b(A3.d.class);
        dVarB2.c(h.c(e.class));
        dVarB2.c(h.c(p3.d.class));
        dVarB2.f = k.c;
        return zzbn.zzi(c0859aD, dVarB2.d());
    }
}
