package ph;

import bg.AbstractC0983W;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import pg.C2038a;
import xh.C2479c;

/* JADX INFO: renamed from: ph.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2047D extends lh.l implements Runnable, InterfaceC1486b {
    public final Callable i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TimeUnit f19146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ch.v f19147l;
    public InterfaceC1486b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Collection f19148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicReference f19149o;

    public RunnableC2047D(C2479c c2479c, Callable callable, long j, TimeUnit timeUnit, ch.v vVar) {
        super(c2479c, new C2038a(9));
        this.f19149o = new AtomicReference();
        this.i = callable;
        this.j = j;
        this.f19146k = timeUnit;
        this.f19147l = vVar;
    }

    @Override // lh.l
    public final void A(C2479c c2479c, Object obj) {
        this.f18320d.onNext((Collection) obj);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        EnumC1604b.a(this.f19149o);
        this.m.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        Collection collection;
        synchronized (this) {
            collection = this.f19148n;
            this.f19148n = null;
        }
        if (collection != null) {
            this.e.offer(collection);
            this.f18321g = true;
            if (B()) {
                AbstractC0983W.i(this.e, this.f18320d, null, this);
            }
        }
        EnumC1604b.a(this.f19149o);
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        synchronized (this) {
            this.f19148n = null;
        }
        this.f18320d.onError(th2);
        EnumC1604b.a(this.f19149o);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        synchronized (this) {
            try {
                Collection collection = this.f19148n;
                if (collection == null) {
                    return;
                }
                collection.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.m, interfaceC1486b)) {
            this.m = interfaceC1486b;
            try {
                Object objCall = this.i.call();
                jh.e.b(objCall, "The buffer supplied is null");
                this.f19148n = (Collection) objCall;
                this.f18320d.onSubscribe(this);
                if (!this.f) {
                    ch.v vVar = this.f19147l;
                    long j = this.j;
                    InterfaceC1486b interfaceC1486bF = vVar.f(this, j, j, this.f19146k);
                    AtomicReference atomicReference = this.f19149o;
                    while (!atomicReference.compareAndSet(null, interfaceC1486bF)) {
                        if (atomicReference.get() != null) {
                            interfaceC1486bF.dispose();
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                of.p.F(th2);
                dispose();
                EnumC1605c.c(th2, this.f18320d);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Collection collection;
        try {
            Object objCall = this.i.call();
            jh.e.b(objCall, "The bufferSupplier returned a null buffer");
            Collection collection2 = (Collection) objCall;
            synchronized (this) {
                try {
                    collection = this.f19148n;
                    if (collection != null) {
                        this.f19148n = collection2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (collection == null) {
                EnumC1604b.a(this.f19149o);
            } else {
                D(collection, this);
            }
        } catch (Throwable th3) {
            of.p.F(th3);
            this.f18320d.onError(th3);
            dispose();
        }
    }
}
