package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgwi extends zzgwg {
    public zzgwi(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwe zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgwh(bArr, i);
    }
}
