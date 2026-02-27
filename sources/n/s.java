package n;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pg.C2038a;
import r.C2179a;
import s.C2221f;
import s.InterfaceC2222g;
import v.C2328c;
import v.C2330e;
import z.AbstractC2540b;
import z.AbstractC2543e;
import z.ChoreographerFrameCallbackC2541c;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f18488a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1880g f18489b;
    public final ChoreographerFrameCallbackC2541c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18490d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18491g;
    public final ArrayList h;
    public C2179a i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ci.b f18492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18493l;
    public C2328c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f18495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f18498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18499s;

    public s() {
        ChoreographerFrameCallbackC2541c choreographerFrameCallbackC2541c = new ChoreographerFrameCallbackC2541c();
        this.c = choreographerFrameCallbackC2541c;
        this.f18490d = 1.0f;
        this.e = true;
        this.f = false;
        this.f18491g = false;
        this.h = new ArrayList();
        p pVar = new p(this);
        this.f18494n = 255;
        this.f18498r = true;
        this.f18499s = false;
        choreographerFrameCallbackC2541c.addUpdateListener(pVar);
    }

    public final void a(C2221f c2221f, ColorFilter colorFilter, A.c cVar) {
        C2328c c2328c = this.m;
        if (c2328c == null) {
            this.h.add(new o(this, c2221f, colorFilter, cVar));
            return;
        }
        boolean zIsEmpty = true;
        if (c2221f == C2221f.c) {
            c2328c.d(colorFilter, cVar);
        } else {
            InterfaceC2222g interfaceC2222g = c2221f.f19976b;
            if (interfaceC2222g != null) {
                interfaceC2222g.d(colorFilter, cVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.m.c(c2221f, 0, arrayList, new C2221f(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C2221f) arrayList.get(i)).f19976b.d(colorFilter, cVar);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (colorFilter == v.f18530z) {
                o(this.c.a());
            }
        }
    }

    public final boolean b() {
        return this.e || this.f;
    }

    public final void c() {
        C1880g c1880g = this.f18489b;
        C2038a c2038a = x.q.f20839a;
        Rect rect = c1880g.j;
        List list = Collections.EMPTY_LIST;
        C2330e c2330e = new C2330e(list, c1880g, numX49.tnTj78("b24b"), -1L, 1, -1L, null, list, new t.d(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, 1, null, false, null, null);
        C1880g c1880g2 = this.f18489b;
        C2328c c2328c = new C2328c(this, c2330e, c1880g2.i, c1880g2);
        this.m = c2328c;
        if (this.f18496p) {
            c2328c.q(true);
        }
    }

    public final void d() {
        ChoreographerFrameCallbackC2541c choreographerFrameCallbackC2541c = this.c;
        if (choreographerFrameCallbackC2541c.f21338k) {
            choreographerFrameCallbackC2541c.cancel();
        }
        this.f18489b = null;
        this.m = null;
        this.i = null;
        choreographerFrameCallbackC2541c.j = null;
        choreographerFrameCallbackC2541c.h = -2.1474836E9f;
        choreographerFrameCallbackC2541c.i = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f18499s = false;
        if (this.f18491g) {
            try {
                e(canvas);
            } catch (Throwable unused) {
                AbstractC2540b.f21333a.getClass();
            }
        } else {
            e(canvas);
        }
        AbstractC1876c.a();
    }

    public final void e(Canvas canvas) {
        float f;
        float f3;
        C1880g c1880g = this.f18489b;
        Matrix matrix = this.f18488a;
        int iSave = -1;
        if (c1880g != null && !getBounds().isEmpty()) {
            Rect bounds = getBounds();
            float fWidth = bounds.width() / bounds.height();
            Rect rect = c1880g.j;
            if (fWidth != rect.width() / rect.height()) {
                if (this.m == null) {
                    return;
                }
                Rect bounds2 = getBounds();
                float fWidth2 = bounds2.width() / this.f18489b.j.width();
                float fHeight = bounds2.height() / this.f18489b.j.height();
                if (this.f18498r) {
                    float fMin = Math.min(fWidth2, fHeight);
                    if (fMin < 1.0f) {
                        f3 = 1.0f / fMin;
                        fWidth2 /= f3;
                        fHeight /= f3;
                    } else {
                        f3 = 1.0f;
                    }
                    if (f3 > 1.0f) {
                        iSave = canvas.save();
                        float fWidth3 = bounds2.width() / 2.0f;
                        float fHeight2 = bounds2.height() / 2.0f;
                        float f7 = fWidth3 * fMin;
                        float f10 = fMin * fHeight2;
                        canvas.translate(fWidth3 - f7, fHeight2 - f10);
                        canvas.scale(f3, f3, f7, f10);
                    }
                }
                matrix.reset();
                matrix.preScale(fWidth2, fHeight);
                this.m.g(canvas, matrix, this.f18494n);
                if (iSave > 0) {
                    canvas.restoreToCount(iSave);
                    return;
                }
                return;
            }
        }
        if (this.m == null) {
            return;
        }
        float f11 = this.f18490d;
        float fMin2 = Math.min(canvas.getWidth() / this.f18489b.j.width(), canvas.getHeight() / this.f18489b.j.height());
        if (f11 > fMin2) {
            f = this.f18490d / fMin2;
        } else {
            fMin2 = f11;
            f = 1.0f;
        }
        if (f > 1.0f) {
            iSave = canvas.save();
            float fWidth4 = this.f18489b.j.width() / 2.0f;
            float fHeight3 = this.f18489b.j.height() / 2.0f;
            float f12 = fWidth4 * fMin2;
            float f13 = fHeight3 * fMin2;
            float f14 = this.f18490d;
            canvas.translate((fWidth4 * f14) - f12, (f14 * fHeight3) - f13);
            canvas.scale(f, f, f12, f13);
        }
        matrix.reset();
        matrix.preScale(fMin2, fMin2);
        this.m.g(canvas, matrix, this.f18494n);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    public final boolean f() {
        ChoreographerFrameCallbackC2541c choreographerFrameCallbackC2541c = this.c;
        if (choreographerFrameCallbackC2541c == null) {
            return false;
        }
        return choreographerFrameCallbackC2541c.f21338k;
    }

    public final void g() {
        if (this.m == null) {
            this.h.add(new q(this, 0));
            return;
        }
        boolean zB = b();
        ChoreographerFrameCallbackC2541c choreographerFrameCallbackC2541c = this.c;
        if (zB || choreographerFrameCallbackC2541c.getRepeatCount() == 0) {
            choreographerFrameCallbackC2541c.f21338k = true;
            boolean zD = choreographerFrameCallbackC2541c.d();
            for (Animator.AnimatorListener animatorListener : choreographerFrameCallbackC2541c.f21335b) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(choreographerFrameCallbackC2541c, zD);
                } else {
                    animatorListener.onAnimationStart(choreographerFrameCallbackC2541c);
                }
            }
            choreographerFrameCallbackC2541c.h((int) (choreographerFrameCallbackC2541c.d() ? choreographerFrameCallbackC2541c.b() : choreographerFrameCallbackC2541c.c()));
            choreographerFrameCallbackC2541c.e = 0L;
            choreographerFrameCallbackC2541c.f21337g = 0;
            if (choreographerFrameCallbackC2541c.f21338k) {
                choreographerFrameCallbackC2541c.g(false);
                Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC2541c);
            }
        }
        if (b()) {
            return;
        }
        i((int) (choreographerFrameCallbackC2541c.c < 0.0f ? choreographerFrameCallbackC2541c.c() : choreographerFrameCallbackC2541c.b()));
        choreographerFrameCallbackC2541c.g(true);
        choreographerFrameCallbackC2541c.e(choreographerFrameCallbackC2541c.d());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f18494n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.f18489b == null) {
            return -1;
        }
        return (int) (r0.j.height() * this.f18490d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.f18489b == null) {
            return -1;
        }
        return (int) (r0.j.width() * this.f18490d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        if (this.m == null) {
            this.h.add(new q(this, 1));
            return;
        }
        boolean zB = b();
        ChoreographerFrameCallbackC2541c choreographerFrameCallbackC2541c = this.c;
        if (zB || choreographerFrameCallbackC2541c.getRepeatCount() == 0) {
            choreographerFrameCallbackC2541c.f21338k = true;
            choreographerFrameCallbackC2541c.g(false);
            Choreographer.getInstance().postFrameCallback(choreographerFrameCallbackC2541c);
            choreographerFrameCallbackC2541c.e = 0L;
            if (choreographerFrameCallbackC2541c.d() && choreographerFrameCallbackC2541c.f == choreographerFrameCallbackC2541c.c()) {
                choreographerFrameCallbackC2541c.f = choreographerFrameCallbackC2541c.b();
            } else if (!choreographerFrameCallbackC2541c.d() && choreographerFrameCallbackC2541c.f == choreographerFrameCallbackC2541c.b()) {
                choreographerFrameCallbackC2541c.f = choreographerFrameCallbackC2541c.c();
            }
        }
        if (b()) {
            return;
        }
        i((int) (choreographerFrameCallbackC2541c.c < 0.0f ? choreographerFrameCallbackC2541c.c() : choreographerFrameCallbackC2541c.b()));
        choreographerFrameCallbackC2541c.g(true);
        choreographerFrameCallbackC2541c.e(choreographerFrameCallbackC2541c.d());
    }

    public final void i(int i) {
        if (this.f18489b == null) {
            this.h.add(new C1886m(this, i, 0));
        } else {
            this.c.h(i);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f18499s) {
            return;
        }
        this.f18499s = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return f();
    }

    public final void j(int i) {
        if (this.f18489b == null) {
            this.h.add(new C1886m(this, i, 2));
            return;
        }
        ChoreographerFrameCallbackC2541c choreographerFrameCallbackC2541c = this.c;
        choreographerFrameCallbackC2541c.i(choreographerFrameCallbackC2541c.h, i + 0.99f);
    }

    public final void k(String str) {
        C1880g c1880g = this.f18489b;
        if (c1880g == null) {
            this.h.add(new C1884k(this, str, 2));
            return;
        }
        s.i iVarC = c1880g.c(str);
        if (iVarC == null) {
            throw new IllegalArgumentException(We.s.j(numX49.tnTj78("b242"), str, numX49.tnTj78("b24L")));
        }
        j((int) (iVarC.f19980b + iVarC.c));
    }

    public final void l(String str) {
        C1880g c1880g = this.f18489b;
        ArrayList arrayList = this.h;
        if (c1880g == null) {
            arrayList.add(new C1884k(this, str, 0));
            return;
        }
        s.i iVarC = c1880g.c(str);
        if (iVarC == null) {
            throw new IllegalArgumentException(We.s.j(numX49.tnTj78("b24r"), str, numX49.tnTj78("b24Z")));
        }
        int i = (int) iVarC.f19980b;
        int i4 = ((int) iVarC.c) + i;
        if (this.f18489b == null) {
            arrayList.add(new C1885l(this, i, i4));
        } else {
            this.c.i(i, i4 + 0.99f);
        }
    }

    public final void m(int i) {
        if (this.f18489b == null) {
            this.h.add(new C1886m(this, i, 1));
        } else {
            this.c.i(i, (int) r0.i);
        }
    }

    public final void n(String str) {
        C1880g c1880g = this.f18489b;
        if (c1880g == null) {
            this.h.add(new C1884k(this, str, 1));
            return;
        }
        s.i iVarC = c1880g.c(str);
        if (iVarC == null) {
            throw new IllegalArgumentException(We.s.j(numX49.tnTj78("b24k"), str, numX49.tnTj78("b24B")));
        }
        m((int) iVarC.f19980b);
    }

    public final void o(float f) {
        C1880g c1880g = this.f18489b;
        if (c1880g == null) {
            this.h.add(new C1887n(this, f, 0));
            return;
        }
        this.c.h(AbstractC2543e.d(c1880g.f18463k, c1880g.f18464l, f));
        AbstractC1876c.a();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f18494n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC2540b.b(numX49.tnTj78("b24u"));
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        g();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.h.clear();
        ChoreographerFrameCallbackC2541c choreographerFrameCallbackC2541c = this.c;
        choreographerFrameCallbackC2541c.g(true);
        choreographerFrameCallbackC2541c.e(choreographerFrameCallbackC2541c.d());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
