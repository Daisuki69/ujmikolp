package Cg;

import Bg.C0104a;
import Bg.C0105b;
import Bg.C0118o;
import Bg.F;
import Bg.V;
import Bg.W;
import bj.InterfaceC1031b;
import gj.InterfaceC1526a;
import kotlin.jvm.functions.Function2;
import qj.n;
import qj.o;
import qj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f775b = new g(0);
    public static final g c = new g(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f776d = new g(2);
    public static final g e = new g(3);
    public static final g f = new g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f777a;

    public /* synthetic */ g(int i) {
        this.f777a = i;
    }

    @Override // Cg.a
    public final void a(wg.c client, InterfaceC1031b interfaceC1031b) {
        switch (this.f777a) {
            case 0:
                kotlin.jvm.internal.j.g(client, "client");
                client.e.f(Jg.f.h, new C0118o((o) interfaceC1031b, (InterfaceC1526a) null, 3));
                return;
            case 1:
                n nVar = (n) interfaceC1031b;
                kotlin.jvm.internal.j.g(client, "client");
                C0105b c0105b = W.f504b;
                Rg.j jVar = (Rg.j) client.i.e(F.f474a);
                InterfaceC1526a interfaceC1526a = null;
                Object objE = jVar != null ? jVar.e(W.c) : null;
                if (objE != null) {
                    ((W) objE).f505a.add(new V(nVar, client, interfaceC1526a, 1));
                    return;
                }
                throw new IllegalStateException("Plugin " + c0105b + " is not installed. Consider using `install(" + W.c + ")` in client config first.");
            case 2:
                kotlin.jvm.internal.j.g(client, "client");
                client.e.f(Jg.f.f2528g, new C0118o((Function2) interfaceC1031b, (InterfaceC1526a) null, 4));
                return;
            case 3:
                kotlin.jvm.internal.j.g(client, "client");
                client.e.f(Jg.f.i, new C0118o((p) interfaceC1031b, (InterfaceC1526a) null, 5));
                return;
            default:
                kotlin.jvm.internal.j.g(client, "client");
                client.f.f(Kg.b.f2661l, new C0104a((p) interfaceC1031b, null, 4));
                return;
        }
    }
}
