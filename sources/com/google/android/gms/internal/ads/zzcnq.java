package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcnq implements zzhpx {
    private final zzhqg zza;

    private zzcnq(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzcnq zza(zzhqg zzhqgVar) {
        return new zzcnq(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcrj) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
