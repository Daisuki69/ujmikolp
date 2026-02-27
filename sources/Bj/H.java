package Bj;

import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import cj.C1112C;
import cj.C1124j;
import gj.C1527b;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1616j;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gj.t f589a = new Gj.t("RESUME_TOKEN", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Gj.t f590b = new Gj.t("REMOVED_TASK", 0);
    public static final Gj.t c = new Gj.t("CLOSED_EMPTY", 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Gj.t f591d = new Gj.t("COMPLETING_ALREADY", 0);
    public static final Gj.t e = new Gj.t("COMPLETING_WAITING_CHILDREN", 0);
    public static final Gj.t f = new Gj.t("COMPLETING_RETRY", 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Gj.t f592g = new Gj.t("TOO_LATE_TO_CANCEL", 0);
    public static final Gj.t h = new Gj.t("SEALED", 0);
    public static final Y i = new Y(false);
    public static final Y j = new Y(true);

    public static final String A(InterfaceC1526a interfaceC1526a) {
        Object objA;
        if (interfaceC1526a instanceof Gj.e) {
            return ((Gj.e) interfaceC1526a).toString();
        }
        try {
            C1037h.a aVar = C1037h.f9166b;
            objA = interfaceC1526a + '@' + o(interfaceC1526a);
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        if (C1037h.a(objA) != null) {
            objA = interfaceC1526a.getClass().getName() + '@' + o(interfaceC1526a);
        }
        return (String) objA;
    }

    public static final Object B(Object obj) {
        InterfaceC0148j0 interfaceC0148j0;
        C0150k0 c0150k0 = obj instanceof C0150k0 ? (C0150k0) obj : null;
        return (c0150k0 == null || (interfaceC0148j0 = c0150k0.f627a) == null) ? obj : interfaceC0148j0;
    }

    public static final Object C(Function2 function2, CoroutineContext coroutineContext, InterfaceC1526a interfaceC1526a) throws Throwable {
        Object objB;
        CoroutineContext context = interfaceC1526a.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new C0165x(0))).booleanValue() ? context.plus(coroutineContext) : AbstractC0166y.a(context, coroutineContext, false);
        m(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            Gj.q qVar = new Gj.q(interfaceC1526a, coroutineContextPlus);
            objB = qk.i.E(qVar, qVar, function2);
        } else {
            C1527b c1527b = kotlin.coroutines.d.f18169N;
            if (kotlin.jvm.internal.j.b(coroutineContextPlus.get(c1527b), context.get(c1527b))) {
                K0 k02 = new K0(interfaceC1526a, coroutineContextPlus);
                CoroutineContext coroutineContext2 = k02.c;
                Object objC = Gj.v.c(coroutineContext2, null);
                try {
                    objB = qk.i.E(k02, k02, function2);
                } finally {
                    Gj.v.a(coroutineContext2, objC);
                }
            } else {
                P p10 = new P(interfaceC1526a, coroutineContextPlus);
                Hj.a.b(function2, p10, p10);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = P.e;
                    int i4 = atomicIntegerFieldUpdater.get(p10);
                    if (i4 != 0) {
                        if (i4 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objB = B(u0.f643a.get(p10));
                        if (objB instanceof C0162u) {
                            throw ((C0162u) objB).f642a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(p10, 0, 1)) {
                        objB = EnumC1578a.f17050a;
                        break;
                    }
                }
            }
        }
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objB;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object D(AbstractC1609c abstractC1609c) {
        Object obj;
        CoroutineContext context = abstractC1609c.getContext();
        m(context);
        InterfaceC1526a interfaceC1526aB = hj.h.b(abstractC1609c);
        Gj.e eVar = interfaceC1526aB instanceof Gj.e ? (Gj.e) interfaceC1526aB : null;
        if (eVar == null) {
            obj = Unit.f18162a;
        } else {
            A a8 = eVar.f2009d;
            if (a8.isDispatchNeeded(context)) {
                eVar.f = Unit.f18162a;
                eVar.c = 1;
                a8.dispatchYield(context, eVar);
            } else {
                N0 n02 = new N0(N0.f600b);
                CoroutineContext coroutineContextPlus = context.plus(n02);
                Unit unit = Unit.f18162a;
                eVar.f = unit;
                eVar.c = 1;
                a8.dispatchYield(coroutineContextPlus, eVar);
                if (n02.f601a) {
                    AbstractC0138e0 abstractC0138e0A = F0.a();
                    C1124j c1124j = abstractC0138e0A.c;
                    if (c1124j != null ? c1124j.isEmpty() : true) {
                        obj = Unit.f18162a;
                    } else {
                        if (abstractC0138e0A.f617a >= 4294967296L) {
                            eVar.f = unit;
                            eVar.c = 1;
                            abstractC0138e0A.B(eVar);
                            obj = EnumC1578a.f17050a;
                        } else {
                            abstractC0138e0A.D(true);
                            try {
                                eVar.run();
                                do {
                                } while (abstractC0138e0A.F());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj = Unit.f18162a;
                        }
                    }
                }
            }
            obj = EnumC1578a.f17050a;
        }
        return obj == EnumC1578a.f17050a ? obj : Unit.f18162a;
    }

    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    public static r b() {
        r rVar = new r(true);
        rVar.P(null);
        return rVar;
    }

    public static final Gj.c c(CoroutineContext coroutineContext) {
        if (coroutineContext.get(C0154m0.f630a) == null) {
            coroutineContext = coroutineContext.plus(d(1));
        }
        return new Gj.c(coroutineContext);
    }

    public static o0 d(int i4) {
        return new o0(null);
    }

    public static D0 e(int i4) {
        return new D0(null);
    }

    public static final Executor f(A a8) {
        Executor executorT;
        AbstractC0140f0 abstractC0140f0 = a8 instanceof AbstractC0140f0 ? (AbstractC0140f0) a8 : null;
        return (abstractC0140f0 == null || (executorT = abstractC0140f0.t()) == null) ? new T(a8) : executorT;
    }

    public static L g(E e7, CoroutineContext coroutineContext, Function2 function2, int i4) {
        if ((i4 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f18170a;
        }
        F f3 = (i4 & 2) != 0 ? F.f585a : null;
        CoroutineContext coroutineContextB = AbstractC0166y.b(e7, coroutineContext);
        f3.getClass();
        L v0Var = f3 == F.f586b ? new v0(coroutineContextB, function2) : new L(coroutineContextB, true, true);
        v0Var.j0(f3, v0Var, function2);
        return v0Var;
    }

    public static final Object h(Collection collection, AbstractC1616j abstractC1616j) {
        return collection.isEmpty() ? C1112C.f9377a : new C0137e((K[]) collection.toArray(new K[0])).a(abstractC1616j);
    }

    public static final void i(E e7, CancellationException cancellationException) {
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) e7.getCoroutineContext().get(C0154m0.f630a);
        if (interfaceC0156n0 != null) {
            interfaceC0156n0.b(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + e7).toString());
        }
    }

    public static final void j(InterfaceC0156n0 interfaceC0156n0, String str, Throwable th2) {
        interfaceC0156n0.b(a(str, th2));
    }

    public static final Object k(InterfaceC0156n0 interfaceC0156n0, InterfaceC1526a interfaceC1526a) {
        interfaceC0156n0.b(null);
        Object objZ = interfaceC0156n0.z(interfaceC1526a);
        return objZ == EnumC1578a.f17050a ? objZ : Unit.f18162a;
    }

    public static final Object l(Function2 function2, InterfaceC1526a interfaceC1526a) {
        Gj.q qVar = new Gj.q(interfaceC1526a, interfaceC1526a.getContext());
        Object objE = qk.i.E(qVar, qVar, function2);
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objE;
    }

    public static final void m(CoroutineContext coroutineContext) {
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) coroutineContext.get(C0154m0.f630a);
        if (interfaceC0156n0 != null && !interfaceC0156n0.isActive()) {
            throw interfaceC0156n0.g();
        }
    }

    public static final A n(Executor executor) {
        A a8;
        T t5 = executor instanceof T ? (T) executor : null;
        return (t5 == null || (a8 = t5.f602a) == null) ? new C0142g0(executor) : a8;
    }

    public static final String o(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final InterfaceC0156n0 p(CoroutineContext coroutineContext) {
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) coroutineContext.get(C0154m0.f630a);
        if (interfaceC0156n0 != null) {
            return interfaceC0156n0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final C0151l q(InterfaceC1526a interfaceC1526a) {
        C0151l c0151l;
        C0151l c0151l2;
        if (!(interfaceC1526a instanceof Gj.e)) {
            return new C0151l(1, interfaceC1526a);
        }
        Gj.e eVar = (Gj.e) interfaceC1526a;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Gj.e.h;
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            Gj.t tVar = Gj.a.c;
            c0151l = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(eVar, tVar);
                c0151l2 = null;
                break;
            }
            if (obj instanceof C0151l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(eVar) != obj) {
                        break;
                    }
                }
                c0151l2 = (C0151l) obj;
                break loop0;
            }
            if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0151l2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0151l.f628g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0151l2);
            if (!(obj2 instanceof C0161t) || ((C0161t) obj2).f638d == null) {
                C0151l.f.set(c0151l2, 536870911);
                atomicReferenceFieldUpdater2.set(c0151l2, C0131b.f608a);
                c0151l = c0151l2;
            } else {
                c0151l2.n();
            }
            if (c0151l != null) {
                return c0151l;
            }
        }
        return new C0151l(2, interfaceC1526a);
    }

    public static final void r(CoroutineContext coroutineContext, Throwable th2) {
        try {
            C c10 = (C) coroutineContext.get(B.f582a);
            if (c10 != null) {
                c10.handleException(coroutineContext, th2);
            } else {
                Gj.a.d(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                C1030a.a(runtimeException, th2);
                th2 = runtimeException;
            }
            Gj.a.d(coroutineContext, th2);
        }
    }

    public static final W s(InterfaceC0156n0 interfaceC0156n0, boolean z4, p0 p0Var) {
        if (interfaceC0156n0 instanceof u0) {
            return ((u0) interfaceC0156n0).Q(z4, p0Var);
        }
        return interfaceC0156n0.f(p0Var.i(), z4, new Ag.f(1, p0Var, p0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1));
    }

    public static final boolean t(E e7) {
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) e7.getCoroutineContext().get(C0154m0.f630a);
        if (interfaceC0156n0 != null) {
            return interfaceC0156n0.isActive();
        }
        return true;
    }

    public static final boolean u(CoroutineContext coroutineContext) {
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) coroutineContext.get(C0154m0.f630a);
        if (interfaceC0156n0 != null) {
            return interfaceC0156n0.isActive();
        }
        return true;
    }

    public static final B0 v(E e7, CoroutineContext coroutineContext, F f3, Function2 function2) {
        CoroutineContext coroutineContextB = AbstractC0166y.b(e7, coroutineContext);
        f3.getClass();
        B0 w0Var = f3 == F.f586b ? new w0(coroutineContextB, function2) : new B0(coroutineContextB, true, true);
        w0Var.j0(f3, w0Var, function2);
        return w0Var;
    }

    public static /* synthetic */ B0 w(E e7, CoroutineContext coroutineContext, F f3, Function2 function2, int i4) {
        if ((i4 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f18170a;
        }
        if ((i4 & 2) != 0) {
            f3 = F.f585a;
        }
        return v(e7, coroutineContext, f3, function2);
    }

    public static final Object x(CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        AbstractC0138e0 abstractC0138e0A;
        CoroutineContext coroutineContextA;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.f fVar = kotlin.coroutines.d.f18169N;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.get(fVar);
        if (dVar == null) {
            abstractC0138e0A = F0.a();
            coroutineContextA = AbstractC0166y.a(kotlin.coroutines.g.f18170a, coroutineContext.plus(abstractC0138e0A), true);
            Ij.e eVar = U.f603a;
            if (coroutineContextA != eVar && coroutineContextA.get(fVar) == null) {
                coroutineContextA = coroutineContextA.plus(eVar);
            }
        } else {
            if (dVar instanceof AbstractC0138e0) {
            }
            abstractC0138e0A = (AbstractC0138e0) F0.f588a.get();
            coroutineContextA = AbstractC0166y.a(kotlin.coroutines.g.f18170a, coroutineContext, true);
            Ij.e eVar2 = U.f603a;
            if (coroutineContextA != eVar2 && coroutineContextA.get(fVar) == null) {
                coroutineContextA = coroutineContextA.plus(eVar2);
            }
        }
        C0139f c0139f = new C0139f(coroutineContextA, threadCurrentThread, abstractC0138e0A);
        c0139f.j0(F.f585a, c0139f, function2);
        AbstractC0138e0 abstractC0138e0 = c0139f.e;
        if (abstractC0138e0 != null) {
            int i4 = AbstractC0138e0.f616d;
            abstractC0138e0.D(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jE = abstractC0138e0 != null ? abstractC0138e0.E() : Long.MAX_VALUE;
                if (c0139f.R()) {
                    if (abstractC0138e0 != null) {
                        int i6 = AbstractC0138e0.f616d;
                        abstractC0138e0.t(false);
                    }
                    Object objB = B(u0.f643a.get(c0139f));
                    C0162u c0162u = objB instanceof C0162u ? (C0162u) objB : null;
                    if (c0162u == null) {
                        return objB;
                    }
                    throw c0162u.f642a;
                }
                LockSupport.parkNanos(c0139f, jE);
            } catch (Throwable th2) {
                if (abstractC0138e0 != null) {
                    int i10 = AbstractC0138e0.f616d;
                    abstractC0138e0.t(false);
                }
                throw th2;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0139f.B(interruptedException);
        throw interruptedException;
    }

    public static final Object z(Function2 function2, AbstractC1609c abstractC1609c) {
        C0 c02 = new C0(abstractC1609c.getContext(), abstractC1609c, 0);
        Object objE = qk.i.E(c02, c02, function2);
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objE;
    }
}
