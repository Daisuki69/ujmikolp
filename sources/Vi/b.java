package Vi;

import Ui.k;
import Ui.l;
import dOYHB6.tiZVw8.numX49;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6131a;

    public b(Collection collection) {
        HashSet hashSet = new HashSet();
        this.f6131a = hashSet;
        if (collection == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bkak"));
        }
        hashSet.addAll(collection);
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        if (!(obj instanceof Collection)) {
            return false;
        }
        HashSet hashSetD = l.d((Collection) obj);
        Iterator it = this.f6131a.iterator();
        while (it.hasNext()) {
            if (hashSetD.contains((String) it.next())) {
                return true;
            }
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
        if (obj instanceof b) {
            return this.f6131a.equals(((b) obj).f6131a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6131a.hashCode() + 527;
    }

    public final String toString() {
        return numX49.tnTj78("bkaB") + this.f6131a;
    }
}
