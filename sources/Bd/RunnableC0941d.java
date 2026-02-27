package bd;

import com.paymaya.ui.common.view.widget.Carousel;

/* JADX INFO: renamed from: bd.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0941d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Carousel f8640b;

    public /* synthetic */ RunnableC0941d(Carousel carousel, int i) {
        this.f8639a = i;
        this.f8640b = carousel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Carousel carousel = this.f8640b;
        switch (this.f8639a) {
            case 0:
                int i = Carousel.f14436b0;
                carousel.getCarouselRecyclerView().smoothScrollBy(1, 0);
                break;
            default:
                int i4 = Carousel.f14436b0;
                carousel.b();
                break;
        }
    }
}
