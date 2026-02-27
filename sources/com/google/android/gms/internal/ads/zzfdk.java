package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfdk implements zzgoq {
    final /* synthetic */ zzcek zza;
    final /* synthetic */ zzcmi zzb;
    final /* synthetic */ zzfjv zzc;
    final /* synthetic */ zzecn zzd;

    public zzfdk(zzcek zzcekVar, zzcmi zzcmiVar, zzfjv zzfjvVar, zzecn zzecnVar) {
        this.zza = zzcekVar;
        this.zzb = zzcmiVar;
        this.zzc = zzfjvVar;
        this.zzd = zzecnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcmi zzcmiVar;
        String str = (String) obj;
        zzcek zzcekVar = this.zza;
        zzfcj zzfcjVarZzC = zzcekVar.zzC();
        if (zzfcjVarZzC != null && !zzfcjVarZzC.zzai) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar = zzfcjVarZzC.zzax;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkQ)).booleanValue() && (zzcmiVar = this.zzb) != null && zzcmi.zzc(str)) {
                zzcmiVar.zza(str, this.zzc, com.google.android.gms.ads.internal.client.zzbb.zze(), zzvVar);
                return;
            } else {
                this.zzc.zzb(str, zzvVar, null, null);
                return;
            }
        }
        zzfcm zzfcmVarZzaC = zzcekVar.zzaC();
        if (zzfcmVarZzaC == null) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        boolean zZzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(zzcekVar.getContext());
        boolean z4 = false;
        boolean z5 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgH)).booleanValue() && zzfcjVarZzC != null && zzfcjVarZzC.zzS;
        if (zzfcjVarZzC != null && zzfcjVarZzC.zzad != null) {
            z4 = true;
        }
        this.zzd.zze(new zzecp(jCurrentTimeMillis, zzfcmVarZzaC.zzb, str, (zZzs || z5 || z4) ? 2 : 1));
    }
}
