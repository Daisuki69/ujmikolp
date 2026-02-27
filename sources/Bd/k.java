package bd;

import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.ui.common.view.widget.Carousel;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Carousel f8644a;

    public k(Carousel carousel) {
        this.f8644a = carousel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i4) {
        kotlin.jvm.internal.j.g(recyclerView, "recyclerView");
        Carousel carousel = this.f8644a;
        int iFindFirstCompletelyVisibleItemPosition = carousel.f14455q.findFirstCompletelyVisibleItemPosition();
        if (iFindFirstCompletelyVisibleItemPosition != -1) {
            carousel.f14452n = iFindFirstCompletelyVisibleItemPosition;
        }
    }
}
