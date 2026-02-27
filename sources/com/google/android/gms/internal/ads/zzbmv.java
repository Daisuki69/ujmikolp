package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmv implements zzbjl {
    final /* synthetic */ zzbmk zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzbv zzb;
    final /* synthetic */ zzbnp zzc;

    public zzbmv(zzbnp zzbnpVar, zzauu zzauuVar, zzbmk zzbmkVar, com.google.android.gms.ads.internal.util.zzbv zzbvVar) {
        this.zza = zzbmkVar;
        this.zzb = zzbvVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzc = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbnp zzbnpVar = this.zzc;
        synchronized (zzbnpVar.zzf()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
                com.google.android.gms.ads.internal.util.client.zzo.zzh("JS Engine is requesting an update");
                if (zzbnpVar.zzj() == 0) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Starting reload.");
                    zzbnpVar.zzk(2);
                    zzbnpVar.zza(null);
                }
                this.zza.zzn("/requestReload", (zzbjl) this.zzb.zza());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
