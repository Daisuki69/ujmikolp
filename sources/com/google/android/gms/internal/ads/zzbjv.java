package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbjv implements com.google.android.gms.ads.internal.overlay.zzz {
    final /* synthetic */ zzbjy zza;

    public zzbjv(zzbjy zzbjyVar) {
        Objects.requireNonNull(zzbjyVar);
        this.zza = zzbjyVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zza(boolean z4) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final void zzb(int i) {
        this.zza.zzg(i);
    }
}
