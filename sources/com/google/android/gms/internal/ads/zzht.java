package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class zzht {
    private final long zza;
    private final long zzb;
    private long zzc = androidx.media3.common.C.TIME_UNSET;
    private long zzd = androidx.media3.common.C.TIME_UNSET;
    private long zzf = androidx.media3.common.C.TIME_UNSET;
    private long zzg = androidx.media3.common.C.TIME_UNSET;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = androidx.media3.common.C.TIME_UNSET;
    private long zze = androidx.media3.common.C.TIME_UNSET;
    private long zzh = androidx.media3.common.C.TIME_UNSET;
    private long zzm = androidx.media3.common.C.TIME_UNSET;
    private long zzn = androidx.media3.common.C.TIME_UNSET;

    public /* synthetic */ zzht(float f, float f3, long j, float f7, long j6, long j7, float f10, byte[] bArr) {
        this.zza = j6;
        this.zzb = j7;
    }

    private final void zzf() {
        long j;
        long j6 = this.zzc;
        if (j6 != androidx.media3.common.C.TIME_UNSET) {
            j = this.zzd;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                long j7 = this.zzf;
                if (j7 != androidx.media3.common.C.TIME_UNSET && j6 < j7) {
                    j6 = j7;
                }
                j = this.zzg;
                if (j == androidx.media3.common.C.TIME_UNSET || j6 <= j) {
                    j = j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze == j) {
            return;
        }
        this.zze = j;
        this.zzh = j;
        this.zzm = androidx.media3.common.C.TIME_UNSET;
        this.zzn = androidx.media3.common.C.TIME_UNSET;
        this.zzl = androidx.media3.common.C.TIME_UNSET;
    }

    private static long zzg(long j, long j6, float f) {
        return (long) ((j6 * 9.999871E-4f) + (j * 0.999f));
    }

    public final void zza(zzae zzaeVar) {
        long j = zzaeVar.zza;
        this.zzc = zzeo.zzq(androidx.media3.common.C.TIME_UNSET);
        this.zzf = zzeo.zzq(androidx.media3.common.C.TIME_UNSET);
        this.zzg = zzeo.zzq(androidx.media3.common.C.TIME_UNSET);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzf();
    }

    public final void zzb(long j) {
        this.zzd = j;
        zzf();
    }

    public final void zzc() {
        long j = this.zzh;
        if (j == androidx.media3.common.C.TIME_UNSET) {
            return;
        }
        long j6 = j + this.zzb;
        this.zzh = j6;
        long j7 = this.zzg;
        if (j7 != androidx.media3.common.C.TIME_UNSET && j6 > j7) {
            this.zzh = j7;
        }
        this.zzl = androidx.media3.common.C.TIME_UNSET;
    }

    public final float zzd(long j, long j6) {
        float f;
        long jMax;
        if (this.zzc == androidx.media3.common.C.TIME_UNSET) {
            return 1.0f;
        }
        long j7 = j - j6;
        long j9 = this.zzm;
        if (j9 == androidx.media3.common.C.TIME_UNSET) {
            this.zzm = j7;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j7, zzg(j9, j7, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzg(this.zzn, Math.abs(j7 - jMax2), 0.999f);
        }
        if (this.zzl != androidx.media3.common.C.TIME_UNSET && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j10 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j10) {
            float fZzq = zzeo.zzq(1000L);
            f = 1.0E-7f;
            long[] jArr = {j10, this.zze, this.zzh - (((long) (fZzq * (this.zzk - 1.0f))) + ((long) ((this.zzi - 1.0f) * fZzq)))};
            jMax = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j11 = jArr[i];
                if (j11 > jMax) {
                    jMax = j11;
                }
            }
            this.zzh = jMax;
        } else {
            f = 1.0E-7f;
            long jMax3 = j - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f));
            long j12 = this.zzh;
            String str = zzeo.zza;
            jMax = Math.max(j12, Math.min(jMax3, j10));
            this.zzh = jMax;
            long j13 = this.zzg;
            if (j13 != androidx.media3.common.C.TIME_UNSET && jMax > j13) {
                this.zzh = j13;
                jMax = j13;
            }
        }
        long j14 = j - jMax;
        if (Math.abs(j14) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j14 * f) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zze() {
        return this.zzh;
    }
}
