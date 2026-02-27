package Xi;

import Ui.k;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6680a;

    public d(Collection collection) {
        HashSet hashSet = new HashSet();
        this.f6680a = hashSet;
        if (collection == null) {
            throw new IllegalArgumentException("Null whitelist");
        }
        hashSet.addAll(collection);
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        if (!(obj instanceof String)) {
            return false;
        }
        HashSet<String> hashSet = this.f6680a;
        if (hashSet.isEmpty()) {
            return false;
        }
        String str = (String) obj;
        for (String str2 : hashSet) {
            if (!str2.isEmpty() && str.startsWith(str2)) {
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
        if (obj instanceof d) {
            return this.f6680a.equals(((d) obj).f6680a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6680a.hashCode() + 527;
    }

    public final String toString() {
        return "starts with " + this.f6680a;
    }
}
