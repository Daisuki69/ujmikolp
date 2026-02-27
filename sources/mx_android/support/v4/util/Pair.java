package mx_android.support.v4.util;

/* JADX INFO: loaded from: classes7.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f, S s9) {
        this.first = f;
        this.second = s9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return objectsEqual(pair.first, this.first) && objectsEqual(pair.second, this.second);
    }

    private static boolean objectsEqual(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int hashCode() {
        F f = this.first;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s9 = this.second;
        return iHashCode ^ (s9 != null ? s9.hashCode() : 0);
    }

    public static <A, B> Pair<A, B> create(A a8, B b8) {
        return new Pair<>(a8, b8);
    }
}
