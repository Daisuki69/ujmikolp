package com.google.android.gms.internal.ads;

import androidx.constraintlayout.motion.widget.Key;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzbsb {
    private final zzcek zza;
    private final String zzb;

    public zzbsb(zzcek zzcekVar, String str) {
        this.zza = zzcekVar;
        this.zzb = str;
    }

    public final void zzg(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.zzb);
            zzcek zzcekVar = this.zza;
            if (zzcekVar != null) {
                zzcekVar.zzd("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzi(int i, int i4, int i6, int i10) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i).put("y", i4).put("width", i6).put("height", i10));
        } catch (JSONException e) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzj(int i, int i4, int i6, int i10) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i4).put("width", i6).put("height", i10));
        } catch (JSONException e) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching state change.", e);
        }
    }

    public final void zzl(int i, int i4, int i6, int i10, float f, int i11) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i4).put("maxSizeWidth", i6).put("maxSizeHeight", i10).put("density", f).put(Key.ROTATION, i11));
        } catch (JSONException e) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining screen information.", e);
        }
    }
}
