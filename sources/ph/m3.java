package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import n4.RunnableC1918b;
import pg.C2038a;
import xh.C2479c;

/* JADX INFO: loaded from: classes4.dex */
public final class m3 extends lh.l implements InterfaceC1486b, Runnable {
    public final long i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TimeUnit f19556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ch.u f19557l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedList f19558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1486b f19559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f19560p;

    public m3(C2479c c2479c, long j, long j6, TimeUnit timeUnit, ch.u uVar, int i) {
        super(c2479c, new C2038a(9));
        this.i = j;
        this.j = j6;
        this.f19556k = timeUnit;
        this.f19557l = uVar;
        this.m = i;
        this.f19558n = new LinkedList();
    }

    public final void F() {
        C2038a c2038a = this.e;
        C2479c c2479c = this.f18320d;
        LinkedList linkedList = this.f19558n;
        int iAddAndGet = 1;
        while (!this.f19560p) {
            boolean z4 = this.f18321g;
            Object objPoll = c2038a.poll();
            boolean z5 = objPoll == null;
            boolean z8 = objPoll instanceof l3;
            if (z4 && (z5 || z8)) {
                c2038a.clear();
                Throwable th2 = this.h;
                if (th2 != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Wh.f) it.next()).onError(th2);
                    }
                } else {
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        ((Wh.f) it2.next()).onComplete();
                    }
                }
                linkedList.clear();
                this.f19557l.dispose();
                return;
            }
            if (z5) {
                iAddAndGet = this.c.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (z8) {
                l3 l3Var = (l3) objPoll;
                if (!l3Var.f19543b) {
                    linkedList.remove(l3Var.f19542a);
                    l3Var.f19542a.onComplete();
                    if (linkedList.isEmpty() && this.f) {
                        this.f19560p = true;
                    }
                } else if (!this.f) {
                    Wh.f fVar = new Wh.f(this.m);
                    linkedList.add(fVar);
                    c2479c.onNext(fVar);
                    this.f19557l.b(new RunnableC1918b(8, this, fVar), this.i, this.f19556k);
                }
            } else {
                Iterator it3 = linkedList.iterator();
                while (it3.hasNext()) {
                    ((Wh.f) it3.next()).onNext(objPoll);
                }
            }
        }
        this.f19559o.dispose();
        c2038a.clear();
        linkedList.clear();
        this.f19557l.dispose();
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f = true;
    }

    @Override // ch.r
    public final void onComplete() {
        this.f18321g = true;
        if (B()) {
            F();
        }
        this.f18320d.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        this.h = th2;
        this.f18321g = true;
        if (B()) {
            F();
        }
        this.f18320d.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (C()) {
            Iterator it = this.f19558n.iterator();
            while (it.hasNext()) {
                ((Wh.f) it.next()).onNext(obj);
            }
            if (this.c.addAndGet(-1) == 0) {
                return;
            }
        } else {
            this.e.offer(obj);
            if (!B()) {
                return;
            }
        }
        F();
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.f19559o, interfaceC1486b)) {
            this.f19559o = interfaceC1486b;
            this.f18320d.onSubscribe(this);
            if (this.f) {
                return;
            }
            Wh.f fVar = new Wh.f(this.m);
            this.f19558n.add(fVar);
            this.f18320d.onNext(fVar);
            this.f19557l.b(new RunnableC1918b(8, this, fVar), this.i, this.f19556k);
            ch.u uVar = this.f19557l;
            long j = this.j;
            uVar.d(this, j, j, this.f19556k);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        l3 l3Var = new l3(new Wh.f(this.m), true);
        if (!this.f) {
            this.e.offer(l3Var);
        }
        if (B()) {
            F();
        }
    }
}
