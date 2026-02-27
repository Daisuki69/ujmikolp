package Zg;

import Bj.C0154m0;
import Bj.D;
import Bj.H;
import Bj.InterfaceC0156n0;
import Bj.o0;
import io.ktor.utils.io.A;
import io.ktor.utils.io.n;
import java.io.IOException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mj.b f6956b;
    public final CoroutineContext c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A f6957d;
    public final Mj.a e;
    public final o0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineContext f6958g;

    public i(Mj.b bVar, CoroutineContext parent) {
        j.g(parent, "parent");
        this.f6956b = bVar;
        this.c = parent;
        this.e = new Mj.a();
        o0 o0Var = new o0((InterfaceC0156n0) parent.get(C0154m0.f630a));
        this.f = o0Var;
        this.f6958g = parent.plus(o0Var).plus(new D("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.n
    public final void a(Throwable th2) throws IOException {
        String message;
        String message2;
        if (this.f6957d != null) {
            return;
        }
        o0 o0Var = this.f;
        String str = "Channel was cancelled";
        if (th2 == null || (message = th2.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        H.j(o0Var, message, th2);
        this.f6956b.close();
        if (th2 != null && (message2 = th2.getMessage()) != null) {
            str = message2;
        }
        this.f6957d = new A(new IOException(str, th2));
    }

    @Override // io.ktor.utils.io.n
    public final Throwable b() {
        A a8 = this.f6957d;
        if (a8 != null) {
            return a8.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.n
    public final Mj.i f() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(int r5, ij.AbstractC1609c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Zg.g
            if (r0 == 0) goto L13
            r0 = r6
            Zg.g r0 = (Zg.g) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            Zg.g r0 = new Zg.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r5 = r0.f6953b
            Zg.i r0 = r0.f6952a
            bj.AbstractC1039j.b(r6)
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            bj.AbstractC1039j.b(r6)
            io.ktor.utils.io.A r6 = r4.f6957d
            if (r6 == 0) goto L3d
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L3d:
            Zg.h r6 = new Zg.h
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.f6952a = r4
            r0.f6953b = r5
            r0.f = r3
            kotlin.coroutines.CoroutineContext r2 = r4.f6958g
            java.lang.Object r6 = Bj.H.C(r6, r2, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            r0 = r4
        L53:
            Mj.a r6 = r0.e
            long r0 = Yg.a.b(r6)
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L5f
            goto L60
        L5f:
            r3 = 0
        L60:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Zg.i.h(int, ij.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.n
    public final boolean i() {
        return this.f6957d != null && this.e.exhausted();
    }
}
