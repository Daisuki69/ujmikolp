package ph;

/* JADX INFO: renamed from: ph.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2083i2 extends AbstractRunnableC2087j2 {
    @Override // ph.AbstractRunnableC2087j2
    public final void a() {
        this.f19511a.onComplete();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.f19511a.onNext(andSet);
        }
    }
}
