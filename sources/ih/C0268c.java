package Ih;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Ih.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0268c extends AbstractC0267b {
    public final /* synthetic */ int c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f2303d;
    public volatile boolean e;
    public final AtomicInteger f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2304g;

    public C0268c(Ah.e eVar, int i) {
        super(eVar);
        this.f2304g = new Mh.b(i);
        this.f = new AtomicInteger();
    }

    @Override // Ih.AbstractC0267b
    public final void d() {
        switch (this.c) {
            case 0:
                g();
                break;
            default:
                g();
                break;
        }
    }

    @Override // Ih.AbstractC0267b
    public final void e() {
        switch (this.c) {
            case 0:
                if (this.f.getAndIncrement() == 0) {
                    ((Mh.b) this.f2304g).clear();
                }
                break;
            default:
                if (this.f.getAndIncrement() == 0) {
                    ((AtomicReference) this.f2304g).lazySet(null);
                }
                break;
        }
    }

    @Override // Ih.AbstractC0267b
    public final boolean f(Throwable th2) {
        switch (this.c) {
            case 0:
                if (!this.e && !this.f2302b.b()) {
                    this.f2303d = th2;
                    this.e = true;
                    g();
                    break;
                }
                break;
            default:
                if (!this.e && !this.f2302b.b()) {
                    this.f2303d = th2;
                    this.e = true;
                    g();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r9 != r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r17.f2302b.b() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r2.lazySet(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        r5 = r17.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r2.get() != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (r5 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r12 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f2303d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r9 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        k2.v0.B(r17, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r4 = r17.f.addAndGet(-r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ih.C0268c.g():void");
    }

    @Override // Ih.AbstractC0267b, Ah.c
    public final void onComplete() {
        switch (this.c) {
            case 0:
                this.e = true;
                g();
                break;
            default:
                this.e = true;
                g();
                break;
        }
    }

    @Override // Ah.c
    public final void onNext(Object obj) {
        switch (this.c) {
            case 0:
                if (!this.e && !this.f2302b.b()) {
                    ((Mh.b) this.f2304g).offer(obj);
                    g();
                    break;
                }
                break;
            default:
                if (!this.e && !this.f2302b.b()) {
                    ((AtomicReference) this.f2304g).set(obj);
                    g();
                    break;
                }
                break;
        }
    }

    public C0268c(Ah.e eVar) {
        super(eVar);
        this.f2304g = new AtomicReference();
        this.f = new AtomicInteger();
    }
}
