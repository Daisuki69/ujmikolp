package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacc {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzacc(long j, long j6, long j7, long j9, long j10, long j11, long j12) {
        this.zza = j;
        this.zzb = j6;
        this.zze = j9;
        this.zzf = j10;
        this.zzg = j11;
        this.zzc = j12;
        this.zzh = zza(j6, 0L, j9, j10, j11, j12);
    }

    public static long zza(long j, long j6, long j7, long j9, long j10, long j11) {
        if (j9 + 1 >= j10 || 1 + j6 >= j7) {
            return j9;
        }
        long j12 = (long) (((j10 - j9) / (j7 - j6)) * (j - j6));
        String str = zzeo.zza;
        return Math.max(j9, Math.min(((j9 + j12) - j11) - (j12 / 20), j10 - 1));
    }

    private final void zzi() {
        this.zzh = zza(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }

    public final /* synthetic */ long zzb() {
        return this.zzf;
    }

    public final /* synthetic */ long zzc() {
        return this.zzg;
    }

    public final /* synthetic */ long zzd() {
        return this.zzb;
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ void zzf(long j, long j6) {
        this.zzd = j;
        this.zzf = j6;
        zzi();
    }

    public final /* synthetic */ void zzg(long j, long j6) {
        this.zze = j;
        this.zzg = j6;
        zzi();
    }

    public final /* synthetic */ long zzh() {
        return this.zzh;
    }
}
