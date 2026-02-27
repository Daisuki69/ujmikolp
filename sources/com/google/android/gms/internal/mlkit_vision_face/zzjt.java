package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes3.dex */
public final class zzjt {
    private Long zza;
    private Long zzb;
    private Long zzc;
    private Long zzd;
    private Long zze;
    private Long zzf;

    public final zzjt zza(Long l6) {
        this.zzc = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzb(Long l6) {
        this.zzd = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzc(Long l6) {
        this.zza = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzd(Long l6) {
        this.zze = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zze(Long l6) {
        this.zzb = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjt zzf(Long l6) {
        this.zzf = Long.valueOf(l6.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzjv zzg() {
        return new zzjv(this, null);
    }
}
