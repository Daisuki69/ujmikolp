package D;

import android.util.Log;
import bg.AbstractC0983W;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import ph.C2055b2;
import ph.S1;
import ph.W1;
import x.InterfaceC2445C;

/* JADX INFO: loaded from: classes2.dex */
public class S implements M5.f, S1, InterfaceC2445C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f865a;

    public /* synthetic */ S(int i) {
        this.f865a = i;
    }

    public static void b(String str) {
        if (C0187u.c > 0) {
            Log.d(numX49.tnTj78("PekP"), str);
        }
    }

    public static void c(String str, String str2) {
        if (C0187u.c > 0) {
            Log.d(numX49.tnTj78("Pekb") + str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (C0187u.c > 0) {
            Log.d(numX49.tnTj78("Pek2").concat(str), str2, th2);
        }
    }

    public static void f(String str) {
        if (C0187u.c > 0) {
            Log.d(numX49.tnTj78("PekL"), str);
        }
    }

    public static void g(String str, String str2) {
        if (C0187u.c > 0) {
            int length = str2.length();
            String strTnTj78 = numX49.tnTj78("Pekr");
            if (length > 4000) {
                Log.d(AbstractC1414e.h(strTnTj78, str), str2.substring(0, 4000));
                g(str, str2.substring(4000));
            } else {
                Log.d(strTnTj78 + str, str2);
            }
        }
    }

    public static void h(String str, String str2, Throwable th2) {
        if (C0187u.c > 0) {
            Log.d(numX49.tnTj78("PekZ") + str, str2, th2);
        }
    }

    public static void i(String str) {
        if (C0187u.c >= 0) {
            Log.i(numX49.tnTj78("Pekk"), str);
        }
    }

    public static void l(String str) {
        if (C0187u.c > 2) {
            Log.v(numX49.tnTj78("PekB"), str);
        }
    }

    public static void m(String str, String str2) {
        if (C0187u.c > 2) {
            Log.v(numX49.tnTj78("Peku") + str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        if (C0187u.c > 2) {
            Log.v(numX49.tnTj78("PekV") + str, str2, th2);
        }
    }

    public static void o(String str, Throwable th2) {
        if (C0187u.c > 2) {
            Log.v(numX49.tnTj78("PekS"), str, th2);
        }
    }

    public static void q(String str) {
        if (C0187u.c > 2) {
            Log.v(numX49.tnTj78("Pekj"), str);
        }
    }

    public static void r(String str, Exception exc) {
        if (C0187u.c > 2) {
            Log.v(numX49.tnTj78("Pekd"), str, exc);
        }
    }

    public static void s(String str, String str2) {
        if (C0187u.c > 2) {
            int length = str2.length();
            String strTnTj78 = numX49.tnTj78("Peki");
            if (length > 4000) {
                Log.v(AbstractC1414e.h(strTnTj78, str), str2.substring(0, 4000));
                s(str, str2.substring(4000));
            } else {
                Log.v(strTnTj78 + str, str2);
            }
        }
    }

    public static void t(String str, String str2, Throwable th2) {
        if (C0187u.c > 2) {
            Log.v(numX49.tnTj78("PekE") + str, str2, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    @Override // x.InterfaceC2445C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(y.AbstractC2494a r21, float r22) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.S.a(y.a, float):java.lang.Object");
    }

    @Override // ph.S1
    public W1 call() {
        return new C2055b2(this.f865a);
    }

    @Override // M5.f
    public String d() {
        return String.format(numX49.tnTj78("PekH"), "voucher_reminder", numX49.tnTj78("PekF"), Integer.valueOf(this.f865a));
    }

    public void j(String str) {
        if (this.f865a >= 0) {
            Log.i(numX49.tnTj78("PekO"), str);
        }
    }

    public void k(String str, String str2) {
        if (this.f865a >= 0) {
            Log.i(numX49.tnTj78("PekQ") + str, str2);
        }
    }

    public Cg.c p(String str) {
        if (str == null) {
            return new Cg.c(200, "you passed a null key, matching key must be a non-empty string", false);
        }
        if (AbstractC0983W.q(str.trim())) {
            return new Cg.c(200, "you passed an empty string, matching key must be a non-empty string", false);
        }
        int length = str.length();
        int i = this.f865a;
        if (length > i) {
            return new Cg.c(200, We.s.g(i, numX49.tnTj78("Pekt"), numX49.tnTj78("PekU")), false);
        }
        return null;
    }

    public S() {
        this.f865a = 250;
    }

    public S(int i, boolean z4) {
        this.f865a = i;
    }
}
