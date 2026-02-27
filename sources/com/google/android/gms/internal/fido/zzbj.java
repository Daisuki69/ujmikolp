package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzbj extends zzbk {
    public zzbj(String str, String str2, Character ch2) {
        zzbh zzbhVar = new zzbh(str, str2.toCharArray());
        super(zzbhVar, ch2);
        zzas.zzc(zzbhVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzbk, com.google.android.gms.internal.fido.zzbl
    public final void zza(Appendable appendable, byte[] bArr, int i, int i4) throws IOException {
        int i6 = 0;
        zzas.zze(0, i4, bArr.length);
        for (int i10 = i4; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i6] & 255;
            int i12 = ((bArr[i6 + 1] & 255) << 8) | (i11 << 16) | (bArr[i6 + 2] & 255);
            appendable.append(this.zzb.zza(i12 >>> 18));
            appendable.append(this.zzb.zza((i12 >>> 12) & 63));
            appendable.append(this.zzb.zza((i12 >>> 6) & 63));
            appendable.append(this.zzb.zza(i12 & 63));
            i6 += 3;
        }
        if (i6 < i4) {
            zzc(appendable, bArr, i6, i4 - i6);
        }
    }
}
