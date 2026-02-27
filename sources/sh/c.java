package sh;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f20085b;
    public long c;

    public c(int i, Nh.n nVar) {
        this.f20084a = i;
        this.f20085b = new d[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.f20085b[i4] = new d(nVar);
        }
    }

    public final d a() {
        int i = this.f20084a;
        if (i == 0) {
            return e.f20087g;
        }
        long j = this.c;
        this.c = 1 + j;
        return this.f20085b[(int) (j % ((long) i))];
    }
}
