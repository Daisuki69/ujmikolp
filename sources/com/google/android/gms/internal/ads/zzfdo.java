package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfdo implements zzgoq {
    final /* synthetic */ zzfdp zza;
    final /* synthetic */ int zzb;

    public zzfdo(zzfdp zzfdpVar, int i) {
        this.zzb = i;
        Objects.requireNonNull(zzfdpVar);
        this.zza = zzfdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
