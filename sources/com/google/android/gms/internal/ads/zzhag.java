package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhag implements zzgzi {
    private static final zzhag zza = new zzhag();

    private zzhag() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzgyl.zza().zzc(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zza() {
        return zzhae.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zzb() {
        return zzhae.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final /* bridge */ /* synthetic */ Object zze(zzgxr zzgxrVar, zzgxy zzgxyVar, zzgzh zzgzhVar) throws GeneralSecurityException {
        zzhgg zzhggVarZzd;
        zzgqm zzgqmVarZzc = ((zzgqo) zzgxrVar).zzc();
        zzgyx zzgyxVar = new zzgyx();
        for (int i = 0; i < zzgxrVar.zzd(); i++) {
            zzgqm zzgqmVarZze = ((zzgqo) zzgxrVar).zze(i);
            if (zzgqmVarZze.zzb().equals(zzgqf.zza)) {
                zzhae zzhaeVar = (zzhae) zzgzhVar.zza(zzgqmVarZze);
                zzgqd zzgqdVarZza = zzgqmVarZze.zza();
                if (zzgqdVarZza instanceof zzhat) {
                    zzhggVarZzd = ((zzhat) zzgqdVarZza).zzd();
                } else {
                    if (!(zzgqdVarZza instanceof zzgxv)) {
                        String name = zzgqdVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzgqdVarZza.zza());
                        throw new GeneralSecurityException(androidx.camera.core.impl.a.p(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzhggVarZzd = ((zzgxv) zzgqdVarZza).zzd();
                }
                zzgyxVar.zza(zzhggVarZzd, zzhaeVar);
            }
        }
        return new zzhaf(zzgyxVar.zzb(), (zzhae) zzgzhVar.zza(zzgqmVarZzc), null);
    }
}
