package Kh;

import bg.AbstractC0983W;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Kh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0297b extends AtomicReference implements Ah.j, Ah.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2717b;
    public final AtomicInteger c;

    public /* synthetic */ C0297b(AtomicInteger atomicInteger, int i, int i4) {
        this.f2716a = i4;
        this.c = atomicInteger;
        this.f2717b = i;
    }

    @Override // Ah.j
    public final void a(io.reactivex.rxjava3.disposables.b bVar) {
        switch (this.f2716a) {
            case 0:
                Dh.a.d(this, bVar);
                break;
            default:
                Dh.a.d(this, bVar);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:4:0x0007, B:6:0x000b, B:10:0x000f, B:15:0x0019, B:18:0x0023, B:17:0x0021), top: B:25:0x0007 }] */
    @Override // Ah.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onComplete() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r5.c
            Kh.c r0 = (Kh.C0298c) r0
            int r1 = r5.f2717b
            monitor-enter(r0)
            java.lang.Object[] r2 = r0.f2720d     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L2d
        Lf:
            r1 = r2[r1]     // Catch: java.lang.Throwable -> Ld
            r3 = 1
            if (r1 != 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 != 0) goto L21
            int r4 = r0.j     // Catch: java.lang.Throwable -> Ld
            int r4 = r4 + r3
            r0.j = r4     // Catch: java.lang.Throwable -> Ld
            int r2 = r2.length     // Catch: java.lang.Throwable -> Ld
            if (r4 != r2) goto L23
        L21:
            r0.f2721g = r3     // Catch: java.lang.Throwable -> Ld
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L29
            r0.a()
        L29:
            r0.c()
            return
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Kh.C0297b.onComplete():void");
    }

    @Override // Ah.j
    public final void onError(Throwable th2) {
        switch (this.f2716a) {
            case 0:
                C0298c c0298c = (C0298c) this.c;
                if (c0298c.h.a(th2)) {
                    c0298c.a();
                    c0298c.c();
                }
                break;
            default:
                ((Lh.k) this.c).a(th2, this.f2717b);
                break;
        }
    }

    @Override // Ah.j
    public void onNext(Object obj) {
        boolean z4;
        C0298c c0298c = (C0298c) this.c;
        int i = this.f2717b;
        synchronized (c0298c) {
            try {
                Object[] objArr = c0298c.f2720d;
                if (objArr == null) {
                    return;
                }
                Object obj2 = objArr[i];
                int i4 = c0298c.i;
                if (obj2 == null) {
                    i4++;
                    c0298c.i = i4;
                }
                objArr[i] = obj;
                if (i4 == objArr.length) {
                    c0298c.e.offer(objArr.clone());
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    c0298c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Ah.q
    public void onSuccess(Object obj) {
        Lh.k kVar = (Lh.k) this.c;
        Ah.q qVar = kVar.f3004a;
        int i = this.f2717b;
        Object[] objArr = kVar.f3006d;
        objArr[i] = obj;
        if (kVar.decrementAndGet() == 0) {
            try {
                Object objApply = kVar.f3005b.apply(objArr);
                Objects.requireNonNull(objApply, "The zipper returned a null value");
                qVar.onSuccess(objApply);
            } catch (Throwable th2) {
                AbstractC0983W.G(th2);
                qVar.onError(th2);
            }
        }
    }
}
