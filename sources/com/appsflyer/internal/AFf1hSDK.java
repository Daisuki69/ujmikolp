package com.appsflyer.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1hSDK {
    private static void valueOf(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i4 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i4;
        }
    }

    public static void values(int i, int i4, boolean z4, int i6, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z4) {
            valueOf(iArr);
        }
        int i10 = 0;
        while (i10 < i6) {
            int i11 = i ^ iArr[i10];
            int iValues = i4 ^ values(i11, iArr2);
            i10++;
            i4 = i11;
            i = iValues;
        }
        int i12 = i ^ iArr[iArr.length - 2];
        int i13 = i4 ^ iArr[iArr.length - 1];
        if (!z4) {
            valueOf(iArr);
        }
        iArr3[0] = i13;
        iArr3[1] = i12;
    }

    private static int values(int i, int[][] iArr) {
        return ((iArr[0][i >>> 24] + iArr[1][(i >>> 16) & 255]) ^ iArr[2][(i >>> 8) & 255]) + iArr[3][i & 255];
    }
}
