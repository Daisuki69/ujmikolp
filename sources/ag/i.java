package Ag;

import Bg.X;
import Bj.C0144h0;
import Bj.C0154m0;
import Bj.F;
import Bj.H;
import Bj.InterfaceC0156n0;
import Bj.InterfaceC0160s;
import Bj.o0;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1129o;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import zg.AbstractC2570e;
import zg.AbstractC2573h;
import zg.InterfaceC2571f;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC2570e {
    public static final InterfaceC1033d j = C1034e.b(new A5.j(1));
    public final c e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineContext f291g;
    public final CoroutineContext h;
    public final Map i;

    public i(c cVar) {
        super("ktor-okhttp");
        this.e = cVar;
        this.f = C1129o.C(new InterfaceC2571f[]{X.f506a, Ig.a.f2295a, Hg.a.f2172a});
        Map mapSynchronizedMap = Collections.synchronizedMap(new Rg.o(new f(1, this, i.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0, 0), new a(1)));
        kotlin.jvm.internal.j.f(mapSynchronizedMap, "synchronizedMap(...)");
        this.i = mapSynchronizedMap;
        CoroutineContext.Element element = super.getCoroutineContext().get(C0154m0.f630a);
        kotlin.jvm.internal.j.d(element);
        CoroutineContext coroutineContextB = S1.s.b((InterfaceC0156n0) element);
        this.f291g = coroutineContextB;
        this.h = super.getCoroutineContext().plus(coroutineContextB);
        H.v(C0144h0.f623a, super.getCoroutineContext(), F.c, new e(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(okhttp3.OkHttpClient r18, okhttp3.Request r19, kotlin.coroutines.CoroutineContext r20, Jg.d r21, ij.AbstractC1609c r22) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ag.i.b(okhttp3.OkHttpClient, okhttp3.Request, kotlin.coroutines.CoroutineContext, Jg.d, ij.c):java.lang.Object");
    }

    @Override // zg.AbstractC2570e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        CoroutineContext.Element element = this.f291g.get(C0154m0.f630a);
        kotlin.jvm.internal.j.e(element, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((o0) ((InterfaceC0160s) element)).h0();
    }

    @Override // zg.InterfaceC2568c
    public final AbstractC2573h getConfig() {
        return this.e;
    }

    @Override // zg.AbstractC2570e, Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // zg.InterfaceC2568c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(Jg.d r13, ij.AbstractC1609c r14) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ag.i.h(Jg.d, ij.c):java.lang.Object");
    }

    @Override // zg.AbstractC2570e, zg.InterfaceC2568c
    public final Set p() {
        return this.f;
    }
}
