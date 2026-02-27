package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes3.dex */
public class zzaa {
    public static int zza(int i, int i4) {
        if (i4 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i6 = i + (i >> 1) + 1;
        if (i6 < i4) {
            int iHighestOneBit = Integer.highestOneBit(i4 - 1);
            i6 = iHighestOneBit + iHighestOneBit;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }
}
