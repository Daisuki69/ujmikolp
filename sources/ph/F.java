package ph;

import bg.AbstractC0983W;
import fh.InterfaceC1486b;
import ih.EnumC1604b;
import ih.EnumC1605c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import pg.C2038a;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends lh.l implements Runnable, InterfaceC1486b {
    public final Callable i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f19178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TimeUnit f19179l;
    public final ch.u m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedList f19180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1486b f19181o;

    public F(C2479c c2479c, Callable callable, long j, long j6, TimeUnit timeUnit, ch.u uVar) {
        super(c2479c, new C2038a(9));
        this.i = callable;
        this.j = j;
        this.f19178k = j6;
        this.f19179l = timeUnit;
        this.m = uVar;
        this.f19180n = new LinkedList();
    }

    @Override // lh.l
    public final void A(C2479c c2479c, Object obj) {
        c2479c.onNext((Collection) obj);
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        if (this.f) {
            return;
        }
        this.f = true;
        synchronized (this) {
            this.f19180n.clear();
        }
        this.f19181o.dispose();
        this.m.dispose();
    }

    @Override // ch.r
    public final void onComplete() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f19180n);
            this.f19180n.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.e.offer((Collection) it.next());
        }
        this.f18321g = true;
        if (B()) {
            AbstractC0983W.i(this.e, this.f18320d, this.m, this);
        }
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.f18321g = true;
        synchronized (this) {
            this.f19180n.clear();
        }
        this.f18320d.onError(th2);
        this.m.dispose();
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        synchronized (this) {
            try {
                Iterator it = this.f19180n.iterator();
                while (it.hasNext()) {
                    ((Collection) it.next()).add(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        ch.u uVar = this.m;
        C2479c c2479c = this.f18320d;
        if (EnumC1604b.f(this.f19181o, interfaceC1486b)) {
            this.f19181o = interfaceC1486b;
            try {
                Object objCall = this.i.call();
                jh.e.b(objCall, "The buffer supplied is null");
                Collection collection = (Collection) objCall;
                this.f19180n.add(collection);
                c2479c.onSubscribe(this);
                TimeUnit timeUnit = this.f19179l;
                ch.u uVar2 = this.m;
                long j = this.f19178k;
                uVar2.d(this, j, j, timeUnit);
                uVar.b(new E(this, collection, 1), this.j, this.f19179l);
            } catch (Throwable th2) {
                of.p.F(th2);
                interfaceC1486b.dispose();
                EnumC1605c.c(th2, c2479c);
                uVar.dispose();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f) {
            return;
        }
        try {
            Object objCall = this.i.call();
            jh.e.b(objCall, "The bufferSupplier returned a null buffer");
            Collection collection = (Collection) objCall;
            synchronized (this) {
                try {
                    if (this.f) {
                        return;
                    }
                    this.f19180n.add(collection);
                    this.m.b(new E(this, collection, 0), this.j, this.f19179l);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            of.p.F(th3);
            this.f18320d.onError(th3);
            dispose();
        }
    }
}
