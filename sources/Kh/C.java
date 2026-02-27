package Kh;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import bg.AbstractC0983W;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements Ah.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2679b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2680d;
    public Object e;

    @Override // Ah.j
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        Dh.d dVar = (Dh.d) this.e;
        dVar.getClass();
        Dh.a.c(dVar, bVar);
    }

    public void b() {
        ((P0.f) this.c).getScrollHandle();
    }

    public void c(float f, float f3) {
        f();
        this.f2680d = ValueAnimator.ofFloat(f, f3);
        P0.a aVar = new P0.a(this, 0);
        ((ValueAnimator) this.f2680d).setInterpolator(new DecelerateInterpolator());
        ((ValueAnimator) this.f2680d).addUpdateListener(aVar);
        ((ValueAnimator) this.f2680d).addListener(aVar);
        ((ValueAnimator) this.f2680d).setDuration(400L);
        ((ValueAnimator) this.f2680d).start();
    }

    public void d(float f, float f3) {
        f();
        this.f2680d = ValueAnimator.ofFloat(f, f3);
        P0.a aVar = new P0.a(this, 1);
        ((ValueAnimator) this.f2680d).setInterpolator(new DecelerateInterpolator());
        ((ValueAnimator) this.f2680d).addUpdateListener(aVar);
        ((ValueAnimator) this.f2680d).addListener(aVar);
        ((ValueAnimator) this.f2680d).setDuration(400L);
        ((ValueAnimator) this.f2680d).start();
    }

    public void e(float f, float f3, float f7, float f10) {
        f();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, f10);
        this.f2680d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        P0.b bVar = new P0.b(this, f, f3);
        ((ValueAnimator) this.f2680d).addUpdateListener(bVar);
        ((ValueAnimator) this.f2680d).addListener(bVar);
        ((ValueAnimator) this.f2680d).setDuration(400L);
        ((ValueAnimator) this.f2680d).start();
    }

    public void f() {
        ValueAnimator valueAnimator = (ValueAnimator) this.f2680d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2680d = null;
        }
        this.f2678a = false;
        ((OverScroller) this.e).forceFinished(true);
    }

    @Override // Ah.j
    public void onComplete() {
        if (this.f2679b) {
            return;
        }
        this.f2679b = true;
        this.f2678a = true;
        ((Ah.j) this.c).onComplete();
    }

    @Override // Ah.j
    public void onError(Throwable th2) {
        boolean z4 = this.f2678a;
        Ah.j jVar = (Ah.j) this.c;
        if (z4) {
            if (this.f2679b) {
                E1.c.k(th2);
                return;
            } else {
                jVar.onError(th2);
                return;
            }
        }
        this.f2678a = true;
        try {
            Ah.h hVar = (Ah.h) ((Ch.f) this.f2680d).apply(th2);
            if (hVar != null) {
                hVar.g(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th2);
            jVar.onError(nullPointerException);
        } catch (Throwable th3) {
            AbstractC0983W.G(th3);
            jVar.onError(new CompositeException(th2, th3));
        }
    }

    @Override // Ah.j
    public void onNext(Object obj) {
        if (this.f2679b) {
            return;
        }
        ((Ah.j) this.c).onNext(obj);
    }
}
