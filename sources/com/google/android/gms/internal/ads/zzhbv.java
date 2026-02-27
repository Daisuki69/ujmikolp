package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhbv extends zzhby {
    private final int zza;

    private zzhbv(int i) {
        this.zza = i;
    }

    public static zzhbv zzb(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            return new zzhbv(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhbv) && ((zzhbv) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhbv.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i = this.zza;
        return androidx.media3.datasource.cache.c.m(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
