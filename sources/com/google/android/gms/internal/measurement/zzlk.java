package com.google.android.gms.internal.measurement;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class zzlk extends zzlm {
    private final byte[] zzc;
    private final int zzd;
    private int zze;

    public zzlk(byte[] bArr, int i, int i4) {
        super(null);
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(androidx.camera.core.impl.a.c(length, i4, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zzc = bArr;
        this.zze = 0;
        this.zzd = i4;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zza(int i, int i4) throws IOException {
        zzr((i << 3) | i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzb(int i, int i4) throws IOException {
        zzr(i << 3);
        zzq(i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzc(int i, int i4) throws IOException {
        zzr(i << 3);
        zzr(i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzd(int i, int i4) throws IOException {
        zzr((i << 3) | 5);
        zzs(i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zze(int i, long j) throws IOException {
        zzr(i << 3);
        zzt(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzf(int i, long j) throws IOException {
        zzr((i << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzg(int i, boolean z4) throws IOException {
        zzr(i << 3);
        zzp(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzh(int i, String str) throws IOException {
        zzr((i << 3) | 2);
        zzx(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzi(int i, zzlh zzlhVar) throws IOException {
        zzr((i << 3) | 2);
        zzj(zzlhVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzj(zzlh zzlhVar) throws IOException {
        zzr(zzlhVar.zzc());
        zzlhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzk(byte[] bArr, int i, int i4) throws IOException {
        zzr(i4);
        zzv(bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzl(int i, zznm zznmVar, zznx zznxVar) throws IOException {
        zzr((i << 3) | 2);
        zzr(((zzks) zznmVar).zzcd(zznxVar));
        zznxVar.zzf(zznmVar, this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzm(int i, zznm zznmVar) throws IOException {
        zzr(11);
        zzc(2, i);
        zzr(26);
        zzo(zznmVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzn(int i, zzlh zzlhVar) throws IOException {
        zzr(11);
        zzc(2, i);
        zzi(3, zzlhVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzo(zznm zznmVar) throws IOException {
        zzr(zznmVar.zzcn());
        zznmVar.zzcB(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzp(byte b8) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zze;
        try {
            int i4 = i + 1;
            try {
                this.zzc[i] = b8;
                this.zze = i4;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i4;
                throw new zzll(i, this.zzd, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e7) {
            indexOutOfBoundsException = e7;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzq(int i) throws IOException {
        if (i >= 0) {
            zzr(i);
        } else {
            zzt(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzr(int i) throws IOException {
        int i4;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i6 = this.zze;
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            try {
                i4 = i6 + 1;
                try {
                    this.zzc[i6] = (byte) (i | 128);
                    i >>>= 7;
                    i6 = i4;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i6 = i4;
                    throw new zzll(i6, this.zzd, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e7) {
                indexOutOfBoundsException = e7;
                throw new zzll(i6, this.zzd, 1, indexOutOfBoundsException);
            }
        }
        i4 = i6 + 1;
        this.zzc[i6] = (byte) i;
        this.zze = i4;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzs(int i) throws IOException {
        int i4 = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i4] = (byte) i;
            bArr[i4 + 1] = (byte) (i >> 8);
            bArr[i4 + 2] = (byte) (i >> 16);
            bArr[i4 + 3] = (byte) (i >> 24);
            this.zze = i4 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(i4, this.zzd, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzt(long j) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z4 = zzlm.zzd;
        int i4 = this.zze;
        if (!z4 || this.zzd - i4 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i6 = i4 + 1;
                    try {
                        this.zzc[i4] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i4 = i6;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i4 = i6;
                        throw new zzll(i4, this.zzd, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                }
            }
            i = i4 + 1;
            try {
                this.zzc[i4] = (byte) j;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                i4 = i;
                throw new zzll(i4, this.zzd, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzop.zzp(this.zzc, i4, (byte) (((int) j) | 128));
                j >>>= 7;
                i4++;
            }
            i = i4 + 1;
            zzop.zzp(this.zzc, i4, (byte) j);
        }
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzu(long j) throws IOException {
        int i = this.zze;
        try {
            byte[] bArr = this.zzc;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zze = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(i, this.zzd, 8, e);
        }
    }

    public final void zzv(byte[] bArr, int i, int i4) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzc, this.zze, i4);
            this.zze += i4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(this.zze, this.zzd, i4, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzw(byte[] bArr, int i, int i4) throws IOException {
        zzv(bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzx(String str) throws IOException {
        int i = this.zze;
        try {
            int iZzz = zzlm.zzz(str.length() * 3);
            int iZzz2 = zzlm.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzos.zzb(str));
                byte[] bArr = this.zzc;
                int i4 = this.zze;
                this.zze = zzos.zzc(str, bArr, i4, this.zzd - i4);
                return;
            }
            int i6 = i + iZzz2;
            this.zze = i6;
            int iZzc = zzos.zzc(str, this.zzc, i6, this.zzd - i6);
            this.zze = i;
            zzr((iZzc - i) - iZzz2);
            this.zze = iZzc;
        } catch (zzor e) {
            this.zze = i;
            zzF(str, e);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzll(e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final int zzy() {
        return this.zzd - this.zze;
    }
}
