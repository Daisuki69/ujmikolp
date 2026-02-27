package androidx.core.util;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f, S s9) {
        this.first = f;
        this.second = s9;
    }

    public static <A, B> Pair<A, B> create(A a8, B b8) {
        return new Pair<>(a8, b8);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f = this.first;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s9 = this.second;
        return iHashCode ^ (s9 != null ? s9.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.first);
        sb2.append(Global.BLANK);
        return androidx.camera.core.impl.a.m(sb2, this.second, "}");
    }
}
