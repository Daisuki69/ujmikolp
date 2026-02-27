package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfwr {
    private final zzhpr zza;
    private final zzhpr zzb;
    private final zzhpr zzc;
    private final zzgea zzd;

    public zzfwr(zzhpr zzhprVar, zzhpr zzhprVar2, zzhpr zzhprVar3, zzgea zzgeaVar) {
        this.zza = zzhprVar;
        this.zzb = zzhprVar2;
        this.zzc = zzhprVar3;
        this.zzd = zzgeaVar;
    }

    private final S1.y zzd(int i) {
        zzfwn zzfwnVar;
        int i4 = i - 1;
        if (i4 == 1) {
            zzfwnVar = (zzfwn) this.zza.zzb();
        } else if (i4 == 2) {
            zzfwnVar = (zzfwn) this.zzb.zzb();
        } else {
            if (i4 != 3) {
                throw new IllegalArgumentException();
            }
            zzfwnVar = (zzfwn) this.zzc.zzb();
        }
        return zzgot.zzk(zzfwnVar.zzb(), zzggt.zza(zzfwnVar), zzgpk.zza());
    }

    public final /* synthetic */ zzgea zza() {
        return this.zzd;
    }

    public final S1.y zzb(int i, boolean z4) {
        S1.y yVarZzd = zzd(i);
        return (!z4 || i == 2) ? yVarZzd : (zzgol) zzgot.zzj((zzgol) zzgot.zzg(zzgol.zzw(yVarZzd), Throwable.class, zzfwq.zza, zzgpk.zza()), new zzfwp(this), zzgpk.zza());
    }

    public final /* synthetic */ S1.y zzc(int i) {
        return zzd(2);
    }
}
