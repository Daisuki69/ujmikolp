package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends kotlin.ranges.a implements wj.d {
    public static final a e = new a(null);

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new b((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f18198a == bVar.f18198a && this.f18199b == bVar.f18199b;
    }

    @Override // wj.d
    public final Comparable getEndInclusive() {
        return Character.valueOf(this.f18199b);
    }

    @Override // wj.d
    public final Comparable getStart() {
        return Character.valueOf(this.f18198a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f18198a * 31) + this.f18199b;
    }

    public final boolean isEmpty() {
        return j.i(this.f18198a, this.f18199b) > 0;
    }

    public final String toString() {
        return this.f18198a + ".." + this.f18199b;
    }
}
