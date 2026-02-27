package com.paymaya.mayaui.shop.view.fragment.impl;

import Dh.c;
import Gh.f;
import Kh.B;
import Kh.C0301f;
import Kh.C0307l;
import N5.F;
import N5.F0;
import N5.G0;
import O5.a;
import O6.b;
import Q6.r;
import Uh.d;
import Xb.w;
import ac.InterfaceC0675D;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.e;
import bc.o;
import cc.I;
import cc.J;
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
import com.paymaya.mayaui.load.view.activity.impl.MayaLoadActivity;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopSearchFragment extends MayaBaseFragment implements o, InterfaceC0675D {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public F f14156U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public AppCompatEditText f14157V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ImageView f14158W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public NestedScrollView f14159X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public RecyclerView f14160Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Group f14161Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Group f14162a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public F0 f14163b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Button f14164c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ConstraintLayout f14165d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public w f14166e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ac.F f14167f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public I f14168g0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f14171j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f14172k0;
    public String m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f14174n0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final c f14169h0 = new c(1);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f14170i0 = 1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f14173l0 = "";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final EnumC1215d f14175o0 = EnumC1215d.SHOP_SEARCH;

    public static final void I1(MayaShopSearchFragment mayaShopSearchFragment) {
        mayaShopSearchFragment.f14173l0 = "";
        AppCompatEditText appCompatEditText = mayaShopSearchFragment.f14157V;
        if (appCompatEditText == null) {
            j.n("mSearchView");
            throw null;
        }
        appCompatEditText.setText("");
        Group group = mayaShopSearchFragment.f14161Z;
        if (group == null) {
            j.n("mLoadingGroup");
            throw null;
        }
        group.setVisibility(8);
        NestedScrollView nestedScrollView = mayaShopSearchFragment.f14159X;
        if (nestedScrollView == null) {
            j.n("mSearchResultsScrollView");
            throw null;
        }
        nestedScrollView.setVisibility(8);
        Group group2 = mayaShopSearchFragment.f14162a0;
        if (group2 == null) {
            j.n("mNoSearchResultsGroup");
            throw null;
        }
        group2.setVisibility(8);
        F0 f02 = mayaShopSearchFragment.f14163b0;
        if (f02 != null) {
            f02.f3618b.setVisibility(8);
        } else {
            j.n("mErrorView");
            throw null;
        }
    }

    public static final void J1(MayaShopSearchFragment mayaShopSearchFragment) {
        I i;
        w wVarG1 = mayaShopSearchFragment.G1();
        if (wVarG1.f.e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(11));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", "Airtime Banner");
            c1219hE.j.put("page", "Search");
            ((MayaBaseFragment) ((o) wVarG1.c.get())).z1(c1219hE);
        }
        w wVarG12 = mayaShopSearchFragment.G1();
        if (!wVarG12.f.e().isLoadV2Enabled() || (i = ((MayaShopSearchFragment) ((o) wVarG12.c.get())).f14168g0) == null) {
            return;
        }
        MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) i;
        mayaShopV2Activity.n1();
        Intent intent = new Intent(mayaShopV2Activity, (Class<?>) MayaLoadActivity.class);
        intent.putExtra("sub_route", "");
        intent.setData(mayaShopV2Activity.getIntent().getData());
        mayaShopV2Activity.startActivity(intent);
    }

    public final w G1() {
        w wVar = this.f14166e0;
        if (wVar != null) {
            return wVar;
        }
        j.n("mShopSearchFragmentPresenter");
        throw null;
    }

    public final void H1() {
        ac.F f;
        ac.F f3 = this.f14167f0;
        Boolean boolValueOf = f3 != null ? Boolean.valueOf(f3.f7087d) : null;
        j.d(boolValueOf);
        if (boolValueOf.booleanValue() && (f = this.f14167f0) != null) {
            f.f(false);
        }
    }

    public final void K1() {
        Group group = this.f14161Z;
        if (group == null) {
            j.n("mLoadingGroup");
            throw null;
        }
        group.setVisibility(0);
        NestedScrollView nestedScrollView = this.f14159X;
        if (nestedScrollView == null) {
            j.n("mSearchResultsScrollView");
            throw null;
        }
        nestedScrollView.setVisibility(8);
        Group group2 = this.f14162a0;
        if (group2 == null) {
            j.n("mNoSearchResultsGroup");
            throw null;
        }
        group2.setVisibility(8);
        F0 f02 = this.f14163b0;
        if (f02 != null) {
            f02.f3618b.setVisibility(8);
        } else {
            j.n("mErrorView");
            throw null;
        }
    }

    public final void L1() {
        Group group = this.f14161Z;
        if (group == null) {
            j.n("mLoadingGroup");
            throw null;
        }
        group.setVisibility(8);
        NestedScrollView nestedScrollView = this.f14159X;
        if (nestedScrollView == null) {
            j.n("mSearchResultsScrollView");
            throw null;
        }
        nestedScrollView.setVisibility(0);
        Group group2 = this.f14162a0;
        if (group2 == null) {
            j.n("mNoSearchResultsGroup");
            throw null;
        }
        group2.setVisibility(8);
        F0 f02 = this.f14163b0;
        if (f02 != null) {
            f02.f3618b.setVisibility(8);
        } else {
            j.n("mErrorView");
            throw null;
        }
    }

    @Override // ac.InterfaceC0675D
    public final void d1(int i, ProductV3 productV3) {
        String productCode;
        Amount amountOriginal;
        w wVarG1 = G1();
        EnumC1215d enumC1215d = EnumC1215d.SHOP;
        if (productV3 != null && productV3.isDisabled()) {
            MayaShopSearchFragment mayaShopSearchFragment = (MayaShopSearchFragment) ((o) wVarG1.c.get());
            C1220i c1220iO1 = mayaShopSearchFragment.o1();
            FragmentActivity activity = mayaShopSearchFragment.getActivity();
            C1219h c1219hD = C1219h.d(enumC1215d);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PRODUCT_DISABLED);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String productCode2 = productV3.getProductCode();
            HashMap map = c1219hD.j;
            map.put("product", productCode2);
            map.put("location", "search");
            c1220iO1.c(activity, c1219hD);
            return;
        }
        MayaShopSearchFragment mayaShopSearchFragment2 = (MayaShopSearchFragment) ((o) wVarG1.c.get());
        if (mayaShopSearchFragment2.t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(12));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map2 = c1219hE.j;
            map2.put("source_page", "Global");
            map2.put("section", "Search");
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            String productCode3 = productV3 != null ? productV3.getProductCode() : null;
            if (productCode3 != null) {
                c1219hE.j.put("product_code", productCode3);
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
            productCode = productV3 != null ? Boolean.valueOf(productV3.isPromo()).toString() : null;
            if (productCode != null) {
                c1219hE.j.put("promo", productCode);
            }
            mayaShopSearchFragment2.o1().b(c1219hE);
        } else {
            C1220i c1220iO12 = mayaShopSearchFragment2.o1();
            FragmentActivity activity2 = mayaShopSearchFragment2.getActivity();
            C1219h c1219hD2 = C1219h.d(enumC1215d);
            c1219hD2.n(17);
            c1219hD2.t(EnumC1217f.PRODUCT);
            EnumC1212a enumC1212a8 = EnumC1212a.ACCOUNT_NUMBER;
            productCode = productV3 != null ? productV3.getProductCode() : null;
            HashMap map3 = c1219hD2.j;
            map3.put("product", productCode);
            map3.put("location", "search");
            map3.put("position", String.valueOf(i + 1));
            c1220iO12.c(activity2, c1219hD2);
        }
        C.R(mayaShopSearchFragment2.getActivity());
        I i4 = mayaShopSearchFragment2.f14168g0;
        if (i4 != null) {
            ((MayaShopV2Activity) i4).b2(productV3);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f14168g0 = (I) getActivity();
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f14166e0 = new w(aVar.I(), (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4748y.get(), 1);
        G1().h(this);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f14167f0 = new ac.F(contextRequireContext, this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.m0 = arguments.getString("shop_search_query");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        F fB = F.b(inflater, viewGroup);
        this.f14156U = fB;
        ConstraintLayout constraintLayout = (ConstraintLayout) fB.f3614b;
        j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14169h0.dispose();
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        I i = this.f14168g0;
        ArrayList arrayList = null;
        Bundle bundleW1 = i != null ? ((MayaShopV2Activity) i).W1() : null;
        if (bundleW1 != null) {
            bundleW1.putInt("last_page_number", this.f14170i0);
        }
        if (bundleW1 != null) {
            ac.F f = this.f14167f0;
            if (f != null) {
                ArrayList arrayList2 = f.f7086b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (obj instanceof ProductV3) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = arrayList3;
            }
            bundleW1.putParcelableArrayList("searched_product_list_items", new ArrayList<>(arrayList));
        }
        I i4 = this.f14168g0;
        if (i4 != null) {
            ((MayaShopV2Activity) i4).m = bundleW1;
        }
        if (t1().e().isShopEventsV2Enabled()) {
            o1().b(C1219h.e(AbstractC1213b.w(16)));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        I i = this.f14168g0;
        j.d(i);
        ((MayaShopV2Activity) i).Q(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F f = this.f14156U;
        j.d(f);
        this.f14157V = (AppCompatEditText) f.h;
        F f3 = this.f14156U;
        j.d(f3);
        this.f14158W = (ImageView) f3.f3615d;
        F f7 = this.f14156U;
        j.d(f7);
        this.f14159X = (NestedScrollView) f7.f3616g;
        F f10 = this.f14156U;
        j.d(f10);
        this.f14160Y = (RecyclerView) f10.f;
        F f11 = this.f14156U;
        j.d(f11);
        this.f14161Z = (Group) f11.c;
        F f12 = this.f14156U;
        j.d(f12);
        this.f14162a0 = (Group) f12.e;
        F f13 = this.f14156U;
        j.d(f13);
        F0 f02 = (F0) f13.i;
        this.f14163b0 = f02;
        this.f14164c0 = f02.c;
        F f14 = this.f14156U;
        j.d(f14);
        this.f14165d0 = ((G0) f14.j).f3627b;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        this.f14167f0 = new ac.F(contextRequireContext, this);
        RecyclerView recyclerView = this.f14160Y;
        if (recyclerView == null) {
            j.n("mSearchResultsRecyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f14167f0);
        Context contextRequireContext2 = requireContext();
        j.f(contextRequireContext2, "requireContext(...)");
        b bVar = new b(contextRequireContext2, 1);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.maya_divider_recycler_view);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        recyclerView.addItemDecoration(bVar);
        RecyclerView recyclerView2 = this.f14160Y;
        if (recyclerView2 == null) {
            j.n("mSearchResultsRecyclerView");
            throw null;
        }
        recyclerView2.addOnScrollListener(new J(this, linearLayoutManager));
        C0301f c0301f = new C0301f(new e(this, 11), 0);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        B bE = new C0307l(c0301f.b(500L), 0).e(zh.b.a());
        f fVar = new f(new r(this, 27), Eh.d.f1366d);
        bE.g(fVar);
        String str = this.m0;
        if (str != null) {
            this.f14173l0 = str;
            AppCompatEditText appCompatEditText = this.f14157V;
            if (appCompatEditText == null) {
                j.n("mSearchView");
                throw null;
            }
            appCompatEditText.setText(str);
            G1().l();
            this.m0 = null;
        }
        this.f14169h0.a(fVar);
        I i = this.f14168g0;
        if (i != null) {
            Bundle bundleW1 = ((MayaShopV2Activity) i).W1();
            this.f14170i0 = bundleW1.getInt("last_page_number", 1);
            if (bundleW1.containsKey("searched_product_list_items")) {
                this.f14174n0 = true;
                List parcelableArrayList = bundleW1.getParcelableArrayList("searched_product_list_items");
                if (parcelableArrayList == null) {
                    parcelableArrayList = C1112C.f9377a;
                }
                G1().m(parcelableArrayList);
            }
        }
        ImageView imageView = this.f14158W;
        if (imageView == null) {
            j.n("mClearSearchInputIcon");
            throw null;
        }
        final int i4 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: cc.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopSearchFragment f9330b;

            {
                this.f9330b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaShopSearchFragment mayaShopSearchFragment = this.f9330b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopSearchFragment.I1(mayaShopSearchFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaShopSearchFragment mayaShopSearchFragment2 = this.f9330b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopSearchFragment2.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaShopSearchFragment mayaShopSearchFragment3 = this.f9330b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopSearchFragment.J1(mayaShopSearchFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button = this.f14164c0;
        if (button == null) {
            j.n("mButtonErrorRetry");
            throw null;
        }
        final int i6 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: cc.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopSearchFragment f9330b;

            {
                this.f9330b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        MayaShopSearchFragment mayaShopSearchFragment = this.f9330b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopSearchFragment.I1(mayaShopSearchFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaShopSearchFragment mayaShopSearchFragment2 = this.f9330b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopSearchFragment2.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaShopSearchFragment mayaShopSearchFragment3 = this.f9330b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopSearchFragment.J1(mayaShopSearchFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        ConstraintLayout constraintLayout = this.f14165d0;
        if (constraintLayout == null) {
            j.n("mViewLoadV2Banner");
            throw null;
        }
        final int i10 = 2;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: cc.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaShopSearchFragment f9330b;

            {
                this.f9330b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        MayaShopSearchFragment mayaShopSearchFragment = this.f9330b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopSearchFragment.I1(mayaShopSearchFragment);
                            return;
                        } finally {
                        }
                    case 1:
                        MayaShopSearchFragment mayaShopSearchFragment2 = this.f9330b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaShopSearchFragment2.G1().l();
                            return;
                        } finally {
                        }
                    default:
                        MayaShopSearchFragment mayaShopSearchFragment3 = this.f9330b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaShopSearchFragment.J1(mayaShopSearchFragment3);
                            return;
                        } finally {
                        }
                }
            }
        });
        this.f14171j0 = false;
        AppCompatEditText appCompatEditText2 = this.f14157V;
        if (appCompatEditText2 == null) {
            j.n("mSearchView");
            throw null;
        }
        appCompatEditText2.requestFocus();
        AppCompatEditText appCompatEditText3 = this.f14157V;
        if (appCompatEditText3 == null) {
            j.n("mSearchView");
            throw null;
        }
        appCompatEditText3.postDelayed(new androidx.window.layout.adapter.extensions.a(this, 5), 200L);
        G1().j();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.f14175o0;
    }
}
