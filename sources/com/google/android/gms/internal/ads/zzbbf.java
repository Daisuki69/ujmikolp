package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbbf {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbbf(InputStream inputStream, boolean z4, boolean z5, long j, boolean z8) {
        this.zza = inputStream;
        this.zzb = z4;
        this.zzc = z5;
        this.zzd = j;
        this.zze = z8;
    }

    public static zzbbf zza(InputStream inputStream, boolean z4, boolean z5, long j, boolean z8) {
        return new zzbbf(inputStream, z4, z5, j, z8);
    }

    public final InputStream zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
