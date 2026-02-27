package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfkd extends zzbad {
    final /* synthetic */ zzgpm zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzft zzb;
    final /* synthetic */ zzfke zzc;

    public zzfkd(zzfke zzfkeVar, zzgpm zzgpmVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        this.zza = zzgpmVar;
        this.zzb = zzftVar;
        Objects.requireNonNull(zzfkeVar);
        this.zzc = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzb(zzbab zzbabVar) {
        Objects.requireNonNull(this.zzc);
        zzfjy.zza(zzbabVar, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzc(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String string = zzeVar.zzb().toString();
        String str = this.zzb.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb2.append("Failed to load app open ad with error parcel: ");
        sb2.append(string);
        sb2.append(" for ad unit: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        zzfke zzfkeVar = this.zzc;
        Objects.requireNonNull(zzfkeVar);
        zzfkeVar.zzv(zzeVar);
    }
}
