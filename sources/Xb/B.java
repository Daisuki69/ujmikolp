package Xb;

import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.domain.store.C1283s0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryReceiptFragment;
import sd.AbstractC2252a;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends AbstractC2252a implements y5.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1283s0 f6551d;
    public final com.paymaya.data.preference.a e;
    public M5.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6552g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C1283s0 c1283s0, com.paymaya.data.preference.a mPreference, S5.c flagConfigurationService) {
        super(flagConfigurationService, 0);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        this.f6551d = c1283s0;
        this.e = mPreference;
    }

    public final void z() {
        if (this.h) {
            MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment = (MayaShopPurchaseHistoryReceiptFragment) ((bc.m) this.c.get());
            Group group = mayaShopPurchaseHistoryReceiptFragment.f14117A0;
            if (group == null) {
                kotlin.jvm.internal.j.n("mGroupAllTransactionDetails");
                throw null;
            }
            group.setVisibility(0);
            mayaShopPurchaseHistoryReceiptFragment.f14130P0 = true;
            ImageView imageView = mayaShopPurchaseHistoryReceiptFragment.f14119C0;
            if (imageView != null) {
                imageView.setImageDrawable(ContextCompat.getDrawable(mayaShopPurchaseHistoryReceiptFragment.requireContext(), R.drawable.maya_ic_chevron_up_primary));
                return;
            } else {
                kotlin.jvm.internal.j.n("mImageViewTransactionDetailsArrow");
                throw null;
            }
        }
        MayaShopPurchaseHistoryReceiptFragment mayaShopPurchaseHistoryReceiptFragment2 = (MayaShopPurchaseHistoryReceiptFragment) ((bc.m) this.c.get());
        Group group2 = mayaShopPurchaseHistoryReceiptFragment2.f14118B0;
        if (group2 == null) {
            kotlin.jvm.internal.j.n("mGroupObligatoryTransactionDetails");
            throw null;
        }
        group2.setVisibility(0);
        mayaShopPurchaseHistoryReceiptFragment2.f14130P0 = true;
        ImageView imageView2 = mayaShopPurchaseHistoryReceiptFragment2.f14119C0;
        if (imageView2 != null) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(mayaShopPurchaseHistoryReceiptFragment2.requireContext(), R.drawable.maya_ic_chevron_up_primary));
        } else {
            kotlin.jvm.internal.j.n("mImageViewTransactionDetailsArrow");
            throw null;
        }
    }
}
