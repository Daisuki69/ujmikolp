package Je;

import k3.C1757b;
import kotlin.jvm.internal.j;
import zj.o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f2514a;

    static {
        new o("\\d+");
        f2514a = new o("^((\\+?63)|0)?\\d{10}$");
    }

    public static final String a(String number) {
        j.g(number, "number");
        C1757b c1757bB = C1757b.b();
        try {
            String strA = c1757bB.a(c1757bB.i(number, "PH"), 1);
            j.d(strA);
            return strA;
        } catch (Exception e) {
            e.toString();
            yk.a.d();
            return "";
        }
    }
}
