package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzgdz implements zzgoq {
    final /* synthetic */ zzgdy zza;

    public zzgdz(zzgea zzgeaVar, zzgdy zzgdyVar) {
        this.zza = zzgdyVar;
        Objects.requireNonNull(zzgeaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th2) {
        zzgdy zzgdyVar = this.zza;
        zzgdyVar.zzb(th2);
        zzgdyVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
