package com.google.protobuf;

import androidx.media3.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends b0 {
    public final /* synthetic */ int c;

    public static int d(byte[] bArr, int i, long j, int i4) {
        if (i4 == 0) {
            b0 b0Var = r0.f10123a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i4 == 1) {
            return r0.c(i, o0.g(bArr, j));
        }
        if (i4 == 2) {
            return r0.d(i, o0.g(bArr, j), o0.g(bArr, j + 1));
        }
        throw new AssertionError();
    }

    @Override // com.google.protobuf.b0
    public final int a(String str, byte[] bArr, int i, int i4) {
        int i6;
        int i10;
        char cCharAt;
        long j;
        long j6;
        long j7;
        int i11;
        char cCharAt2;
        switch (this.c) {
            case 0:
                int length = str.length();
                int i12 = i4 + i;
                int i13 = 0;
                while (i13 < length && (i10 = i13 + i) < i12 && (cCharAt = str.charAt(i13)) < 128) {
                    bArr[i10] = (byte) cCharAt;
                    i13++;
                }
                if (i13 == length) {
                    return i + length;
                }
                int i14 = i + i13;
                while (i13 < length) {
                    char cCharAt3 = str.charAt(i13);
                    if (cCharAt3 < 128 && i14 < i12) {
                        bArr[i14] = (byte) cCharAt3;
                        i14++;
                    } else if (cCharAt3 < 2048 && i14 <= i12 - 2) {
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) ((cCharAt3 >>> 6) | 960);
                        i14 += 2;
                        bArr[i15] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i14 > i12 - 3) {
                            if (i14 > i12 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i6 = i13 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i6)))) {
                                    throw new q0(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i14);
                            }
                            int i16 = i13 + 1;
                            if (i16 != str.length()) {
                                char cCharAt4 = str.charAt(i16);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i14] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i17 = i14 + 3;
                                    bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i14 += 4;
                                    bArr[i17] = (byte) ((codePoint & 63) | 128);
                                    i13 = i16;
                                } else {
                                    i13 = i16;
                                }
                            }
                            throw new q0(i13 - 1, length);
                        }
                        bArr[i14] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i18 = i14 + 2;
                        bArr[i14 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i14 += 3;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i13++;
                }
                return i14;
            default:
                long j9 = i;
                long j10 = ((long) i4) + j9;
                int length2 = str.length();
                if (length2 > i4 || bArr.length - i4 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i4));
                }
                int i19 = 0;
                while (true) {
                    j = 1;
                    if (i19 < length2 && (cCharAt2 = str.charAt(i19)) < 128) {
                        o0.k(bArr, j9, (byte) cCharAt2);
                        i19++;
                        j9 = 1 + j9;
                    }
                }
                if (i19 != length2) {
                    while (i19 < length2) {
                        char cCharAt5 = str.charAt(i19);
                        if (cCharAt5 < 128 && j9 < j10) {
                            o0.k(bArr, j9, (byte) cCharAt5);
                            j7 = j10;
                            j6 = j;
                            j9 += j;
                        } else if (cCharAt5 >= 2048 || j9 > j10 - 2) {
                            j6 = j;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j9 > j10 - 3) {
                                j7 = j10;
                                if (j9 > j7 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i11)))) {
                                        throw new q0(i19, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j9);
                                }
                                int i20 = i19 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        o0.k(bArr, j9, (byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        o0.k(bArr, j9 + j6, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j11 = j9 + 3;
                                        o0.k(bArr, j9 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j9 += 4;
                                        o0.k(bArr, j11, (byte) ((codePoint2 & 63) | 128));
                                        i19 = i20;
                                    } else {
                                        i19 = i20;
                                    }
                                }
                                throw new q0(i19 - 1, length2);
                            }
                            o0.k(bArr, j9, (byte) ((cCharAt5 >>> '\f') | 480));
                            j7 = j10;
                            long j12 = j9 + 2;
                            o0.k(bArr, j9 + j6, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j9 += 3;
                            o0.k(bArr, j12, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j6 = j;
                            long j13 = j9 + j6;
                            o0.k(bArr, j9, (byte) ((cCharAt5 >>> 6) | 960));
                            j9 += 2;
                            o0.k(bArr, j13, (byte) ((cCharAt5 & '?') | 128));
                            j7 = j10;
                        }
                        i19++;
                        j = j6;
                        j10 = j7;
                    }
                }
                return (int) j9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x010c, code lost:
    
        return r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // com.google.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(byte[] r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.p0.c(byte[], int, int):int");
    }
}
