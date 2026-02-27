package com.google.firebase.datatransport;

import K3.d;
import Z0.g;
import a1.C0620a;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b2.C0859a;
import b2.InterfaceC0860b;
import b2.h;
import b2.n;
import c1.s;
import com.google.firebase.components.ComponentRegistrar;
import df.o;
import java.util.Arrays;
import java.util.List;
import jk.b;
import s2.InterfaceC2233a;
import s2.InterfaceC2234b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(InterfaceC0860b interfaceC0860b) {
        s.b((Context) interfaceC0860b.get(Context.class));
        return s.a().c(C0620a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$1(InterfaceC0860b interfaceC0860b) {
        s.b((Context) interfaceC0860b.get(Context.class));
        return s.a().c(C0620a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$2(InterfaceC0860b interfaceC0860b) {
        s.b((Context) interfaceC0860b.get(Context.class));
        return s.a().c(C0620a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<C0859a> getComponents() {
        byte b8 = 0;
        d dVarB = C0859a.b(g.class);
        dVarB.f2595a = LIBRARY_NAME;
        dVarB.c(h.c(Context.class));
        dVarB.f = new o(19, b8);
        C0859a c0859aD = dVarB.d();
        d dVarA = C0859a.a(new n(InterfaceC2233a.class, g.class));
        dVarA.c(h.c(Context.class));
        dVarA.f = new o(20, b8);
        C0859a c0859aD2 = dVarA.d();
        d dVarA2 = C0859a.a(new n(InterfaceC2234b.class, g.class));
        dVarA2.c(h.c(Context.class));
        dVarA2.f = new o(21, b8);
        return Arrays.asList(c0859aD, c0859aD2, dVarA2.d(), b.e(LIBRARY_NAME, "19.0.0"));
    }
}
