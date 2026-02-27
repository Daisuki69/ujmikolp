package O1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class A0 extends s0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f4528a;

    public A0(s0 s0Var) {
        this.f4528a = s0Var;
    }

    @Override // O1.s0
    public final s0 a() {
        return this.f4528a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4528a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A0) {
            return this.f4528a.equals(((A0) obj).f4528a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f4528a.hashCode();
    }

    public final String toString() {
        return this.f4528a + ".reverse()";
    }
}
