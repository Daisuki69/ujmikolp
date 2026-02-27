package Bj;

import cj.C1124j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: Bj.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0136d0 extends AbstractC0138e0 implements M {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(AbstractC0136d0.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0136d0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f613g = AtomicIntegerFieldUpdater.newUpdater(AbstractC0136d0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // Bj.AbstractC0138e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E() {
        /*
            r10 = this;
            boolean r0 = r10.F()
            r1 = 0
            if (r0 == 0) goto La
            goto Lb1
        La:
            r10.I()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Bj.AbstractC0136d0.e
            java.lang.Object r3 = r0.get(r10)
            Gj.t r4 = Bj.H.c
            r5 = 0
            if (r3 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r3 instanceof Gj.l
            if (r6 == 0) goto L3e
            r6 = r3
            Gj.l r6 = (Gj.l) r6
            java.lang.Object r7 = r6.d()
            Gj.t r8 = Gj.l.f2020g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            Gj.l r6 = r6.c()
        L30:
            boolean r4 = r0.compareAndSet(r10, r3, r6)
            if (r4 == 0) goto L37
            goto Ld
        L37:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == r3) goto L30
            goto Ld
        L3e:
            if (r3 != r4) goto L41
            goto L18
        L41:
            boolean r6 = r0.compareAndSet(r10, r3, r5)
            if (r6 == 0) goto Lb7
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r1
        L50:
            cj.j r3 = r10.c
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L62
            goto L59
        L62:
            r8 = r1
        L63:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L68
            goto Lb1
        L68:
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L90
            boolean r3 = r0 instanceof Gj.l
            if (r3 == 0) goto L8d
            Gj.l r0 = (Gj.l) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = Gj.l.f
            long r3 = r3.get(r0)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r3
            int r0 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r8
            r8 = 30
            long r3 = r3 >> r8
            int r3 = (int) r3
            if (r0 != r3) goto L8c
            goto L90
        L8c:
            return r1
        L8d:
            if (r0 != r4) goto Lb1
            goto Lb6
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Bj.AbstractC0136d0.f
            java.lang.Object r0 = r0.get(r10)
            Bj.c0 r0 = (Bj.C0134c0) r0
            if (r0 == 0) goto Lb6
            monitor-enter(r0)
            Bj.b0[] r3 = r0.f2041a     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La2
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lb3
        La2:
            monitor-exit(r0)
            if (r5 != 0) goto La6
            goto Lb6
        La6:
            long r3 = r5.f609a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb2
        Lb1:
            return r1
        Lb2:
            return r3
        Lb3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lb6:
            return r6
        Lb7:
            java.lang.Object r6 = r0.get(r10)
            if (r6 == r3) goto L41
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Bj.AbstractC0136d0.E():long");
    }

    public void H(Runnable runnable) {
        I();
        if (!J(runnable)) {
            I.h.H(runnable);
            return;
        }
        Thread threadC = C();
        if (Thread.currentThread() != threadC) {
            LockSupport.unpark(threadC);
        }
    }

    public final void I() {
        AbstractRunnableC0132b0 abstractRunnableC0132b0C;
        C0134c0 c0134c0 = (C0134c0) f.get(this);
        if (c0134c0 == null || Gj.y.f2040b.get(c0134c0) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c0134c0) {
                try {
                    AbstractRunnableC0132b0[] abstractRunnableC0132b0Arr = c0134c0.f2041a;
                    AbstractRunnableC0132b0 abstractRunnableC0132b0 = abstractRunnableC0132b0Arr != null ? abstractRunnableC0132b0Arr[0] : null;
                    if (abstractRunnableC0132b0 != null) {
                        abstractRunnableC0132b0C = ((jNanoTime - abstractRunnableC0132b0.f609a) > 0L ? 1 : ((jNanoTime - abstractRunnableC0132b0.f609a) == 0L ? 0 : -1)) >= 0 ? J(abstractRunnableC0132b0) : false ? c0134c0.c(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (abstractRunnableC0132b0C != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Bj.AbstractC0136d0.e
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Bj.AbstractC0136d0.f613g
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L16
            goto L50
        L16:
            if (r1 != 0) goto L27
        L18:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L20
            goto L67
        L20:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L18
            goto L0
        L27:
            boolean r2 = r1 instanceof Gj.l
            if (r2 == 0) goto L4c
            r2 = r1
            Gj.l r2 = (Gj.l) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L67
            if (r5 == r4) goto L3a
            r0 = 2
            if (r5 == r0) goto L50
            goto L0
        L3a:
            Gj.l r2 = r2.c()
        L3e:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L45
            goto L0
        L45:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L3e
            goto L0
        L4c:
            Gj.t r2 = Bj.H.c
            if (r1 != r2) goto L51
        L50:
            return r3
        L51:
            Gj.l r2 = new Gj.l
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r7)
        L61:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L68
        L67:
            return r4
        L68:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L61
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Bj.AbstractC0136d0.J(java.lang.Runnable):boolean");
    }

    public final boolean K() {
        C0134c0 c0134c0;
        C1124j c1124j = this.c;
        if (!(c1124j != null ? c1124j.isEmpty() : true) || ((c0134c0 = (C0134c0) f.get(this)) != null && Gj.y.f2040b.get(c0134c0) != 0)) {
            return false;
        }
        Object obj = e.get(this);
        if (obj != null) {
            if (obj instanceof Gj.l) {
                long j = Gj.l.f.get((Gj.l) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != H.c) {
                return false;
            }
        }
        return true;
    }

    public final void L(long j, AbstractRunnableC0132b0 abstractRunnableC0132b0) {
        int iC;
        Thread threadC;
        boolean z4 = f613g.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (z4) {
            iC = 1;
        } else {
            C0134c0 c0134c0 = (C0134c0) atomicReferenceFieldUpdater.get(this);
            if (c0134c0 == null) {
                C0134c0 c0134c02 = new C0134c0();
                c0134c02.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0134c02) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.j.d(obj);
                c0134c0 = (C0134c0) obj;
            }
            iC = abstractRunnableC0132b0.c(j, c0134c0, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                G(j, abstractRunnableC0132b0);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C0134c0 c0134c03 = (C0134c0) atomicReferenceFieldUpdater.get(this);
        if (c0134c03 != null) {
            synchronized (c0134c03) {
                AbstractRunnableC0132b0[] abstractRunnableC0132b0Arr = c0134c03.f2041a;
                abstractRunnableC0132b0 = abstractRunnableC0132b0Arr != null ? abstractRunnableC0132b0Arr[0] : null;
            }
        }
        if (abstractRunnableC0132b0 != abstractRunnableC0132b0 || Thread.currentThread() == (threadC = C())) {
            return;
        }
        LockSupport.unpark(threadC);
    }

    @Override // Bj.A
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        H(runnable);
    }

    @Override // Bj.M
    public final void m(long j, C0151l c0151l) {
        long j6 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j6 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            Z z4 = new Z(this, j6 + jNanoTime, c0151l);
            L(jNanoTime, z4);
            c0151l.v(new C0143h(z4, 2));
        }
    }

    public W r(long j, G0 g02, CoroutineContext coroutineContext) {
        return J.f595a.r(j, g02, coroutineContext);
    }

    @Override // Bj.AbstractC0138e0
    public void shutdown() {
        AbstractRunnableC0132b0 abstractRunnableC0132b0C;
        F0.f588a.set(null);
        f613g.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            Gj.t tVar = H.c;
            if (obj != null) {
                if (!(obj instanceof Gj.l)) {
                    if (obj != tVar) {
                        Gj.l lVar = new Gj.l(8, true);
                        lVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((Gj.l) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (E() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C0134c0 c0134c0 = (C0134c0) f.get(this);
            if (c0134c0 == null) {
                return;
            }
            synchronized (c0134c0) {
                abstractRunnableC0132b0C = Gj.y.f2040b.get(c0134c0) > 0 ? c0134c0.c(0) : null;
            }
            if (abstractRunnableC0132b0C == null) {
                return;
            } else {
                G(jNanoTime, abstractRunnableC0132b0C);
            }
        }
    }
}
