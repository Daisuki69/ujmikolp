package Xb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.widget.MayaResizingTabLayout;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageProductsListFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f6587b;

    public /* synthetic */ p(r rVar, int i) {
        this.f6586a = i;
        this.f6587b = rVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f6586a) {
            case 0:
                r rVar = this.f6587b;
                ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get())).u0 = false;
                MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment = (MayaShopProviderPageProductsListFragment) ((bc.g) rVar.c.get());
                cc.q qVar = mayaShopProviderPageProductsListFragment.f14062x0;
                if (qVar == null) {
                    kotlin.jvm.internal.j.n("mShopProviderPageProductsListFragmentListener");
                    throw null;
                }
                ShopProviderSubcategory shopProviderSubcategory = mayaShopProviderPageProductsListFragment.f14063z0;
                Fragment fragment = ((MayaShopV2Activity) qVar).f13987o;
                MayaShopProviderPageFragment mayaShopProviderPageFragment = fragment instanceof MayaShopProviderPageFragment ? (MayaShopProviderPageFragment) fragment : null;
                if (mayaShopProviderPageFragment != null) {
                    Bb.f fVarP1 = mayaShopProviderPageFragment.P1();
                    if (shopProviderSubcategory != null && !((MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get())).f10359n0) {
                        ((MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get())).S1();
                        ((MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get())).R1();
                        if (shopProviderSubcategory.isNotEmpty()) {
                            MayaResizingTabLayout mayaResizingTabLayout = ((MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get())).f14045r0;
                            if (mayaResizingTabLayout == null) {
                                kotlin.jvm.internal.j.n("mTabLayoutSubcategories");
                                throw null;
                            }
                            mayaResizingTabLayout.setVisibility(0);
                        }
                    }
                    MayaShopProviderPageFragment mayaShopProviderPageFragment2 = (MayaShopProviderPageFragment) ((bc.f) fVarP1.c.get());
                    MayaResizingTabLayout mayaResizingTabLayout2 = mayaShopProviderPageFragment2.f14045r0;
                    if (mayaResizingTabLayout2 == null) {
                        kotlin.jvm.internal.j.n("mTabLayoutSubcategories");
                        throw null;
                    }
                    ViewPager viewPager = mayaShopProviderPageFragment2.f14046s0;
                    if (viewPager == null) {
                        kotlin.jvm.internal.j.n("mViewPagerContent");
                        throw null;
                    }
                    mayaResizingTabLayout2.setupWithViewPager(viewPager);
                    MayaResizingTabLayout mayaResizingTabLayout3 = mayaShopProviderPageFragment2.f14045r0;
                    if (mayaResizingTabLayout3 == null) {
                        kotlin.jvm.internal.j.n("mTabLayoutSubcategories");
                        throw null;
                    }
                    View childAt = mayaResizingTabLayout3.getChildAt(0);
                    kotlin.jvm.internal.j.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) childAt;
                    View view = ViewGroupKt.get(viewGroup, 0);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    kotlin.jvm.internal.j.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginStart(view.getResources().getDimensionPixelSize(R.dimen.maya_margin_large));
                    view.setLayoutParams(layoutParams2);
                    View view2 = ViewGroupKt.get(viewGroup, viewGroup.getChildCount() - 1);
                    ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                    kotlin.jvm.internal.j.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                    layoutParams4.setMarginEnd(view2.getResources().getDimensionPixelSize(R.dimen.maya_margin_large));
                    view2.setLayoutParams(layoutParams4);
                    return;
                }
                return;
            case 1:
                r rVar2 = this.f6587b;
                ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar2.c.get())).u0 = false;
                SpringView springView = ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar2.c.get())).f14059r0;
                if (springView != null) {
                    springView.i();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mSwipeRefreshLayout");
                    throw null;
                }
            default:
                r rVar3 = this.f6587b;
                ((MayaShopProviderPageProductsListFragment) ((bc.g) rVar3.c.get())).u0 = false;
                MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment2 = (MayaShopProviderPageProductsListFragment) ((bc.g) rVar3.c.get());
                ac.s sVar = mayaShopProviderPageProductsListFragment2.w0;
                if (sVar == null) {
                    kotlin.jvm.internal.j.n("mProductsAdapter");
                    throw null;
                }
                if (sVar.f()) {
                    ac.s sVar2 = mayaShopProviderPageProductsListFragment2.w0;
                    if (sVar2 != null) {
                        sVar2.g(false);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mProductsAdapter");
                        throw null;
                    }
                }
                return;
        }
    }
}
