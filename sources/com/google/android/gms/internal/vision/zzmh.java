package com.google.android.gms.internal.vision;

import androidx.media3.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes3.dex */
final class zzmh extends zzme {
    @Override // com.google.android.gms.internal.vision.zzme
    public final int zza(int i, byte[] bArr, int i4, int i6) {
        while (i4 < i6 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 >= i6) {
            return 0;
        }
        while (i4 < i6) {
            int i10 = i4 + 1;
            byte b8 = bArr[i4];
            if (b8 < 0) {
                if (b8 < -32) {
                    if (i10 >= i6) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i4 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 < -16) {
                    if (i10 >= i6 - 1) {
                        return zzmd.zzd(bArr, i10, i6);
                    }
                    int i11 = i4 + 2;
                    byte b10 = bArr[i10];
                    if (b10 <= -65 && ((b8 != -32 || b10 >= -96) && (b8 != -19 || b10 < -96))) {
                        i4 += 3;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (i10 >= i6 - 2) {
                    return zzmd.zzd(bArr, i10, i6);
                }
                int i12 = i4 + 2;
                byte b11 = bArr[i10];
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b8 << 28)) >> 30) == 0) {
                        int i13 = i4 + 3;
                        if (bArr[i12] <= -65) {
                            i4 += 4;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i4 = i10;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.vision.zzme
    public final String zzb(byte[] bArr, int i, int i4) throws zzjk {
        if ((i | i4 | ((bArr.length - i) - i4)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i4)));
        }
        int i6 = i + i4;
        char[] cArr = new char[i4];
        int i10 = 0;
        while (i < i6) {
            byte b8 = bArr[i];
            if (!zzmf.zzd(b8)) {
                break;
            }
            i++;
            zzmf.zzb(b8, cArr, i10);
            i10++;
        }
        int i11 = i10;
        while (i < i6) {
            int i12 = i + 1;
            byte b10 = bArr[i];
            if (zzmf.zzd(b10)) {
                int i13 = i11 + 1;
                zzmf.zzb(b10, cArr, i11);
                while (i12 < i6) {
                    byte b11 = bArr[i12];
                    if (!zzmf.zzd(b11)) {
                        break;
                    }
                    i12++;
                    zzmf.zzb(b11, cArr, i13);
                    i13++;
                }
                i11 = i13;
                i = i12;
            } else if (zzmf.zze(b10)) {
                if (i12 >= i6) {
                    throw zzjk.zzh();
                }
                i += 2;
                zzmf.zzb(b10, bArr[i12], cArr, i11);
                i11++;
            } else if (zzmf.zzf(b10)) {
                if (i12 >= i6 - 1) {
                    throw zzjk.zzh();
                }
                int i14 = i + 2;
                i += 3;
                zzmf.zzb(b10, bArr[i12], bArr[i14], cArr, i11);
                i11++;
            } else {
                if (i12 >= i6 - 2) {
                    throw zzjk.zzh();
                }
                byte b12 = bArr[i12];
                int i15 = i + 3;
                byte b13 = bArr[i + 2];
                i += 4;
                zzmf.zzb(b10, b12, b13, bArr[i15], cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.vision.zzme
    public final int zza(CharSequence charSequence, byte[] bArr, int i, int i4) {
        int i6;
        int i10;
        char cCharAt;
        int length = charSequence.length();
        int i11 = i4 + i;
        int i12 = 0;
        while (i12 < length && (i10 = i12 + i) < i11 && (cCharAt = charSequence.charAt(i12)) < 128) {
            bArr[i10] = (byte) cCharAt;
            i12++;
        }
        if (i12 == length) {
            return i + length;
        }
        int i13 = i + i12;
        while (i12 < length) {
            char cCharAt2 = charSequence.charAt(i12);
            if (cCharAt2 < 128 && i13 < i11) {
                bArr[i13] = (byte) cCharAt2;
                i13++;
            } else if (cCharAt2 < 2048 && i13 <= i11 - 2) {
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                i13 += 2;
                bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i13 > i11 - 3) {
                    if (i13 <= i11 - 4) {
                        int i15 = i12 + 1;
                        if (i15 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i13] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i16 = i13 + 3;
                                bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i13 += 4;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                                i12 = i15;
                            } else {
                                i12 = i15;
                            }
                        }
                        throw new zzmg(i12 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i6 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i6)))) {
                        throw new zzmg(i12, length);
                    }
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(cCharAt2);
                    sb2.append(" at index ");
                    sb2.append(i13);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
                bArr[i13] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i17 = i13 + 2;
                bArr[i13 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i13 += 3;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            }
            i12++;
        }
        return i13;
    }
}
