package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfmb implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfmc zzb;

    public zzfmb(zzfmc zzfmcVar, float f) {
        this.zza = f;
        Objects.requireNonNull(zzfmcVar);
        this.zzb = zzfmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
