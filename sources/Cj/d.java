package Cj;

import Bj.A;
import Bj.C0151l;
import Bj.C0154m0;
import Bj.G0;
import Bj.InterfaceC0156n0;
import Bj.M;
import Bj.U;
import Bj.W;
import Bj.y0;
import C7.f;
import Gj.m;
import Gj.n;
import S1.v;
import We.s;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends A implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f790b;
    public final d c;

    public d(Handler handler, boolean z4) {
        this.f789a = handler;
        this.f790b = z4;
        this.c = z4 ? this : new d(handler, true);
    }

    @Override // Bj.A
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f789a.post(runnable)) {
            return;
        }
        t(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f789a == this.f789a && dVar.f790b == this.f790b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f789a) ^ (this.f790b ? 1231 : 1237);
    }

    @Override // Bj.A
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return (this.f790b && j.b(Looper.myLooper(), this.f789a.getLooper())) ? false : true;
    }

    @Override // Bj.A
    public A limitedParallelism(int i, String str) {
        Gj.a.a(i);
        return str != null ? new n(this, str) : this;
    }

    @Override // Bj.M
    public final void m(long j, C0151l c0151l) {
        v vVar = new v(2, c0151l, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f789a.postDelayed(vVar, j)) {
            c0151l.t(new f(1, this, vVar));
        } else {
            t(c0151l.e, vVar);
        }
    }

    @Override // Bj.M
    public final W r(long j, G0 g02, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f789a.postDelayed(g02, j)) {
            return new c(0, this, g02);
        }
        t(coroutineContext, g02);
        return y0.f648a;
    }

    public final void t(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0156n0 interfaceC0156n0 = (InterfaceC0156n0) coroutineContext.get(C0154m0.f630a);
        if (interfaceC0156n0 != null) {
            interfaceC0156n0.b(cancellationException);
        }
        Ij.e eVar = U.f603a;
        Ij.d.f2362a.dispatch(coroutineContext, runnable);
    }

    @Override // Bj.A
    public final String toString() {
        d dVar;
        String str;
        Ij.e eVar = U.f603a;
        d dVar2 = m.f2024a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.c;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f789a.toString();
        return this.f790b ? s.i(string, ".immediate") : string;
    }
}
