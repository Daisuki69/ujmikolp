package uj;

import java.io.Serializable;
import kj.AbstractC1785b;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: uj.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC2324c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20347a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2324c f20348b = AbstractC1785b.f18153a.b();

    /* JADX INFO: renamed from: uj.c$a */
    public static final class a extends AbstractC2324c implements Serializable {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Override // uj.AbstractC2324c
        public final int a(int i) {
            return AbstractC2324c.f20348b.a(i);
        }

        @Override // uj.AbstractC2324c
        public final float b() {
            return AbstractC2324c.f20348b.b();
        }

        @Override // uj.AbstractC2324c
        public final int c() {
            return AbstractC2324c.f20348b.c();
        }

        @Override // uj.AbstractC2324c
        public final int d(int i) {
            return AbstractC2324c.f20348b.d(i);
        }

        @Override // uj.AbstractC2324c
        public final int e(int i, int i4) {
            return AbstractC2324c.f20348b.e(i, i4);
        }
    }

    public abstract int a(int i);

    public float b() {
        return a(24) / 1.6777216E7f;
    }

    public int c() {
        return a(32);
    }

    public int d(int i) {
        return e(0, i);
    }

    public int e(int i, int i4) {
        int iC;
        int i6;
        int iA;
        if (i4 <= i) {
            throw new IllegalArgumentException(("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i4) + ").").toString());
        }
        int i10 = i4 - i;
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            if (((-i10) & i10) == i10) {
                iA = a(31 - Integer.numberOfLeadingZeros(i10));
            } else {
                do {
                    iC = c() >>> 1;
                    i6 = iC % i10;
                } while ((i10 - 1) + (iC - i6) < 0);
                iA = i6;
            }
            return i + iA;
        }
        while (true) {
            int iC2 = c();
            if (i <= iC2 && iC2 < i4) {
                return iC2;
            }
        }
    }
}
