package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzglc extends zzglb {
    final /* synthetic */ zzgld zza;

    public zzglc(zzgld zzgldVar, int i) {
        Objects.requireNonNull(zzgldVar);
        this.zza = zzgldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzglb
    public final zzgkk zza() {
        return new zzglf(this.zza.zza(), new zzgla(2));
    }
}
