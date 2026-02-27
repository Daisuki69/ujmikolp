package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzbog implements zzbkb {
    final /* synthetic */ zzboh zza;
    private final zzbnj zzb;
    private final zzbzm zzc;

    public zzbog(zzboh zzbohVar, zzbnj zzbnjVar, zzbzm zzbzmVar) {
        Objects.requireNonNull(zzbohVar);
        this.zza = zzbohVar;
        this.zzb = zzbnjVar;
        this.zzc = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zzb(@Nullable String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbns());
            } else {
                this.zzc.zzd(new zzbns(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            this.zzb.zza();
            throw th2;
        }
        this.zzb.zza();
    }
}
