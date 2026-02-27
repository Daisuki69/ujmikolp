package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;

        private Results(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j;
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static Results rechunk(int i, long[] jArr, int[] iArr, long j) {
        int i4 = 8192 / i;
        int iCeilDivide = 0;
        for (int i6 : iArr) {
            iCeilDivide += Util.ceilDivide(i6, i4);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr2 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        int i10 = 0;
        int i11 = 0;
        int iMax = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            long j6 = jArr[i12];
            while (i13 > 0) {
                int iMin = Math.min(i4, i13);
                jArr2[i11] = j6;
                int i14 = i * iMin;
                iArr2[i11] = i14;
                iMax = Math.max(iMax, i14);
                jArr3[i11] = ((long) i10) * j;
                iArr3[i11] = 1;
                j6 += (long) iArr2[i11];
                i10 += iMin;
                i13 -= iMin;
                i11++;
            }
        }
        return new Results(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i10));
    }
}
