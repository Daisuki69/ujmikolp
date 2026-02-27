package com.google.android.gms.internal.ads;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class zzhhf extends zzhhg {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzg;
    private final long zzh;
    private long zzi;
    private long zzj;
    private final long zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    public /* synthetic */ zzhhf(ByteBuffer byteBuffer, boolean z4, byte[] bArr) {
        super(null);
        this.zzn = Integer.MAX_VALUE;
        this.zzg = byteBuffer.duplicate();
        long jZzs = zzhlc.zzs(byteBuffer);
        this.zzh = jZzs;
        this.zzi = ((long) byteBuffer.limit()) + jZzs;
        long jPosition = jZzs + ((long) byteBuffer.position());
        this.zzj = jPosition;
        this.zzk = jPosition;
    }

    private final void zzN() {
        long j = this.zzi + ((long) this.zzl);
        this.zzi = j;
        int i = (int) (j - this.zzk);
        int i4 = this.zzn;
        if (i <= i4) {
            this.zzl = 0;
            return;
        }
        int i6 = i - i4;
        this.zzl = i6;
        this.zzi = j - ((long) i6);
    }

    private final int zzO() {
        return (int) (this.zzi - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzA(int i) {
        this.zzn = i;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzB() throws IOException {
        return this.zzj == this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzC() {
        return (int) (this.zzj - this.zzk);
    }

    public final byte zzD() throws IOException {
        long j = this.zzj;
        if (j == this.zzi) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 1 + j;
        return zzhlc.zzr(j);
    }

    public final void zzE(int i) throws IOException {
        if (i >= 0 && i <= zzO()) {
            this.zzj += (long) i;
        } else {
            if (i >= 0) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzm = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzm = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzhiw("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzb(int i) throws zzhiw {
        if (this.zzm != i) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzc(int i) throws IOException {
        int i4 = i & 7;
        int i6 = 0;
        if (i4 == 0) {
            if (zzO() < 10) {
                while (i6 < 10) {
                    if (zzD() < 0) {
                        i6++;
                    }
                }
                throw new zzhiw("CodedInputStream encountered a malformed varint.");
            }
            while (i6 < 10) {
                long j = this.zzj;
                this.zzj = 1 + j;
                if (zzhlc.zzr(j) < 0) {
                    i6++;
                }
            }
            throw new zzhiw("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i4 == 1) {
            zzE(8);
            return true;
        }
        if (i4 == 2) {
            zzE(zzu());
            return true;
        }
        if (i4 == 3) {
            zzJ();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i4 == 4) {
            zzI();
            return false;
        }
        if (i4 != 5) {
            throw new zzhiv("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzk() throws IOException {
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu <= 0 || iZzu > zzO()) {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzu];
        long j = iZzu;
        zzhlc.zzq(this.zzj, bArr, 0L, j);
        String str = new String(bArr, zzhiu.zza);
        this.zzj += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0 && iZzu <= zzO()) {
            String strZze = zzhlh.zze(this.zzg, (int) (this.zzj - this.zzh), iZzu);
            this.zzj += (long) iZzu;
            return strZze;
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final zzhhb zzn() throws IOException {
        int iZzu = zzu();
        if (iZzu <= 0 || iZzu > zzO()) {
            if (iZzu == 0) {
                return zzhhb.zzb;
            }
            if (iZzu < 0) {
                throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzu];
        long j = iZzu;
        zzhlc.zzq(this.zzj, bArr, 0L, j);
        this.zzj += j;
        zzhhb zzhhbVar = zzhhb.zzb;
        return new zzhgz(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzs() throws IOException {
        return zzhhg.zzK(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final long zzt() throws IOException {
        return zzhhg.zzL(zzv());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhlc.zzr(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzu() throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.zzj
            long r2 = r9.zzi
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L92
        La:
            r2 = 1
            long r2 = r2 + r0
            byte r4 = com.google.android.gms.internal.ads.zzhlc.zzr(r0)
            if (r4 < 0) goto L16
            r9.zzj = r2
            return r4
        L16:
            long r5 = r9.zzi
            long r5 = r5 - r2
            r7 = 9
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L92
            r5 = 2
            long r5 = r5 + r0
            byte r2 = com.google.android.gms.internal.ads.zzhlc.zzr(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r4
            if (r2 >= 0) goto L2e
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L8f
        L2e:
            r3 = 3
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhlc.zzr(r5)
            int r5 = r5 << 14
            r2 = r2 ^ r5
            if (r2 < 0) goto L3e
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L3c:
            r5 = r3
            goto L8f
        L3e:
            r5 = 4
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhlc.zzr(r3)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L4f
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L8f
        L4f:
            r3 = 5
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhlc.zzr(r5)
            int r6 = r5 << 28
            r2 = r2 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r6
            if (r5 >= 0) goto L8d
            r5 = 6
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhlc.zzr(r3)
            if (r3 >= 0) goto L8b
            r3 = 7
            long r3 = r3 + r0
            byte r5 = com.google.android.gms.internal.ads.zzhlc.zzr(r5)
            if (r5 >= 0) goto L8d
            r5 = 8
            long r5 = r5 + r0
            byte r3 = com.google.android.gms.internal.ads.zzhlc.zzr(r3)
            if (r3 >= 0) goto L8b
            long r3 = r0 + r7
            byte r5 = com.google.android.gms.internal.ads.zzhlc.zzr(r5)
            if (r5 >= 0) goto L8d
            r5 = 10
            long r5 = r5 + r0
            byte r0 = com.google.android.gms.internal.ads.zzhlc.zzr(r3)
            if (r0 < 0) goto L92
        L8b:
            r0 = r2
            goto L8f
        L8d:
            r0 = r2
            goto L3c
        L8f:
            r9.zzj = r5
            return r0
        L92:
            long r0 = r9.zzw()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhhf.zzu():int");
    }

    public final long zzv() throws IOException {
        long j;
        long j6;
        int i;
        long j7 = this.zzj;
        if (this.zzi != j7) {
            long j9 = 1 + j7;
            byte bZzr = zzhlc.zzr(j7);
            if (bZzr >= 0) {
                this.zzj = j9;
                return bZzr;
            }
            if (this.zzi - j9 >= 9) {
                long j10 = 2 + j7;
                int iZzr = (zzhlc.zzr(j9) << 7) ^ bZzr;
                if (iZzr >= 0) {
                    long j11 = 3 + j7;
                    int iZzr2 = iZzr ^ (zzhlc.zzr(j10) << 14);
                    if (iZzr2 >= 0) {
                        j = iZzr2 ^ 16256;
                    } else {
                        j10 = 4 + j7;
                        int iZzr3 = iZzr2 ^ (zzhlc.zzr(j11) << 21);
                        if (iZzr3 < 0) {
                            i = (-2080896) ^ iZzr3;
                        } else {
                            j11 = 5 + j7;
                            long jZzr = (((long) zzhlc.zzr(j10)) << 28) ^ ((long) iZzr3);
                            if (jZzr < 0) {
                                long j12 = 6 + j7;
                                long jZzr2 = (((long) zzhlc.zzr(j11)) << 35) ^ jZzr;
                                if (jZzr2 >= 0) {
                                    long j13 = 7 + j7;
                                    long jZzr3 = jZzr2 ^ (((long) zzhlc.zzr(j12)) << 42);
                                    if (jZzr3 >= 0) {
                                        j = 4363953127296L ^ jZzr3;
                                        j10 = j13;
                                    } else {
                                        j12 = 8 + j7;
                                        jZzr2 = jZzr3 ^ (((long) zzhlc.zzr(j13)) << 49);
                                        if (jZzr2 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            j10 = j7 + 9;
                                            long jZzr4 = (jZzr2 ^ (((long) zzhlc.zzr(j12)) << 56)) ^ 71499008037633920L;
                                            if (jZzr4 < 0) {
                                                long j14 = j7 + 10;
                                                if (zzhlc.zzr(j10) >= 0) {
                                                    j10 = j14;
                                                }
                                            }
                                            j = jZzr4;
                                        }
                                    }
                                    this.zzj = j10;
                                    return j;
                                }
                                j6 = -34093383808L;
                                j = j6 ^ jZzr2;
                                j10 = j12;
                                this.zzj = j10;
                                return j;
                            }
                            j = 266354560 ^ jZzr;
                        }
                    }
                    j10 = j11;
                    this.zzj = j10;
                    return j;
                }
                i = iZzr ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                j = i;
                this.zzj = j10;
                return j;
            }
        }
        return zzw();
    }

    public final long zzw() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZzD = zzD();
            j |= ((long) (bZzD & 127)) << i;
            if ((bZzD & 128) == 0) {
                return j;
            }
        }
        throw new zzhiw("CodedInputStream encountered a malformed varint.");
    }

    public final int zzx() throws IOException {
        long j = this.zzj;
        if (this.zzi - j < 4) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 4 + j;
        int iZzr = zzhlc.zzr(j) & 255;
        int iZzr2 = zzhlc.zzr(1 + j) & 255;
        int iZzr3 = zzhlc.zzr(2 + j) & 255;
        return ((zzhlc.zzr(j + 3) & 255) << 24) | (iZzr2 << 8) | iZzr | (iZzr3 << 16);
    }

    public final long zzy() throws IOException {
        long j = this.zzj;
        if (this.zzi - j < 8) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = 8 + j;
        long jZzr = zzhlc.zzr(j);
        long jZzr2 = zzhlc.zzr(1 + j);
        long jZzr3 = zzhlc.zzr(2 + j);
        long jZzr4 = zzhlc.zzr(3 + j);
        long jZzr5 = zzhlc.zzr(4 + j);
        return ((((long) zzhlc.zzr(j + 7)) & 255) << 56) | (jZzr & 255) | ((jZzr2 & 255) << 8) | ((jZzr3 & 255) << 16) | ((jZzr4 & 255) << 24) | ((jZzr5 & 255) << 32) | ((zzhlc.zzr(5 + j) & 255) << 40) | ((((long) zzhlc.zzr(6 + j)) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzz(int i) throws zzhiw {
        if (i < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzC = i + zzC();
        int i4 = this.zzn;
        if (iZzC > i4) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzn = iZzC;
        zzN();
        return i4;
    }
}
