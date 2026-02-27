package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzg {
    private int zza;
    private int zzb;
    private int zzc;

    @Nullable
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzg() {
        this.zza = -1;
        this.zzb = -1;
        this.zzc = -1;
        this.zze = -1;
        this.zzf = -1;
    }

    public final zzg zza(int i) {
        this.zza = i;
        return this;
    }

    public final zzg zzb(int i) {
        this.zzb = i;
        return this;
    }

    public final zzg zzc(int i) {
        this.zzc = i;
        return this;
    }

    public final zzg zzd(@Nullable byte[] bArr) {
        this.zzd = bArr;
        return this;
    }

    public final zzg zze(int i) {
        this.zze = i;
        return this;
    }

    public final zzg zzf(int i) {
        this.zzf = i;
        return this;
    }

    public final zzh zzg() {
        return new zzh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
    }

    public /* synthetic */ zzg(zzh zzhVar, byte[] bArr) {
        this.zza = zzhVar.zzb;
        this.zzb = zzhVar.zzc;
        this.zzc = zzhVar.zzd;
        this.zzd = zzhVar.zze;
        this.zze = zzhVar.zzf;
        this.zzf = zzhVar.zzg;
    }
}
