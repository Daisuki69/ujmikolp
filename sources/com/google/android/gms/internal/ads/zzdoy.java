package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzdoy implements zzbsc {
    final /* synthetic */ zzdph zza;

    public zzdoy(zzdph zzdphVar) {
        Objects.requireNonNull(zzdphVar);
        this.zza = zzdphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zza(int i, int i4, int i6, int i10) {
        this.zza.zzg().zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzb() {
        this.zza.zzg().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzc() {
        this.zza.zzh().zza();
    }
}
