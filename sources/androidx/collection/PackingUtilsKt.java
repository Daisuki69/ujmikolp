package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: loaded from: classes.dex */
public final class PackingUtilsKt {
    public static final long packFloats(float f, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & KeyboardMap.kValueMask) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long packInts(int i, int i4) {
        return (((long) i4) & KeyboardMap.kValueMask) | (((long) i) << 32);
    }
}
