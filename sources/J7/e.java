package J7;

import N5.C0441c;
import a.AbstractC0617a;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC0617a {
    public LottieAnimationView c;

    @Override // t4.h
    public final void a(int i, View rootView) {
        kotlin.jvm.internal.j.g(rootView, "rootView");
        float height = i / rootView.getHeight();
        if (height > 1.0f) {
            height = 1.0f;
        }
        LottieAnimationView lottieAnimationView = this.c;
        if (lottieAnimationView == null) {
            kotlin.jvm.internal.j.n("mLottieAnimationView");
            throw null;
        }
        lottieAnimationView.setAlpha(height);
        LottieAnimationView lottieAnimationView2 = this.c;
        if (lottieAnimationView2 == null) {
            kotlin.jvm.internal.j.n("mLottieAnimationView");
            throw null;
        }
        lottieAnimationView2.setScaleX(height);
        LottieAnimationView lottieAnimationView3 = this.c;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.setScaleY(height);
        } else {
            kotlin.jvm.internal.j.n("mLottieAnimationView");
            throw null;
        }
    }

    @Override // t4.h
    public final void b() {
    }

    @Override // t4.h
    public final void d() {
    }

    @Override // t4.h
    public final void f(View rootView, boolean z4) {
        kotlin.jvm.internal.j.g(rootView, "rootView");
    }

    @Override // t4.h
    public final View h(LayoutInflater inflater, SpringView springView) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        C0441c c0441cE = C0441c.e(inflater, springView);
        this.c = (LottieAnimationView) c0441cE.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) c0441cE.f4066b;
        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }
}
