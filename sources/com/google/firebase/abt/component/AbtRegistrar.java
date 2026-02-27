package com.google.firebase.abt.component;

import C2.f;
import K3.d;
import W1.a;
import Y1.b;
import android.content.Context;
import androidx.annotation.Keep;
import b2.C0859a;
import b2.InterfaceC0860b;
import b2.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(InterfaceC0860b interfaceC0860b) {
        return new a((Context) interfaceC0860b.get(Context.class), interfaceC0860b.d(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0859a> getComponents() {
        d dVarB = C0859a.b(a.class);
        dVarB.f2595a = LIBRARY_NAME;
        dVarB.c(h.c(Context.class));
        dVarB.c(h.a(b.class));
        dVarB.f = new f(18);
        return Arrays.asList(dVarB.d(), jk.b.e(LIBRARY_NAME, "21.1.1"));
    }
}
