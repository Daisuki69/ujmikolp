package p;

import android.graphics.Path;
import bg.C1006j0;
import java.util.ArrayList;
import java.util.List;
import q.InterfaceC2157a;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements m, InterfaceC2157a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19003b;
    public final n.s c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q.n f19004d;
    public boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19002a = new Path();
    public final C1006j0 f = new C1006j0();

    public q(n.s sVar, AbstractC2327b abstractC2327b, u.m mVar) {
        mVar.getClass();
        this.f19003b = mVar.f20247d;
        this.c = sVar;
        q.e eVarF = mVar.c.f();
        this.f19004d = (q.n) eVarF;
        abstractC2327b.f(eVarF);
        eVarF.a(this);
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // p.c
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.c == 1) {
                    this.f.f9018a.add(sVar);
                    sVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // p.m
    public final Path getPath() {
        boolean z4 = this.e;
        Path path = this.f19002a;
        if (z4) {
            return path;
        }
        path.reset();
        if (this.f19003b) {
            this.e = true;
            return path;
        }
        path.set((Path) this.f19004d.f());
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.c(path);
        this.e = true;
        return path;
    }
}
