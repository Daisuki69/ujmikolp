package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class zzyh implements zzyf {
    private final zzyf zza;

    public zzyh(zzyf zzyfVar) {
        this.zza = zzyfVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzyh) {
            return this.zza.equals(((zzyh) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public zzbf zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public zzu zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public zzu zzc() {
        return this.zza.zzc();
    }

    public final zzyf zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzf(int i) {
        return this.zza.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzg(int i) {
        return this.zza.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzh() {
        return this.zza.zzh();
    }
}
