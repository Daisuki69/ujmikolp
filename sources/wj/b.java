package wj;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        ((b) obj).getClass();
        return true;
    }

    @Override // wj.d
    public final Comparable getEndInclusive() {
        return Float.valueOf(1.0f);
    }

    @Override // wj.d
    public final Comparable getStart() {
        return Float.valueOf(0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "0.0..1.0";
    }
}
