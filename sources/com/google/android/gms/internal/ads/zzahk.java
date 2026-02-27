package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzahk {
    public final zzado zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;

    @Nullable
    public final long[] zzf;

    private zzahk(zzado zzadoVar, long j, long j6, @Nullable long[] jArr, int i, int i4) {
        this.zza = new zzado(zzadoVar);
        this.zzb = j;
        this.zzc = j6;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i4;
    }

    public static zzahk zza(zzado zzadoVar, zzef zzefVar) {
        long[] jArr;
        int i;
        int i4;
        int iZzB = zzefVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzefVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzefVar.zzz() : -1L;
        if ((iZzB & 4) == 4) {
            jArr = new long[100];
            for (int i6 = 0; i6 < 100; i6++) {
                jArr[i6] = zzefVar.zzs();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iZzB & 8) != 0) {
            zzefVar.zzk(4);
        }
        if (zzefVar.zzd() >= 24) {
            zzefVar.zzk(21);
            int iZzx = zzefVar.zzx();
            i4 = iZzx & 4095;
            i = iZzx >> 12;
        } else {
            i = -1;
            i4 = -1;
        }
        return new zzahk(zzadoVar, iZzH, jZzz, jArr2, i, i4);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return androidx.media3.common.C.TIME_UNSET;
        }
        return zzeo.zzr((j * ((long) r4.zzg)) - 1, this.zza.zzd);
    }
}
