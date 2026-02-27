package p;

import D.A;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import o.C1953a;
import q.InterfaceC2157a;
import s.C2221f;
import s.InterfaceC2222g;
import u.InterfaceC2291b;
import v.AbstractC2327b;
import z.AbstractC2544f;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements e, m, InterfaceC2157a, InterfaceC2222g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1953a f18944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f18945b;
    public final Matrix c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f18946d;
    public final RectF e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18947g;
    public final ArrayList h;
    public final n.s i;
    public ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final A f18948k;

    public d(n.s sVar, AbstractC2327b abstractC2327b, u.l lVar) {
        t.d dVar;
        String str = lVar.f20243a;
        List list = lVar.f20244b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVarA = ((InterfaceC2291b) list.get(i4)).a(sVar, abstractC2327b);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                dVar = null;
                break;
            }
            InterfaceC2291b interfaceC2291b = (InterfaceC2291b) list.get(i);
            if (interfaceC2291b instanceof t.d) {
                dVar = (t.d) interfaceC2291b;
                break;
            }
            i++;
        }
        this(sVar, abstractC2327b, str, lVar.c, arrayList, dVar);
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // p.c
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override // s.InterfaceC2222g
    public final void c(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        String str = this.f;
        boolean zC = c2221f.c(i, str);
        String strTnTj78 = numX49.tnTj78("b2Gb");
        if (!zC && !strTnTj78.equals(str)) {
            return;
        }
        if (!strTnTj78.equals(str)) {
            C2221f c2221f3 = new C2221f(c2221f2);
            c2221f3.f19975a.add(str);
            if (c2221f.a(i, str)) {
                C2221f c2221f4 = new C2221f(c2221f3);
                c2221f4.f19976b = this;
                arrayList.add(c2221f4);
            }
            c2221f2 = c2221f3;
        }
        if (!c2221f.d(i, str)) {
            return;
        }
        int iB = c2221f.b(i, str) + i;
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i4 >= arrayList2.size()) {
                return;
            }
            c cVar = (c) arrayList2.get(i4);
            if (cVar instanceof InterfaceC2222g) {
                ((InterfaceC2222g) cVar).c(c2221f, iB, arrayList, c2221f2);
            }
            i4++;
        }
    }

    @Override // s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        A a8 = this.f18948k;
        if (a8 != null) {
            a8.c(colorFilter, cVar);
        }
    }

    @Override // p.e
    public final void e(RectF rectF, Matrix matrix, boolean z4) {
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        A a8 = this.f18948k;
        if (a8 != null) {
            matrix2.preConcat(a8.e());
        }
        RectF rectF2 = this.e;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).e(rectF2, matrix2, z4);
                rectF.union(rectF2);
            }
        }
    }

    public final List f() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i);
                if (cVar instanceof m) {
                    this.j.add((m) cVar);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // p.e
    public final void g(Canvas canvas, Matrix matrix, int i) {
        if (this.f18947g) {
            return;
        }
        Matrix matrix2 = this.c;
        matrix2.set(matrix);
        A a8 = this.f18948k;
        if (a8 != null) {
            matrix2.preConcat(a8.e());
            i = (int) (((((((q.e) a8.j) == null ? 100 : ((Integer) r9.f()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z4 = this.i.f18497q;
        ArrayList arrayList = this.h;
        boolean z5 = false;
        if (z4) {
            int i4 = 0;
            int i6 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                if (!(arrayList.get(i4) instanceof e) || (i6 = i6 + 1) < 2) {
                    i4++;
                } else if (i != 255) {
                    z5 = true;
                }
            }
        }
        if (z5) {
            RectF rectF = this.f18945b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            e(rectF, matrix2, true);
            C1953a c1953a = this.f18944a;
            c1953a.setAlpha(i);
            AbstractC2544f.e(canvas, rectF, c1953a);
        }
        if (z5) {
            i = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).g(canvas, matrix2, i);
            }
        }
        if (z5) {
            canvas.restore();
        }
    }

    @Override // p.c
    public final String getName() {
        throw null;
    }

    @Override // p.m
    public final Path getPath() {
        Matrix matrix = this.c;
        matrix.reset();
        A a8 = this.f18948k;
        if (a8 != null) {
            matrix.set(a8.e());
        }
        Path path = this.f18946d;
        path.reset();
        if (!this.f18947g) {
            ArrayList arrayList = this.h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof m) {
                    path.addPath(((m) cVar).getPath(), matrix);
                }
            }
        }
        return path;
    }

    public d(n.s sVar, AbstractC2327b abstractC2327b, String str, boolean z4, ArrayList arrayList, t.d dVar) {
        this.f18944a = new C1953a();
        this.f18945b = new RectF();
        this.c = new Matrix();
        this.f18946d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = sVar;
        this.f18947g = z4;
        this.h = arrayList;
        if (dVar != null) {
            A a8 = new A(dVar);
            this.f18948k = a8;
            a8.a(abstractC2327b);
            a8.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).f(arrayList.listIterator(arrayList.size()));
        }
    }
}
