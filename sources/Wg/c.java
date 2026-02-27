package wg;

import Bg.AbstractC0109f;
import Bg.AbstractC0115l;
import Bg.AbstractC0123u;
import Bg.C0104a;
import Bg.C0118o;
import Bg.D;
import Bg.F;
import Bg.L;
import Bg.P;
import Bg.Q;
import Bg.V;
import Bg.W;
import Bj.C0154m0;
import Bj.E;
import Bj.InterfaceC0156n0;
import Bj.o0;
import Gc.h;
import Jg.f;
import Rg.j;
import cj.C1110A;
import com.paymaya.domain.store.H0;
import gj.InterfaceC1526a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import zg.AbstractC2570e;
import zg.InterfaceC2568c;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements E, Closeable, AutoCloseable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20786l = AtomicIntegerFieldUpdater.newUpdater(c.class, "closed");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2568c f20787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20788b;
    public final o0 c;
    private volatile /* synthetic */ int closed;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f20789d;
    public final f e;
    public final Kg.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f20790g;
    public final Kg.b h;
    public final j i;
    public final h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f20791k;

    public c(InterfaceC2568c engine, d dVar) {
        int i = 1;
        int i4 = 26;
        kotlin.jvm.internal.j.g(engine, "engine");
        this.f20787a = engine;
        this.closed = 0;
        o0 o0Var = new o0((InterfaceC0156n0) engine.getCoroutineContext().get(C0154m0.f630a));
        this.c = o0Var;
        this.f20789d = engine.getCoroutineContext().plus(o0Var);
        this.e = new f(0);
        this.f = new Kg.b(1);
        f fVar = new f(1);
        this.f20790g = fVar;
        this.h = new Kg.b(0);
        this.i = new j();
        this.j = new h(19);
        d dVar2 = new d();
        this.f20791k = dVar2;
        if (this.f20788b) {
            o0Var.i(new C2438a(this));
        }
        InterfaceC1526a interfaceC1526a = null;
        fVar.f(f.f2532o, new V(this, (AbstractC2570e) engine, null));
        fVar.f(f.f2533p, new C0104a(this, interfaceC1526a, 8));
        dVar2.a(Q.f494b, new H0(i4));
        dVar2.a(AbstractC0109f.c, new H0(i4));
        dVar2.a(AbstractC0123u.c, new H0(i4));
        if (dVar.f20793b) {
            ((LinkedHashMap) dVar2.f).put("DefaultTransformers", new H0(24));
        }
        dVar2.a(W.f504b, new H0(i4));
        Cg.c cVar = D.f473b;
        dVar2.a(cVar, new H0(i4));
        if (dVar.f20792a) {
            dVar2.a(P.f492d, new H0(i4));
        }
        dVar2.f20792a = dVar.f20792a;
        dVar2.f20793b = dVar.f20793b;
        dVar2.c = dVar.c;
        ((LinkedHashMap) dVar2.f20794d).putAll((LinkedHashMap) dVar.f20794d);
        ((LinkedHashMap) dVar2.e).putAll((LinkedHashMap) dVar.e);
        ((LinkedHashMap) dVar2.f).putAll((LinkedHashMap) dVar.f);
        if (dVar.f20793b) {
            dVar2.a(L.f484b, new H0(i4));
        }
        Rg.a aVar = AbstractC0115l.f540a;
        dVar2.a(cVar, new Ag.d(dVar2, i));
        Iterator it = ((LinkedHashMap) dVar2.f20794d).values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
        Iterator it2 = ((LinkedHashMap) dVar2.f).values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(this);
        }
        this.f.f(Kg.b.j, new C0118o(this, interfaceC1526a, 6));
        this.f20788b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(Jg.c r5, ij.AbstractC1609c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wg.b
            if (r0 == 0) goto L13
            r0 = r6
            wg.b r0 = (wg.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wg.b r0 = new wg.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f20784a
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            bj.AbstractC1039j.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            bj.AbstractC1039j.b(r6)
            z2.d r6 = Lg.a.f2982a
            Gc.h r2 = r4.j
            r2.j(r6)
            java.lang.Object r6 = r5.f2522d
            r0.c = r3
            Jg.f r2 = r4.e
            java.lang.Object r6 = r2.a(r5, r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            kotlin.jvm.internal.j.e(r6, r5)
            xg.b r6 = (xg.b) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.c.b(Jg.c, ij.c):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (f20786l.compareAndSet(this, 0, 1)) {
            j jVar = (j) this.i.c(F.f474a);
            for (Rg.a aVar : C1110A.V(jVar.d().keySet())) {
                kotlin.jvm.internal.j.e(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objC = jVar.c(aVar);
                if (objC instanceof Closeable) {
                    ((Closeable) objC).close();
                }
            }
            this.c.h0();
            if (this.f20788b) {
                this.f20787a.close();
            }
        }
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        return this.f20789d;
    }

    public final String toString() {
        return "HttpClient[" + this.f20787a + ']';
    }
}
