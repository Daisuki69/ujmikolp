package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnp {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private final zzfie zze;
    private final com.google.android.gms.ads.internal.util.zzbc zzf;
    private final com.google.android.gms.ads.internal.util.zzbc zzg;

    @Nullable
    private zzbno zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbnp(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, @Nullable zzfie zzfieVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfieVar;
        this.zzf = zzbcVar;
        this.zzg = zzbcVar2;
    }

    public final zzbno zza(@Nullable zzauu zzauuVar) {
        zzfhr zzfhrVarA = s.a(this.zzb, 6);
        zzfhrVarA.zza();
        final zzbno zzbnoVar = new zzbno(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzauu zzauuVar2 = null;
        zzbzh.zzf.execute(new Runnable(zzauuVar2, zzbnoVar) { // from class: com.google.android.gms.internal.ads.zzbnf
            private final /* synthetic */ zzbno zzb;

            {
                this.zzb = zzbnoVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbnoVar.zze(new zzbmy(this, zzbnoVar, zzfhrVarA), new zzbmz(this, zzbnoVar, zzfhrVarA));
        return zzbnoVar;
    }

    public final zzbnj zzb(@Nullable zzauu zzauuVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                        zzbno zzbnoVar = this.zzh;
                        if (zzbnoVar != null && this.zzi == 0) {
                            zzbnoVar.zze(new zzbzq() { // from class: com.google.android.gms.internal.ads.zzbnb
                                @Override // com.google.android.gms.internal.ads.zzbzq
                                public final /* synthetic */ void zza(Object obj2) {
                                    this.zza.zzd((zzbmk) obj2);
                                }
                            }, zzbnc.zza);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbno zzbnoVar2 = this.zzh;
        if (zzbnoVar2 != null && zzbnoVar2.zzi() != -1) {
            int i = this.zzi;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final /* synthetic */ void zzc(zzauu zzauuVar, final zzbno zzbnoVar) {
        final long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            final zzbms zzbmsVar = new zzbms(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmsVar.zzi(new zzbmj() { // from class: com.google.android.gms.internal.ads.zzbnd
                @Override // com.google.android.gms.internal.ads.zzbmj
                public final /* synthetic */ void zza() {
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    final long j = jCurrentTimeMillis;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(jCurrentTimeMillis2 - j));
                    String strValueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 52);
                    sb2.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb2.append(strValueOf);
                    sb2.append(" ms.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                    zzfro zzfroVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    final zzbnp zzbnpVar = this.zza;
                    final zzbno zzbnoVar2 = zzbnoVar;
                    final zzbmk zzbmkVar = zzbmsVar;
                    zzfroVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbne
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbnpVar.zze(zzbnoVar2, zzbmkVar, arrayList2, j);
                        }
                    }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzc)).intValue());
                }
            });
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmsVar.zzm("/jsLoaded", new zzbmu(this, jCurrentTimeMillis, zzbnoVar, zzbmsVar));
            com.google.android.gms.ads.internal.util.zzbv zzbvVar = new com.google.android.gms.ads.internal.util.zzbv();
            zzbmv zzbmvVar = new zzbmv(this, null, zzbmsVar, zzbvVar);
            zzbvVar.zzb(zzbmvVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmsVar.zzm("/requestReload", zzbmvVar);
            String str = this.zzc;
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmsVar.zzf(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmsVar.zzh(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmsVar.zzg(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbmx(this, zzbnoVar, zzbmsVar, arrayList, jCurrentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzd)).intValue());
        } catch (Throwable th2) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating webview.", th2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzij)).booleanValue()) {
                zzbnoVar.zzh(th2, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzil)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnoVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnoVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zzd(zzbmk zzbmkVar) {
        if (zzbmkVar.zzk()) {
            this.zzi = 1;
        }
    }

    public final /* synthetic */ void zze(zzbno zzbnoVar, final zzbmk zzbmkVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbnoVar.zzi() != -1 && zzbnoVar.zzi() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzij)).booleanValue()) {
                        zzbnoVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbnoVar.zzg();
                    }
                    zzgpd zzgpdVar = zzbzh.zzf;
                    Objects.requireNonNull(zzbmkVar);
                    zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbna
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbmkVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzc));
                    int iZzi = zzbnoVar.zzi();
                    int i = this.zzi;
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 94 + String.valueOf(iZzi).length() + 39 + String.valueOf(i).length() + 57 + strValueOf2.length() + 42 + String.valueOf(jCurrentTimeMillis).length() + 15);
                    sb2.append("Could not receive /jsLoaded in ");
                    sb2.append(strValueOf);
                    sb2.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                    sb2.append(iZzi);
                    sb2.append(". Update status(onEngLoadedTimeout) is ");
                    sb2.append(i);
                    sb2.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                    sb2.append(strValueOf2);
                    sb2.append(" ms. Total latency(onEngLoadedTimeout) is ");
                    sb2.append(jCurrentTimeMillis);
                    sb2.append(" ms. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ Object zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzfie zzg() {
        return this.zze;
    }

    public final /* synthetic */ zzbno zzh() {
        return this.zzh;
    }

    public final /* synthetic */ void zzi(zzbno zzbnoVar) {
        this.zzh = zzbnoVar;
    }

    public final /* synthetic */ int zzj() {
        return this.zzi;
    }

    public final /* synthetic */ void zzk(int i) {
        this.zzi = i;
    }
}
