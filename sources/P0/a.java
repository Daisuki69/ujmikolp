package P0;

import Kh.C;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f4902b;

    public /* synthetic */ a(C c, int i) {
        this.f4901a = i;
        this.f4902b = c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f4901a) {
            case 0:
                C c = this.f4902b;
                ((f) c.c).m();
                c.f2679b = false;
                c.b();
                break;
            default:
                C c10 = this.f4902b;
                ((f) c10.c).m();
                c10.f2679b = false;
                c10.b();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4901a) {
            case 0:
                C c = this.f4902b;
                ((f) c.c).m();
                c.f2679b = false;
                c.b();
                break;
            default:
                C c10 = this.f4902b;
                ((f) c10.c).m();
                c10.f2679b = false;
                c10.b();
                break;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4901a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C c = this.f4902b;
                f fVar = (f) c.c;
                fVar.n(fFloatValue, fVar.getCurrentYOffset());
                ((f) c.c).l();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C c10 = this.f4902b;
                f fVar2 = (f) c10.c;
                fVar2.n(fVar2.getCurrentXOffset(), fFloatValue2);
                ((f) c10.c).l();
                break;
        }
    }
}
