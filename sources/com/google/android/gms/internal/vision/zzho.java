package com.google.android.gms.internal.vision;

import androidx.work.WorkInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzho extends zzhm {
    private final boolean zza;
    private final byte[] zzb;
    private int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public zzho(ByteBuffer byteBuffer, boolean z4) {
        super(null);
        this.zza = true;
        this.zzb = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        this.zzc = iPosition;
        this.zzd = iPosition;
        this.zze = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    private final long zzaa() throws IOException {
        zzb(8);
        return zzac();
    }

    private final int zzab() {
        int i = this.zzc;
        byte[] bArr = this.zzb;
        this.zzc = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzac() {
        int i = this.zzc;
        byte[] bArr = this.zzb;
        this.zzc = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private final boolean zzu() {
        return this.zzc == this.zze;
    }

    private final int zzv() throws IOException {
        int i;
        int i4 = this.zzc;
        int i6 = this.zze;
        if (i6 == i4) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzb;
        int i10 = i4 + 1;
        byte b8 = bArr[i4];
        if (b8 >= 0) {
            this.zzc = i10;
            return b8;
        }
        if (i6 - i10 < 9) {
            return (int) zzx();
        }
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
                                        if (bArr[i13] < 0) {
                                            throw zzjk.zzc();
                                        }
                                        i11 = i18;
                                        i = i17;
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
        this.zzc = i11;
        return i;
    }

    private final long zzw() throws IOException {
        long j;
        long j6;
        long j7;
        long j9;
        int i = this.zzc;
        int i4 = this.zze;
        if (i4 == i) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzb;
        int i6 = i + 1;
        byte b8 = bArr[i];
        if (b8 >= 0) {
            this.zzc = i6;
            return b8;
        }
        if (i4 - i6 < 9) {
            return zzx();
        }
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
                                        if (bArr[i10] < 0) {
                                            throw zzjk.zzc();
                                        }
                                        i10 = i16;
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
        this.zzc = i10;
        return j;
    }

    private final long zzx() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bZzy = zzy();
            j |= ((long) (bZzy & 127)) << i;
            if ((bZzy & 128) == 0) {
                return j;
            }
        }
        throw zzjk.zzc();
    }

    private final byte zzy() throws IOException {
        int i = this.zzc;
        if (i == this.zze) {
            throw zzjk.zza();
        }
        byte[] bArr = this.zzb;
        this.zzc = i + 1;
        return bArr[i];
    }

    private final int zzz() throws IOException {
        zzb(4);
        return zzab();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zza() throws IOException {
        if (zzu()) {
            return Integer.MAX_VALUE;
        }
        int iZzv = zzv();
        this.zzf = iZzv;
        if (iZzv == this.zzg) {
            return Integer.MAX_VALUE;
        }
        return iZzv >>> 3;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzb() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    @Override // com.google.android.gms.internal.vision.zzld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc() throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.zzu()
            r1 = 0
            if (r0 != 0) goto L85
            int r0 = r7.zzf
            int r2 = r7.zzg
            if (r0 != r2) goto Lf
            goto L85
        Lf:
            r3 = r0 & 7
            r4 = 1
            if (r3 == 0) goto L59
            if (r3 == r4) goto L53
            r1 = 2
            if (r3 == r1) goto L4b
            r1 = 4
            r5 = 3
            if (r3 == r5) goto L29
            r0 = 5
            if (r3 != r0) goto L24
            r7.zza(r1)
            return r4
        L24:
            com.google.android.gms.internal.vision.zzjn r0 = com.google.android.gms.internal.vision.zzjk.zzf()
            throw r0
        L29:
            int r0 = r0 >>> r5
            int r0 = r0 << r5
            r0 = r0 | r1
            r7.zzg = r0
        L2e:
            int r0 = r7.zza()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L3d
            boolean r0 = r7.zzc()
            if (r0 != 0) goto L2e
        L3d:
            int r0 = r7.zzf
            int r1 = r7.zzg
            if (r0 != r1) goto L46
            r7.zzg = r2
            return r4
        L46:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzg()
            throw r0
        L4b:
            int r0 = r7.zzv()
            r7.zza(r0)
            return r4
        L53:
            r0 = 8
            r7.zza(r0)
            return r4
        L59:
            int r0 = r7.zze
            int r2 = r7.zzc
            int r0 = r0 - r2
            r3 = 10
            if (r0 < r3) goto L74
            byte[] r0 = r7.zzb
            r5 = r1
        L65:
            if (r5 >= r3) goto L74
            int r6 = r2 + 1
            r2 = r0[r2]
            if (r2 < 0) goto L70
            r7.zzc = r6
            goto L7f
        L70:
            int r5 = r5 + 1
            r2 = r6
            goto L65
        L74:
            if (r1 >= r3) goto L80
            byte r0 = r7.zzy()
            if (r0 >= 0) goto L7f
            int r1 = r1 + 1
            goto L74
        L7f:
            return r4
        L80:
            com.google.android.gms.internal.vision.zzjk r0 = com.google.android.gms.internal.vision.zzjk.zzc()
            throw r0
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzho.zzc():boolean");
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final double zzd() throws IOException {
        zzc(1);
        return Double.longBitsToDouble(zzaa());
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final float zze() throws IOException {
        zzc(5);
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzf() throws IOException {
        zzc(0);
        return zzw();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzg() throws IOException {
        zzc(0);
        return zzw();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzh() throws IOException {
        zzc(0);
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzi() throws IOException {
        zzc(1);
        return zzaa();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzj() throws IOException {
        zzc(5);
        return zzz();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final boolean zzk() throws IOException {
        zzc(0);
        return zzv() != 0;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final String zzl() throws IOException {
        return zza(false);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final String zzm() throws IOException {
        return zza(true);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final zzht zzn() throws IOException {
        zzc(2);
        int iZzv = zzv();
        if (iZzv == 0) {
            return zzht.zza;
        }
        zzb(iZzv);
        zzht zzhtVarZzb = this.zza ? zzht.zzb(this.zzb, this.zzc, iZzv) : zzht.zza(this.zzb, this.zzc, iZzv);
        this.zzc += iZzv;
        return zzhtVarZzb;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzo() throws IOException {
        zzc(0);
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzp() throws IOException {
        zzc(0);
        return zzv();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzq() throws IOException {
        zzc(5);
        return zzz();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzr() throws IOException {
        zzc(1);
        return zzaa();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final int zzs() throws IOException {
        zzc(0);
        return zzif.zze(zzv());
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final long zzt() throws IOException {
        zzc(0);
        return zzif.zza(zzw());
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zzb(Class<T> cls, zzio zzioVar) throws IOException {
        zzc(3);
        return (T) zzd(zzky.zza().zza((Class) cls), zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzl(List<Integer> list) throws IOException {
        int i;
        int i4;
        if (!(list instanceof zzjd)) {
            int i6 = this.zzf & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw zzjk.zzf();
                }
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    list.add(Integer.valueOf(zzv()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zzo()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i10 = this.zzf & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzjk.zzf();
            }
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                zzjdVar.zzc(zzv());
            }
            return;
        }
        do {
            zzjdVar.zzc(zzo());
            if (zzu()) {
                return;
            } else {
                i4 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzm(List<Integer> list) throws IOException {
        int i;
        int i4;
        if (!(list instanceof zzjd)) {
            int i6 = this.zzf & 7;
            if (i6 != 0) {
                if (i6 != 2) {
                    throw zzjk.zzf();
                }
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    list.add(Integer.valueOf(zzv()));
                }
                return;
            }
            do {
                list.add(Integer.valueOf(zzp()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        zzjd zzjdVar = (zzjd) list;
        int i10 = this.zzf & 7;
        if (i10 != 0) {
            if (i10 != 2) {
                throw zzjk.zzf();
            }
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                zzjdVar.zzc(zzv());
            }
            return;
        }
        do {
            zzjdVar.zzc(zzp());
            if (zzu()) {
                return;
            } else {
                i4 = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i4;
    }

    private final <T> T zzd(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int i = this.zzg;
        this.zzg = ((this.zzf >>> 3) << 3) | 4;
        try {
            T tZza = zzlcVar.zza();
            zzlcVar.zza(tZza, this, zzioVar);
            zzlcVar.zzc(tZza);
            if (this.zzf == this.zzg) {
                return tZza;
            }
            throw zzjk.zzg();
        } finally {
            this.zzg = i;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zze(List<Integer> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            int i6 = this.zzf & 7;
            if (i6 == 0) {
                do {
                    zzjdVar.zzc(zzh());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            if (i6 == 2) {
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    zzjdVar.zzc(zzv());
                }
                zzf(iZzv);
                return;
            }
            throw zzjk.zzf();
        }
        int i10 = this.zzf & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(zzh()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        if (i10 == 2) {
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                list.add(Integer.valueOf(zzv()));
            }
            zzf(iZzv2);
            return;
        }
        throw zzjk.zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzf(List<Long> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i6 = this.zzf & 7;
            if (i6 == 1) {
                do {
                    zzjyVar.zza(zzi());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            if (i6 == 2) {
                int iZzv = zzv();
                zzd(iZzv);
                int i10 = this.zzc + iZzv;
                while (this.zzc < i10) {
                    zzjyVar.zza(zzac());
                }
                return;
            }
            throw zzjk.zzf();
        }
        int i11 = this.zzf & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(zzi()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        if (i11 == 2) {
            int iZzv2 = zzv();
            zzd(iZzv2);
            int i12 = this.zzc + iZzv2;
            while (this.zzc < i12) {
                list.add(Long.valueOf(zzac()));
            }
            return;
        }
        throw zzjk.zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzg(List<Integer> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            int i6 = this.zzf & 7;
            if (i6 == 2) {
                int iZzv = zzv();
                zze(iZzv);
                int i10 = this.zzc + iZzv;
                while (this.zzc < i10) {
                    zzjdVar.zzc(zzab());
                }
                return;
            }
            if (i6 == 5) {
                do {
                    zzjdVar.zzc(zzj());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            throw zzjk.zzf();
        }
        int i11 = this.zzf & 7;
        if (i11 == 2) {
            int iZzv2 = zzv();
            zze(iZzv2);
            int i12 = this.zzc + iZzv2;
            while (this.zzc < i12) {
                list.add(Integer.valueOf(zzab()));
            }
            return;
        }
        if (i11 == 5) {
            do {
                list.add(Integer.valueOf(zzj()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzh(List<Boolean> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzhr) {
            zzhr zzhrVar = (zzhr) list;
            int i6 = this.zzf & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int iZzv = this.zzc + zzv();
                    while (this.zzc < iZzv) {
                        zzhrVar.zza(zzv() != 0);
                    }
                    zzf(iZzv);
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                zzhrVar.zza(zzk());
                if (zzu()) {
                    return;
                } else {
                    i4 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i4;
            return;
        }
        int i10 = this.zzf & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int iZzv2 = this.zzc + zzv();
                while (this.zzc < iZzv2) {
                    list.add(Boolean.valueOf(zzv() != 0));
                }
                zzf(iZzv2);
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Boolean.valueOf(zzk()));
            if (zzu()) {
                return;
            } else {
                i = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzi(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzj(List<String> list) throws IOException {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzk(List<zzht> list) throws IOException {
        int i;
        if ((this.zzf & 7) == 2) {
            do {
                list.add(zzn());
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzo(List<Long> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i6 = this.zzf & 7;
            if (i6 == 1) {
                do {
                    zzjyVar.zza(zzr());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            if (i6 == 2) {
                int iZzv = zzv();
                zzd(iZzv);
                int i10 = this.zzc + iZzv;
                while (this.zzc < i10) {
                    zzjyVar.zza(zzac());
                }
                return;
            }
            throw zzjk.zzf();
        }
        int i11 = this.zzf & 7;
        if (i11 == 1) {
            do {
                list.add(Long.valueOf(zzr()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        if (i11 == 2) {
            int iZzv2 = zzv();
            zzd(iZzv2);
            int i12 = this.zzc + iZzv2;
            while (this.zzc < i12) {
                list.add(Long.valueOf(zzac()));
            }
            return;
        }
        throw zzjk.zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzp(List<Integer> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            int i6 = this.zzf & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int iZzv = this.zzc + zzv();
                    while (this.zzc < iZzv) {
                        zzjdVar.zzc(zzif.zze(zzv()));
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                zzjdVar.zzc(zzs());
                if (zzu()) {
                    return;
                } else {
                    i4 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i4;
            return;
        }
        int i10 = this.zzf & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int iZzv2 = this.zzc + zzv();
                while (this.zzc < iZzv2) {
                    list.add(Integer.valueOf(zzif.zze(zzv())));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Integer.valueOf(zzs()));
            if (zzu()) {
                return;
            } else {
                i = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzq(List<Long> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i6 = this.zzf & 7;
            if (i6 != 0) {
                if (i6 == 2) {
                    int iZzv = this.zzc + zzv();
                    while (this.zzc < iZzv) {
                        zzjyVar.zza(zzif.zza(zzw()));
                    }
                    return;
                }
                throw zzjk.zzf();
            }
            do {
                zzjyVar.zza(zzt());
                if (zzu()) {
                    return;
                } else {
                    i4 = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i4;
            return;
        }
        int i10 = this.zzf & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int iZzv2 = this.zzc + zzv();
                while (this.zzc < iZzv2) {
                    list.add(Long.valueOf(zzif.zza(zzw())));
                }
                return;
            }
            throw zzjk.zzf();
        }
        do {
            list.add(Long.valueOf(zzt()));
            if (zzu()) {
                return;
            } else {
                i = this.zzc;
            }
        } while (zzv() == this.zzf);
        this.zzc = i;
    }

    private final String zza(boolean z4) throws IOException {
        zzc(2);
        int iZzv = zzv();
        if (iZzv == 0) {
            return "";
        }
        zzb(iZzv);
        if (z4) {
            byte[] bArr = this.zzb;
            int i = this.zzc;
            if (!zzmd.zza(bArr, i, i + iZzv)) {
                throw zzjk.zzh();
            }
        }
        String str = new String(this.zzb, this.zzc, iZzv, zzjf.zza);
        this.zzc += iZzv;
        return str;
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zzb(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        zzc(3);
        return (T) zzd(zzlcVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzb(List<Float> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzja) {
            zzja zzjaVar = (zzja) list;
            int i6 = this.zzf & 7;
            if (i6 == 2) {
                int iZzv = zzv();
                zze(iZzv);
                int i10 = this.zzc + iZzv;
                while (this.zzc < i10) {
                    zzjaVar.zza(Float.intBitsToFloat(zzab()));
                }
                return;
            }
            if (i6 == 5) {
                do {
                    zzjaVar.zza(zze());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            throw zzjk.zzf();
        }
        int i11 = this.zzf & 7;
        if (i11 == 2) {
            int iZzv2 = zzv();
            zze(iZzv2);
            int i12 = this.zzc + iZzv2;
            while (this.zzc < i12) {
                list.add(Float.valueOf(Float.intBitsToFloat(zzab())));
            }
            return;
        }
        if (i11 == 5) {
            do {
                list.add(Float.valueOf(zze()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzn(List<Integer> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzjd) {
            zzjd zzjdVar = (zzjd) list;
            int i6 = this.zzf & 7;
            if (i6 == 2) {
                int iZzv = zzv();
                zze(iZzv);
                int i10 = this.zzc + iZzv;
                while (this.zzc < i10) {
                    zzjdVar.zzc(zzab());
                }
                return;
            }
            if (i6 == 5) {
                do {
                    zzjdVar.zzc(zzq());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            throw zzjk.zzf();
        }
        int i11 = this.zzf & 7;
        if (i11 == 2) {
            int iZzv2 = zzv();
            zze(iZzv2);
            int i12 = this.zzc + iZzv2;
            while (this.zzc < i12) {
                list.add(Integer.valueOf(zzab()));
            }
            return;
        }
        if (i11 == 5) {
            do {
                list.add(Integer.valueOf(zzq()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        throw zzjk.zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zza(Class<T> cls, zzio zzioVar) throws IOException {
        zzc(2);
        return (T) zzc(zzky.zza().zza((Class) cls), zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> T zza(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        zzc(2);
        return (T) zzc(zzlcVar, zzioVar);
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzd(List<Long> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i6 = this.zzf & 7;
            if (i6 == 0) {
                do {
                    zzjyVar.zza(zzg());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            if (i6 == 2) {
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    zzjyVar.zza(zzw());
                }
                zzf(iZzv);
                return;
            }
            throw zzjk.zzf();
        }
        int i10 = this.zzf & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(zzg()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        if (i10 == 2) {
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                list.add(Long.valueOf(zzw()));
            }
            zzf(iZzv2);
            return;
        }
        throw zzjk.zzf();
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zza(List<Double> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzin) {
            zzin zzinVar = (zzin) list;
            int i6 = this.zzf & 7;
            if (i6 == 1) {
                do {
                    zzinVar.zza(zzd());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            if (i6 == 2) {
                int iZzv = zzv();
                zzd(iZzv);
                int i10 = this.zzc + iZzv;
                while (this.zzc < i10) {
                    zzinVar.zza(Double.longBitsToDouble(zzac()));
                }
                return;
            }
            throw zzjk.zzf();
        }
        int i11 = this.zzf & 7;
        if (i11 == 1) {
            do {
                list.add(Double.valueOf(zzd()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        if (i11 == 2) {
            int iZzv2 = zzv();
            zzd(iZzv2);
            int i12 = this.zzc + iZzv2;
            while (this.zzc < i12) {
                list.add(Double.valueOf(Double.longBitsToDouble(zzac())));
            }
            return;
        }
        throw zzjk.zzf();
    }

    private final <T> T zzc(zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int iZzv = zzv();
        zzb(iZzv);
        int i = this.zze;
        int i4 = this.zzc + iZzv;
        this.zze = i4;
        try {
            T tZza = zzlcVar.zza();
            zzlcVar.zza(tZza, this, zzioVar);
            zzlcVar.zzc(tZza);
            if (this.zzc == i4) {
                return tZza;
            }
            throw zzjk.zzg();
        } finally {
            this.zze = i;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzld
    public final void zzc(List<Long> list) throws IOException {
        int i;
        int i4;
        if (list instanceof zzjy) {
            zzjy zzjyVar = (zzjy) list;
            int i6 = this.zzf & 7;
            if (i6 == 0) {
                do {
                    zzjyVar.zza(zzf());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            if (i6 == 2) {
                int iZzv = this.zzc + zzv();
                while (this.zzc < iZzv) {
                    zzjyVar.zza(zzw());
                }
                zzf(iZzv);
                return;
            }
            throw zzjk.zzf();
        }
        int i10 = this.zzf & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(zzf()));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        if (i10 == 2) {
            int iZzv2 = this.zzc + zzv();
            while (this.zzc < iZzv2) {
                list.add(Long.valueOf(zzw()));
            }
            zzf(iZzv2);
            return;
        }
        throw zzjk.zzf();
    }

    private final void zze(int i) throws IOException {
        zzb(i);
        if ((i & 3) != 0) {
            throw zzjk.zzg();
        }
    }

    private final void zzf(int i) throws IOException {
        if (this.zzc != i) {
            throw zzjk.zza();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> void zzb(List<T> list, zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int i;
        int i4 = this.zzf;
        if ((i4 & 7) == 3) {
            do {
                list.add(zzd(zzlcVar, zzioVar));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == i4);
            this.zzc = i;
            return;
        }
        throw zzjk.zzf();
    }

    private final void zzb(int i) throws IOException {
        if (i < 0 || i > this.zze - this.zzc) {
            throw zzjk.zza();
        }
    }

    private final void zzd(int i) throws IOException {
        zzb(i);
        if ((i & 7) != 0) {
            throw zzjk.zzg();
        }
    }

    private final void zza(List<String> list, boolean z4) throws IOException {
        int i;
        int i4;
        if ((this.zzf & 7) == 2) {
            if ((list instanceof zzjv) && !z4) {
                zzjv zzjvVar = (zzjv) list;
                do {
                    zzjvVar.zza(zzn());
                    if (zzu()) {
                        return;
                    } else {
                        i4 = this.zzc;
                    }
                } while (zzv() == this.zzf);
                this.zzc = i4;
                return;
            }
            do {
                list.add(zza(z4));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == this.zzf);
            this.zzc = i;
            return;
        }
        throw zzjk.zzf();
    }

    private final void zzc(int i) throws IOException {
        if ((this.zzf & 7) != i) {
            throw zzjk.zzf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzld
    public final <T> void zza(List<T> list, zzlc<T> zzlcVar, zzio zzioVar) throws IOException {
        int i;
        int i4 = this.zzf;
        if ((i4 & 7) == 2) {
            do {
                list.add(zzc(zzlcVar, zzioVar));
                if (zzu()) {
                    return;
                } else {
                    i = this.zzc;
                }
            } while (zzv() == i4);
            this.zzc = i;
            return;
        }
        throw zzjk.zzf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.vision.zzld
    public final <K, V> void zza(Map<K, V> map, zzkf<K, V> zzkfVar, zzio zzioVar) throws IOException {
        zzc(2);
        int iZzv = zzv();
        zzb(iZzv);
        int i = this.zze;
        this.zze = this.zzc + iZzv;
        try {
            Object objZza = zzkfVar.zzb;
            Object objZza2 = zzkfVar.zzd;
            while (true) {
                int iZza = zza();
                if (iZza == Integer.MAX_VALUE) {
                    map.put(objZza, objZza2);
                    this.zze = i;
                    return;
                } else if (iZza == 1) {
                    objZza = zza(zzkfVar.zza, (Class<?>) null, (zzio) null);
                } else if (iZza != 2) {
                    try {
                        if (!zzc()) {
                            throw new zzjk("Unable to parse map entry.");
                        }
                    } catch (zzjn unused) {
                        if (!zzc()) {
                            throw new zzjk("Unable to parse map entry.");
                        }
                    }
                } else {
                    objZza2 = zza(zzkfVar.zzc, zzkfVar.zzd.getClass(), zzioVar);
                }
            }
        } catch (Throwable th2) {
            this.zze = i;
            throw th2;
        }
    }

    private final Object zza(zzml zzmlVar, Class<?> cls, zzio zzioVar) throws IOException {
        switch (zzhp.zza[zzmlVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzk());
            case 2:
                return zzn();
            case 3:
                return Double.valueOf(zzd());
            case 4:
                return Integer.valueOf(zzp());
            case 5:
                return Integer.valueOf(zzj());
            case 6:
                return Long.valueOf(zzi());
            case 7:
                return Float.valueOf(zze());
            case 8:
                return Integer.valueOf(zzh());
            case 9:
                return Long.valueOf(zzg());
            case 10:
                return zza(cls, zzioVar);
            case 11:
                return Integer.valueOf(zzq());
            case 12:
                return Long.valueOf(zzr());
            case 13:
                return Integer.valueOf(zzs());
            case 14:
                return Long.valueOf(zzt());
            case 15:
                return zza(true);
            case 16:
                return Integer.valueOf(zzo());
            case 17:
                return Long.valueOf(zzf());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final void zza(int i) throws IOException {
        zzb(i);
        this.zzc += i;
    }
}
