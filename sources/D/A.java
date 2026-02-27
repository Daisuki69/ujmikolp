package D;

import ag.C0692b;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import q.InterfaceC2157a;
import t.C2264a;
import t.C2265b;
import v.AbstractC2327b;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f792b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f793d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f794g;
    public Object h;
    public Object i;
    public Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f796l;
    public Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f797n;

    public A(t.d dVar) {
        this.f791a = new Matrix();
        C0692b c0692b = dVar.f20140a;
        this.f = c0692b == null ? null : c0692b.f();
        t.e eVar = dVar.f20141b;
        this.f794g = eVar == null ? null : eVar.f();
        C2264a c2264a = dVar.c;
        this.h = c2264a == null ? null : c2264a.f();
        C2265b c2265b = dVar.f20142d;
        this.i = c2265b == null ? null : c2265b.f();
        C2265b c2265b2 = dVar.f;
        q.i iVar = c2265b2 == null ? null : (q.i) c2265b2.f();
        this.f795k = iVar;
        if (iVar != null) {
            this.f792b = new Matrix();
            this.c = new Matrix();
            this.f793d = new Matrix();
            this.e = new float[9];
        } else {
            this.f792b = null;
            this.c = null;
            this.f793d = null;
            this.e = null;
        }
        C2265b c2265b3 = dVar.f20143g;
        this.f796l = c2265b3 == null ? null : (q.i) c2265b3.f();
        C2264a c2264a2 = dVar.e;
        if (c2264a2 != null) {
            this.j = c2264a2.f();
        }
        C2265b c2265b4 = dVar.h;
        if (c2265b4 != null) {
            this.m = c2265b4.f();
        } else {
            this.m = null;
        }
        C2265b c2265b5 = dVar.i;
        if (c2265b5 != null) {
            this.f797n = c2265b5.f();
        } else {
            this.f797n = null;
        }
    }

    public void a(AbstractC2327b abstractC2327b) {
        abstractC2327b.f((q.e) this.j);
        abstractC2327b.f((q.e) this.m);
        abstractC2327b.f((q.e) this.f797n);
        abstractC2327b.f((q.e) this.f);
        abstractC2327b.f((q.e) this.f794g);
        abstractC2327b.f((q.e) this.h);
        abstractC2327b.f((q.e) this.i);
        abstractC2327b.f((q.i) this.f795k);
        abstractC2327b.f((q.i) this.f796l);
    }

    public void b(InterfaceC2157a interfaceC2157a) {
        q.e eVar = (q.e) this.j;
        if (eVar != null) {
            eVar.a(interfaceC2157a);
        }
        q.e eVar2 = (q.e) this.m;
        if (eVar2 != null) {
            eVar2.a(interfaceC2157a);
        }
        q.e eVar3 = (q.e) this.f797n;
        if (eVar3 != null) {
            eVar3.a(interfaceC2157a);
        }
        q.e eVar4 = (q.e) this.f;
        if (eVar4 != null) {
            eVar4.a(interfaceC2157a);
        }
        q.e eVar5 = (q.e) this.f794g;
        if (eVar5 != null) {
            eVar5.a(interfaceC2157a);
        }
        q.e eVar6 = (q.e) this.h;
        if (eVar6 != null) {
            eVar6.a(interfaceC2157a);
        }
        q.e eVar7 = (q.e) this.i;
        if (eVar7 != null) {
            eVar7.a(interfaceC2157a);
        }
        q.i iVar = (q.i) this.f795k;
        if (iVar != null) {
            iVar.a(interfaceC2157a);
        }
        q.i iVar2 = (q.i) this.f796l;
        if (iVar2 != null) {
            iVar2.a(interfaceC2157a);
        }
    }

    public boolean c(ColorFilter colorFilter, A.c cVar) {
        q.i iVar;
        q.i iVar2;
        q.e eVar;
        q.e eVar2;
        if (colorFilter == n.v.f18512a) {
            q.e eVar3 = (q.e) this.f;
            if (eVar3 == null) {
                this.f = new q.p(cVar, new PointF());
                return true;
            }
            eVar3.k(cVar);
            return true;
        }
        if (colorFilter == n.v.f18513b) {
            q.e eVar4 = (q.e) this.f794g;
            if (eVar4 == null) {
                this.f794g = new q.p(cVar, new PointF());
                return true;
            }
            eVar4.k(cVar);
            return true;
        }
        if (colorFilter == n.v.c) {
            q.e eVar5 = (q.e) this.f794g;
            if (eVar5 instanceof q.o) {
                q.o oVar = (q.o) eVar5;
                A.c cVar2 = oVar.m;
                oVar.m = cVar;
                return true;
            }
        }
        if (colorFilter == n.v.f18514d) {
            q.e eVar6 = (q.e) this.f794g;
            if (eVar6 instanceof q.o) {
                q.o oVar2 = (q.o) eVar6;
                A.c cVar3 = oVar2.f19734n;
                oVar2.f19734n = cVar;
                return true;
            }
        }
        if (colorFilter == n.v.j) {
            q.e eVar7 = (q.e) this.h;
            if (eVar7 == null) {
                this.h = new q.p(cVar, new A.d());
                return true;
            }
            eVar7.k(cVar);
            return true;
        }
        if (colorFilter == n.v.f18516k) {
            q.e eVar8 = (q.e) this.i;
            if (eVar8 == null) {
                this.i = new q.p(cVar, Float.valueOf(0.0f));
                return true;
            }
            eVar8.k(cVar);
            return true;
        }
        if (colorFilter == 3) {
            q.e eVar9 = (q.e) this.j;
            if (eVar9 == null) {
                this.j = new q.p(cVar, 100);
                return true;
            }
            eVar9.k(cVar);
            return true;
        }
        if (colorFilter == n.v.f18528x && (eVar2 = (q.e) this.m) != null) {
            eVar2.k(cVar);
            return true;
        }
        if (colorFilter == n.v.f18529y && (eVar = (q.e) this.f797n) != null) {
            eVar.k(cVar);
            return true;
        }
        if (colorFilter == n.v.f18517l && (iVar2 = (q.i) this.f795k) != null) {
            iVar2.k(cVar);
            return true;
        }
        if (colorFilter != n.v.m || (iVar = (q.i) this.f796l) == null) {
            return false;
        }
        iVar.k(cVar);
        return true;
    }

    public void d() {
        for (int i = 0; i < 9; i++) {
            ((float[]) this.e)[i] = 0.0f;
        }
    }

    public Matrix e() {
        Matrix matrix = (Matrix) this.f791a;
        matrix.reset();
        q.e eVar = (q.e) this.f794g;
        if (eVar != null) {
            PointF pointF = (PointF) eVar.f();
            float f = pointF.x;
            if (f != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(f, pointF.y);
            }
        }
        q.e eVar2 = (q.e) this.i;
        if (eVar2 != null) {
            float fFloatValue = eVar2 instanceof q.p ? ((Float) eVar2.f()).floatValue() : ((q.i) eVar2).l();
            if (fFloatValue != 0.0f) {
                matrix.preRotate(fFloatValue);
            }
        }
        if (((q.i) this.f795k) != null) {
            float fCos = ((q.i) this.f796l) == null ? 0.0f : (float) Math.cos(Math.toRadians((-r1.l()) + 90.0f));
            float fSin = ((q.i) this.f796l) == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.l()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(((q.i) this.f795k).l()));
            d();
            float[] fArr = (float[]) this.e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f3 = -fSin;
            fArr[3] = f3;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = (Matrix) this.f792b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = (Matrix) this.c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f3;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = (Matrix) this.f793d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        q.e eVar3 = (q.e) this.h;
        if (eVar3 != null) {
            A.d dVar = (A.d) eVar3.f();
            float f7 = dVar.f16a;
            if (f7 != 1.0f || dVar.f17b != 1.0f) {
                matrix.preScale(f7, dVar.f17b);
            }
        }
        q.e eVar4 = (q.e) this.f;
        if (eVar4 != null) {
            PointF pointF2 = (PointF) eVar4.f();
            float f10 = pointF2.x;
            if (f10 != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(-f10, -pointF2.y);
            }
        }
        return matrix;
    }

    public Matrix f(float f) {
        q.e eVar = (q.e) this.f794g;
        PointF pointF = eVar == null ? null : (PointF) eVar.f();
        q.e eVar2 = (q.e) this.h;
        A.d dVar = eVar2 == null ? null : (A.d) eVar2.f();
        Matrix matrix = (Matrix) this.f791a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (dVar != null) {
            double d10 = f;
            matrix.preScale((float) Math.pow(dVar.f16a, d10), (float) Math.pow(dVar.f17b, d10));
        }
        q.e eVar3 = (q.e) this.i;
        if (eVar3 != null) {
            float fFloatValue = ((Float) eVar3.f()).floatValue();
            q.e eVar4 = (q.e) this.f;
            PointF pointF2 = eVar4 != null ? (PointF) eVar4.f() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }

    public void g() {
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.i;
        if (!cleverTapInstanceConfig.h) {
            l0.b.a(cleverTapInstanceConfig).b().k(numX49.tnTj78("PeZj"), new CallableC0192z(this, 0));
        } else {
            S sC = cleverTapInstanceConfig.c();
            String str = cleverTapInstanceConfig.f9439a;
            sC.getClass();
            S.g(str, numX49.tnTj78("PeZS"));
        }
    }

    public A(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C0178k c0178k, r rVar, H h, Ci.b bVar) {
        this.i = cleverTapInstanceConfig;
        this.f = c0178k;
        this.h = rVar;
        this.f795k = h;
        this.j = context;
        this.f792b = bVar;
    }
}
