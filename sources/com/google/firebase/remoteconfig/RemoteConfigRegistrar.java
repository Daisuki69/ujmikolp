package com.google.firebase.remoteconfig;

import C2.e;
import K3.d;
import U1.g;
import V1.b;
import W1.a;
import W2.j;
import android.content.Context;
import androidx.annotation.Keep;
import b2.C0859a;
import b2.InterfaceC0860b;
import b2.h;
import b2.n;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static j lambda$getComponents$0(n nVar, InterfaceC0860b interfaceC0860b) {
        b bVar;
        Context context = (Context) interfaceC0860b.get(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) interfaceC0860b.f(nVar);
        g gVar = (g) interfaceC0860b.get(g.class);
        e eVar = (e) interfaceC0860b.get(e.class);
        a aVar = (a) interfaceC0860b.get(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f6212a.containsKey("frc")) {
                    aVar.f6212a.put("frc", new b(aVar.f6213b));
                }
                bVar = (b) aVar.f6212a.get("frc");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new j(context, scheduledExecutorService, gVar, eVar, bVar, interfaceC0860b.d(Y1.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0859a> getComponents() {
        n nVar = new n(a2.b.class, ScheduledExecutorService.class);
        d dVar = new d(j.class, new Class[]{Z2.a.class});
        dVar.f2595a = LIBRARY_NAME;
        dVar.c(h.c(Context.class));
        dVar.c(new h(nVar, 1, 0));
        dVar.c(h.c(g.class));
        dVar.c(h.c(e.class));
        dVar.c(h.c(a.class));
        dVar.c(h.a(Y1.b.class));
        dVar.f = new I2.b(nVar, 1);
        dVar.f(2);
        return Arrays.asList(dVar.d(), jk.b.e(LIBRARY_NAME, "23.0.1"));
    }
}
