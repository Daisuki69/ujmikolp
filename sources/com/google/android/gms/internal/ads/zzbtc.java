package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbtc {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbtc(boolean z4, String str, boolean z5) {
        this.zza = z4;
        this.zzb = str;
        this.zzc = z5;
    }

    @Nullable
    public static zzbtc zza(JSONObject jSONObject) {
        return new zzbtc(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
