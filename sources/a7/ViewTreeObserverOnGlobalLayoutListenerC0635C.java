package a7;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.common.view.widget.MayaStaticToolTipView;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;

/* JADX INFO: renamed from: a7.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC0635C implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7003b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7004d;
    public final /* synthetic */ View e;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0635C(Object obj, Object obj2, View view, int i, int i4) {
        this.f7002a = i4;
        this.c = obj;
        this.f7004d = obj2;
        this.e = view;
        this.f7003b = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f7002a) {
            case 0:
                MayaStaticToolTipView mayaStaticToolTipView = (MayaStaticToolTipView) this.c;
                if (mayaStaticToolTipView.getVisibility() == 0) {
                    mayaStaticToolTipView.b((AppCompatCheckBox) this.e, this.f7003b, (String) this.f7004d);
                }
                break;
            default:
                MayaCreatorStoreFragment mayaCreatorStoreFragment = (MayaCreatorStoreFragment) this.f7004d;
                ((ViewTreeObserver) this.c).removeOnGlobalLayoutListener(mayaCreatorStoreFragment.f12110B0);
                MayaCarousel mayaCarousel = (MayaCarousel) this.e;
                ViewParent parent = mayaCarousel.getParent();
                kotlin.jvm.internal.j.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                int measuredWidth = ((ViewGroup) parent).getMeasuredWidth();
                int i = measuredWidth - (this.f7003b * 2);
                int i4 = (int) (((double) i) * 0.5625d);
                if (measuredWidth > 0 || i > 0 || i4 > 0) {
                    mayaCarousel.h(i, i4, i);
                    mayaCarousel.j(i, i4, i);
                }
                mayaCarousel.e();
                mayaCarousel.setBannerDefaultConstraint(3);
                ((l7.b) mayaCreatorStoreFragment.Q1()).n();
                break;
        }
    }
}
