package com.google.android.gms.internal.ads;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzhhd extends zzhhg {
    private final Iterable zza;
    private final Iterator zzg;
    private ByteBuffer zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;

    public /* synthetic */ zzhhd(Iterable iterable, int i, boolean z4, byte[] bArr) {
        super(null);
        this.zzk = Integer.MAX_VALUE;
        this.zzi = i;
        this.zza = iterable;
        this.zzg = iterable.iterator();
        this.zzm = 0;
        if (i != 0) {
            zzO();
            return;
        }
        this.zzh = zzhiu.zzc;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = 0L;
    }

    private final void zzN() throws zzhiw {
        if (!this.zzg.hasNext()) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzO();
    }

    private final void zzO() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzg.next();
        this.zzh = byteBuffer;
        this.zzm += (int) (this.zzn - this.zzo);
        long jPosition = byteBuffer.position();
        this.zzn = jPosition;
        this.zzo = jPosition;
        this.zzp = this.zzh.limit();
        long jZzs = zzhlc.zzs(this.zzh);
        this.zzn += jZzs;
        this.zzo += jZzs;
        this.zzp += jZzs;
    }

    private final void zzP() {
        int i = this.zzi + this.zzj;
        this.zzi = i;
        int i4 = this.zzk;
        if (i <= i4) {
            this.zzj = 0;
            return;
        }
        int i6 = i - i4;
        this.zzj = i6;
        this.zzi = i - i6;
    }

    private final void zzQ(byte[] bArr, int i, int i4) throws IOException {
        if (i4 > zzR()) {
            if (i4 > 0) {
                throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i6 = i4;
        while (i6 > 0) {
            if (this.zzp - this.zzn == 0) {
                zzN();
            }
            int iMin = Math.min(i6, (int) (this.zzp - this.zzn));
            long j = iMin;
            zzhlc.zzq(this.zzn, bArr, i4 - i6, j);
            i6 -= iMin;
            this.zzn += j;
        }
    }

    private final int zzR() {
        return (int) ((((long) (this.zzi - this.zzm)) - this.zzn) + this.zzo);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzA(int i) {
        this.zzk = i;
        zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzB() throws IOException {
        return (((long) this.zzm) + this.zzn) - this.zzo == ((long) this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzC() {
        return (int) ((((long) this.zzm) + this.zzn) - this.zzo);
    }

    public final byte zzD() throws IOException {
        if (this.zzp - this.zzn == 0) {
            zzN();
        }
        long j = this.zzn;
        this.zzn = 1 + j;
        return zzhlc.zzr(j);
    }

    public final void zzE(int i) throws IOException {
        if (i >= 0) {
            if (i <= (((long) (this.zzi - this.zzm)) - this.zzn) + this.zzo) {
                while (i > 0) {
                    if (this.zzp - this.zzn == 0) {
                        zzN();
                    }
                    int iMin = Math.min(i, (int) (this.zzp - this.zzn));
                    i -= iMin;
                    this.zzn += (long) iMin;
                }
                return;
            }
        }
        if (i >= 0) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzl = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzl = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzhiw("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final void zzb(int i) throws zzhiw {
        if (this.zzl != i) {
            throw new zzhiw("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final boolean zzc(int i) throws IOException {
        int i4 = i & 7;
        if (i4 == 0) {
            for (int i6 = 0; i6 < 10; i6++) {
                if (zzD() >= 0) {
                    return true;
                }
            }
            throw new zzhiw("CodedInputStream encountered a malformed varint.");
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
        if (iZzu > 0) {
            long j = this.zzp;
            long j6 = this.zzn;
            long j7 = iZzu;
            if (j7 <= j - j6) {
                byte[] bArr = new byte[iZzu];
                zzhlc.zzq(j6, bArr, 0L, j7);
                String str = new String(bArr, zzhiu.zza);
                this.zzn += j7;
                return str;
            }
        }
        if (iZzu > 0 && iZzu <= zzR()) {
            byte[] bArr2 = new byte[iZzu];
            zzQ(bArr2, 0, iZzu);
            return new String(bArr2, zzhiu.zza);
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final String zzm() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            long j = this.zzp;
            long j6 = this.zzn;
            long j7 = iZzu;
            if (j7 <= j - j6) {
                String strZze = zzhlh.zze(this.zzh, (int) (j6 - this.zzo), iZzu);
                this.zzn += j7;
                return strZze;
            }
        }
        if (iZzu >= 0 && iZzu <= zzR()) {
            byte[] bArr = new byte[iZzu];
            zzQ(bArr, 0, iZzu);
            return zzhlh.zzf(bArr, 0, iZzu);
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
        if (iZzu > 0) {
            long j = this.zzp;
            long j6 = this.zzn;
            long j7 = iZzu;
            if (j7 <= j - j6) {
                byte[] bArr = new byte[iZzu];
                zzhlc.zzq(j6, bArr, 0L, j7);
                this.zzn += j7;
                zzhhb zzhhbVar = zzhhb.zzb;
                return new zzhgz(bArr);
            }
        }
        if (iZzu > 0 && iZzu <= zzR()) {
            byte[] bArr2 = new byte[iZzu];
            zzQ(bArr2, 0, iZzu);
            zzhhb zzhhbVar2 = zzhhb.zzb;
            return new zzhgz(bArr2);
        }
        if (iZzu == 0) {
            return zzhhb.zzb;
        }
        if (iZzu < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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

    public final int zzu() throws IOException {
        int i;
        long j = this.zzn;
        if (this.zzp != j) {
            long j6 = j + 1;
            byte bZzr = zzhlc.zzr(j);
            if (bZzr >= 0) {
                this.zzn++;
                return bZzr;
            }
            if (this.zzp - this.zzn >= 10) {
                long j7 = 2 + j;
                int iZzr = (zzhlc.zzr(j6) << 7) ^ bZzr;
                if (iZzr < 0) {
                    i = iZzr ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    long j9 = 3 + j;
                    int iZzr2 = (zzhlc.zzr(j7) << 14) ^ iZzr;
                    if (iZzr2 >= 0) {
                        i = iZzr2 ^ 16256;
                    } else {
                        long j10 = 4 + j;
                        int iZzr3 = iZzr2 ^ (zzhlc.zzr(j9) << 21);
                        if (iZzr3 < 0) {
                            i = (-2080896) ^ iZzr3;
                        } else {
                            j9 = 5 + j;
                            byte bZzr2 = zzhlc.zzr(j10);
                            int i4 = (iZzr3 ^ (bZzr2 << 28)) ^ 266354560;
                            if (bZzr2 < 0) {
                                j10 = 6 + j;
                                if (zzhlc.zzr(j9) < 0) {
                                    j9 = 7 + j;
                                    if (zzhlc.zzr(j10) < 0) {
                                        j10 = 8 + j;
                                        if (zzhlc.zzr(j9) < 0) {
                                            j9 = 9 + j;
                                            if (zzhlc.zzr(j10) < 0) {
                                                long j11 = j + 10;
                                                if (zzhlc.zzr(j9) >= 0) {
                                                    i = i4;
                                                    j7 = j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i4;
                            }
                            i = i4;
                        }
                        j7 = j10;
                    }
                    j7 = j9;
                }
                this.zzn = j7;
                return i;
            }
        }
        return (int) zzw();
    }

    public final long zzv() throws IOException {
        long j;
        long j6;
        long j7 = this.zzn;
        if (this.zzp != j7) {
            long j9 = j7 + 1;
            byte bZzr = zzhlc.zzr(j7);
            if (bZzr >= 0) {
                this.zzn++;
                return bZzr;
            }
            if (this.zzp - this.zzn >= 10) {
                long j10 = 2 + j7;
                int iZzr = (zzhlc.zzr(j9) << 7) ^ bZzr;
                if (iZzr < 0) {
                    j = iZzr ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    long j11 = 3 + j7;
                    int iZzr2 = (zzhlc.zzr(j10) << 14) ^ iZzr;
                    if (iZzr2 >= 0) {
                        j = iZzr2 ^ 16256;
                    } else {
                        long j12 = 4 + j7;
                        int iZzr3 = iZzr2 ^ (zzhlc.zzr(j11) << 21);
                        if (iZzr3 < 0) {
                            j = (-2080896) ^ iZzr3;
                            j10 = j12;
                        } else {
                            j11 = 5 + j7;
                            long jZzr = (((long) zzhlc.zzr(j12)) << 28) ^ ((long) iZzr3);
                            if (jZzr >= 0) {
                                j = 266354560 ^ jZzr;
                            } else {
                                long j13 = 6 + j7;
                                long jZzr2 = jZzr ^ (((long) zzhlc.zzr(j11)) << 35);
                                if (jZzr2 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    long j14 = 7 + j7;
                                    long jZzr3 = jZzr2 ^ (((long) zzhlc.zzr(j13)) << 42);
                                    if (jZzr3 >= 0) {
                                        j = 4363953127296L ^ jZzr3;
                                    } else {
                                        j13 = 8 + j7;
                                        jZzr2 = jZzr3 ^ (((long) zzhlc.zzr(j14)) << 49);
                                        if (jZzr2 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            j14 = 9 + j7;
                                            long jZzr4 = (jZzr2 ^ (((long) zzhlc.zzr(j13)) << 56)) ^ 71499008037633920L;
                                            if (jZzr4 < 0) {
                                                long j15 = j7 + 10;
                                                if (zzhlc.zzr(j14) >= 0) {
                                                    j10 = j15;
                                                    j = jZzr4;
                                                }
                                            } else {
                                                j = jZzr4;
                                            }
                                        }
                                    }
                                    j10 = j14;
                                }
                                j = j6 ^ jZzr2;
                                j10 = j13;
                            }
                        }
                    }
                    j10 = j11;
                }
                this.zzn = j10;
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
        long j = this.zzp;
        long j6 = this.zzn;
        if (j - j6 < 4) {
            int iZzD = zzD() & 255;
            int iZzD2 = (zzD() & 255) << 8;
            return iZzD | iZzD2 | ((zzD() & 255) << 16) | ((zzD() & 255) << 24);
        }
        this.zzn = 4 + j6;
        int iZzr = zzhlc.zzr(j6) & 255;
        int iZzr2 = (zzhlc.zzr(1 + j6) & 255) << 8;
        return iZzr | iZzr2 | ((zzhlc.zzr(2 + j6) & 255) << 16) | ((zzhlc.zzr(j6 + 3) & 255) << 24);
    }

    public final long zzy() throws IOException {
        long j = this.zzp;
        long j6 = this.zzn;
        if (j - j6 < 8) {
            long jZzD = ((long) zzD()) & 255;
            long jZzD2 = (((long) zzD()) & 255) << 8;
            long jZzD3 = (((long) zzD()) & 255) << 16;
            long jZzD4 = (((long) zzD()) & 255) << 24;
            long jZzD5 = (((long) zzD()) & 255) << 32;
            long jZzD6 = (((long) zzD()) & 255) << 40;
            return ((((long) zzD()) & 255) << 56) | jZzD | jZzD2 | jZzD3 | jZzD4 | jZzD5 | jZzD6 | ((((long) zzD()) & 255) << 48);
        }
        this.zzn = 8 + j6;
        long jZzr = ((long) zzhlc.zzr(j6)) & 255;
        long jZzr2 = (((long) zzhlc.zzr(1 + j6)) & 255) << 8;
        long jZzr3 = (((long) zzhlc.zzr(j6 + 2)) & 255) << 16;
        long jZzr4 = (((long) zzhlc.zzr(3 + j6)) & 255) << 24;
        long jZzr5 = (((long) zzhlc.zzr(j6 + 4)) & 255) << 32;
        long jZzr6 = (((long) zzhlc.zzr(j6 + 5)) & 255) << 40;
        return jZzr | jZzr2 | jZzr3 | jZzr4 | jZzr5 | jZzr6 | ((((long) zzhlc.zzr(j6 + 6)) & 255) << 48) | ((((long) zzhlc.zzr(j6 + 7)) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzhhg
    public final int zzz(int i) throws zzhiw {
        if (i < 0) {
            throw new zzhiw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzC = i + zzC();
        int i4 = this.zzk;
        if (iZzC > i4) {
            throw new zzhiw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = iZzC;
        zzP();
        return i4;
    }
}
