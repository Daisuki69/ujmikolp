package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgju {
    public static int zze(int i, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i4 <= i) {
            return i;
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

    public abstract zzgju zzd(Object obj);
}
