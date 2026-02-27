package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzdys implements zzgoq {
    final /* synthetic */ Context zza;

    public zzdys(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        if (((Boolean) zzbea.zzh.zze()).booleanValue() && (th2 instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbbt.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbea.zzj.zze()).booleanValue()) {
            zzbbt.zze(this.zza);
        }
    }
}
