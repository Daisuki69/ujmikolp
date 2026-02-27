package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuh implements zzun, zzum {
    public final zzup zza;
    private final long zzb;
    private zzur zzc;
    private zzun zzd;

    @Nullable
    private zzum zze;
    private long zzf = androidx.media3.common.C.TIME_UNSET;
    private final zzyv zzg;

    public zzuh(zzup zzupVar, zzyv zzyvVar, long j) {
        this.zza = zzupVar;
        this.zzg = zzyvVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j6 = this.zzf;
        return j6 != androidx.media3.common.C.TIME_UNSET ? j6 : j;
    }

    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j) {
        this.zze = zzumVar;
        zzun zzunVar = this.zzd;
        if (zzunVar != null) {
            zzunVar.zzb(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() throws IOException {
        zzun zzunVar = this.zzd;
        if (zzunVar != null) {
            zzunVar.zzc();
            return;
        }
        zzur zzurVar = this.zzc;
        if (zzurVar != null) {
            zzurVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j) {
        long j6 = this.zzf;
        long j7 = (j6 == androidx.media3.common.C.TIME_UNSET || j != this.zzb) ? j : j6;
        this.zzf = androidx.media3.common.C.TIME_UNSET;
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zze(zzyfVarArr, zArr, zzwfVarArr, zArr2, j7);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j, boolean z4) {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        zzunVar.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        zzunVar.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j) {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j, zzlt zzltVar) {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzk(j, zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        zzun zzunVar = this.zzd;
        String str = zzeo.zza;
        return zzunVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        zzun zzunVar = this.zzd;
        return zzunVar != null && zzunVar.zzm(zzklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        zzun zzunVar = this.zzd;
        return zzunVar != null && zzunVar.zzn();
    }

    public final void zzo(long j) {
        this.zzf = j;
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        zzum zzumVar = this.zze;
        String str = zzeo.zza;
        zzumVar.zzp(this);
    }

    public final long zzq() {
        return this.zzf;
    }

    public final void zzr(zzur zzurVar) {
        zzghc.zzh(this.zzc == null);
        this.zzc = zzurVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        zzum zzumVar = this.zze;
        String str = zzeo.zza;
        zzumVar.zzs(this);
    }

    public final void zzt(zzup zzupVar) {
        long jZzv = zzv(this.zzb);
        zzur zzurVar = this.zzc;
        zzurVar.getClass();
        zzun zzunVarZzG = zzurVar.zzG(zzupVar, this.zzg, jZzv);
        this.zzd = zzunVarZzG;
        if (this.zze != null) {
            zzunVarZzG.zzb(this, jZzv);
        }
    }

    public final void zzu() {
        zzun zzunVar = this.zzd;
        if (zzunVar != null) {
            zzur zzurVar = this.zzc;
            zzurVar.getClass();
            zzurVar.zzC(zzunVar);
        }
    }
}
