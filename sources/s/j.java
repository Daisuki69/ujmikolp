package s;

import androidx.core.util.Pair;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19982b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = this.f19981a;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = pair.second;
        Object obj5 = this.f19982b;
        if (obj4 != obj5) {
            return obj4 != null && obj4.equals(obj5);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f19981a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f19982b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return numX49.tnTj78("b2fP") + String.valueOf(this.f19981a) + numX49.tnTj78("b2fb") + String.valueOf(this.f19982b) + "}";
    }
}
