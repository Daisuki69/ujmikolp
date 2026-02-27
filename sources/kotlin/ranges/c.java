package kotlin.ranges;

import java.util.Iterator;
import kj.AbstractC1785b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rj.InterfaceC2210a;
import wj.e;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Iterable<Integer>, InterfaceC2210a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f18200d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18202b;
    public final int c;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c(int i, int i4, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f18201a = i;
        this.f18202b = AbstractC1785b.a(i, i4, i6);
        this.c = i6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f18201a == cVar.f18201a && this.f18202b == cVar.f18202b && this.c == cVar.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f18201a * 31) + this.f18202b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.c;
        int i4 = this.f18202b;
        int i6 = this.f18201a;
        return i > 0 ? i6 > i4 : i6 < i4;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new e(this.f18201a, this.f18202b, this.c);
    }

    public String toString() {
        StringBuilder sb2;
        int i = this.f18202b;
        int i4 = this.f18201a;
        int i6 = this.c;
        if (i6 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i4);
            sb2.append("..");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(i6);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i4);
            sb2.append(" downTo ");
            sb2.append(i);
            sb2.append(" step ");
            sb2.append(-i6);
        }
        return sb2.toString();
    }
}
