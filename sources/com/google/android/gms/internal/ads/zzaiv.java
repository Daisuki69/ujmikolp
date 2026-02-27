package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaiv {
    public final zzais zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaiv(zzais zzaisVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j, int i4) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzghc.zza(length == length2);
        zzghc.zza(jArr.length == length2);
        int length3 = iArr2.length;
        zzghc.zza(length3 == length2);
        this.zza = zzaisVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = i4;
        if (length3 > 0) {
            int i6 = length3 - 1;
            iArr2[i6] = iArr2[i6] | androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE;
        }
    }

    public final int zza(long j) {
        for (int iZzm = zzeo.zzm(this.zzf, j, true, false); iZzm >= 0; iZzm--) {
            if ((this.zzg[iZzm] & 1) != 0) {
                return iZzm;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        long[] jArr = this.zzf;
        for (int iZzo = zzeo.zzo(jArr, j, true, false); iZzo < jArr.length; iZzo++) {
            if ((this.zzg[iZzo] & 1) != 0) {
                return iZzo;
            }
        }
        return -1;
    }
}
