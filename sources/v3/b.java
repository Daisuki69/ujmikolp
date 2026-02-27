package V3;

import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6046b;

    public b(int i, ArrayList arrayList) {
        this.f6045a = new ArrayList(arrayList);
        this.f6046b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && this.f6045a.equals(((b) obj).f6045a);
    }

    public final int hashCode() {
        return this.f6045a.hashCode() ^ Boolean.FALSE.hashCode();
    }

    public final String toString() {
        return numX49.tnTj78("bLeP") + this.f6045a + numX49.tnTj78("bLeb");
    }
}
