package Gj;

import Bj.A;
import Bj.C0151l;
import Bj.G0;
import Bj.J;
import Bj.M;
import Bj.W;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends A implements M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2011g = AtomicIntegerFieldUpdater.newUpdater(f.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f2012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f2013b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2014d;
    public final j e;
    public final Object f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public f(A a8, int i, String str) {
        M m = a8 instanceof M ? (M) a8 : null;
        this.f2012a = m == null ? J.f595a : m;
        this.f2013b = a8;
        this.c = i;
        this.f2014d = str;
        this.e = new j();
        this.f = new Object();
    }

    public final boolean B() {
        synchronized (this.f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2011g;
            if (atomicIntegerFieldUpdater.get(this) >= this.c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // Bj.A
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableT;
        this.e.a(runnable);
        if (f2011g.get(this) >= this.c || !B() || (runnableT = t()) == null) {
            return;
        }
        this.f2013b.dispatch(this, new S1.v(5, this, runnableT, false));
    }

    @Override // Bj.A
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableT;
        this.e.a(runnable);
        if (f2011g.get(this) >= this.c || !B() || (runnableT = t()) == null) {
            return;
        }
        this.f2013b.dispatchYield(this, new S1.v(5, this, runnableT, false));
    }

    @Override // Bj.A
    public final A limitedParallelism(int i, String str) {
        a.a(i);
        return i >= this.c ? str != null ? new n(this, str) : this : super.limitedParallelism(i, str);
    }

    @Override // Bj.M
    public final void m(long j, C0151l c0151l) {
        this.f2012a.m(j, c0151l);
    }

    @Override // Bj.M
    public final W r(long j, G0 g02, CoroutineContext coroutineContext) {
        return this.f2012a.r(j, g02, coroutineContext);
    }

    public final Runnable t() {
        while (true) {
            Runnable runnable = (Runnable) this.e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2011g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // Bj.A
    public final String toString() {
        String str = this.f2014d;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2013b);
        sb2.append(".limitedParallelism(");
        return We.s.m(sb2, this.c, ')');
    }
}
