package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzzx {
    private boolean zzc;
    private int zze;
    private zzzw zza = new zzzw();
    private zzzw zzb = new zzzw();
    private long zzd = androidx.media3.common.C.TIME_UNSET;

    public final void zza() {
        this.zza.zza();
        this.zzb.zza();
        this.zzc = false;
        this.zzd = androidx.media3.common.C.TIME_UNSET;
        this.zze = 0;
    }

    public final void zzb(long j) {
        this.zza.zzf(j);
        if (this.zza.zzb()) {
            this.zzc = false;
        } else if (this.zzd != androidx.media3.common.C.TIME_UNSET) {
            if (!this.zzc || this.zzb.zzc()) {
                this.zzb.zza();
                this.zzb.zzf(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzf(j);
        }
        if (this.zzc && this.zzb.zzb()) {
            zzzw zzzwVar = this.zza;
            this.zza = this.zzb;
            this.zzb = zzzwVar;
            this.zzc = false;
        }
        this.zzd = j;
        this.zze = this.zza.zzb() ? 0 : this.zze + 1;
    }

    public final boolean zzc() {
        return this.zza.zzb();
    }

    public final int zzd() {
        return this.zze;
    }

    public final long zze() {
        return this.zza.zzb() ? this.zza.zzd() : androidx.media3.common.C.TIME_UNSET;
    }

    public final long zzf() {
        return this.zza.zzb() ? this.zza.zze() : androidx.media3.common.C.TIME_UNSET;
    }

    public final float zzg() {
        if (this.zza.zzb()) {
            return (float) (1.0E9d / this.zza.zze());
        }
        return -1.0f;
    }
}
