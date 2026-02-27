package okio;

import We.s;
import androidx.camera.core.impl.a;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.ts.PsExtractor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        if (i < 0 || i >= 32) {
            return 127 <= i && i < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b8) {
        return (b8 & 192) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i, int i4, Function1<? super Integer, Unit> yield) {
        j.g(bArr, "<this>");
        j.g(yield, "yield");
        int i6 = i + 1;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i4 <= i6) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b8 = bArr[i];
        byte b10 = bArr[i6];
        if ((b10 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i10 = (b10 ^ 3968) ^ (b8 << 6);
        if (i10 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i10));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i, int i4, Function1<? super Integer, Unit> yield) {
        j.g(bArr, "<this>");
        j.g(yield, "yield");
        int i6 = i + 2;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i4 <= i6) {
            yield.invoke(numValueOf);
            int i10 = i + 1;
            return (i4 <= i10 || (bArr[i10] & 192) != 128) ? 1 : 2;
        }
        byte b8 = bArr[i];
        byte b10 = bArr[i + 1];
        if ((b10 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b11 = bArr[i6];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i11 = ((b11 ^ (-123008)) ^ (b10 << 6)) ^ (b8 << 12);
        if (i11 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 > i11 || i11 >= 57344) {
            yield.invoke(Integer.valueOf(i11));
            return 3;
        }
        yield.invoke(numValueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i, int i4, Function1<? super Integer, Unit> yield) {
        j.g(bArr, "<this>");
        j.g(yield, "yield");
        int i6 = i + 3;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i4 <= i6) {
            yield.invoke(numValueOf);
            int i10 = i + 1;
            if (i4 <= i10 || (bArr[i10] & 192) != 128) {
                return 1;
            }
            int i11 = i + 2;
            return (i4 <= i11 || (bArr[i11] & 192) != 128) ? 2 : 3;
        }
        byte b8 = bArr[i];
        byte b10 = bArr[i + 1];
        if ((b10 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b11 = bArr[i + 2];
        if ((b11 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b12 = bArr[i6];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i12 = (((b12 ^ 3678080) ^ (b11 << 6)) ^ (b10 << 12)) ^ (b8 << 18);
        if (i12 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i12 && i12 < 57344) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i12 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i12));
        return 4;
    }

    public static final void processUtf16Chars(byte[] bArr, int i, int i4, Function1<? super Character, Unit> yield) {
        int i6;
        int i10;
        j.g(bArr, "<this>");
        j.g(yield, "yield");
        int i11 = i;
        while (i11 < i4) {
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                yield.invoke(Character.valueOf((char) b8));
                i11++;
                while (i11 < i4) {
                    byte b10 = bArr[i11];
                    if (b10 >= 0) {
                        i11++;
                        yield.invoke(Character.valueOf((char) b10));
                    }
                }
            } else {
                if ((b8 >> 5) == -2) {
                    int i12 = i11 + 1;
                    if (i4 > i12) {
                        byte b11 = bArr[i12];
                        if ((b11 & 192) == 128) {
                            int i13 = (b8 << 6) ^ (b11 ^ 3968);
                            yield.invoke(Character.valueOf(i13 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i13));
                            Unit unit = Unit.f18162a;
                        }
                    }
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    Unit unit2 = Unit.f18162a;
                } else if ((b8 >> 4) == -2) {
                    int i14 = i11 + 2;
                    if (i4 <= i14) {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        Unit unit3 = Unit.f18162a;
                        int i15 = i11 + 1;
                        i6 = (i4 <= i15 || (bArr[i15] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b12 = bArr[i11 + 1];
                        if ((b12 & 192) == 128) {
                            byte b13 = bArr[i14];
                            if ((b13 & 192) == 128) {
                                int i16 = (b8 << 12) ^ ((b13 ^ (-123008)) ^ (b12 << 6));
                                yield.invoke(Character.valueOf((i16 >= 2048 && (55296 > i16 || i16 >= 57344)) ? (char) i16 : (char) REPLACEMENT_CODE_POINT));
                                Unit unit4 = Unit.f18162a;
                                i6 = 3;
                            } else {
                                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                                Unit unit5 = Unit.f18162a;
                            }
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            Unit unit6 = Unit.f18162a;
                        }
                    }
                } else if ((b8 >> 3) == -2) {
                    int i17 = i11 + 3;
                    if (i4 <= i17) {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        Unit unit7 = Unit.f18162a;
                        int i18 = i11 + 1;
                        if (i4 > i18 && (bArr[i18] & 192) == 128) {
                            int i19 = i11 + 2;
                            i10 = (i4 <= i19 || (bArr[i19] & 192) != 128) ? 2 : 3;
                        }
                        i10 = 1;
                    } else {
                        byte b14 = bArr[i11 + 1];
                        if ((b14 & 192) == 128) {
                            byte b15 = bArr[i11 + 2];
                            if ((b15 & 192) == 128) {
                                byte b16 = bArr[i17];
                                if ((b16 & 192) == 128) {
                                    int i20 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b8 << 18);
                                    if (i20 <= 1114111 && ((55296 > i20 || i20 >= 57344) && i20 >= 65536 && i20 != 65533)) {
                                        yield.invoke(Character.valueOf((char) ((i20 >>> 10) + HIGH_SURROGATE_HEADER)));
                                        yield.invoke(Character.valueOf((char) ((i20 & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + LOG_SURROGATE_HEADER)));
                                    } else {
                                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    }
                                    Unit unit8 = Unit.f18162a;
                                    i10 = 4;
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                    Unit unit9 = Unit.f18162a;
                                }
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                Unit unit10 = Unit.f18162a;
                            }
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            Unit unit11 = Unit.f18162a;
                            i10 = 1;
                        }
                    }
                    i11 += i10;
                } else {
                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    i11++;
                }
                i11 += i6;
            }
        }
    }

    public static final void processUtf8Bytes(String str, int i, int i4, Function1<? super Byte, Unit> yield) {
        int i6;
        char cCharAt;
        j.g(str, "<this>");
        j.g(yield, "yield");
        while (i < i4) {
            char cCharAt2 = str.charAt(i);
            if (j.i(cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i++;
                while (i < i4 && j.i(str.charAt(i), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (j.i(cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (j.i(cCharAt2, 56319) > 0 || i4 <= (i6 = i + 1) || 56320 > (cCharAt = str.charAt(i6)) || cCharAt >= 57344) {
                    yield.invoke(Byte.valueOf(REPLACEMENT_BYTE));
                } else {
                    int iCharAt = (str.charAt(i6) + (cCharAt2 << '\n')) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | PsExtractor.VIDEO_STREAM_MASK)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i += 2;
                }
                i++;
            }
        }
    }

    public static final void processUtf8CodePoints(byte[] bArr, int i, int i4, Function1<? super Integer, Unit> yield) {
        int i6;
        int i10;
        j.g(bArr, "<this>");
        j.g(yield, "yield");
        int i11 = i;
        while (i11 < i4) {
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                yield.invoke(Integer.valueOf(b8));
                i11++;
                while (i11 < i4) {
                    byte b10 = bArr[i11];
                    if (b10 >= 0) {
                        i11++;
                        yield.invoke(Integer.valueOf(b10));
                    }
                }
            } else {
                if ((b8 >> 5) == -2) {
                    int i12 = i11 + 1;
                    if (i4 > i12) {
                        byte b11 = bArr[i12];
                        if ((b11 & 192) == 128) {
                            int i13 = (b8 << 6) ^ (b11 ^ 3968);
                            yield.invoke(i13 < 128 ? Integer.valueOf(REPLACEMENT_CODE_POINT) : Integer.valueOf(i13));
                            Unit unit = Unit.f18162a;
                        }
                    }
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    Unit unit2 = Unit.f18162a;
                } else if ((b8 >> 4) == -2) {
                    int i14 = i11 + 2;
                    if (i4 <= i14) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        Unit unit3 = Unit.f18162a;
                        int i15 = i11 + 1;
                        i6 = (i4 <= i15 || (bArr[i15] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b12 = bArr[i11 + 1];
                        if ((b12 & 192) == 128) {
                            byte b13 = bArr[i14];
                            if ((b13 & 192) == 128) {
                                int i16 = (b8 << 12) ^ ((b13 ^ (-123008)) ^ (b12 << 6));
                                yield.invoke((i16 >= 2048 && (55296 > i16 || i16 >= 57344)) ? Integer.valueOf(i16) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                Unit unit4 = Unit.f18162a;
                                i6 = 3;
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                Unit unit5 = Unit.f18162a;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            Unit unit6 = Unit.f18162a;
                        }
                    }
                } else if ((b8 >> 3) == -2) {
                    int i17 = i11 + 3;
                    if (i4 <= i17) {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        Unit unit7 = Unit.f18162a;
                        int i18 = i11 + 1;
                        if (i4 > i18 && (bArr[i18] & 192) == 128) {
                            int i19 = i11 + 2;
                            i10 = (i4 <= i19 || (bArr[i19] & 192) != 128) ? 2 : 3;
                        }
                        i10 = 1;
                    } else {
                        byte b14 = bArr[i11 + 1];
                        if ((b14 & 192) == 128) {
                            byte b15 = bArr[i11 + 2];
                            if ((b15 & 192) == 128) {
                                byte b16 = bArr[i17];
                                if ((b16 & 192) == 128) {
                                    int i20 = (((b16 ^ 3678080) ^ (b15 << 6)) ^ (b14 << 12)) ^ (b8 << 18);
                                    yield.invoke((i20 <= 1114111 && (55296 > i20 || i20 >= 57344) && i20 >= 65536) ? Integer.valueOf(i20) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    Unit unit8 = Unit.f18162a;
                                    i10 = 4;
                                } else {
                                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                    Unit unit9 = Unit.f18162a;
                                }
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                Unit unit10 = Unit.f18162a;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            Unit unit11 = Unit.f18162a;
                            i10 = 1;
                        }
                    }
                    i11 += i10;
                } else {
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    i11++;
                }
                i11 += i6;
            }
        }
    }

    public static final long size(String str) {
        j.g(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i, int i4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i4 = str.length();
        }
        return size(str, i, i4);
    }

    public static final long size(String str, int i) {
        j.g(str, "<this>");
        return size$default(str, i, 0, 2, null);
    }

    public static final long size(String str, int i, int i4) {
        int i6;
        j.g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(s.f(i, "beginIndex < 0: ").toString());
        }
        if (i4 >= i) {
            if (i4 > str.length()) {
                StringBuilder sbT = s.t(i4, "endIndex > string.length: ", " > ");
                sbT.append(str.length());
                throw new IllegalArgumentException(sbT.toString().toString());
            }
            long j = 0;
            while (i < i4) {
                char cCharAt = str.charAt(i);
                if (cCharAt < 128) {
                    j++;
                } else {
                    if (cCharAt < 2048) {
                        i6 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i6 = 3;
                    } else {
                        int i10 = i + 1;
                        char cCharAt2 = i10 < i4 ? str.charAt(i10) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j++;
                            i = i10;
                        } else {
                            j += (long) 4;
                            i += 2;
                        }
                    }
                    j += (long) i6;
                }
                i++;
            }
            return j;
        }
        throw new IllegalArgumentException(a.c(i4, i, "endIndex < beginIndex: ", " < ").toString());
    }
}
