package jh;

import Kh.I;
import n3.C1916a;
import p3.C2011b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M2.b f17815a = new M2.b(26);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Eh.b f17816b = new Eh.b(3);
    public static final C2011b c = new C2011b(25);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z2.d f17817d = new z2.d(25);
    public static final N4.d e = new N4.d(26);
    public static final mg.c f = new mg.c(26);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I f17818g = new I(26);
    public static final Vh.b h = new Vh.b(4);
    public static final B9.a i = new B9.a(12);
    public static final C1916a j = new C1916a(26);

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(int i4, String str) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(androidx.media3.datasource.cache.c.h(i4, str, " > 0 required but it was "));
        }
    }

    public static void d(long j6, String str) {
        if (j6 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j6);
    }
}
