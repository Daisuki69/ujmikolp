package com.google.android.gms.internal.vision;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzii extends zzhq {
    private static final Logger zzb = Logger.getLogger(zzii.class.getName());
    private static final boolean zzc = zzma.zza();
    zzil zza;

    public static class zza extends zzii {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        public zza(byte[] bArr, int i, int i4) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i4) | i4) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i4)));
            }
            this.zzb = bArr;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = i4;
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, int i4) throws IOException {
            zzb((i << 3) | i4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(int i, int i4) throws IOException {
            zza(i, 0);
            zza(i4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzc(int i, int i4) throws IOException {
            zza(i, 0);
            zzb(i4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzd(int i) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i4 = this.zze;
                int i6 = i4 + 1;
                this.zze = i6;
                bArr[i4] = (byte) i;
                int i10 = i4 + 2;
                this.zze = i10;
                bArr[i6] = (byte) (i >> 8);
                int i11 = i4 + 3;
                this.zze = i11;
                bArr[i10] = (byte) (i >> 16);
                this.zze = i4 + 4;
                bArr[i11] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zze(int i, int i4) throws IOException {
            zza(i, 5);
            zzd(i4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, long j) throws IOException {
            zza(i, 0);
            zza(j);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(byte[] bArr, int i, int i4) throws IOException {
            zzb(i4);
            zzc(bArr, 0, i4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzc(int i, long j) throws IOException {
            zza(i, 1);
            zzc(j);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, boolean z4) throws IOException {
            zza(i, 0);
            zza(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(int i, zzht zzhtVar) throws IOException {
            zza(1, 3);
            zzc(2, i);
            zza(3, zzhtVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzc(long j) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                int i4 = i + 1;
                this.zze = i4;
                bArr[i] = (byte) j;
                int i6 = i + 2;
                this.zze = i6;
                bArr[i4] = (byte) (j >> 8);
                int i10 = i + 3;
                this.zze = i10;
                bArr[i6] = (byte) (j >> 16);
                int i11 = i + 4;
                this.zze = i11;
                bArr[i10] = (byte) (j >> 24);
                int i12 = i + 5;
                this.zze = i12;
                bArr[i11] = (byte) (j >> 32);
                int i13 = i + 6;
                this.zze = i13;
                bArr[i12] = (byte) (j >> 40);
                int i14 = i + 7;
                this.zze = i14;
                bArr[i13] = (byte) (j >> 48);
                this.zze = i + 8;
                bArr[i14] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, String str) throws IOException {
            zza(i, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, zzht zzhtVar) throws IOException {
            zza(i, 2);
            zza(zzhtVar);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zzb(int i) throws IOException {
            if (!zzii.zzc || zzhi.zza() || zza() < 5) {
                while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    try {
                        byte[] bArr = this.zzb;
                        int i4 = this.zze;
                        this.zze = i4 + 1;
                        bArr[i4] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                    }
                }
                byte[] bArr2 = this.zzb;
                int i6 = this.zze;
                this.zze = i6 + 1;
                bArr2[i6] = (byte) i;
                return;
            }
            if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr3 = this.zzb;
                int i10 = this.zze;
                this.zze = 1 + i10;
                zzma.zza(bArr3, i10, (byte) i);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i11 = this.zze;
            this.zze = i11 + 1;
            zzma.zza(bArr4, i11, (byte) (i | 128));
            int i12 = i >>> 7;
            if ((i12 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr5 = this.zzb;
                int i13 = this.zze;
                this.zze = 1 + i13;
                zzma.zza(bArr5, i13, (byte) i12);
                return;
            }
            byte[] bArr6 = this.zzb;
            int i14 = this.zze;
            this.zze = i14 + 1;
            zzma.zza(bArr6, i14, (byte) (i12 | 128));
            int i15 = i >>> 14;
            if ((i15 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr7 = this.zzb;
                int i16 = this.zze;
                this.zze = 1 + i16;
                zzma.zza(bArr7, i16, (byte) i15);
                return;
            }
            byte[] bArr8 = this.zzb;
            int i17 = this.zze;
            this.zze = i17 + 1;
            zzma.zza(bArr8, i17, (byte) (i15 | 128));
            int i18 = i >>> 21;
            if ((i18 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                byte[] bArr9 = this.zzb;
                int i19 = this.zze;
                this.zze = 1 + i19;
                zzma.zza(bArr9, i19, (byte) i18);
                return;
            }
            byte[] bArr10 = this.zzb;
            int i20 = this.zze;
            this.zze = i20 + 1;
            zzma.zza(bArr10, i20, (byte) (i18 | 128));
            byte[] bArr11 = this.zzb;
            int i21 = this.zze;
            this.zze = 1 + i21;
            zzma.zza(bArr11, i21, (byte) (i >>> 28));
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(zzht zzhtVar) throws IOException {
            zzb(zzhtVar.zza());
            zzhtVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, zzkk zzkkVar, zzlc zzlcVar) throws IOException {
            zza(i, 2);
            zzhf zzhfVar = (zzhf) zzkkVar;
            int iZzi = zzhfVar.zzi();
            if (iZzi == -1) {
                iZzi = zzlcVar.zzb(zzhfVar);
                zzhfVar.zzb(iZzi);
            }
            zzb(iZzi);
            zzlcVar.zza(zzkkVar, this.zza);
        }

        private final void zzc(byte[] bArr, int i, int i4) throws IOException {
            try {
                System.arraycopy(bArr, i, this.zzb, this.zze, i4);
                this.zze += i4;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i4)), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i, zzkk zzkkVar) throws IOException {
            zza(1, 3);
            zzc(2, i);
            zza(3, 2);
            zza(zzkkVar);
            zza(1, 4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(zzkk zzkkVar) throws IOException {
            zzb(zzkkVar.zzm());
            zzkkVar.zza(this);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(byte b8) throws IOException {
            try {
                byte[] bArr = this.zzb;
                int i = this.zze;
                this.zze = i + 1;
                bArr[i] = b8;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(int i) throws IOException {
            if (i >= 0) {
                zzb(i);
            } else {
                zza(i);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(long j) throws IOException {
            if (zzii.zzc && zza() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i = this.zze;
                    this.zze = i + 1;
                    zzma.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i4 = this.zze;
                this.zze = 1 + i4;
                zzma.zza(bArr2, i4, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i6 = this.zze;
                    this.zze = i6 + 1;
                    bArr3[i6] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e);
                }
            }
            byte[] bArr4 = this.zzb;
            int i10 = this.zze;
            this.zze = i10 + 1;
            bArr4[i10] = (byte) j;
        }

        @Override // com.google.android.gms.internal.vision.zzhq
        public final void zza(byte[] bArr, int i, int i4) throws IOException {
            zzc(bArr, i, i4);
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final void zza(String str) throws IOException {
            int i = this.zze;
            try {
                int iZzg = zzii.zzg(str.length() * 3);
                int iZzg2 = zzii.zzg(str.length());
                if (iZzg2 == iZzg) {
                    int i4 = i + iZzg2;
                    this.zze = i4;
                    int iZza = zzmd.zza(str, this.zzb, i4, zza());
                    this.zze = i;
                    zzb((iZza - i) - iZzg2);
                    this.zze = iZza;
                    return;
                }
                zzb(zzmd.zza(str));
                this.zze = zzmd.zza(str, this.zzb, this.zze, zza());
            } catch (zzmg e) {
                this.zze = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(e7);
            }
        }

        @Override // com.google.android.gms.internal.vision.zzii
        public final int zza() {
            return this.zzd - this.zze;
        }
    }

    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public zzb(String str, Throwable th2) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th2);
        }
    }

    private zzii() {
    }

    public static zzii zza(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzb(double d10) {
        return 8;
    }

    public static int zze(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzf(int i, int i4) {
        return zzf(i4) + zzg(i << 3);
    }

    public static int zzg(int i) {
        if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzh(long j) {
        return 8;
    }

    public static int zzi(int i) {
        return 4;
    }

    public static int zzj(int i) {
        return 4;
    }

    public static int zzk(int i, int i4) {
        return zzf(i4) + zzg(i << 3);
    }

    @Deprecated
    public static int zzl(int i) {
        return zzg(i);
    }

    private static int zzm(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b8) throws IOException;

    public abstract void zza(int i) throws IOException;

    public abstract void zza(int i, int i4) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzht zzhtVar) throws IOException;

    public abstract void zza(int i, zzkk zzkkVar) throws IOException;

    public abstract void zza(int i, zzkk zzkkVar, zzlc zzlcVar) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(int i, boolean z4) throws IOException;

    public abstract void zza(long j) throws IOException;

    public abstract void zza(zzht zzhtVar) throws IOException;

    public abstract void zza(zzkk zzkkVar) throws IOException;

    public abstract void zza(String str) throws IOException;

    public abstract void zzb(int i) throws IOException;

    public abstract void zzb(int i, int i4) throws IOException;

    public abstract void zzb(int i, zzht zzhtVar) throws IOException;

    public abstract void zzb(byte[] bArr, int i, int i4) throws IOException;

    public final void zzc(int i) throws IOException {
        zzb(zzm(i));
    }

    public abstract void zzc(int i, int i4) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzc(long j) throws IOException;

    public abstract void zzd(int i) throws IOException;

    public final void zzd(int i, int i4) throws IOException {
        zzc(i, zzm(i4));
    }

    public abstract void zze(int i, int i4) throws IOException;

    public static int zzb(float f) {
        return 4;
    }

    public static int zzc(int i, zzht zzhtVar) {
        int iZzg = zzg(i << 3);
        int iZza = zzhtVar.zza();
        return zzg(iZza) + iZza + iZzg;
    }

    public static int zzd(int i, long j) {
        return zze(j) + zzg(i << 3);
    }

    public static int zze(int i, long j) {
        return zze(j) + zzg(i << 3);
    }

    public static int zzg(long j) {
        return 8;
    }

    public static int zzh(int i, int i4) {
        return zzg(zzm(i4)) + zzg(i << 3);
    }

    private static long zzi(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzj(int i, int i4) {
        return zzg(i << 3) + 4;
    }

    public static int zzb(boolean z4) {
        return 1;
    }

    public static int zzf(int i, long j) {
        return zze(zzi(j)) + zzg(i << 3);
    }

    public static int zzg(int i, int i4) {
        return zzg(i4) + zzg(i << 3);
    }

    public static int zzi(int i, int i4) {
        return zzg(i << 3) + 4;
    }

    public static int zzk(int i) {
        return zzf(i);
    }

    public final void zza(int i, float f) throws IOException {
        zze(i, Float.floatToRawIntBits(f));
    }

    public static int zzd(int i, zzht zzhtVar) {
        return zzc(3, zzhtVar) + zzg(2, i) + (zzg(8) << 1);
    }

    public static int zze(int i) {
        return zzg(i << 3);
    }

    public static int zzh(int i, long j) {
        return zzg(i << 3) + 8;
    }

    public final void zza(int i, double d10) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzi(j));
    }

    @Deprecated
    public static int zzc(int i, zzkk zzkkVar, zzlc zzlcVar) {
        int iZzg = zzg(i << 3) << 1;
        zzhf zzhfVar = (zzhf) zzkkVar;
        int iZzi = zzhfVar.zzi();
        if (iZzi == -1) {
            iZzi = zzlcVar.zzb(zzhfVar);
            zzhfVar.zzb(iZzi);
        }
        return iZzg + iZzi;
    }

    public static int zzf(int i) {
        if (i >= 0) {
            return zzg(i);
        }
        return 10;
    }

    public static int zzg(int i, long j) {
        return zzg(i << 3) + 8;
    }

    public static int zzh(int i) {
        return zzg(zzm(i));
    }

    public final void zza(float f) throws IOException {
        zzd(Float.floatToRawIntBits(f));
    }

    public final void zzb(long j) throws IOException {
        zza(zzi(j));
    }

    public static int zzb(int i, float f) {
        return zzg(i << 3) + 4;
    }

    public static int zzf(long j) {
        return zze(zzi(j));
    }

    public final void zza(double d10) throws IOException {
        zzc(Double.doubleToRawLongBits(d10));
    }

    public static int zzb(int i, double d10) {
        return zzg(i << 3) + 8;
    }

    public static int zzd(long j) {
        return zze(j);
    }

    public final void zza(boolean z4) throws IOException {
        zza(z4 ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i, zzjt zzjtVar) {
        int iZzg = zzg(i << 3);
        int iZzb = zzjtVar.zzb();
        return zzg(iZzb) + iZzb + iZzg;
    }

    public static int zzb(int i, boolean z4) {
        return zzg(i << 3) + 1;
    }

    public static int zzb(int i, String str) {
        return zzb(str) + zzg(i << 3);
    }

    @Deprecated
    public static int zzc(zzkk zzkkVar) {
        return zzkkVar.zzm();
    }

    public static int zza(zzjt zzjtVar) {
        int iZzb = zzjtVar.zzb();
        return zzg(iZzb) + iZzb;
    }

    public static int zzb(int i, zzkk zzkkVar, zzlc zzlcVar) {
        return zza(zzkkVar, zzlcVar) + zzg(i << 3);
    }

    public static int zza(zzkk zzkkVar, zzlc zzlcVar) {
        zzhf zzhfVar = (zzhf) zzkkVar;
        int iZzi = zzhfVar.zzi();
        if (iZzi == -1) {
            iZzi = zzlcVar.zzb(zzhfVar);
            zzhfVar.zzb(iZzi);
        }
        return zzg(iZzi) + iZzi;
    }

    public static int zzb(int i, zzkk zzkkVar) {
        return zzb(zzkkVar) + zzg(24) + zzg(2, i) + (zzg(8) << 1);
    }

    public static int zzb(int i, zzjt zzjtVar) {
        return zza(3, zzjtVar) + zzg(2, i) + (zzg(8) << 1);
    }

    public final void zza(String str, zzmg zzmgVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmgVar);
        byte[] bytes = str.getBytes(zzjf.zza);
        try {
            zzb(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzb(e7);
        }
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmd.zza(str);
        } catch (zzmg unused) {
            length = str.getBytes(zzjf.zza).length;
        }
        return zzg(length) + length;
    }

    public static int zzb(zzht zzhtVar) {
        int iZza = zzhtVar.zza();
        return zzg(iZza) + iZza;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        return zzg(length) + length;
    }

    public static int zzb(zzkk zzkkVar) {
        int iZzm = zzkkVar.zzm();
        return zzg(iZzm) + iZzm;
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
