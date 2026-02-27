package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeea implements zzedz {

    @VisibleForTesting
    public final zzedz zza;
    private final zzggr zzb;

    public zzeea(zzedz zzedzVar, zzggr zzggrVar) {
        this.zza = zzedzVar;
        this.zzb = zzggrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        return this.zza.zza(zzfcuVar, zzfcjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final S1.y zzb(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        return zzgot.zzk(this.zza.zzb(zzfcuVar, zzfcjVar), this.zzb, zzbzh.zza);
    }
}
