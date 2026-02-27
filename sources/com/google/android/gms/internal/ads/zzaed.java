package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaed {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzaed(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final boolean zza() {
        int i = (this.zza[this.zzc] & 255) >> this.zzd;
        zzc(1);
        return 1 == (i & 1);
    }

    public final int zzb(int i) {
        int i4 = this.zzc;
        int i6 = 8 - this.zzd;
        int i10 = i4 + 1;
        byte[] bArr = this.zza;
        int iMin = Math.min(i, i6);
        int i11 = ((bArr[i4] & 255) >> this.zzd) & (255 >> (8 - iMin));
        while (iMin < i) {
            i11 |= (bArr[i10] & 255) << iMin;
            iMin += 8;
            i10++;
        }
        int i12 = i11 & ((-1) >>> (32 - i));
        zzc(i);
        return i12;
    }

    public final void zzc(int i) {
        int i4;
        int i6 = i / 8;
        int i10 = this.zzc + i6;
        this.zzc = i10;
        int i11 = (i - (i6 * 8)) + this.zzd;
        this.zzd = i11;
        if (i11 > 7) {
            i10++;
            this.zzc = i10;
            i11 -= 8;
            this.zzd = i11;
        }
        boolean z4 = false;
        if (i10 >= 0 && (i10 < (i4 = this.zzb) || (i10 == i4 && i11 == 0))) {
            z4 = true;
        }
        zzghc.zzh(z4);
    }

    public final int zzd() {
        return (this.zzc * 8) + this.zzd;
    }
}
