package x;

import ag.C0692b;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import k2.v0;
import n.C1880g;
import pg.C2038a;
import t.C2265b;
import y.C2495b;
import z.AbstractC2544f;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2446a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2038a f20808a = C2038a.h(numX49.tnTj78("bbNPc"), "x", "y");

    public static C0692b a(C2495b c2495b, C1880g c1880g) {
        ArrayList arrayList = new ArrayList();
        if (c2495b.peek() == 1) {
            c2495b.b();
            while (c2495b.i()) {
                C2495b c2495b2 = c2495b;
                C1880g c1880g2 = c1880g;
                arrayList.add(new q.l(c1880g2, o.b(c2495b2, c1880g2, AbstractC2544f.c(), f.e, c2495b.peek() == 3, false)));
                c2495b = c2495b2;
                c1880g = c1880g2;
            }
            c2495b.f();
            p.b(arrayList);
        } else {
            arrayList.add(new A.a(n.b(c2495b, AbstractC2544f.c())));
        }
        return new C0692b(2, arrayList);
    }

    public static t.e b(C2495b c2495b, C1880g c1880g) {
        c2495b.c();
        C0692b c0692bA = null;
        C2265b c2265bW = null;
        boolean z4 = false;
        C2265b c2265bW2 = null;
        while (c2495b.peek() != 4) {
            int iW = c2495b.w(f20808a);
            if (iW == 0) {
                c0692bA = a(c2495b, c1880g);
            } else if (iW != 1) {
                if (iW != 2) {
                    c2495b.y();
                    c2495b.z();
                } else if (c2495b.peek() == 6) {
                    c2495b.z();
                    z4 = true;
                } else {
                    c2265bW = v0.w(c2495b, c1880g, true);
                }
            } else if (c2495b.peek() == 6) {
                c2495b.z();
                z4 = true;
            } else {
                c2265bW2 = v0.w(c2495b, c1880g, true);
            }
        }
        c2495b.g();
        if (z4) {
            c1880g.a(numX49.tnTj78("bbNPm"));
        }
        return c0692bA != null ? c0692bA : new t.c(c2265bW2, c2265bW);
    }
}
