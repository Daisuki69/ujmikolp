package com.paymaya.mayaui.shop.view.fragment.impl;

import J7.e;
import N5.C0447e;
import O5.a;
import O6.b;
import T3.l;
import Uh.d;
import Wb.c;
import Xb.r;
import ac.p;
import ac.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bc.g;
import cc.q;
import com.airbnb.lottie.LottieAnimationView;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderSubcategory;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.ui.dashboard.view.widget.DashboardLayoutManager;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopProviderPageProductsListFragment extends MayaBaseLoadingFragment implements g, p {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f14050A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f14051B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ShopProvider f14052C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public String f14053D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public String f14054E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public String f14055F0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public r f14056o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C0447e f14057p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public NestedScrollView f14058q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SpringView f14059r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Group f14060s0;
    public LottieAnimationView t0;
    public boolean u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f14061v0 = 1;
    public s w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public q f14062x0;
    public C1219h y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ShopProviderSubcategory f14063z0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_shop_provider_page_products_list, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.guideline_shop_provider_products_left_margin;
        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_shop_provider_products_left_margin)) != null) {
            i = R.id.guideline_shop_provider_products_right_margin;
            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_shop_provider_products_right_margin)) != null) {
                i = R.id.image_view_shop_provider_products_no_shop_products;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_shop_provider_products_no_shop_products)) != null) {
                    i = R.id.recycler_view_shop_provider_products_list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_shop_provider_products_list);
                    if (recyclerView != null) {
                        i = R.id.scroll_view_shop_provider_products_container;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_shop_provider_products_container);
                        if (nestedScrollView != null) {
                            i = R.id.spring_view_shop_provider_products_swipe_refresh_layout;
                            SpringView springView = (SpringView) ViewBindings.findChildViewById(viewInflate, R.id.spring_view_shop_provider_products_swipe_refresh_layout);
                            if (springView != null) {
                                i = R.id.text_view_shop_provider_products_no_shop_products_description;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_shop_provider_products_no_shop_products_description)) != null) {
                                    i = R.id.text_view_shop_provider_products_no_shop_products_title;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_shop_provider_products_no_shop_products_title)) != null) {
                                        i = R.id.view_group_shop_provider_products_no_products;
                                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.view_group_shop_provider_products_no_products);
                                        if (group != null) {
                                            this.f14057p0 = new C0447e(constraintLayout, recyclerView, nestedScrollView, springView, group, 21);
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

    public final c P1() {
        r rVar = this.f14056o0;
        if (rVar != null) {
            return rVar;
        }
        j.n("mShopProviderPageProductsListFragmentPresenter");
        throw null;
    }

    public final void Q1(List products) {
        j.g(products, "products");
        s sVar = this.w0;
        if (sVar != null) {
            sVar.h(products);
        } else {
            j.n("mProductsAdapter");
            throw null;
        }
    }

    @Override // ac.p
    public final void j(int i, ProductV3 productV3) {
        String productCode;
        String providerName;
        Amount amountOriginal;
        String name;
        r rVar = (r) P1();
        EnumC1215d enumC1215d = EnumC1215d.SHOP;
        String str = "";
        if (productV3 != null && productV3.isDisabled()) {
            MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment = (MayaShopProviderPageProductsListFragment) ((g) rVar.c.get());
            C1220i c1220iO1 = mayaShopProviderPageProductsListFragment.o1();
            FragmentActivity activity = mayaShopProviderPageProductsListFragment.getActivity();
            C1219h c1219hD = C1219h.d(enumC1215d);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PRODUCT_DISABLED);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String productCode2 = productV3.getProductCode();
            if (productCode2 == null) {
                productCode2 = "";
            }
            HashMap map = c1219hD.j;
            map.put("product", productCode2);
            ShopProviderSubcategory shopProviderSubcategory = mayaShopProviderPageProductsListFragment.f14063z0;
            if (shopProviderSubcategory != null && (name = shopProviderSubcategory.getName()) != null) {
                str = name;
            }
            map.put("provider", str);
            c1220iO1.c(activity, c1219hD);
            return;
        }
        MayaShopProviderPageProductsListFragment mayaShopProviderPageProductsListFragment2 = (MayaShopProviderPageProductsListFragment) ((g) rVar.c.get());
        if (mayaShopProviderPageProductsListFragment2.t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(12));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String str2 = mayaShopProviderPageProductsListFragment2.f14054E0;
            HashMap map2 = c1219hE.j;
            map2.put("source_page", str2);
            map2.put("section", mayaShopProviderPageProductsListFragment2.f14053D0);
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            String productCode3 = productV3 != null ? productV3.getProductCode() : null;
            if (productCode3 != null) {
                c1219hE.j.put("product_code", productCode3);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            String name2 = productV3 != null ? productV3.getName() : null;
            if (name2 != null) {
                c1219hE.j.put("product_name", name2);
            }
            EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
            String provider = productV3 != null ? productV3.getProvider() : null;
            if (provider != null) {
                c1219hE.j.put("provider", provider);
            }
            EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
            String currencyFormattedValue = (productV3 == null || (amountOriginal = productV3.getAmountOriginal()) == null) ? null : amountOriginal.getCurrencyFormattedValue();
            if (currencyFormattedValue != null) {
                c1219hE.j.put("price", currencyFormattedValue);
            }
            EnumC1212a enumC1212a7 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("promo", String.valueOf(productV3 != null ? Boolean.valueOf(productV3.isPromo()) : null));
            mayaShopProviderPageProductsListFragment2.o1().b(c1219hE);
        } else {
            C1220i c1220iO12 = mayaShopProviderPageProductsListFragment2.o1();
            FragmentActivity activity2 = mayaShopProviderPageProductsListFragment2.getActivity();
            C1219h c1219hD2 = C1219h.d(enumC1215d);
            c1219hD2.n(17);
            c1219hD2.t(EnumC1217f.PRODUCT);
            EnumC1212a enumC1212a8 = EnumC1212a.ACCOUNT_NUMBER;
            if (productV3 == null || (productCode = productV3.getProductCode()) == null) {
                productCode = "";
            }
            HashMap map3 = c1219hD2.j;
            map3.put("product", productCode);
            ShopProviderSubcategory shopProviderSubcategory2 = mayaShopProviderPageProductsListFragment2.f14063z0;
            if (shopProviderSubcategory2 != null && (providerName = shopProviderSubcategory2.getProviderName()) != null) {
                str = providerName;
            }
            map3.put("provider", str);
            map3.put("location", "list");
            map3.put("position", String.valueOf(i + 1));
            c1220iO12.c(activity2, c1219hD2);
        }
        q qVar = mayaShopProviderPageProductsListFragment2.f14062x0;
        if (qVar != null) {
            ((MayaShopV2Activity) qVar).c2(productV3);
        } else {
            j.n("mShopProviderPageProductsListFragmentListener");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f14063z0 = (ShopProviderSubcategory) arguments.getParcelable("shop_provider_subcategory");
            this.f14050A0 = arguments.getInt("shop_provider_subcategory_position");
            this.f14051B0 = arguments.getInt("shop_provider_subcategory_count");
            this.f14052C0 = (ShopProvider) arguments.getParcelable("shop_provider");
            this.f14054E0 = arguments.getString("shop_provider_source_page");
            this.f14053D0 = arguments.getString("shop_provider_section");
            this.f14055F0 = arguments.getString("shop_provider_subcategory_source_tab");
        }
        C1219h c1219hD = C1219h.d(EnumC1215d.SHOP_PROVIDER_SUBCATEGORY);
        c1219hD.n(21);
        this.y0 = c1219hD;
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f14056o0 = new r(aVar.I(), (d) aVar.f4748y.get());
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageProductsListFragment.MayaShopProviderPageProductsListFragmentListener");
        this.f14062x0 = (q) activity;
        ((AbstractC2509a) P1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) P1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14057p0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        String code;
        String name;
        if (t1().e().isShopEventsV2Enabled()) {
            ShopProviderSubcategory shopProviderSubcategory = this.f14063z0;
            String name2 = shopProviderSubcategory != null ? shopProviderSubcategory.getName() : null;
            C1219h c1219hE = C1219h.e(AbstractC1213b.w(19));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str = this.f14055F0;
            if (str != null) {
                c1219hE.j.put("source_tab", str);
            }
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            ShopProvider shopProvider = this.f14052C0;
            String displayName = shopProvider != null ? shopProvider.getDisplayName() : null;
            if (displayName != null) {
                c1219hE.j.put("provider_name", displayName);
            }
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            ShopProvider shopProvider2 = this.f14052C0;
            String name3 = shopProvider2 != null ? shopProvider2.getName() : null;
            if (name3 != null) {
                c1219hE.j.put("provider_code", name3);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            if (name2 != null) {
                c1219hE.j.put("subcategory", name2);
            }
            o1().b(c1219hE);
        } else {
            ShopProviderSubcategory shopProviderSubcategory2 = this.f14063z0;
            String str2 = "";
            if (shopProviderSubcategory2 == null || (code = shopProviderSubcategory2.getCode()) == null) {
                code = "";
            }
            ShopProvider shopProvider3 = this.f14052C0;
            if (shopProvider3 != null && (name = shopProvider3.getName()) != null) {
                str2 = name;
            }
            C1219h c1219h = this.y0;
            if (c1219h == null) {
                j.n("mAnalyticsEvent");
                throw null;
            }
            EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219h.j;
            map.put("subcategory_code", code);
            map.put("provider", str2);
            map.put("subcategory_position", String.valueOf(this.f14050A0));
            EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("subcategory_count", String.valueOf(this.f14051B0));
            C1220i c1220iO1 = o1();
            FragmentActivity activity = getActivity();
            C1219h c1219h2 = this.y0;
            if (c1219h2 == null) {
                j.n("mAnalyticsEvent");
                throw null;
            }
            c1220iO1.d(activity, c1219h2);
        }
        super.onPause();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o1();
        C1219h c1219h = this.y0;
        if (c1219h != null) {
            c1219h.f11205g = System.nanoTime();
        } else {
            j.n("mAnalyticsEvent");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f14057p0;
        j.d(c0447e);
        this.f14058q0 = (NestedScrollView) c0447e.f4080d;
        C0447e c0447e2 = this.f14057p0;
        j.d(c0447e2);
        this.f14059r0 = (SpringView) c0447e2.e;
        C0447e c0447e3 = this.f14057p0;
        j.d(c0447e3);
        this.f14060s0 = (Group) c0447e3.f;
        SpringView springView = this.f14059r0;
        if (springView == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.setHeader(new e());
        SpringView springView2 = this.f14059r0;
        if (springView2 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById = springView2.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.t0 = (LottieAnimationView) viewFindViewById;
        SpringView springView3 = this.f14059r0;
        if (springView3 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView3.setListener(new l(this, 25));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.w0 = new s(fragmentActivityRequireActivity, this);
        C0447e c0447e4 = this.f14057p0;
        j.d(c0447e4);
        RecyclerView recyclerView = (RecyclerView) c0447e4.c;
        recyclerView.setLayoutManager(new DashboardLayoutManager(recyclerView.getContext()));
        s sVar = this.w0;
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
        NestedScrollView nestedScrollView = this.f14058q0;
        if (nestedScrollView == null) {
            j.n("mProductsScrollView");
            throw null;
        }
        nestedScrollView.setOnScrollChangeListener(new androidx.work.impl.e(this, 8));
        ((r) P1()).j();
    }
}
