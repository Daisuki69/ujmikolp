package we;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.dynatrace.android.callback.Callback;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ConfirmationBottomSheetFragment;

/* JADX INFO: renamed from: we.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2412a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShopV3ConfirmationBottomSheetFragment f20750b;

    public /* synthetic */ ViewOnClickListenerC2412a(ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment, int i) {
        this.f20749a = i;
        this.f20750b = shopV3ConfirmationBottomSheetFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20749a) {
            case 0:
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment = this.f20750b;
                Callback.onClick_enter(view);
                try {
                    shopV3ConfirmationBottomSheetFragment.dismiss();
                    return;
                } finally {
                }
            case 1:
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment2 = this.f20750b;
                Callback.onClick_enter(view);
                try {
                    shopV3ConfirmationBottomSheetFragment2.dismiss();
                    return;
                } finally {
                }
            case 2:
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment3 = this.f20750b;
                Callback.onClick_enter(view);
                try {
                    N5.K k8 = shopV3ConfirmationBottomSheetFragment3.f14780R;
                    kotlin.jvm.internal.j.d(k8);
                    ((Group) k8.f3708u).setVisibility(8);
                    shopV3ConfirmationBottomSheetFragment3.o1().setVisibility(0);
                    N5.K k10 = shopV3ConfirmationBottomSheetFragment3.f14780R;
                    kotlin.jvm.internal.j.d(k10);
                    ConstraintLayout constraintLayout = k10.e;
                    kotlin.jvm.internal.j.f(constraintLayout, "containerLayoutPmaFragme…V3ConfirmationBottomSheet");
                    shopV3ConfirmationBottomSheetFragment3.n1(constraintLayout);
                    return;
                } finally {
                }
            default:
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment4 = this.f20750b;
                Callback.onClick_enter(view);
                try {
                    shopV3ConfirmationBottomSheetFragment4.dismiss();
                    InterfaceC2414c interfaceC2414c = shopV3ConfirmationBottomSheetFragment4.f14783U;
                    if (interfaceC2414c != null) {
                        interfaceC2414c.E0();
                    }
                    return;
                } finally {
                }
        }
    }
}
