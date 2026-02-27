package Bj;

import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.InterfaceC1610d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: renamed from: Bj.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0151l extends Q implements InterfaceC0147j, InterfaceC1610d, M0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C0151l.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f628g = AtomicReferenceFieldUpdater.newUpdater(C0151l.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0151l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1526a f629d;
    public final CoroutineContext e;

    public C0151l(int i, InterfaceC1526a interfaceC1526a) {
        super(i);
        this.f629d = interfaceC1526a;
        this.e = interfaceC1526a.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0131b.f608a;
    }

    public static Object D(z0 z0Var, Object obj, int i, qj.n nVar) {
        if (obj instanceof C0162u) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (nVar != null || (z0Var instanceof InterfaceC0145i)) {
            return new C0161t(obj, z0Var instanceof InterfaceC0145i ? (InterfaceC0145i) z0Var : null, nVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(z0 z0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + z0Var + ", already has " + obj).toString());
    }

    public final void A(Function1 function1, Object obj) {
        B(obj, this.c, new C0149k(function1, 0));
    }

    public final void B(Object obj, int i, qj.n nVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f628g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z0) {
                Object objD = D((z0) obj2, obj, i, nVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    n();
                }
                o(i);
                return;
            }
            if (obj2 instanceof C0153m) {
                C0153m c0153m = (C0153m) obj2;
                c0153m.getClass();
                if (C0153m.c.compareAndSet(c0153m, 0, 1)) {
                    if (nVar != null) {
                        k(nVar, c0153m.f642a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void C(A a8, Unit unit) {
        InterfaceC1526a interfaceC1526a = this.f629d;
        Gj.e eVar = interfaceC1526a instanceof Gj.e ? (Gj.e) interfaceC1526a : null;
        B(unit, (eVar != null ? eVar.f2009d : null) == a8 ? 4 : this.c, null);
    }

    public final Gj.t E(Object obj, qj.n nVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f628g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj2 instanceof z0;
            Gj.t tVar = H.f589a;
            if (!z4) {
                boolean z5 = obj2 instanceof C0161t;
                return null;
            }
            Object objD = D((z0) obj2, obj, this.c, nVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                n();
            }
            return tVar;
        }
    }

    @Override // Bj.InterfaceC0147j
    public final boolean a(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f628g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z0)) {
                return false;
            }
            C0153m c0153m = new C0153m(this, th2, (obj instanceof InterfaceC0145i) || (obj instanceof Gj.r));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0153m)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            z0 z0Var = (z0) obj;
            if (z0Var instanceof InterfaceC0145i) {
                j((InterfaceC0145i) obj, th2);
            } else if (z0Var instanceof Gj.r) {
                m((Gj.r) obj, th2);
            }
            if (!w()) {
                n();
            }
            o(this.c);
            return true;
        }
    }

    @Override // Bj.M0
    public final void b(Gj.r rVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i));
        v(rVar);
    }

    @Override // Bj.Q
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f628g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof z0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0162u) {
                return;
            }
            if (!(obj instanceof C0161t)) {
                cancellationException2 = cancellationException;
                C0161t c0161t = new C0161t(obj, (InterfaceC0145i) null, (qj.n) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0161t)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0161t c0161t2 = (C0161t) obj;
            if (c0161t2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0161t c0161tA = C0161t.a(c0161t2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0161tA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC0145i interfaceC0145i = c0161t2.f637b;
            if (interfaceC0145i != null) {
                j(interfaceC0145i, cancellationException);
            }
            qj.n nVar = c0161t2.c;
            if (nVar != null) {
                k(nVar, cancellationException, c0161t2.f636a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // Bj.Q
    public final InterfaceC1526a d() {
        return this.f629d;
    }

    @Override // Bj.InterfaceC0147j
    public final void e(Object obj, qj.n nVar) {
        B(obj, this.c, nVar);
    }

    @Override // Bj.Q
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // Bj.Q
    public final Object g(Object obj) {
        return obj instanceof C0161t ? ((C0161t) obj).f636a : obj;
    }

    @Override // ij.InterfaceC1610d
    public final InterfaceC1610d getCallerFrame() {
        InterfaceC1526a interfaceC1526a = this.f629d;
        if (interfaceC1526a instanceof InterfaceC1610d) {
            return (InterfaceC1610d) interfaceC1526a;
        }
        return null;
    }

    @Override // gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // Bj.Q
    public final Object i() {
        return f628g.get(this);
    }

    public final void j(InterfaceC0145i interfaceC0145i, Throwable th2) {
        try {
            interfaceC0145i.a(th2);
        } catch (Throwable th3) {
            H.r(this.e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void k(qj.n nVar, Throwable th2, Object obj) {
        CoroutineContext coroutineContext = this.e;
        try {
            nVar.invoke(th2, obj, coroutineContext);
        } catch (Throwable th3) {
            H.r(coroutineContext, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // Bj.InterfaceC0147j
    public final Gj.t l(Object obj, qj.n nVar) {
        return E(obj, nVar);
    }

    public final void m(Gj.r rVar, Throwable th2) {
        CoroutineContext coroutineContext = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.h(i, coroutineContext);
        } catch (Throwable th3) {
            H.r(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        W w6 = (W) atomicReferenceFieldUpdater.get(this);
        if (w6 == null) {
            return;
        }
        w6.dispose();
        atomicReferenceFieldUpdater.set(this, y0.f648a);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i6 = i4 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC1526a interfaceC1526a = this.f629d;
                boolean z4 = i == 4;
                if (!z4 && (interfaceC1526a instanceof Gj.e)) {
                    boolean z5 = i == 1 || i == 2;
                    int i10 = this.c;
                    if (z5 == (i10 == 1 || i10 == 2)) {
                        Gj.e eVar = (Gj.e) interfaceC1526a;
                        A a8 = eVar.f2009d;
                        CoroutineContext context = eVar.e.getContext();
                        if (a8.isDispatchNeeded(context)) {
                            a8.dispatch(context, this);
                            return;
                        }
                        AbstractC0138e0 abstractC0138e0A = F0.a();
                        if (abstractC0138e0A.f617a >= 4294967296L) {
                            abstractC0138e0A.B(this);
                            return;
                        }
                        abstractC0138e0A.D(true);
                        try {
                            S.a(this, interfaceC1526a, true);
                            do {
                            } while (abstractC0138e0A.F());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                S.a(this, interfaceC1526a, z4);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable p(u0 u0Var) {
        return u0Var.g();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zW = w();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i4 = i >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zW) {
                    z();
                }
                Object obj = f628g.get(this);
                if (obj instanceof C0162u) {
                    throw ((C0162u) obj).f642a;
                }
                int i6 = this.c;
                if (i6 == 1 || i6 == 2) {
                    InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) this.e.get(C0154m0.f630a);
                    if (interfaceC0156n0 != null && !interfaceC0156n0.isActive()) {
                        CancellationException cancellationExceptionG = interfaceC0156n0.g();
                        c(cancellationExceptionG);
                        throw cancellationExceptionG;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE + (536870911 & i)));
        if (((W) h.get(this)) == null) {
            s();
        }
        if (zW) {
            z();
        }
        return EnumC1578a.f17050a;
    }

    public final void r() {
        W wS = s();
        if (wS == null || (f628g.get(this) instanceof z0)) {
            return;
        }
        wS.dispose();
        h.set(this, y0.f648a);
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        Throwable thA = C1037h.a(obj);
        if (thA != null) {
            obj = new C0162u(thA, false);
        }
        B(obj, this.c, null);
    }

    public final W s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) this.e.get(C0154m0.f630a);
        if (interfaceC0156n0 == null) {
            return null;
        }
        W wS = H.s(interfaceC0156n0, true, new C0155n(this, 0));
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, wS)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return wS;
    }

    public final void t(Function1 function1) {
        v(new C0143h(function1, 1));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y());
        sb2.append('(');
        sb2.append(H.A(this.f629d));
        sb2.append("){");
        Object obj = f628g.get(this);
        sb2.append(obj instanceof z0 ? "Active" : obj instanceof C0153m ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(H.o(this));
        return sb2.toString();
    }

    @Override // Bj.InterfaceC0147j
    public final void u(Object obj) {
        o(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b9, code lost:
    
        x(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bc, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(Bj.z0 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Bj.C0151l.f628g
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof Bj.C0131b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto Lb0
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof Bj.InterfaceC0145i
            r3 = 0
            if (r1 != 0) goto Lb9
            boolean r1 = r2 instanceof Gj.r
            if (r1 != 0) goto Lb9
            boolean r1 = r2 instanceof Bj.C0162u
            if (r1 == 0) goto L5d
            r0 = r2
            Bj.u r0 = (Bj.C0162u) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = Bj.C0162u.f641b
            r5 = 0
            boolean r1 = r4.compareAndSet(r0, r5, r1)
            if (r1 == 0) goto L59
            boolean r1 = r2 instanceof Bj.C0153m
            if (r1 == 0) goto Lb0
            Bj.u r2 = (Bj.C0162u) r2
            if (r2 == 0) goto L3f
            goto L40
        L3f:
            r0 = r3
        L40:
            if (r0 == 0) goto L44
            java.lang.Throwable r3 = r0.f642a
        L44:
            boolean r0 = r8 instanceof Bj.InterfaceC0145i
            if (r0 == 0) goto L4e
            Bj.i r8 = (Bj.InterfaceC0145i) r8
            r7.j(r8, r3)
            return
        L4e:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.j.e(r8, r0)
            Gj.r r8 = (Gj.r) r8
            r7.m(r8, r3)
            return
        L59:
            x(r8, r2)
            throw r3
        L5d:
            boolean r1 = r2 instanceof Bj.C0161t
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L96
            r1 = r2
            Bj.t r1 = (Bj.C0161t) r1
            Bj.i r5 = r1.f637b
            if (r5 != 0) goto L92
            boolean r5 = r8 instanceof Gj.r
            if (r5 == 0) goto L6f
            return
        L6f:
            kotlin.jvm.internal.j.e(r8, r4)
            r4 = r8
            Bj.i r4 = (Bj.InterfaceC0145i) r4
            java.lang.Throwable r5 = r1.e
            if (r5 == 0) goto L7d
            r7.j(r4, r5)
            return
        L7d:
            r5 = 29
            Bj.t r1 = Bj.C0161t.a(r1, r4, r3, r5)
        L83:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L8a
            goto Lb0
        L8a:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L83
            goto L0
        L92:
            x(r8, r2)
            throw r3
        L96:
            boolean r1 = r8 instanceof Gj.r
            if (r1 == 0) goto L9b
            return
        L9b:
            kotlin.jvm.internal.j.e(r8, r4)
            r3 = r8
            Bj.i r3 = (Bj.InterfaceC0145i) r3
            Bj.t r1 = new Bj.t
            r4 = 0
            r5 = 0
            r6 = 28
            r1.<init>(r2, r3, r4, r5, r6)
        Laa:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto Lb1
        Lb0:
            return
        Lb1:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto Laa
            goto L0
        Lb9:
            x(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Bj.C0151l.v(Bj.z0):void");
    }

    public final boolean w() {
        if (this.c != 2) {
            return false;
        }
        InterfaceC1526a interfaceC1526a = this.f629d;
        kotlin.jvm.internal.j.e(interfaceC1526a, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return Gj.e.h.get((Gj.e) interfaceC1526a) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        InterfaceC1526a interfaceC1526a = this.f629d;
        Throwable th2 = null;
        Gj.e eVar = interfaceC1526a instanceof Gj.e ? (Gj.e) interfaceC1526a : null;
        if (eVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Gj.e.h;
                Object obj = atomicReferenceFieldUpdater.get(eVar);
                Gj.t tVar = Gj.a.c;
                if (obj == tVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, tVar, this)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != tVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            n();
            a(th2);
        }
    }
}
