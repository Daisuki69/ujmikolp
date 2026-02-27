package com.google.android.gms.internal.clearcut;

import androidx.media3.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzfg {
    public static void zzc(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i4 = 0;
        while (i4 < length) {
            try {
                char cCharAt = charSequence.charAt(i4);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i4, (byte) cCharAt);
                i4++;
            } catch (IndexOutOfBoundsException unused) {
                int iMax = Math.max(i4, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position();
                char cCharAt2 = charSequence.charAt(i4);
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Failed writing ");
                sb2.append(cCharAt2);
                sb2.append(" at index ");
                sb2.append(iMax);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
        }
        if (i4 == length) {
            byteBuffer.position(iPosition + i4);
            return;
        }
        iPosition += i4;
        while (i4 < length) {
            char cCharAt3 = charSequence.charAt(i4);
            if (cCharAt3 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt3);
            } else if (cCharAt3 < 2048) {
                int i6 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt3 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i6, (byte) ((cCharAt3 & '?') | 128));
                    iPosition = i6;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i6;
                    int iMax2 = Math.max(i4, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position();
                    char cCharAt22 = charSequence.charAt(i4);
                    StringBuilder sb22 = new StringBuilder(37);
                    sb22.append("Failed writing ");
                    sb22.append(cCharAt22);
                    sb22.append(" at index ");
                    sb22.append(iMax2);
                    throw new ArrayIndexOutOfBoundsException(sb22.toString());
                }
            } else {
                if (cCharAt3 >= 55296 && 57343 >= cCharAt3) {
                    int i10 = i4 + 1;
                    if (i10 != length) {
                        try {
                            char cCharAt4 = charSequence.charAt(i10);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                int i11 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    i = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i11;
                                    i4 = i10;
                                    int iMax22 = Math.max(i4, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position();
                                    char cCharAt222 = charSequence.charAt(i4);
                                    StringBuilder sb222 = new StringBuilder(37);
                                    sb222.append("Failed writing ");
                                    sb222.append(cCharAt222);
                                    sb222.append(" at index ");
                                    sb222.append(iMax22);
                                    throw new ArrayIndexOutOfBoundsException(sb222.toString());
                                }
                                try {
                                    byteBuffer.put(i11, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i4 = i10;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i4 = i10;
                                    iPosition = i;
                                    int iMax222 = Math.max(i4, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position();
                                    char cCharAt2222 = charSequence.charAt(i4);
                                    StringBuilder sb2222 = new StringBuilder(37);
                                    sb2222.append("Failed writing ");
                                    sb2222.append(cCharAt2222);
                                    sb2222.append(" at index ");
                                    sb2222.append(iMax222);
                                    throw new ArrayIndexOutOfBoundsException(sb2222.toString());
                                }
                            } else {
                                i4 = i10;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new zzfi(i4, length);
                }
                int i12 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt3 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i12, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt3 & '?') | 128));
            }
            i4++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    public abstract int zzb(int i, byte[] bArr, int i4, int i6);

    public abstract int zzb(CharSequence charSequence, byte[] bArr, int i, int i4);

    public abstract void zzb(CharSequence charSequence, ByteBuffer byteBuffer);

    public final boolean zze(byte[] bArr, int i, int i4) {
        return zzb(0, bArr, i, i4) == 0;
    }
}
