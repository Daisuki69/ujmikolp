package com.google.android.gms.internal.vision;

import androidx.media3.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes3.dex */
final class zzmj extends zzme {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.vision.zzme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(int r19, byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzmj.zza(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.vision.zzme
    public final String zzb(byte[] bArr, int i, int i4) throws zzjk {
        if ((i | i4 | ((bArr.length - i) - i4)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i4)));
        }
        int i6 = i + i4;
        char[] cArr = new char[i4];
        int i10 = i;
        int i11 = 0;
        while (i10 < i6) {
            byte bZza = zzma.zza(bArr, i10);
            if (!zzmf.zzd(bZza)) {
                break;
            }
            i10++;
            zzmf.zzb(bZza, cArr, i11);
            i11++;
        }
        int i12 = i11;
        while (i10 < i6) {
            int i13 = i10 + 1;
            byte bZza2 = zzma.zza(bArr, i10);
            if (zzmf.zzd(bZza2)) {
                int i14 = i12 + 1;
                zzmf.zzb(bZza2, cArr, i12);
                while (i13 < i6) {
                    byte bZza3 = zzma.zza(bArr, i13);
                    if (!zzmf.zzd(bZza3)) {
                        break;
                    }
                    i13++;
                    zzmf.zzb(bZza3, cArr, i14);
                    i14++;
                }
                i12 = i14;
                i10 = i13;
            } else if (zzmf.zze(bZza2)) {
                if (i13 >= i6) {
                    throw zzjk.zzh();
                }
                i10 += 2;
                zzmf.zzb(bZza2, zzma.zza(bArr, i13), cArr, i12);
                i12++;
            } else if (zzmf.zzf(bZza2)) {
                if (i13 >= i6 - 1) {
                    throw zzjk.zzh();
                }
                int i15 = i10 + 2;
                i10 += 3;
                zzmf.zzb(bZza2, zzma.zza(bArr, i13), zzma.zza(bArr, i15), cArr, i12);
                i12++;
            } else {
                if (i13 >= i6 - 2) {
                    throw zzjk.zzh();
                }
                byte bZza4 = zzma.zza(bArr, i13);
                int i16 = i10 + 3;
                byte bZza5 = zzma.zza(bArr, i10 + 2);
                i10 += 4;
                zzmf.zzb(bZza2, bZza4, bZza5, zzma.zza(bArr, i16), cArr, i12);
                i12 += 2;
            }
        }
        return new String(cArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.vision.zzme
    public final int zza(CharSequence charSequence, byte[] bArr, int i, int i4) {
        long j;
        long j6;
        long j7;
        int i6;
        char cCharAt;
        long j9 = i;
        long j10 = ((long) i4) + j9;
        int length = charSequence.length();
        if (length > i4 || bArr.length - i4 < i) {
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(cCharAt2);
            sb2.append(" at index ");
            sb2.append(i + i4);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i10 = 0;
        while (true) {
            j = 1;
            if (i10 >= length || (cCharAt = charSequence.charAt(i10)) >= 128) {
                break;
            }
            zzma.zza(bArr, j9, (byte) cCharAt);
            i10++;
            j9 = 1 + j9;
        }
        if (i10 == length) {
            return (int) j9;
        }
        while (i10 < length) {
            char cCharAt3 = charSequence.charAt(i10);
            if (cCharAt3 < 128 && j9 < j10) {
                zzma.zza(bArr, j9, (byte) cCharAt3);
                j7 = j10;
                j6 = j;
                j9 += j;
            } else if (cCharAt3 >= 2048 || j9 > j10 - 2) {
                j6 = j;
                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j9 > j10 - 3) {
                    j7 = j10;
                    if (j9 <= j7 - 4) {
                        int i11 = i10 + 1;
                        if (i11 != length) {
                            char cCharAt4 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                zzma.zza(bArr, j9, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                zzma.zza(bArr, j9 + j6, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j11 = j9 + 3;
                                zzma.zza(bArr, j9 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j9 += 4;
                                zzma.zza(bArr, j11, (byte) ((codePoint & 63) | 128));
                                i10 = i11;
                            } else {
                                i10 = i11;
                            }
                        }
                        throw new zzmg(i10 - 1, length);
                    }
                    if (55296 > cCharAt3 || cCharAt3 > 57343 || ((i6 = i10 + 1) != length && Character.isSurrogatePair(cCharAt3, charSequence.charAt(i6)))) {
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append("Failed writing ");
                        sb3.append(cCharAt3);
                        sb3.append(" at index ");
                        sb3.append(j9);
                        throw new ArrayIndexOutOfBoundsException(sb3.toString());
                    }
                    throw new zzmg(i10, length);
                }
                zzma.zza(bArr, j9, (byte) ((cCharAt3 >>> '\f') | 480));
                j7 = j10;
                long j12 = j9 + 2;
                zzma.zza(bArr, j9 + j6, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                j9 += 3;
                zzma.zza(bArr, j12, (byte) ((cCharAt3 & '?') | 128));
            } else {
                j6 = j;
                long j13 = j9 + j6;
                zzma.zza(bArr, j9, (byte) ((cCharAt3 >>> 6) | 960));
                j9 += 2;
                zzma.zza(bArr, j13, (byte) ((cCharAt3 & '?') | 128));
                j7 = j10;
            }
            i10++;
            j = j6;
            j10 = j7;
        }
        return (int) j9;
    }

    private static int zza(byte[] bArr, int i, long j, int i4) {
        if (i4 == 0) {
            return zzmd.zzb(i);
        }
        if (i4 == 1) {
            return zzmd.zzb(i, zzma.zza(bArr, j));
        }
        if (i4 == 2) {
            return zzmd.zzb(i, zzma.zza(bArr, j), zzma.zza(bArr, j + 1));
        }
        throw new AssertionError();
    }
}
