package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzais {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzu zzg;
    public final int zzh;

    @Nullable
    public final long[] zzi;

    @Nullable
    public final long[] zzj;
    public final int zzk;

    @Nullable
    private final zzait[] zzl;

    public zzais(int i, int i4, long j, long j6, long j7, long j9, zzu zzuVar, int i6, @Nullable zzait[] zzaitVarArr, int i10, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.zza = i;
        this.zzb = i4;
        this.zzc = j;
        this.zzd = j6;
        this.zze = j7;
        this.zzf = j9;
        this.zzg = zzuVar;
        this.zzh = i6;
        this.zzl = zzaitVarArr;
        this.zzk = i10;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    @Nullable
    public final zzait zza(int i) {
        return this.zzl[i];
    }

    public final zzais zzb(zzu zzuVar) {
        return new zzais(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzuVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}
