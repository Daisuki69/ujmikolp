package yi;

import Ih.y;
import b1.t;
import bi.C1023a;
import com.google.firebase.messaging.r;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import ki.C1781b;
import o6.C1967a;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f21291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1967a f21292b;
    public final r c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f21293d;
    public final Qi.c e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f21294g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public Future j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bi.a f21295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f21296l;

    public e(C1967a c1967a, r rVar, t tVar, j jVar, Qi.c cVar) {
        h hVar = new h(new C1781b(1));
        this.f21292b = c1967a;
        this.c = rVar;
        this.f21293d = tVar;
        this.f = jVar;
        this.f21294g = hVar;
        Objects.requireNonNull(cVar);
        this.e = cVar;
        this.i = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.f21295k = new Bi.a(tVar, jVar);
        this.f21296l = 60L;
        Boolean bool = Boolean.TRUE;
        Locale locale = Locale.ROOT;
        this.f21291a = new ScheduledThreadPoolExecutor(1, new ki.j(Executors.defaultThreadFactory(), "split-sse_client-%d", new AtomicLong(0L), bool, new C1023a(2)));
    }

    public final void a() {
        t tVar = this.f21293d;
        if (((AtomicInteger) tVar.f8334b).get() == 1 && !((AtomicBoolean) tVar.e).getAndSet(true)) {
            tVar.c();
        }
        Future future = this.j;
        if (future != null && (!future.isDone() || !this.j.isCancelled())) {
            this.j.cancel(true);
        }
        this.j = this.f21291a.submit(new y(this, this.f21296l, 1));
    }

    public final synchronized void b() {
        this.e.t(new Pi.a(Pi.e.STREAMING, System.currentTimeMillis()));
        Ri.a.d("Push notification manager started");
        a();
    }

    public final synchronized void c() {
        Ri.a.d("Shutting down SSE client");
        this.i.set(true);
        Ri.a.d("Disconnecting down SSE client");
        h hVar = this.f21294g;
        String str = hVar.c;
        if (str != null) {
            hVar.f21304a.k(str);
        }
        j jVar = this.f;
        jVar.f21307a.k(jVar.c);
        t tVar = this.f21293d;
        if (!((AtomicBoolean) tVar.e).getAndSet(true)) {
            tVar.c();
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f21291a;
        scheduledThreadPoolExecutor.shutdown();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!scheduledThreadPoolExecutor.awaitTermination(5L, timeUnit)) {
                scheduledThreadPoolExecutor.shutdownNow();
                if (!scheduledThreadPoolExecutor.awaitTermination(5L, timeUnit)) {
                    System.err.println("Sse client pool did not terminate");
                }
            }
        } catch (InterruptedException unused) {
            scheduledThreadPoolExecutor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
