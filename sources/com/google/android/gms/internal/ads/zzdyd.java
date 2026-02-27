package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
final class zzdyd implements zzgoq {
    final /* synthetic */ zzdyg zza;

    public zzdyd(zzdyg zzdygVar) {
        Objects.requireNonNull(zzdygVar);
        this.zza = zzdygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue()) {
            Matcher matcher = zzdyg.zzh.matcher(th2.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzdyg zzdygVar = this.zza;
                zzdygVar.zzc().zzc(Integer.parseInt(strGroup));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcu zzfcuVar = (zzfcu) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgF)).booleanValue()) {
            zzdyg zzdygVar = this.zza;
            zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
            zzdygVar.zzc().zzc(zzfcmVar.zzf);
            zzdygVar.zzc().zze(zzfcmVar.zzg);
        }
    }
}
