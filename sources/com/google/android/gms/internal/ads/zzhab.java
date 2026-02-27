package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhab {
    private Integer zza = null;
    private Integer zzb = null;
    private zzhac zzc = zzhac.zzd;

    private zzhab() {
    }

    public final zzhab zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhab zzb(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(i).length() + 40), "Invalid tag size for AesCmacParameters: ", i));
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzhab zzc(zzhac zzhacVar) {
        this.zzc = zzhacVar;
        return this;
    }

    public final zzhad zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhad(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzhab(byte[] bArr) {
    }
}
