package U1;

import Bj.H;
import a2.InterfaceC0623a;
import b2.n;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements b2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f5908b = new h(0);
    public static final h c = new h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f5909d = new h(2);
    public static final h e = new h(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5910a;

    public /* synthetic */ h(int i) {
        this.f5910a = i;
    }

    @Override // b2.c
    public final Object v(Xh.b bVar) {
        switch (this.f5910a) {
            case 0:
                Object objF = bVar.f(new n(InterfaceC0623a.class, Executor.class));
                j.f(objF, "get(...)");
                return H.n((Executor) objF);
            case 1:
                Object objF2 = bVar.f(new n(a2.c.class, Executor.class));
                j.f(objF2, "get(...)");
                return H.n((Executor) objF2);
            case 2:
                Object objF3 = bVar.f(new n(a2.b.class, Executor.class));
                j.f(objF3, "get(...)");
                return H.n((Executor) objF3);
            default:
                Object objF4 = bVar.f(new n(a2.d.class, Executor.class));
                j.f(objF4, "get(...)");
                return H.n((Executor) objF4);
        }
    }
}
