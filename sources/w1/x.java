package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f20650b;

    public /* synthetic */ x(z zVar, int i) {
        this.f20649a = i;
        this.f20650b = zVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f20649a) {
            case 0:
                z zVar = this.f20650b;
                View view = zVar.f20657b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = zVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = zVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.f20650b.j(0);
                break;
            case 3:
                this.f20650b.j(0);
                break;
            case 4:
                ViewGroup viewGroup3 = this.f20650b.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.f20650b.h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        z zVar = this.f20650b;
        switch (this.f20649a) {
            case 0:
                View view = zVar.j;
                if ((view instanceof C2365c) && !zVar.f20653A) {
                    C2365c c2365c = (C2365c) view;
                    ValueAnimator valueAnimator = c2365c.f20530S;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(c2365c.f20531T, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = zVar.f20657b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = zVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = zVar.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(zVar.f20653A ? 0 : 4);
                }
                View view3 = zVar.j;
                if ((view3 instanceof C2365c) && !zVar.f20653A) {
                    C2365c c2365c2 = (C2365c) view3;
                    ValueAnimator valueAnimator2 = c2365c2.f20530S;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    c2365c2.f20532U = false;
                    valueAnimator2.setFloatValues(c2365c2.f20531T, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                zVar.j(4);
                break;
            case 3:
                zVar.j(4);
                break;
            case 4:
                ViewGroup viewGroup3 = zVar.h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    zVar.h.setTranslationX(r9.getWidth());
                    ViewGroup viewGroup4 = zVar.h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup5 = zVar.f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                }
                break;
        }
    }
}
