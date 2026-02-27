package Qi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f5392b = {1000, 1500, 2250, 3375, 5063, 7594, 11391, 17086, 25629, 38443, 57665, 86498, 129746, 194620, 291929, 437894, 656841, 985261, 1477892, 2216838, 3325257, 4987885, 7481828};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f5393a = new long[23];

    public final void a(long j) {
        int iBinarySearch;
        long j6 = j * 1000;
        if (j6 > 7481828) {
            iBinarySearch = 22;
        } else {
            iBinarySearch = Arrays.binarySearch(f5392b, j6);
            if (iBinarySearch < 0) {
                iBinarySearch = -(iBinarySearch + 1);
            }
        }
        long[] jArr = this.f5393a;
        jArr[iBinarySearch] = jArr[iBinarySearch] + 1;
    }
}
