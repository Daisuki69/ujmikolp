package p;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import n.AbstractC1876c;
import n.v;
import o.C1953a;
import q.InterfaceC2157a;
import s.C2221f;
import t.C2264a;
import t.C2265b;
import v.AbstractC2327b;
import z.AbstractC2543e;

/* JADX INFO: renamed from: p.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2001b implements InterfaceC2157a, k, e {
    public final n.s e;
    public final AbstractC2327b f;
    public final float[] h;
    public final C1953a i;
    public final q.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q.f f18938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f18939l;
    public final q.i m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q.p f18940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q.e f18941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q.h f18943q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f18934a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f18935b = new Path();
    public final Path c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f18936d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f18937g = new ArrayList();

    public AbstractC2001b(n.s sVar, AbstractC2327b abstractC2327b, Paint.Cap cap, Paint.Join join, float f, C2264a c2264a, C2265b c2265b, ArrayList arrayList, C2265b c2265b2) {
        C1953a c1953a = new C1953a(1, 0);
        this.i = c1953a;
        this.f18942p = 0.0f;
        this.e = sVar;
        this.f = abstractC2327b;
        c1953a.setStyle(Paint.Style.STROKE);
        c1953a.setStrokeCap(cap);
        c1953a.setStrokeJoin(join);
        c1953a.setStrokeMiter(f);
        this.f18938k = (q.f) c2264a.f();
        this.j = (q.i) c2265b.f();
        if (c2265b2 == null) {
            this.m = null;
        } else {
            this.m = (q.i) c2265b2.f();
        }
        this.f18939l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f18939l.add(((C2265b) arrayList.get(i)).f());
        }
        abstractC2327b.f(this.f18938k);
        abstractC2327b.f(this.j);
        for (int i4 = 0; i4 < this.f18939l.size(); i4++) {
            abstractC2327b.f((q.e) this.f18939l.get(i4));
        }
        q.i iVar = this.m;
        if (iVar != null) {
            abstractC2327b.f(iVar);
        }
        this.f18938k.a(this);
        this.j.a(this);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            ((q.e) this.f18939l.get(i6)).a(this);
        }
        q.i iVar2 = this.m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (abstractC2327b.k() != null) {
            q.e eVarF = ((C2265b) abstractC2327b.k().f19074b).f();
            this.f18941o = eVarF;
            eVarF.a(this);
            abstractC2327b.f(this.f18941o);
        }
        if (abstractC2327b.l() != null) {
            this.f18943q = new q.h(this, abstractC2327b, abstractC2327b.l());
        }
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // p.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            r3 = 2
            if (r0 < 0) goto L21
            java.lang.Object r4 = r8.get(r0)
            p.c r4 = (p.c) r4
            boolean r5 = r4 instanceof p.s
            if (r5 == 0) goto L1e
            p.s r4 = (p.s) r4
            int r5 = r4.c
            if (r5 != r3) goto L1e
            r2 = r4
        L1e:
            int r0 = r0 + (-1)
            goto La
        L21:
            if (r2 == 0) goto L26
            r2.c(r7)
        L26:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2c:
            java.util.ArrayList r0 = r7.f18937g
            if (r8 < 0) goto L65
            java.lang.Object r4 = r9.get(r8)
            p.c r4 = (p.c) r4
            boolean r5 = r4 instanceof p.s
            if (r5 == 0) goto L50
            r5 = r4
            p.s r5 = (p.s) r5
            int r6 = r5.c
            if (r6 != r3) goto L50
            if (r1 == 0) goto L46
            r0.add(r1)
        L46:
            p.a r0 = new p.a
            r0.<init>(r5)
            r5.c(r7)
            r1 = r0
            goto L62
        L50:
            boolean r0 = r4 instanceof p.m
            if (r0 == 0) goto L62
            if (r1 != 0) goto L5b
            p.a r1 = new p.a
            r1.<init>(r2)
        L5b:
            java.util.ArrayList r0 = r1.f18932a
            p.m r4 = (p.m) r4
            r0.add(r4)
        L62:
            int r8 = r8 + (-1)
            goto L2c
        L65:
            if (r1 == 0) goto L6a
            r0.add(r1)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.AbstractC2001b.b(java.util.List, java.util.List):void");
    }

    @Override // s.InterfaceC2222g
    public final void c(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        AbstractC2543e.e(c2221f, i, arrayList, c2221f2, this);
    }

    @Override // s.InterfaceC2222g
    public void d(ColorFilter colorFilter, A.c cVar) {
        PointF pointF = v.f18512a;
        if (colorFilter == 4) {
            this.f18938k.k(cVar);
            return;
        }
        if (colorFilter == v.f18518n) {
            this.j.k(cVar);
            return;
        }
        ColorFilter colorFilter2 = v.f18508F;
        AbstractC2327b abstractC2327b = this.f;
        if (colorFilter == colorFilter2) {
            q.p pVar = this.f18940n;
            if (pVar != null) {
                abstractC2327b.o(pVar);
            }
            q.p pVar2 = new q.p(cVar, null);
            this.f18940n = pVar2;
            pVar2.a(this);
            abstractC2327b.f(this.f18940n);
            return;
        }
        if (colorFilter == v.e) {
            q.e eVar = this.f18941o;
            if (eVar != null) {
                eVar.k(cVar);
                return;
            }
            q.p pVar3 = new q.p(cVar, null);
            this.f18941o = pVar3;
            pVar3.a(this);
            abstractC2327b.f(this.f18941o);
            return;
        }
        q.h hVar = this.f18943q;
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
        Path path = this.f18935b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f18937g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.f18936d;
                path.computeBounds(rectF2, false);
                float fL = this.j.l() / 2.0f;
                rectF2.set(rectF2.left - fL, rectF2.top - fL, rectF2.right + fL, rectF2.bottom + fL);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                AbstractC1876c.a();
                return;
            }
            C2000a c2000a = (C2000a) arrayList.get(i);
            for (int i4 = 0; i4 < c2000a.f18932a.size(); i4++) {
                path.addPath(((m) c2000a.f18932a.get(i4)).getPath(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.AbstractC2001b.g(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
