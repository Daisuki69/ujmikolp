package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmz {
    private zznl zza;
    private Long zzb;
    private zzmu zzc;
    private Long zzd;
    private zzna zze;
    private Long zzf;

    public final zzmz zzb(Long l6) {
        this.zzf = l6;
        return this;
    }

    public final zzmz zzc(zzna zznaVar) {
        this.zze = zznaVar;
        return this;
    }

    public final zzmz zzd(zzmu zzmuVar) {
        this.zzc = zzmuVar;
        return this;
    }

    public final zzmz zze(Long l6) {
        this.zzd = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmz zzf(zznl zznlVar) {
        this.zza = zznlVar;
        return this;
    }

    public final zzmz zzg(Long l6) {
        this.zzb = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznc zzi() {
        return new zznc(this, null);
    }
}
