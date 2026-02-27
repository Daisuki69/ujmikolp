package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzbi extends zzbk {
    final char[] zza;

    public zzbi(String str, String str2) {
        zzbh zzbhVar = new zzbh("base16()", "0123456789ABCDEF".toCharArray());
        super(zzbhVar, null);
        this.zza = new char[512];
        zzas.zzc(zzbhVar.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzbhVar.zza(i >>> 4);
            this.zza[i | 256] = zzbhVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbk, com.google.android.gms.internal.fido.zzbl
    public final void zza(Appendable appendable, byte[] bArr, int i, int i4) throws IOException {
        zzas.zze(0, i4, bArr.length);
        for (int i6 = 0; i6 < i4; i6++) {
            int i10 = bArr[i6] & 255;
            appendable.append(this.zza[i10]);
            appendable.append(this.zza[i10 | 256]);
        }
    }
}
