package Z3;

import Y.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final a e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6885a = new int[929];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f6886b = new int[929];
    public final e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f6887d;

    public a() {
        int i = 1;
        for (int i4 = 0; i4 < 929; i4++) {
            this.f6885a[i4] = i;
            i = (i * 3) % 929;
        }
        for (int i6 = 0; i6 < 928; i6++) {
            this.f6886b[this.f6885a[i6]] = i6;
        }
        this.c = new e(this, new int[]{0});
        this.f6887d = new e(this, new int[]{1});
    }

    public final int a(int i, int i4) {
        return (i + i4) % 929;
    }

    public final int b(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.f6885a[928 - this.f6886b[i]];
    }

    public final int c(int i, int i4) {
        if (i == 0 || i4 == 0) {
            return 0;
        }
        int[] iArr = this.f6886b;
        return this.f6885a[(iArr[i] + iArr[i4]) % 928];
    }
}
