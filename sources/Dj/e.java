package Dj;

import Bj.C0151l;
import Bj.H;
import Bj.InterfaceC0147j;
import Bj.M0;
import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: classes4.dex */
public class e implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1172b = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1173d = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1174g = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1175a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i4) {
        this.f1175a = i4;
        if (i4 < 0) {
            throw new IllegalArgumentException(We.s.g(i4, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        m mVar = g.f1177a;
        this.bufferEnd$volatile = i4 != 0 ? i4 != Integer.MAX_VALUE ? i4 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f1173d.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (z()) {
            mVar2 = g.f1177a;
            kotlin.jvm.internal.j.e(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f1188s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object C(Dj.e r13, ij.AbstractC1609c r14) {
        /*
            boolean r0 = r14 instanceof Dj.c
            if (r0 == 0) goto L14
            r0 = r14
            Dj.c r0 = (Dj.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            Dj.c r0 = new Dj.c
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f1168a
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            bj.AbstractC1039j.b(r14)
            Dj.l r14 = (Dj.l) r14
            java.lang.Object r13 = r14.f1194a
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            bj.AbstractC1039j.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = Dj.e.f1174g
            java.lang.Object r14 = r14.get(r13)
            Dj.m r14 = (Dj.m) r14
        L40:
            boolean r1 = r13.w()
            if (r1 == 0) goto L50
            java.lang.Throwable r13 = r13.p()
            Dj.j r14 = new Dj.j
            r14.<init>(r13)
            return r14
        L50:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = Dj.e.c
            long r4 = r1.getAndIncrement(r13)
            int r1 = Dj.g.f1178b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.c
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            Dj.m r1 = r13.l(r9, r14)
            if (r1 != 0) goto L6b
            goto L40
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.H(r8, r9, r10, r12)
            r1 = r7
            Gj.t r14 = Dj.g.m
            if (r13 == r14) goto La0
            Gj.t r14 = Dj.g.f1184o
            if (r13 != r14) goto L8d
            long r13 = r1.t()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8a
            r8.b()
        L8a:
            r13 = r1
            r14 = r8
            goto L40
        L8d:
            Gj.t r14 = Dj.g.f1183n
            if (r13 != r14) goto L9c
            r6.c = r2
            r2 = r8
            java.lang.Object r13 = r1.D(r2, r3, r4, r6)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            return r13
        L9c:
            r8.b()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.e.C(Dj.e, ij.c):java.lang.Object");
    }

    public static boolean G(Object obj) {
        if (obj instanceof InterfaceC0147j) {
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return g.a((InterfaceC0147j) obj, Unit.f18162a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final m a(e eVar, long j6, m mVar) {
        Object objB;
        e eVar2;
        eVar.getClass();
        m mVar2 = g.f1177a;
        f fVar = f.f1176a;
        loop0: while (true) {
            objB = Gj.a.b(mVar, j6, fVar);
            if (!Gj.a.e(objB)) {
                Gj.r rVarC = Gj.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    Gj.r rVar = (Gj.r) atomicReferenceFieldUpdater.get(eVar);
                    if (rVar.c >= rVarC.c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = Gj.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        if (zE) {
            eVar.x();
            if (mVar.c * ((long) g.f1178b) < atomicLongFieldUpdater.get(eVar)) {
                mVar.b();
                return null;
            }
        } else {
            m mVar3 = (m) Gj.a.c(objB);
            long j7 = mVar3.c;
            if (j7 <= j6) {
                return mVar3;
            }
            long j9 = ((long) g.f1178b) * j7;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1172b;
                long j10 = atomicLongFieldUpdater2.get(eVar);
                long j11 = 1152921504606846975L & j10;
                if (j11 >= j9) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (atomicLongFieldUpdater2.compareAndSet(eVar2, j10, j11 + (((long) ((int) (j10 >> 60))) << 60))) {
                    break;
                }
                eVar = eVar2;
            }
            if (j7 * ((long) g.f1178b) < atomicLongFieldUpdater.get(eVar2)) {
                mVar3.b();
            }
        }
        return null;
    }

    public static final void c(e eVar, Object obj, C0151l c0151l) {
        eVar.getClass();
        Throwable thR = eVar.r();
        C1037h.a aVar = C1037h.f9166b;
        c0151l.resumeWith(AbstractC1039j.a(thR));
    }

    public static final int e(e eVar, m mVar, int i4, Object obj, long j6, Object obj2, boolean z4) {
        eVar.getClass();
        mVar.n(i4, obj);
        if (z4) {
            return eVar.I(mVar, i4, obj, j6, obj2, z4);
        }
        Object objL = mVar.l(i4);
        if (objL == null) {
            if (eVar.f(j6)) {
                if (mVar.k(i4, null, g.f1179d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.k(i4, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof M0) {
            mVar.n(i4, null);
            if (eVar.F(objL, obj)) {
                mVar.o(i4, g.i);
                return 0;
            }
            Gj.t tVar = g.f1181k;
            if (mVar.f.getAndSet((i4 * 2) + 1, tVar) == tVar) {
                return 5;
            }
            mVar.m(i4, true);
            return 5;
        }
        return eVar.I(mVar, i4, obj, j6, obj2, z4);
    }

    public static void u(e eVar) {
        eVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(long r5, Dj.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            Gj.b r0 = r7.c()
            Dj.m r0 = (Dj.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            Gj.b r5 = r7.c()
            Dj.m r5 = (Dj.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = Dj.e.h
            java.lang.Object r6 = r5.get(r4)
            Gj.r r6 = (Gj.r) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.e.A(long, Dj.m):void");
    }

    public final Object B(InterfaceC1526a interfaceC1526a, Object obj) {
        C0151l c0151l = new C0151l(1, hj.h.b(interfaceC1526a));
        c0151l.r();
        Throwable thR = r();
        C1037h.a aVar = C1037h.f9166b;
        c0151l.resumeWith(AbstractC1039j.a(thR));
        Object objQ = c0151l.q();
        return objQ == EnumC1578a.f17050a ? objQ : Unit.f18162a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(Dj.m r15, int r16, long r17, ij.AbstractC1609c r19) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.e.D(Dj.m, int, long, ij.c):java.lang.Object");
    }

    public final void E(M0 m0, boolean z4) {
        if (m0 instanceof InterfaceC0147j) {
            InterfaceC1526a interfaceC1526a = (InterfaceC1526a) m0;
            C1037h.a aVar = C1037h.f9166b;
            interfaceC1526a.resumeWith(AbstractC1039j.a(z4 ? q() : r()));
            return;
        }
        if (m0 instanceof s) {
            C0151l c0151l = ((s) m0).f1201a;
            C1037h.a aVar2 = C1037h.f9166b;
            c0151l.resumeWith(new l(new j(p())));
            return;
        }
        if (!(m0 instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + m0).toString());
        }
        b bVar = (b) m0;
        C0151l c0151l2 = bVar.f1167b;
        kotlin.jvm.internal.j.d(c0151l2);
        bVar.f1167b = null;
        bVar.f1166a = g.f1182l;
        Throwable thP = bVar.c.p();
        if (thP == null) {
            C1037h.a aVar3 = C1037h.f9166b;
            c0151l2.resumeWith(Boolean.FALSE);
        } else {
            C1037h.a aVar4 = C1037h.f9166b;
            c0151l2.resumeWith(AbstractC1039j.a(thP));
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof s) {
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return g.a(((s) obj).f1201a, new l(obj2), null);
        }
        if (!(obj instanceof b)) {
            if (obj instanceof InterfaceC0147j) {
                kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return g.a((InterfaceC0147j) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0151l c0151l = bVar.f1167b;
        kotlin.jvm.internal.j.d(c0151l);
        bVar.f1167b = null;
        bVar.f1166a = obj2;
        Boolean bool = Boolean.TRUE;
        bVar.c.getClass();
        return g.a(c0151l, bool, null);
    }

    public final Object H(m mVar, int i4, long j6, Object obj) {
        Object objL = mVar.l(i4);
        AtomicReferenceArray atomicReferenceArray = mVar.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1172b;
        if (objL == null) {
            if (j6 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f1183n;
                }
                if (mVar.k(i4, objL, obj)) {
                    k();
                    return g.m;
                }
            }
        } else if (objL == g.f1179d && mVar.k(i4, objL, g.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i4 * 2);
            mVar.n(i4, null);
            return obj2;
        }
        while (true) {
            Object objL2 = mVar.l(i4);
            if (objL2 == null || objL2 == g.e) {
                if (j6 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.k(i4, objL2, g.h)) {
                        k();
                        return g.f1184o;
                    }
                } else {
                    if (obj == null) {
                        return g.f1183n;
                    }
                    if (mVar.k(i4, objL2, obj)) {
                        k();
                        return g.m;
                    }
                }
            } else if (objL2 != g.f1179d) {
                Gj.t tVar = g.j;
                if (objL2 == tVar) {
                    return g.f1184o;
                }
                if (objL2 == g.h) {
                    return g.f1184o;
                }
                if (objL2 == g.f1182l) {
                    k();
                    return g.f1184o;
                }
                if (objL2 != g.f1180g && mVar.k(i4, objL2, g.f)) {
                    boolean z4 = objL2 instanceof v;
                    if (z4) {
                        objL2 = ((v) objL2).f1202a;
                    }
                    if (G(objL2)) {
                        mVar.o(i4, g.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i4 * 2);
                        mVar.n(i4, null);
                        return obj3;
                    }
                    mVar.o(i4, tVar);
                    mVar.i();
                    if (z4) {
                        k();
                    }
                    return g.f1184o;
                }
            } else if (mVar.k(i4, objL2, g.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i4 * 2);
                mVar.n(i4, null);
                return obj4;
            }
        }
    }

    public final int I(m mVar, int i4, Object obj, long j6, Object obj2, boolean z4) {
        while (true) {
            Object objL = mVar.l(i4);
            if (objL == null) {
                if (!f(j6) || z4) {
                    if (z4) {
                        if (mVar.k(i4, null, g.j)) {
                            mVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.k(i4, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.k(i4, null, g.f1179d)) {
                    break;
                }
            } else {
                if (objL != g.e) {
                    Gj.t tVar = g.f1181k;
                    if (objL == tVar) {
                        mVar.n(i4, null);
                        return 5;
                    }
                    if (objL == g.h) {
                        mVar.n(i4, null);
                        return 5;
                    }
                    if (objL == g.f1182l) {
                        mVar.n(i4, null);
                        x();
                        return 4;
                    }
                    mVar.n(i4, null);
                    if (objL instanceof v) {
                        objL = ((v) objL).f1202a;
                    }
                    if (F(objL, obj)) {
                        mVar.o(i4, g.i);
                        return 0;
                    }
                    if (mVar.f.getAndSet((i4 * 2) + 1, tVar) != tVar) {
                        mVar.m(i4, true);
                    }
                    return 5;
                }
                if (mVar.k(i4, objL, g.f1179d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void J(long j6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f1173d;
            if (atomicLongFieldUpdater.get(eVar) > j6) {
                break;
            } else {
                eVar = this;
            }
        }
        int i4 = g.c;
        int i6 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i6 < i4) {
                long j7 = atomicLongFieldUpdater.get(eVar);
                if (j7 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j7 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i6++;
                }
            } else {
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j9, (j9 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(eVar);
                    long j11 = atomicLongFieldUpdater2.get(eVar);
                    long j12 = j11 & 4611686018427387903L;
                    boolean z4 = (j11 & 4611686018427387904L) != 0;
                    if (j10 == j12 && j10 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (!z4) {
                        atomicLongFieldUpdater2.compareAndSet(this, j11, 4611686018427387904L + j12);
                    }
                    eVar = this;
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j13, j13 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    @Override // Dj.t
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    @Override // Dj.t
    public final Object d(Fj.r rVar) {
        return C(this, rVar);
    }

    public final boolean f(long j6) {
        return j6 < f1173d.get(this) || j6 < c.get(this) + ((long) this.f1175a);
    }

    public final boolean g(Throwable th2, boolean z4) {
        e eVar;
        boolean z5;
        long j6;
        long j7;
        long j9;
        Object obj;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1172b;
        if (!z4) {
            eVar = this;
            break;
        }
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (((int) (j11 >> 60)) != 0) {
                eVar = this;
                break;
            }
            m mVar = g.f1177a;
            eVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j11, (j11 & 1152921504606846975L) + (((long) 1) << 60)));
        Gj.t tVar = g.f1188s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, th2)) {
                z5 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != tVar) {
                z5 = false;
                break;
            }
        }
        if (z4) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j10, (((long) 3) << 60) + (j10 & 1152921504606846975L)));
        } else {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j6 >> 60);
                if (i4 == 0) {
                    j7 = j6 & 1152921504606846975L;
                    j9 = 2;
                } else {
                    if (i4 != 1) {
                        break;
                    }
                    j7 = j6 & 1152921504606846975L;
                    j9 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j6, (j9 << 60) + j7));
        }
        x();
        if (z5) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                obj = atomicReferenceFieldUpdater2.get(this);
                Gj.t tVar2 = obj == null ? g.f1186q : g.f1187r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, tVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                D.d(1, obj);
                ((Function1) obj).invoke(p());
                return z5;
            }
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (Dj.m) ((Gj.b) Gj.b.f2006b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Dj.m h(long r13) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.e.h(long):Dj.m");
    }

    public final void i(long j6) {
        m mVar = (m) f1174g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long j7 = atomicLongFieldUpdater.get(this);
            if (j6 < Math.max(((long) this.f1175a) + j7, f1173d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j7, 1 + j7)) {
                long j9 = g.f1178b;
                long j10 = j7 / j9;
                int i4 = (int) (j7 % j9);
                if (mVar.c != j10) {
                    m mVarL = l(j10, mVar);
                    if (mVarL != null) {
                        mVar = mVarL;
                    }
                }
                m mVar2 = mVar;
                if (H(mVar2, i4, j7, null) != g.f1184o || j7 < t()) {
                    mVar2.b();
                }
                mVar = mVar2;
            }
        }
    }

    @Override // Dj.t
    public final b iterator() {
        return new b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf A[SYNTHETIC] */
    @Override // Dj.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = Dj.e.f1172b
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.v(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.f(r1)
            r1 = r1 ^ r10
        L1b:
            Dj.k r13 = Dj.l.f1193b
            if (r1 == 0) goto L20
            return r13
        L20:
            Gj.t r6 = Dj.g.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Dj.e.f
            java.lang.Object r1 = r1.get(r15)
            Dj.m r1 = (Dj.m) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.v(r2, r9)
            int r14 = Dj.g.f1178b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            Dj.m r3 = a(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.r()
            Dj.j r2 = new Dj.j
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = e(r0, r1, r2, r3, r4, r6, r7)
            if (r9 == 0) goto Lbf
            r3 = 1
            if (r9 == r3) goto Lbc
            r10 = 2
            if (r9 == r10) goto L9b
            r2 = 3
            if (r9 == r2) goto L93
            r2 = 4
            if (r9 == r2) goto L7c
            r2 = 5
            if (r9 == r2) goto L76
            goto L79
        L76:
            r1.b()
        L79:
            r10 = r3
            r9 = 0
            goto L56
        L7c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = Dj.e.c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L89
            r1.b()
        L89:
            java.lang.Throwable r1 = r15.r()
            Dj.j r2 = new Dj.j
            r2.<init>(r1)
            return r2
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9b:
            if (r7 == 0) goto Laa
            r1.i()
            java.lang.Throwable r1 = r15.r()
            Dj.j r2 = new Dj.j
            r2.<init>(r1)
            return r2
        Laa:
            boolean r3 = r6 instanceof Bj.M0
            if (r3 == 0) goto Lb1
            Bj.M0 r6 = (Bj.M0) r6
            goto Lb2
        Lb1:
            r6 = 0
        Lb2:
            if (r6 == 0) goto Lb8
            int r2 = r2 + r14
            r6.b(r1, r2)
        Lb8:
            r1.i()
            return r13
        Lbc:
            kotlin.Unit r1 = kotlin.Unit.f18162a
            return r1
        Lbf:
            r1.b()
            kotlin.Unit r1 = kotlin.Unit.f18162a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.e.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        u(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.e.k():void");
    }

    public final m l(long j6, m mVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        m mVar2 = g.f1177a;
        f fVar = f.f1176a;
        loop0: while (true) {
            objB = Gj.a.b(mVar, j6, fVar);
            if (!Gj.a.e(objB)) {
                Gj.r rVarC = Gj.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1174g;
                    Gj.r rVar = (Gj.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.c >= rVarC.c) {
                        break loop0;
                    }
                    if (!rVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (rVarC.f()) {
                                rVarC.e();
                            }
                        }
                    }
                    if (rVar.f()) {
                        rVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (Gj.a.e(objB)) {
            x();
            if (mVar.c * ((long) g.f1178b) < t()) {
                mVar.b();
                return null;
            }
        } else {
            m mVar3 = (m) Gj.a.c(objB);
            boolean z4 = z();
            long j9 = mVar3.c;
            if (!z4 && j6 <= f1173d.get(this) / ((long) g.f1178b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h;
                    Gj.r rVar2 = (Gj.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.c >= j9 || !mVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, mVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (mVar3.f()) {
                                mVar3.e();
                            }
                        }
                    }
                    if (rVar2.f()) {
                        rVar2.e();
                    }
                }
            }
            if (j9 <= j6) {
                return mVar3;
            }
            long j10 = j9 * ((long) g.f1178b);
            do {
                atomicLongFieldUpdater = c;
                j7 = atomicLongFieldUpdater.get(this);
                if (j7 >= j10) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j10));
            if (j9 * ((long) g.f1178b) < t()) {
                mVar3.b();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0195, code lost:
    
        return kotlin.Unit.f18162a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0179 A[RETURN] */
    @Override // Dj.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(gj.InterfaceC1526a r23, java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.e.m(gj.a, java.lang.Object):java.lang.Object");
    }

    @Override // Dj.t
    public final Object n() {
        m mVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c;
        long j6 = atomicLongFieldUpdater.get(this);
        long j7 = f1172b.get(this);
        if (v(j7, true)) {
            return new j(p());
        }
        long j9 = j7 & 1152921504606846975L;
        k kVar = l.f1193b;
        if (j6 >= j9) {
            return kVar;
        }
        Object obj = g.f1181k;
        m mVar2 = (m) f1174g.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = g.f1178b;
            long j11 = andIncrement / j10;
            int i4 = (int) (andIncrement % j10);
            if (mVar2.c != j11) {
                m mVarL = l(j11, mVar2);
                if (mVarL == null) {
                    continue;
                } else {
                    mVar = mVarL;
                }
            } else {
                mVar = mVar2;
            }
            Object objH = H(mVar, i4, andIncrement, obj);
            m mVar3 = mVar;
            if (objH == g.m) {
                M0 m0 = obj instanceof M0 ? (M0) obj : null;
                if (m0 != null) {
                    m0.b(mVar3, i4);
                }
                J(andIncrement);
                mVar3.i();
                return kVar;
            }
            if (objH != g.f1184o) {
                if (objH == g.f1183n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar3.b();
                return objH;
            }
            if (andIncrement < t()) {
                mVar3.b();
            }
            mVar2 = mVar3;
        }
        return new j(p());
    }

    @Override // Dj.u
    public final boolean o(Throwable th2) {
        return g(th2, false);
    }

    public final Throwable p() {
        return (Throwable) i.get(this);
    }

    public final Throwable q() {
        Throwable thP = p();
        return thP == null ? new ClosedReceiveChannelException("Channel was closed") : thP;
    }

    public final Throwable r() {
        Throwable thP = p();
        return thP == null ? new ClosedSendChannelException("Channel was closed") : thP;
    }

    @Override // Dj.t
    public final Object s(AbstractC1609c abstractC1609c) throws Throwable {
        m mVar;
        Throwable th2;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1174g;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!w()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = g.f1178b;
            long j7 = andIncrement / j6;
            int i4 = (int) (andIncrement % j6);
            if (mVar3.c != j7) {
                m mVarL = l(j7, mVar3);
                if (mVarL == null) {
                    continue;
                } else {
                    mVar = mVarL;
                }
            } else {
                mVar = mVar3;
            }
            Object objH = H(mVar, i4, andIncrement, null);
            Gj.t tVar = g.m;
            if (objH == tVar) {
                throw new IllegalStateException("unexpected");
            }
            Gj.t tVar2 = g.f1184o;
            if (objH == tVar2) {
                if (andIncrement < t()) {
                    mVar.b();
                }
                mVar3 = mVar;
            } else {
                if (objH != g.f1183n) {
                    mVar.b();
                    return objH;
                }
                C0151l c0151lQ = H.q(hj.h.b(abstractC1609c));
                e eVar = this;
                try {
                    Object objH2 = eVar.H(mVar, i4, andIncrement, c0151lQ);
                    if (objH2 == tVar) {
                        c0151lQ.b(mVar, i4);
                    } else {
                        if (objH2 == tVar2) {
                            if (andIncrement < t()) {
                                mVar.b();
                            }
                            m mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (w()) {
                                    C1037h.a aVar = C1037h.f9166b;
                                    c0151lQ.resumeWith(AbstractC1039j.a(q()));
                                    break;
                                }
                                C0151l c0151l = c0151lQ;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j9 = g.f1178b;
                                    long j10 = andIncrement2 / j9;
                                    int i6 = (int) (andIncrement2 % j9);
                                    if (mVar4.c != j10) {
                                        try {
                                            m mVarL2 = l(j10, mVar4);
                                            if (mVarL2 == null) {
                                                c0151lQ = c0151l;
                                            } else {
                                                mVar2 = mVarL2;
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            c0151lQ = c0151l;
                                            c0151lQ.z();
                                            throw th2;
                                        }
                                    } else {
                                        mVar2 = mVar4;
                                    }
                                    objH2 = eVar.H(mVar2, i6, andIncrement2, c0151l);
                                    m mVar5 = mVar2;
                                    c0151lQ = c0151l;
                                    if (objH2 == g.m) {
                                        c0151lQ.b(mVar5, i6);
                                        break;
                                    }
                                    if (objH2 == g.f1184o) {
                                        if (andIncrement2 < t()) {
                                            mVar5.b();
                                        }
                                        eVar = this;
                                        mVar4 = mVar5;
                                    } else {
                                        if (objH2 == g.f1183n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar5.b();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c0151lQ = c0151l;
                                    th2 = th;
                                    c0151lQ.z();
                                    throw th2;
                                }
                            }
                        } else {
                            mVar.b();
                        }
                        c0151lQ.e(objH2, null);
                    }
                    Object objQ = c0151lQ.q();
                    EnumC1578a enumC1578a = EnumC1578a.f17050a;
                    return objQ;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
        Throwable thQ = q();
        int i10 = Gj.s.f2030a;
        throw thQ;
    }

    public final long t() {
        return f1172b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x019f, code lost:
    
        r16 = r7;
        r3 = (Dj.m) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a8, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.e.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (Dj.m) ((Gj.b) Gj.b.f2006b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(long r15, boolean r17) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dj.e.v(long, boolean):boolean");
    }

    public final boolean w() {
        return v(f1172b.get(this), true);
    }

    public final boolean x() {
        return v(f1172b.get(this), false);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j6 = f1173d.get(this);
        return j6 == 0 || j6 == Long.MAX_VALUE;
    }
}
