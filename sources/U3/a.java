package U3;

import T3.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5926b;
    public final int[] e;
    public final int[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5925a = new int[4];
    public final float[] c = new float[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f5927d = new float[4];

    public a() {
        int[] iArr = new int[8];
        this.f5926b = iArr;
        this.e = new int[iArr.length / 2];
        this.f = new int[iArr.length / 2];
    }

    public static void g(float[] fArr, int[] iArr) {
        int i = 0;
        float f = fArr[0];
        for (int i4 = 1; i4 < iArr.length; i4++) {
            float f3 = fArr[i4];
            if (f3 < f) {
                i = i4;
                f = f3;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    public static void h(float[] fArr, int[] iArr) {
        int i = 0;
        float f = fArr[0];
        for (int i4 = 1; i4 < iArr.length; i4++) {
            float f3 = fArr[i4];
            if (f3 > f) {
                i = i4;
                f = f3;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    public static boolean i(int[] iArr) {
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i6 : iArr) {
                if (i6 > i4) {
                    i4 = i6;
                }
                if (i6 < i) {
                    i = i6;
                }
            }
            if (i4 < i * 10) {
                return true;
            }
        }
        return false;
    }
}
