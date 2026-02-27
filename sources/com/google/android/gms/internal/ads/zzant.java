package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzant {
    public static int zza(byte[] bArr, int i, int i4) {
        while (i < i4 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzef zzefVar, int i, int i4) {
        zzefVar.zzh(i);
        if (zzefVar.zzd() < 5) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        int iZzB = zzefVar.zzB();
        if ((8388608 & iZzB) != 0 || ((iZzB >> 8) & 8191) != i4 || (iZzB & 32) == 0 || zzefVar.zzs() < 7 || zzefVar.zzd() < 7 || (zzefVar.zzs() & 16) != 16) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        zzefVar.zzm(bArr, 0, 6);
        long j = bArr[0];
        long j6 = bArr[1];
        long j7 = bArr[2];
        long j9 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j6 & 255) << 17) | ((j7 & 255) << 9) | (j9 + j9) | ((((long) bArr[4]) & 255) >> 7);
    }
}
