package com.google.android.gms.internal.ads;

import androidx.work.WorkInfo;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzhhi extends zzhhm {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    public zzhhi(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void zzc(byte b8) {
        byte[] bArr = this.zza;
        int i = this.zzc;
        bArr[i] = b8;
        this.zzc = i + 1;
        this.zzd++;
    }

    public final void zzd(int i) {
        if (!zzhhm.zzb) {
            while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                byte[] bArr = this.zza;
                int i4 = this.zzc;
                this.zzc = i4 + 1;
                bArr[i4] = (byte) (i | 128);
                this.zzd++;
                i >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i6 = this.zzc;
            this.zzc = i6 + 1;
            bArr2[i6] = (byte) i;
            this.zzd++;
            return;
        }
        long j = this.zzc;
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            byte[] bArr3 = this.zza;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzhlc.zzp(bArr3, i10, (byte) (i | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        zzhlc.zzp(bArr4, i11, (byte) i);
        this.zzd += (int) (((long) this.zzc) - j);
    }

    public final void zze(long j) {
        if (zzhhm.zzb) {
            long j6 = this.zzc;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i4 = this.zzc;
                    this.zzc = i4 + 1;
                    zzhlc.zzp(bArr, i4, (byte) i);
                    this.zzd += (int) (((long) this.zzc) - j6);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i6 = this.zzc;
                this.zzc = i6 + 1;
                zzhlc.zzp(bArr2, i6, (byte) (i | 128));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i10 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    bArr3[i11] = (byte) i10;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr4[i12] = (byte) (i10 | 128);
                this.zzd++;
                j >>>= 7;
            }
        }
    }

    public final void zzf(int i) {
        int i4 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i4] = (byte) i;
        bArr[i4 + 1] = (byte) (i >> 8);
        bArr[i4 + 2] = (byte) (i >> 16);
        bArr[i4 + 3] = (byte) (i >> 24);
        this.zzc = i4 + 4;
        this.zzd += 4;
    }

    public final void zzg(long j) {
        int i = this.zzc;
        byte[] bArr = this.zza;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.zzc = i + 8;
        this.zzd += 8;
    }
}
