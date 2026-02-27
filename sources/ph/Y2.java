package ph;

import fh.InterfaceC1486b;
import ih.EnumC1604b;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class Y2 extends AtomicInteger implements ch.r, InterfaceC1486b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19391b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19392d;
    public InterfaceC1486b e;
    public Wh.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f19393g;

    public Y2(ch.r rVar, long j, int i) {
        this.f19390a = rVar;
        this.f19391b = j;
        this.c = i;
    }

    @Override // fh.InterfaceC1486b
    public final void dispose() {
        this.f19393g = true;
    }

    @Override // ch.r
    public final void onComplete() {
        Wh.f fVar = this.f;
        if (fVar != null) {
            this.f = null;
            fVar.onComplete();
        }
        this.f19390a.onComplete();
    }

    @Override // ch.r
    public final void onError(Throwable th2) {
        Wh.f fVar = this.f;
        if (fVar != null) {
            this.f = null;
            fVar.onError(th2);
        }
        this.f19390a.onError(th2);
    }

    @Override // ch.r
    public final void onNext(Object obj) {
        Wh.f fVar = this.f;
        if (fVar == null && !this.f19393g) {
            Wh.f fVar2 = new Wh.f(this.c, this);
            this.f = fVar2;
            this.f19390a.onNext(fVar2);
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.onNext(obj);
            long j = this.f19392d + 1;
            this.f19392d = j;
            if (j >= this.f19391b) {
                this.f19392d = 0L;
                this.f = null;
                fVar.onComplete();
                if (this.f19393g) {
                    this.e.dispose();
                }
            }
        }
    }

    @Override // ch.r
    public final void onSubscribe(InterfaceC1486b interfaceC1486b) {
        if (EnumC1604b.f(this.e, interfaceC1486b)) {
            this.e = interfaceC1486b;
            this.f19390a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19393g) {
            this.e.dispose();
        }
    }
}
