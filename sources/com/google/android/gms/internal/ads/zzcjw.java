package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcjw extends com.google.android.gms.ads.internal.client.zzda {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdqc zzc;
    private final zzeeb zzd;
    private final zzekd zze;
    private final zzdux zzf;
    private final zzbxr zzg;
    private final zzdqh zzh;
    private final zzdvs zzi;
    private final zzbfc zzj;
    private final zzfie zzk;
    private final zzfdy zzl;
    private final zzctd zzm;
    private final zzdsm zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime());

    @VisibleForTesting
    public zzcjw(Context context, VersionInfoParcel versionInfoParcel, zzdqc zzdqcVar, zzeeb zzeebVar, zzekd zzekdVar, zzdux zzduxVar, zzbxr zzbxrVar, zzdqh zzdqhVar, zzdvs zzdvsVar, zzbfc zzbfcVar, zzfie zzfieVar, zzfdy zzfdyVar, zzctd zzctdVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdqcVar;
        this.zzd = zzeebVar;
        this.zze = zzekdVar;
        this.zzf = zzduxVar;
        this.zzg = zzbxrVar;
        this.zzh = zzdqhVar;
        this.zzi = zzdvsVar;
        this.zzj = zzbfcVar;
        this.zzk = zzfieVar;
        this.zzl = zzfdyVar;
        this.zzm = zzctdVar;
        this.zzn = zzdsmVar;
    }

    @VisibleForTesting
    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzJ()) {
            String strZzL = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzL();
            if (com.google.android.gms.ads.internal.zzt.zzo().zze(this.zza, strZzL, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(false);
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzM("");
        }
    }

    public final /* synthetic */ void zzc() {
        zzfeh.zza(this.zza, true);
    }

    public final /* synthetic */ void zzd() {
        com.google.android.gms.ads.internal.zzt.zzn().zza(this.zza, this.zzn);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zze() {
        if (this.zzo) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Mobile ads is initialized already.");
            return;
        }
        Context context = this.zza;
        zzbci.zza(context);
        com.google.android.gms.ads.internal.zzt.zzh().zze(context, this.zzb, this.zzn);
        this.zzm.zzc();
        com.google.android.gms.ads.internal.zzt.zzj().zza(context);
        this.zzo = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzey)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue()) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlL)).booleanValue()) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzds)).booleanValue()) {
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfd)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfe)).booleanValue()) {
                zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzd();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzf(float f) {
        com.google.android.gms.ads.internal.zzt.zzi().zza(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzg(String str) {
        Context context = this.zza;
        zzbci.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzew)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzl().zza(context, this.zzb, str, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized void zzh(boolean z4) {
        com.google.android.gms.ads.internal.zzt.zzi().zzc(z4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Context is null. Failed to open debug menu.");
        } else {
            com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
            zzatVar.zzc(str);
            zzatVar.zzd(this.zzb.afmaVersion);
            zzatVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(@Nullable String str, IObjectWrapper iObjectWrapper) {
        String strZzt;
        Runnable runnable;
        Context context = this.zza;
        zzbci.zza(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeD)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                strZzt = com.google.android.gms.ads.internal.util.zzs.zzt(context);
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "NonagonMobileAdsSettingManager_AppId");
                strZzt = "";
            }
        } else {
            strZzt = "";
        }
        boolean z4 = true;
        String str2 = true == TextUtils.isEmpty(strZzt) ? str : strZzt;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzew)).booleanValue();
        zzbbz zzbbzVar = zzbci.zzbf;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgpd zzgpdVar = zzbzh.zzf;
                    final zzcjw zzcjwVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcjwVar.zzx(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z4 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z4) {
            com.google.android.gms.ads.internal.zzt.zzl().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp, this.zzi.zzs());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized float zzk() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final synchronized boolean zzl() {
        return com.google.android.gms.ads.internal.zzt.zzi().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) {
        this.zze.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbox zzboxVar) throws RemoteException {
        this.zzl.zzc(zzboxVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzblr zzblrVar) throws RemoteException {
        this.zzf.zzb(zzblrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() throws RemoteException {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(com.google.android.gms.ads.internal.client.zzfv zzfvVar) throws RemoteException {
        this.zzg.zzb(this.zza, zzfvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        this.zzi.zzo(zzdnVar, zzdvr.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z4) throws RemoteException {
        Context context;
        try {
            context = this.zza;
            zzftj.zza(context).zzb(z4);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
        if (z4) {
            return;
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                return;
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e7) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e7, "clearStorageOnGpidPubDisable_scar");
            return;
        }
        throw new RemoteException(e.getMessage());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkj)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzt(str);
        }
    }

    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbtx());
    }

    public final /* synthetic */ void zzx(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZzf = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzf();
        if (mapZzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not initialize rewarded ads.", th2);
                return;
            }
        }
        if (this.zzc.zzc()) {
            HashMap map = new HashMap();
            Iterator it = mapZzf.values().iterator();
            while (it.hasNext()) {
                for (zzboq zzboqVar : ((zzbor) it.next()).zza) {
                    String str = zzboqVar.zzb;
                    for (String str2 : zzboqVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzeec zzeecVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzeecVarZza != null) {
                        zzfea zzfeaVar = (zzfea) zzeecVarZza.zzb;
                        if (!zzfeaVar.zzn() && zzfeaVar.zzq()) {
                            zzfeaVar.zzr(this.zza, (zzefp) zzeecVarZza.zzc, (List) entry.getValue());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb2.append("Initialized rewarded video mediation adapter ");
                            sb2.append(str3);
                            String string = sb2.toString();
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                        }
                    }
                } catch (zzfdj e) {
                    String strQ = We.s.q(new StringBuilder(String.valueOf(str3).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(strQ, e);
                }
            }
        }
    }
}
