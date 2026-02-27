package p;

import D.A;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import n.v;
import q.InterfaceC2157a;
import s.C2221f;
import t.C2265b;
import v.AbstractC2327b;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements e, m, j, InterfaceC2157a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f18998a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f18999b = new Path();
    public final n.s c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2327b f19000d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q.i f19001g;
    public final q.i h;
    public final A i;
    public d j;

    public p(n.s sVar, AbstractC2327b abstractC2327b, u.i iVar) {
        this.c = sVar;
        this.f19000d = abstractC2327b;
        this.e = iVar.f20236b;
        this.f = iVar.f20237d;
        q.e eVarF = iVar.c.f();
        this.f19001g = (q.i) eVarF;
        abstractC2327b.f(eVarF);
        eVarF.a(this);
        q.e eVarF2 = ((C2265b) iVar.e).f();
        this.h = (q.i) eVarF2;
        abstractC2327b.f(eVarF2);
        eVarF2.a(this);
        t.d dVar = (t.d) iVar.f;
        dVar.getClass();
        A a8 = new A(dVar);
        this.i = a8;
        a8.a(abstractC2327b);
        a8.b(this);
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // p.c
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // s.InterfaceC2222g
    public final void c(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        AbstractC2543e.e(c2221f, i, arrayList, c2221f2, this);
    }

    @Override // s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        if (this.i.c(colorFilter, cVar)) {
            return;
        }
        if (colorFilter == v.f18520p) {
            this.f19001g.k(cVar);
        } else if (colorFilter == v.f18521q) {
            this.h.k(cVar);
        }
    }

    @Override // p.e
    public final void e(RectF rectF, Matrix matrix, boolean z4) {
        this.j.e(rectF, matrix, z4);
    }

    @Override // p.j
    public final void f(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new d(this.c, this.f19000d, numX49.tnTj78("b2GP"), this.f, arrayList, null);
    }

    @Override // p.e
    public final void g(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.f19001g.f()).floatValue();
        float fFloatValue2 = ((Float) this.h.f()).floatValue();
        A a8 = this.i;
        float fFloatValue3 = ((Float) ((q.e) a8.m).f()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) ((q.e) a8.f797n).f()).floatValue() / 100.0f;
        for (int i4 = ((int) fFloatValue) - 1; i4 >= 0; i4--) {
            Matrix matrix2 = this.f18998a;
            matrix2.set(matrix);
            float f = i4;
            matrix2.preConcat(a8.f(f + fFloatValue2));
            this.j.g(canvas, matrix2, (int) (AbstractC2543e.d(fFloatValue3, fFloatValue4, f / fFloatValue) * i));
        }
    }

    @Override // p.c
    public final String getName() {
        return this.e;
    }

    @Override // p.m
    public final Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.f18999b;
        path2.reset();
        float fFloatValue = ((Float) this.f19001g.f()).floatValue();
        float fFloatValue2 = ((Float) this.h.f()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrix = this.f18998a;
            matrix.set(this.i.f(i + fFloatValue2));
            path2.addPath(path, matrix);
        }
        return path2;
    }
}
