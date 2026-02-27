package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsv extends zzgrf {
    private final zzgta zza;
    private final zzhgh zzb;
    private final zzhgg zzc;
    private final Integer zzd;

    private zzgsv(zzgta zzgtaVar, zzhgh zzhghVar, zzhgg zzhggVar, Integer num) {
        this.zza = zzgtaVar;
        this.zzb = zzhghVar;
        this.zzc = zzhggVar;
        this.zzd = num;
    }

    public static zzgsv zzc(zzgsz zzgszVar, zzhgh zzhghVar, Integer num) throws GeneralSecurityException {
        zzhgg zzhggVarZzb;
        zzgsz zzgszVar2 = zzgsz.zzc;
        if (zzgszVar != zzgszVar2 && num == null) {
            String string = zzgszVar.toString();
            throw new GeneralSecurityException(We.s.q(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzgszVar == zzgszVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhghVar.zzd() != 32) {
            int iZzd = zzhghVar.zzd();
            throw new GeneralSecurityException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(iZzd).length() + 74), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", iZzd));
        }
        zzgta zzgtaVarZzb = zzgta.zzb(zzgszVar);
        if (zzgtaVarZzb.zzc() == zzgszVar2) {
            zzhggVarZzb = zzgyp.zza;
        } else if (zzgtaVarZzb.zzc() == zzgsz.zzb) {
            zzhggVarZzb = zzgyp.zza(num.intValue());
        } else {
            if (zzgtaVarZzb.zzc() != zzgsz.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgtaVarZzb.zzc().toString()));
            }
            zzhggVarZzb = zzgyp.zzb(num.intValue());
        }
        return new zzgsv(zzgtaVarZzb, zzhghVar, zzhggVarZzb, num);
    }

    @Override // com.google.android.gms.internal.ads.zzgrf, com.google.android.gms.internal.ads.zzgqd
    public final /* synthetic */ zzgqs zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrf
    public final zzhgg zzb() {
        return this.zzc;
    }

    public final zzhgh zzd() {
        return this.zzb;
    }

    public final zzgta zze() {
        return this.zza;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
