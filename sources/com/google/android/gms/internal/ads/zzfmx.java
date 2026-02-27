package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzfmx {
    private final String zza;
    private zzfnz zzb;
    private long zzc;
    private int zzd;

    public zzfmx(String str) {
        zzp();
        this.zza = str;
        this.zzb = new zzfnz(null);
    }

    public void zza() {
    }

    public void zzb() {
        this.zzb.clear();
    }

    public final void zzc(WebView webView) {
        this.zzb = new zzfnz(webView);
    }

    public final WebView zzd() {
        return (WebView) this.zzb.get();
    }

    public final boolean zze() {
        return this.zzb.get() != null;
    }

    public final void zzf(boolean z4) {
        if (zze()) {
            zzfmo.zza().zzf(zzd(), this.zza, true != z4 ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzg(boolean z4) {
        if (zze()) {
            zzfmo.zza().zzg(zzd(), this.zza, true != z4 ? "unlocked" : "locked");
        }
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzfmo.zza().zze(zzd(), this.zza, str);
        }
    }

    public final void zzi(String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfmo.zza().zze(zzd(), this.zza, str);
    }

    public final void zzj(zzflk zzflkVar) {
        zzfmo.zza().zzb(zzd(), this.zza, zzflkVar.zzb());
    }

    public void zzk(zzfln zzflnVar, zzfll zzfllVar) {
        zzl(zzflnVar, zzfllVar, null);
    }

    public final void zzl(zzfln zzflnVar, zzfll zzfllVar, JSONObject jSONObject) {
        String strZzh = zzflnVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfnd.zzc(jSONObject2, "environment", "app");
        zzfnd.zzc(jSONObject2, "adSessionType", zzfllVar.zzi());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfnd.zzc(jSONObject3, "deviceType", We.s.q(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, "; ", str2));
        zzfnd.zzc(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfnd.zzc(jSONObject3, "os", EventMetricsAggregator.OS_NAME);
        zzfnd.zzc(jSONObject2, "deviceInfo", jSONObject3);
        zzfnd.zzc(jSONObject2, "deviceCategory", zzfnc.zzb().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfnd.zzc(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfnd.zzc(jSONObject4, "partnerName", zzfllVar.zzc().zzb());
        zzfnd.zzc(jSONObject4, "partnerVersion", zzfllVar.zzc().zzc());
        zzfnd.zzc(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfnd.zzc(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfnd.zzc(jSONObject5, "appId", zzfmm.zza().zzb().getApplicationContext().getPackageName());
        zzfnd.zzc(jSONObject2, "app", jSONObject5);
        if (zzfllVar.zzg() != null) {
            zzfnd.zzc(jSONObject2, "contentUrl", zzfllVar.zzg());
        }
        if (zzfllVar.zzh() != null) {
            zzfnd.zzc(jSONObject2, "customReferenceData", zzfllVar.zzh());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfllVar.zzd().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfmo.zza().zzc(zzd(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzm() {
        zzfmo.zza().zzd(zzd(), this.zza);
    }

    public final void zzn(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfnd.zzc(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfmo.zza().zzi(zzd(), jSONObject);
    }

    public final void zzo(float f) {
        zzfmo.zza().zzh(zzd(), this.zza, f);
    }

    public final void zzp() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }
}
