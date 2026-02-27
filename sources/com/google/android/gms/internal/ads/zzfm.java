package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfm {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfm(byte[] bArr, int i, int i4) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i4;
        zzk();
    }

    private final int zzi() {
        int i = 0;
        while (!zze()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zzf(i) : 0);
    }

    private final boolean zzj(int i) {
        if (i < 2 || i >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    private final void zzk() {
        int i;
        int i4 = this.zzc;
        boolean z4 = false;
        if (i4 >= 0 && (i4 < (i = this.zzb) || (i4 == i && this.zzd == 0))) {
            z4 = true;
        }
        zzghc.zzh(z4);
    }

    public final void zza() {
        int i = this.zzd + 1;
        this.zzd = i;
        if (i == 8) {
            this.zzd = 0;
            int i4 = this.zzc;
            this.zzc = i4 + (true == zzj(i4 + 1) ? 2 : 1);
        }
        zzk();
    }

    public final void zzb(int i) {
        int i4 = this.zzc;
        int i6 = i / 8;
        int i10 = i4 + i6;
        this.zzc = i10;
        int i11 = (i - (i6 * 8)) + this.zzd;
        this.zzd = i11;
        if (i11 > 7) {
            this.zzc = i10 + 1;
            this.zzd = i11 - 8;
        }
        while (true) {
            i4++;
            if (i4 > this.zzc) {
                zzk();
                return;
            } else if (zzj(i4)) {
                this.zzc++;
                i4 += 2;
            }
        }
    }

    public final void zzc() {
        int i = this.zzd;
        if (i > 0) {
            zzb(8 - i);
        }
    }

    public final boolean zzd(int i) {
        int i4 = this.zzc;
        int i6 = i / 8;
        int i10 = i4 + i6;
        int i11 = (this.zzd + i) - (i6 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i4++;
            if (i4 > i10 || i10 >= this.zzb) {
                break;
            }
            if (zzj(i4)) {
                i10++;
                i4 += 2;
            }
        }
        int i12 = this.zzb;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public final boolean zze() {
        int i = this.zza[this.zzc] & (128 >> this.zzd);
        zza();
        return i != 0;
    }

    public final int zzf(int i) {
        int i4;
        this.zzd += i;
        int i6 = 0;
        while (true) {
            i4 = this.zzd;
            if (i4 <= 8) {
                break;
            }
            int i10 = i4 - 8;
            this.zzd = i10;
            byte[] bArr = this.zza;
            int i11 = this.zzc;
            i6 |= (bArr[i11] & 255) << i10;
            if (true != zzj(i11 + 1)) {
                i = 1;
            }
            this.zzc = i11 + i;
        }
        byte[] bArr2 = this.zza;
        int i12 = this.zzc;
        int i13 = i6 | ((bArr2[i12] & 255) >> (8 - i4));
        int i14 = 32 - i;
        if (i4 == 8) {
            this.zzd = 0;
            this.zzc = i12 + (true != zzj(i12 + 1) ? 1 : 2);
        }
        int i15 = ((-1) >>> i14) & i13;
        zzk();
        return i15;
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        int iZzi = zzi();
        int i = iZzi % 2;
        return ((iZzi + 1) / 2) * (i == 0 ? -1 : 1);
    }
}
