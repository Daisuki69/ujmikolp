package com.paymaya.mayaui.shop.view.fragment.impl;

import J7.e;
import N5.A1;
import N5.C0466m;
import O5.a;
import O6.b;
import Q6.r;
import S5.c;
import Wb.d;
import Xb.u;
import ac.p;
import ac.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bc.h;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.imageview.ShapeableImageView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopProviderProductsListFragment extends MayaBaseLoadingFragment implements h, p {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final String f14064E0 = z.a(MayaShopProviderProductsListFragment.class).c();

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final String f14065F0 = "is_initially_loaded";

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public static final String f14066G0 = "current_page";

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final String f14067H0 = "layout_manager";
    public static final String I0 = "product_list_items";

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public s f14068A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public cc.s f14069B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f14070C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ShopProvider f14071D0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public u f14072o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C0466m f14073p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LinearLayout f14074q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ShapeableImageView f14075r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public A1 f14076s0;
    public NestedScrollView t0;
    public RecyclerView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public LottieAnimationView f14077v0;
    public SpringView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Group f14078x0;
    public boolean y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f14079z0 = 1;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_provider_products_list, viewGroup, false);
        int i = R.id.banner_loading_lottie_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.banner_loading_lottie_view);
        if (viewFindChildViewById != null) {
            A1 a12 = new A1((CardView) viewFindChildViewById, 1);
            i = R.id.barrier_banner;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_banner)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.container_swipe_refresh_layout;
                SpringView springView = (SpringView) ViewBindings.findChildViewById(viewInflate, R.id.container_swipe_refresh_layout);
                if (springView != null) {
                    i = R.id.left_guideline;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.left_guideline)) != null) {
                        i = R.id.no_products_view_group;
                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.no_products_view_group);
                        if (group != null) {
                            i = R.id.no_shop_products_description_text_view;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.no_shop_products_description_text_view)) != null) {
                                i = R.id.no_shop_products_image_view;
                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.no_shop_products_image_view)) != null) {
                                    i = R.id.no_shop_products_title_text_view;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.no_shop_products_title_text_view)) != null) {
                                        i = R.id.products_recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.products_recycler_view);
                                        if (recyclerView != null) {
                                            i = R.id.provider_banner_image_view;
                                            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(viewInflate, R.id.provider_banner_image_view);
                                            if (shapeableImageView != null) {
                                                i = R.id.right_guideline;
                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.right_guideline)) != null) {
                                                    i = R.id.scroll_view_products_container;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_products_container);
                                                    if (nestedScrollView != null) {
                                                        i = R.id.shop_product_search_container;
                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.shop_product_search_container);
                                                        if (linearLayout != null) {
                                                            this.f14073p0 = new C0466m(constraintLayout, a12, springView, group, recyclerView, shapeableImageView, nestedScrollView, linearLayout, 14);
                                                            j.f(constraintLayout, "getRoot(...)");
                                                            return constraintLayout;
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

    public final d P1() {
        u uVar = this.f14072o0;
        if (uVar != null) {
            return uVar;
        }
        j.n("mShopProviderProductsListFragmentPresenter");
        throw null;
    }

    public final ShopProvider Q1() {
        ShopProvider shopProvider = this.f14071D0;
        if (shopProvider != null) {
            return shopProvider;
        }
        j.n("mShopProvider");
        throw null;
    }

    public final void R1() {
        A1 a12 = this.f14076s0;
        if (a12 != null) {
            a12.f3548b.setVisibility(8);
        } else {
            j.n("mBannerLoadingLottieView");
            throw null;
        }
    }

    public final void S1(List products) {
        j.g(products, "products");
        s sVar = this.f14068A0;
        if (sVar != null) {
            sVar.h(products);
        } else {
            j.n("mProductsAdapter");
            throw null;
        }
    }

    @Override // ac.p
    public final void j(int i, ProductV3 productV3) {
        u uVar = (u) P1();
        EnumC1215d enumC1215d = EnumC1215d.SHOP;
        if (productV3 != null && productV3.isDisabled()) {
            MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = (MayaShopProviderProductsListFragment) ((h) uVar.c.get());
            C1220i c1220iO1 = mayaShopProviderProductsListFragment.o1();
            FragmentActivity activity = mayaShopProviderProductsListFragment.getActivity();
            C1219h c1219hD = C1219h.d(enumC1215d);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PRODUCT_DISABLED);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String productCode = productV3.getProductCode();
            HashMap map = c1219hD.j;
            map.put("product", productCode);
            ShopProvider shopProvider = mayaShopProviderProductsListFragment.f14071D0;
            if (shopProvider == null) {
                j.n("mShopProvider");
                throw null;
            }
            map.put("provider", shopProvider.getName());
            c1220iO1.c(activity, c1219hD);
            return;
        }
        MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment2 = (MayaShopProviderProductsListFragment) ((h) uVar.c.get());
        C1220i c1220iO12 = mayaShopProviderProductsListFragment2.o1();
        FragmentActivity activity2 = mayaShopProviderProductsListFragment2.getActivity();
        C1219h c1219hD2 = C1219h.d(enumC1215d);
        c1219hD2.n(17);
        c1219hD2.t(EnumC1217f.PRODUCT);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String productCode2 = productV3 != null ? productV3.getProductCode() : null;
        HashMap map2 = c1219hD2.j;
        map2.put("product", productCode2);
        ShopProvider shopProvider2 = mayaShopProviderProductsListFragment2.f14071D0;
        if (shopProvider2 == null) {
            j.n("mShopProvider");
            throw null;
        }
        map2.put("provider", shopProvider2.getName());
        map2.put("location", "list");
        map2.put("position", String.valueOf(i + 1));
        c1220iO12.c(activity2, c1219hD2);
        cc.s sVar = mayaShopProviderProductsListFragment2.f14069B0;
        if (sVar != null) {
            ((MayaShopV2Activity) sVar).c2(productV3);
        } else {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("shop_provider");
            j.d(parcelable);
            this.f14071D0 = (ShopProvider) parcelable;
        }
        this.f10338R = true;
        setHasOptionsMenu(true);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment.MayaShopProviderProductsListFragmentListener");
        this.f14069B0 = (cc.s) activity;
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f14072o0 = new u(aVar.I(), (Uh.d) aVar.f4748y.get());
        ((AbstractC2509a) P1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) P1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14073p0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        cc.s sVar = this.f14069B0;
        if (sVar == null) {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        Bundle bundleW1 = ((MayaShopV2Activity) sVar).W1();
        bundleW1.putBoolean(f14065F0, this.y0);
        bundleW1.putInt(f14066G0, this.f14079z0);
        RecyclerView recyclerView = this.u0;
        if (recyclerView == null) {
            j.n("mProductsRecyclerView");
            throw null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        bundleW1.putParcelable(f14067H0, layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        s sVar2 = this.f14068A0;
        if (sVar2 == null) {
            j.n("mProductsAdapter");
            throw null;
        }
        bundleW1.putParcelableArrayList(I0, new ArrayList<>(sVar2.e()));
        cc.s sVar3 = this.f14069B0;
        if (sVar3 == null) {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        Bundle bundleW12 = ((MayaShopV2Activity) sVar3).W1();
        bundleW12.putBundle(f14064E0, bundleW1);
        cc.s sVar4 = this.f14069B0;
        if (sVar4 == null) {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        ((MayaShopV2Activity) sVar4).m = bundleW12;
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        cc.s sVar = this.f14069B0;
        if (sVar != null) {
            ((MayaShopV2Activity) sVar).Q(this);
        } else {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0466m c0466m = this.f14073p0;
        j.d(c0466m);
        this.f14074q0 = (LinearLayout) c0466m.i;
        C0466m c0466m2 = this.f14073p0;
        j.d(c0466m2);
        this.f14075r0 = (ShapeableImageView) c0466m2.f4152g;
        C0466m c0466m3 = this.f14073p0;
        j.d(c0466m3);
        this.f14076s0 = (A1) c0466m3.c;
        C0466m c0466m4 = this.f14073p0;
        j.d(c0466m4);
        this.t0 = (NestedScrollView) c0466m4.h;
        C0466m c0466m5 = this.f14073p0;
        j.d(c0466m5);
        this.w0 = (SpringView) c0466m5.f4151d;
        C0466m c0466m6 = this.f14073p0;
        j.d(c0466m6);
        this.f14078x0 = (Group) c0466m6.e;
        SpringView springView = this.w0;
        if (springView == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.w0;
        if (springView2 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById = springView2.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f14077v0 = (LottieAnimationView) viewFindViewById;
        SpringView springView3 = this.w0;
        if (springView3 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView3.setListener(new r(this, 26));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f14068A0 = new s(fragmentActivityRequireActivity, this);
        C0466m c0466m7 = this.f14073p0;
        j.d(c0466m7);
        RecyclerView recyclerView = (RecyclerView) c0466m7.f;
        recyclerView.setLayoutManager(new DashboardLayoutManager(recyclerView.getContext()));
        s sVar = this.f14068A0;
        if (sVar == null) {
            j.n("mProductsAdapter");
            throw null;
        }
        recyclerView.setAdapter(sVar);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        b bVar = new b(contextRequireContext, 1);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.maya_divider_recycler_view);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        recyclerView.addItemDecoration(bVar);
        this.u0 = recyclerView;
        NestedScrollView nestedScrollView = this.t0;
        if (nestedScrollView == null) {
            j.n("mProductsScrollView");
            throw null;
        }
        nestedScrollView.setOnScrollChangeListener(new androidx.work.impl.e(this, 9));
        cc.s sVar2 = this.f14069B0;
        if (sVar2 == null) {
            j.n("mShopProviderProductsListFragmentListener");
            throw null;
        }
        ShopProvider shopProvider = this.f14071D0;
        if (shopProvider == null) {
            j.n("mShopProvider");
            throw null;
        }
        String title = shopProvider.getDisplayName();
        j.g(title, "title");
        ((MayaShopV2Activity) sVar2).K1(title);
        LinearLayout linearLayout = this.f14074q0;
        if (linearLayout == null) {
            j.n("mSearchView");
            throw null;
        }
        linearLayout.setOnClickListener(new cc.r(this, 0));
        ((u) P1()).j();
    }
}
