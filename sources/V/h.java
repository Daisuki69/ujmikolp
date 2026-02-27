package v;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import n.s;
import n.v;
import o.C1953a;
import q.p;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends AbstractC2327b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RectF f20397A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1953a f20398B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float[] f20399C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Path f20400D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C2330e f20401E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p f20402F;

    public h(s sVar, C2330e c2330e) {
        super(sVar, c2330e);
        this.f20397A = new RectF();
        C1953a c1953a = new C1953a();
        this.f20398B = c1953a;
        this.f20399C = new float[8];
        this.f20400D = new Path();
        this.f20401E = c2330e;
        c1953a.setAlpha(0);
        c1953a.setStyle(Paint.Style.FILL);
        c1953a.setColor(c2330e.f20383l);
    }

    @Override // v.AbstractC2327b, s.InterfaceC2222g
    public final void d(ColorFilter colorFilter, A.c cVar) {
        super.d(colorFilter, cVar);
        if (colorFilter == v.f18508F) {
            this.f20402F = new p(cVar, null);
        }
    }

    @Override // v.AbstractC2327b, p.e
    public final void e(RectF rectF, Matrix matrix, boolean z4) {
        super.e(rectF, matrix, z4);
        RectF rectF2 = this.f20397A;
        C2330e c2330e = this.f20401E;
        rectF2.set(0.0f, 0.0f, c2330e.j, c2330e.f20382k);
        this.f20358l.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // v.AbstractC2327b
    public final void j(Canvas canvas, Matrix matrix, int i) {
        C2330e c2330e = this.f20401E;
        int iAlpha = Color.alpha(c2330e.f20383l);
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (((q.e) this.f20366u.j) == null ? 100 : ((Integer) r2.f()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        C1953a c1953a = this.f20398B;
        c1953a.setAlpha(iIntValue);
        p pVar = this.f20402F;
        if (pVar != null) {
            c1953a.setColorFilter((ColorFilter) pVar.f());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f20399C;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = c2330e.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f3 = c2330e.f20382k;
            fArr[5] = f3;
            fArr[6] = 0.0f;
            fArr[7] = f3;
            matrix.mapPoints(fArr);
            Path path = this.f20400D;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, c1953a);
        }
    }
}
