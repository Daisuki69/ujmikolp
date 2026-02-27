package p;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import bg.C1006j0;
import java.util.ArrayList;
import java.util.List;
import n.v;
import q.InterfaceC2157a;
import s.C2221f;
import t.C2264a;
import v.AbstractC2327b;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements InterfaceC2157a, k, m {
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18996d;
    public final n.s e;
    public final q.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q.e f18997g;
    public final q.i h;
    public boolean j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18994a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f18995b = new RectF();
    public final C1006j0 i = new C1006j0();

    public o(n.s sVar, AbstractC2327b abstractC2327b, u.i iVar) {
        this.c = iVar.f20236b;
        this.f18996d = iVar.f20237d;
        this.e = sVar;
        q.e eVarF = iVar.e.f();
        this.f = eVarF;
        q.e eVarF2 = ((C2264a) iVar.f).f();
        this.f18997g = eVarF2;
        q.e eVarF3 = iVar.c.f();
        this.h = (q.i) eVarF3;
        abstractC2327b.f(eVarF);
        abstractC2327b.f(eVarF2);
        abstractC2327b.f(eVarF3);
        eVarF.a(this);
        eVarF2.a(this);
        eVarF3.a(this);
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.j = false;
        this.e.invalidateSelf();
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
                    this.i.f9018a.add(sVar);
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
        if (colorFilter == v.f18515g) {
            this.f18997g.k(cVar);
        } else if (colorFilter == v.i) {
            this.f.k(cVar);
        } else if (colorFilter == v.h) {
            this.h.k(cVar);
        }
    }

    @Override // p.c
    public final String getName() {
        return this.c;
    }

    @Override // p.m
    public final Path getPath() {
        float f;
        boolean z4 = this.j;
        Path path = this.f18994a;
        if (z4) {
            return path;
        }
        path.reset();
        if (this.f18996d) {
            this.j = true;
            return path;
        }
        PointF pointF = (PointF) this.f18997g.f();
        float f3 = pointF.x / 2.0f;
        float f7 = pointF.y / 2.0f;
        q.i iVar = this.h;
        float fL = iVar == null ? 0.0f : iVar.l();
        float fMin = Math.min(f3, f7);
        if (fL > fMin) {
            fL = fMin;
        }
        PointF pointF2 = (PointF) this.f.f();
        path.moveTo(pointF2.x + f3, (pointF2.y - f7) + fL);
        path.lineTo(pointF2.x + f3, (pointF2.y + f7) - fL);
        RectF rectF = this.f18995b;
        if (fL > 0.0f) {
            float f10 = pointF2.x + f3;
            float f11 = fL * 2.0f;
            f = 2.0f;
            float f12 = pointF2.y + f7;
            rectF.set(f10 - f11, f12 - f11, f10, f12);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f3) + fL, pointF2.y + f7);
        if (fL > 0.0f) {
            float f13 = pointF2.x - f3;
            float f14 = pointF2.y + f7;
            float f15 = fL * f;
            rectF.set(f13, f14 - f15, f15 + f13, f14);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f3, (pointF2.y - f7) + fL);
        if (fL > 0.0f) {
            float f16 = pointF2.x - f3;
            float f17 = pointF2.y - f7;
            float f18 = fL * f;
            rectF.set(f16, f17, f16 + f18, f18 + f17);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f3) - fL, pointF2.y - f7);
        if (fL > 0.0f) {
            float f19 = pointF2.x + f3;
            float f20 = fL * f;
            float f21 = pointF2.y - f7;
            rectF.set(f19 - f20, f21, f19, f20 + f21);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.c(path);
        this.j = true;
        return path;
    }
}
