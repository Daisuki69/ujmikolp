package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import n.AbstractC1876c;
import n.v;
import o.C1953a;
import q.InterfaceC2157a;
import s.C2221f;
import t.C2264a;
import t.C2265b;
import v.AbstractC2327b;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements e, InterfaceC2157a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1953a f18954b;
    public final AbstractC2327b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18955d;
    public final boolean e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q.f f18956g;
    public final q.f h;
    public q.p i;
    public final n.s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q.e f18957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18958l;
    public final q.h m;

    public g(n.s sVar, AbstractC2327b abstractC2327b, u.k kVar) {
        Path path = new Path();
        this.f18953a = path;
        this.f18954b = new C1953a(1, 0);
        this.f = new ArrayList();
        this.c = abstractC2327b;
        this.f18955d = kVar.c;
        this.e = kVar.f;
        this.j = sVar;
        if (abstractC2327b.k() != null) {
            q.e eVarF = ((C2265b) abstractC2327b.k().f19074b).f();
            this.f18957k = eVarF;
            eVarF.a(this);
            abstractC2327b.f(this.f18957k);
        }
        if (abstractC2327b.l() != null) {
            this.m = new q.h(this, abstractC2327b, abstractC2327b.l());
        }
        C2264a c2264a = kVar.f20242d;
        if (c2264a == null) {
            this.f18956g = null;
            this.h = null;
            return;
        }
        C2264a c2264a2 = kVar.e;
        path.setFillType(kVar.f20241b);
        q.e eVarF2 = c2264a.f();
        this.f18956g = (q.f) eVarF2;
        eVarF2.a(this);
        abstractC2327b.f(eVarF2);
        q.e eVarF3 = c2264a2.f();
        this.h = (q.f) eVarF3;
        eVarF3.a(this);
        abstractC2327b.f(eVarF3);
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // p.c
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = (c) list2.get(i);
            if (cVar instanceof m) {
                this.f.add((m) cVar);
            }
        }
    }

    @Override // s.InterfaceC2222g
    public final void c(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        AbstractC2543e.e(c2221f, i, arrayList, c2221f2, this);
    }

    @Override // s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        PointF pointF = v.f18512a;
        if (colorFilter == 1) {
            this.f18956g.k(cVar);
            return;
        }
        if (colorFilter == 4) {
            this.h.k(cVar);
            return;
        }
        ColorFilter colorFilter2 = v.f18508F;
        AbstractC2327b abstractC2327b = this.c;
        if (colorFilter == colorFilter2) {
            q.p pVar = this.i;
            if (pVar != null) {
                abstractC2327b.o(pVar);
            }
            q.p pVar2 = new q.p(cVar, null);
            this.i = pVar2;
            pVar2.a(this);
            abstractC2327b.f(this.i);
            return;
        }
        if (colorFilter == v.e) {
            q.e eVar = this.f18957k;
            if (eVar != null) {
                eVar.k(cVar);
                return;
            }
            q.p pVar3 = new q.p(cVar, null);
            this.f18957k = pVar3;
            pVar3.a(this);
            abstractC2327b.f(this.f18957k);
            return;
        }
        q.h hVar = this.m;
        if (colorFilter == 5 && hVar != null) {
            hVar.f19725b.k(cVar);
            return;
        }
        if (colorFilter == v.f18504B && hVar != null) {
            hVar.c(cVar);
            return;
        }
        if (colorFilter == v.f18505C && hVar != null) {
            hVar.f19726d.k(cVar);
            return;
        }
        if (colorFilter == v.f18506D && hVar != null) {
            hVar.e.k(cVar);
        } else {
            if (colorFilter != v.f18507E || hVar == null) {
                return;
            }
            hVar.f.k(cVar);
        }
    }

    @Override // p.e
    public final void e(RectF rectF, Matrix matrix, boolean z4) {
        Path path = this.f18953a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((m) arrayList.get(i)).getPath(), matrix);
                i++;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.e
    public final void g(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (this.e) {
            return;
        }
        q.f fVar = this.f18956g;
        int iL = fVar.l(fVar.b(), fVar.d());
        C1953a c1953a = this.f18954b;
        c1953a.setColor(iL);
        PointF pointF = AbstractC2543e.f21340a;
        int i4 = 0;
        c1953a.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * ((Integer) this.h.f()).intValue()) / 100.0f) * 255.0f))));
        q.p pVar = this.i;
        if (pVar != null) {
            c1953a.setColorFilter((ColorFilter) pVar.f());
        }
        q.e eVar = this.f18957k;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.f()).floatValue();
            if (fFloatValue == 0.0f) {
                c1953a.setMaskFilter(null);
            } else if (fFloatValue != this.f18958l) {
                AbstractC2327b abstractC2327b = this.c;
                if (abstractC2327b.f20370y == fFloatValue) {
                    blurMaskFilter = abstractC2327b.f20371z;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    abstractC2327b.f20371z = blurMaskFilter2;
                    abstractC2327b.f20370y = fFloatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                c1953a.setMaskFilter(blurMaskFilter);
            }
            this.f18958l = fFloatValue;
        }
        q.h hVar = this.m;
        if (hVar != null) {
            hVar.b(c1953a);
        }
        Path path = this.f18953a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f;
            if (i4 >= arrayList.size()) {
                canvas.drawPath(path, c1953a);
                AbstractC1876c.a();
                return;
            } else {
                path.addPath(((m) arrayList.get(i4)).getPath(), matrix);
                i4++;
            }
        }
    }

    @Override // p.c
    public final String getName() {
        return this.f18955d;
    }
}
