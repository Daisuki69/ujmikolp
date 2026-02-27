package com.google.android.gms.internal.ads;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class zzhhj extends zzhhm {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzhhj(byte[] bArr, int i, int i4) {
        super(null);
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(androidx.camera.core.impl.a.c(length, i4, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzJ(int i, int i4) throws IOException {
        zzs((i << 3) | i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzK(int i, int i4) throws IOException {
        zzs(i << 3);
        zzr(i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzL(int i, int i4) throws IOException {
        zzs(i << 3);
        zzs(i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzM(int i, int i4) throws IOException {
        zzs((i << 3) | 5);
        zzt(i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzN(int i, long j) throws IOException {
        zzs(i << 3);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm, com.google.android.gms.internal.ads.zzhgs
    public final void zza(byte[] bArr, int i, int i4) throws IOException {
        zzw(bArr, i, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzh(int i, long j) throws IOException {
        zzs((i << 3) | 1);
        zzv(j);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzi(int i, boolean z4) throws IOException {
        zzs(i << 3);
        zzq(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzj(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzk(int i, zzhhb zzhhbVar) throws IOException {
        zzs((i << 3) | 2);
        zzl(zzhhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzl(zzhhb zzhhbVar) throws IOException {
        zzs(zzhhbVar.zzc());
        zzhhbVar.zzk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzm(byte[] bArr, int i, int i4) throws IOException {
        zzs(i4);
        zzw(bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzn(int i, zzhjs zzhjsVar) throws IOException {
        zzs(11);
        zzL(2, i);
        zzs(26);
        zzp(zzhjsVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzo(int i, zzhhb zzhhbVar) throws IOException {
        zzs(11);
        zzL(2, i);
        zzk(3, zzhhbVar);
        zzs(12);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzp(zzhjs zzhjsVar) throws IOException {
        zzs(zzhjsVar.zzbr());
        zzhjsVar.zzdc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzq(byte b8) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zzc;
        try {
            int i4 = i + 1;
            try {
                this.zza[i] = b8;
                this.zzc = i4;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i4;
                throw new zzhhk(i, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e7) {
            indexOutOfBoundsException = e7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzr(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzs(int i) throws IOException {
        int i4;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i6 = this.zzc;
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            try {
                i4 = i6 + 1;
                try {
                    this.zza[i6] = (byte) (i | 128);
                    i >>>= 7;
                    i6 = i4;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i6 = i4;
                    throw new zzhhk(i6, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e7) {
                indexOutOfBoundsException = e7;
                throw new zzhhk(i6, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i4 = i6 + 1;
        this.zza[i6] = (byte) i;
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzt(int i) throws IOException {
        int i4 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i4] = (byte) i;
            bArr[i4 + 1] = (byte) (i >> 8);
            bArr[i4 + 2] = (byte) (i >> 16);
            bArr[i4 + 3] = (byte) (i >> 24);
            this.zzc = i4 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzhhk(i4, this.zzb, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzu(long j) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z4 = zzhhm.zzb;
        int i4 = this.zzc;
        if (!z4 || this.zzb - i4 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i6 = i4 + 1;
                    try {
                        this.zza[i4] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i4 = i6;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i4 = i6;
                        throw new zzhhk(i4, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                }
            }
            i = i4 + 1;
            try {
                this.zza[i4] = (byte) j;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i4 = i;
                throw new zzhhk(i4, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzhlc.zzp(this.zza, i4, (byte) (((int) j) | 128));
                j >>>= 7;
                i4++;
            }
            i = i4 + 1;
            zzhlc.zzp(this.zza, i4, (byte) j);
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzv(long j) throws IOException {
        int i = this.zzc;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new zzhhk(i, this.zzb, 8, e);
        }
    }

    public final void zzw(byte[] bArr, int i, int i4) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i4);
            this.zzc += i4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzhhk(this.zzc, this.zzb, i4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzx(String str) throws IOException {
        int i = this.zzc;
        try {
            int iZzA = zzhhm.zzA(str.length() * 3);
            int iZzA2 = zzhhm.zzA(str.length());
            if (iZzA2 != iZzA) {
                zzs(zzhlh.zzc(str));
                byte[] bArr = this.zza;
                int i4 = this.zzc;
                this.zzc = zzhlh.zzd(str, bArr, i4, this.zzb - i4);
                return;
            }
            int i6 = i + iZzA2;
            this.zzc = i6;
            int iZzd = zzhlh.zzd(str, this.zza, i6, this.zzb - i6);
            this.zzc = i;
            zzs((iZzd - i) - iZzA2);
            this.zzc = iZzd;
        } catch (zzhlg e) {
            this.zzc = i;
            zzF(str, e);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzhhk(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhm
    public final void zzy() {
    }
}
