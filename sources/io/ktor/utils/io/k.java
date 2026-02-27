package io.ktor.utils.io;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n, w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17533g = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "suspensionSlot");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_closedCause");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17534b;
    private volatile int flushBufferSize;
    public final Mj.a c = new Mj.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17535d = new Object();
    volatile /* synthetic */ Object suspensionSlot = C1648c.f17522b;
    public final Mj.a e = new Mj.a();
    public final Mj.a f = new Mj.a();
    volatile /* synthetic */ Object _closedCause = null;

    public k(boolean z4) {
        this.f17534b = z4;
    }

    @Override // io.ktor.utils.io.n
    public final void a(Throwable th2) {
        if (this._closedCause != null) {
            return;
        }
        A a8 = new A(th2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, a8) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        k(a8.a());
    }

    @Override // io.ktor.utils.io.n
    public final Throwable b() {
        A a8 = (A) this._closedCause;
        if (a8 != null) {
            return a8.a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gj.InterfaceC1526a r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.c(gj.a):java.lang.Object");
    }

    @Override // io.ktor.utils.io.w
    public final boolean d() {
        return this._closedCause != null;
    }

    @Override // io.ktor.utils.io.w
    public final Mj.a e() throws Throwable {
        Throwable thB = b();
        if (thB != null) {
            throw thB;
        }
        if (d()) {
            throw new IOException("Channel is closed for write");
        }
        return this.f;
    }

    @Override // io.ktor.utils.io.n
    public final Mj.i f() throws Throwable {
        Throwable thB = b();
        if (thB != null) {
            throw thB;
        }
        Mj.a aVar = this.e;
        if (aVar.exhausted()) {
            m();
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gj.InterfaceC1526a r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.j
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.j r0 = (io.ktor.utils.io.j) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            io.ktor.utils.io.j r0 = new io.ktor.utils.io.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17532b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            io.ktor.utils.io.k r0 = r0.f17531a
            bj.AbstractC1039j.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L44
        L29:
            r5 = move-exception
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            bj.AbstractC1039j.b(r5)
            bj.h$a r5 = bj.C1037h.f9166b     // Catch: java.lang.Throwable -> L49
            r0.f17531a = r4     // Catch: java.lang.Throwable -> L49
            r0.e = r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r4.c(r0)     // Catch: java.lang.Throwable -> L49
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            kotlin.Unit r5 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L29
            bj.h$a r5 = bj.C1037h.f9166b     // Catch: java.lang.Throwable -> L29
            goto L50
        L49:
            r5 = move-exception
            r0 = r4
        L4b:
            bj.h$a r1 = bj.C1037h.f9166b
            bj.AbstractC1039j.a(r5)
        L50:
            io.ktor.utils.io.A r5 = io.ktor.utils.io.B.f17515a
        L52:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = io.ktor.utils.io.k.h
            r2 = 0
            boolean r3 = r1.compareAndSet(r0, r2, r5)
            if (r3 == 0) goto L61
            r0.k(r2)
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        L61:
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L52
            kotlin.Unit r5 = kotlin.Unit.f18162a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.g(gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(int r13, ij.AbstractC1609c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.k.h(int, ij.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.n
    public final boolean i() {
        if (b() == null) {
            return d() && this.flushBufferSize == 0 && this.e.exhausted();
        }
        return true;
    }

    public final void j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l();
        A a8 = B.f17515a;
        do {
            atomicReferenceFieldUpdater = h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, a8)) {
                k(null);
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
    }

    public final void k(Throwable th2) {
        C1646a c1646a;
        if (th2 != null) {
            c1646a = new C1646a(th2);
        } else {
            g.f17525a.getClass();
            c1646a = C1647b.f17521b;
        }
        g gVar = (g) f17533g.getAndSet(this, c1646a);
        if (gVar instanceof e) {
            ((e) gVar).a(th2);
        }
    }

    public final void l() {
        if (this.f.exhausted()) {
            return;
        }
        synchronized (this.f17535d) {
            Mj.a aVar = this.f;
            int i = (int) aVar.c;
            this.c.f(aVar);
            this.flushBufferSize += i;
            Unit unit = Unit.f18162a;
        }
        g gVar = (g) this.suspensionSlot;
        if (gVar instanceof C1649d) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17533g;
            C1648c c1648c = C1648c.f17522b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, c1648c)) {
                if (atomicReferenceFieldUpdater.get(this) != gVar) {
                    return;
                }
            }
            ((e) gVar).resume();
        }
    }

    public final void m() {
        synchronized (this.f17535d) {
            this.c.e(this.e);
            this.flushBufferSize = 0;
            Unit unit = Unit.f18162a;
        }
        g gVar = (g) this.suspensionSlot;
        if (gVar instanceof f) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17533g;
            C1648c c1648c = C1648c.f17522b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, c1648c)) {
                if (atomicReferenceFieldUpdater.get(this) != gVar) {
                    return;
                }
            }
            ((e) gVar).resume();
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
