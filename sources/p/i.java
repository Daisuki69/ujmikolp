package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import n.v;
import s.AbstractC2217b;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends AbstractC2001b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final q.j f18973A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public q.p f18974B;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f18975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f18976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LongSparseArray f18977t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LongSparseArray f18978u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f18979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f18980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f18981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q.j f18982y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q.j f18983z;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(n.s sVar, AbstractC2327b abstractC2327b, u.e eVar) {
        int iC = AbstractC2217b.c(eVar.h);
        Paint.Cap cap = iC != 0 ? iC != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iC2 = AbstractC2217b.c(eVar.i);
        super(sVar, abstractC2327b, cap, iC2 != 0 ? iC2 != 1 ? iC2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, eVar.j, eVar.f20222d, eVar.f20223g, eVar.f20224k, eVar.f20225l);
        this.f18977t = new LongSparseArray();
        this.f18978u = new LongSparseArray();
        this.f18979v = new RectF();
        this.f18975r = eVar.f20220a;
        this.f18980w = eVar.f20221b;
        this.f18976s = eVar.m;
        this.f18981x = (int) (sVar.f18489b.b() / 32.0f);
        q.e eVarF = eVar.c.f();
        this.f18982y = (q.j) eVarF;
        eVarF.a(this);
        abstractC2327b.f(eVarF);
        q.e eVarF2 = eVar.e.f();
        this.f18983z = (q.j) eVarF2;
        eVarF2.a(this);
        abstractC2327b.f(eVarF2);
        q.e eVarF3 = eVar.f.f();
        this.f18973A = (q.j) eVarF3;
        eVarF3.a(this);
        abstractC2327b.f(eVarF3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.AbstractC2001b, s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        super.d(colorFilter, cVar);
        if (colorFilter == v.f18509G) {
            q.p pVar = this.f18974B;
            AbstractC2327b abstractC2327b = this.f;
            if (pVar != null) {
                abstractC2327b.o(pVar);
            }
            q.p pVar2 = new q.p(cVar, null);
            this.f18974B = pVar2;
            pVar2.a(this);
            abstractC2327b.f(this.f18974B);
        }
    }

    public final int[] f(int[] iArr) {
        q.p pVar = this.f18974B;
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

    @Override // p.AbstractC2001b, p.e
    public final void g(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.f18976s) {
            return;
        }
        e(this.f18979v, matrix, false);
        int i4 = this.f18980w;
        q.j jVar = this.f18982y;
        q.j jVar2 = this.f18973A;
        q.j jVar3 = this.f18983z;
        if (i4 == 1) {
            long jH = h();
            LongSparseArray longSparseArray = this.f18977t;
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
            LongSparseArray longSparseArray2 = this.f18978u;
            shader = (RadialGradient) longSparseArray2.get(jH2);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.f();
                PointF pointF4 = (PointF) jVar2.f();
                u.c cVar2 = (u.c) jVar.f();
                int[] iArrF = f(cVar2.f20215b);
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrF, cVar2.f20214a, Shader.TileMode.CLAMP);
                longSparseArray2.put(jH2, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.i.setShader(shader);
        super.g(canvas, matrix, i);
    }

    @Override // p.c
    public final String getName() {
        return this.f18975r;
    }

    public final int h() {
        float f = this.f18983z.f19722d;
        float f3 = this.f18981x;
        int iRound = Math.round(f * f3);
        int iRound2 = Math.round(this.f18973A.f19722d * f3);
        int iRound3 = Math.round(this.f18982y.f19722d * f3);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
