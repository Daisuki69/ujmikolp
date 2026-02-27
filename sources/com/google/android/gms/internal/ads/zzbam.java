package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzbam implements zzazc {
    final /* synthetic */ zzbap zza;

    public zzbam(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z4) {
        if (z4) {
            this.zza.zzf();
        } else {
            this.zza.zzg();
        }
    }
}
