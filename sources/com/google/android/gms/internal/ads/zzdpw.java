package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpw {
    private final zzdsm zza;

    public zzdpw(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public final boolean zza(zzfrv zzfrvVar) {
        if (zzfrvVar.zzj()) {
            zzdsl zzdslVarZza = this.zza.zza();
            zzdslVarZza.zzc("action", "aq_ad_closed");
            zzdslVarZza.zzc("gqi", zzfrvVar.zza());
            zzdslVarZza.zzc("aq_ad_duration", String.valueOf(zzfrvVar.zzb()));
            zzdslVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzfrvVar.zzc()));
            zzdslVarZza.zzc("aq_time_away", String.valueOf(zzfrvVar.zzg()));
            return zzdslVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        }
        zzdsl zzdslVarZza2 = this.zza.zza();
        zzdslVarZza2.zzc("action", "aq_ad_kill");
        zzdslVarZza2.zzc("gqi", zzfrvVar.zza());
        zzdslVarZza2.zzc("aq_ad_duration", String.valueOf(zzfrvVar.zzb()));
        zzdslVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzfrvVar.zzc()));
        zzdslVarZza2.zzc("aq_time_away", String.valueOf(zzfrvVar.zzg()));
        zzdslVarZza2.zzc("aq_is_os_kill", String.valueOf(zzfrvVar.zze()));
        return zzdslVarZza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}
