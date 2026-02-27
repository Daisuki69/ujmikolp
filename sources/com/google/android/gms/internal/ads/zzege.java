package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzege implements zzeeb {
    private final zzdqc zza;

    public zzege(zzdqc zzdqcVar) {
        this.zza = zzdqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeeb
    @Nullable
    public final zzeec zza(String str, JSONObject jSONObject) throws zzfdj {
        return new zzeec(this.zza.zza(str, jSONObject), new zzefo(), str);
    }
}
