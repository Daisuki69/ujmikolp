package N1;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3497a;

    public k(List list) {
        this.f3497a = list;
    }

    @Override // N1.j
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f3497a;
            if (i >= list.size()) {
                return true;
            }
            if (!((j) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f3497a.equals(((k) obj).f3497a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3497a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.f3497a) {
            if (!z4) {
                sb2.append(',');
            }
            sb2.append(obj);
            z4 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
