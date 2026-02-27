package n1;

import android.util.Pair;
import com.paymaya.domain.model.MfaTencentErrorResult;

/* JADX INFO: renamed from: n1.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1894G {
    public int a(boolean z4) {
        return n() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z4) {
        if (n()) {
            return -1;
        }
        return m() - 1;
    }

    public int d(int i, int i4, boolean z4) {
        if (i4 == 0) {
            if (i == c(z4)) {
                return -1;
            }
            return i + 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == c(z4) ? a(z4) : i + 1;
        }
        throw new IllegalStateException();
    }

    public abstract C1892E e(int i, C1892E c1892e, boolean z4);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AbstractC1894G) {
                AbstractC1894G abstractC1894G = (AbstractC1894G) obj;
                if (abstractC1894G.m() == m() && abstractC1894G.g() == g()) {
                    C1893F c1893f = new C1893F();
                    C1892E c1892e = new C1892E();
                    C1893F c1893f2 = new C1893F();
                    C1892E c1892e2 = new C1892E();
                    int i = 0;
                    while (true) {
                        if (i >= m()) {
                            for (int i4 = 0; i4 < g(); i4++) {
                                if (e(i4, c1892e, true).equals(abstractC1894G.e(i4, c1892e2, true))) {
                                }
                            }
                        } else {
                            if (!k(i, c1893f, 0L).equals(abstractC1894G.k(i, c1893f2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C1892E f(Object obj, C1892E c1892e) {
        return e(b(obj), c1892e, true);
    }

    public abstract int g();

    public final Pair h(C1893F c1893f, C1892E c1892e, int i, long j) {
        int iM = m();
        if (i < 0 || i >= iM) {
            throw new IndexOutOfBoundsException();
        }
        k(i, c1893f, 0L);
        if (j == androidx.media3.common.C.TIME_UNSET) {
            c1893f.getClass();
            j = 0;
        }
        int i4 = c1893f.i;
        long j6 = e(i4, c1892e, true).f18554d;
        while (j6 != androidx.media3.common.C.TIME_UNSET && j >= j6 && i4 < c1893f.j) {
            j -= j6;
            i4++;
            j6 = e(i4, c1892e, true).f18554d;
        }
        Object obj = c1892e.f18553b;
        obj.getClass();
        Pair pairCreate = Pair.create(obj, Long.valueOf(j));
        pairCreate.getClass();
        return pairCreate;
    }

    public final int hashCode() {
        C1893F c1893f = new C1893F();
        C1892E c1892e = new C1892E();
        int iM = m() + MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT;
        for (int i = 0; i < m(); i++) {
            iM = (iM * 31) + k(i, c1893f, 0L).hashCode();
        }
        int iG = g() + (iM * 31);
        for (int i4 = 0; i4 < g(); i4++) {
            iG = (iG * 31) + e(i4, c1892e, true).hashCode();
        }
        return iG;
    }

    public int i(int i, int i4, boolean z4) {
        if (i4 == 0) {
            if (i == a(z4)) {
                return -1;
            }
            return i - 1;
        }
        if (i4 == 1) {
            return i;
        }
        if (i4 == 2) {
            return i == a(z4) ? c(z4) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object j(int i);

    public abstract C1893F k(int i, C1893F c1893f, long j);

    public final void l(int i, C1893F c1893f) {
        k(i, c1893f, 0L);
    }

    public abstract int m();

    public final boolean n() {
        return m() == 0;
    }
}
