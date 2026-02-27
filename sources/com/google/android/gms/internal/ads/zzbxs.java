package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbxs {

    @GuardedBy("ScionComponent.class")
    @VisibleForTesting
    static zzbxs zzi;

    public static synchronized zzbxs zzb(Context context) {
        try {
            zzbxs zzbxsVar = zzi;
            if (zzbxsVar != null) {
                return zzbxsVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbci.zza(applicationContext);
            com.google.android.gms.ads.internal.util.zzg zzgVarZzo = com.google.android.gms.ads.internal.zzt.zzh().zzo();
            zzgVarZzo.zza(applicationContext);
            zzbxm zzbxmVar = new zzbxm(null);
            zzbxmVar.zza(applicationContext);
            zzbxmVar.zzb(com.google.android.gms.ads.internal.zzt.zzk());
            zzbxmVar.zzc(zzgVarZzo);
            zzbxmVar.zzd(com.google.android.gms.ads.internal.zzt.zzD());
            zzbxs zzbxsVarZze = zzbxmVar.zze();
            zzi = zzbxsVarZze;
            ((zzbxg) ((zzbxn) zzbxsVarZze).zzc.zzb()).zza();
            final zzbxx zzbxxVar = (zzbxx) ((zzbxn) zzi).zzh.zzb();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaK)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                final Map mapZzz = com.google.android.gms.ads.internal.util.zzs.zzz((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaL));
                Iterator it = mapZzz.keySet().iterator();
                while (it.hasNext()) {
                    zzbxxVar.zzb((String) it.next());
                }
                zzbxxVar.zza(new zzbxv() { // from class: com.google.android.gms.internal.ads.zzbxw
                    @Override // com.google.android.gms.internal.ads.zzbxv
                    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                        zzbxxVar.zzc(mapZzz, sharedPreferences, str, str2);
                    }
                });
            }
            return zzi;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract zzbxk zza();
}
