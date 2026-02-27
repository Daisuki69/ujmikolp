package com.paymaya.mayaui.shop.view.fragment.impl;

import N5.A1;
import N5.B;
import N5.C0466m;
import N5.G0;
import O5.a;
import S5.c;
import Uh.d;
import ac.x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import bc.f;
import cc.n;
import cc.o;
import com.google.android.material.imageview.ShapeableImageView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.widget.MayaResizingTabLayout;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.C;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.store.P0;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopProviderPageFragment extends MayaBaseLoadingFragment implements f {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public String f14040A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f14041B0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Bb.f f14042o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public x f14043p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public C0466m f14044q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MayaResizingTabLayout f14045r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ViewPager f14046s0;
    public LinearLayout t0;
    public ShapeableImageView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public A1 f14047v0;
    public B w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ConstraintLayout f14048x0;
    public n y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ShopProvider f14049z0;

    public static final void T1(MayaShopProviderPageFragment mayaShopProviderPageFragment) {
        n nVar = mayaShopProviderPageFragment.y0;
        if (nVar == null) {
            j.n("mShopProviderPageFragmentListener");
            throw null;
        }
        ShopProvider shopProvider = mayaShopProviderPageFragment.f14049z0;
        if (shopProvider == null) {
            shopProvider = new ShopProvider("", "", "", "", null, null, null, "", "", null, null, null, 3696, null);
        }
        ((MayaShopV2Activity) nVar).f2(shopProvider);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_provider_page, viewGroup, false);
        int i = R.id.barrier_shop_provider_banner;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_shop_provider_banner)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.container_layout_shop_provider_product_search;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.container_layout_shop_provider_product_search);
            if (linearLayout != null) {
                i = R.id.guideline_shop_provider_left_margin;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_shop_provider_left_margin)) != null) {
                    i = R.id.guideline_shop_provider_right_margin;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_shop_provider_right_margin)) != null) {
                        i = R.id.image_view_shop_provider_banner;
                        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_shop_provider_banner);
                        if (shapeableImageView != null) {
                            i = R.id.lottie_view_shop_provider_banner_loading;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.lottie_view_shop_provider_banner_loading);
                            if (viewFindChildViewById != null) {
                                A1 a12 = new A1((CardView) viewFindChildViewById, 1);
                                i = R.id.lottie_view_shop_provider_products_container_loading;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.lottie_view_shop_provider_products_container_loading);
                                if (viewFindChildViewById2 != null) {
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindChildViewById2;
                                    int i4 = R.id.divider_1;
                                    if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.divider_1)) != null) {
                                        i4 = R.id.divider_2;
                                        if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.divider_2)) != null) {
                                            i4 = R.id.divider_3;
                                            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.divider_3)) != null) {
                                                i4 = R.id.divider_4;
                                                if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.divider_4)) != null) {
                                                    i4 = R.id.divider_5;
                                                    if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.divider_5)) != null) {
                                                        i4 = R.id.divider_6;
                                                        if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById2, R.id.divider_6)) != null) {
                                                            i4 = R.id.loading_item_1;
                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.loading_item_1);
                                                            if (viewFindChildViewById3 != null) {
                                                                G0.f(viewFindChildViewById3);
                                                                i4 = R.id.loading_item_2;
                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.loading_item_2);
                                                                if (viewFindChildViewById4 != null) {
                                                                    G0.f(viewFindChildViewById4);
                                                                    i4 = R.id.loading_item_3;
                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.loading_item_3);
                                                                    if (viewFindChildViewById5 != null) {
                                                                        G0.f(viewFindChildViewById5);
                                                                        i4 = R.id.loading_item_4;
                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.loading_item_4);
                                                                        if (viewFindChildViewById6 != null) {
                                                                            G0.f(viewFindChildViewById6);
                                                                            i4 = R.id.loading_item_5;
                                                                            View viewFindChildViewById7 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.loading_item_5);
                                                                            if (viewFindChildViewById7 != null) {
                                                                                G0.f(viewFindChildViewById7);
                                                                                i4 = R.id.loading_item_6;
                                                                                View viewFindChildViewById8 = ViewBindings.findChildViewById(viewFindChildViewById2, R.id.loading_item_6);
                                                                                if (viewFindChildViewById8 != null) {
                                                                                    G0.f(viewFindChildViewById8);
                                                                                    G0 g02 = new G0(constraintLayout2, 24);
                                                                                    i = R.id.lottie_view_shop_provider_subcategory_tabs_loading;
                                                                                    View viewFindChildViewById9 = ViewBindings.findChildViewById(viewInflate, R.id.lottie_view_shop_provider_subcategory_tabs_loading);
                                                                                    if (viewFindChildViewById9 != null) {
                                                                                        int i6 = R.id.lottie_view_shop_provider_subcategory_tab_loading_1;
                                                                                        View viewFindChildViewById10 = ViewBindings.findChildViewById(viewFindChildViewById9, R.id.lottie_view_shop_provider_subcategory_tab_loading_1);
                                                                                        if (viewFindChildViewById10 != null) {
                                                                                            i6 = R.id.lottie_view_shop_provider_subcategory_tab_loading_2;
                                                                                            View viewFindChildViewById11 = ViewBindings.findChildViewById(viewFindChildViewById9, R.id.lottie_view_shop_provider_subcategory_tab_loading_2);
                                                                                            if (viewFindChildViewById11 != null) {
                                                                                                i6 = R.id.lottie_view_shop_provider_subcategory_tab_loading_3;
                                                                                                View viewFindChildViewById12 = ViewBindings.findChildViewById(viewFindChildViewById9, R.id.lottie_view_shop_provider_subcategory_tab_loading_3);
                                                                                                if (viewFindChildViewById12 != null) {
                                                                                                    i6 = R.id.lottie_view_shop_provider_subcategory_tab_loading_4;
                                                                                                    View viewFindChildViewById13 = ViewBindings.findChildViewById(viewFindChildViewById9, R.id.lottie_view_shop_provider_subcategory_tab_loading_4);
                                                                                                    if (viewFindChildViewById13 != null) {
                                                                                                        B b8 = new B((LinearLayout) viewFindChildViewById9, 1);
                                                                                                        i = R.id.tab_layout_shop_provider_subcategories_tabs;
                                                                                                        MayaResizingTabLayout mayaResizingTabLayout = (MayaResizingTabLayout) ViewBindings.findChildViewById(viewInflate, R.id.tab_layout_shop_provider_subcategories_tabs);
                                                                                                        if (mayaResizingTabLayout != null) {
                                                                                                            i = R.id.view_pager_shop_provider_products_container;
                                                                                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, R.id.view_pager_shop_provider_products_container);
                                                                                                            if (viewPager != null) {
                                                                                                                this.f14044q0 = new C0466m(constraintLayout, linearLayout, shapeableImageView, a12, g02, b8, mayaResizingTabLayout, viewPager, 13);
                                                                                                                j.f(constraintLayout, "getRoot(...)");
                                                                                                                return constraintLayout;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById9.getResources().getResourceName(i6)));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById2.getResources().getResourceName(i4)));
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_reusable_error, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final Bb.f P1() {
        Bb.f fVar = this.f14042o0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mShopProviderPageFragmentPresenter");
        throw null;
    }

    public final void Q1() {
        A1 a12 = this.f14047v0;
        if (a12 != null) {
            a12.f3548b.setVisibility(8);
        } else {
            j.n("mBannerLoadingLottieView");
            throw null;
        }
    }

    public final void R1() {
        ConstraintLayout constraintLayout = this.f14048x0;
        if (constraintLayout == null) {
            j.n("mViewPagerLoadingView");
            throw null;
        }
        constraintLayout.setVisibility(8);
        this.f10359n0 = true;
    }

    public final void S1() {
        B b8 = this.w0;
        if (b8 != null) {
            ((LinearLayout) b8.f3550b).setVisibility(8);
        } else {
            j.n("mSubcategoryTabsLoadingLottieView");
            throw null;
        }
    }

    public final void U1(List providerSubcategoryList) {
        x xVar;
        j.g(providerSubcategoryList, "providerSubcategoryList");
        ShopProvider shopProvider = this.f14049z0;
        if (shopProvider != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            j.f(childFragmentManager, "getChildFragmentManager(...)");
            xVar = new x(childFragmentManager, shopProvider, providerSubcategoryList, this.f14040A0, this.f14041B0);
        } else {
            xVar = null;
        }
        this.f14043p0 = xVar;
        ViewPager viewPager = this.f14046s0;
        if (viewPager == null) {
            j.n("mViewPagerContent");
            throw null;
        }
        viewPager.setAdapter(xVar);
        viewPager.setOffscreenPageLimit(1);
        viewPager.addOnPageChangeListener(new o(this));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14049z0 = (ShopProvider) arguments.getParcelable("shop_provider");
            this.f14040A0 = arguments.getString("source_page");
        }
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f14042o0 = new Bb.f(new P0((PayMayaClientApi) aVar.f4745w.get(), (C) aVar.f4672K0.get()), (d) aVar.f4748y.get());
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageFragment.MayaShopProviderPageFragmentListener");
        this.y0 = (n) activity;
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14044q0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.w(15));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str = this.f14040A0;
            if (str != null) {
                c1219hE.j.put("source_page", str);
            }
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            ShopProvider shopProvider = this.f14049z0;
            String name = shopProvider != null ? shopProvider.getName() : null;
            if (name != null) {
                c1219hE.j.put("provider_name", name);
            }
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            ShopProvider shopProvider2 = this.f14049z0;
            String displayName = shopProvider2 != null ? shopProvider2.getDisplayName() : null;
            if (displayName != null) {
                c1219hE.j.put("provider_code", displayName);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            x xVar = this.f14043p0;
            c1219hE.j.put("subcategories", String.valueOf(xVar != null ? Integer.valueOf(xVar.f7123b.size()) : null));
            o1().b(c1219hE);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        n nVar = this.y0;
        if (nVar != null) {
            ((MayaShopV2Activity) nVar).Q(this);
        } else {
            j.n("mShopProviderPageFragmentListener");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String displayName;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f14044q0;
        j.d(c0466m);
        this.f14045r0 = (MayaResizingTabLayout) c0466m.h;
        C0466m c0466m2 = this.f14044q0;
        j.d(c0466m2);
        this.f14046s0 = (ViewPager) c0466m2.i;
        C0466m c0466m3 = this.f14044q0;
        j.d(c0466m3);
        this.t0 = (LinearLayout) c0466m3.c;
        C0466m c0466m4 = this.f14044q0;
        j.d(c0466m4);
        this.u0 = (ShapeableImageView) c0466m4.f4151d;
        C0466m c0466m5 = this.f14044q0;
        j.d(c0466m5);
        this.f14047v0 = (A1) c0466m5.e;
        C0466m c0466m6 = this.f14044q0;
        j.d(c0466m6);
        this.w0 = (B) c0466m6.f4152g;
        C0466m c0466m7 = this.f14044q0;
        j.d(c0466m7);
        this.f14048x0 = ((G0) c0466m7.f).f3627b;
        n nVar = this.y0;
        if (nVar == null) {
            j.n("mShopProviderPageFragmentListener");
            throw null;
        }
        ShopProvider shopProvider = this.f14049z0;
        if (shopProvider == null || (displayName = shopProvider.getDisplayName()) == null) {
            displayName = "";
        }
        ((MayaShopV2Activity) nVar).K1(displayName);
        LinearLayout linearLayout = this.t0;
        if (linearLayout == null) {
            j.n("mSearchView");
            throw null;
        }
        linearLayout.setOnClickListener(new Y6.o(this, 13));
        P1().j();
    }
}
