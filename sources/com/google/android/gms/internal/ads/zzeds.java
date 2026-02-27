package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeds {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfcj zzc;

    @Nullable
    private final zzcek zzd;
    private final zzdsm zze;

    @Nullable
    private zzflv zzf;

    public zzeds(Context context, VersionInfoParcel versionInfoParcel, zzfcj zzfcjVar, @Nullable zzcek zzcekVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfcjVar;
        this.zzd = zzcekVar;
        this.zze = zzdsmVar;
    }

    public final synchronized boolean zza(boolean z4) {
        zzcek zzcekVar;
        zzfcj zzfcjVar = this.zzc;
        if (zzfcjVar.zzT) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfM)).booleanValue() && (zzcekVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzt.zzu().zza(this.zza)) {
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfcjVar.zzV.zzb()) {
                        zzflv zzflvVarZzi = com.google.android.gms.ads.internal.zzt.zzu().zzi(this.zzb, zzcekVar.zzD(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfN)).booleanValue()) {
                            zzdsm zzdsmVar = this.zze;
                            String str = zzflvVarZzi != null ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0";
                            zzdsl zzdslVarZza = zzdsmVar.zza();
                            zzdslVarZza.zzc("omid_js_session_success", str);
                            zzdslVarZza.zzd();
                        }
                        if (zzflvVarZzi == null) {
                            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to create javascript session service.");
                            return false;
                        }
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Created omid javascript session service.");
                        this.zzf = zzflvVarZzi;
                        zzcekVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean zzb() {
        return this.zzf != null;
    }

    public final synchronized void zzc() {
        zzcek zzcekVar;
        try {
            zzflv zzflvVar = this.zzf;
            if (zzflvVar == null || (zzcekVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzcekVar.zzF().iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.zzt.zzu().zzk(zzflvVar, (View) it.next());
            }
            zzcekVar.zze("onSdkLoaded", zzgkc.zza());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzd() {
        zzcek zzcekVar;
        if (this.zzf == null || (zzcekVar = this.zzd) == null) {
            return;
        }
        zzcekVar.zze("onSdkImpression", zzgkc.zza());
    }

    public final synchronized void zze(zzflu zzfluVar) {
        zzcek zzcekVar;
        zzflv zzflvVar = this.zzf;
        if (zzflvVar == null || (zzcekVar = this.zzd) == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzj(zzflvVar, zzfluVar);
        this.zzf = null;
        zzcekVar.zzal(null);
    }

    public final synchronized void zzf(View view) {
        zzflv zzflvVar = this.zzf;
        if (zzflvVar != null) {
            com.google.android.gms.ads.internal.zzt.zzu().zzk(zzflvVar, view);
        }
    }
}
