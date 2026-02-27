package androidx.emoji2.text.flatbuffer;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    public static class DecodeUtil {
        public static void handleFourBytes(byte b8, byte b10, byte b11, byte b12, char[] cArr, int i) throws IllegalArgumentException {
            if (!isNotTrailingByte(b10)) {
                if ((((b10 + 112) + (b8 << 28)) >> 30) == 0 && !isNotTrailingByte(b11) && !isNotTrailingByte(b12)) {
                    int iTrailingByteValue = ((b8 & 7) << 18) | (trailingByteValue(b10) << 12) | (trailingByteValue(b11) << 6) | trailingByteValue(b12);
                    cArr[i] = highSurrogate(iTrailingByteValue);
                    cArr[i + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void handleOneByte(byte b8, char[] cArr, int i) {
            cArr[i] = (char) b8;
        }

        public static void handleThreeBytes(byte b8, byte b10, byte b11, char[] cArr, int i) throws IllegalArgumentException {
            if (isNotTrailingByte(b10) || ((b8 == -32 && b10 < -96) || ((b8 == -19 && b10 >= -96) || isNotTrailingByte(b11)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b8 & 15) << 12) | (trailingByteValue(b10) << 6) | trailingByteValue(b11));
        }

        public static void handleTwoBytes(byte b8, byte b10, char[] cArr, int i) throws IllegalArgumentException {
            if (b8 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b10)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b8 & 31) << 6) | trailingByteValue(b10));
        }

        private static char highSurrogate(int i) {
            return (char) ((i >>> 10) + okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b8) {
            return b8 > -65;
        }

        public static boolean isOneByte(byte b8) {
            return b8 >= 0;
        }

        public static boolean isThreeBytes(byte b8) {
            return b8 < -16;
        }

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

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i4) {
            super(androidx.camera.core.impl.a.c(i, i4, "Unpaired surrogate at index ", " of "));
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i, int i4);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
