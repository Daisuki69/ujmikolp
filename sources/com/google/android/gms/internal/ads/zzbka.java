package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzbka implements zzbkb {
    final /* synthetic */ zzbzm zza;

    public zzbka(zzbkc zzbkcVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzbkcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zzb(@Nullable String str) {
        this.zza.zzd(new zzbns(str));
    }
}
