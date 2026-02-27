package M3;

import We.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final a h = new a(4201, 4096, 1);
    public static final a i = new a(1033, 1024, 1);
    public static final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f3049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f3050l;
    public static final a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f3051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f3052o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f3053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3054b;
    public final b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f3055d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3056g;

    static {
        a aVar = new a(67, 64, 1);
        j = aVar;
        f3049k = new a(19, 16, 1);
        f3050l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        m = aVar2;
        f3051n = aVar2;
        f3052o = aVar;
    }

    public a(int i4, int i6, int i10) {
        this.f = i4;
        this.e = i6;
        this.f3056g = i10;
        this.f3053a = new int[i6];
        this.f3054b = new int[i6];
        int i11 = 1;
        for (int i12 = 0; i12 < i6; i12++) {
            this.f3053a[i12] = i11;
            i11 <<= 1;
            if (i11 >= i6) {
                i11 = (i11 ^ i4) & (i6 - 1);
            }
        }
        for (int i13 = 0; i13 < i6 - 1; i13++) {
            this.f3054b[this.f3053a[i13]] = i13;
        }
        this.c = new b(this, new int[]{0});
        this.f3055d = new b(this, new int[]{1});
    }

    public final b a(int i4, int i6) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        if (i6 == 0) {
            return this.c;
        }
        int[] iArr = new int[i4 + 1];
        iArr[0] = i6;
        return new b(this, iArr);
    }

    public final int b(int i4) {
        if (i4 == 0) {
            throw new ArithmeticException();
        }
        return this.f3053a[(this.e - this.f3054b[i4]) - 1];
    }

    public final int c(int i4, int i6) {
        if (i4 == 0 || i6 == 0) {
            return 0;
        }
        int[] iArr = this.f3054b;
        return this.f3053a[(iArr[i4] + iArr[i6]) % (this.e - 1)];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GF(0x");
        sb2.append(Integer.toHexString(this.f));
        sb2.append(',');
        return s.m(sb2, this.e, ')');
    }
}
