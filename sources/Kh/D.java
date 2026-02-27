package Kh;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends Gh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ah.j f2681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2682b;
    public long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2683d;

    public D(Ah.j jVar, long j, long j6) {
        this.f2681a = jVar;
        this.c = j;
        this.f2682b = j6;
    }

    @Override // Fh.c
    public final int b(int i) {
        this.f2683d = true;
        return 1;
    }

    @Override // Fh.g
    public final void clear() {
        this.c = this.f2682b;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        set(1);
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        return this.c == this.f2682b;
    }

    @Override // Fh.g
    public final Object poll() {
        long j = this.c;
        if (j != this.f2682b) {
            this.c = 1 + j;
            return Integer.valueOf((int) j);
        }
        lazySet(1);
        return null;
    }
}
