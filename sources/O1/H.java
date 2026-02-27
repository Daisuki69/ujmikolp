package O1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends s0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator[] f4546a;

    public H(C0528w c0528w, C0528w c0528w2) {
        this.f4546a = new Comparator[]{c0528w, c0528w2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f4546a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H) {
            return Arrays.equals(this.f4546a, ((H) obj).f4546a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4546a);
    }

    public final String toString() {
        return We.s.p(new StringBuilder("Ordering.compound("), Arrays.toString(this.f4546a), ")");
    }
}
