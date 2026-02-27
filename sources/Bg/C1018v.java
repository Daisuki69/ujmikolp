package bg;

import ag.C0703m;
import cj.C1127m;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: bg.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1018v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xf.c f9129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9130b;

    public C1018v(Xf.c module, ArrayList arrayList) {
        kotlin.jvm.internal.j.h(module, "module");
        this.f9129a = module;
        this.f9130b = arrayList;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9130b.iterator();
        while (it.hasNext()) {
            cj.x.p(C1127m.c((C0703m[]) it.next()), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(cj.t.l(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C0703m) it2.next()).a().d());
        }
        return arrayList2;
    }
}
