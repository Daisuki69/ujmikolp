package com.google.firebase.perf;

import C.h;
import C2.e;
import C2.f;
import G6.v;
import G6.w;
import I2.a;
import I2.b;
import I2.d;
import J2.c;
import T2.i;
import U1.g;
import W2.j;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import b2.C0859a;
import b2.InterfaceC0860b;
import b2.n;
import cg.C1100a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.r;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import n2.C1915b;
import n3.C1916a;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(n nVar, InterfaceC0860b interfaceC0860b) {
        g gVar = (g) interfaceC0860b.get(g.class);
        U1.a aVar = (U1.a) interfaceC0860b.d(U1.a.class).get();
        Executor executor = (Executor) interfaceC0860b.f(nVar);
        a aVar2 = new a();
        gVar.a();
        Context context = gVar.f5904a;
        K2.a aVarE = K2.a.e();
        aVarE.getClass();
        K2.a.f2560d.f3046b = i.a(context);
        aVarE.c.c(context);
        c cVarA = c.a();
        synchronized (cVarA) {
            if (!cVarA.f2402p) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(cVarA);
                    cVarA.f2402p = true;
                }
            }
        }
        cVarA.c(new d());
        if (aVar != null) {
            AppStartTrace appStartTraceB = AppStartTrace.b();
            appStartTraceB.f(context);
            executor.execute(new h(appStartTraceB, 4));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static I2.c providesFirebasePerformance(InterfaceC0860b interfaceC0860b) {
        interfaceC0860b.get(a.class);
        r rVar = new r((g) interfaceC0860b.get(g.class), (e) interfaceC0860b.get(e.class), interfaceC0860b.d(j.class), interfaceC0860b.d(Z0.g.class), 3);
        return (I2.c) ((C1100a) C1100a.a(new C1915b(new Gb.d(rVar, 4), new Gc.h(rVar, 2), new v(rVar, 6), new w(rVar, 6), new mg.c(rVar), new N4.d(rVar), new C1916a(rVar, 5), 1))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0859a> getComponents() {
        n nVar = new n(a2.d.class, Executor.class);
        K3.d dVarB = C0859a.b(I2.c.class);
        dVarB.f2595a = LIBRARY_NAME;
        dVarB.c(b2.h.c(g.class));
        dVarB.c(new b2.h(1, 1, j.class));
        dVarB.c(b2.h.c(e.class));
        dVarB.c(new b2.h(1, 1, Z0.g.class));
        dVarB.c(b2.h.c(a.class));
        dVarB.f = new f(5);
        C0859a c0859aD = dVarB.d();
        K3.d dVarB2 = C0859a.b(a.class);
        dVarB2.f2595a = EARLY_LIBRARY_NAME;
        dVarB2.c(b2.h.c(g.class));
        dVarB2.c(b2.h.a(U1.a.class));
        dVarB2.c(new b2.h(nVar, 1, 0));
        dVarB2.f(2);
        dVarB2.f = new b(nVar, 0);
        return Arrays.asList(c0859aD, dVarB2.d(), jk.b.e(LIBRARY_NAME, "22.0.2"));
    }
}
