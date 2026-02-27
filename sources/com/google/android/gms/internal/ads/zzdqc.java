package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdqc {
    private final zzfdy zza;
    private final zzdpz zzb;

    public zzdqc(zzfdy zzfdyVar, zzdpz zzdpzVar) {
        this.zza = zzfdyVar;
        this.zzb = zzdpzVar;
    }

    public final zzfea zza(String str, JSONObject jSONObject) throws zzfdj {
        zzbpa zzbpaVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbpaVarZzb = new zzbpy(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbpaVarZzb = new zzbpy(new zzbrp());
            } else {
                zzbox zzboxVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbpaVarZzb = zzboxVarZzd.zzc(string) ? zzboxVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzboxVarZzd.zzd(string) ? zzboxVarZzd.zzb(string) : zzboxVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e);
                        zzbpaVarZzb = zzboxVarZzd.zzb(str);
                    }
                } else {
                    zzbpaVarZzb = zzboxVarZzd.zzb(str);
                }
            }
            zzfea zzfeaVar = new zzfea(zzbpaVarZzb);
            this.zzb.zza(str, zzfeaVar);
            return zzfeaVar;
        } catch (Throwable th2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkf)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfdj(th2);
        }
    }

    public final zzbqw zzb(String str) throws RemoteException {
        zzbqw zzbqwVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbqwVarZze);
        return zzbqwVarZze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    @VisibleForTesting
    public final zzbox zzd() throws RemoteException {
        zzbox zzboxVarZzd = this.zza.zzd();
        if (zzboxVarZzd != null) {
            return zzboxVarZzd;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
