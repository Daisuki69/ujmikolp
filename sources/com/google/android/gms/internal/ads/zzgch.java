package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
final class zzgch implements zzgcg {
    private final zzfvl zza;
    private final zzfvl zzb;
    private final zzhpr zzc;
    private final zzgea zzd;

    public zzgch(zzfvl zzfvlVar, zzfvl zzfvlVar2, zzhpr zzhprVar, zzgea zzgeaVar) {
        this.zza = zzfvlVar;
        this.zzb = zzfvlVar2;
        this.zzc = zzhprVar;
        this.zzd = zzgeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final S1.y zza() {
        S1.y yVarZzb = this.zza.zzb();
        this.zzd.zze(15302, yVarZzb);
        return yVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final S1.y zzb(zzfwm zzfwmVar) {
        S1.y yVarZzc = this.zza.zzc(zzfwmVar);
        this.zzd.zze(15303, yVarZzc);
        return yVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final S1.y zzc(byte[] bArr) {
        S1.y yVarZzc = this.zzb.zzc(bArr);
        this.zzd.zze(15305, yVarZzc);
        return yVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final File zzd() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final S1.y zze(byte[] bArr) {
        S1.y yVarZzc = ((zzfvl) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(15307, yVarZzc);
        return yVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final File zzf() {
        return ((zzfvl) this.zzc.zzb()).zza();
    }
}
