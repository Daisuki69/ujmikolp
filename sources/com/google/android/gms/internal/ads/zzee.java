package com.google.android.gms.internal.ads;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzee {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzee(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzd = i;
    }

    private final void zzq() {
        int i;
        int i4 = this.zzb;
        boolean z4 = false;
        if (i4 >= 0 && (i4 < (i = this.zzd) || (i4 == i && this.zzc == 0))) {
            z4 = true;
        }
        zzghc.zzh(z4);
    }

    public final void zza(zzef zzefVar) {
        zzb(zzefVar.zzi(), zzefVar.zze());
        zzf(zzefVar.zzg() * 8);
    }

    public final void zzb(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i;
    }

    public final int zzc() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzd() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zze() {
        zzghc.zzh(this.zzc == 0);
        return this.zzb;
    }

    public final void zzf(int i) {
        int i4 = i / 8;
        this.zzb = i4;
        this.zzc = i - (i4 * 8);
        zzq();
    }

    public final void zzg() {
        int i = this.zzc + 1;
        this.zzc = i;
        if (i == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzh(int i) {
        int i4 = i / 8;
        int i6 = this.zzb + i4;
        this.zzb = i6;
        int i10 = (i - (i4 * 8)) + this.zzc;
        this.zzc = i10;
        if (i10 > 7) {
            this.zzb = i6 + 1;
            this.zzc = i10 - 8;
        }
        zzq();
    }

    public final boolean zzi() {
        int i = this.zza[this.zzb] & (128 >> this.zzc);
        zzg();
        return i != 0;
    }

    public final int zzj(int i) {
        int i4;
        if (i == 0) {
            return 0;
        }
        this.zzc += i;
        int i6 = 0;
        while (true) {
            i4 = this.zzc;
            if (i4 <= 8) {
                break;
            }
            int i10 = i4 - 8;
            this.zzc = i10;
            byte[] bArr = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            i6 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.zza;
        int i12 = this.zzb;
        int i13 = i6 | ((bArr2[i12] & 255) >> (8 - i4));
        int i14 = 32 - i;
        if (i4 == 8) {
            this.zzc = 0;
            this.zzb = i12 + 1;
        }
        int i15 = ((-1) >>> i14) & i13;
        zzq();
        return i15;
    }

    public final long zzk(int i) {
        if (i <= 32) {
            int iZzj = zzj(i);
            String str = zzeo.zza;
            return KeyboardMap.kValueMask & ((long) iZzj);
        }
        int iZzj2 = zzj(i - 32);
        int iZzj3 = zzj(32);
        String str2 = zzeo.zza;
        return (KeyboardMap.kValueMask & ((long) iZzj3)) | ((((long) iZzj2) & KeyboardMap.kValueMask) << 32);
    }

    public final void zzl(byte[] bArr, int i, int i4) {
        int i6;
        int i10 = 0;
        while (true) {
            i6 = i4 >> 3;
            if (i10 >= i6) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i11 = this.zzb;
            int i12 = i11 + 1;
            this.zzb = i12;
            byte b8 = bArr2[i11];
            int i13 = this.zzc;
            byte b10 = (byte) (b8 << i13);
            bArr[i10] = b10;
            bArr[i10] = (byte) (((bArr2[i12] & 255) >> (8 - i13)) | b10);
            i10++;
        }
        int i14 = i4 & 7;
        if (i14 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i6] & (255 >> i14));
        bArr[i6] = b11;
        int i15 = this.zzc;
        if (i15 + i14 > 8) {
            byte[] bArr3 = this.zza;
            int i16 = this.zzb;
            this.zzb = i16 + 1;
            b11 = (byte) (b11 | ((bArr3[i16] & 255) << i15));
            bArr[i6] = b11;
            i15 -= 8;
        }
        int i17 = i15 + i14;
        this.zzc = i17;
        byte[] bArr4 = this.zza;
        int i18 = this.zzb;
        bArr[i6] = (byte) (((byte) (((255 & bArr4[i18]) >> (8 - i17)) << (8 - i14))) | b11);
        if (i17 == 8) {
            this.zzc = 0;
            this.zzb = i18 + 1;
        }
        zzq();
    }

    public final void zzm() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzn(byte[] bArr, int i, int i4) {
        zzghc.zzh(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i4);
        this.zzb += i4;
        zzq();
    }

    public final void zzo(int i) {
        zzghc.zzh(this.zzc == 0);
        this.zzb += i;
        zzq();
    }

    public final void zzp(int i, int i4) {
        int iMin = Math.min(8 - this.zzc, 14);
        int i6 = this.zzc;
        int i10 = (8 - i6) - iMin;
        byte[] bArr = this.zza;
        int i11 = this.zzb;
        byte b8 = (byte) (((65280 >> i6) | ((1 << i10) - 1)) & bArr[i11]);
        bArr[i11] = b8;
        int i12 = 14 - iMin;
        int i13 = i & 16383;
        bArr[i11] = (byte) (b8 | ((i13 >>> i12) << i10));
        int i14 = i11 + 1;
        while (i12 > 8) {
            i12 -= 8;
            this.zza[i14] = (byte) (i13 >>> i12);
            i14++;
        }
        byte[] bArr2 = this.zza;
        byte b10 = (byte) (bArr2[i14] & ((1 << r0) - 1));
        bArr2[i14] = b10;
        bArr2[i14] = (byte) (((i13 & ((1 << i12) - 1)) << (8 - i12)) | b10);
        zzh(14);
        zzq();
    }

    public zzee() {
        this.zza = zzeo.zzb;
    }
}
