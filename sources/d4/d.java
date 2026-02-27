package d4;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final int[][] c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f16264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f16265b;

    public d(int i) {
        int i4 = (i >> 3) & 3;
        if (i4 < 0 || i4 >= 4) {
            throw new IllegalArgumentException();
        }
        this.f16264a = c.f16262d[i4];
        this.f16265b = (byte) (i & 7);
    }

    public static d a(int i, int i4) {
        int iBitCount;
        int[][] iArr = c;
        int i6 = Integer.MAX_VALUE;
        int i10 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            int[] iArr2 = iArr[i11];
            int i12 = iArr2[0];
            if (i12 == i || i12 == i4) {
                return new d(iArr2[1]);
            }
            int iBitCount2 = Integer.bitCount(i ^ i12);
            if (iBitCount2 < i6) {
                i10 = iArr2[1];
                i6 = iBitCount2;
            }
            if (i != i4 && (iBitCount = Integer.bitCount(i12 ^ i4)) < i6) {
                i10 = iArr2[1];
                i6 = iBitCount;
            }
        }
        if (i6 <= 3) {
            return new d(i10);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16264a == dVar.f16264a && this.f16265b == dVar.f16265b;
    }

    public final int hashCode() {
        return (this.f16264a.ordinal() << 3) | this.f16265b;
    }
}
