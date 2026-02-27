package ph;

import fh.InterfaceC1486b;
import ih.InterfaceC1606d;
import java.util.concurrent.atomic.AtomicReference;
import oi.C1989g;
import wh.AbstractC2439a;

/* JADX INFO: renamed from: ph.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2063d2 extends AbstractC2439a implements InterfaceC1606d {
    public static final C1989g e = new C1989g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19439b;
    public final S1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y1 f19440d;

    public C2063d2(Y1 y12, ch.l lVar, AtomicReference atomicReference, S1 s12) {
        this.f19440d = y12;
        this.f19438a = lVar;
        this.f19439b = atomicReference;
        this.c = s12;
    }

    public static C2063d2 e(ch.l lVar, S1 s12) {
        AtomicReference atomicReference = new AtomicReference();
        return new C2063d2(new Y1(atomicReference, s12), lVar, atomicReference, s12);
    }

    @Override // ih.InterfaceC1606d
    public final void a(InterfaceC1486b interfaceC1486b) {
        AtomicReference atomicReference;
        X1 x12 = (X1) interfaceC1486b;
        do {
            atomicReference = this.f19439b;
            if (atomicReference.compareAndSet(x12, null)) {
                return;
            }
        } while (atomicReference.get() == x12);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // wh.AbstractC2439a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(hh.InterfaceC1573f r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference r0 = r5.f19439b
            java.lang.Object r1 = r0.get()
            ph.X1 r1 = (ph.X1) r1
            if (r1 == 0) goto L19
            java.util.concurrent.atomic.AtomicReference r2 = r1.c
            java.lang.Object r2 = r2.get()
            ph.T1[] r3 = ph.X1.f
            if (r2 != r3) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 == 0) goto L2b
        L19:
            ph.S1 r2 = r5.c
            ph.W1 r2 = r2.call()
            ph.X1 r3 = new ph.X1
            r3.<init>(r2)
        L24:
            boolean r2 = r0.compareAndSet(r1, r3)
            if (r2 == 0) goto L57
            r1 = r3
        L2b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f19381d
            boolean r2 = r0.get()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L3d
            boolean r2 = r0.compareAndSet(r4, r3)
            if (r2 == 0) goto L3d
            r2 = r3
            goto L3e
        L3d:
            r2 = r4
        L3e:
            r6.accept(r1)     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L48
            ch.l r6 = r5.f19438a
            r6.subscribe(r1)
        L48:
            return
        L49:
            r6 = move-exception
            if (r2 == 0) goto L4f
            r0.compareAndSet(r3, r4)
        L4f:
            of.p.F(r6)
            java.lang.RuntimeException r6 = vh.AbstractC2353d.d(r6)
            throw r6
        L57:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L24
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C2063d2.d(hh.f):void");
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        this.f19440d.subscribe(rVar);
    }
}
