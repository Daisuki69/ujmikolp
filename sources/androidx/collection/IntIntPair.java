package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    private /* synthetic */ IntIntPair(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntIntPair m58boximpl(long j) {
        return new IntIntPair(j);
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m59component1impl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m60component2impl(long j) {
        return (int) (j & KeyboardMap.kValueMask);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m62constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m63equalsimpl(long j, Object obj) {
        return (obj instanceof IntIntPair) && j == ((IntIntPair) obj).m69unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m64equalsimpl0(long j, long j6) {
        return j == j6;
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final int m65getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final int m66getSecondimpl(long j) {
        return (int) (j & KeyboardMap.kValueMask);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m67hashCodeimpl(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m68toStringimpl(long j) {
        return "(" + m65getFirstimpl(j) + ", " + m66getSecondimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m63equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m67hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m68toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m69unboximpl() {
        return this.packedValue;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m61constructorimpl(int i, int i4) {
        return m62constructorimpl((((long) i4) & KeyboardMap.kValueMask) | (((long) i) << 32));
    }
}
