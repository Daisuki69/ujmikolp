package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzgmh extends zzgmj {
    private zzgmh(zzgmf zzgmfVar, Character ch2) {
        super(zzgmfVar, ch2);
        zzghc.zza(zzgmfVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    public final void zza(Appendable appendable, byte[] bArr, int i, int i4) throws IOException {
        int i6 = 0;
        zzghc.zzo(0, i4, bArr.length);
        for (int i10 = i4; i10 >= 3; i10 -= 3) {
            int i11 = bArr[i6] & 255;
            int i12 = bArr[i6 + 1] & 255;
            int i13 = bArr[i6 + 2] & 255;
            zzgmf zzgmfVar = this.zzb;
            int i14 = (i12 << 8) | (i11 << 16) | i13;
            appendable.append(zzgmfVar.zza(i14 >>> 18));
            appendable.append(zzgmfVar.zza((i14 >>> 12) & 63));
            appendable.append(zzgmfVar.zza((i14 >>> 6) & 63));
            appendable.append(zzgmfVar.zza(i14 & 63));
            i6 += 3;
        }
        if (i6 < i4) {
            zze(appendable, bArr, i6, i4 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgmf zzgmfVar = this.zzb;
        if (!zzgmfVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgmi(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i = 0;
        int i4 = 0;
        while (i < charSequenceZzg.length()) {
            int i6 = i4 + 1;
            int iZzc = (zzgmfVar.zzc(charSequenceZzg.charAt(i + 1)) << 12) | (zzgmfVar.zzc(charSequenceZzg.charAt(i)) << 18);
            bArr[i4] = (byte) (iZzc >>> 16);
            int i10 = i + 2;
            if (i10 < charSequenceZzg.length()) {
                int i11 = i + 3;
                int iZzc2 = iZzc | (zzgmfVar.zzc(charSequenceZzg.charAt(i10)) << 6);
                int i12 = i4 + 2;
                bArr[i6] = (byte) ((iZzc2 >>> 8) & 255);
                if (i11 < charSequenceZzg.length()) {
                    i += 4;
                    i4 += 3;
                    bArr[i12] = (byte) ((iZzc2 | zzgmfVar.zzc(charSequenceZzg.charAt(i11))) & 255);
                } else {
                    i4 = i12;
                    i = i11;
                }
            } else {
                i = i10;
                i4 = i6;
            }
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final zzgmk zzc(zzgmf zzgmfVar, Character ch2) {
        return new zzgmh(zzgmfVar, ch2);
    }

    public zzgmh(String str, String str2, Character ch2) {
        this(new zzgmf(str, str2.toCharArray()), ch2);
    }
}
