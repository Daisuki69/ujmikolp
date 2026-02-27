package ye;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.paymaya.ui.shopv3.view.widget.SliderActionView;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderActionView f21150b;

    public /* synthetic */ o(SliderActionView sliderActionView, int i) {
        this.f21149a = i;
        this.f21150b = sliderActionView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        switch (this.f21149a) {
            case 0:
                kotlin.jvm.internal.j.g(animation, "animation");
                animation.removeAllListeners();
                break;
            case 1:
                kotlin.jvm.internal.j.g(animation, "animation");
                animation.removeAllListeners();
                break;
            case 2:
                kotlin.jvm.internal.j.g(animation, "animation");
                animation.removeAllListeners();
                break;
            case 3:
                kotlin.jvm.internal.j.g(animation, "animation");
                animation.removeAllListeners();
                break;
            case 4:
                kotlin.jvm.internal.j.g(animation, "animation");
                animation.removeAllListeners();
                break;
            default:
                kotlin.jvm.internal.j.g(animation, "animation");
                animation.removeAllListeners();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        SliderActionView sliderActionView = this.f21150b;
        switch (this.f21149a) {
            case 0:
                kotlin.jvm.internal.j.g(animation, "animation");
                ProgressBar progressBar = sliderActionView.f14912g;
                if (progressBar == null) {
                    kotlin.jvm.internal.j.n("mLoadProgressBar");
                    throw null;
                }
                progressBar.setVisibility(0);
                ProgressBar progressBar2 = sliderActionView.f14912g;
                if (progressBar2 == null) {
                    kotlin.jvm.internal.j.n("mLoadProgressBar");
                    throw null;
                }
                progressBar2.setAlpha(1.0f);
                sliderActionView.setMState(n.h);
                return;
            case 1:
                kotlin.jvm.internal.j.g(animation, "animation");
                sliderActionView.setMState(n.j);
                return;
            case 2:
            default:
                super.onAnimationEnd(animation);
                return;
            case 3:
                kotlin.jvm.internal.j.g(animation, "animation");
                ProgressBar progressBar3 = sliderActionView.f14912g;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLoadProgressBar");
                    throw null;
                }
            case 4:
                kotlin.jvm.internal.j.g(animation, "animation");
                int i = SliderActionView.f14896e0;
                sliderActionView.l();
                sliderActionView.setMState(n.f);
                sliderActionView.setMState(n.f21146g);
                sliderActionView.f14906W = sliderActionView.f();
                return;
            case 5:
                kotlin.jvm.internal.j.g(animation, "animation");
                int i4 = SliderActionView.f14896e0;
                sliderActionView.l();
                if (sliderActionView.f14902S != n.h) {
                    sliderActionView.setMState(n.f21143a);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        switch (this.f21149a) {
            case 2:
                kotlin.jvm.internal.j.g(animation, "animation");
                SliderActionView sliderActionView = this.f21150b;
                ImageView imageView = sliderActionView.f14910d;
                if (imageView != null) {
                    imageView.setImageDrawable(sliderActionView.f14918q);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
            default:
                super.onAnimationStart(animation);
                return;
        }
    }
}
