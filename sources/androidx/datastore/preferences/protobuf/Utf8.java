package androidx.datastore.preferences.protobuf;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b8, byte b10, byte b11, byte b12, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b10)) {
                if ((((b10 + 112) + (b8 << 28)) >> 30) == 0 && !isNotTrailingByte(b11) && !isNotTrailingByte(b12)) {
                    int iTrailingByteValue = ((b8 & 7) << 18) | (trailingByteValue(b10) << 12) | (trailingByteValue(b11) << 6) | trailingByteValue(b12);
                    cArr[i] = highSurrogate(iTrailingByteValue);
                    cArr[i + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b8, char[] cArr, int i) {
            cArr[i] = (char) b8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b8, byte b10, byte b11, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b10) || ((b8 == -32 && b10 < -96) || ((b8 == -19 && b10 >= -96) || isNotTrailingByte(b11)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b8 & 15) << 12) | (trailingByteValue(b10) << 6) | trailingByteValue(b11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b8, byte b10, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b8 < -62 || isNotTrailingByte(b10)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b8 & 31) << 6) | trailingByteValue(b10));
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b8) {
            return b8 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b8) {
            return b8 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b8) {
            return b8 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b8) {
            return b8 < -32;
        }

        private static char lowSurrogate(int i) {
            return (char) ((i & AnalyticsListener.EVENT_DRM_KEYS_LOADED) + okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b8) {
            return b8 & okio.Utf8.REPLACEMENT_BYTE;
        }
    }

    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i4) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i4);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i, i4) : decodeUtf8Default(byteBuffer, i, i4);
        }

        public abstract String decodeUtf8(byte[] bArr, int i, int i4) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i4) throws InvalidProtocolBufferException {
            if ((i | i4 | ((byteBuffer.limit() - i) - i4)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i4)));
            }
            int i6 = i + i4;
            char[] cArr = new char[i4];
            int i10 = 0;
            while (i < i6) {
                byte b8 = byteBuffer.get(i);
                if (!DecodeUtil.isOneByte(b8)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b8, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i < i6) {
                int i12 = i + 1;
                byte b10 = byteBuffer.get(i);
                if (DecodeUtil.isOneByte(b10)) {
                    int i13 = i11 + 1;
                    DecodeUtil.handleOneByte(b10, cArr, i11);
                    while (i12 < i6) {
                        byte b11 = byteBuffer.get(i12);
                        if (!DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        i12++;
                        DecodeUtil.handleOneByte(b11, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i = i12;
                } else if (DecodeUtil.isTwoBytes(b10)) {
                    if (i12 >= i6) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b10, byteBuffer.get(i12), cArr, i11);
                    i11++;
                } else if (DecodeUtil.isThreeBytes(b10)) {
                    if (i12 >= i6 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i14 = i + 2;
                    i += 3;
                    DecodeUtil.handleThreeBytes(b10, byteBuffer.get(i12), byteBuffer.get(i14), cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i6 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b12 = byteBuffer.get(i12);
                    int i15 = i + 3;
                    byte b13 = byteBuffer.get(i + 2);
                    i += 4;
                    DecodeUtil.handleFourBytes(b10, b12, b13, byteBuffer.get(i15), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i4) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(String str, byte[] bArr, int i, int i4);

        public final void encodeUtf8(String str, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(str, byteBuffer);
            } else {
                encodeUtf8Default(str, byteBuffer);
            }
        }

        public final void encodeUtf8Default(String str, ByteBuffer byteBuffer) {
            int i;
            int length = str.length();
            int iPosition = byteBuffer.position();
            int i4 = 0;
            while (i4 < length) {
                try {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i4, (byte) cCharAt);
                    i4++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i4) + " at index " + (Math.max(i4, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            }
            if (i4 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i4);
                return;
            }
            iPosition += i4;
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i6 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                        byteBuffer.put(i6, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i6;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i6;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i4) + " at index " + (Math.max(i4, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i10 = i4 + 1;
                        if (i10 != length) {
                            try {
                                char cCharAt3 = str.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        i = iPosition + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i11;
                                        i4 = i10;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i4) + " at index " + (Math.max(i4, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
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
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i4) + " at index " + (Math.max(i4, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } else {
                                    i4 = i10;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new UnpairedSurrogateException(i4, length);
                    }
                    int i12 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i12, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i4++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        public abstract void encodeUtf8Direct(String str, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i, int i4) {
            return partialIsValidUtf8(0, bArr, i, i4) == 0;
        }

        public final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i4, int i6) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i, byteBuffer, i4, i6) : partialIsValidUtf8Default(i, byteBuffer, i4, i6);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i, byteBuffer.array(), i4 + iArrayOffset, iArrayOffset + i6);
        }

        public abstract int partialIsValidUtf8(int i, byte[] bArr, int i4, int i6);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i4, int i6);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i4) {
            return partialIsValidUtf8(0, byteBuffer, i, i4) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i4) {
            int iEstimateConsecutiveAscii = i + Utf8.estimateConsecutiveAscii(byteBuffer, i, i4);
            while (iEstimateConsecutiveAscii < i4) {
                int i6 = iEstimateConsecutiveAscii + 1;
                byte b8 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b8 >= 0) {
                    iEstimateConsecutiveAscii = i6;
                } else if (b8 < -32) {
                    if (i6 >= i4) {
                        return b8;
                    }
                    if (b8 < -62 || byteBuffer.get(i6) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b8 >= -16) {
                        if (i6 >= i4 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b8, i6, i4 - i6);
                        }
                        int i10 = iEstimateConsecutiveAscii + 2;
                        byte b10 = byteBuffer.get(i6);
                        if (b10 <= -65) {
                            if ((((b10 + 112) + (b8 << 28)) >> 30) == 0) {
                                int i11 = iEstimateConsecutiveAscii + 3;
                                if (byteBuffer.get(i10) <= -65) {
                                    iEstimateConsecutiveAscii += 4;
                                    if (byteBuffer.get(i11) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i6 >= i4 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b8, i6, i4 - i6);
                    }
                    int i12 = iEstimateConsecutiveAscii + 2;
                    byte b11 = byteBuffer.get(i6);
                    if (b11 > -65 || ((b8 == -32 && b11 < -96) || ((b8 == -19 && b11 >= -96) || byteBuffer.get(i12) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i4) {
            super(androidx.camera.core.impl.a.c(i, i4, "Unpaired surrogate at index ", " of "));
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i, int i4) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i, i4);
    }

    public static int encode(String str, byte[] bArr, int i, int i4) {
        return processor.encodeUtf8(str, bArr, i, i4);
    }

    public static void encodeUtf8(String str, ByteBuffer byteBuffer) {
        processor.encodeUtf8(str, byteBuffer);
    }

    public static int encodedLength(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(str, i);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(String str, int i) {
        int length = str.length();
        int i4 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
            } else {
                i4 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i, int i4) {
        int i6 = i4 - 7;
        int i10 = i;
        while (i10 < i6 && (byteBuffer.getLong(i10) & (-9187201950435737472L)) == 0) {
            i10 += 8;
        }
        return i10 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i, byte[] bArr, int i4, int i6) {
        return processor.partialIsValidUtf8(i, bArr, i4, i6);
    }

    public static String decodeUtf8(byte[] bArr, int i, int i4) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i4) {
        if (i > -12 || i4 > -65) {
            return -1;
        }
        return i ^ (i4 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i4) {
        return processor.isValidUtf8(bArr, i, i4);
    }

    public static int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i4, int i6) {
        return processor.partialIsValidUtf8(i, byteBuffer, i4, i6);
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
            int i4 = 0;
            if (i < 16) {
                return 0;
            }
            int i6 = 8 - (((int) j) & 7);
            while (i4 < i6) {
                long j6 = 1 + j;
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i4;
                }
                i4++;
                j = j6;
            }
            while (true) {
                int i10 = i4 + 8;
                if (i10 > i || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j += 8;
                i4 = i10;
            }
            while (i4 < i) {
                long j7 = j + 1;
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i4;
                }
                i4++;
                j = j7;
            }
            return i;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i4) {
            if (i4 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i4 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j));
            }
            if (i4 == 2) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(bArr, j), UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i, int i4) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i, i4, charset);
            if (str.indexOf(okio.Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i4 + i))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i4) throws InvalidProtocolBufferException {
            if ((i | i4 | ((byteBuffer.limit() - i) - i4)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i4)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i);
            long j = ((long) i4) + jAddressOffset;
            char[] cArr = new char[i4];
            int i6 = 0;
            while (jAddressOffset < j) {
                byte b8 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b8)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b8, cArr, i6);
                i6++;
            }
            int i10 = i6;
            while (jAddressOffset < j) {
                long j6 = jAddressOffset + 1;
                byte b10 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b10)) {
                    int i11 = i10 + 1;
                    DecodeUtil.handleOneByte(b10, cArr, i10);
                    while (j6 < j) {
                        byte b11 = UnsafeUtil.getByte(j6);
                        if (!DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        j6++;
                        DecodeUtil.handleOneByte(b11, cArr, i11);
                        i11++;
                    }
                    i10 = i11;
                    jAddressOffset = j6;
                } else if (DecodeUtil.isTwoBytes(b10)) {
                    if (j6 >= j) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b10, UnsafeUtil.getByte(j6), cArr, i10);
                    i10++;
                } else if (DecodeUtil.isThreeBytes(b10)) {
                    if (j6 >= j - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j7 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b10, UnsafeUtil.getByte(j6), UnsafeUtil.getByte(j7), cArr, i10);
                    i10++;
                } else {
                    if (j6 >= j - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b12 = UnsafeUtil.getByte(j6);
                    long j9 = jAddressOffset + 3;
                    byte b13 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b10, b12, b13, UnsafeUtil.getByte(j9), cArr, i10);
                    i10 += 2;
                }
            }
            return new String(cArr, 0, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int encodeUtf8(String str, byte[] bArr, int i, int i4) {
            long j;
            long j6;
            long j7;
            int i6;
            char cCharAt;
            long j9 = i;
            long j10 = ((long) i4) + j9;
            int length = str.length();
            if (length > i4 || bArr.length - i4 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i4));
            }
            int i10 = 0;
            while (true) {
                j = 1;
                if (i10 >= length || (cCharAt = str.charAt(i10)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j9, (byte) cCharAt);
                i10++;
                j9 = 1 + j9;
            }
            if (i10 == length) {
                return (int) j9;
            }
            while (i10 < length) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128 && j9 < j10) {
                    UnsafeUtil.putByte(bArr, j9, (byte) cCharAt2);
                    j7 = j10;
                    j6 = j;
                    j9 += j;
                } else if (cCharAt2 >= 2048 || j9 > j10 - 2) {
                    j6 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j9 > j10 - 3) {
                        j7 = j10;
                        if (j9 > j7 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i6 = i10 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i6)))) {
                                throw new UnpairedSurrogateException(i10, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j9);
                        }
                        int i11 = i10 + 1;
                        if (i11 != length) {
                            char cCharAt3 = str.charAt(i11);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(bArr, j9, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                UnsafeUtil.putByte(bArr, j9 + j6, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j11 = j9 + 3;
                                UnsafeUtil.putByte(bArr, j9 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j9 += 4;
                                UnsafeUtil.putByte(bArr, j11, (byte) ((codePoint & 63) | 128));
                                i10 = i11;
                            } else {
                                i10 = i11;
                            }
                        }
                        throw new UnpairedSurrogateException(i10 - 1, length);
                    }
                    UnsafeUtil.putByte(bArr, j9, (byte) ((cCharAt2 >>> '\f') | 480));
                    j7 = j10;
                    long j12 = j9 + 2;
                    UnsafeUtil.putByte(bArr, j9 + j6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j9 += 3;
                    UnsafeUtil.putByte(bArr, j12, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j6 = j;
                    long j13 = j9 + j6;
                    UnsafeUtil.putByte(bArr, j9, (byte) ((cCharAt2 >>> 6) | 960));
                    j9 += 2;
                    UnsafeUtil.putByte(bArr, j13, (byte) ((cCharAt2 & '?') | 128));
                    j7 = j10;
                }
                i10++;
                j = j6;
                j10 = j7;
            }
            return (int) j9;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            long j;
            char c;
            long j6;
            long j7;
            long j9;
            int i;
            char c10;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = str.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i4 = 0;
            while (true) {
                j = 1;
                c = 128;
                if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i4++;
                jPosition = 1 + jPosition;
            }
            if (i4 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 >= c || jPosition >= jLimit) {
                    j6 = j;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j10 = jPosition + j6;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j10, (byte) ((cCharAt2 & '?') | 128));
                        j7 = jAddressOffset;
                        j9 = jLimit;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            j7 = jAddressOffset;
                            j9 = jLimit;
                            if (jPosition > j9 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i)))) {
                                    throw new UnpairedSurrogateException(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i6 = i4 + 1;
                            if (i6 != length) {
                                char cCharAt3 = str.charAt(i6);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    c10 = 128;
                                    UnsafeUtil.putByte(jPosition + j6, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j11 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j11, (byte) ((codePoint & 63) | 128));
                                    i4 = i6;
                                } else {
                                    i4 = i6;
                                }
                            }
                            throw new UnpairedSurrogateException(i4 - 1, length);
                        }
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        j7 = jAddressOffset;
                        long j12 = jPosition + 2;
                        j9 = jLimit;
                        UnsafeUtil.putByte(jPosition + j6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        UnsafeUtil.putByte(j12, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c10 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    j7 = jAddressOffset;
                    j9 = jLimit;
                    c10 = c;
                    jPosition += j;
                    j6 = j;
                }
                i4++;
                c = c10;
                j = j6;
                jAddressOffset = j7;
                jLimit = j9;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r13, r1) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L57;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i4 = (int) ((-j) & 7);
            int i6 = i4;
            while (i6 > 0) {
                long j6 = 1 + j;
                if (UnsafeUtil.getByte(j) < 0) {
                    return i4 - i6;
                }
                i6--;
                j = j6;
            }
            int i10 = i - i4;
            while (i10 >= 8 && (UnsafeUtil.getLong(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i10 -= 8;
            }
            return i - i10;
        }

        private static int unsafeIncompleteStateFor(long j, int i, int i4) {
            if (i4 == 0) {
                return Utf8.incompleteStateFor(i);
            }
            if (i4 == 1) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j));
            }
            if (i4 == 2) {
                return Utf8.incompleteStateFor(i, UnsafeUtil.getByte(j), UnsafeUtil.getByte(j + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(long r10, int r12) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i, int i4, int i6) {
        if (i > -12 || i4 > -65 || i6 > -65) {
            return -1;
        }
        return (i ^ (i4 << 8)) ^ (i6 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i, int i4) {
        byte b8 = bArr[i - 1];
        int i6 = i4 - i;
        if (i6 == 0) {
            return incompleteStateFor(b8);
        }
        if (i6 == 1) {
            return incompleteStateFor(b8, bArr[i]);
        }
        if (i6 == 2) {
            return incompleteStateFor(b8, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i, int i4, int i6) {
        if (i6 == 0) {
            return incompleteStateFor(i);
        }
        if (i6 == 1) {
            return incompleteStateFor(i, byteBuffer.get(i4));
        }
        if (i6 == 2) {
            return incompleteStateFor(i, byteBuffer.get(i4), byteBuffer.get(i4 + 1));
        }
        throw new AssertionError();
    }

    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i4) {
            while (i < i4) {
                int i6 = i + 1;
                byte b8 = bArr[i];
                if (b8 < 0) {
                    if (b8 < -32) {
                        if (i6 >= i4) {
                            return b8;
                        }
                        if (b8 >= -62) {
                            i += 2;
                            if (bArr[i6] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b8 < -16) {
                        if (i6 >= i4 - 1) {
                            return Utf8.incompleteStateFor(bArr, i6, i4);
                        }
                        int i10 = i + 2;
                        byte b10 = bArr[i6];
                        if (b10 <= -65 && ((b8 != -32 || b10 >= -96) && (b8 != -19 || b10 < -96))) {
                            i += 3;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i6 >= i4 - 2) {
                        return Utf8.incompleteStateFor(bArr, i6, i4);
                    }
                    int i11 = i + 2;
                    byte b11 = bArr[i6];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b8 << 28)) >> 30) == 0) {
                            int i12 = i + 3;
                            if (bArr[i11] <= -65) {
                                i += 4;
                                if (bArr[i12] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i = i6;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i, int i4) throws InvalidProtocolBufferException {
            if ((i | i4 | ((bArr.length - i) - i4)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i4)));
            }
            int i6 = i + i4;
            char[] cArr = new char[i4];
            int i10 = 0;
            while (i < i6) {
                byte b8 = bArr[i];
                if (!DecodeUtil.isOneByte(b8)) {
                    break;
                }
                i++;
                DecodeUtil.handleOneByte(b8, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i < i6) {
                int i12 = i + 1;
                byte b10 = bArr[i];
                if (DecodeUtil.isOneByte(b10)) {
                    int i13 = i11 + 1;
                    DecodeUtil.handleOneByte(b10, cArr, i11);
                    while (i12 < i6) {
                        byte b11 = bArr[i12];
                        if (!DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        i12++;
                        DecodeUtil.handleOneByte(b11, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i = i12;
                } else if (DecodeUtil.isTwoBytes(b10)) {
                    if (i12 >= i6) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    DecodeUtil.handleTwoBytes(b10, bArr[i12], cArr, i11);
                    i11++;
                } else if (DecodeUtil.isThreeBytes(b10)) {
                    if (i12 >= i6 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i14 = i + 2;
                    i += 3;
                    DecodeUtil.handleThreeBytes(b10, bArr[i12], bArr[i14], cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i6 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b12 = bArr[i12];
                    int i15 = i + 3;
                    byte b13 = bArr[i + 2];
                    i += 4;
                    DecodeUtil.handleFourBytes(b10, b12, b13, bArr[i15], cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i4) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int encodeUtf8(String str, byte[] bArr, int i, int i4) {
            int i6;
            int i10;
            char cCharAt;
            int length = str.length();
            int i11 = i4 + i;
            int i12 = 0;
            while (i12 < length && (i10 = i12 + i) < i11 && (cCharAt = str.charAt(i12)) < 128) {
                bArr[i10] = (byte) cCharAt;
                i12++;
            }
            if (i12 == length) {
                return i + length;
            }
            int i13 = i + i12;
            while (i12 < length) {
                char cCharAt2 = str.charAt(i12);
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
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i6 = i12 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i6)))) {
                                throw new UnpairedSurrogateException(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i13);
                        }
                        int i15 = i12 + 1;
                        if (i15 != str.length()) {
                            char cCharAt3 = str.charAt(i15);
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
                        throw new UnpairedSurrogateException(i12 - 1, length);
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

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            encodeUtf8Default(str, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = androidx.datastore.preferences.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i4, int i6) {
            return partialIsValidUtf8Default(i, byteBuffer, i4, i6);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i, int i4) {
            while (i < i4 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i4) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i, i4);
        }
    }
}
