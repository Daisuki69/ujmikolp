package ph;

import java.util.concurrent.atomic.AtomicBoolean;
import xh.AbstractC2477a;

/* JADX INFO: renamed from: ph.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2057c0 extends AbstractC2477a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2061d0 f19424b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19425d;
    public boolean e;
    public final AtomicBoolean f = new AtomicBoolean();

    public C2057c0(C2061d0 c2061d0, long j, Object obj) {
        this.f19424b = c2061d0;
        this.c = j;
        this.f19425d = obj;
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            C2061d0 c2061d0 = this.f19424b;
            long j = this.c;
            Object obj = this.f19425d;
            if (j == c2061d0.e) {
                c2061d0.f19432a.onNext(obj);
            }
        }
    }

    @Override // ch.r
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        a();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        if (this.e) {
            S1.s.r(th2);
        } else {
            this.e = true;
            this.f19424b.onError(th2);
        }
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        if (this.e) {
            return;
        }
        this.e = true;
        dispose();
        a();
    }
}
