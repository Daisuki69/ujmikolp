package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbhv extends zzbhc {
    final /* synthetic */ zzbhw zza;

    public /* synthetic */ zzbhv(zzbhw zzbhwVar, byte[] bArr) {
        Objects.requireNonNull(zzbhwVar);
        this.zza = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final void zze(zzbgq zzbgqVar) {
        zzbhw zzbhwVar = this.zza;
        zzbhwVar.zzc().zzb(zzbhwVar.zze(zzbgqVar));
    }
}
