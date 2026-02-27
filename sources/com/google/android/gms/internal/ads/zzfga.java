package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfga implements zzhpx {
    public static zzfga zza() {
        return zzffz.zza;
    }

    public static zzgpd zzc() {
        zzgpd zzgpdVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgj)).booleanValue()) {
            zzgpdVar = zzbzh.zzc;
        } else {
            zzgpdVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgi)).booleanValue() ? zzbzh.zza : zzbzh.zzf;
        }
        zzhqf.zzb(zzgpdVar);
        return zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
