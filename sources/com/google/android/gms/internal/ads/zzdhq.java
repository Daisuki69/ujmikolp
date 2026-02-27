package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdhq {
    private final JSONObject zza;
    private final zzdnx zzb;

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zzc;

    @Nullable
    private final zzbxf zzd;

    public zzdhq(JSONObject jSONObject, zzdnx zzdnxVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbxf zzbxfVar) {
        this.zza = jSONObject;
        this.zzb = zzdnxVar;
        this.zzc = zzbVar;
        this.zzd = zzbxfVar;
    }

    @Nullable
    public final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    @Nullable
    public final zzbxf zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdnx zzd() {
        return this.zzb;
    }
}
