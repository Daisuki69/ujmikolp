package W5;

import A3.i;
import D.C0176i;
import Ej.Z;
import Xh.h;
import Xh.n;
import bi.EnumC1028f;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f6309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6310b;
    public h c;

    public b(i iVar, String str, Y5.a aVar) {
        this.f6309a = iVar;
        this.f6310b = ((e) aVar).f6316a;
        if ((iVar == null || iVar.f41b) && !C2576A.H(str)) {
            this.c = iVar != null ? ((n) iVar.c).f6663g.b(new Yh.a(str)) : null;
            yk.a.a();
        } else {
            yk.a.a();
        }
        if (iVar != null) {
            n nVar = (n) iVar.c;
            if (nVar.h == null) {
                synchronized (nVar.f6665l) {
                    try {
                        if (nVar.h == null) {
                            Xh.d dVar = nVar.f6665l;
                            C0176i c0176i = nVar.f;
                            nVar.h = new Z(dVar, (Ki.a) c0176i.h, (Ii.a) c0176i.f, nVar.e, nVar.i, nVar.j, nVar.f6664k);
                        }
                    } finally {
                    }
                }
            }
            nVar.h.g();
        }
    }

    public static void a(b bVar, Function0 function0) {
        bVar.getClass();
        EnumC1028f enumC1028f = EnumC1028f.f9153d;
        h hVar = bVar.c;
        if (hVar != null) {
            hVar.d(enumC1028f, new a(bVar, enumC1028f, function0, null));
        }
    }

    public final void b(Map value) {
        j.g(value, "value");
        value.toString();
        yk.a.a();
        h hVar = this.c;
        if (hVar != null) {
            hVar.b(value);
        }
    }
}
