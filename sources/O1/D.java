package O1;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends s0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f4538a;

    public D(Comparator comparator) {
        this.f4538a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4538a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D) {
            return this.f4538a.equals(((D) obj).f4538a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4538a.hashCode();
    }

    public final String toString() {
        return this.f4538a.toString();
    }
}
