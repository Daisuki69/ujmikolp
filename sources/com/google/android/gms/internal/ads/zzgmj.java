package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class zzgmj extends zzgmk {
    private volatile zzgmk zza;
    final zzgmf zzb;
    final Character zzc;

    public zzgmj(zzgmf zzgmfVar, Character ch2) {
        this.zzb = zzgmfVar;
        boolean z4 = true;
        if (ch2 != null && zzgmfVar.zze('=')) {
            z4 = false;
        }
        zzghc.zzf(z4, "Padding character %s was already in alphabet", ch2);
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgmj) {
            zzgmj zzgmjVar = (zzgmj) obj;
            if (this.zzb.equals(zzgmjVar.zzb) && Objects.equals(this.zzc, zzgmjVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch2 = this.zzc;
        return Objects.hashCode(ch2) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        zzgmf zzgmfVar = this.zzb;
        sb2.append(zzgmfVar);
        if (8 % zzgmfVar.zzb != 0) {
            Character ch2 = this.zzc;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public void zza(Appendable appendable, byte[] bArr, int i, int i4) throws IOException {
        int i6 = 0;
        zzghc.zzo(0, i4, bArr.length);
        while (i6 < i4) {
            int i10 = this.zzb.zzd;
            zze(appendable, bArr, i6, Math.min(i10, i4 - i6));
            i6 += i10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public int zzb(byte[] bArr, CharSequence charSequence) throws zzgmi {
        int i;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgmf zzgmfVar = this.zzb;
        if (!zzgmfVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            throw new zzgmi(androidx.camera.core.impl.a.o(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i4 = 0;
        int i6 = 0;
        while (i4 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                i = zzgmfVar.zzc;
                if (i10 >= i) {
                    break;
                }
                jZzc <<= zzgmfVar.zzb;
                if (i4 + i10 < charSequenceZzg.length()) {
                    jZzc |= (long) zzgmfVar.zzc(charSequenceZzg.charAt(i11 + i4));
                    i11++;
                }
                i10++;
            }
            int i12 = zzgmfVar.zzd;
            int i13 = i11 * zzgmfVar.zzb;
            int i14 = (i12 - 1) * 8;
            while (i14 >= (i12 * 8) - i13) {
                bArr[i6] = (byte) ((jZzc >>> i14) & 255);
                i14 -= 8;
                i6++;
            }
            i4 += i;
        }
        return i6;
    }

    public zzgmk zzc(zzgmf zzgmfVar, Character ch2) {
        return new zzgmj(zzgmfVar, ch2);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final int zzd(int i) {
        zzgmf zzgmfVar = this.zzb;
        return zzgmfVar.zzc * zzgmx.zzb(i, zzgmfVar.zzd, RoundingMode.CEILING);
    }

    public final void zze(Appendable appendable, byte[] bArr, int i, int i4) throws IOException {
        zzghc.zzo(i, i + i4, bArr.length);
        zzgmf zzgmfVar = this.zzb;
        int i6 = zzgmfVar.zzd;
        int i10 = 0;
        zzghc.zza(i4 <= i6);
        long j = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            j = (j | ((long) (bArr[i + i11] & 255))) << 8;
        }
        int i12 = (i4 + 1) * 8;
        int i13 = zzgmfVar.zzb;
        while (i10 < i4 * 8) {
            appendable.append(zzgmfVar.zza(zzgmfVar.zza & ((int) (j >>> ((i12 - i13) - i10)))));
            i10 += i13;
        }
        if (this.zzc != null) {
            while (i10 < i6 * 8) {
                appendable.append('=');
                i10 += i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final int zzf(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final zzgmk zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgmk
    public final zzgmk zzi() {
        zzgmk zzgmkVarZzc = this.zza;
        if (zzgmkVarZzc == null) {
            zzgmf zzgmfVar = this.zzb;
            zzgmf zzgmfVarZzd = zzgmfVar.zzd();
            zzgmkVarZzc = zzgmfVarZzd == zzgmfVar ? this : zzc(zzgmfVarZzd, this.zzc);
            this.zza = zzgmkVarZzc;
        }
        return zzgmkVarZzc;
    }

    public zzgmj(String str, String str2, Character ch2) {
        this(new zzgmf(str, str2.toCharArray()), ch2);
    }
}
