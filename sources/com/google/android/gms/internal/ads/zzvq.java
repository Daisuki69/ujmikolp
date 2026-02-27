package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzvq implements zzwf {
    final /* synthetic */ zzvt zza;
    private final int zzb;

    public zzvq(zzvt zzvtVar, int i) {
        Objects.requireNonNull(zzvtVar);
        this.zza = zzvtVar;
        this.zzb = i;
    }

    public final /* synthetic */ int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final boolean zzb() {
        return this.zza.zzp(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzc() throws IOException {
        this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zzd(zzkh zzkhVar, zzhg zzhgVar, int i) {
        return this.zza.zzs(this.zzb, zzkhVar, zzhgVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final int zze(long j) {
        return this.zza.zzt(this.zzb, j);
    }
}
