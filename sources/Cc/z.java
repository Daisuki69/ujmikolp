package cc;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryPageFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaShopPurchaseHistoryPageFragment f9362b;

    public /* synthetic */ z(MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment, int i) {
        this.f9361a = i;
        this.f9362b = mayaShopPurchaseHistoryPageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9361a) {
            case 0:
                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = this.f9362b;
                Callback.onClick_enter(view);
                try {
                    mayaShopPurchaseHistoryPageFragment.O1();
                    mayaShopPurchaseHistoryPageFragment.Q1().k();
                    return;
                } finally {
                }
            case 1:
                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment2 = this.f9362b;
                Callback.onClick_enter(view);
                try {
                    MayaShopPurchaseHistoryPageFragment.S1(mayaShopPurchaseHistoryPageFragment2);
                    return;
                } finally {
                }
            default:
                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment3 = this.f9362b;
                Callback.onClick_enter(view);
                try {
                    mayaShopPurchaseHistoryPageFragment3.O1();
                    mayaShopPurchaseHistoryPageFragment3.Q1().k();
                    return;
                } finally {
                }
        }
    }
}
