package p;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import bg.C1006j0;
import java.util.ArrayList;
import java.util.List;
import n.v;
import q.InterfaceC2157a;
import s.C2221f;
import u.C2290a;
import v.AbstractC2327b;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements m, InterfaceC2157a, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18950b;
    public final n.s c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q.j f18951d;
    public final q.e e;
    public final C2290a f;
    public boolean h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18949a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1006j0 f18952g = new C1006j0();

    public f(n.s sVar, AbstractC2327b abstractC2327b, C2290a c2290a) {
        this.f18950b = c2290a.f20211a;
        this.c = sVar;
        q.e eVarF = c2290a.c.f();
        this.f18951d = (q.j) eVarF;
        q.e eVarF2 = c2290a.f20212b.f();
        this.e = eVarF2;
        this.f = c2290a;
        abstractC2327b.f(eVarF);
        abstractC2327b.f(eVarF2);
        eVarF.a(this);
        eVarF2.a(this);
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.h = false;
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
                    this.f18952g.f9018a.add(sVar);
                    sVar.c(this);
                }
            }
            i++;
        }
    }

    @Override // s.InterfaceC2222g
    public final void c(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        AbstractC2543e.e(c2221f, i, arrayList, c2221f2, this);
    }

    @Override // s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        if (colorFilter == v.f) {
            this.f18951d.k(cVar);
        } else if (colorFilter == v.i) {
            this.e.k(cVar);
        }
    }

    @Override // p.c
    public final String getName() {
        return this.f18950b;
    }

    @Override // p.m
    public final Path getPath() {
        boolean z4 = this.h;
        Path path = this.f18949a;
        if (z4) {
            return path;
        }
        path.reset();
        C2290a c2290a = this.f;
        if (c2290a.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.f18951d.f();
        float f = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        float f7 = f * 0.55228f;
        float f10 = f3 * 0.55228f;
        path.reset();
        if (c2290a.f20213d) {
            float f11 = -f3;
            path.moveTo(0.0f, f11);
            float f12 = 0.0f - f7;
            float f13 = -f;
            float f14 = 0.0f - f10;
            path.cubicTo(f12, f11, f13, f14, f13, 0.0f);
            float f15 = f10 + 0.0f;
            path.cubicTo(f13, f15, f12, f3, 0.0f, f3);
            float f16 = f7 + 0.0f;
            path.cubicTo(f16, f3, f, f15, f, 0.0f);
            path.cubicTo(f, f14, f16, f11, 0.0f, f11);
        } else {
            float f17 = -f3;
            path.moveTo(0.0f, f17);
            float f18 = f7 + 0.0f;
            float f19 = 0.0f - f10;
            path.cubicTo(f18, f17, f, f19, f, 0.0f);
            float f20 = f10 + 0.0f;
            path.cubicTo(f, f20, f18, f3, 0.0f, f3);
            float f21 = 0.0f - f7;
            float f22 = -f;
            path.cubicTo(f21, f3, f22, f20, f22, 0.0f);
            path.cubicTo(f22, f19, f21, f17, 0.0f, f17);
        }
        PointF pointF2 = (PointF) this.e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f18952g.c(path);
        this.h = true;
        return path;
    }
}
