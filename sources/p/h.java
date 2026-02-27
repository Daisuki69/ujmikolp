package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.List;
import n.AbstractC1876c;
import n.v;
import o.C1953a;
import q.InterfaceC2157a;
import s.C2221f;
import t.C2265b;
import v.AbstractC2327b;
import z.AbstractC2543e;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements e, InterfaceC2157a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18960b;
    public final AbstractC2327b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LongSparseArray f18961d = new LongSparseArray();
    public final LongSparseArray e = new LongSparseArray();
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1953a f18962g;
    public final RectF h;
    public final ArrayList i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q.j f18963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q.f f18964l;
    public final q.j m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q.j f18965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q.p f18966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q.p f18967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n.s f18968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public q.e f18970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f18971t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q.h f18972u;

    public h(n.s sVar, AbstractC2327b abstractC2327b, u.d dVar) {
        Path path = new Path();
        this.f = path;
        this.f18962g = new C1953a(1, 0);
        this.h = new RectF();
        this.i = new ArrayList();
        this.f18971t = 0.0f;
        this.c = abstractC2327b;
        this.f18959a = dVar.f20219g;
        this.f18960b = dVar.h;
        this.f18968q = sVar;
        this.j = dVar.f20216a;
        path.setFillType(dVar.f20217b);
        this.f18969r = (int) (sVar.f18489b.b() / 32.0f);
        q.e eVarF = dVar.c.f();
        this.f18963k = (q.j) eVarF;
        eVarF.a(this);
        abstractC2327b.f(eVarF);
        q.e eVarF2 = dVar.f20218d.f();
        this.f18964l = (q.f) eVarF2;
        eVarF2.a(this);
        abstractC2327b.f(eVarF2);
        q.e eVarF3 = dVar.e.f();
        this.m = (q.j) eVarF3;
        eVarF3.a(this);
        abstractC2327b.f(eVarF3);
        q.e eVarF4 = dVar.f.f();
        this.f18965n = (q.j) eVarF4;
        eVarF4.a(this);
        abstractC2327b.f(eVarF4);
        if (abstractC2327b.k() != null) {
            q.e eVarF5 = ((C2265b) abstractC2327b.k().f19074b).f();
            this.f18970s = eVarF5;
            eVarF5.a(this);
            abstractC2327b.f(this.f18970s);
        }
        if (abstractC2327b.l() != null) {
            this.f18972u = new q.h(this, abstractC2327b, abstractC2327b.l());
        }
    }

    @Override // q.InterfaceC2157a
    public final void a() {
        this.f18968q.invalidateSelf();
    }

    @Override // p.c
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = (c) list2.get(i);
            if (cVar instanceof m) {
                this.i.add((m) cVar);
            }
        }
    }

    @Override // s.InterfaceC2222g
    public final void c(C2221f c2221f, int i, ArrayList arrayList, C2221f c2221f2) {
        AbstractC2543e.e(c2221f, i, arrayList, c2221f2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        PointF pointF = v.f18512a;
        if (colorFilter == 4) {
            this.f18964l.k(cVar);
            return;
        }
        ColorFilter colorFilter2 = v.f18508F;
        AbstractC2327b abstractC2327b = this.c;
        if (colorFilter == colorFilter2) {
            q.p pVar = this.f18966o;
            if (pVar != null) {
                abstractC2327b.o(pVar);
            }
            q.p pVar2 = new q.p(cVar, null);
            this.f18966o = pVar2;
            pVar2.a(this);
            abstractC2327b.f(this.f18966o);
            return;
        }
        if (colorFilter == v.f18509G) {
            q.p pVar3 = this.f18967p;
            if (pVar3 != null) {
                abstractC2327b.o(pVar3);
            }
            this.f18961d.clear();
            this.e.clear();
            q.p pVar4 = new q.p(cVar, null);
            this.f18967p = pVar4;
            pVar4.a(this);
            abstractC2327b.f(this.f18967p);
            return;
        }
        if (colorFilter == v.e) {
            q.e eVar = this.f18970s;
            if (eVar != null) {
                eVar.k(cVar);
                return;
            }
            q.p pVar5 = new q.p(cVar, null);
            this.f18970s = pVar5;
            pVar5.a(this);
            abstractC2327b.f(this.f18970s);
            return;
        }
        q.h hVar = this.f18972u;
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
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
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

    public final int[] f(int[] iArr) {
        q.p pVar = this.f18967p;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.f();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // p.e
    public final void g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.f18960b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i4 >= arrayList.size()) {
                break;
            }
            path.addPath(((m) arrayList.get(i4)).getPath(), matrix);
            i4++;
        }
        path.computeBounds(this.h, false);
        int i6 = this.j;
        q.j jVar = this.f18963k;
        q.j jVar2 = this.f18965n;
        q.j jVar3 = this.m;
        if (i6 == 1) {
            long jH = h();
            LongSparseArray longSparseArray = this.f18961d;
            shader = (LinearGradient) longSparseArray.get(jH);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.f();
                PointF pointF2 = (PointF) jVar2.f();
                u.c cVar = (u.c) jVar.f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, f(cVar.f20215b), cVar.f20214a, Shader.TileMode.CLAMP);
                longSparseArray.put(jH, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jH2 = h();
            LongSparseArray longSparseArray2 = this.e;
            shader = (RadialGradient) longSparseArray2.get(jH2);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.f();
                PointF pointF4 = (PointF) jVar2.f();
                u.c cVar2 = (u.c) jVar.f();
                int[] iArrF = f(cVar2.f20215b);
                float f = pointF3.x;
                float f3 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f3);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f3, fHypot, iArrF, cVar2.f20214a, Shader.TileMode.CLAMP);
                longSparseArray2.put(jH2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        C1953a c1953a = this.f18962g;
        c1953a.setShader(shader);
        q.p pVar = this.f18966o;
        if (pVar != null) {
            c1953a.setColorFilter((ColorFilter) pVar.f());
        }
        q.e eVar = this.f18970s;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.f()).floatValue();
            if (fFloatValue == 0.0f) {
                c1953a.setMaskFilter(null);
            } else if (fFloatValue != this.f18971t) {
                c1953a.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f18971t = fFloatValue;
        }
        q.h hVar = this.f18972u;
        if (hVar != null) {
            hVar.b(c1953a);
        }
        PointF pointF5 = AbstractC2543e.f21340a;
        c1953a.setAlpha(Math.max(0, Math.min(255, (int) ((((i / 255.0f) * ((Integer) this.f18964l.f()).intValue()) / 100.0f) * 255.0f))));
        canvas.drawPath(path, c1953a);
        AbstractC1876c.a();
    }

    @Override // p.c
    public final String getName() {
        return this.f18959a;
    }

    public final int h() {
        float f = this.m.f19722d;
        float f3 = this.f18969r;
        int iRound = Math.round(f * f3);
        int iRound2 = Math.round(this.f18965n.f19722d * f3);
        int iRound3 = Math.round(this.f18963k.f19722d * f3);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
