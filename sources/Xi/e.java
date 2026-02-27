package Xi;

import Ui.k;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f6681a;

    public e(Collection collection) {
        HashSet hashSet = new HashSet();
        this.f6681a = hashSet;
        if (collection == null) {
            throw new IllegalArgumentException("Null whitelist parameter");
        }
        hashSet.addAll(collection);
    }

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        return this.f6681a.contains(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f6681a.equals(((e) obj).f6681a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6681a.hashCode() + 527;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("in segment [");
        boolean z4 = true;
        for (String str : this.f6681a) {
            if (!z4) {
                sb2.append(',');
            }
            sb2.append('\"');
            sb2.append(str);
            sb2.append('\"');
            z4 = false;
        }
        sb2.append("]");
        return sb2.toString();
    }
}
