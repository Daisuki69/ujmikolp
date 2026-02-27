package ph;

/* JADX INFO: renamed from: ph.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2095l2 extends AbstractC2099m2 {
    @Override // ph.AbstractC2099m2
    public final void a() {
        this.f19553a.onComplete();
    }

    @Override // ph.AbstractC2099m2
    public final void b() {
        Object andSet = getAndSet(null);
        if (andSet != null) {
            this.f19553a.onNext(andSet);
        }
    }
}
