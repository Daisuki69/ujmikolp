package Xb;

import android.os.Bundle;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f6582b;

    public /* synthetic */ n(o oVar, int i) {
        this.f6581a = i;
        this.f6582b = oVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f6581a) {
            case 0:
                ProductV3 product = (ProductV3) obj;
                kotlin.jvm.internal.j.g(product, "product");
                this.f6582b.w(product);
                break;
            default:
                Ze.a p02 = (Ze.a) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                o oVar = this.f6582b;
                if (!p02.f6934b) {
                    cc.m mVar = ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).f14036s0;
                    if (mVar != null) {
                        Bundle bundleD = androidx.media3.datasource.cache.c.d("key_analytics_source_page", "Product Details");
                        MayaAllowContactsPermissionFragment mayaAllowContactsPermissionFragment = new MayaAllowContactsPermissionFragment();
                        mayaAllowContactsPermissionFragment.setArguments(bundleD);
                        AbstractC1236z.h((MayaShopV2Activity) mVar, R.id.frame_layout_fragment_container, mayaAllowContactsPermissionFragment);
                    }
                } else {
                    cc.m mVar2 = ((MayaShopPaymentFragment) ((bc.e) oVar.c.get())).f14036s0;
                    if (mVar2 != null) {
                        Bundle bundleD2 = androidx.media3.datasource.cache.c.d("key_analytics_source_page", "Product Details");
                        MayaContactsSelectionFragment mayaContactsSelectionFragment = new MayaContactsSelectionFragment();
                        mayaContactsSelectionFragment.setArguments(bundleD2);
                        AbstractC1236z.h((MayaShopV2Activity) mVar2, R.id.frame_layout_fragment_container, mayaContactsSelectionFragment);
                    }
                }
                break;
        }
    }
}
