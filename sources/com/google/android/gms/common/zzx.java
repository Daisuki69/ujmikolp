package com.google.android.gms.common;

/* JADX INFO: loaded from: classes2.dex */
final class zzx {
    public static int zza(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i4 = 0; i4 < 6; i4++) {
            int i6 = iArr[i4];
            int i10 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            if (i10 == i) {
                return i6;
            }
        }
        return 1;
    }
}
