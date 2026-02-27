package qa;

import android.view.ViewTreeObserver;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaCarousel f19760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMayaProfileFragment f19761b;

    public e(MayaCarousel mayaCarousel, BaseMayaProfileFragment baseMayaProfileFragment) {
        this.f19760a = mayaCarousel;
        this.f19761b = baseMayaProfileFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        MayaCarousel mayaCarousel = this.f19760a;
        mayaCarousel.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        BaseMayaProfileFragment.G1(mayaCarousel);
        mayaCarousel.setBannerCenterConstraint(1);
        mayaCarousel.e();
        this.f19761b.U1();
    }
}
