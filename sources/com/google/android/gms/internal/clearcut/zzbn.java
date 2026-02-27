package com.google.android.gms.internal.clearcut;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbn extends zzba {
    private static final Logger logger = Logger.getLogger(zzbn.class.getName());
    private static final boolean zzfy = zzfd.zzed();
    zzbp zzfz;

    public static class zza extends zzbn {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public zza(byte[] bArr, int i, int i4) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i6 = i + i4;
            if ((i | i4 | (bArr.length - i6)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i4)));
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i6;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public void flush() {
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i, int i4) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i4);
                this.position += i4;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i4)), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b8) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b8;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.limit - this.position;
        }

        public final int zzai() {
            return this.position - this.offset;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, int i4) throws IOException {
            zzo((i << 3) | i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, int i4) throws IOException {
            zzb(i, 0);
            zzn(i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i, int i4) throws IOException {
            zzb(i, 0);
            zzo(i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i, int i4) throws IOException {
            zzb(i, 5);
            zzq(i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String str) throws IOException {
            int iZza;
            int i = this.position;
            try {
                int iZzt = zzbn.zzt(str.length() * 3);
                int iZzt2 = zzbn.zzt(str.length());
                if (iZzt2 == iZzt) {
                    int i4 = i + iZzt2;
                    this.position = i4;
                    iZza = zzff.zza(str, this.buffer, i4, zzag());
                    this.position = i;
                    zzo((iZza - i) - iZzt2);
                } else {
                    zzo(zzff.zza(str));
                    iZza = zzff.zza(str, this.buffer, this.position, zzag());
                }
                this.position = iZza;
            } catch (zzfi e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e7) {
                throw new zzc(e7);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i) throws IOException {
            if (i >= 0) {
                zzo(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i) throws IOException {
            if (zzbn.zzfy && zzag() >= 10) {
                while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    byte[] bArr = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    zzfd.zza(bArr, i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i6 = this.position;
                this.position = 1 + i6;
                zzfd.zza(bArr2, i6, (byte) i);
                return;
            }
            while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    bArr3[i10] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i11 = this.position;
            this.position = i11 + 1;
            bArr4[i11] = (byte) i;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i4 = this.position;
                int i6 = i4 + 1;
                this.position = i6;
                bArr[i4] = (byte) i;
                int i10 = i4 + 2;
                this.position = i10;
                bArr[i6] = (byte) (i >> 8);
                int i11 = i4 + 3;
                this.position = i11;
                bArr[i10] = (byte) (i >> 16);
                this.position = i4 + 4;
                bArr[i11] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzbb zzbbVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzd(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i4 = i + 1;
                this.position = i4;
                bArr[i] = (byte) j;
                int i6 = i + 2;
                this.position = i6;
                bArr[i4] = (byte) (j >> 8);
                int i10 = i + 3;
                this.position = i10;
                bArr[i6] = (byte) (j >> 16);
                int i11 = i + 4;
                this.position = i11;
                bArr[i10] = (byte) (j >> 24);
                int i12 = i + 5;
                this.position = i12;
                bArr[i11] = (byte) (j >> 32);
                int i13 = i + 6;
                this.position = i13;
                bArr[i12] = (byte) (j >> 40);
                int i14 = i + 7;
                this.position = i14;
                bArr[i13] = (byte) (j >> 48);
                this.position = i + 8;
                bArr[i14] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzbb zzbbVar) throws IOException {
            zzb(i, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzdo zzdoVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] bArr, int i, int i4) throws IOException {
            zzo(i4);
            write(bArr, 0, i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzdo zzdoVar) throws IOException {
            zzb(i, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, boolean z4) throws IOException {
            zzb(i, 0);
            zza(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzb(i, 2);
            zzas zzasVar = (zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j) throws IOException {
            if (zzbn.zzfy && zzag() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    zzfd.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i4 = this.position;
                this.position = 1 + i4;
                zzfd.zza(bArr2, i4, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i6 = this.position;
                    this.position = i6 + 1;
                    bArr3[i6] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            bArr4[i10] = (byte) j;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, String str) throws IOException {
            zzb(i, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdoVar) throws IOException {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbbVar) throws IOException {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzas zzasVar = (zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i, int i4) throws IOException {
            write(bArr, i, i4);
        }
    }

    public static final class zzb extends zza {
        private final ByteBuffer zzga;
        private int zzgb;

        public zzb(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.zzga = byteBuffer;
            this.zzgb = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn.zza, com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzga.position(this.zzgb + zzai());
        }
    }

    public static class zzc extends IOException {
        public zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public zzc(String str) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public zzc(String str, Throwable th2) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th2);
        }

        public zzc(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    public static final class zzd extends zzbn {
        private final int zzgb;
        private final ByteBuffer zzgc;
        private final ByteBuffer zzgd;

        public zzd(ByteBuffer byteBuffer) {
            super();
            this.zzgc = byteBuffer;
            this.zzgd = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzgb = byteBuffer.position();
        }

        private final void zzi(String str) throws IOException {
            try {
                zzff.zza(str, this.zzgd);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzgc.position(this.zzgd.position());
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i, int i4) throws IOException {
            try {
                this.zzgd.put(bArr, i, i4);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            } catch (BufferOverflowException e7) {
                throw new zzc(e7);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b8) throws IOException {
            try {
                this.zzgd.put(b8);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.zzgd.remaining();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, int i4) throws IOException {
            zzo((i << 3) | i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, int i4) throws IOException {
            zzb(i, 0);
            zzn(i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i, int i4) throws IOException {
            zzb(i, 0);
            zzo(i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i, int i4) throws IOException {
            zzb(i, 5);
            zzq(i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String str) throws IOException {
            int iPosition = this.zzgd.position();
            try {
                int iZzt = zzbn.zzt(str.length() * 3);
                int iZzt2 = zzbn.zzt(str.length());
                if (iZzt2 != iZzt) {
                    zzo(zzff.zza(str));
                    zzi(str);
                    return;
                }
                int iPosition2 = this.zzgd.position() + iZzt2;
                this.zzgd.position(iPosition2);
                zzi(str);
                int iPosition3 = this.zzgd.position();
                this.zzgd.position(iPosition);
                zzo(iPosition3 - iPosition2);
                this.zzgd.position(iPosition3);
            } catch (zzfi e) {
                this.zzgd.position(iPosition);
                zza(str, e);
            } catch (IllegalArgumentException e7) {
                throw new zzc(e7);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i) throws IOException {
            if (i >= 0) {
                zzo(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i) throws IOException {
            while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                try {
                    this.zzgd.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.zzgd.put((byte) i);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i) throws IOException {
            try {
                this.zzgd.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzbb zzbbVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzd(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j) throws IOException {
            try {
                this.zzgd.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzbb zzbbVar) throws IOException {
            zzb(i, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzdo zzdoVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] bArr, int i, int i4) throws IOException {
            zzo(i4);
            write(bArr, 0, i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzdo zzdoVar) throws IOException {
            zzb(i, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, boolean z4) throws IOException {
            zzb(i, 0);
            zza(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzb(i, 2);
            zza(zzdoVar, zzefVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j) throws IOException {
            while (((-128) & j) != 0) {
                try {
                    this.zzgd.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.zzgd.put((byte) j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, String str) throws IOException {
            zzb(i, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdoVar) throws IOException {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbbVar) throws IOException {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzas zzasVar = (zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i, int i4) throws IOException {
            write(bArr, i, i4);
        }
    }

    public static final class zze extends zzbn {
        private final ByteBuffer zzgc;
        private final ByteBuffer zzgd;
        private final long zzge;
        private final long zzgf;
        private final long zzgg;
        private final long zzgh;
        private long zzgi;

        public zze(ByteBuffer byteBuffer) {
            super();
            this.zzgc = byteBuffer;
            this.zzgd = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jZzb = zzfd.zzb(byteBuffer);
            this.zzge = jZzb;
            long jPosition = ((long) byteBuffer.position()) + jZzb;
            this.zzgf = jPosition;
            long jLimit = jZzb + ((long) byteBuffer.limit());
            this.zzgg = jLimit;
            this.zzgh = jLimit - 10;
            this.zzgi = jPosition;
        }

        private final void zzk(long j) {
            this.zzgd.position((int) (j - this.zzge));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.zzgc.position((int) (this.zzgi - this.zzge));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i, int i4) throws IOException {
            if (bArr != null && i >= 0 && i4 >= 0 && bArr.length - i4 >= i) {
                long j = i4;
                long j6 = this.zzgg - j;
                long j7 = this.zzgi;
                if (j6 >= j7) {
                    zzfd.zza(bArr, i, j7, j);
                    this.zzgi += j;
                    return;
                }
            }
            if (bArr != null) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzgi), Long.valueOf(this.zzgg), Integer.valueOf(i4)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b8) throws IOException {
            long j = this.zzgi;
            if (j >= this.zzgg) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzgi), Long.valueOf(this.zzgg), 1));
            }
            this.zzgi = 1 + j;
            zzfd.zza(j, b8);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return (int) (this.zzgg - this.zzgi);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, int i4) throws IOException {
            zzo((i << 3) | i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, int i4) throws IOException {
            zzb(i, 0);
            zzn(i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i, int i4) throws IOException {
            zzb(i, 0);
            zzo(i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i, int i4) throws IOException {
            zzb(i, 5);
            zzq(i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String str) throws IOException {
            long j = this.zzgi;
            try {
                int iZzt = zzbn.zzt(str.length() * 3);
                int iZzt2 = zzbn.zzt(str.length());
                if (iZzt2 != iZzt) {
                    int iZza = zzff.zza(str);
                    zzo(iZza);
                    zzk(this.zzgi);
                    zzff.zza(str, this.zzgd);
                    this.zzgi += (long) iZza;
                    return;
                }
                int i = ((int) (this.zzgi - this.zzge)) + iZzt2;
                this.zzgd.position(i);
                zzff.zza(str, this.zzgd);
                int iPosition = this.zzgd.position() - i;
                zzo(iPosition);
                this.zzgi += (long) iPosition;
            } catch (zzfi e) {
                this.zzgi = j;
                zzk(j);
                zza(str, e);
            } catch (IllegalArgumentException e7) {
                throw new zzc(e7);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzc(e10);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i) throws IOException {
            if (i >= 0) {
                zzo(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i) throws IOException {
            if (this.zzgi <= this.zzgh) {
                while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                    long j = this.zzgi;
                    this.zzgi = j + 1;
                    zzfd.zza(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j6 = this.zzgi;
                this.zzgi = 1 + j6;
                zzfd.zza(j6, (byte) i);
                return;
            }
            while (true) {
                long j7 = this.zzgi;
                if (j7 >= this.zzgg) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzgi), Long.valueOf(this.zzgg), 1));
                }
                if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
                    this.zzgi = 1 + j7;
                    zzfd.zza(j7, (byte) i);
                    return;
                } else {
                    this.zzgi = j7 + 1;
                    zzfd.zza(j7, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i) throws IOException {
            this.zzgd.putInt((int) (this.zzgi - this.zzge), i);
            this.zzgi += 4;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, long j) throws IOException {
            zzb(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzbb zzbbVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, long j) throws IOException {
            zzb(i, 1);
            zzd(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j) throws IOException {
            this.zzgd.putLong((int) (this.zzgi - this.zzge), j);
            this.zzgi += 8;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzbb zzbbVar) throws IOException {
            zzb(i, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzdo zzdoVar) throws IOException {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(byte[] bArr, int i, int i4) throws IOException {
            zzo(i4);
            write(bArr, 0, i4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzdo zzdoVar) throws IOException {
            zzb(i, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, boolean z4) throws IOException {
            zzb(i, 0);
            zza(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzb(i, 2);
            zza(zzdoVar, zzefVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j) throws IOException {
            if (this.zzgi <= this.zzgh) {
                while ((j & (-128)) != 0) {
                    long j6 = this.zzgi;
                    this.zzgi = j6 + 1;
                    zzfd.zza(j6, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j7 = this.zzgi;
                this.zzgi = 1 + j7;
                zzfd.zza(j7, (byte) j);
                return;
            }
            while (true) {
                long j9 = this.zzgi;
                if (j9 >= this.zzgg) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.zzgi), Long.valueOf(this.zzgg), 1));
                }
                if ((j & (-128)) == 0) {
                    this.zzgi = 1 + j9;
                    zzfd.zza(j9, (byte) j);
                    return;
                } else {
                    this.zzgi = j9 + 1;
                    zzfd.zza(j9, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, String str) throws IOException {
            zzb(i, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdoVar) throws IOException {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbbVar) throws IOException {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzdo zzdoVar, zzef zzefVar) throws IOException {
            zzas zzasVar = (zzas) zzdoVar;
            int iZzs = zzasVar.zzs();
            if (iZzs == -1) {
                iZzs = zzefVar.zzm(zzasVar);
                zzasVar.zzf(iZzs);
            }
            zzo(iZzs);
            zzefVar.zza(zzdoVar, this.zzfz);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i, int i4) throws IOException {
            write(bArr, i, i4);
        }
    }

    private zzbn() {
    }

    public static int zza(int i, zzcv zzcvVar) {
        int iZzr = zzr(i);
        int iZzas = zzcvVar.zzas();
        return zzt(iZzas) + iZzas + iZzr;
    }

    public static int zzb(double d10) {
        return 8;
    }

    public static int zzc(int i, zzbb zzbbVar) {
        int iZzr = zzr(i);
        int size = zzbbVar.size();
        return zzt(size) + size + iZzr;
    }

    public static int zzd(int i, long j) {
        return zzf(j) + zzr(i);
    }

    public static int zze(int i, long j) {
        return zzf(j) + zzr(i);
    }

    public static int zzf(int i, long j) {
        return zzf(zzj(j)) + zzr(i);
    }

    public static int zzg(int i, int i4) {
        return zzs(i4) + zzr(i);
    }

    public static int zzh(int i, int i4) {
        return zzt(i4) + zzr(i);
    }

    public static int zzi(int i, int i4) {
        return zzt(zzy(i4)) + zzr(i);
    }

    public static int zzj(int i, int i4) {
        return zzr(i) + 4;
    }

    public static int zzk(int i, int i4) {
        return zzr(i) + 4;
    }

    public static int zzl(int i, int i4) {
        return zzs(i4) + zzr(i);
    }

    public static int zzr(int i) {
        return zzt(i << 3);
    }

    public static int zzs(int i) {
        if (i >= 0) {
            return zzt(i);
        }
        return 10;
    }

    public static int zzt(int i) {
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

    public static int zzu(int i) {
        return zzt(zzy(i));
    }

    public static int zzv(int i) {
        return 4;
    }

    public static int zzw(int i) {
        return 4;
    }

    public static int zzx(int i) {
        return zzs(i);
    }

    private static int zzy(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int zzz(int i) {
        return zzt(i);
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr, int i, int i4) throws IOException;

    public abstract void zza(byte b8) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzbb zzbbVar) throws IOException;

    public abstract void zza(int i, zzdo zzdoVar) throws IOException;

    public abstract void zza(int i, zzdo zzdoVar, zzef zzefVar) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(zzbb zzbbVar) throws IOException;

    public abstract void zza(zzdo zzdoVar, zzef zzefVar) throws IOException;

    public abstract int zzag();

    public abstract void zzb(int i, int i4) throws IOException;

    public abstract void zzb(int i, zzbb zzbbVar) throws IOException;

    public abstract void zzb(int i, zzdo zzdoVar) throws IOException;

    public abstract void zzb(int i, boolean z4) throws IOException;

    public abstract void zzb(long j) throws IOException;

    public abstract void zzb(zzdo zzdoVar) throws IOException;

    public abstract void zzc(int i, int i4) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzd(int i, int i4) throws IOException;

    public abstract void zzd(long j) throws IOException;

    public abstract void zzd(byte[] bArr, int i, int i4) throws IOException;

    public abstract void zzf(int i, int i4) throws IOException;

    public abstract void zzg(String str) throws IOException;

    public abstract void zzn(int i) throws IOException;

    public abstract void zzo(int i) throws IOException;

    public final void zzp(int i) throws IOException {
        zzo(zzy(i));
    }

    public abstract void zzq(int i) throws IOException;

    public static int zza(zzcv zzcvVar) {
        int iZzas = zzcvVar.zzas();
        return zzt(iZzas) + iZzas;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzc(int i, zzdo zzdoVar) {
        return zzc(zzdoVar) + zzr(i);
    }

    public static int zzd(int i, zzbb zzbbVar) {
        return zzc(3, zzbbVar) + zzh(2, i) + (zzr(1) << 1);
    }

    public static int zze(long j) {
        return zzf(j);
    }

    public static int zzf(long j) {
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

    public static int zzg(int i, long j) {
        return zzr(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zzr(i) + 8;
    }

    public static int zzi(long j) {
        return 8;
    }

    private static long zzj(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static zzbn zza(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zzb(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return zzfd.zzee() ? new zze(byteBuffer) : new zzd(byteBuffer);
    }

    public static int zzb(int i, double d10) {
        return zzr(i) + 8;
    }

    @Deprecated
    public static int zzc(int i, zzdo zzdoVar, zzef zzefVar) {
        int iZzr = zzr(i) << 1;
        zzas zzasVar = (zzas) zzdoVar;
        int iZzs = zzasVar.zzs();
        if (iZzs == -1) {
            iZzs = zzefVar.zzm(zzasVar);
            zzasVar.zzf(iZzs);
        }
        return iZzr + iZzs;
    }

    public static int zzd(int i, zzdo zzdoVar) {
        return zzc(3, zzdoVar) + zzh(2, i) + (zzr(1) << 1);
    }

    public static int zzg(long j) {
        return zzf(zzj(j));
    }

    public static int zzh(long j) {
        return 8;
    }

    public final void zze(int i, int i4) throws IOException {
        zzd(i, zzy(i4));
    }

    public static int zzb(int i, float f) {
        return zzr(i) + 4;
    }

    public static int zzc(int i, boolean z4) {
        return zzr(i) + 1;
    }

    @Deprecated
    public static int zzd(zzdo zzdoVar) {
        return zzdoVar.zzas();
    }

    public static int zzh(String str) {
        int length;
        try {
            length = zzff.zza(str);
        } catch (zzfi unused) {
            length = str.getBytes(zzci.UTF_8).length;
        }
        return zzt(length) + length;
    }

    public final void zza(double d10) throws IOException {
        zzd(Double.doubleToRawLongBits(d10));
    }

    public static int zzb(int i, zzcv zzcvVar) {
        return zza(3, zzcvVar) + zzh(2, i) + (zzr(1) << 1);
    }

    public static int zzc(zzdo zzdoVar) {
        int iZzas = zzdoVar.zzas();
        return zzt(iZzas) + iZzas;
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        return zzt(length) + length;
    }

    public final void zza(float f) throws IOException {
        zzq(Float.floatToRawIntBits(f));
    }

    public static int zzb(int i, zzdo zzdoVar, zzef zzefVar) {
        return zzb(zzdoVar, zzefVar) + zzr(i);
    }

    public static zzbn zzc(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public final void zza(int i, double d10) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d10));
    }

    public static int zzb(int i, String str) {
        return zzh(str) + zzr(i);
    }

    public final void zza(int i, float f) throws IOException {
        zzf(i, Float.floatToRawIntBits(f));
    }

    public final void zzc(long j) throws IOException {
        zzb(zzj(j));
    }

    public static int zzb(zzbb zzbbVar) {
        int size = zzbbVar.size();
        return zzt(size) + size;
    }

    public final void zza(String str, zzfi zzfiVar) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzfiVar);
        byte[] bytes = str.getBytes(zzci.UTF_8);
        try {
            zzo(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzc e) {
            throw e;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzc(e7);
        }
    }

    public static int zzb(zzdo zzdoVar, zzef zzefVar) {
        zzas zzasVar = (zzas) zzdoVar;
        int iZzs = zzasVar.zzs();
        if (iZzs == -1) {
            iZzs = zzefVar.zzm(zzasVar);
            zzasVar.zzf(iZzs);
        }
        return zzt(iZzs) + iZzs;
    }

    public final void zza(boolean z4) throws IOException {
        zza(z4 ? (byte) 1 : (byte) 0);
    }

    public static int zzb(boolean z4) {
        return 1;
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, zzj(j));
    }
}
