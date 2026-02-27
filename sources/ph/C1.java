package ph;

import fh.InterfaceC1486b;
import ih.InterfaceC1606d;
import java.util.concurrent.atomic.AtomicReference;
import wh.AbstractC2439a;

/* JADX INFO: loaded from: classes4.dex */
public final class C1 extends AbstractC2439a implements InterfaceC1606d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.l f19141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f19142b = new AtomicReference();

    public C1(ch.l lVar) {
        this.f19141a = lVar;
    }

    @Override // ih.InterfaceC1606d
    public final void a(InterfaceC1486b interfaceC1486b) {
        AtomicReference atomicReference = this.f19142b;
        B1 b12 = (B1) interfaceC1486b;
        while (!atomicReference.compareAndSet(b12, null) && atomicReference.get() == b12) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    @Override // wh.AbstractC2439a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(hh.InterfaceC1573f r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference r0 = r4.f19142b
            java.lang.Object r1 = r0.get()
            ph.B1 r1 = (ph.B1) r1
            if (r1 == 0) goto L17
            java.lang.Object r2 = r1.get()
            ph.A1[] r3 = ph.B1.f
            if (r2 != r3) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L23
        L17:
            ph.B1 r2 = new ph.B1
            r2.<init>(r0)
        L1c:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L48
            r1 = r2
        L23:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f19126a
            boolean r2 = r0.get()
            r3 = 0
            if (r2 != 0) goto L34
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 == 0) goto L34
            r3 = r2
        L34:
            r5.accept(r1)     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L3e
            ch.l r5 = r4.f19141a
            r5.subscribe(r1)
        L3e:
            return
        L3f:
            r5 = move-exception
            of.p.F(r5)
            java.lang.RuntimeException r5 = vh.AbstractC2353d.d(r5)
            throw r5
        L48:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L1c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.C1.d(hh.f):void");
    }

    @Override // ch.l
    public final void subscribeActual(ch.r rVar) {
        B1 b12;
        A1[] a1Arr;
        A1[] a1Arr2;
        loop0: while (true) {
            AtomicReference atomicReference = this.f19142b;
            b12 = (B1) atomicReference.get();
            if (b12 != null) {
                break;
            }
            B1 b13 = new B1(atomicReference);
            while (!atomicReference.compareAndSet(b12, b13)) {
                if (atomicReference.get() != b12) {
                    break;
                }
            }
            b12 = b13;
            break loop0;
        }
        A1 a12 = new A1(rVar, b12);
        rVar.onSubscribe(a12);
        do {
            a1Arr = (A1[]) b12.get();
            if (a1Arr == B1.f) {
                Throwable th2 = b12.f19128d;
                if (th2 != null) {
                    rVar.onError(th2);
                    return;
                } else {
                    rVar.onComplete();
                    return;
                }
            }
            int length = a1Arr.length;
            a1Arr2 = new A1[length + 1];
            System.arraycopy(a1Arr, 0, a1Arr2, 0, length);
            a1Arr2[length] = a12;
        } while (!b12.compareAndSet(a1Arr, a1Arr2));
        if (a12.get() == null) {
            b12.a(a12);
        }
    }
}
