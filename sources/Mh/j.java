package mh;

import ch.InterfaceC1108g;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import uh.EnumC2313a;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends AtomicInteger implements InterfaceC1108g, nk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1108g f18436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nk.c f18437b;
    public volatile boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f18438d;
    public volatile boolean e;
    public final AtomicLong f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f18439g = new AtomicReference();

    public j(InterfaceC1108g interfaceC1108g) {
        this.f18436a = interfaceC1108g;
    }

    public final boolean a(boolean z4, boolean z5, nk.b bVar, AtomicReference atomicReference) {
        if (this.e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z4) {
            return false;
        }
        Throwable th2 = this.f18438d;
        if (th2 != null) {
            atomicReference.lazySet(null);
            bVar.onError(th2);
            return true;
        }
        if (!z5) {
            return false;
        }
        bVar.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r7 != r1.get()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r9 = r13.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2.get() != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (a(r9, r10, r0, r2) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r7 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        X5.f.A(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r4 = addAndGet(-r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r13 = this;
            int r0 = r13.getAndIncrement()
            if (r0 == 0) goto L7
            goto L5e
        L7:
            ch.g r0 = r13.f18436a
            java.util.concurrent.atomic.AtomicLong r1 = r13.f
            java.util.concurrent.atomic.AtomicReference r2 = r13.f18439g
            r3 = 1
            r4 = r3
        Lf:
            r5 = 0
            r7 = r5
        L12:
            long r9 = r1.get()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L38
            boolean r9 = r13.c
            r11 = 0
            java.lang.Object r11 = r2.getAndSet(r11)
            if (r11 != 0) goto L26
            r12 = r3
            goto L27
        L26:
            r12 = r10
        L27:
            boolean r9 = r13.a(r9, r12, r0, r2)
            if (r9 == 0) goto L2e
            goto L5e
        L2e:
            if (r12 == 0) goto L31
            goto L38
        L31:
            r0.onNext(r11)
            r9 = 1
            long r7 = r7 + r9
            goto L12
        L38:
            long r11 = r1.get()
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
            boolean r9 = r13.c
            java.lang.Object r11 = r2.get()
            if (r11 != 0) goto L49
            r10 = r3
        L49:
            boolean r9 = r13.a(r9, r10, r0, r2)
            if (r9 == 0) goto L50
            goto L5e
        L50:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L57
            X5.f.A(r1, r7)
        L57:
            int r4 = -r4
            int r4 = r13.addAndGet(r4)
            if (r4 != 0) goto Lf
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.j.b():void");
    }

    @Override // nk.b
    public final void c(nk.c cVar) {
        if (EnumC2313a.b(this.f18437b, cVar)) {
            this.f18437b = cVar;
            this.f18436a.c(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // nk.c
    public final void cancel() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f18437b.cancel();
        if (getAndIncrement() == 0) {
            this.f18439g.lazySet(null);
        }
    }

    @Override // nk.b
    public final void onComplete() {
        this.c = true;
        b();
    }

    @Override // nk.b
    public final void onError(Throwable th2) {
        this.f18438d = th2;
        this.c = true;
        b();
    }

    @Override // nk.b
    public final void onNext(Object obj) {
        this.f18439g.lazySet(obj);
        b();
    }

    @Override // nk.c
    public final void request(long j) {
        if (EnumC2313a.a(j)) {
            X5.f.e(this.f, j);
            b();
        }
    }
}
