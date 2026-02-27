package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzuj extends zzbe {
    private final zzaj zzb;

    public zzuj(zzaj zzajVar) {
        this.zzb = zzajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        zzbdVar.zza(zzbd.zza, this.zzb, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, false, true, null, 0L, androidx.media3.common.C.TIME_UNSET, 0, 0, 0L);
        zzbdVar.zzk = true;
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z4) {
        zzbcVar.zza(z4 ? 0 : null, z4 ? zzui.zzc : null, 0, androidx.media3.common.C.TIME_UNSET, 0L, zzb.zza, true);
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        return obj == zzui.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i) {
        return zzui.zzc;
    }
}
