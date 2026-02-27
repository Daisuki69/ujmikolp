package Vi;

import Ui.k;
import Ui.l;
import dOYHB6.tiZVw8.numX49;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6132a;

    public c(Collection collection) {
        HashSet hashSet = new HashSet();
        this.f6132a = hashSet;
        if (collection == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bka2"));
        }
        hashSet.addAll(collection);
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        if (obj instanceof Collection) {
            return l.d((Collection) obj).equals(this.f6132a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f6132a.equals(((c) obj).f6132a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6132a.hashCode() + 527;
    }

    public final String toString() {
        return numX49.tnTj78("bkaL") + this.f6132a;
    }
}
