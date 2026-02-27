package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;

/* JADX INFO: renamed from: N5.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0446d1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4077b;
    public final BannerAdCarousel c;

    public /* synthetic */ C0446d1(ConstraintLayout constraintLayout, BannerAdCarousel bannerAdCarousel, int i) {
        this.f4076a = i;
        this.f4077b = constraintLayout;
        this.c = bannerAdCarousel;
    }

    public static C0446d1 a(View view) {
        BannerAdCarousel bannerAdCarousel = (BannerAdCarousel) ViewBindings.findChildViewById(view, R.id.custom_banner_ad_container);
        if (bannerAdCarousel != null) {
            return new C0446d1((ConstraintLayout) view, bannerAdCarousel, 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.custom_banner_ad_container)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4076a) {
        }
        return this.f4077b;
    }
}
