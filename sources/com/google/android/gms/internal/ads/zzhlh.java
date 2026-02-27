package com.google.android.gms.internal.ads;

import androidx.media3.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class zzhlh {
    private static final zzhle zza;

    static {
        if (zzhlc.zza() && zzhlc.zzb()) {
            int i = zzhgo.zza;
        }
        zza = new zzhlf();
    }

    public static boolean zza(byte[] bArr, int i, int i4) {
        return zza.zza(0, bArr, i, i4) == 0;
    }

    public static int zzb(int i, byte[] bArr, int i4, int i6) {
        return zza.zza(i, bArr, i4, i6);
    }

    public static int zzc(String str) {
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i6 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt < 2048) {
                i6 += (127 - cCharAt) >>> 31;
                i4++;
            } else {
                int length2 = str.length();
                while (i4 < length2) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i4) < 65536) {
                                throw new zzhlg(i4, length2);
                            }
                            i4++;
                        }
                    }
                    i4++;
                }
                i6 += i;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        long j = ((long) i6) + 4294967296L;
        throw new IllegalArgumentException(androidx.media3.datasource.cache.c.j(j, "UTF-8 length does not fit in int: ", new StringBuilder(String.valueOf(j).length() + 34)));
    }

    public static int zzd(String str, byte[] bArr, int i, int i4) {
        int i6;
        int i10;
        int i11;
        char cCharAt;
        int length = str.length();
        int i12 = 0;
        while (true) {
            i6 = i + i4;
            if (i12 >= length || (i11 = i12 + i) >= i6 || (cCharAt = str.charAt(i12)) >= 128) {
                break;
            }
            bArr[i11] = (byte) cCharAt;
            i12++;
        }
        if (i12 == length) {
            return i + length;
        }
        int i13 = i + i12;
        while (i12 < length) {
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 128 && i13 < i6) {
                bArr[i13] = (byte) cCharAt2;
                i13++;
            } else if (cCharAt2 < 2048 && i13 <= i6 - 2) {
                bArr[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i13 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i13 > i6 - 3) {
                    if (i13 > i6 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i10 = i12 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i10)))) {
                            throw new zzhlg(i12, length);
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i13).length());
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt2);
                        sb2.append(" at index ");
                        sb2.append(i13);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i14 = i12 + 1;
                    if (i14 != str.length()) {
                        char cCharAt3 = str.charAt(i14);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i15 = i13 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i13] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i12 = i14;
                        } else {
                            i12 = i14;
                        }
                    }
                    throw new zzhlg(i12 - 1, length);
                }
                bArr[i13] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i13 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i13 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i13 += 3;
            }
            i12++;
        }
        return i13;
    }

    public static String zze(ByteBuffer byteBuffer, int i, int i4) throws zzhiw {
        zzhle zzhleVar = zza;
        if (byteBuffer.hasArray()) {
            return zzhleVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i, i4);
        }
        return byteBuffer.isDirect() ? zzhle.zzc(byteBuffer, i, i4) : zzhle.zzc(byteBuffer, i, i4);
    }

    public static String zzf(byte[] bArr, int i, int i4) throws zzhiw {
        return zza.zzb(bArr, i, i4);
    }

    public static /* synthetic */ int zzi(byte[] bArr, int i, int i4) {
        int i6 = i4 - i;
        byte b8 = bArr[i - 1];
        if (i6 == 0) {
            if (b8 > -12) {
                return -1;
            }
            return b8;
        }
        if (i6 == 1) {
            return zzj(b8, bArr[i]);
        }
        if (i6 == 2) {
            return zzk(b8, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i, int i4) {
        if (i > -12 || i4 > -65) {
            return -1;
        }
        return i ^ (i4 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i, int i4, int i6) {
        if (i > -12 || i4 > -65 || i6 > -65) {
            return -1;
        }
        return (i ^ (i4 << 8)) ^ (i6 << 16);
    }
}
