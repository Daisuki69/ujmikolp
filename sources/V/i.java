package v;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.google.firebase.messaging.r;
import java.util.HashMap;
import java.util.List;
import n.C1880g;
import n.s;
import n.v;
import o.C1953a;
import q.p;
import t.C2264a;
import t.C2265b;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends AbstractC2327b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final StringBuilder f20403A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RectF f20404B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Matrix f20405C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C1953a f20406D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1953a f20407E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final HashMap f20408F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final LongSparseArray f20409G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final q.f f20410H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final s f20411I;
    public final C1880g J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final q.f f20412K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public p f20413L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final q.f f20414M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public p f20415N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final q.i f20416O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public p f20417P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final q.i f20418Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public p f20419R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public p f20420S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public p f20421T;

    public i(s sVar, C2330e c2330e) {
        C2265b c2265b;
        C2265b c2265b2;
        C2264a c2264a;
        C2264a c2264a2;
        super(sVar, c2330e);
        this.f20403A = new StringBuilder(2);
        this.f20404B = new RectF();
        this.f20405C = new Matrix();
        C1953a c1953a = new C1953a(1, 1);
        c1953a.setStyle(Paint.Style.FILL);
        this.f20406D = c1953a;
        C1953a c1953a2 = new C1953a(1, 2);
        c1953a2.setStyle(Paint.Style.STROKE);
        this.f20407E = c1953a2;
        this.f20408F = new HashMap();
        this.f20409G = new LongSparseArray();
        this.f20411I = sVar;
        this.J = c2330e.f20379b;
        q.f fVar = new q.f((List) c2330e.f20387q.f5552b, 2);
        this.f20410H = fVar;
        fVar.a(this);
        f(fVar);
        r rVar = c2330e.f20388r;
        if (rVar != null && (c2264a2 = (C2264a) rVar.f9803b) != null) {
            q.e eVarF = c2264a2.f();
            this.f20412K = (q.f) eVarF;
            eVarF.a(this);
            f(eVarF);
        }
        if (rVar != null && (c2264a = (C2264a) rVar.c) != null) {
            q.e eVarF2 = c2264a.f();
            this.f20414M = (q.f) eVarF2;
            eVarF2.a(this);
            f(eVarF2);
        }
        if (rVar != null && (c2265b2 = (C2265b) rVar.f9804d) != null) {
            q.e eVarF3 = c2265b2.f();
            this.f20416O = (q.i) eVarF3;
            eVarF3.a(this);
            f(eVarF3);
        }
        if (rVar == null || (c2265b = (C2265b) rVar.e) == null) {
            return;
        }
        q.e eVarF4 = c2265b.f();
        this.f20418Q = (q.i) eVarF4;
        eVarF4.a(this);
        f(eVarF4);
    }

    public static void s(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void t(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // v.AbstractC2327b, s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        super.d(colorFilter, cVar);
        PointF pointF = v.f18512a;
        if (colorFilter == 1) {
            p pVar = this.f20413L;
            if (pVar != null) {
                o(pVar);
            }
            p pVar2 = new p(cVar, null);
            this.f20413L = pVar2;
            pVar2.a(this);
            f(this.f20413L);
            return;
        }
        if (colorFilter == 2) {
            p pVar3 = this.f20415N;
            if (pVar3 != null) {
                o(pVar3);
            }
            p pVar4 = new p(cVar, null);
            this.f20415N = pVar4;
            pVar4.a(this);
            f(this.f20415N);
            return;
        }
        if (colorFilter == v.f18518n) {
            p pVar5 = this.f20417P;
            if (pVar5 != null) {
                o(pVar5);
            }
            p pVar6 = new p(cVar, null);
            this.f20417P = pVar6;
            pVar6.a(this);
            f(this.f20417P);
            return;
        }
        if (colorFilter == v.f18519o) {
            p pVar7 = this.f20419R;
            if (pVar7 != null) {
                o(pVar7);
            }
            p pVar8 = new p(cVar, null);
            this.f20419R = pVar8;
            pVar8.a(this);
            f(this.f20419R);
            return;
        }
        if (colorFilter == v.f18503A) {
            p pVar9 = this.f20420S;
            if (pVar9 != null) {
                o(pVar9);
            }
            p pVar10 = new p(cVar, null);
            this.f20420S = pVar10;
            pVar10.a(this);
            f(this.f20420S);
            return;
        }
        if (colorFilter == v.f18510H) {
            p pVar11 = this.f20421T;
            if (pVar11 != null) {
                o(pVar11);
            }
            p pVar12 = new p(cVar, null);
            this.f20421T = pVar12;
            pVar12.a(this);
            f(this.f20421T);
        }
    }

    @Override // v.AbstractC2327b, p.e
    public final void e(RectF rectF, Matrix matrix, boolean z4) {
        super.e(rectF, matrix, z4);
        C1880g c1880g = this.J;
        rectF.set(0.0f, 0.0f, c1880g.j.width(), c1880g.j.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0417  */
    @Override // v.AbstractC2327b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(android.graphics.Canvas r32, android.graphics.Matrix r33, int r34) {
        /*
            Method dump skipped, instruction units count: 1295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.i.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
