package androidx.collection.internal;

import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class ContainerHelpersKt {
    public static final int[] EMPTY_INTS = new int[0];
    public static final long[] EMPTY_LONGS = new long[0];
    public static final Object[] EMPTY_OBJECTS = new Object[0];

    public static final int binarySearch(int[] array, int i, int i4) {
        j.g(array, "array");
        int i6 = i - 1;
        int i10 = 0;
        while (i10 <= i6) {
            int i11 = (i10 + i6) >>> 1;
            int i12 = array[i11];
            if (i12 < i4) {
                i10 = i11 + 1;
            } else {
                if (i12 <= i4) {
                    return i11;
                }
                i6 = i11 - 1;
            }
        }
        return ~i10;
    }

    public static final boolean equal(Object obj, Object obj2) {
        return j.b(obj, obj2);
    }

    public static final int idealByteArraySize(int i) {
        for (int i4 = 4; i4 < 32; i4++) {
            int i6 = (1 << i4) - 12;
            if (i <= i6) {
                return i6;
            }
        }
        return i;
    }

    public static final int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public static final int idealLongArraySize(int i) {
        return idealByteArraySize(i * 8) / 8;
    }

    public static final int binarySearch(long[] array, int i, long j) {
        j.g(array, "array");
        int i4 = i - 1;
        int i6 = 0;
        while (i6 <= i4) {
            int i10 = (i6 + i4) >>> 1;
            long j6 = array[i10];
            if (j6 < j) {
                i6 = i10 + 1;
            } else {
                if (j6 <= j) {
                    return i10;
                }
                i4 = i10 - 1;
            }
        }
        return ~i6;
    }
}
