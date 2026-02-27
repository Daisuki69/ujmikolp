package Si;

import We.s;
import bg.AbstractC0983W;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5740a = 0;

    public static void a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 == null) {
            str2 = numX49.tnTj78("bkbF");
        }
        sb2.append(str2);
        sb2.append(numX49.tnTj78("bkbH"));
        sb2.append(str);
        Ri.a.g(sb2.toString());
    }

    public static Cg.c b(String str) {
        if (str == null) {
            return new Cg.c(200, numX49.tnTj78("bkbO"), false);
        }
        if (AbstractC0983W.q(str.trim())) {
            return new Cg.c(200, numX49.tnTj78("bkbQ"), false);
        }
        if (str.trim().length() != str.length()) {
            return new Cg.c(100, s.j(numX49.tnTj78("bkbt"), str, numX49.tnTj78("bkbU")), true);
        }
        return null;
    }

    public static void c(Cg.c cVar, String str) {
        Iterator it = new ArrayList(((HashMap) cVar.f769d).values()).iterator();
        while (it.hasNext()) {
            d(str, (String) it.next());
        }
    }

    public static void d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str2 == null) {
            str2 = numX49.tnTj78("bkbe");
        }
        sb2.append(str2);
        sb2.append(numX49.tnTj78("bkb8"));
        sb2.append(str);
        Ri.a.q(sb2.toString());
    }
}
