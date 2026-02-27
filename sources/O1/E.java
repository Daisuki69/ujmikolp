package O1;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends G {
    public static G g(int i) {
        return i < 0 ? G.f4544b : i > 0 ? G.c : G.f4543a;
    }

    @Override // O1.G
    public final G a(int i, int i4) {
        return g(i < i4 ? -1 : i > i4 ? 1 : 0);
    }

    @Override // O1.G
    public final G b(long j, long j6) {
        return g(j < j6 ? -1 : j > j6 ? 1 : 0);
    }

    @Override // O1.G
    public final G c(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // O1.G
    public final G d(boolean z4, boolean z5) {
        return g(z4 == z5 ? 0 : z4 ? 1 : -1);
    }

    @Override // O1.G
    public final G e(boolean z4, boolean z5) {
        return g(z5 == z4 ? 0 : z5 ? 1 : -1);
    }

    @Override // O1.G
    public final int f() {
        return 0;
    }
}
