package com.google.firebase.installations;

import C2.d;
import C2.e;
import C2.f;
import G5.p;
import U1.g;
import a2.InterfaceC0623a;
import a2.b;
import androidx.annotation.Keep;
import b2.C0859a;
import b2.InterfaceC0860b;
import b2.h;
import b2.n;
import c2.ExecutorC1068k;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(InterfaceC0860b interfaceC0860b) {
        return new d((g) interfaceC0860b.get(g.class), interfaceC0860b.d(z2.e.class), (ExecutorService) interfaceC0860b.f(new n(InterfaceC0623a.class, ExecutorService.class)), new ExecutorC1068k((Executor) interfaceC0860b.f(new n(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0859a> getComponents() {
        int i = 0;
        K3.d dVarB = C0859a.b(e.class);
        dVarB.f2595a = LIBRARY_NAME;
        dVarB.c(h.c(g.class));
        dVarB.c(h.a(z2.e.class));
        dVarB.c(new h(new n(InterfaceC0623a.class, ExecutorService.class), 1, 0));
        dVarB.c(new h(new n(b.class, Executor.class), 1, 0));
        dVarB.f = new f(i);
        C0859a c0859aD = dVarB.d();
        z2.d dVar = new z2.d(i);
        K3.d dVarB2 = C0859a.b(z2.d.class);
        dVarB2.c = 1;
        dVarB2.f = new p(dVar);
        return Arrays.asList(c0859aD, dVarB2.d(), jk.b.e(LIBRARY_NAME, "19.0.1"));
    }
}
