package com.google.mlkit.vision.common.internal;

import K3.d;
import b2.C0859a;
import b2.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import x3.e;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        d dVarB = C0859a.b(e.class);
        dVarB.c(new h(2, 0, x3.d.class));
        dVarB.f = e.f20901b;
        return zzp.zzi(dVarB.d());
    }
}
