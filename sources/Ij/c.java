package Ij;

import Bj.H;
import Gj.p;
import Gj.t;
import We.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Executor, Closeable, AutoCloseable {
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t f2357k = new t("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2359b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2360d;
    public final f e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f2361g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i4, int i6, String str, long j6) {
        this.f2358a = i4;
        this.f2359b = i6;
        this.c = j6;
        this.f2360d = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(s.g(i4, "Core pool size ", " should be at least 1").toString());
        }
        if (i6 < i4) {
            throw new IllegalArgumentException(androidx.camera.core.impl.a.c(i6, i4, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i6 > 2097150) {
            throw new IllegalArgumentException(s.g(i6, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.i(j6, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.e = new f();
        this.f = new f();
        this.f2361g = new p((i4 + 1) * 2);
        this.controlState$volatile = ((long) i4) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void f(c cVar, Runnable runnable, int i4) {
        cVar.c(runnable, false, (i4 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f2361g) {
            try {
                if (j.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j6 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j6 & 2097151);
                int i6 = i4 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i6 < 0) {
                    i6 = 0;
                }
                if (i6 >= this.f2358a) {
                    return 0;
                }
                if (i4 >= this.f2359b) {
                    return 0;
                }
                int i10 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i10 <= 0 || this.f2361g.b(i10) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i10);
                this.f2361g.c(i10, aVar);
                if (i10 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i11 = i6 + 1;
                aVar.start();
                return i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Runnable runnable, boolean z4, boolean z5) {
        i jVar;
        b bVar;
        k.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f2367a = jNanoTime;
            jVar.f2368b = z4;
        } else {
            jVar = new j(runnable, jNanoTime, z4);
        }
        boolean z8 = jVar.f2368b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long jAddAndGet = z8 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !kotlin.jvm.internal.j.b(aVar.h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.c) != b.e && (jVar.f2368b || bVar != b.f2355b)) {
            aVar.f2353g = true;
            m mVar = aVar.f2350a;
            if (z5) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f2373b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f2368b ? this.f.a(jVar) : this.e.a(jVar))) {
                throw new RejectedExecutionException(s.p(new StringBuilder(), this.f2360d, " was terminated"));
            }
        }
        boolean z9 = z5 && aVar != null;
        if (z8) {
            if (z9 || k() || i(jAddAndGet)) {
                return;
            }
            k();
            return;
        }
        if (z9 || k() || i(atomicLongFieldUpdater.get(this))) {
            return;
        }
        k();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Ij.c.j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof Ij.a
            r3 = 0
            if (r1 == 0) goto L17
            Ij.a r0 = (Ij.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            Ij.c r1 = r0.h
            boolean r1 = kotlin.jvm.internal.j.b(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            Gj.p r1 = r8.f2361g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = Ij.c.i     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            Gj.p r5 = r8.f2361g
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.j.d(r5)
            Ij.a r5 = (Ij.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            Ij.m r5 = r5.f2350a
            Ij.f r6 = r8.f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = Ij.m.f2373b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            Ij.i r7 = (Ij.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            Ij.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            Ij.f r1 = r8.f
            r1.b()
            Ij.f r1 = r8.e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            Ij.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            Ij.f r1 = r8.e
            java.lang.Object r1 = r1.d()
            Ij.i r1 = (Ij.i) r1
            if (r1 != 0) goto Lb2
            Ij.f r1 = r8.f
            java.lang.Object r1 = r1.d()
            Ij.i r1 = (Ij.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            Ij.b r1 = Ij.b.e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Ij.c.h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Ij.c.i
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ij.c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(this, runnable, 6);
    }

    public final void g(a aVar, int i4, int i6) {
        while (true) {
            long j6 = h.get(this);
            int i10 = (int) (2097151 & j6);
            long j7 = (2097152 + j6) & (-2097152);
            if (i10 == i4) {
                if (i6 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f2357k) {
                            i10 = -1;
                            break;
                        }
                        if (objC == null) {
                            i10 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i10 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i10 = i6;
                }
            }
            if (i10 >= 0) {
                if (h.compareAndSet(this, j6, ((long) i10) | j7)) {
                    return;
                }
            }
        }
    }

    public final boolean i(long j6) {
        int i4 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i6 = this.f2358a;
        if (i4 < i6) {
            int iB = b();
            if (iB == 1 && i6 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        t tVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = h;
            long j6 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f2361g.b((int) (2097151 & j6));
            if (aVar == null) {
                aVar = null;
            } else {
                long j7 = (2097152 + j6) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    tVar = f2357k;
                    if (objC == tVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j6, j7 | ((long) iB))) {
                    aVar.g(tVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.i.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f2361g;
        int iA = pVar.a();
        int i4 = 0;
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < iA; i13++) {
            a aVar = (a) pVar.b(i13);
            if (aVar != null) {
                m mVar = aVar.f2350a;
                mVar.getClass();
                int i14 = m.f2373b.get(mVar) != null ? (m.c.get(mVar) - m.f2374d.get(mVar)) + 1 : m.c.get(mVar) - m.f2374d.get(mVar);
                int iOrdinal = aVar.c.ordinal();
                if (iOrdinal == 0) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i14);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i6++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i14);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i10++;
                } else if (iOrdinal == 3) {
                    i11++;
                    if (i14 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i14);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12++;
                }
            }
        }
        long j6 = i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f2360d);
        sb5.append('@');
        sb5.append(H.o(this));
        sb5.append("[Pool Size {core = ");
        int i15 = this.f2358a;
        sb5.append(i15);
        sb5.append(", max = ");
        sb5.append(this.f2359b);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i4);
        sb5.append(", blocking = ");
        sb5.append(i6);
        sb5.append(", parked = ");
        sb5.append(i10);
        sb5.append(", dormant = ");
        sb5.append(i11);
        sb5.append(", terminated = ");
        sb5.append(i12);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j6));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j6) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i15 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
