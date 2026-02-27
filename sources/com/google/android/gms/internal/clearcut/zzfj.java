package com.google.android.gms.internal.clearcut;

import androidx.media3.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class zzfj extends zzfg {
    private static int zza(byte[] bArr, int i, long j, int i4) {
        if (i4 == 0) {
            return zzff.zzam(i);
        }
        if (i4 == 1) {
            return zzff.zzp(i, zzfd.zza(bArr, j));
        }
        if (i4 == 2) {
            return zzff.zzd(i, zzfd.zza(bArr, j), zzfd.zza(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
    
        return -1;
     */
    @Override // com.google.android.gms.internal.clearcut.zzfg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(int r19, byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfj.zzb(int, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.clearcut.zzfg
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i4) {
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
            zzfd.zza(bArr, j9, (byte) cCharAt);
            i10++;
            j9 = 1 + j9;
        }
        if (i10 == length) {
            return (int) j9;
        }
        while (i10 < length) {
            char cCharAt3 = charSequence.charAt(i10);
            if (cCharAt3 < 128 && j9 < j10) {
                zzfd.zza(bArr, j9, (byte) cCharAt3);
                j7 = j10;
                j6 = j;
                j9 += j;
            } else if (cCharAt3 >= 2048 || j9 > j10 - 2) {
                j6 = j;
                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j9 > j10 - 3) {
                    j7 = j10;
                    if (j9 > j7 - 4) {
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i6 = i10 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i6)))) {
                            throw new zzfi(i10, length);
                        }
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append("Failed writing ");
                        sb3.append(cCharAt3);
                        sb3.append(" at index ");
                        sb3.append(j9);
                        throw new ArrayIndexOutOfBoundsException(sb3.toString());
                    }
                    int i11 = i10 + 1;
                    if (i11 != length) {
                        char cCharAt4 = charSequence.charAt(i11);
                        if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                            int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                            zzfd.zza(bArr, j9, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                            zzfd.zza(bArr, j9 + j6, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j11 = j9 + 3;
                            zzfd.zza(bArr, j9 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                            j9 += 4;
                            zzfd.zza(bArr, j11, (byte) ((codePoint & 63) | 128));
                            i10 = i11;
                        } else {
                            i10 = i11;
                        }
                    }
                    throw new zzfi(i10 - 1, length);
                }
                zzfd.zza(bArr, j9, (byte) ((cCharAt3 >>> '\f') | 480));
                j7 = j10;
                long j12 = j9 + 2;
                zzfd.zza(bArr, j9 + j6, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                j9 += 3;
                zzfd.zza(bArr, j12, (byte) ((cCharAt3 & '?') | 128));
            } else {
                j6 = j;
                long j13 = j9 + j6;
                zzfd.zza(bArr, j9, (byte) ((cCharAt3 >>> 6) | 960));
                j9 += 2;
                zzfd.zza(bArr, j13, (byte) ((cCharAt3 & '?') | 128));
                j7 = j10;
            }
            i10++;
            j = j6;
            j10 = j7;
        }
        return (int) j9;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfg
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        char c;
        long j6;
        long j7;
        long j9;
        long j10;
        int i;
        char c10;
        char cCharAt;
        long jZzb = zzfd.zzb(byteBuffer);
        long jPosition = ((long) byteBuffer.position()) + jZzb;
        long jLimit = ((long) byteBuffer.limit()) + jZzb;
        int length = charSequence.length();
        if (length > jLimit - jPosition) {
            char cCharAt2 = charSequence.charAt(length - 1);
            int iLimit = byteBuffer.limit();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(cCharAt2);
            sb2.append(" at index ");
            sb2.append(iLimit);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i4 = 0;
        while (true) {
            j = 1;
            c = 128;
            if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            zzfd.zza(jPosition, (byte) cCharAt);
            i4++;
            jPosition = 1 + jPosition;
        }
        if (i4 == length) {
            j6 = jPosition - jZzb;
        } else {
            while (i4 < length) {
                char cCharAt3 = charSequence.charAt(i4);
                if (cCharAt3 >= c || jPosition >= jLimit) {
                    j7 = j;
                    if (cCharAt3 < 2048 && jPosition <= jLimit - 2) {
                        long j11 = jPosition + j7;
                        zzfd.zza(jPosition, (byte) ((cCharAt3 >>> 6) | 960));
                        jPosition += 2;
                        zzfd.zza(j11, (byte) ((cCharAt3 & '?') | 128));
                        j9 = jZzb;
                        j10 = jLimit;
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || jPosition > jLimit - 3) {
                            j9 = jZzb;
                            j10 = jLimit;
                            if (jPosition > j10 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i = i4 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i)))) {
                                    throw new zzfi(i4, length);
                                }
                                StringBuilder sb3 = new StringBuilder(46);
                                sb3.append("Failed writing ");
                                sb3.append(cCharAt3);
                                sb3.append(" at index ");
                                sb3.append(jPosition);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i6 = i4 + 1;
                            if (i6 != length) {
                                char cCharAt4 = charSequence.charAt(i6);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    zzfd.zza(jPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    c10 = 128;
                                    zzfd.zza(jPosition + j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = jPosition + 3;
                                    zzfd.zza(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    zzfd.zza(j12, (byte) ((codePoint & 63) | 128));
                                    i4 = i6;
                                } else {
                                    i4 = i6;
                                }
                            }
                            throw new zzfi(i4 - 1, length);
                        }
                        zzfd.zza(jPosition, (byte) ((cCharAt3 >>> '\f') | 480));
                        j9 = jZzb;
                        long j13 = jPosition + 2;
                        j10 = jLimit;
                        zzfd.zza(jPosition + j7, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                        jPosition += 3;
                        zzfd.zza(j13, (byte) ((cCharAt3 & '?') | 128));
                    }
                    c10 = 128;
                } else {
                    zzfd.zza(jPosition, (byte) cCharAt3);
                    j9 = jZzb;
                    j10 = jLimit;
                    c10 = c;
                    jPosition += j;
                    j7 = j;
                }
                i4++;
                c = c10;
                j = j7;
                jZzb = j9;
                jLimit = j10;
            }
            j6 = jPosition - jZzb;
        }
        byteBuffer.position((int) j6);
    }
}
