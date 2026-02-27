package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18161b;

    public Pair(Object obj, Object obj2) {
        this.f18160a = obj;
        this.f18161b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return j.b(this.f18160a, pair.f18160a) && j.b(this.f18161b, pair.f18161b);
    }

    public final int hashCode() {
        Object obj = this.f18160a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f18161b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f18160a + ", " + this.f18161b + ')';
    }
}
