package N4;

import Ag.i;
import Bg.C0112i;
import Bg.j0;
import Bj.C0154m0;
import Bj.InterfaceC0156n0;
import Dg.h;
import Fg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f3534a = {"sha256/o1oIDY5oVVN+AuSKRcYtpfhZ46/xDbgb6T69SrKrICI=", "sha256/hJbfKkprFWALD1Ks7/9jqeHU6w26kOY6irAkJbpS+aE=", "sha256/o1oIDUMMYVN+AuSKRcDUMMYZ46/xDbgb6T69SrKrICI="};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f3535b = {"sha256/7cOvxhc2ihuO6ng1GnoZJUuHGOE6cDS6h1VA017njm0=", "sha256/NUeRluqd4llE8y461qNMfCMTCvf0ZXP+3sT1XFUZzEY=", "sha256//mSOUryIbkYb0tDZHlKHg49qsxIGOIpZVBbACoxoz4w="};
    public static int c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f3536d = "";
    public static String e = a();
    public static wg.c f = b();

    public static String a() {
        int iC = AbstractC2217b.c(c);
        if (iC == 0) {
            return "test.app.maya.ph";
        }
        if (iC == 1) {
            return "staging.app.maya.ph";
        }
        if (iC == 2) {
            return "sandbox.app.maya.ph";
        }
        if (iC == 3) {
            return "app.maya.ph";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static wg.c b() {
        wg.d dVar = new wg.d();
        dVar.c = true;
        dVar.f20795g = new Ag.b(4, (Function1) dVar.f20795g);
        dVar.a(n.c, f.c);
        dVar.a(j0.f537b, f.e);
        dVar.a(h.c, f.f);
        dVar.a(C0112i.f531b, f.f3532g);
        Unit unit = Unit.f18162a;
        Function1 block = (Function1) dVar.f20795g;
        j.g(block, "block");
        Ag.c cVar = new Ag.c();
        cVar.f280a = new Ag.a(0);
        block.invoke(cVar);
        i iVar = new i(cVar);
        wg.c cVar2 = new wg.c(iVar, dVar);
        CoroutineContext.Element element = cVar2.f20789d.get(C0154m0.f630a);
        j.d(element);
        ((InterfaceC0156n0) element).i(new com.squareup.wire.internal.a(iVar, 22));
        return cVar2;
    }
}
