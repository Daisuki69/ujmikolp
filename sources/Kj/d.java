package Kj;

import Bj.H;
import Gj.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z4) {
        super(1, z4 ? 1 : 0);
        this.owner$volatile = z4 ? null : e.f2780a;
    }

    public final boolean c() {
        return Math.max(h.f2784g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r0.e(kotlin.Unit.f18162a, r3.f2786b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ij.AbstractC1609c r4) {
        /*
            r3 = this;
            r0 = 0
            boolean r0 = r3.e(r0)
            if (r0 == 0) goto La
            kotlin.Unit r4 = kotlin.Unit.f18162a
            return r4
        La:
            gj.a r4 = hj.h.b(r4)
            Bj.l r4 = Bj.H.q(r4)
            Kj.c r0 = new Kj.c     // Catch: java.lang.Throwable -> L42
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L42
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = Kj.h.f2784g     // Catch: java.lang.Throwable -> L42
            int r1 = r1.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L42
            int r2 = r3.f2785a     // Catch: java.lang.Throwable -> L42
            if (r1 > r2) goto L17
            if (r1 <= 0) goto L2b
            kotlin.Unit r1 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L42
            Bj.k r2 = r3.f2786b     // Catch: java.lang.Throwable -> L42
            r0.e(r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L31
        L2b:
            boolean r1 = r3.a(r0)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L17
        L31:
            java.lang.Object r4 = r4.q()
            hj.a r0 = hj.EnumC1578a.f17050a
            if (r4 != r0) goto L3a
            goto L3c
        L3a:
            kotlin.Unit r4 = kotlin.Unit.f18162a
        L3c:
            if (r4 != r0) goto L3f
            return r4
        L3f:
            kotlin.Unit r4 = kotlin.Unit.f18162a
            return r4
        L42:
            r0 = move-exception
            r4.z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Kj.d.d(ij.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.Object r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Kj.h.f2784g
            int r1 = r0.get(r7)
            int r2 = r7.f2785a
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r7)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r7, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            r2 = 1
            r3 = 2
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = Kj.d.h
            if (r1 > 0) goto L3e
            if (r8 != 0) goto L22
        L20:
            r0 = r2
            goto L4a
        L22:
            boolean r0 = r7.c()
            if (r0 != 0) goto L2a
            r0 = r4
            goto L37
        L2a:
            java.lang.Object r0 = r5.get(r7)
            Gj.t r1 = Kj.e.f2780a
            if (r0 == r1) goto L22
            if (r0 != r8) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r3
        L37:
            if (r0 == r2) goto L3c
            if (r0 == r3) goto L20
            goto L0
        L3c:
            r0 = r3
            goto L4a
        L3e:
            int r6 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r7, r1, r6)
            if (r0 == 0) goto L0
            r5.set(r7, r8)
            r0 = r4
        L4a:
            if (r0 == 0) goto L71
            if (r0 == r2) goto L70
            if (r0 == r3) goto L58
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r8.<init>(r0)
            throw r8
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L70:
            return r4
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Kj.d.e(java.lang.Object):boolean");
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = e.f2780a;
            if (obj2 != tVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + H.o(this) + "[isLocked=" + c() + ",owner=" + h.get(this) + ']';
    }
}
