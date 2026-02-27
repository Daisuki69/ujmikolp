package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmz implements zzbzo {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzbnp zzc;

    public zzbmz(zzbnp zzbnpVar, zzbno zzbnoVar, zzfhr zzfhrVar) {
        this.zza = zzbnoVar;
        this.zzb = zzfhrVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzc = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzo
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbnp zzbnpVar = this.zzc;
        synchronized (zzbnpVar.zzf()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
                zzbnpVar.zzk(1);
                com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzc();
                if (((Boolean) zzbeb.zzd.zze()).booleanValue() && zzbnpVar.zzg() != null) {
                    zzfie zzfieVarZzg = zzbnpVar.zzg();
                    zzfhr zzfhrVar = this.zzb;
                    zzfhrVar.zzk("Failed loading new engine");
                    zzfhrVar.zzd(false);
                    zzfieVarZzg.zzb(zzfhrVar.zzm());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
