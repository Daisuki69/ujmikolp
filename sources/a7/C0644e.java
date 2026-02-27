package a7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import bd.InterfaceC0942e;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.ui.common.view.widget.Carousel;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;

/* JADX INFO: renamed from: a7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0644e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7017b;

    public /* synthetic */ C0644e(Object obj, int i) {
        this.f7016a = i;
        this.f7017b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        switch (this.f7016a) {
            case 0:
                kotlin.jvm.internal.j.g(animation, "animation");
                ((MayaCarousel) this.f7017b).setVisibility(8);
                break;
            case 1:
                kotlin.jvm.internal.j.g(animation, "animation");
                ((Carousel) this.f7017b).setVisibility(8);
                break;
            default:
                super.onAnimationCancel(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        switch (this.f7016a) {
            case 0:
                kotlin.jvm.internal.j.g(animation, "animation");
                MayaCarousel mayaCarousel = (MayaCarousel) this.f7017b;
                mayaCarousel.setVisibility(8);
                InterfaceC0641b carouselListener = mayaCarousel.getCarouselListener();
                if (carouselListener != null) {
                    carouselListener.o0();
                }
                break;
            case 1:
                kotlin.jvm.internal.j.g(animation, "animation");
                Carousel carousel = (Carousel) this.f7017b;
                carousel.setVisibility(8);
                InterfaceC0942e carouselListener2 = carousel.getCarouselListener();
                if (carouselListener2 != null) {
                    ((ShopV3HomePageFragment) carouselListener2).C1("Deals & Promos");
                }
                break;
            case 2:
                ((androidx.window.layout.adapter.extensions.a) this.f7017b).run();
                break;
            default:
                ((View) this.f7017b).setVisibility(8);
                break;
        }
    }
}
