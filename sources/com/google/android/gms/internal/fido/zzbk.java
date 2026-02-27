package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
class zzbk extends zzbl {
    final zzbh zzb;
    final Character zzc;

    public zzbk(zzbh zzbhVar, Character ch2) {
        this.zzb = zzbhVar;
        if (ch2 != null && zzbhVar.zzb(ch2.charValue())) {
            throw new IllegalArgumentException(zzat.zza("Padding character %s was already in alphabet", ch2));
        }
        this.zzc = ch2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbk) {
            zzbk zzbkVar = (zzbk) obj;
            if (this.zzb.equals(zzbkVar.zzb)) {
                Character ch2 = this.zzc;
                Character ch3 = zzbkVar.zzc;
                if (ch2 == ch3) {
                    return true;
                }
                if (ch2 != null && ch2.equals(ch3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode();
        Character ch2 = this.zzc;
        return iHashCode ^ (ch2 == null ? 0 : ch2.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public void zza(Appendable appendable, byte[] bArr, int i, int i4) throws IOException {
        int i6 = 0;
        zzas.zze(0, i4, bArr.length);
        while (i6 < i4) {
            zzc(appendable, bArr, i6, Math.min(this.zzb.zzd, i4 - i6));
            i6 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final int zzb(int i) {
        zzbh zzbhVar = this.zzb;
        return zzbn.zza(i, zzbhVar.zzd, RoundingMode.CEILING) * zzbhVar.zzc;
    }

    public final void zzc(Appendable appendable, byte[] bArr, int i, int i4) throws IOException {
        zzas.zze(i, i + i4, bArr.length);
        int i6 = 0;
        zzas.zzc(i4 <= this.zzb.zzd);
        long j = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            j = (j | ((long) (bArr[i + i10] & 255))) << 8;
        }
        int i11 = ((i4 + 1) * 8) - this.zzb.zzb;
        while (i6 < i4 * 8) {
            zzbh zzbhVar = this.zzb;
            appendable.append(zzbhVar.zza(zzbhVar.zza & ((int) (j >>> (i11 - i6)))));
            i6 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i6 < this.zzb.zzd * 8) {
                appendable.append(this.zzc.charValue());
                i6 += this.zzb.zzb;
            }
        }
    }

    public zzbk(String str, String str2, Character ch2) {
        this(new zzbh(str, str2.toCharArray()), ch2);
    }
}
