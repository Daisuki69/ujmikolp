package Xb;

import Kh.C0307l;
import Kh.C0310o;
import Kh.T;
import android.os.Bundle;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import cj.C1132s;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.imageview.ShapeableImageView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopV3ProductLoadingItem;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends AbstractC2509a implements Wb.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1285t0 f6595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C1285t0 c1285t0, Uh.d sessionSubject) {
        super(sessionSubject);
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.f6595d = c1285t0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        int i = 1;
        super.j();
        ShopProvider shopProviderQ1 = ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).Q1();
        String backgroundUrl = shopProviderQ1.getBackgroundUrl();
        if (backgroundUrl == null || C2576A.H(backgroundUrl)) {
            ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).R1();
            ShapeableImageView shapeableImageView = ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).f14075r0;
            if (shapeableImageView == null) {
                kotlin.jvm.internal.j.n("mBannerImageView");
                throw null;
            }
            shapeableImageView.setVisibility(8);
        } else {
            MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = (MayaShopProviderProductsListFragment) ((bc.h) this.c.get());
            mayaShopProviderProductsListFragment.getClass();
            mayaShopProviderProductsListFragment.requireContext();
            ShapeableImageView shapeableImageView2 = mayaShopProviderProductsListFragment.f14075r0;
            if (shapeableImageView2 == null) {
                kotlin.jvm.internal.j.n("mBannerImageView");
                throw null;
            }
            com.paymaya.common.utility.C.f0(backgroundUrl, shapeableImageView2, new Qd.a(mayaShopProviderProductsListFragment, 27));
        }
        C1285t0 c1285t0 = this.f6595d;
        String providerName = shopProviderQ1.getName();
        c1285t0.getClass();
        kotlin.jvm.internal.j.g(providerName, "providerName");
        M5.b bVar = new M5.b(providerName);
        com.paymaya.data.database.repository.A a8 = c1285t0.c;
        e(new C0310o(new C0307l(new Kh.z(a8.f11293a.d("product_v3", bVar), new com.google.firebase.messaging.p(a8, i), 0).e(zh.b.a()), 1), new Q6.s(this, 13), Eh.d.c, Eh.d.f1365b).f());
        if (!((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).y0) {
            k();
            return;
        }
        MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment2 = (MayaShopProviderProductsListFragment) ((bc.h) this.c.get());
        cc.s sVar = mayaShopProviderProductsListFragment2.f14069B0;
        if (sVar == null) {
            kotlin.jvm.internal.j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        Bundle bundle = ((MayaShopV2Activity) sVar).W1().getBundle(MayaShopProviderProductsListFragment.f14064E0);
        if (bundle != null) {
            mayaShopProviderProductsListFragment2.y0 = bundle.getBoolean(MayaShopProviderProductsListFragment.f14065F0, false);
            mayaShopProviderProductsListFragment2.f14079z0 = bundle.getInt(MayaShopProviderProductsListFragment.f14066G0, 1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(MayaShopProviderProductsListFragment.I0);
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                ((u) mayaShopProviderProductsListFragment2.P1()).k();
            } else {
                ac.s sVar2 = mayaShopProviderProductsListFragment2.f14068A0;
                if (sVar2 == null) {
                    kotlin.jvm.internal.j.n("mProductsAdapter");
                    throw null;
                }
                sVar2.h(parcelableArrayList);
                String str = MayaShopProviderProductsListFragment.f14067H0;
                if (bundle.containsKey(str)) {
                    RecyclerView recyclerView = mayaShopProviderProductsListFragment2.u0;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.j.n("mProductsRecyclerView");
                        throw null;
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.onRestoreInstanceState(bundle.getParcelable(str));
                    }
                }
            }
        }
        ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).L1();
    }

    public final void k() {
        int i = 2;
        int i4 = 5;
        int i6 = 0;
        if (((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).f14070C0) {
            return;
        }
        ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).f14070C0 = true;
        ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).S1(C1132s.g(new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null), new ShopV3ProductLoadingItem(null, 1, null)));
        ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).L1();
        new T(i4, new Lh.d(new Lh.d(new Lh.h(this.f6595d.c(1, ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).Q1().getName(), true), zh.b.a(), 0), new t(this, i6), i), new T3.l(this, 10), i6), new s(this, i6)).e();
    }

    public final void l(List updatedProducts) {
        kotlin.jvm.internal.j.g(updatedProducts, "updatedProducts");
        ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).S1(updatedProducts);
        ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).L1();
        if (updatedProducts.isEmpty()) {
            SpringView springView = ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).w0;
            if (springView == null) {
                kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                throw null;
            }
            springView.setVisibility(8);
            Group group = ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).f14078x0;
            if (group != null) {
                group.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.j.n("mNoProductsView");
                throw null;
            }
        }
        SpringView springView2 = ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).w0;
        if (springView2 == null) {
            kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView2.setVisibility(0);
        Group group2 = ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).f14078x0;
        if (group2 != null) {
            group2.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mNoProductsView");
            throw null;
        }
    }

    public final void m(PayMayaError payMayaError) {
        int i = 2;
        int i4 = 1;
        ac.s sVar = ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).f14068A0;
        if (sVar == null) {
            kotlin.jvm.internal.j.n("mProductsAdapter");
            throw null;
        }
        if (!sVar.e().isEmpty()) {
            ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).L1();
            ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).y0 = true;
            return;
        }
        C1285t0 c1285t0 = this.f6595d;
        String providerName = ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).Q1().getName();
        c1285t0.getClass();
        kotlin.jvm.internal.j.g(providerName, "providerName");
        List listA = com.paymaya.data.database.repository.A.a(c1285t0.c.f11293a.f2811a.query(String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\" ORDER BY %4$s ASC, %5$s COLLATE NOCASE ASC, %6$s COLLATE NOCASE ASC, CASE WHEN %7$s = 0 THEN %8$s ELSE %9$s END", Arrays.copyOf(new Object[]{"product_v3", "provider", providerName, "priority", "provider_display_name", AppMeasurementSdk.ConditionalUserProperty.NAME, "promo", "original_value", "discounted_value"}, 9))));
        if (!listA.isEmpty()) {
            l(listA);
            ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).y0 = true;
            return;
        }
        if (payMayaError.isSessionTimeout()) {
            ((MayaShopProviderProductsListFragment) ((bc.h) this.c.get())).S1(C1112C.f9377a);
            bc.h hVar = (bc.h) this.c.get();
            String strMSpiel = payMayaError.mSpiel();
            MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = (MayaShopProviderProductsListFragment) hVar;
            mayaShopProviderProductsListFragment.getClass();
            MayaBaseLoadingFragment.N1(mayaShopProviderProductsListFragment, 200, strMSpiel, null, new cc.r(mayaShopProviderProductsListFragment, i4), 28);
            return;
        }
        if (payMayaError.isNetworkError()) {
            bc.h hVar2 = (bc.h) this.c.get();
            String strMSpiel2 = payMayaError.mSpiel();
            MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment2 = (MayaShopProviderProductsListFragment) hVar2;
            mayaShopProviderProductsListFragment2.getClass();
            MayaBaseLoadingFragment.N1(mayaShopProviderProductsListFragment2, 100, strMSpiel2, null, new cc.r(mayaShopProviderProductsListFragment2, i), 28);
            return;
        }
        bc.h hVar3 = (bc.h) this.c.get();
        String strMSpiel3 = payMayaError.mSpiel();
        MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment3 = (MayaShopProviderProductsListFragment) hVar3;
        mayaShopProviderProductsListFragment3.getClass();
        MayaBaseLoadingFragment.N1(mayaShopProviderProductsListFragment3, 200, strMSpiel3, null, new cc.r(mayaShopProviderProductsListFragment3, i4), 28);
    }
}
