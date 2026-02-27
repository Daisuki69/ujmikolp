package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxa implements zzbxf {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());

    @VisibleForTesting
    boolean zza;
    private final zzhmp zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxc zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxa(Context context, VersionInfoParcel versionInfoParcel, zzbxc zzbxcVar, @Nullable String str, zzbxb zzbxbVar) {
        Preconditions.checkNotNull(zzbxcVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxcVar;
        Iterator it = zzbxcVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhmp zzhmpVarZzg = zzhot.zzg();
        zzhmpVarZzg.zzn(9);
        if (str != null) {
            zzhmpVarZzg.zzb(str);
            zzhmpVarZzg.zzc(str);
        }
        zzhmq zzhmqVarZzc = zzhmr.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhmqVarZzc.zza(str2);
        }
        zzhmpVarZzg.zzd((zzhmr) zzhmqVarZzc.zzbu());
        zzhof zzhofVarZzc = zzhog.zzc();
        zzhofVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzhofVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzhofVarZzc.zzb(apkVersion);
        }
        zzhmpVarZzg.zzk((zzhog) zzhofVarZzc.zzbu());
        this.zzd = zzhmpVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final zzbxc zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final boolean zzc() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzd(View view) {
        Bitmap bitmapCreateBitmap;
        boolean zIsDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e) {
                    e = e;
                    bitmapCreateBitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                } catch (RuntimeException e7) {
                    e = e7;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the web view", e);
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e10) {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the webview", e10);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzbxe.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzg(bitmap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzhod) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzhod zzhodVarZze = zzhoe.zze();
            int iZza = zzhoc.zza(i);
            if (iZza != 0) {
                zzhodVarZze.zze(iZza);
            }
            zzhodVarZze.zza(linkedHashMap.size());
            zzhodVarZze.zzb(str);
            zzhnc zzhncVarZzc = zzhnf.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhna zzhnaVarZzc = zzhnb.zzc();
                        zzhnaVarZzc.zza(zzhhb.zzs(str2));
                        zzhnaVarZzc.zzb(zzhhb.zzs(str3));
                        zzhncVarZzc.zza((zzhnb) zzhnaVarZzc.zzbu());
                    }
                }
            }
            zzhodVarZze.zzc((zzhnf) zzhncVarZzc.zzbu());
            linkedHashMap.put(str, zzhodVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            S1.y yVarZza = zzgot.zza(Collections.EMPTY_MAP);
            zzgob zzgobVar = new zzgob() { // from class: com.google.android.gms.internal.ads.zzbww
                @Override // com.google.android.gms.internal.ads.zzgob
                public final /* synthetic */ S1.y zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzgpd zzgpdVar = zzbzh.zzg;
            S1.y yVarZzj = zzgot.zzj(yVarZza, zzgobVar, zzgpdVar);
            S1.y yVarZzi = zzgot.zzi(yVarZzj, 10L, TimeUnit.SECONDS, zzbzh.zzd);
            zzgot.zzq(yVarZzj, new zzbwv(this, yVarZzi), zzgpdVar);
            zzc.add(yVarZzi);
        }
    }

    public final /* synthetic */ void zzg(Bitmap bitmap) {
        zzhha zzhhaVarZzx = zzhhb.zzx();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzhhaVarZzx);
        synchronized (this.zzj) {
            zzhmp zzhmpVar = this.zzd;
            zzhnx zzhnxVarZzc = zzhnz.zzc();
            zzhnxVarZzc.zzb(zzhhaVarZzx.zza());
            zzhnxVarZzc.zza(MimeTypes.IMAGE_PNG);
            zzhnxVarZzc.zzc(2);
            zzhmpVar.zzj((zzhnz) zzhnxVarZzc.zzbu());
        }
    }

    public final /* synthetic */ S1.y zzh(Map map) {
        int length;
        zzhod zzhodVar;
        S1.y yVarZzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    zzhodVar = (zzhod) this.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzhodVar == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                            sb2.append("Cannot find the corresponding resource object for ");
                            sb2.append(str);
                            zzbxe.zza(sb2.toString());
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzhodVar.zzd(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e);
                }
                return zzgot.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z4 = this.zza;
        if (!(z4 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z4 || !this.zzi.zzd))) {
            return zzgot.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzhoe) ((zzhod) it.next()).zzbu());
                }
                zzhmp zzhmpVar = this.zzd;
                zzhmpVar.zzl(this.zzf);
                zzhmpVar.zzm(this.zzg);
                if (zzbxe.zzb()) {
                    String strZza = zzhmpVar.zza();
                    String strZzg = zzhmpVar.zzg();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strZza).length() + 38 + String.valueOf(strZzg).length() + 15);
                    sb3.append("Sending SB report\n  url: ");
                    sb3.append(strZza);
                    sb3.append("\n  clickUrl: ");
                    sb3.append(strZzg);
                    sb3.append("\n  resources: \n");
                    StringBuilder sb4 = new StringBuilder(sb3.toString());
                    for (zzhoe zzhoeVar : zzhmpVar.zze()) {
                        sb4.append("    [");
                        sb4.append(zzhoeVar.zzd());
                        sb4.append("] ");
                        sb4.append(zzhoeVar.zzc());
                    }
                    zzbxe.zza(sb4.toString());
                }
                S1.y yVarZzb = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhot) zzhmpVar.zzbu()).zzaN());
                if (zzbxe.zzb()) {
                    yVarZzb.addListener(zzbwy.zza, zzbzh.zza);
                }
                yVarZzk = zzgot.zzk(yVarZzb, zzbwx.zza, zzbzh.zzg);
            } finally {
            }
        }
        return yVarZzk;
    }
}
