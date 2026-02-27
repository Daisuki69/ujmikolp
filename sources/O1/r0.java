package O1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 extends s0 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r0 f4604b = new r0(0);
    public static final r0 c = new r0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4605a;

    public /* synthetic */ r0(int i) {
        this.f4605a = i;
    }

    @Override // O1.s0
    public final s0 a() {
        switch (this.f4605a) {
            case 0:
                return c;
            default:
                return f4604b;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4605a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f4605a) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
