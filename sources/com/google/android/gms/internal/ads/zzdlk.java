package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzdlk implements zzgoq {
    final /* synthetic */ zzdru zza;
    final /* synthetic */ zzdln zzb;

    public zzdlk(zzdln zzdlnVar, zzdru zzdruVar) {
        this.zza = zzdruVar;
        Objects.requireNonNull(zzdlnVar);
        this.zzb = zzdlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        androidx.media3.datasource.cache.c.v(this.zzb.zzd().zze(), this.zza.zza());
    }
}
