package Bi;

import androidx.core.util.Consumer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements e, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f579a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f580b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f581d = new AtomicBoolean(false);
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    @Override // Bi.e
    public final synchronized void a(Yh.a aVar) {
        try {
            b bVar = (b) this.e.get(aVar);
            if (bVar != null) {
                bVar.e();
                bVar.destroy();
            }
            this.e.remove(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Bi.b
    public final void b() {
        h(new f(1));
        this.f580b.set(true);
    }

    @Override // Bi.b
    public final synchronized void c() {
        h(new f(4));
        this.f579a.set(true);
    }

    @Override // Bi.b
    public final void d() {
        h(new f(2));
    }

    @Override // Bi.b
    public final synchronized void destroy() {
        h(new f(0));
    }

    @Override // Bi.b
    public final synchronized void e() {
        h(new f(3));
        this.c.set(false);
        this.f581d.set(true);
    }

    @Override // Bi.e
    public final synchronized void f(Yh.a aVar, d dVar) {
        this.e.put(aVar, dVar);
        if (this.f579a.get()) {
            dVar.c();
        }
        if (this.f580b.get()) {
            dVar.b();
        }
        if (this.c.get()) {
            dVar.g();
        }
    }

    @Override // Bi.b
    public final synchronized void g() {
        h(new f(5));
        this.c.set(true);
    }

    public final void h(Consumer consumer) {
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            consumer.accept((b) it.next());
        }
    }
}
