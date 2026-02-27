package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class IntRange extends c implements wj.d {
    public static final a e = new a(null);
    public static final IntRange f = new IntRange(1, 0, 1);

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final boolean a(int i) {
        return this.f18201a <= i && i <= this.f18202b;
    }

    @Override // kotlin.ranges.c
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        if (this.f18201a == intRange.f18201a) {
            return this.f18202b == intRange.f18202b;
        }
        return false;
    }

    @Override // wj.d
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.f18202b);
    }

    @Override // wj.d
    public final Comparable getStart() {
        return Integer.valueOf(this.f18201a);
    }

    @Override // kotlin.ranges.c
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f18201a * 31) + this.f18202b;
    }

    @Override // kotlin.ranges.c
    public final boolean isEmpty() {
        return this.f18201a > this.f18202b;
    }

    @Override // kotlin.ranges.c
    public final String toString() {
        return this.f18201a + ".." + this.f18202b;
    }
}
