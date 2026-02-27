package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzblf implements zzgob {
    final /* synthetic */ zzbkx zza;

    public zzblf(zzblj zzbljVar, zzbkx zzbkxVar) {
        this.zza = zzbkxVar;
        Objects.requireNonNull(zzbljVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ S1.y zza(Object obj) throws Exception {
        zzbzm zzbzmVar = new zzbzm();
        ((zzbld) obj).zze(this.zza, new zzble(this, zzbzmVar));
        return zzbzmVar;
    }
}
