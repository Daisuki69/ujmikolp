package com.google.android.gms.internal.clearcut;

import androidx.media3.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class zzfh extends zzfg {
    @Override // com.google.android.gms.internal.clearcut.zzfg
    public final int zzb(int i, byte[] bArr, int i4, int i6) {
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
                        return zzff.zzf(bArr, i10, i6);
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
                    return zzff.zzf(bArr, i10, i6);
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

    @Override // com.google.android.gms.internal.clearcut.zzfg
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i4) {
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
                    if (i13 > i11 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i6 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i6)))) {
                            throw new zzfi(i12, length);
                        }
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt2);
                        sb2.append(" at index ");
                        sb2.append(i13);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
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
                    throw new zzfi(i12 - 1, length);
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

    @Override // com.google.android.gms.internal.clearcut.zzfg
    public final void zzb(CharSequence charSequence, ByteBuffer byteBuffer) {
        zzfg.zzc(charSequence, byteBuffer);
    }
}
