package P0;

import Kh.C;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.view.MotionEvent;
import android.widget.OverScroller;
import android.widget.RelativeLayout;
import com.google.firebase.messaging.r;
import com.paymaya.domain.store.A0;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import d4.AbstractC1331a;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import ng.C1946a;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends RelativeLayout {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4923B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public PdfiumCore f4924K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f4925P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f4926Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public PaintFlagsDrawFilter f4927R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f4928S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f4929T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f4930U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ArrayList f4931V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f4932W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f4933a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e f4934a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4935b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f4936b0;
    public float c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f4937d;
    public C e;
    public d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f4938g;
    public int h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4940l;
    public c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HandlerThread f4941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f4942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f4943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Ci.b f4944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint f4945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public V0.a f4946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4949v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4952y;

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSpacing(boolean z4) {
        this.f4929T = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i) {
        this.f4948u = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitEachPage(boolean z4) {
        this.f4947t = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageFitPolicy(V0.a aVar) {
        this.f4946s = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(T0.a aVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i) {
        this.f4928S = (int) AbstractC1331a.j(getContext(), 1, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwipeVertical(boolean z4) {
        this.f4949v = z4;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        i iVar = this.f4938g;
        if (iVar == null) {
            return true;
        }
        if (this.f4949v) {
            if (i < 0 && this.i < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (iVar.b().f15515a * this.f4939k) + this.i > ((float) getWidth());
            }
            return false;
        }
        if (i < 0 && this.i < 0.0f) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        return (iVar.f4969p * this.f4939k) + this.i > ((float) getWidth());
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        i iVar = this.f4938g;
        if (iVar == null) {
            return true;
        }
        if (!this.f4949v) {
            if (i < 0 && this.j < 0.0f) {
                return true;
            }
            if (i > 0) {
                return (iVar.b().f15516b * this.f4939k) + this.j > ((float) getHeight());
            }
            return false;
        }
        if (i < 0 && this.j < 0.0f) {
            return true;
        }
        if (i <= 0) {
            return false;
        }
        return (iVar.f4969p * this.f4939k) + this.j > ((float) getHeight());
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        C c = this.e;
        boolean zComputeScrollOffset = ((OverScroller) c.e).computeScrollOffset();
        f fVar = (f) c.c;
        if (zComputeScrollOffset) {
            fVar.n(r1.getCurrX(), r1.getCurrY());
            fVar.l();
        } else if (c.f2678a) {
            c.f2678a = false;
            fVar.m();
            c.b();
            fVar.o();
        }
    }

    public int getCurrentPage() {
        return this.h;
    }

    public float getCurrentXOffset() {
        return this.i;
    }

    public float getCurrentYOffset() {
        return this.j;
    }

    public PdfDocument.Meta getDocumentMeta() {
        PdfDocument pdfDocument;
        i iVar = this.f4938g;
        if (iVar == null || (pdfDocument = iVar.f4961a) == null) {
            return null;
        }
        return iVar.f4962b.b(pdfDocument);
    }

    public float getMaxZoom() {
        return this.c;
    }

    public float getMidZoom() {
        return this.f4935b;
    }

    public float getMinZoom() {
        return this.f4933a;
    }

    public int getPageCount() {
        i iVar = this.f4938g;
        if (iVar == null) {
            return 0;
        }
        return iVar.c;
    }

    public V0.a getPageFitPolicy() {
        return this.f4946s;
    }

    public float getPositionOffset() {
        float f;
        float f3;
        int width;
        if (this.f4949v) {
            f = -this.j;
            f3 = this.f4938g.f4969p * this.f4939k;
            width = getHeight();
        } else {
            f = -this.i;
            f3 = this.f4938g.f4969p * this.f4939k;
            width = getWidth();
        }
        float f7 = f / (f3 - width);
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        return f7;
    }

    public T0.a getScrollHandle() {
        return null;
    }

    public int getSpacingPx() {
        return this.f4928S;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        i iVar = this.f4938g;
        if (iVar == null) {
            return Collections.EMPTY_LIST;
        }
        PdfDocument pdfDocument = iVar.f4961a;
        return pdfDocument == null ? new ArrayList() : iVar.f4962b.f(pdfDocument);
    }

    public float getZoom() {
        return this.f4939k;
    }

    public final void h(Canvas canvas, S0.b bVar) {
        float fE;
        float fE2;
        RectF rectF = bVar.c;
        Bitmap bitmap = bVar.f5594b;
        if (bitmap.isRecycled()) {
            return;
        }
        i iVar = this.f4938g;
        int i = bVar.f5593a;
        SizeF sizeFF = iVar.f(i);
        if (this.f4949v) {
            fE2 = this.f4938g.e(this.f4939k, i);
            fE = ((this.f4938g.b().f15515a - sizeFF.f15515a) * this.f4939k) / 2.0f;
        } else {
            fE = this.f4938g.e(this.f4939k, i);
            fE2 = ((this.f4938g.b().f15516b - sizeFF.f15516b) * this.f4939k) / 2.0f;
        }
        canvas.translate(fE, fE2);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        float f = rectF.left * sizeFF.f15515a;
        float f3 = this.f4939k;
        float f7 = f * f3;
        float f10 = rectF.top * sizeFF.f15516b * f3;
        RectF rectF2 = new RectF((int) f7, (int) f10, (int) (f7 + (rectF.width() * sizeFF.f15515a * this.f4939k)), (int) (f10 + (rectF.height() * r8 * this.f4939k)));
        float f11 = this.i + fE;
        float f12 = this.j + fE2;
        if (rectF2.left + f11 >= getWidth() || f11 + rectF2.right <= 0.0f || rectF2.top + f12 >= getHeight() || f12 + rectF2.bottom <= 0.0f) {
            canvas.translate(-fE, -fE2);
        } else {
            canvas.drawBitmap(bitmap, rect, rectF2, this.f4945r);
            canvas.translate(-fE, -fE2);
        }
    }

    public final int i(float f, float f3) {
        boolean z4 = this.f4949v;
        if (z4) {
            f = f3;
        }
        float height = z4 ? getHeight() : getWidth();
        if (f > -1.0f) {
            return 0;
        }
        i iVar = this.f4938g;
        float f7 = this.f4939k;
        return f < ((-(iVar.f4969p * f7)) + height) + 1.0f ? iVar.c - 1 : iVar.c(-(f - (height / 2.0f)), f7);
    }

    public final int j(int i) {
        if (!this.f4923B || i < 0) {
            return 4;
        }
        float f = this.f4949v ? this.j : this.i;
        float f3 = -this.f4938g.e(this.f4939k, i);
        int height = this.f4949v ? getHeight() : getWidth();
        float fD = this.f4938g.d(this.f4939k, i);
        float f7 = height;
        if (f7 >= fD) {
            return 2;
        }
        if (f >= f3) {
            return 1;
        }
        return f3 - fD > f - f7 ? 3 : 4;
    }

    public final void k(int i) {
        i iVar = this.f4938g;
        if (iVar == null) {
            return;
        }
        if (i <= 0) {
            i = 0;
        } else {
            int i4 = iVar.c;
            if (i >= i4) {
                i = i4 - 1;
            }
        }
        float f = i == 0 ? 0.0f : -iVar.e(this.f4939k, i);
        if (this.f4949v) {
            n(this.i, f);
        } else {
            n(f, this.j);
        }
        q(i);
    }

    public final void l() {
        float f;
        int width;
        if (this.f4938g.c == 0) {
            return;
        }
        if (this.f4949v) {
            f = this.j;
            width = getHeight();
        } else {
            f = this.i;
            width = getWidth();
        }
        int iC = this.f4938g.c(-(f - (width / 2.0f)), this.f4939k);
        if (iC < 0 || iC > this.f4938g.c - 1 || iC == getCurrentPage()) {
            m();
        } else {
            q(iC);
        }
    }

    public final void m() {
        k kVar;
        if (this.f4938g == null || (kVar = this.f4942o) == null) {
            return;
        }
        kVar.removeMessages(1);
        r rVar = this.f4937d;
        synchronized (rVar.e) {
            ((PriorityQueue) rVar.f9803b).addAll((PriorityQueue) rVar.c);
            ((PriorityQueue) rVar.c).clear();
        }
        this.f4943p.b();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(float r6, float r7) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P0.f.n(float, float):void");
    }

    public final void o() {
        i iVar;
        int i;
        int iJ;
        if (!this.f4923B || (iVar = this.f4938g) == null || iVar.c == 0 || (iJ = j((i = i(this.i, this.j)))) == 4) {
            return;
        }
        float fR = r(i, iJ);
        boolean z4 = this.f4949v;
        C c = this.e;
        if (z4) {
            c.d(this.j, -fR);
        } else {
            c.c(this.i, -fR);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4941n == null) {
            this.f4941n = new HandlerThread("PDF renderer");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        p();
        HandlerThread handlerThread = this.f4941n;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f4941n = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList;
        if (isInEditMode()) {
            return;
        }
        if (this.f4926Q) {
            canvas.setDrawFilter(this.f4927R);
        }
        Drawable background = getBackground();
        if (background == null) {
            canvas.drawColor(this.f4952y ? -16777216 : -1);
        } else {
            background.draw(canvas);
        }
        if (!this.f4940l && this.f4936b0 == 3) {
            float f = this.i;
            float f3 = this.j;
            canvas.translate(f, f3);
            r rVar = this.f4937d;
            synchronized (((ArrayList) rVar.f9804d)) {
                arrayList = (ArrayList) rVar.f9804d;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h(canvas, (S0.b) it.next());
            }
            Iterator it2 = this.f4937d.y().iterator();
            while (it2.hasNext()) {
                h(canvas, (S0.b) it2.next());
                this.f4944q.getClass();
            }
            Iterator it3 = this.f4931V.iterator();
            while (it3.hasNext()) {
                ((Integer) it3.next()).getClass();
                this.f4944q.getClass();
            }
            this.f4931V.clear();
            this.f4944q.getClass();
            canvas.translate(-f, -f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i4, int i6, int i10) {
        float f;
        float f3;
        this.f4932W = true;
        e eVar = this.f4934a0;
        if (eVar != null) {
            eVar.a();
        }
        if (isInEditMode() || this.f4936b0 != 3) {
            return;
        }
        float f7 = (i6 * 0.5f) + (-this.i);
        float f10 = (i10 * 0.5f) + (-this.j);
        if (this.f4949v) {
            f = f7 / this.f4938g.b().f15515a;
            f3 = this.f4938g.f4969p * this.f4939k;
        } else {
            i iVar = this.f4938g;
            f = f7 / (iVar.f4969p * this.f4939k);
            f3 = iVar.b().f15516b;
        }
        float f11 = f10 / f3;
        this.e.f();
        this.f4938g.i(new Size(i, i4));
        if (this.f4949v) {
            this.i = (i * 0.5f) + ((-f) * this.f4938g.b().f15515a);
            this.j = (i4 * 0.5f) + (this.f4938g.f4969p * this.f4939k * (-f11));
        } else {
            i iVar2 = this.f4938g;
            this.i = (i * 0.5f) + (iVar2.f4969p * this.f4939k * (-f));
            this.j = (i4 * 0.5f) + ((-f11) * iVar2.b().f15516b);
        }
        n(this.i, this.j);
        l();
    }

    public final void p() {
        PdfDocument pdfDocument;
        this.f4934a0 = null;
        this.e.f();
        this.f.f4911g = false;
        k kVar = this.f4942o;
        if (kVar != null) {
            kVar.e = false;
            kVar.removeMessages(1);
        }
        c cVar = this.m;
        if (cVar != null) {
            cVar.cancel(true);
        }
        r rVar = this.f4937d;
        synchronized (rVar.e) {
            try {
                Iterator it = ((PriorityQueue) rVar.f9803b).iterator();
                while (it.hasNext()) {
                    ((S0.b) it.next()).f5594b.recycle();
                }
                ((PriorityQueue) rVar.f9803b).clear();
                Iterator it2 = ((PriorityQueue) rVar.c).iterator();
                while (it2.hasNext()) {
                    ((S0.b) it2.next()).f5594b.recycle();
                }
                ((PriorityQueue) rVar.c).clear();
            } finally {
            }
        }
        synchronized (((ArrayList) rVar.f9804d)) {
            try {
                Iterator it3 = ((ArrayList) rVar.f9804d).iterator();
                while (it3.hasNext()) {
                    ((S0.b) it3.next()).f5594b.recycle();
                }
                ((ArrayList) rVar.f9804d).clear();
            } finally {
            }
        }
        i iVar = this.f4938g;
        if (iVar != null) {
            PdfiumCore pdfiumCore = iVar.f4962b;
            if (pdfiumCore != null && (pdfDocument = iVar.f4961a) != null) {
                pdfiumCore.a(pdfDocument);
            }
            iVar.f4961a = null;
            this.f4938g = null;
        }
        this.f4942o = null;
        this.j = 0.0f;
        this.i = 0.0f;
        this.f4939k = 1.0f;
        this.f4940l = true;
        this.f4944q = new Ci.b(5);
        this.f4936b0 = 1;
    }

    public final void q(int i) {
        if (this.f4940l) {
            return;
        }
        i iVar = this.f4938g;
        if (i <= 0) {
            iVar.getClass();
            i = 0;
        } else {
            int i4 = iVar.c;
            if (i >= i4) {
                i = i4 - 1;
            }
        }
        this.h = i;
        m();
        Ci.b bVar = this.f4944q;
        int i6 = this.h;
        int i10 = this.f4938g.c;
        A0 a02 = (A0) bVar.e;
        if (a02 != null) {
            HashMap map = new HashMap();
            androidx.media3.datasource.cache.c.t(i6, map, "page", i10, "total");
            ((C1946a) a02.f11334b).f18730b.a("onPageChanged", map, null);
        }
    }

    public final float r(int i, int i4) {
        float fE = this.f4938g.e(this.f4939k, i);
        float height = this.f4949v ? getHeight() : getWidth();
        float fD = this.f4938g.d(this.f4939k, i);
        if (i4 == 2) {
            return (fD / 2.0f) + (fE - (height / 2.0f));
        }
        return i4 == 3 ? (fE - height) + fD : fE;
    }

    public final void s(PointF pointF, float f) {
        float f3 = f / this.f4939k;
        this.f4939k = f;
        float f7 = this.i * f3;
        float f10 = this.j * f3;
        float f11 = pointF.x;
        float f12 = pointF.y;
        n((f11 - (f11 * f3)) + f7, (f12 - (f3 * f12)) + f10);
    }

    public void setMaxZoom(float f) {
        this.c = f;
    }

    public void setMidZoom(float f) {
        this.f4935b = f;
    }

    public void setMinZoom(float f) {
        this.f4933a = f;
    }

    public void setNightMode(boolean z4) {
        this.f4952y = z4;
        Paint paint = this.f4945r;
        if (z4) {
            paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        } else {
            paint.setColorFilter(null);
        }
    }

    public void setPageFling(boolean z4) {
        this.f4930U = z4;
    }

    public void setPageSnap(boolean z4) {
        this.f4923B = z4;
    }

    public void setPositionOffset(float f) {
        if (this.f4949v) {
            n(this.i, ((-(this.f4938g.f4969p * this.f4939k)) + getHeight()) * f);
        } else {
            n(((-(this.f4938g.f4969p * this.f4939k)) + getWidth()) * f, this.j);
        }
        l();
    }

    public void setSwipeEnabled(boolean z4) {
        this.f4950w = z4;
    }
}
