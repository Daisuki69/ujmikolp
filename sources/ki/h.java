package ki;

import D.C0176i;
import D.S;
import Xh.o;
import Xh.p;
import b1.t;
import bi.C1026d;
import java.util.ArrayList;
import java.util.Map;
import ji.C1684a;
import oi.C1986d;
import pi.C2151a;
import ui.C2318e;
import ui.C2321h;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f18140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0176i f18141b;
    public final Xh.d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2318e f18142d;
    public final String e;
    public final String f = "1.3";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1026d f18143g;
    public final Ci.b h;
    public final C2151a i;
    public final C1986d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Qi.c f18144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f18145l;

    public h(Xh.d dVar, t tVar, C0176i c0176i, String str, C1026d c1026d, Map map, A3.i iVar, C2321h c2321h) {
        int i;
        int i4;
        this.c = dVar;
        this.f18140a = tVar;
        this.f18141b = c0176i;
        this.e = str;
        this.f18143g = c1026d;
        C2151a c2151a = new C2151a(map, iVar);
        this.i = c2151a;
        C1986d c1986d = new C1986d(3);
        this.j = c1986d;
        Qi.c cVar = (Qi.c) c0176i.f919l;
        this.f18144k = cVar;
        this.f18142d = new C2318e((U8.c) tVar.f8333a, (io.split.android.client.storage.splits.c) c0176i.f914a, c2151a, c1986d, (Mi.c) c0176i.f923q, (Ji.a) c0176i.f921o, cVar, "1.3", false, c2321h);
        this.f18145l = map == null ? new ArrayList() : new ArrayList(map.values());
        if (map == null || map.isEmpty() || ((p) map.get(o.f6668b)) == null) {
            i = 0;
            i4 = 0;
        } else {
            Ff.f fVar = dVar.c;
            int i6 = fVar.f1581b;
            i = fVar.c;
            i4 = i6;
        }
        this.h = new Ci.b((U8.c) tVar.h, (U8.c) tVar.i, cVar, dVar, (io.split.android.client.storage.splits.c) c0176i.f914a, (Li.c) c0176i.f915b, (Li.c) c0176i.c, i, i4);
    }

    public final C1684a a() {
        U8.c cVar = (U8.c) this.f18140a.f8335d;
        C0176i c0176i = this.f18141b;
        Ii.b bVar = (Ii.b) c0176i.e;
        this.c.getClass();
        return new C1684a(cVar, bVar, new S(2000), (Qi.c) c0176i.f919l);
    }

    public final C1684a b() {
        U8.c cVar = (U8.c) this.f18140a.e;
        C0176i c0176i = this.f18141b;
        Ki.c cVar2 = (Ki.c) c0176i.f917g;
        Xh.d dVar = this.c;
        dVar.getClass();
        return new C1684a(cVar, cVar2, new S(2000, dVar.f6634d), (Qi.c) c0176i.f919l);
    }
}
