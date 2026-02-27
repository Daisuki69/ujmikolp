package Vi;

import Ui.k;
import Ui.l;
import dOYHB6.tiZVw8.numX49;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6133a;

    public d(Collection collection) {
        HashSet hashSet = new HashSet();
        this.f6133a = hashSet;
        if (collection == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bkar"));
        }
        hashSet.addAll(collection);
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        if (!(obj instanceof Collection)) {
            return false;
        }
        HashSet hashSetD = l.d((Collection) obj);
        if (hashSetD.isEmpty()) {
            return false;
        }
        return this.f6133a.containsAll(hashSetD);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f6133a.equals(((d) obj).f6133a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6133a.hashCode() + 527;
    }

    public final String toString() {
        return numX49.tnTj78("bkaZ") + this.f6133a;
    }
}
