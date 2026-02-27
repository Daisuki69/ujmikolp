package com.paymaya.mayaui.shop.view.fragment.impl;

import Dh.c;
import Gh.f;
import Kh.B;
import Kh.C0301f;
import Kh.C0307l;
import N5.F;
import N5.F0;
import O5.a;
import Q6.s;
import Uh.d;
import Xb.w;
import ac.InterfaceC0675D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.e;
import bc.i;
import cc.u;
import cc.v;
import cj.C1112C;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopProviderProductsListSearchFragment extends MayaBaseFragment implements i, InterfaceC0675D {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public w f14080U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public F f14081V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public AppCompatEditText f14082W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ImageView f14083X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public NestedScrollView f14084Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public RecyclerView f14085Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Group f14086a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Group f14087b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public F0 f14088c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Button f14089d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f14091f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ac.F f14092g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public u f14093h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f14094i0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ShopProvider f14096k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f14097l0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f14090e0 = 1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f14095j0 = "";
    public final c m0 = new c(1);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final EnumC1215d f14098n0 = EnumC1215d.SHOP_SEARCH;

    public static final void I1(MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment) {
        mayaShopProviderProductsListSearchFragment.f14095j0 = "";
        AppCompatEditText appCompatEditText = mayaShopProviderProductsListSearchFragment.f14082W;
        if (appCompatEditText == null) {
            j.n("mSearchView");
            throw null;
        }
        appCompatEditText.setText("");
        Group group = mayaShopProviderProductsListSearchFragment.f14086a0;
        if (group == null) {
            j.n("mLoadingGroup");
            throw null;
        }
        group.setVisibility(8);
        NestedScrollView nestedScrollView = mayaShopProviderProductsListSearchFragment.f14084Y;
        if (nestedScrollView == null) {
            j.n("mSearchResultsScrollView");
            throw null;
        }
        nestedScrollView.setVisibility(8);
        Group group2 = mayaShopProviderProductsListSearchFragment.f14087b0;
        if (group2 == null) {
            j.n("mNoSearchResultsGroup");
            throw null;
        }
        group2.setVisibility(8);
        F0 f02 = mayaShopProviderProductsListSearchFragment.f14088c0;
        if (f02 != null) {
            f02.f3618b.setVisibility(8);
        } else {
            j.n("mErrorView");
            throw null;
        }
    }

    public final w G1() {
        w wVar = this.f14080U;
        if (wVar != null) {
            return wVar;
        }
        j.n("mShopProviderProductsListSearchFragmentPresenter");
        throw null;
    }

    public final String H1() {
        ShopProvider shopProvider = this.f14096k0;
        if (shopProvider != null) {
            return shopProvider.getName();
        }
        j.n("mShopProvider");
        throw null;
    }

    public final void J1() {
        Group group = this.f14086a0;
        if (group == null) {
            j.n("mLoadingGroup");
            throw null;
        }
        group.setVisibility(0);
        NestedScrollView nestedScrollView = this.f14084Y;
        if (nestedScrollView == null) {
            j.n("mSearchResultsScrollView");
            throw null;
        }
        nestedScrollView.setVisibility(8);
        Group group2 = this.f14087b0;
        if (group2 == null) {
            j.n("mNoSearchResultsGroup");
            throw null;
        }
        group2.setVisibility(8);
        F0 f02 = this.f14088c0;
        if (f02 != null) {
            f02.f3618b.setVisibility(8);
        } else {
            j.n("mErrorView");
            throw null;
        }
    }

    public final void K1() {
        Group group = this.f14086a0;
        if (group == null) {
            j.n("mLoadingGroup");
            throw null;
        }
        group.setVisibility(8);
        NestedScrollView nestedScrollView = this.f14084Y;
        if (nestedScrollView == null) {
            j.n("mSearchResultsScrollView");
            throw null;
        }
        nestedScrollView.setVisibility(0);
        Group group2 = this.f14087b0;
        if (group2 == null) {
            j.n("mNoSearchResultsGroup");
            throw null;
        }
        group2.setVisibility(8);
        F0 f02 = this.f14088c0;
        if (f02 != null) {
            f02.f3618b.setVisibility(8);
        } else {
            j.n("mErrorView");
            throw null;
        }
    }

    @Override // ac.InterfaceC0675D
    public final void d1(int i, ProductV3 productV3) {
        Amount amountOriginal;
        w wVarG1 = G1();
        EnumC1215d enumC1215d = EnumC1215d.SHOP;
        if (productV3 != null && productV3.isDisabled()) {
            MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = (MayaShopProviderProductsListSearchFragment) ((i) wVarG1.c.get());
            C1220i c1220iO1 = mayaShopProviderProductsListSearchFragment.o1();
            FragmentActivity activity = mayaShopProviderProductsListSearchFragment.getActivity();
            C1219h c1219hD = C1219h.d(enumC1215d);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PRODUCT_DISABLED);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String productCode = productV3.getProductCode();
            HashMap map = c1219hD.j;
            map.put("product", productCode);
            map.put("location", "search");
            c1220iO1.c(activity, c1219hD);
            return;
        }
        MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment2 = (MayaShopProviderProductsListSearchFragment) ((i) wVarG1.c.get());
        if (mayaShopProviderProductsListSearchFragment2.t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(12));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map2 = c1219hE.j;
            map2.put("source_page", "Provider Category");
            map2.put("section", "Search");
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            String productCode2 = productV3 != null ? productV3.getProductCode() : null;
            if (productCode2 != null) {
                c1219hE.j.put("product_code", productCode2);
            }
            EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
            String name = productV3 != null ? productV3.getName() : null;
            if (name != null) {
                c1219hE.j.put("product_name", name);
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
            String string = productV3 != null ? Boolean.valueOf(productV3.isPromo()).toString() : null;
            if (string != null) {
                c1219hE.j.put("promo", string);
            }
            mayaShopProviderProductsListSearchFragment2.o1().b(c1219hE);
        } else {
            C1220i c1220iO12 = mayaShopProviderProductsListSearchFragment2.o1();
            FragmentActivity activity2 = mayaShopProviderProductsListSearchFragment2.getActivity();
            C1219h c1219hD2 = C1219h.d(enumC1215d);
            c1219hD2.n(17);
            c1219hD2.t(EnumC1217f.PRODUCT);
            EnumC1212a enumC1212a8 = EnumC1212a.ACCOUNT_NUMBER;
            String productCode3 = productV3 != null ? productV3.getProductCode() : null;
            HashMap map3 = c1219hD2.j;
            map3.put("product", productCode3);
            map3.put("location", "search");
            map3.put("position", String.valueOf(i + 1));
            c1220iO12.c(activity2, c1219hD2);
        }
        C.R(mayaShopProviderProductsListSearchFragment2.getActivity());
        u uVar = mayaShopProviderProductsListSearchFragment2.f14093h0;
        if (uVar != null) {
            ((MayaShopV2Activity) uVar).b2(productV3);
        } else {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("search_provider");
            j.d(parcelable);
            this.f14096k0 = (ShopProvider) parcelable;
        }
        this.f10338R = true;
        setHasOptionsMenu(true);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListSearchFragment.MayaShopProviderProductsListSearchFragmentListener");
        this.f14093h0 = (u) activity;
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f14080U = new w(aVar.I(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4748y.get(), 0);
        G1().h(this);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f14092g0 = new ac.F(contextRequireContext, this);
        u uVar = this.f14093h0;
        if (uVar == null) {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
        Bundle bundleW1 = ((MayaShopV2Activity) uVar).W1();
        bundleW1.remove("MayaShopProviderProductsListSearchFragment");
        u uVar2 = this.f14093h0;
        if (uVar2 != null) {
            ((MayaShopV2Activity) uVar2).m = bundleW1;
        } else {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        F fB = F.b(inflater, viewGroup);
        this.f14081V = fB;
        ConstraintLayout constraintLayout = (ConstraintLayout) fB.f3614b;
        j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.m0.dispose();
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14081V = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        ArrayList arrayList;
        super.onPause();
        u uVar = this.f14093h0;
        if (uVar == null) {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
        Bundle bundleW1 = ((MayaShopV2Activity) uVar).W1();
        bundleW1.putInt("last_page_number", this.f14090e0);
        ac.F f = this.f14092g0;
        if (f != null) {
            ArrayList arrayList2 = f.f7086b;
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (obj instanceof ProductV3) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        bundleW1.putParcelableArrayList("searched_product_list_items", new ArrayList<>(arrayList));
        u uVar2 = this.f14093h0;
        if (uVar2 == null) {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
        ((MayaShopV2Activity) uVar2).m = bundleW1;
        if (t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.w(16));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            ShopProvider shopProvider = this.f14096k0;
            if (shopProvider == null) {
                j.n("mShopProvider");
                throw null;
            }
            String name = shopProvider.getName();
            HashMap map = c1219hE.j;
            map.put("provider_code", name);
            ShopProvider shopProvider2 = this.f14096k0;
            if (shopProvider2 == null) {
                j.n("mShopProvider");
                throw null;
            }
            map.put("provider_name", shopProvider2.getDisplayName());
            o1().b(c1219hE);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        u uVar = this.f14093h0;
        if (uVar != null) {
            ((MayaShopV2Activity) uVar).Q(this);
        } else {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F f = this.f14081V;
        j.d(f);
        this.f14082W = (AppCompatEditText) f.h;
        F f3 = this.f14081V;
        j.d(f3);
        this.f14083X = (ImageView) f3.f3615d;
        F f7 = this.f14081V;
        j.d(f7);
        this.f14084Y = (NestedScrollView) f7.f3616g;
        F f10 = this.f14081V;
        j.d(f10);
        this.f14085Z = (RecyclerView) f10.f;
        F f11 = this.f14081V;
        j.d(f11);
        this.f14086a0 = (Group) f11.c;
        F f12 = this.f14081V;
        j.d(f12);
        this.f14087b0 = (Group) f12.e;
        F f13 = this.f14081V;
        j.d(f13);
        F0 f02 = (F0) f13.i;
        this.f14088c0 = f02;
        this.f14089d0 = f02.c;
        C0301f c0301f = new C0301f(new e(this, 10), 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        B bE = new C0307l(c0301f.b(500L), 0).e(b.a());
        f fVar = new f(new s(this, 27), Eh.d.f1366d);
        bE.g(fVar);
        this.m0.a(fVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f14092g0 = new ac.F(fragmentActivityRequireActivity, this);
        RecyclerView recyclerView = this.f14085Z;
        if (recyclerView == null) {
            j.n("mSearchResultsRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f14092g0);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        O6.b bVar = new O6.b(contextRequireContext, 1);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.maya_divider_recycler_view);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        recyclerView.addItemDecoration(bVar);
        recyclerView.addOnScrollListener(new v(this, linearLayoutManager));
        u uVar = this.f14093h0;
        if (uVar == null) {
            j.n("mShopProviderProductsListSearchFragmentListener");
            throw null;
        }
        Bundle bundleW1 = ((MayaShopV2Activity) uVar).W1();
        this.f14090e0 = bundleW1.getInt("last_page_number", 1);
        if (bundleW1.containsKey("searched_product_list_items")) {
            this.f14097l0 = true;
            List parcelableArrayList = bundleW1.getParcelableArrayList("searched_product_list_items");
            if (parcelableArrayList == null) {
                parcelableArrayList = C1112C.f9377a;
            }
            G1().m(parcelableArrayList);
        }
        AppCompatEditText appCompatEditText = this.f14082W;
        if (appCompatEditText == null) {
            j.n("mSearchView");
            throw null;
        }
        appCompatEditText.setHint(getString(R.string.maya_shop_search_product_within_brand_hint));
        ImageView imageView = this.f14083X;
        if (imageView == null) {
            j.n("mClearSearchInputIcon");
            throw null;
        }
        final int i = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: cc.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopProviderProductsListSearchFragment f9354b;

            {
                this.f9354b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = this.f9354b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopProviderProductsListSearchFragment.I1(mayaShopProviderProductsListSearchFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment2 = this.f9354b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopProviderProductsListSearchFragment2.G1().l();
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f14089d0;
        if (button == null) {
            j.n("mButtonErrorRetry");
            throw null;
        }
        final int i4 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: cc.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopProviderProductsListSearchFragment f9354b;

            {
                this.f9354b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment = this.f9354b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopProviderProductsListSearchFragment.I1(mayaShopProviderProductsListSearchFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaShopProviderProductsListSearchFragment mayaShopProviderProductsListSearchFragment2 = this.f9354b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopProviderProductsListSearchFragment2.G1().l();
                            return;
                        } finally {
                        }
                }
            }
        });
        this.f14091f0 = false;
        AppCompatEditText appCompatEditText2 = this.f14082W;
        if (appCompatEditText2 == null) {
            j.n("mSearchView");
            throw null;
        }
        appCompatEditText2.requestFocus();
        AppCompatEditText appCompatEditText3 = this.f14082W;
        if (appCompatEditText3 == null) {
            j.n("mSearchView");
            throw null;
        }
        appCompatEditText3.postDelayed(new androidx.window.layout.adapter.extensions.a(this, 2), 200L);
        G1().j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.f14098n0;
    }
}
