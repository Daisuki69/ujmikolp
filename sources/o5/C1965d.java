package o5;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.adkit.presentation.verticalbannerad.view.VerticalBannerAd;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: o5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1965d implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerticalBannerAd f18777a;

    public C1965d(VerticalBannerAd verticalBannerAd) {
        this.f18777a = verticalBannerAd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        j.g(rv, "rv");
        j.g(e, "e");
        int i = VerticalBannerAd.h;
        VerticalBannerAd verticalBannerAd = this.f18777a;
        verticalBannerAd.getClass();
        int action = e.getAction();
        if (action == 0) {
            verticalBannerAd.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            verticalBannerAd.getParent().requestDisallowInterceptTouchEvent(false);
        }
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
