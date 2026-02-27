package f5;

import Bj.B0;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: f5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1464b implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerAdCarousel f16709a;

    public C1464b(BannerAdCarousel bannerAdCarousel) {
        this.f16709a = bannerAdCarousel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        j.g(rv, "rv");
        j.g(e, "e");
        int i = BannerAdCarousel.f10214o;
        BannerAdCarousel bannerAdCarousel = this.f16709a;
        int action = e.getAction();
        if (action == 0) {
            B0 b02 = bannerAdCarousel.e;
            if (b02 != null) {
                b02.b(null);
            }
            bannerAdCarousel.e = null;
            bannerAdCarousel.getParent().requestDisallowInterceptTouchEvent(true);
            bannerAdCarousel.f10221n = false;
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        bannerAdCarousel.getParent().requestDisallowInterceptTouchEvent(false);
        if (bannerAdCarousel.i) {
            bannerAdCarousel.d();
        }
        bannerAdCarousel.f10221n = false;
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z4) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final void onTouchEvent(RecyclerView rv, MotionEvent e) {
        j.g(rv, "rv");
        j.g(e, "e");
    }
}
