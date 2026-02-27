package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzgmg extends zzgmj {
    final char[] zza;

    private zzgmg(zzgmf zzgmfVar) {
        super(zzgmfVar, null);
        this.zza = new char[512];
        zzghc.zza(zzgmfVar.zzf().length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzgmfVar.zza(i >>> 4);
            this.zza[i | 256] = zzgmfVar.zza(i & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    public final void zza(Appendable appendable, byte[] bArr, int i, int i4) throws IOException {
        zzghc.zzo(0, i4, bArr.length);
        for (int i6 = 0; i6 < i4; i6++) {
            int i10 = bArr[i6] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i10]);
            appendable.append(cArr[i10 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmj, com.google.android.gms.internal.ads.zzgmk
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzgmi(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(length).length() + 21), "Invalid input length ", length));
        }
        int i = 0;
        int i4 = 0;
        while (i < charSequence.length()) {
            zzgmf zzgmfVar = this.zzb;
            bArr[i4] = (byte) (zzgmfVar.zzc(charSequence.charAt(i + 1)) | (zzgmfVar.zzc(charSequence.charAt(i)) << 4));
            i += 2;
            i4++;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final zzgmk zzc(zzgmf zzgmfVar, Character ch2) {
        return new zzgmg(zzgmfVar);
    }

    public zzgmg(String str, String str2) {
        this(new zzgmf("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
