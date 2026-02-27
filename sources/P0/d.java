package P0;

import Kh.C;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.OverScroller;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.SizeF;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f4908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f4909b;
    public GestureDetector c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScaleGestureDetector f4910d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4911g;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        f fVar = this.f4908a;
        if (!fVar.f4951x) {
            return false;
        }
        if (fVar.getZoom() < fVar.getMidZoom()) {
            fVar.e.e(motionEvent.getX(), motionEvent.getY(), fVar.f4939k, fVar.getMidZoom());
            return true;
        }
        if (fVar.getZoom() < fVar.getMaxZoom()) {
            fVar.e.e(motionEvent.getX(), motionEvent.getY(), fVar.f4939k, fVar.getMaxZoom());
            return true;
        }
        fVar.e.e(fVar.getWidth() / 2, fVar.getHeight() / 2, fVar.f4939k, fVar.f4933a);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C c = this.f4909b;
        c.f2678a = false;
        ((OverScroller) c.e).forceFinished(true);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r7 < (r8 - r3.getHeight())) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r7 < (r8 - r3.getWidth())) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r11 = (int) r3.getCurrentXOffset();
        r12 = (int) r3.getCurrentYOffset();
        r4 = r3.f4938g;
        r5 = -r4.e(r3.getZoom(), r3.getCurrentPage());
        r7 = r5 - r4.d(r3.getZoom(), r3.getCurrentPage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r3.f4949v == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r4 = -((r4.b().f15515a * r3.f4939k) - r3.getWidth());
        r7 = r7 + r3.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
    
        r7 = r7 + r3.getWidth();
        r3 = -((r4.b().f15516b * r3.f4939k) - r3.getHeight());
        r9 = r5;
        r5 = 0.0f;
        r4 = r7;
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        r4 = r19.f4909b;
        r4.f();
        r4.f2678a = true;
        ((android.widget.OverScroller) r4.e).fling(r11, r12, (int) r22, (int) r23, (int) r4, (int) r9, (int) r7, (int) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onFling(android.view.MotionEvent r20, android.view.MotionEvent r21, float r22, float r23) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.d.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f4908a.f4944q.getClass();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        f fVar = this.f4908a;
        float zoom = fVar.getZoom() * scaleFactor;
        float fMin = Math.min(1.0f, fVar.getMinZoom());
        float fMin2 = Math.min(10.0f, fVar.getMaxZoom());
        if (zoom < fMin) {
            scaleFactor = fMin / fVar.getZoom();
        } else if (zoom > fMin2) {
            scaleFactor = fMin2 / fVar.getZoom();
        }
        fVar.s(new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()), fVar.f4939k * scaleFactor);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f4908a.m();
        this.f4908a.getScrollHandle();
        this.f = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f3) {
        this.e = true;
        f fVar = this.f4908a;
        if (fVar.f4939k != fVar.f4933a || fVar.f4950w) {
            fVar.n(fVar.i + (-f), fVar.j + (-f3));
        }
        if (this.f) {
            return true;
        }
        fVar.l();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int iH;
        int iE;
        f fVar = this.f4908a;
        fVar.f4944q.getClass();
        float x6 = motionEvent.getX();
        float y7 = motionEvent.getY();
        i iVar = fVar.f4938g;
        if (iVar == null) {
            fVar.getScrollHandle();
        } else {
            float f = (-fVar.getCurrentXOffset()) + x6;
            float f3 = (-fVar.getCurrentYOffset()) + y7;
            int iC = iVar.c(fVar.f4949v ? f3 : f, fVar.getZoom());
            SizeF sizeFG = iVar.g(fVar.getZoom(), iC);
            if (fVar.f4949v) {
                iE = (int) iVar.h(fVar.getZoom(), iC);
                iH = (int) iVar.e(fVar.getZoom(), iC);
            } else {
                iH = (int) iVar.h(fVar.getZoom(), iC);
                iE = (int) iVar.e(fVar.getZoom(), iC);
            }
            int i = iE;
            int i4 = iH;
            int iA = iVar.a(iC);
            PdfDocument pdfDocument = iVar.f4961a;
            PdfiumCore pdfiumCore = iVar.f4962b;
            Iterator it = pdfiumCore.d(pdfDocument, iA).iterator();
            while (it.hasNext()) {
                PdfDocument.Link link = (PdfDocument.Link) it.next();
                int i6 = (int) sizeFG.f15515a;
                int i10 = (int) sizeFG.f15516b;
                RectF rectF = link.f15509a;
                int iA2 = iVar.a(iC);
                PdfDocument pdfDocument2 = iVar.f4961a;
                int i11 = iC;
                i iVar2 = iVar;
                Point pointG = pdfiumCore.g(pdfDocument2, iA2, i, i4, i6, i10, rectF.left, rectF.top);
                SizeF sizeF = sizeFG;
                Iterator it2 = it;
                Point pointG2 = pdfiumCore.g(pdfDocument2, iA2, i, i4, i6, i10, rectF.right, rectF.bottom);
                RectF rectF2 = new RectF(pointG.x, pointG.y, pointG2.x, pointG2.y);
                rectF2.sort();
                if (rectF2.contains(f, f3)) {
                    Ci.b bVar = fVar.f4944q;
                    S0.a aVar = new S0.a();
                    aVar.f5592a = link;
                    Q0.b bVar2 = (Q0.b) bVar.f;
                    if (bVar2 != null) {
                        bVar2.a(aVar);
                    }
                } else {
                    iVar = iVar2;
                    iC = i11;
                    sizeFG = sizeF;
                    it = it2;
                }
            }
            fVar.getScrollHandle();
        }
        fVar.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f4911g) {
            return false;
        }
        boolean z4 = this.c.onTouchEvent(motionEvent) || this.f4910d.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 && this.e) {
            this.e = false;
            f fVar = this.f4908a;
            fVar.m();
            this.f4908a.getScrollHandle();
            C c = this.f4909b;
            if (!c.f2678a && !c.f2679b) {
                fVar.o();
            }
        }
        return z4;
    }
}
