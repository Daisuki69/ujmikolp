package Bj;

import bj.C1030a;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes4.dex */
public class u0 implements InterfaceC0156n0, A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f643a = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f644b = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public u0(boolean z4) {
        this._state$volatile = z4 ? H.j : H.i;
    }

    public static C0158p W(Gj.i iVar) {
        while (iVar.g()) {
            Gj.i iVarD = iVar.d();
            if (iVarD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Gj.i.f2017b;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (Gj.i) obj;
                    if (!iVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = iVarD;
            }
        }
        while (true) {
            iVar = iVar.f();
            if (!iVar.g()) {
                if (iVar instanceof C0158p) {
                    return (C0158p) iVar;
                }
                if (iVar instanceof x0) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj) {
        if (!(obj instanceof s0)) {
            return obj instanceof InterfaceC0148j0 ? ((InterfaceC0148j0) obj).isActive() ? "Active" : "New" : obj instanceof C0162u ? "Cancelled" : "Completed";
        }
        s0 s0Var = (s0) obj;
        return s0Var.d() ? "Cancelling" : s0.f633b.get(s0Var) != 0 ? "Completing" : "Active";
    }

    public final Object A(InterfaceC1526a interfaceC1526a) throws Throwable {
        Object obj;
        int i = 2;
        do {
            obj = f643a.get(this);
            if (!(obj instanceof InterfaceC0148j0)) {
                if (obj instanceof C0162u) {
                    throw ((C0162u) obj).f642a;
                }
                return H.B(obj);
            }
        } while (d0(obj) < 0);
        q0 q0Var = new q0(hj.h.b(interfaceC1526a), this);
        q0Var.r();
        q0Var.v(new C0143h(H.s(this, true, new X(q0Var, i)), i));
        Object objQ = q0Var.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[PHI: r0
  0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bj.u0.B(java.lang.Object):boolean");
    }

    public void C(CancellationException cancellationException) {
        B(cancellationException);
    }

    public final boolean D(Throwable th2) {
        if (S()) {
            return true;
        }
        boolean z4 = th2 instanceof CancellationException;
        InterfaceC0157o interfaceC0157o = (InterfaceC0157o) f644b.get(this);
        return (interfaceC0157o == null || interfaceC0157o == y0.f648a) ? z4 : interfaceC0157o.a(th2) || z4;
    }

    public String E() {
        return "Job was cancelled";
    }

    public boolean F(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return B(th2) && K();
    }

    public final void G(InterfaceC0148j0 interfaceC0148j0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f644b;
        InterfaceC0157o interfaceC0157o = (InterfaceC0157o) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0157o != null) {
            interfaceC0157o.dispose();
            atomicReferenceFieldUpdater.set(this, y0.f648a);
        }
        CompletionHandlerException completionHandlerException = null;
        C0162u c0162u = obj instanceof C0162u ? (C0162u) obj : null;
        Throwable th2 = c0162u != null ? c0162u.f642a : null;
        if (interfaceC0148j0 instanceof p0) {
            try {
                ((p0) interfaceC0148j0).j(th2);
                return;
            } catch (Throwable th3) {
                O(new CompletionHandlerException("Exception in completion handler " + interfaceC0148j0 + " for " + this, th3));
                return;
            }
        }
        x0 x0VarB = interfaceC0148j0.b();
        if (x0VarB != null) {
            x0VarB.c(new Gj.g(1), 1);
            Object obj2 = Gj.i.f2016a.get(x0VarB);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (Gj.i iVarF = (Gj.i) obj2; !iVarF.equals(x0VarB); iVarF = iVarF.f()) {
                if (iVarF instanceof p0) {
                    try {
                        ((p0) iVarF).j(th2);
                    } catch (Throwable th4) {
                        if (completionHandlerException != null) {
                            C1030a.a(completionHandlerException, th4);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + iVarF + " for " + this, th4);
                            Unit unit = Unit.f18162a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                O(completionHandlerException);
            }
        }
    }

    public final Throwable H(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        u0 u0Var = (u0) ((A0) obj);
        Object obj2 = f643a.get(u0Var);
        if (obj2 instanceof s0) {
            thC = ((s0) obj2).c();
        } else if (obj2 instanceof C0162u) {
            thC = ((C0162u) obj2).f642a;
        } else {
            if (obj2 instanceof InterfaceC0148j0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(e0(obj2)), thC, u0Var) : cancellationException;
    }

    public final Object I(s0 s0Var, Object obj) {
        Throwable thJ;
        C0162u c0162u = obj instanceof C0162u ? (C0162u) obj : null;
        Throwable th2 = c0162u != null ? c0162u.f642a : null;
        synchronized (s0Var) {
            s0Var.d();
            ArrayList<Throwable> arrayListE = s0Var.e(th2);
            thJ = J(s0Var, arrayListE);
            if (thJ != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th3 : arrayListE) {
                    if (th3 != thJ && th3 != thJ && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        C1030a.a(thJ, th3);
                    }
                }
            }
        }
        if (thJ != null && thJ != th2) {
            obj = new C0162u(thJ, false);
        }
        if (thJ != null && (D(thJ) || N(thJ))) {
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0162u.f641b.compareAndSet((C0162u) obj, 0, 1);
        }
        Z(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f643a;
        Object c0150k0 = obj instanceof InterfaceC0148j0 ? new C0150k0((InterfaceC0148j0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, s0Var, c0150k0) && atomicReferenceFieldUpdater.get(this) == s0Var) {
        }
        G(s0Var, obj);
        return obj;
    }

    public final Throwable J(s0 s0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (s0Var.d()) {
                return new JobCancellationException(E(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return this instanceof r;
    }

    public final x0 M(InterfaceC0148j0 interfaceC0148j0) {
        x0 x0VarB = interfaceC0148j0.b();
        if (x0VarB != null) {
            return x0VarB;
        }
        if (interfaceC0148j0 instanceof Y) {
            return new x0();
        }
        if (interfaceC0148j0 instanceof p0) {
            c0((p0) interfaceC0148j0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0148j0).toString());
    }

    public boolean N(Throwable th2) {
        return false;
    }

    public void O(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void P(InterfaceC0156n0 interfaceC0156n0) {
        y0 y0Var = y0.f648a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f644b;
        if (interfaceC0156n0 == null) {
            atomicReferenceFieldUpdater.set(this, y0Var);
            return;
        }
        interfaceC0156n0.start();
        InterfaceC0157o interfaceC0157oQ = interfaceC0156n0.q(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0157oQ);
        if (R()) {
            interfaceC0157oQ.dispose();
            atomicReferenceFieldUpdater.set(this, y0Var);
        }
    }

    public final W Q(boolean z4, p0 p0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        y0 y0Var;
        boolean z5;
        boolean zC;
        p0Var.f631d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f643a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z8 = obj instanceof Y;
            y0Var = y0.f648a;
            z5 = true;
            if (!z8) {
                if (!(obj instanceof InterfaceC0148j0)) {
                    z5 = false;
                    break;
                }
                InterfaceC0148j0 interfaceC0148j0 = (InterfaceC0148j0) obj;
                x0 x0VarB = interfaceC0148j0.b();
                if (x0VarB == null) {
                    kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    c0((p0) obj);
                } else {
                    if (p0Var.i()) {
                        s0 s0Var = interfaceC0148j0 instanceof s0 ? (s0) interfaceC0148j0 : null;
                        Throwable thC = s0Var != null ? s0Var.c() : null;
                        if (thC == null) {
                            zC = x0VarB.c(p0Var, 5);
                        } else if (z4) {
                            p0Var.j(thC);
                            return y0Var;
                        }
                    } else {
                        zC = x0VarB.c(p0Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                Y y7 = (Y) obj;
                if (y7.f606a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(y7);
            }
        }
        if (z5) {
            return p0Var;
        }
        if (z4) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0162u c0162u = obj2 instanceof C0162u ? (C0162u) obj2 : null;
            p0Var.j(c0162u != null ? c0162u.f642a : null);
        }
        return y0Var;
    }

    public final boolean R() {
        return !(f643a.get(this) instanceof InterfaceC0148j0);
    }

    public boolean S() {
        return this instanceof C0139f;
    }

    public final boolean T(Object obj) {
        Object objF0;
        do {
            objF0 = f0(f643a.get(this), obj);
            if (objF0 == H.f591d) {
                return false;
            }
            if (objF0 == H.e) {
                return true;
            }
        } while (objF0 == H.f);
        v(objF0);
        return true;
    }

    public final Object U(Object obj) {
        Object objF0;
        do {
            objF0 = f0(f643a.get(this), obj);
            if (objF0 == H.f591d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0162u c0162u = obj instanceof C0162u ? (C0162u) obj : null;
                throw new IllegalStateException(str, c0162u != null ? c0162u.f642a : null);
            }
        } while (objF0 == H.f);
        return objF0;
    }

    public String V() {
        return getClass().getSimpleName();
    }

    public final void X(x0 x0Var, Throwable th2) {
        x0Var.c(new Gj.g(4), 4);
        Object obj = Gj.i.f2016a.get(x0Var);
        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (Gj.i iVarF = (Gj.i) obj; !iVarF.equals(x0Var); iVarF = iVarF.f()) {
            if ((iVarF instanceof p0) && ((p0) iVarF).i()) {
                try {
                    ((p0) iVarF).j(th2);
                } catch (Throwable th3) {
                    if (completionHandlerException != null) {
                        C1030a.a(completionHandlerException, th3);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + iVarF + " for " + this, th3);
                        Unit unit = Unit.f18162a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            O(completionHandlerException);
        }
        D(th2);
    }

    public void Y(Throwable th2) {
    }

    public void Z(Object obj) {
    }

    public void a0() {
    }

    @Override // Bj.InterfaceC0156n0
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(E(), null, this);
        }
        C(cancellationException);
    }

    public final void b0(Y y7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x0 x0Var = new x0();
        Object c0146i0 = x0Var;
        if (!y7.f606a) {
            c0146i0 = new C0146i0(x0Var);
        }
        do {
            atomicReferenceFieldUpdater = f643a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, y7, c0146i0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == y7);
    }

    public Object c() throws Throwable {
        Object obj = f643a.get(this);
        if (obj instanceof InterfaceC0148j0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C0162u) {
            throw ((C0162u) obj).f642a;
        }
        return H.B(obj);
    }

    public final void c0(p0 p0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x0 x0Var = new x0();
        p0Var.getClass();
        Gj.i.f2017b.set(x0Var, p0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Gj.i.f2016a;
        atomicReferenceFieldUpdater2.set(x0Var, p0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(p0Var) == p0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(p0Var, p0Var, x0Var)) {
                    if (atomicReferenceFieldUpdater2.get(p0Var) != p0Var) {
                        break;
                    }
                }
                x0Var.e(p0Var);
                break loop0;
            }
            break;
        }
        Gj.i iVarF = p0Var.f();
        do {
            atomicReferenceFieldUpdater = f643a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p0Var, iVarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == p0Var);
    }

    public final int d0(Object obj) {
        boolean z4 = obj instanceof Y;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f643a;
        if (z4) {
            if (((Y) obj).f606a) {
                return 0;
            }
            Y y7 = H.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            a0();
            return 1;
        }
        if (!(obj instanceof C0146i0)) {
            return 0;
        }
        x0 x0Var = ((C0146i0) obj).f624a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        a0();
        return 1;
    }

    @Override // Bj.InterfaceC0156n0
    public final W f(boolean z4, boolean z5, Function1 function1) {
        return Q(z5, z4 ? new C0152l0(function1) : new X(function1, 1));
    }

    public final Object f0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0148j0)) {
            return H.f591d;
        }
        if (((obj instanceof Y) || (obj instanceof p0)) && !(obj instanceof C0158p) && !(obj2 instanceof C0162u)) {
            InterfaceC0148j0 interfaceC0148j0 = (InterfaceC0148j0) obj;
            Object c0150k0 = obj2 instanceof InterfaceC0148j0 ? new C0150k0((InterfaceC0148j0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f643a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0148j0, c0150k0)) {
                    Z(obj2);
                    G(interfaceC0148j0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0148j0);
            return H.f;
        }
        InterfaceC0148j0 interfaceC0148j02 = (InterfaceC0148j0) obj;
        x0 x0VarM = M(interfaceC0148j02);
        if (x0VarM == null) {
            return H.f;
        }
        s0 s0Var = interfaceC0148j02 instanceof s0 ? (s0) interfaceC0148j02 : null;
        if (s0Var == null) {
            s0Var = new s0(x0VarM, null);
        }
        synchronized (s0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s0.f633b;
                if (atomicIntegerFieldUpdater.get(s0Var) != 0) {
                    return H.f591d;
                }
                atomicIntegerFieldUpdater.set(s0Var, 1);
                if (s0Var != interfaceC0148j02) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f643a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0148j02, s0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0148j02) {
                            return H.f;
                        }
                    }
                }
                boolean zD = s0Var.d();
                C0162u c0162u = obj2 instanceof C0162u ? (C0162u) obj2 : null;
                if (c0162u != null) {
                    s0Var.a(c0162u.f642a);
                }
                Throwable thC = zD ? null : s0Var.c();
                Unit unit = Unit.f18162a;
                if (thC != null) {
                    X(x0VarM, thC);
                }
                C0158p c0158pW = W(x0VarM);
                if (c0158pW != null && g0(s0Var, c0158pW, obj2)) {
                    return H.e;
                }
                x0VarM.c(new Gj.g(2), 2);
                C0158p c0158pW2 = W(x0VarM);
                return (c0158pW2 == null || !g0(s0Var, c0158pW2, obj2)) ? I(s0Var, obj2) : H.e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // Bj.InterfaceC0156n0
    public final CancellationException g() {
        CancellationException jobCancellationException;
        Object obj = f643a.get(this);
        if (!(obj instanceof s0)) {
            if (obj instanceof InterfaceC0148j0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0162u)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((C0162u) obj).f642a;
            jobCancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return jobCancellationException == null ? new JobCancellationException(E(), th2, this) : jobCancellationException;
        }
        Throwable thC = ((s0) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        jobCancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (jobCancellationException == null) {
            if (strConcat == null) {
                strConcat = E();
            }
            jobCancellationException = new JobCancellationException(strConcat, thC, this);
        }
        return jobCancellationException;
    }

    public final boolean g0(s0 s0Var, C0158p c0158p, Object obj) {
        while (H.s(c0158p.e, false, new r0(this, s0Var, c0158p, obj)) == y0.f648a) {
            c0158p = W(c0158p);
            if (c0158p == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return C0154m0.f630a;
    }

    @Override // Bj.InterfaceC0156n0
    public final W i(Function1 function1) {
        return Q(true, new X(function1, 1));
    }

    @Override // Bj.InterfaceC0156n0
    public boolean isActive() {
        Object obj = f643a.get(this);
        return (obj instanceof InterfaceC0148j0) && ((InterfaceC0148j0) obj).isActive();
    }

    @Override // Bj.InterfaceC0156n0
    public final boolean isCancelled() {
        Object obj = f643a.get(this);
        if (obj instanceof C0162u) {
            return true;
        }
        return (obj instanceof s0) && ((s0) obj).d();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.c(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.d(this, coroutineContext);
    }

    @Override // Bj.InterfaceC0156n0
    public final InterfaceC0157o q(u0 u0Var) {
        C0158p c0158p = new C0158p(u0Var);
        c0158p.f631d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f643a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Y) {
                Y y7 = (Y) obj;
                if (y7.f606a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0158p)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(y7);
            } else {
                boolean z4 = obj instanceof InterfaceC0148j0;
                y0 y0Var = y0.f648a;
                if (!z4) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0162u c0162u = obj2 instanceof C0162u ? (C0162u) obj2 : null;
                    c0158p.j(c0162u != null ? c0162u.f642a : null);
                    return y0Var;
                }
                x0 x0VarB = ((InterfaceC0148j0) obj).b();
                if (x0VarB == null) {
                    kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    c0((p0) obj);
                } else if (!x0VarB.c(c0158p, 7)) {
                    boolean zC = x0VarB.c(c0158p, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof s0) {
                        thC = ((s0) obj3).c();
                    } else {
                        C0162u c0162u2 = obj3 instanceof C0162u ? (C0162u) obj3 : null;
                        if (c0162u2 != null) {
                            thC = c0162u2.f642a;
                        }
                    }
                    c0158p.j(thC);
                    if (zC) {
                        break loop0;
                    }
                    return y0Var;
                }
            }
        }
        return c0158p;
    }

    @Override // Bj.InterfaceC0156n0
    public final boolean start() {
        int iD0;
        do {
            iD0 = d0(f643a.get(this));
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(V() + '{' + e0(f643a.get(this)) + '}');
        sb2.append('@');
        sb2.append(H.o(this));
        return sb2.toString();
    }

    public void v(Object obj) {
    }

    public void x(Object obj) {
        v(obj);
    }

    @Override // Bj.InterfaceC0156n0
    public final Object z(InterfaceC1526a interfaceC1526a) {
        Object obj;
        do {
            obj = f643a.get(this);
            if (!(obj instanceof InterfaceC0148j0)) {
                H.m(interfaceC1526a.getContext());
                return Unit.f18162a;
            }
        } while (d0(obj) < 0);
        C0151l c0151l = new C0151l(1, hj.h.b(interfaceC1526a));
        c0151l.r();
        c0151l.v(new C0143h(H.s(this, true, new C0155n(c0151l, 1)), 2));
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        if (objQ != enumC1578a) {
            objQ = Unit.f18162a;
        }
        return objQ == enumC1578a ? objQ : Unit.f18162a;
    }
}
