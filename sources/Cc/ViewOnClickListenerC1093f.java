package cc;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;

/* JADX INFO: renamed from: cc.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1093f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaShopHomePageFragment f9341b;

    public /* synthetic */ ViewOnClickListenerC1093f(MayaShopHomePageFragment mayaShopHomePageFragment, int i) {
        this.f9340a = i;
        this.f9341b = mayaShopHomePageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9340a) {
            case 0:
                MayaShopHomePageFragment mayaShopHomePageFragment = this.f9341b;
                Callback.onClick_enter(view);
                try {
                    ((Xb.f) mayaShopHomePageFragment.R1()).n();
                    return;
                } finally {
                }
            default:
                MayaShopHomePageFragment mayaShopHomePageFragment2 = this.f9341b;
                Callback.onClick_enter(view);
                try {
                    ((Xb.f) mayaShopHomePageFragment2.R1()).n();
                    return;
                } finally {
                }
        }
    }
}
