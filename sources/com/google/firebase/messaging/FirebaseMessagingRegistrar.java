package com.google.firebase.messaging;

import androidx.annotation.Keep;
import b2.C0859a;
import b2.InterfaceC0860b;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import s2.InterfaceC2234b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(b2.n nVar, InterfaceC0860b interfaceC0860b) {
        U1.g gVar = (U1.g) interfaceC0860b.get(U1.g.class);
        if (interfaceC0860b.get(A2.a.class) == null) {
            return new FirebaseMessaging(gVar, interfaceC0860b.d(V2.b.class), interfaceC0860b.d(z2.f.class), (C2.e) interfaceC0860b.get(C2.e.class), interfaceC0860b.e(nVar), (y2.d) interfaceC0860b.get(y2.d.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0859a> getComponents() {
        b2.n nVar = new b2.n(InterfaceC2234b.class, Z0.g.class);
        K3.d dVarB = C0859a.b(FirebaseMessaging.class);
        dVarB.f2595a = LIBRARY_NAME;
        dVarB.c(b2.h.c(U1.g.class));
        dVarB.c(new b2.h(0, 0, A2.a.class));
        dVarB.c(b2.h.a(V2.b.class));
        dVarB.c(b2.h.a(z2.f.class));
        dVarB.c(b2.h.c(C2.e.class));
        dVarB.c(new b2.h(nVar, 0, 1));
        dVarB.c(b2.h.c(y2.d.class));
        dVarB.f = new I2.b(nVar, 2);
        dVarB.f(1);
        return Arrays.asList(dVarB.d(), jk.b.e(LIBRARY_NAME, "25.0.1"));
    }
}
