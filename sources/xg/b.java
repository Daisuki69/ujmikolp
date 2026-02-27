package xg;

import Bj.E;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C1790e;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes11.dex */
public class b implements E {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20989d;
    public static final Rg.a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wg.c f20990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Jg.b f20991b;
    public Kg.c c;
    private volatile /* synthetic */ int received;

    static {
        F fC;
        C1790e c1790eA = z.a(Object.class);
        try {
            fC = z.c(Object.class);
        } catch (Throwable unused) {
            fC = null;
        }
        e = new Rg.a("CustomResponse", new Wg.a(c1790eA, fC));
        f20989d = AtomicIntegerFieldUpdater.newUpdater(b.class, "received");
    }

    public b(wg.c client) {
        j.g(client, "client");
        this.f20990a = client;
        this.received = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r7 == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Wg.a r6, ij.AbstractC1609c r7) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.b.a(Wg.a, ij.c):java.lang.Object");
    }

    public boolean b() {
        return false;
    }

    public final Jg.b c() {
        Jg.b bVar = this.f20991b;
        if (bVar != null) {
            return bVar;
        }
        j.n("request");
        throw null;
    }

    public final Kg.c d() {
        Kg.c cVar = this.c;
        if (cVar != null) {
            return cVar;
        }
        j.n("response");
        throw null;
    }

    public Object e() {
        return d().c();
    }

    @Override // Bj.E
    public final CoroutineContext getCoroutineContext() {
        return d().getCoroutineContext();
    }

    public final Rg.j t() {
        return c().t();
    }

    public final String toString() {
        return "HttpClientCall[" + c().getUrl() + ", " + d().f() + ']';
    }
}
