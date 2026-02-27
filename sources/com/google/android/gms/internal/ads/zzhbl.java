package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhbl implements zzhae {
    private zzhbl(zzgzw zzgzwVar, Provider provider) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzgzwVar.zzd().zzc();
            zzgzwVar.zze();
            new SecretKeySpec(zzgzwVar.zzc().zzc(zzgqc.zza()), "AES");
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }

    public static zzhae zza(zzgzw zzgzwVar, Provider provider) throws GeneralSecurityException {
        return new zzhbl(zzgzwVar, provider);
    }
}
