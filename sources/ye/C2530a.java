package ye;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.ui.shopv3.view.widget.SliderActionView;

/* JADX INFO: renamed from: ye.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2530a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SliderActionView f21142b;

    public /* synthetic */ C2530a(SliderActionView sliderActionView, int i) {
        this.f21141a = i;
        this.f21142b = sliderActionView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        SliderActionView sliderActionView = this.f21142b;
        switch (this.f21141a) {
            case 0:
                int i = SliderActionView.f14896e0;
                kotlin.jvm.internal.j.g(it, "it");
                sliderActionView.l();
                if (sliderActionView.f14925x != null) {
                    sliderActionView.e();
                    return;
                }
                return;
            case 1:
                int i4 = SliderActionView.f14896e0;
                kotlin.jvm.internal.j.g(it, "it");
                Object animatedValue = it.getAnimatedValue();
                kotlin.jvm.internal.j.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) animatedValue).intValue();
                ImageView imageView = sliderActionView.f14910d;
                if (imageView == null) {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                kotlin.jvm.internal.j.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = iIntValue;
                ImageView imageView2 = sliderActionView.f14910d;
                if (imageView2 != null) {
                    imageView2.setLayoutParams(layoutParams2);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
            case 2:
                int i6 = SliderActionView.f14896e0;
                kotlin.jvm.internal.j.g(it, "it");
                Object animatedValue2 = it.getAnimatedValue();
                kotlin.jvm.internal.j.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) animatedValue2).intValue();
                ImageView imageView3 = sliderActionView.f14910d;
                if (imageView3 != null) {
                    imageView3.setImageAlpha(iIntValue2);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
            case 3:
                int i10 = SliderActionView.f14896e0;
                kotlin.jvm.internal.j.g(it, "it");
                sliderActionView.l();
                if (sliderActionView.f14924w != null) {
                    sliderActionView.e();
                    return;
                }
                return;
            case 4:
                int i11 = SliderActionView.f14896e0;
                kotlin.jvm.internal.j.g(it, "it");
                Object animatedValue3 = it.getAnimatedValue();
                kotlin.jvm.internal.j.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue3).floatValue();
                ProgressBar progressBar = sliderActionView.f14912g;
                if (progressBar != null) {
                    progressBar.setAlpha(fFloatValue);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mLoadProgressBar");
                    throw null;
                }
            default:
                int i12 = SliderActionView.f14896e0;
                kotlin.jvm.internal.j.g(it, "it");
                Object animatedValue4 = it.getAnimatedValue();
                kotlin.jvm.internal.j.e(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue3 = ((Integer) animatedValue4).intValue();
                ImageView imageView4 = sliderActionView.f14910d;
                if (imageView4 != null) {
                    imageView4.setImageAlpha(iIntValue3);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSliderImageView");
                    throw null;
                }
        }
    }
}
