package Nh;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d[] f4456b;
    public long c;

    public c(int i, n nVar) {
        this.f4455a = i;
        this.f4456b = new d[i];
        for (int i4 = 0; i4 < i; i4++) {
            this.f4456b[i4] = new d(nVar);
        }
    }

    public final d a() {
        int i = this.f4455a;
        if (i == 0) {
            return e.f;
        }
        long j = this.c;
        this.c = 1 + j;
        return this.f4456b[(int) (j % ((long) i))];
    }
}
