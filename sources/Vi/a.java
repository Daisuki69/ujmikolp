package Vi;

import Ui.k;
import Ui.l;
import dOYHB6.tiZVw8.numX49;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6130a;

    public a(Collection collection) {
        HashSet hashSet = new HashSet();
        this.f6130a = hashSet;
        if (collection == null) {
            throw new IllegalArgumentException(numX49.tnTj78("bkaP"));
        }
        hashSet.addAll(collection);
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        if (!(obj instanceof Collection)) {
            return false;
        }
        HashSet hashSet = this.f6130a;
        if (hashSet.isEmpty()) {
            return false;
        }
        return l.d((Collection) obj).containsAll(hashSet);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f6130a.equals(((a) obj).f6130a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6130a.hashCode() + 527;
    }

    public final String toString() {
        return numX49.tnTj78("bkab") + this.f6130a;
    }
}
