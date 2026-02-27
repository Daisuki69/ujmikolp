package O1;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: O1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0528w extends s0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N1.g f4611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f4612b;

    public C0528w(N1.g gVar, s0 s0Var) {
        this.f4611a = gVar;
        this.f4612b = s0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        N1.g gVar = this.f4611a;
        return this.f4612b.compare(gVar.apply(obj), gVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0528w) {
            C0528w c0528w = (C0528w) obj;
            if (this.f4611a.equals(c0528w.f4611a) && this.f4612b.equals(c0528w.f4612b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4611a, this.f4612b});
    }

    public final String toString() {
        return this.f4612b + ".onResultOf(" + this.f4611a + ")";
    }
}
