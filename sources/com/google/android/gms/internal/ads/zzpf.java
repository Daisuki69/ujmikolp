package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpf {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpf zza(boolean z4) {
        this.zza = true;
        return this;
    }

    public final zzpf zzb(boolean z4) {
        this.zzb = z4;
        return this;
    }

    public final zzpf zzc(boolean z4) {
        this.zzc = z4;
        return this;
    }

    public final zzpg zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpg(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final /* synthetic */ boolean zze() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}
