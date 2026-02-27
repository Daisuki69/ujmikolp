package P0;

import Kh.C;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4904b;
    public final /* synthetic */ C c;

    public b(C c, float f, float f3) {
        this.c = c;
        this.f4903a = f;
        this.f4904b = f3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C c = this.c;
        ((f) c.c).m();
        c.b();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C c = this.c;
        ((f) c.c).m();
        ((f) c.c).o();
        c.b();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((f) this.c.c).s(new PointF(this.f4903a, this.f4904b), ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
