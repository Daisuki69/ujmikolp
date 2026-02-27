package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfkg extends com.google.android.gms.ads.internal.client.zzbm {
    final /* synthetic */ zzgpm zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbx zzb;
    final /* synthetic */ zzfkh zzc;

    public zzfkg(zzfkh zzfkhVar, zzgpm zzgpmVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zza = zzgpmVar;
        this.zzb = zzbxVar;
        Objects.requireNonNull(zzfkhVar);
        this.zzc = zzfkhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzb() {
        Objects.requireNonNull(this.zzc);
        zzfjy.zza(this.zzb, this.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        zzfkh zzfkhVar = this.zzc;
        String str = zzfkhVar.zze.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb2.append("Failed to load interstitial ad with error: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        zzfkhVar.zzv(zzeVar);
    }
}
