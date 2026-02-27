package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzbon implements zzbkb {
    private final zzbzm zza;

    public zzbon(zzbop zzbopVar, zzbzm zzbzmVar) {
        Objects.requireNonNull(zzbopVar);
        this.zza = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zzb(@Nullable String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbns());
            } else {
                this.zza.zzd(new zzbns(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
