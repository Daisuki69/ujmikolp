package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzhfz implements zzhbw {
    final zzhbw zza;
    final zzhbw zzb;

    public /* synthetic */ zzhfz(zzhbw zzhbwVar, zzhbw zzhbwVar2, byte[] bArr) {
        this.zza = zzhbwVar;
        this.zzb = zzhbwVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i) : this.zzb.zza(bArr, i);
    }
}
