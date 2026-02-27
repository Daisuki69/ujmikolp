package androidx.core.content.res;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
final class GrowingArrayUtils {
    private GrowingArrayUtils() {
    }

    public static <T> T[] append(T[] tArr, int i, T t5) {
        if (i + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i));
            System.arraycopy(tArr, 0, objArr, 0, i);
            tArr = (T[]) objArr;
        }
        tArr[i] = t5;
        return tArr;
    }

    public static int growSize(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    public static <T> T[] insert(T[] tArr, int i, int i4, T t5) {
        if (i + 1 <= tArr.length) {
            System.arraycopy(tArr, i4, tArr, i4 + 1, i - i4);
            tArr[i4] = t5;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i)));
        System.arraycopy(tArr, 0, tArr2, 0, i4);
        tArr2[i4] = t5;
        System.arraycopy(tArr, i4, tArr2, i4 + 1, tArr.length - i4);
        return tArr2;
    }

    public static int[] append(int[] iArr, int i, int i4) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[growSize(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i4;
        return iArr;
    }

    public static int[] insert(int[] iArr, int i, int i4, int i6) {
        if (i + 1 <= iArr.length) {
            System.arraycopy(iArr, i4, iArr, i4 + 1, i - i4);
            iArr[i4] = i6;
            return iArr;
        }
        int[] iArr2 = new int[growSize(i)];
        System.arraycopy(iArr, 0, iArr2, 0, i4);
        iArr2[i4] = i6;
        System.arraycopy(iArr, i4, iArr2, i4 + 1, iArr.length - i4);
        return iArr2;
    }

    public static long[] append(long[] jArr, int i, long j) {
        if (i + 1 > jArr.length) {
            long[] jArr2 = new long[growSize(i)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            jArr = jArr2;
        }
        jArr[i] = j;
        return jArr;
    }

    public static boolean[] append(boolean[] zArr, int i, boolean z4) {
        if (i + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[growSize(i)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            zArr = zArr2;
        }
        zArr[i] = z4;
        return zArr;
    }

    public static long[] insert(long[] jArr, int i, int i4, long j) {
        if (i + 1 <= jArr.length) {
            System.arraycopy(jArr, i4, jArr, i4 + 1, i - i4);
            jArr[i4] = j;
            return jArr;
        }
        long[] jArr2 = new long[growSize(i)];
        System.arraycopy(jArr, 0, jArr2, 0, i4);
        jArr2[i4] = j;
        System.arraycopy(jArr, i4, jArr2, i4 + 1, jArr.length - i4);
        return jArr2;
    }

    public static boolean[] insert(boolean[] zArr, int i, int i4, boolean z4) {
        if (i + 1 <= zArr.length) {
            System.arraycopy(zArr, i4, zArr, i4 + 1, i - i4);
            zArr[i4] = z4;
            return zArr;
        }
        boolean[] zArr2 = new boolean[growSize(i)];
        System.arraycopy(zArr, 0, zArr2, 0, i4);
        zArr2[i4] = z4;
        System.arraycopy(zArr, i4, zArr2, i4 + 1, zArr.length - i4);
        return zArr2;
    }
}
