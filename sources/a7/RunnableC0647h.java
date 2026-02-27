package a7;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;

/* JADX INFO: renamed from: a7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC0647h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7019a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCarousel f7020b;

    public RunnableC0647h(MayaCarousel mayaCarousel, MayaCarousel mayaCarousel2) {
        this.f7020b = mayaCarousel2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7019a) {
            case 0:
                MayaCarousel mayaCarousel = this.f7020b;
                Rc.c cVar = mayaCarousel.f12031t;
                if ((cVar != null ? cVar.getItemCount() : 0) > 1) {
                    RecyclerView recyclerView = mayaCarousel.f;
                    if (recyclerView.getScrollState() == 0) {
                        InterfaceC0643d interfaceC0643d = mayaCarousel.f12018l0;
                        if (interfaceC0643d == null) {
                            int i = mayaCarousel.f12036x + 1;
                            mayaCarousel.f12036x = i;
                            recyclerView.smoothScrollToPosition(i);
                        } else if (interfaceC0643d.u0()) {
                            int i4 = mayaCarousel.f12036x + 1;
                            mayaCarousel.f12036x = i4;
                            recyclerView.smoothScrollToPosition(i4);
                        }
                    }
                    Handler handler = mayaCarousel.f12033v;
                    if (handler != null) {
                        handler.postDelayed(this, mayaCarousel.getCarouselIntervalTime());
                    }
                }
                break;
            default:
                MayaCarousel mayaCarousel2 = this.f7020b;
                ViewParent parent = mayaCarousel2.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    int measuredWidth = viewGroup.getMeasuredWidth() - (mayaCarousel2.getResources().getDimensionPixelSize(R.dimen.maya_margin_large) * 2);
                    int dimensionPixelSize = mayaCarousel2.getResources().getDimensionPixelSize(R.dimen.maya_clevertap_receipt_height);
                    mayaCarousel2.h(measuredWidth, dimensionPixelSize, 0);
                    mayaCarousel2.j(measuredWidth, dimensionPixelSize, 0);
                }
                mayaCarousel2.e();
                break;
        }
    }

    public RunnableC0647h(MayaCarousel mayaCarousel) {
        this.f7020b = mayaCarousel;
    }
}
