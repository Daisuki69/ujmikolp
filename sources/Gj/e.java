package Gj;

import Bj.A;
import Bj.AbstractC0138e0;
import Bj.C0162u;
import Bj.F0;
import Bj.H;
import Bj.Q;
import bj.C1037h;
import gj.InterfaceC1526a;
import ij.InterfaceC1610d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends Q implements InterfaceC1610d, InterfaceC1526a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f2009d;
    public final InterfaceC1526a e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2010g;

    public e(A a8, InterfaceC1526a interfaceC1526a) {
        super(-1);
        this.f2009d = a8;
        this.e = interfaceC1526a;
        this.f = a.f2004b;
        this.f2010g = v.b(interfaceC1526a.getContext());
    }

    @Override // Bj.Q
    public final InterfaceC1526a d() {
        return this;
    }

    @Override // ij.InterfaceC1610d
    public final InterfaceC1610d getCallerFrame() {
        InterfaceC1526a interfaceC1526a = this.e;
        if (interfaceC1526a instanceof InterfaceC1610d) {
            return (InterfaceC1610d) interfaceC1526a;
        }
        return null;
    }

    @Override // gj.InterfaceC1526a
    public final CoroutineContext getContext() {
        return this.e.getContext();
    }

    @Override // Bj.Q
    public final Object i() {
        Object obj = this.f;
        this.f = a.f2004b;
        return obj;
    }

    @Override // gj.InterfaceC1526a
    public final void resumeWith(Object obj) {
        Throwable thA = C1037h.a(obj);
        Object c0162u = thA == null ? obj : new C0162u(thA, false);
        InterfaceC1526a interfaceC1526a = this.e;
        CoroutineContext context = interfaceC1526a.getContext();
        A a8 = this.f2009d;
        if (a8.isDispatchNeeded(context)) {
            this.f = c0162u;
            this.c = 0;
            a8.dispatch(interfaceC1526a.getContext(), this);
            return;
        }
        AbstractC0138e0 abstractC0138e0A = F0.a();
        if (abstractC0138e0A.f617a >= 4294967296L) {
            this.f = c0162u;
            this.c = 0;
            abstractC0138e0A.B(this);
            return;
        }
        abstractC0138e0A.D(true);
        try {
            CoroutineContext context2 = interfaceC1526a.getContext();
            Object objC = v.c(context2, this.f2010g);
            try {
                interfaceC1526a.resumeWith(obj);
                Unit unit = Unit.f18162a;
                while (abstractC0138e0A.F()) {
                }
            } finally {
                v.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f2009d + ", " + H.A(this.e) + ']';
    }
}
