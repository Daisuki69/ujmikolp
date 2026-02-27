package Ih;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC0267b {
    @Override // Ah.c
    public final void onNext(Object obj) {
        long j;
        if (this.f2302b.b()) {
            return;
        }
        this.f2301a.onNext(obj);
        do {
            j = get();
            if (j == 0) {
                return;
            }
        } while (!compareAndSet(j, j - 1));
    }
}
