package a7;

import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;

/* JADX INFO: renamed from: a7.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0648i extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaCarousel f7021a;

    public C0648i(MayaCarousel mayaCarousel) {
        this.f7021a = mayaCarousel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        MayaCarousel mayaCarousel = this.f7021a;
        int iFindFirstCompletelyVisibleItemPosition = mayaCarousel.f11995P.findFirstCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition != -1) {
            mayaCarousel.f12036x = iFindFirstCompletelyVisibleItemPosition;
        }
    }
}
