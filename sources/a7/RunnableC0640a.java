package a7;

import com.paymaya.mayaui.common.view.widget.MayaCarousel;

/* JADX INFO: renamed from: a7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0640a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCarousel f7015b;

    public /* synthetic */ RunnableC0640a(MayaCarousel mayaCarousel, int i) {
        this.f7014a = i;
        this.f7015b = mayaCarousel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7014a) {
            case 0:
                MayaCarousel mayaCarousel = this.f7015b;
                mayaCarousel.f12028r0 = false;
                mayaCarousel.b();
                break;
            default:
                this.f7015b.f.smoothScrollBy(1, 0);
                break;
        }
    }
}
