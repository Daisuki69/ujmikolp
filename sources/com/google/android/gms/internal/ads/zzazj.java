package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazj {
    private final float zza;
    private final float zzb;
    private final float zzc;
    private final float zzd;
    private final int zze;

    @VisibleForTesting
    public zzazj(float f, float f3, float f7, float f10, int i) {
        this.zza = f;
        this.zzb = f3;
        this.zzc = f + f7;
        this.zzd = f3 + f10;
        this.zze = i;
    }

    public final float zza() {
        return this.zza;
    }

    public final float zzb() {
        return this.zzb;
    }

    public final float zzc() {
        return this.zzc;
    }

    public final float zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zze;
    }
}
