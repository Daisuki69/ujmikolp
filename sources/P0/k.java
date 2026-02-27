package P0;

import S1.v;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f4976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RectF f4977b;
    public Rect c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f4978d;
    public boolean e;

    public final void a(int i, float f, float f3, RectF rectF, boolean z4, int i4, boolean z5) {
        j jVar = new j();
        jVar.f4974d = i;
        jVar.f4972a = f;
        jVar.f4973b = f3;
        jVar.c = rectF;
        jVar.e = z4;
        jVar.f = i4;
        jVar.f4975g = z5;
        sendMessage(obtainMessage(1, jVar));
    }

    public final S0.b b(j jVar) {
        i iVar = this.f4976a.f4938g;
        int i = jVar.f4974d;
        int iA = iVar.a(i);
        if (iA >= 0) {
            synchronized (i.f4960s) {
                try {
                    if (iVar.f.indexOfKey(iA) < 0) {
                        try {
                            iVar.f4962b.j(iVar.f4961a, iA);
                            iVar.f.put(iA, true);
                        } catch (Exception e) {
                            iVar.f.put(iA, false);
                            throw new PageRenderingException(i, e);
                        }
                    }
                } finally {
                }
            }
        }
        int iRound = Math.round(jVar.f4972a);
        int iRound2 = Math.round(jVar.f4973b);
        if (iRound != 0 && iRound2 != 0) {
            if (iVar.f.get(iVar.a(jVar.f4974d), false)) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, Bitmap.Config.RGB_565);
                    RectF rectF = jVar.c;
                    Matrix matrix = this.f4978d;
                    matrix.reset();
                    float f = iRound;
                    float f3 = iRound2;
                    matrix.postTranslate((-rectF.left) * f, (-rectF.top) * f3);
                    matrix.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
                    RectF rectF2 = this.f4977b;
                    rectF2.set(0.0f, 0.0f, f, f3);
                    matrix.mapRect(rectF2);
                    rectF2.round(this.c);
                    int i4 = jVar.f4974d;
                    Rect rect = this.c;
                    boolean z4 = jVar.f4975g;
                    iVar.f4962b.l(iVar.f4961a, bitmapCreateBitmap, iVar.a(i4), rect.left, rect.top, rect.width(), rect.height(), z4);
                    return new S0.b(jVar.f4974d, bitmapCreateBitmap, jVar.c, jVar.e, jVar.f);
                } catch (IllegalArgumentException e7) {
                    Log.e("P0.k", "Cannot create bitmap", e7);
                }
            }
        }
        return null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        f fVar = this.f4976a;
        try {
            S0.b bVarB = b((j) message.obj);
            if (bVarB != null) {
                if (this.e) {
                    fVar.post(new v(14, this, bVarB, false));
                } else {
                    bVarB.f5594b.recycle();
                }
            }
        } catch (PageRenderingException e) {
            fVar.post(new v(15, this, e, false));
        }
    }
}
