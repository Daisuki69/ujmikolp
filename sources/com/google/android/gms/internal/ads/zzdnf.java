package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzdnf implements zzbfj {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdng zzb;

    public zzdnf(zzdng zzdngVar, String str) {
        Objects.requireNonNull(zzdngVar);
        this.zzb = zzdngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zza() {
        zzdng zzdngVar = this.zzb;
        if (zzdngVar.zzc() != null) {
            zzdngVar.zzc().zza(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfj
    public final JSONObject zzd() {
        return null;
    }
}
