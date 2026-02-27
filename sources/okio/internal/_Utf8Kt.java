package okio.internal;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.ts.PsExtractor;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import okio.Utf8;
import zj.z;

/* JADX INFO: loaded from: classes5.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i;
        char cCharAt;
        j.g(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            char cCharAt2 = str.charAt(i4);
            if (j.i(cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i6 = i4;
                while (i4 < length2) {
                    char cCharAt3 = str.charAt(i4);
                    if (j.i(cCharAt3, 128) < 0) {
                        int i10 = i6 + 1;
                        bArr[i6] = (byte) cCharAt3;
                        i4++;
                        while (true) {
                            i6 = i10;
                            if (i4 >= length2 || j.i(str.charAt(i4), 128) >= 0) {
                                break;
                            }
                            i10 = i6 + 1;
                            bArr[i6] = (byte) str.charAt(i4);
                            i4++;
                        }
                    } else {
                        if (j.i(cCharAt3, 2048) < 0) {
                            bArr[i6] = (byte) ((cCharAt3 >> 6) | PsExtractor.AUDIO_STREAM);
                            i6 += 2;
                            bArr[i6 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i6] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i6 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i6 += 3;
                            bArr[i6 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (j.i(cCharAt3, 56319) > 0 || length2 <= (i = i4 + 1) || 56320 > (cCharAt = str.charAt(i)) || cCharAt >= 57344) {
                            bArr[i6] = Utf8.REPLACEMENT_BYTE;
                            i4++;
                            i6++;
                        } else {
                            int iCharAt = (str.charAt(i) + (cCharAt3 << '\n')) - 56613888;
                            bArr[i6] = (byte) ((iCharAt >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr[i6 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i6 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i6 += 4;
                            bArr[i6 + 3] = (byte) ((iCharAt & 63) | 128);
                            i4 += 2;
                        }
                        i4++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i6);
                j.f(bArrCopyOf, "copyOf(...)");
                return bArrCopyOf;
            }
            bArr[i4] = (byte) cCharAt2;
            i4++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        j.f(bArrCopyOf2, "copyOf(...)");
        return bArrCopyOf2;
    }

    public static final String commonToUtf8String(byte[] bArr, int i, int i4) {
        byte b8;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i;
        int i16 = 2;
        j.g(bArr, "<this>");
        if (i15 < 0 || i4 > bArr.length || i15 > i4) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i15 + " endIndex=" + i4);
        }
        char[] cArr = new char[i4 - i15];
        int i17 = 0;
        while (i15 < i4) {
            byte b10 = bArr[i15];
            if (b10 >= 0) {
                int i18 = i17 + 1;
                cArr[i17] = (char) b10;
                i15++;
                while (true) {
                    i17 = i18;
                    if (i15 >= i4 || (b8 = bArr[i15]) < 0) {
                        break;
                    }
                    i15++;
                    i18 = i17 + 1;
                    cArr[i17] = (char) b8;
                }
            } else if ((b10 >> 5) == -2) {
                int i19 = i15 + 1;
                if (i4 <= i19) {
                    i6 = i17 + 1;
                    cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                } else {
                    byte b11 = bArr[i19];
                    if ((b11 & 192) == 128) {
                        int i20 = (b10 << 6) ^ (b11 ^ 3968);
                        if (i20 < 128) {
                            i6 = i17 + 1;
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        } else {
                            i6 = i17 + 1;
                            cArr[i17] = (char) i20;
                        }
                        Unit unit = Unit.f18162a;
                        i10 = i16;
                        i17 = i6;
                        i15 += i10;
                    } else {
                        i6 = i17 + 1;
                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                Unit unit2 = Unit.f18162a;
                i10 = 1;
                i17 = i6;
                i15 += i10;
            } else if ((b10 >> 4) == -2) {
                int i21 = i15 + 2;
                if (i4 <= i21) {
                    int i22 = i17 + 1;
                    cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    Unit unit3 = Unit.f18162a;
                    int i23 = i15 + 1;
                    i13 = (i4 <= i23 || (bArr[i23] & 192) != 128) ? 1 : i16;
                    i17 = i22;
                } else {
                    byte b12 = bArr[i15 + 1];
                    if ((b12 & 192) == 128) {
                        byte b13 = bArr[i21];
                        if ((b13 & 192) == 128) {
                            int i24 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b10 << 12);
                            if (i24 < 2048) {
                                i14 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else if (55296 > i24 || i24 >= 57344) {
                                char c = (char) i24;
                                i14 = i17 + 1;
                                cArr[i17] = c;
                            } else {
                                i14 = i17 + 1;
                                cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            }
                            Unit unit4 = Unit.f18162a;
                            i17 = i14;
                            i13 = 3;
                        } else {
                            cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            Unit unit5 = Unit.f18162a;
                            i17++;
                            i13 = i16;
                        }
                    } else {
                        cArr[i17] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        Unit unit6 = Unit.f18162a;
                        i17++;
                        i13 = 1;
                    }
                }
                i15 += i13;
            } else if ((b10 >> 3) == -2) {
                int i25 = i15 + 3;
                if (i4 <= i25) {
                    int i26 = i17 + 1;
                    cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                    Unit unit7 = Unit.f18162a;
                    int i27 = i15 + 1;
                    if (i4 <= i27 || (bArr[i27] & 192) != 128) {
                        i17 = i26;
                        i11 = i16;
                        i16 = 1;
                        i15 += i16;
                        i16 = i11;
                    } else {
                        int i28 = i15 + 2;
                        if (i4 <= i28 || (bArr[i28] & 192) != 128) {
                            i17 = i26;
                            i11 = i16;
                            i15 += i16;
                            i16 = i11;
                        } else {
                            i17 = i26;
                            i11 = i16;
                            i16 = 3;
                            i15 += i16;
                            i16 = i11;
                        }
                    }
                } else {
                    byte b14 = bArr[i15 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i15 + 2];
                        i11 = i16;
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i25];
                            if ((b16 & 192) == 128) {
                                int i29 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b10 << 18);
                                if (i29 > 1114111) {
                                    i12 = i17 + 1;
                                    cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                } else if ((55296 > i29 || i29 >= 57344) && i29 >= 65536 && i29 != 65533) {
                                    cArr[i17] = (char) ((i29 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                    cArr[i17 + 1] = (char) ((i29 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + Utf8.LOG_SURROGATE_HEADER);
                                    i12 = i17 + 2;
                                } else {
                                    i12 = i17 + 1;
                                    cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                }
                                Unit unit8 = Unit.f18162a;
                                i17 = i12;
                                i16 = 4;
                            } else {
                                cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit9 = Unit.f18162a;
                                i17++;
                                i16 = 3;
                            }
                        } else {
                            cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit10 = Unit.f18162a;
                            i17++;
                            i16 = i11;
                        }
                        i15 += i16;
                        i16 = i11;
                    } else {
                        i11 = i16;
                        cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                        Unit unit11 = Unit.f18162a;
                        i17++;
                        i16 = 1;
                        i15 += i16;
                        i16 = i11;
                    }
                }
            } else {
                cArr[i17] = Utf8.REPLACEMENT_CHARACTER;
                i15++;
                i17++;
            }
        }
        return z.i(cArr, 0, i17);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i, int i4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i4 = bArr.length;
        }
        return commonToUtf8String(bArr, i, i4);
    }
}
