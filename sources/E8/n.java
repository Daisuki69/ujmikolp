package E8;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.ui.common.view.widget.Carousel;
import com.paymaya.ui.travel.view.widget.StepProgressBar;
import com.tencent.could.huiyansdk.view.LoadingFrontAnimatorView;
import w1.C2365c;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1292b;

    public /* synthetic */ n(View view, int i) {
        this.f1291a = i;
        this.f1292b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animator) {
        View view = this.f1292b;
        switch (this.f1291a) {
            case 0:
                kotlin.jvm.internal.j.g(animator, "animator");
                Object animatedValue = animator.getAnimatedValue();
                kotlin.jvm.internal.j.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) animatedValue).intValue();
                LinearLayout linearLayout = (LinearLayout) view;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = iIntValue;
                linearLayout.setLayoutParams(layoutParams);
                if (iIntValue == 0) {
                    linearLayout.setVisibility(8);
                }
                break;
            case 1:
                StepProgressBar stepProgressBar = (StepProgressBar) view;
                Path path = stepProgressBar.f14947k;
                path.reset();
                path.op(stepProgressBar.i, Path.Op.UNION);
                Path path2 = stepProgressBar.f14948l;
                path2.reset();
                path2.addRect(0.0f, 0.0f, ((Float) animator.getAnimatedValue()).floatValue(), stepProgressBar.getHeight(), Path.Direction.CW);
                path.op(path2, Path.Op.INTERSECT);
                stepProgressBar.invalidate();
                break;
            case 2:
                int i = MayaCarousel.f11992x0;
                kotlin.jvm.internal.j.g(animator, "animation");
                MayaCarousel mayaCarousel = (MayaCarousel) view;
                ViewGroup.LayoutParams layoutParams2 = mayaCarousel.getLayoutParams();
                Object animatedValue2 = animator.getAnimatedValue();
                kotlin.jvm.internal.j.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.height = ((Integer) animatedValue2).intValue();
                mayaCarousel.requestLayout();
                break;
            case 3:
                int i4 = Carousel.f14436b0;
                kotlin.jvm.internal.j.g(animator, "animation");
                Carousel carousel = (Carousel) view;
                ViewGroup.LayoutParams layoutParams3 = carousel.getLayoutParams();
                Object animatedValue3 = animator.getAnimatedValue();
                kotlin.jvm.internal.j.e(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                layoutParams3.height = ((Integer) animatedValue3).intValue();
                carousel.requestLayout();
                break;
            case 4:
                C2365c c2365c = (C2365c) view;
                c2365c.getClass();
                c2365c.f20531T = ((Float) animator.getAnimatedValue()).floatValue();
                c2365c.invalidate(c2365c.f20535a);
                break;
            default:
                ((LoadingFrontAnimatorView) view).a(animator);
                break;
        }
    }
}
