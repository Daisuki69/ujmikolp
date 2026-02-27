package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdn {
    public static zzbjl zza(final zzecn zzecnVar, final zzfjv zzfjvVar, final zzcmi zzcmiVar, final zzddz zzddzVar) {
        return new zzbjl() { // from class: com.google.android.gms.internal.ads.zzfdm
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcek zzcekVar = (zzcek) obj;
                zzbjk.zzc(map, zzddzVar);
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzecn zzecnVar2 = zzecnVar;
                    zzfjv zzfjvVar2 = zzfjvVar;
                    zzgot.zzq(zzbjk.zza(zzcekVar, str), new zzfdk(zzcekVar, zzcmiVar, zzfjvVar2, zzecnVar2), zzbzh.zza);
                }
            }
        };
    }

    public static zzbjl zzb(final zzecn zzecnVar, final zzfjv zzfjvVar) {
        return new zzbjl() { // from class: com.google.android.gms.internal.ads.zzfdl
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzceb zzcebVar = (zzceb) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfcj zzfcjVarZzC = zzcebVar.zzC();
                if (zzfcjVarZzC != null && !zzfcjVarZzC.zzai) {
                    zzfjvVar.zzb(str, zzfcjVarZzC.zzax, null, null);
                    return;
                }
                zzfcm zzfcmVarZzaC = ((zzcfr) zzcebVar).zzaC();
                if (zzfcmVarZzaC != null) {
                    zzecnVar.zze(new zzecp(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzfcmVarZzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
