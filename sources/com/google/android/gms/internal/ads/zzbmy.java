package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmy implements zzbzq {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzbnp zzc;

    public zzbmy(zzbnp zzbnpVar, zzbno zzbnoVar, zzfhr zzfhrVar) {
        this.zza = zzbnoVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzc = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbnp zzbnpVar = this.zzc;
        synchronized (zzbnpVar.zzf()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock acquired");
                zzbnpVar.zzk(0);
                if (zzbnpVar.zzh() != null && this.zza != zzbnpVar.zzh()) {
                    com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                    zzbnpVar.zzh().zzc();
                }
                zzbnpVar.zzi(this.zza);
                if (((Boolean) zzbeb.zzd.zze()).booleanValue() && zzbnpVar.zzg() != null) {
                    zzfie zzfieVarZzg = zzbnpVar.zzg();
                    zzfhr zzfhrVar = this.zzb;
                    zzfhrVar.zzd(true);
                    zzfieVarZzg.zzb(zzfhrVar.zzm());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (success): Lock released");
    }
}
