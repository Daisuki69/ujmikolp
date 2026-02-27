package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkf {
    private final long zza;
    private final long zzb;
    private long zze;
    private long zzd = 5;
    private final Random zzf = new Random();
    private long zzc = 0;

    public zzfkf(long j, double d10, long j6, double d11) {
        this.zza = j;
        this.zzb = j6;
        zza();
    }

    public final void zza() {
        this.zze = this.zza;
        this.zzc = 0L;
    }

    public final long zzb() {
        double d10 = this.zze;
        double d11 = 0.2d * d10;
        long j = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.zzf.nextDouble() * ((j - r0) + 1)));
    }

    public final void zzc() {
        double d10 = this.zze;
        this.zze = Math.min((long) (d10 + d10), this.zzb);
        this.zzc++;
    }

    public final boolean zzd() {
        return this.zzc > Math.max(this.zzd, (long) ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzF)).intValue()) && this.zze >= this.zzb;
    }

    public final synchronized void zze(int i) {
        Preconditions.checkArgument(i > 0);
        this.zzd = i;
    }
}
