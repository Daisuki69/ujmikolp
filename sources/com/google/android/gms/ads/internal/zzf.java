package com.google.android.gms.ads.internal;

import S1.y;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnx;
import com.google.android.gms.internal.ads.zzboa;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzgob;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzgpd;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static final /* synthetic */ y zzd(Long l6, zzdsm zzdsmVar, zzfhr zzfhrVar, zzfie zzfieVar, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l6 != null) {
                zzf(zzdsmVar, "cld_s", zzt.zzk().elapsedRealtime() - l6.longValue());
            }
        }
        String strOptString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(strOptString)) {
            zzfhrVar.zzk(strOptString);
        }
        zzfhrVar.zzd(zOptBoolean);
        zzfieVar.zzb(zzfhrVar.zzm());
        return zzgot.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdsm zzdsmVar, String str, long j) {
        if (zzdsmVar != null) {
            if (((Boolean) zzbd.zzc().zzd(zzbci.zznw)).booleanValue()) {
                zzdsl zzdslVarZza = zzdsmVar.zza();
                zzdslVarZza.zzc("action", "lat_init");
                zzdslVarZza.zzc(str, Long.toString(j));
                zzdslVarZza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable Runnable runnable, zzfie zzfieVar, @Nullable zzdsm zzdsmVar, @Nullable Long l6, boolean z4) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzfieVar, zzdsmVar, l6, z4);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzbyq zzbyqVar, zzfie zzfieVar, boolean z4) {
        zzc(context, versionInfoParcel, false, zzbyqVar, zzbyqVar != null ? zzbyqVar.zze() : null, str, null, zzfieVar, null, null, z4);
    }

    @VisibleForTesting
    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z4, @Nullable zzbyq zzbyqVar, String str, @Nullable String str2, @Nullable Runnable runnable, final zzfie zzfieVar, @Nullable final zzdsm zzdsmVar, @Nullable final Long l6, boolean z5) {
        zzfhr zzfhrVar;
        Exception exc;
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzbyqVar != null && !TextUtils.isEmpty(zzbyqVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzbyqVar.zzb() <= ((Long) zzbd.zzc().zzd(zzbci.zzeE)).longValue() && zzbyqVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfhr zzfhrVarA = s.a(context, 4);
        zzfhrVarA.zza();
        zzbod zzbodVarZzb = zzt.zzr().zzb(this.zza, versionInfoParcel, zzfieVar);
        zzbnx zzbnxVar = zzboa.zza;
        zzbnt zzbntVarZza = zzbodVarZzb.zza("google.afma.config.fetchAppSettings", zzbnxVar, zzbnxVar);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z4);
                jSONObject.put("pn", context.getPackageName());
                zzbbz zzbbzVar = zzbci.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbd.zzb().zze()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                if (((Boolean) zzbd.zzc().zzd(zzbci.zzko)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z5);
                }
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                y yVarZzb = zzbntVarZza.zzb(jSONObject);
                try {
                    zzgob zzgobVar = new zzgob(this) { // from class: com.google.android.gms.ads.internal.zzd
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ y zza(Object obj) {
                            return zzf.zzd(l6, zzdsmVar, zzfhrVarA, zzfieVar, (JSONObject) obj);
                        }
                    };
                    zzfhrVar = zzfhrVarA;
                    try {
                        zzgpd zzgpdVar = zzbzh.zzg;
                        y yVarZzj = zzgot.zzj(yVarZzb, zzgobVar, zzgpdVar);
                        if (runnable != null) {
                            yVarZzb.addListener(runnable, zzgpdVar);
                        }
                        if (l6 != null) {
                            yVarZzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzf.zzf(zzdsmVar, "cld_r", zzt.zzk().elapsedRealtime() - l6.longValue());
                                }
                            }, zzgpdVar);
                        }
                        if (((Boolean) zzbd.zzc().zzd(zzbci.zzik)).booleanValue()) {
                            zzbzk.zzb(yVarZzj, "ConfigLoader.maybeFetchNewAppSettings");
                        } else {
                            zzbzk.zza(yVarZzj, "ConfigLoader.maybeFetchNewAppSettings");
                        }
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                        zzfhrVar.zzj(exc);
                        zzfhrVar.zzd(false);
                        zzfieVar.zzb(zzfhrVar.zzm());
                    }
                } catch (Exception e7) {
                    e = e7;
                    zzfhrVar = zzfhrVarA;
                }
            } catch (Exception e10) {
                exc = e10;
                zzfhrVar = zzfhrVarA;
                int i102 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                zzfhrVar.zzj(exc);
                zzfhrVar.zzd(false);
                zzfieVar.zzb(zzfhrVar.zzm());
            }
        } catch (Exception e11) {
            e = e11;
            zzfhrVar = zzfhrVarA;
        }
    }
}
