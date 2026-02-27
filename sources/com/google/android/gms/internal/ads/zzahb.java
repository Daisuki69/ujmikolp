package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzahb {
    private static final long[] zza = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] zzb = new byte[8];
    private int zzc;
    private int zzd;

    public static int zzd(int i) {
        int i4 = 0;
        while (i4 < 8) {
            int i6 = i4 + 1;
            if ((zza[i4] & ((long) i)) != 0) {
                return i6;
            }
            i4 = i6;
        }
        return -1;
    }

    public static long zze(byte[] bArr, int i, boolean z4) {
        long j = ((long) bArr[0]) & 255;
        if (z4) {
            j &= ~zza[i - 1];
        }
        for (int i4 = 1; i4 < i; i4++) {
            j = (j << 8) | (((long) bArr[i4]) & 255);
        }
        return j;
    }

    public final void zza() {
        this.zzc = 0;
        this.zzd = 0;
    }

    public final long zzb(zzacv zzacvVar, boolean z4, boolean z5, int i) throws IOException {
        if (this.zzc == 0) {
            byte[] bArr = this.zzb;
            if (!zzacvVar.zzb(bArr, 0, 1, z4)) {
                return -1L;
            }
            int iZzd = zzd(bArr[0] & 255);
            this.zzd = iZzd;
            if (iZzd == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.zzc = 1;
        }
        int i4 = this.zzd;
        if (i4 > i) {
            this.zzc = 0;
            return -2L;
        }
        if (i4 != 1) {
            zzacvVar.zzc(this.zzb, 1, i4 - 1);
        }
        this.zzc = 0;
        return zze(this.zzb, this.zzd, z5);
    }

    public final int zzc() {
        return this.zzd;
    }
}
