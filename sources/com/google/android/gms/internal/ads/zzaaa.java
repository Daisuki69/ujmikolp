package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzaaa implements zzabp {
    final /* synthetic */ zzsq zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzaae zzd;

    public zzaaa(zzaae zzaaeVar, zzsq zzsqVar, int i, long j) {
        this.zza = zzsqVar;
        this.zzb = i;
        this.zzc = j;
        Objects.requireNonNull(zzaaeVar);
        this.zzd = zzaaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zza(long j) {
        this.zzd.zzax(this.zza, this.zzb, this.zzc, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final void zzb() {
        this.zzd.zzau(this.zza, this.zzb, this.zzc);
    }
}
