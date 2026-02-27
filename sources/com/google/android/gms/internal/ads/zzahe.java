package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes3.dex */
final class zzahe implements zzahi {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahe(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == androidx.media3.common.C.TIME_UNSET ? zzeo.zzq(jArr2[jArr2.length - 1]) : j;
    }

    public static zzahe zzd(long j, zzagk zzagkVar, long j6) {
        int[] iArr = zzagkVar.zzd;
        int length = iArr.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j7 = 0;
        jArr2[0] = 0;
        for (int i4 = 1; i4 <= length; i4++) {
            int i6 = i4 - 1;
            j += (long) (zzagkVar.zzb + iArr[i6]);
            j7 += (long) (zzagkVar.zzc + zzagkVar.zze[i6]);
            jArr[i4] = j;
            jArr2[i4] = j7;
        }
        return new zzahe(jArr, jArr2, j6);
    }

    private static Pair zzh(long j, long[] jArr, long[] jArr2) {
        int iZzm = zzeo.zzm(jArr, j, true, true);
        long j6 = jArr[iZzm];
        long j7 = jArr2[iZzm];
        int i = iZzm + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j6), Long.valueOf(j7));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j6 ? AudioStats.AUDIO_AMPLITUDE_NONE : (j - j6) / (r6 - j6)) * (jArr2[i] - j7))) + j7));
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        String str = zzeo.zza;
        Pair pairZzh = zzh(zzeo.zzp(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzadw zzadwVar = new zzadw(zzeo.zzq(((Long) pairZzh.first).longValue()), ((Long) pairZzh.second).longValue());
        return new zzadt(zzadwVar, zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j) {
        return zzeo.zzq(((Long) zzh(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return androidx.media3.common.C.RATE_UNSET_INT;
    }
}
