package com.google.firebase;

import Bj.A;
import K3.d;
import a2.InterfaceC0623a;
import a2.b;
import a2.c;
import androidx.annotation.Keep;
import b2.C0859a;
import b2.h;
import b2.n;
import cj.C1132s;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0859a> getComponents() {
        d dVarA = C0859a.a(new n(InterfaceC0623a.class, A.class));
        dVarA.c(new h(new n(InterfaceC0623a.class, Executor.class), 1, 0));
        dVarA.f = U1.h.f5908b;
        C0859a c0859aD = dVarA.d();
        d dVarA2 = C0859a.a(new n(c.class, A.class));
        dVarA2.c(new h(new n(c.class, Executor.class), 1, 0));
        dVarA2.f = U1.h.c;
        C0859a c0859aD2 = dVarA2.d();
        d dVarA3 = C0859a.a(new n(b.class, A.class));
        dVarA3.c(new h(new n(b.class, Executor.class), 1, 0));
        dVarA3.f = U1.h.f5909d;
        C0859a c0859aD3 = dVarA3.d();
        d dVarA4 = C0859a.a(new n(a2.d.class, A.class));
        dVarA4.c(new h(new n(a2.d.class, Executor.class), 1, 0));
        dVarA4.f = U1.h.e;
        return C1132s.g(c0859aD, c0859aD2, c0859aD3, dVarA4.d());
    }
}
