package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzdyi implements zzgoq {
    final /* synthetic */ zzdyo zza;

    public zzdyi(zzdyo zzdyoVar) {
        Objects.requireNonNull(zzdyoVar);
        this.zza = zzdyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcu zzfcuVar = (zzfcu) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcw)).booleanValue()) {
            this.zza.zzf().zzdU(zzfcuVar);
        }
    }
}
