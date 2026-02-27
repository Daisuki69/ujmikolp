package mx_android.support.v4.util;

/* JADX INFO: loaded from: classes7.dex */
class ContainerHelpers {
    static final int[] EMPTY_INTS = new int[0];
    static final long[] EMPTY_LONGS = new long[0];
    static final Object[] EMPTY_OBJECTS = new Object[0];

    public static int idealByteArraySize(int i) {
        for (int i4 = 4; i4 < 32; i4++) {
            int i6 = (1 << i4) - 12;
            if (i <= i6) {
                return i6;
            }
        }
        return i;
    }

    ContainerHelpers() {
    }

    public static int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public static int idealLongArraySize(int i) {
        return idealByteArraySize(i * 8) / 8;
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int binarySearch(int[] iArr, int i, int i4) {
        int i6 = i - 1;
        int i10 = 0;
        while (i10 <= i6) {
            int i11 = (i10 + i6) >>> 1;
            int i12 = iArr[i11];
            if (i12 < i4) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i4) {
                    return i11;
                }
                i6 = i11 - 1;
            }
        }
        return i10 ^ (-1);
    }

    static int binarySearch(long[] jArr, int i, long j) {
        int i4 = i - 1;
        int i6 = 0;
        while (i6 <= i4) {
            int i10 = (i6 + i4) >>> 1;
            long j6 = jArr[i10];
            if (j6 < j) {
                i6 = i10 + 1;
            } else {
                if (j6 <= j) {
                    return i10;
                }
                i4 = i10 - 1;
            }
        }
        return i6 ^ (-1);
    }
}
