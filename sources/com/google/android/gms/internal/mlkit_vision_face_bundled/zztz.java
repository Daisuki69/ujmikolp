package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.work.WorkInfo;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zztz extends zzuc {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    public zztz(byte[] bArr, int i, int i4) {
        super(null);
        int length = bArr.length;
        if (((length - i4) | i4) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i4)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzb(byte b8) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            this.zzd = i + 1;
            bArr[i] = b8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    public final void zzc(byte[] bArr, int i, int i4) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zzb, this.zzd, i4);
            this.zzd += i4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i4)), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzd(int i, boolean z4) throws IOException {
        zzt(i << 3);
        zzb(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zze(int i, zztu zztuVar) throws IOException {
        zzt((i << 3) | 2);
        zzt(zztuVar.zzd());
        zztuVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzf(int i, int i4) throws IOException {
        zzt((i << 3) | 5);
        zzg(i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzg(int i) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i4 = this.zzd;
            int i6 = i4 + 1;
            this.zzd = i6;
            bArr[i4] = (byte) (i & 255);
            int i10 = i4 + 2;
            this.zzd = i10;
            bArr[i6] = (byte) ((i >> 8) & 255);
            int i11 = i4 + 3;
            this.zzd = i11;
            bArr[i10] = (byte) ((i >> 16) & 255);
            this.zzd = i4 + 4;
            bArr[i11] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzh(int i, long j) throws IOException {
        zzt((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzi(long j) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i = this.zzd;
            int i4 = i + 1;
            this.zzd = i4;
            bArr[i] = (byte) (((int) j) & 255);
            int i6 = i + 2;
            this.zzd = i6;
            bArr[i4] = (byte) (((int) (j >> 8)) & 255);
            int i10 = i + 3;
            this.zzd = i10;
            bArr[i6] = (byte) (((int) (j >> 16)) & 255);
            int i11 = i + 4;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) (j >> 24)) & 255);
            int i12 = i + 5;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j >> 32)) & 255);
            int i13 = i + 6;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j >> 40)) & 255);
            int i14 = i + 7;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j >> 48)) & 255);
            this.zzd = i + 8;
            bArr[i14] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzj(int i, int i4) throws IOException {
        zzt(i << 3);
        zzk(i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzt(i);
        } else {
            zzv(i);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzl(byte[] bArr, int i, int i4) throws IOException {
        zzc(bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzm(int i, zzvw zzvwVar, zzwh zzwhVar) throws IOException {
        zzt((i << 3) | 2);
        zzt(((zztf) zzvwVar).zzp(zzwhVar));
        zzwhVar.zzi(zzvwVar, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzn(int i, zzvw zzvwVar) throws IOException {
        zzt(11);
        zzs(2, i);
        zzt(26);
        zzt(zzvwVar.zzu());
        zzvwVar.zzL(this);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzo(int i, zztu zztuVar) throws IOException {
        zzt(11);
        zzs(2, i);
        zze(3, zztuVar);
        zzt(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzp(int i, String str) throws IOException {
        zzt((i << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws IOException {
        int i = this.zzd;
        try {
            int iZzz = zzuc.zzz(str.length() * 3);
            int iZzz2 = zzuc.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzt(zzxf.zzc(str));
                byte[] bArr = this.zzb;
                int i4 = this.zzd;
                this.zzd = zzxf.zzb(str, bArr, i4, this.zzc - i4);
                return;
            }
            int i6 = i + iZzz2;
            this.zzd = i6;
            int iZzb = zzxf.zzb(str, this.zzb, i6, this.zzc - i6);
            this.zzd = i;
            zzt((iZzb - i) - iZzz2);
            this.zzd = iZzb;
        } catch (zzxe e) {
            this.zzd = i;
            zzC(str, e);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzua(e7);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzr(int i, int i4) throws IOException {
        zzt((i << 3) | i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzs(int i, int i4) throws IOException {
        zzt(i << 3);
        zzt(i4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzt(int i) throws IOException {
        while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i4 = this.zzd;
                this.zzd = i4 + 1;
                bArr[i4] = (byte) ((i | 128) & 255);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
            }
        }
        byte[] bArr2 = this.zzb;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        bArr2[i6] = (byte) i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzu(int i, long j) throws IOException {
        zzt(i << 3);
        zzv(j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc
    public final void zzv(long j) throws IOException {
        if (!zzuc.zzc || this.zzc - this.zzd < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i = this.zzd;
                    this.zzd = i + 1;
                    bArr[i] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzua(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e);
                }
            }
            byte[] bArr2 = this.zzb;
            int i4 = this.zzd;
            this.zzd = i4 + 1;
            bArr2[i4] = (byte) j;
            return;
        }
        while (true) {
            int i6 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i10 = this.zzd;
                this.zzd = 1 + i10;
                zzxc.zzn(bArr3, i10, (byte) i6);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            zzxc.zzn(bArr4, i11, (byte) ((i6 | 128) & 255));
            j >>>= 7;
        }
    }
}
