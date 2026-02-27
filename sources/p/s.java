package p;

import java.util.ArrayList;
import java.util.List;
import q.InterfaceC2157a;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements c, InterfaceC2157a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f19011b = new ArrayList();
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q.i f19012d;
    public final q.i e;
    public final q.i f;

    public s(AbstractC2327b abstractC2327b, u.o oVar) {
        oVar.getClass();
        this.f19010a = oVar.e;
        this.c = oVar.f20252a;
        q.e eVarF = oVar.f20253b.f();
        this.f19012d = (q.i) eVarF;
        q.e eVarF2 = oVar.c.f();
        this.e = (q.i) eVarF2;
        q.e eVarF3 = oVar.f20254d.f();
        this.f = (q.i) eVarF3;
        abstractC2327b.f(eVarF);
        abstractC2327b.f(eVarF2);
        abstractC2327b.f(eVarF3);
        eVarF.a(this);
        eVarF2.a(this);
        eVarF3.a(this);
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19011b;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC2157a) arrayList.get(i)).a();
            i++;
        }
    }

    @Override // p.c
    public final void b(List list, List list2) {
    }

    public final void c(InterfaceC2157a interfaceC2157a) {
        this.f19011b.add(interfaceC2157a);
    }
}
