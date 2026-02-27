package v;

import D.A;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n.AbstractC1876c;
import n.s;
import n.z;
import o.C1953a;
import pi.C2151a;
import q.InterfaceC2157a;
import s.C2221f;
import s.InterfaceC2222g;
import z.C2542d;

/* JADX INFO: renamed from: v.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2327b implements p.e, InterfaceC2157a, InterfaceC2222g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f20353a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f20354b = new Matrix();
    public final C1953a c = new C1953a(1, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1953a f20355d;
    public final C1953a e;
    public final C1953a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1953a f20356g;
    public final RectF h;
    public final RectF i;
    public final RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f20357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f20358l;
    public final s m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C2330e f20359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2151a f20360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q.i f20361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AbstractC2327b f20362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AbstractC2327b f20363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f20364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f20365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final A f20366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1953a f20369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f20370y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public BlurMaskFilter f20371z;

    public AbstractC2327b(s sVar, C2330e c2330e) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f20355d = new C1953a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.e = new C1953a(mode2);
        C1953a c1953a = new C1953a(1, 0);
        this.f = c1953a;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C1953a c1953a2 = new C1953a();
        c1953a2.setXfermode(new PorterDuffXfermode(mode3));
        this.f20356g = c1953a2;
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.f20357k = new RectF();
        this.f20358l = new Matrix();
        this.f20365t = new ArrayList();
        this.f20367v = true;
        this.f20370y = 0.0f;
        this.m = sVar;
        this.f20359n = c2330e;
        c2330e.c.concat(numX49.tnTj78("bL9D"));
        if (c2330e.f20391u == 3) {
            c1953a.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            c1953a.setXfermode(new PorterDuffXfermode(mode));
        }
        t.d dVar = c2330e.i;
        dVar.getClass();
        A a8 = new A(dVar);
        this.f20366u = a8;
        a8.b(this);
        List list = c2330e.h;
        if (list != null && !list.isEmpty()) {
            C2151a c2151a = new C2151a(list);
            this.f20360o = c2151a;
            Iterator it = ((ArrayList) c2151a.f19707a).iterator();
            while (it.hasNext()) {
                ((q.e) it.next()).a(this);
            }
            for (q.e eVar : (ArrayList) this.f20360o.f19708b) {
                f(eVar);
                eVar.a(this);
            }
        }
        C2330e c2330e2 = this.f20359n;
        if (c2330e2.f20390t.isEmpty()) {
            if (true != this.f20367v) {
                this.f20367v = true;
                this.m.invalidateSelf();
                return;
            }
            return;
        }
        q.i iVar = new q.i(c2330e2.f20390t);
        this.f20361p = iVar;
        iVar.f19721b = true;
        iVar.a(new C2326a(this));
        boolean z4 = ((Float) this.f20361p.f()).floatValue() == 1.0f;
        if (z4 != this.f20367v) {
            this.f20367v = z4;
            this.m.invalidateSelf();
        }
        f(this.f20361p);
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.m.invalidateSelf();
    }

    @Override // p.c
    public final void b(List list, List list2) {
    }

    @Override // s.InterfaceC2222g
    public final void c(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        AbstractC2327b abstractC2327b = this.f20362q;
        C2330e c2330e = this.f20359n;
        if (abstractC2327b != null) {
            String str = abstractC2327b.f20359n.c;
            C2221f c2221f3 = new C2221f(c2221f2);
            c2221f3.f19975a.add(str);
            if (c2221f.a(i, this.f20362q.f20359n.c)) {
                AbstractC2327b abstractC2327b2 = this.f20362q;
                C2221f c2221f4 = new C2221f(c2221f3);
                c2221f4.f19976b = abstractC2327b2;
                arrayList.add(c2221f4);
            }
            if (c2221f.d(i, c2330e.c)) {
                this.f20362q.p(c2221f, c2221f.b(i, this.f20362q.f20359n.c) + i, arrayList, c2221f3);
            }
        }
        if (c2221f.c(i, c2330e.c)) {
            String str2 = c2330e.c;
            if (!numX49.tnTj78("bL9h").equals(str2)) {
                C2221f c2221f5 = new C2221f(c2221f2);
                c2221f5.f19975a.add(str2);
                if (c2221f.a(i, str2)) {
                    C2221f c2221f6 = new C2221f(c2221f5);
                    c2221f6.f19976b = this;
                    arrayList.add(c2221f6);
                }
                c2221f2 = c2221f5;
            }
            if (c2221f.d(i, str2)) {
                p(c2221f, c2221f.b(i, str2) + i, arrayList, c2221f2);
            }
        }
    }

    @Override // s.InterfaceC2222g
    public void d(ColorFilter colorFilter, A.c cVar) {
        this.f20366u.c(colorFilter, cVar);
    }

    @Override // p.e
    public void e(RectF rectF, Matrix matrix, boolean z4) {
        this.h.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.f20358l;
        matrix2.set(matrix);
        if (z4) {
            List list = this.f20364s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((AbstractC2327b) this.f20364s.get(size)).f20366u.e());
                }
            } else {
                AbstractC2327b abstractC2327b = this.f20363r;
                if (abstractC2327b != null) {
                    matrix2.preConcat(abstractC2327b.f20366u.e());
                }
            }
        }
        matrix2.preConcat(this.f20366u.e());
    }

    public final void f(q.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f20365t.add(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    @Override // p.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.graphics.Canvas r22, android.graphics.Matrix r23, int r24) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.AbstractC2327b.g(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void h() {
        if (this.f20364s != null) {
            return;
        }
        if (this.f20363r == null) {
            this.f20364s = Collections.EMPTY_LIST;
            return;
        }
        this.f20364s = new ArrayList();
        for (AbstractC2327b abstractC2327b = this.f20363r; abstractC2327b != null; abstractC2327b = abstractC2327b.f20363r) {
            this.f20364s.add(abstractC2327b);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f20356g);
        AbstractC1876c.a();
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i);

    public p8.a k() {
        return this.f20359n.f20393w;
    }

    public Ci.b l() {
        return this.f20359n.f20394x;
    }

    public final boolean m() {
        C2151a c2151a = this.f20360o;
        return (c2151a == null || ((ArrayList) c2151a.f19707a).isEmpty()) ? false : true;
    }

    public final void n() {
        z zVar = this.m.f18489b.f18459a;
        String str = this.f20359n.c;
        if (zVar.f18537a) {
            HashMap map = zVar.c;
            C2542d c2542d = (C2542d) map.get(str);
            if (c2542d == null) {
                c2542d = new C2542d();
                map.put(str, c2542d);
            }
            int i = c2542d.f21339a + 1;
            c2542d.f21339a = i;
            if (i == Integer.MAX_VALUE) {
                c2542d.f21339a = i / 2;
            }
            if (str.equals(numX49.tnTj78("bL9M"))) {
                Iterator<E> it = zVar.f18538b.iterator();
                if (it.hasNext()) {
                    throw AbstractC1331a.n(it);
                }
            }
        }
    }

    public final void o(q.e eVar) {
        this.f20365t.remove(eVar);
    }

    public void p(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
    }

    public void q(boolean z4) {
        if (z4 && this.f20369x == null) {
            this.f20369x = new C1953a();
        }
        this.f20368w = z4;
    }

    public void r(float f) {
        A a8 = this.f20366u;
        q.e eVar = (q.e) a8.j;
        if (eVar != null) {
            eVar.j(f);
        }
        q.e eVar2 = (q.e) a8.m;
        if (eVar2 != null) {
            eVar2.j(f);
        }
        q.e eVar3 = (q.e) a8.f797n;
        if (eVar3 != null) {
            eVar3.j(f);
        }
        q.e eVar4 = (q.e) a8.f;
        if (eVar4 != null) {
            eVar4.j(f);
        }
        q.e eVar5 = (q.e) a8.f794g;
        if (eVar5 != null) {
            eVar5.j(f);
        }
        q.e eVar6 = (q.e) a8.h;
        if (eVar6 != null) {
            eVar6.j(f);
        }
        q.e eVar7 = (q.e) a8.i;
        if (eVar7 != null) {
            eVar7.j(f);
        }
        q.i iVar = (q.i) a8.f795k;
        if (iVar != null) {
            iVar.j(f);
        }
        q.i iVar2 = (q.i) a8.f796l;
        if (iVar2 != null) {
            iVar2.j(f);
        }
        C2151a c2151a = this.f20360o;
        int i = 0;
        if (c2151a != null) {
            int i4 = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) c2151a.f19707a;
                if (i4 >= arrayList.size()) {
                    break;
                }
                ((q.e) arrayList.get(i4)).j(f);
                i4++;
            }
        }
        q.i iVar3 = this.f20361p;
        if (iVar3 != null) {
            iVar3.j(f);
        }
        AbstractC2327b abstractC2327b = this.f20362q;
        if (abstractC2327b != null) {
            abstractC2327b.r(f);
        }
        while (true) {
            ArrayList arrayList2 = this.f20365t;
            if (i >= arrayList2.size()) {
                return;
            }
            ((q.e) arrayList2.get(i)).j(f);
            i++;
        }
    }
}
