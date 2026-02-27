package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbwv implements zzgoq {
    final /* synthetic */ S1.y zza;

    public zzbwv(zzbxa zzbxaVar, S1.y yVar) {
        this.zza = yVar;
        Objects.requireNonNull(zzbxaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        zzbxa.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbxa.zzc.remove(this.zza);
    }
}
