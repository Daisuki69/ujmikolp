package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import n.v;
import o.C1953a;
import s.AbstractC2217b;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC2001b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC2327b f19005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f19006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f19007t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q.f f19008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q.p f19009v;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(n.s sVar, AbstractC2327b abstractC2327b, u.n nVar) {
        int iC = AbstractC2217b.c(nVar.f20251g);
        Paint.Cap cap = iC != 0 ? iC != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iC2 = AbstractC2217b.c(nVar.h);
        super(sVar, abstractC2327b, cap, iC2 != 0 ? iC2 != 1 ? iC2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, nVar.i, nVar.e, nVar.f, nVar.c, nVar.f20249b);
        this.f19005r = abstractC2327b;
        this.f19006s = nVar.f20248a;
        this.f19007t = nVar.j;
        q.e eVarF = nVar.f20250d.f();
        this.f19008u = (q.f) eVarF;
        eVarF.a(this);
        abstractC2327b.f(eVarF);
    }

    @Override // p.AbstractC2001b, s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        super.d(colorFilter, cVar);
        PointF pointF = v.f18512a;
        q.f fVar = this.f19008u;
        if (colorFilter == 2) {
            fVar.k(cVar);
            return;
        }
        if (colorFilter == v.f18508F) {
            q.p pVar = this.f19009v;
            AbstractC2327b abstractC2327b = this.f19005r;
            if (pVar != null) {
                abstractC2327b.o(pVar);
            }
            q.p pVar2 = new q.p(cVar, null);
            this.f19009v = pVar2;
            pVar2.a(this);
            abstractC2327b.f(fVar);
        }
    }

    @Override // p.AbstractC2001b, p.e
    public final void g(Canvas canvas, Matrix matrix, int i) {
        if (this.f19007t) {
            return;
        }
        q.f fVar = this.f19008u;
        int iL = fVar.l(fVar.b(), fVar.d());
        C1953a c1953a = this.i;
        c1953a.setColor(iL);
        q.p pVar = this.f19009v;
        if (pVar != null) {
            c1953a.setColorFilter((ColorFilter) pVar.f());
        }
        super.g(canvas, matrix, i);
    }

    @Override // p.c
    public final String getName() {
        return this.f19006s;
    }
}
