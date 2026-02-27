package com.google.android.gms.internal.vision;

import androidx.work.WorkInfo;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzih extends zzif {
    private final byte[] zzd;
    private final boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzih(byte[] bArr, int i, int i4, boolean z4) {
        super();
        this.zzk = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zzf = i4 + i;
        this.zzh = i;
        this.zzi = i;
        this.zze = z4;
    }

    private final byte zzaa() throws IOException {
        int i = this.zzh;
        if (i == this.zzf) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 1;
        return bArr[i];
    }

    private final int zzv() throws IOException {
        int i;
        int i4 = this.zzh;
        int i6 = this.zzf;
        if (i6 != i4) {
            byte[] bArr = this.zzd;
            int i10 = i4 + 1;
            byte b8 = bArr[i4];
            if (b8 >= 0) {
                this.zzh = i10;
                return b8;
            }
            if (i6 - i10 >= 9) {
                int i11 = i4 + 2;
                int i12 = (bArr[i10] << 7) ^ b8;
                if (i12 < 0) {
                    i = i12 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i13 = i4 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i = i14 ^ 16256;
                    } else {
                        int i15 = i4 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i = (-2080896) ^ i16;
                        } else {
                            i13 = i4 + 5;
                            byte b10 = bArr[i15];
                            int i17 = (i16 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i15 = i4 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i4 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i4 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i4 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i4 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i17;
                            }
                            i = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.zzh = i11;
                return i;
            }
        }
        return (int) zzs();
    }

    private final long zzw() throws IOException {
        long j;
        long j6;
        long j7;
        long j9;
        int i = this.zzh;
        int i4 = this.zzf;
        if (i4 != i) {
            byte[] bArr = this.zzd;
            int i6 = i + 1;
            byte b8 = bArr[i];
            if (b8 >= 0) {
                this.zzh = i6;
                return b8;
            }
            if (i4 - i6 >= 9) {
                int i10 = i + 2;
                int i11 = (bArr[i6] << 7) ^ b8;
                if (i11 < 0) {
                    j = i11 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i12 = i + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j9 = (-2080896) ^ i15;
                        } else {
                            long j10 = i15;
                            i10 = i + 5;
                            long j11 = j10 ^ (((long) bArr[i14]) << 28);
                            if (j11 >= 0) {
                                j7 = 266354560;
                            } else {
                                i14 = i + 6;
                                long j12 = j11 ^ (((long) bArr[i10]) << 35);
                                if (j12 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i10 = i + 7;
                                    j11 = j12 ^ (((long) bArr[i14]) << 42);
                                    if (j11 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i14 = i + 8;
                                        j12 = j11 ^ (((long) bArr[i10]) << 49);
                                        if (j12 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j13 = (j12 ^ (((long) bArr[i14]) << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                int i16 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j = j13;
                                        }
                                    }
                                }
                                j9 = j6 ^ j12;
                            }
                            j = j7 ^ j11;
                        }
                        i10 = i14;
                        j = j9;
                    }
                }
                this.zzh = i10;
                return j;
            }
        }
        return zzs();
    }

    private final int zzx() throws IOException {
        int i = this.zzh;
        if (this.zzf - i < 4) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzy() throws IOException {
        int i = this.zzh;
        if (this.zzf - i < 8) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzd;
        this.zzh = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private final void zzz() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i4 = i - this.zzi;
        int i6 = this.zzk;
        if (i4 <= i6) {
            this.zzg = 0;
            return;
        }
        int i10 = i4 - i6;
        this.zzg = i10;
        this.zzf = i - i10;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zza() throws IOException {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int iZzv = zzv();
        this.zzj = iZzv;
        if ((iZzv >>> 3) != 0) {
            return iZzv;
        }
        throw zzjk.zzd();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final boolean zzb(int i) throws IOException {
        int iZza;
        int i4 = i & 7;
        int i6 = 0;
        if (i4 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i6 < 10) {
                    if (zzaa() < 0) {
                        i6++;
                    }
                }
                throw zzjk.zzc();
            }
            while (i6 < 10) {
                byte[] bArr = this.zzd;
                int i10 = this.zzh;
                this.zzh = i10 + 1;
                if (bArr[i10] < 0) {
                    i6++;
                }
            }
            throw zzjk.zzc();
            return true;
        }
        if (i4 == 1) {
            zzf(8);
            return true;
        }
        if (i4 == 2) {
            zzf(zzv());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw zzjk.zzf();
            }
            zzf(4);
            return true;
        }
        do {
            iZza = zza();
            if (iZza == 0) {
                break;
            }
        } while (zzb(iZza));
        zza(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzd() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zze() throws IOException {
        return zzw();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzg() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzh() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final boolean zzi() throws IOException {
        return zzw() != 0;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final String zzj() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i = this.zzf;
            int i4 = this.zzh;
            if (iZzv <= i - i4) {
                String str = new String(this.zzd, i4, iZzv, zzjf.zza);
                this.zzh += iZzv;
                return str;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv < 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final String zzk() throws IOException {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i = this.zzf;
            int i4 = this.zzh;
            if (iZzv <= i - i4) {
                String strZzb = zzmd.zzb(this.zzd, i4, iZzv);
                this.zzh += iZzv;
                return strZzb;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv <= 0) {
            throw zzjk.zzb();
        }
        throw zzjk.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.vision.zzif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.vision.zzht zzl() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.zzv()
            if (r0 <= 0) goto L19
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.zzd
            com.google.android.gms.internal.vision.zzht r1 = com.google.android.gms.internal.vision.zzht.zza(r1, r2, r0)
            int r2 = r3.zzh
            int r2 = r2 + r0
            r3.zzh = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.vision.zzht r0 = com.google.android.gms.internal.vision.zzht.zza
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.zzh = r0
            byte[] r1 = r3.zzd
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.vision.zzjf.zzb
        L37:
            com.google.android.gms.internal.vision.zzht r0 = com.google.android.gms.internal.vision.zzht.zza(r0)
            return r0
        L3c:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzb()
            throw r0
        L41:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zza()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzih.zzl():com.google.android.gms.internal.vision.zzht");
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzm() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzn() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzo() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzp() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzq() throws IOException {
        return zzif.zze(zzv());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzr() throws IOException {
        return zzif.zza(zzw());
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final long zzs() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZzaa = zzaa();
            j |= ((long) (bZzaa & 127)) << i;
            if ((bZzaa & 128) == 0) {
                return j;
            }
        }
        throw zzjk.zzc();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final boolean zzt() throws IOException {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzu() {
        return this.zzh - this.zzi;
    }

    private final void zzf(int i) throws IOException {
        if (i >= 0) {
            int i4 = this.zzf;
            int i6 = this.zzh;
            if (i <= i4 - i6) {
                this.zzh = i6 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzjk.zza();
        }
        throw zzjk.zzb();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final int zzc(int i) throws zzjk {
        if (i < 0) {
            throw zzjk.zzb();
        }
        int iZzu = i + zzu();
        int i4 = this.zzk;
        if (iZzu > i4) {
            throw zzjk.zza();
        }
        this.zzk = iZzu;
        zzz();
        return i4;
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final void zzd(int i) {
        this.zzk = i;
        zzz();
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final void zza(int i) throws zzjk {
        if (this.zzj != i) {
            throw zzjk.zze();
        }
    }

    @Override // com.google.android.gms.internal.vision.zzif
    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzy());
    }
}
