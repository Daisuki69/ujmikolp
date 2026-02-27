package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
final class zzbmx implements Runnable {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ zzbmk zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbnp zze;

    public zzbmx(zzbnp zzbnpVar, zzbno zzbnoVar, zzbmk zzbmkVar, ArrayList arrayList, long j) {
        this.zza = zzbnoVar;
        this.zzb = zzbmkVar;
        this.zzc = arrayList;
        this.zzd = j;
        Objects.requireNonNull(zzbnpVar);
        this.zze = zzbnpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbnp zzbnpVar = this.zze;
        synchronized (zzbnpVar.zzf()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbno zzbnoVar = this.zza;
                if (zzbnoVar.zzi() != -1 && zzbnoVar.zzi() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzij)).booleanValue()) {
                        zzbnoVar.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzbnoVar.zzg();
                    }
                    zzgpd zzgpdVar = zzbzh.zzf;
                    final zzbmk zzbmkVar = this.zzb;
                    Objects.requireNonNull(zzbmkVar);
                    zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbmkVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzd));
                    int iZzi = zzbnoVar.zzi();
                    int iZzj = zzbnpVar.zzj();
                    ArrayList arrayList = this.zzc;
                    if (arrayList.isEmpty()) {
                        string = ". Still waiting for the engine to be loaded";
                    } else {
                        String strValueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 88);
                        sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb2.append(strValueOf2);
                        string = sb2.toString();
                    }
                    long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd;
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(iZzi).length() + 36 + String.valueOf(iZzj).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                    sb3.append("Could not finish the full JS engine loading in ");
                    sb3.append(strValueOf);
                    sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb3.append(iZzi);
                    sb3.append(". Update status(fullLoadTimeout) is ");
                    sb3.append(iZzj);
                    sb3.append(string);
                    sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb3.append(jCurrentTimeMillis);
                    sb3.append(" ms at timeout. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
