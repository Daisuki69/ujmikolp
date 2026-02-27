package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzefk implements zzdgp {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzfcj zzb;
    final /* synthetic */ zzefm zzc;

    public zzefk(zzefm zzefmVar, zzbzm zzbzmVar, zzfcj zzfcjVar) {
        this.zza = zzbzmVar;
        this.zzb = zzfcjVar;
        Objects.requireNonNull(zzefmVar);
        this.zzc = zzefmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z4, Context context, @Nullable zzcwf zzcwfVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    @Nullable
    public final zzfcj zzb() {
        return this.zzb;
    }
}
