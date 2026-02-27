package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m46boximpl(long j) {
        return new FloatFloatPair(j);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m47component1impl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m48component2impl(long j) {
        return Float.intBitsToFloat((int) (j & KeyboardMap.kValueMask));
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m50constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m51equalsimpl(long j, Object obj) {
        return (obj instanceof FloatFloatPair) && j == ((FloatFloatPair) obj).m57unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m52equalsimpl0(long j, long j6) {
        return j == j6;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final float m53getFirstimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final float m54getSecondimpl(long j) {
        return Float.intBitsToFloat((int) (j & KeyboardMap.kValueMask));
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m55hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m56toStringimpl(long j) {
        return "(" + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & KeyboardMap.kValueMask)) + ')';
    }

    public boolean equals(Object obj) {
        return m51equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m55hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m56toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m57unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m49constructorimpl(float f, float f3) {
        return m50constructorimpl((((long) Float.floatToRawIntBits(f3)) & KeyboardMap.kValueMask) | (Float.floatToRawIntBits(f) << 32));
    }
}
