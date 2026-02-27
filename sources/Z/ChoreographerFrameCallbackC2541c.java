package z;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import dOYHB6.tiZVw8.numX49;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import n.AbstractC1876c;
import n.C1880g;

/* JADX INFO: renamed from: z.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ChoreographerFrameCallbackC2541c extends ValueAnimator implements Choreographer.FrameCallback {
    public C1880g j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f21334a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f21335b = new CopyOnWriteArraySet();
    public float c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21336d = false;
    public long e = 0;
    public float f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21337g = 0;
    public float h = -2.1474836E9f;
    public float i = 2.1474836E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21338k = false;

    public final float a() {
        C1880g c1880g = this.j;
        if (c1880g == null) {
            return 0.0f;
        }
        float f = this.f;
        float f3 = c1880g.f18463k;
        return (f - f3) / (c1880g.f18464l - f3);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f21335b.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f21334a.add(animatorUpdateListener);
    }

    public final float b() {
        C1880g c1880g = this.j;
        if (c1880g == null) {
            return 0.0f;
        }
        float f = this.i;
        return f == 2.1474836E9f ? c1880g.f18464l : f;
    }

    public final float c() {
        C1880g c1880g = this.j;
        if (c1880g == null) {
            return 0.0f;
        }
        float f = this.h;
        return f == -2.1474836E9f ? c1880g.f18463k : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f21335b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        g(true);
    }

    public final boolean d() {
        return this.c < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f21338k) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C1880g c1880g = this.j;
        if (c1880g == null || !this.f21338k) {
            return;
        }
        float fAbs = (this.e != 0 ? j - r4 : 0L) / ((1.0E9f / c1880g.m) / Math.abs(this.c));
        float f = this.f;
        if (d()) {
            fAbs = -fAbs;
        }
        float f3 = f + fAbs;
        this.f = f3;
        float fC = c();
        float fB = b();
        PointF pointF = AbstractC2543e.f21340a;
        boolean z4 = f3 >= fC && f3 <= fB;
        this.f = AbstractC2543e.b(this.f, c(), b());
        this.e = j;
        f();
        if (!z4) {
            if (getRepeatCount() == -1 || this.f21337g < getRepeatCount()) {
                Iterator it = this.f21335b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f21337g++;
                if (getRepeatMode() == 2) {
                    this.f21336d = !this.f21336d;
                    this.c = -this.c;
                } else {
                    this.f = d() ? b() : c();
                }
                this.e = j;
            } else {
                this.f = this.c < 0.0f ? c() : b();
                g(true);
                e(d());
            }
        }
        if (this.j != null) {
            float f7 = this.f;
            if (f7 < this.h || f7 > this.i) {
                throw new IllegalStateException(String.format(numX49.tnTj78("bbAP"), Float.valueOf(this.h), Float.valueOf(this.i), Float.valueOf(this.f)));
            }
        }
        AbstractC1876c.a();
    }

    public final void e(boolean z4) {
        for (Animator.AnimatorListener animatorListener : this.f21335b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z4);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void f() {
        Iterator it = this.f21334a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z4) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z4) {
            this.f21338k = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.j == null) {
            return 0.0f;
        }
        if (d()) {
            fC = b() - this.f;
            fB = b();
            fC2 = c();
        } else {
            fC = this.f - c();
            fB = b();
            fC2 = c();
        }
        return fC / (fB - fC2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C1880g c1880g = this.j;
        if (c1880g == null) {
            return 0L;
        }
        return (long) c1880g.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException(numX49.tnTj78("bbAb"));
    }

    public final void h(float f) {
        if (this.f == f) {
            return;
        }
        this.f = AbstractC2543e.b(f, c(), b());
        this.e = 0L;
        f();
    }

    public final void i(float f, float f3) {
        if (f > f3) {
            throw new IllegalArgumentException(numX49.tnTj78("bbA2") + f + numX49.tnTj78("bbAL") + f3 + numX49.tnTj78("bbAr"));
        }
        C1880g c1880g = this.j;
        float f7 = c1880g == null ? -3.4028235E38f : c1880g.f18463k;
        float f10 = c1880g == null ? Float.MAX_VALUE : c1880g.f18464l;
        float fB = AbstractC2543e.b(f, f7, f10);
        float fB2 = AbstractC2543e.b(f3, f7, f10);
        if (fB == this.h && fB2 == this.i) {
            return;
        }
        this.h = fB;
        this.i = fB2;
        h((int) AbstractC2543e.b(this.f, fB, fB2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f21338k;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f21335b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f21334a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f21335b.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f21334a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException(numX49.tnTj78("bbAk"));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f21336d) {
            return;
        }
        this.f21336d = false;
        this.c = -this.c;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException(numX49.tnTj78("bbAB"));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException(numX49.tnTj78("bbAZ"));
    }
}
