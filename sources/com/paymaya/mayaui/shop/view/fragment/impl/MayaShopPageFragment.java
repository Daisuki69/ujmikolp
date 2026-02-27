package com.paymaya.mayaui.shop.view.fragment.impl;

import A5.b;
import D.C0187u;
import G5.o;
import J7.e;
import N5.C0447e;
import O5.a;
import Uh.d;
import We.s;
import Xb.h;
import a7.EnumC0650k;
import a7.InterfaceC0641b;
import a7.InterfaceC0643d;
import ac.w;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bc.c;
import bg.AbstractC0983W;
import cc.InterfaceC1096i;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.model.ShopProviderListItem;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class MayaShopPageFragment extends MayaBaseLoadingFragment implements c, InterfaceC0641b, InterfaceC0643d {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public C0187u f14011A0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0447e f14013o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RecyclerView f14014p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public LottieAnimationView f14015q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public h f14016r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public w f14017s0;
    public InterfaceC1096i t0;
    public boolean u0;
    public String w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Bundle f14019x0;
    public boolean y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f14020z0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f14018v0 = "home";

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final EnumC1215d f14012B0 = EnumC1215d.SHOP;

    @Override // ad.InterfaceC0684a
    public final void B0(HashMap map) {
        AbstractC0983W.u(this, map);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C0447e c0447eB = C0447e.b(layoutInflater, viewGroup);
        this.f14013o0 = c0447eB;
        SpringView springView = (SpringView) c0447eB.f4079b;
        j.f(springView, "getRoot(...)");
        return springView;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_shop_category_page_error, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_shop_category_page_loading, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final MayaCarousel P1() {
        C0447e c0447e = this.f14013o0;
        j.d(c0447e);
        MayaCarousel mayaCarouselShopBanner = (MayaCarousel) c0447e.e;
        j.f(mayaCarouselShopBanner, "mayaCarouselShopBanner");
        return mayaCarouselShopBanner;
    }

    public final h Q1() {
        h hVar = this.f14016r0;
        if (hVar != null) {
            return hVar;
        }
        j.n("mShopPageFragmentPresenter");
        throw null;
    }

    public final SpringView R1() {
        C0447e c0447e = this.f14013o0;
        j.d(c0447e);
        SpringView containerLayoutShopSwipeRefresh = (SpringView) c0447e.c;
        j.f(containerLayoutShopSwipeRefresh, "containerLayoutShopSwipeRefresh");
        return containerLayoutShopSwipeRefresh;
    }

    @Override // ad.InterfaceC0684a
    public final void c(int i, String str, String str2) {
        if (t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(1));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str3 = this.w0;
            if (str3 != null) {
                c1219hE.j.put("page", str3);
            }
            A1(c1219hE);
        } else {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.BANNER);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put(SessionDescription.ATTR_TYPE, s.f(i, "CT"));
            c1219hH.i();
            A1(c1219hH);
        }
        C0187u c0187u = this.f14011A0;
        if (c0187u == null) {
            j.n("mCleverTapAPI");
            throw null;
        }
        c0187u.m(str2);
        h hVarQ1 = Q1();
        if (str == null || str.length() == 0) {
            return;
        }
        if (C.Y(str)) {
            MayaShopPageFragment mayaShopPageFragment = (MayaShopPageFragment) ((c) hVarQ1.c.get());
            mayaShopPageFragment.getClass();
            InterfaceC1096i interfaceC1096i = mayaShopPageFragment.t0;
            if (interfaceC1096i != null) {
                ((MayaShopV2Activity) interfaceC1096i).Q0(str);
                return;
            }
            return;
        }
        MayaShopPageFragment mayaShopPageFragment2 = (MayaShopPageFragment) ((c) hVarQ1.c.get());
        mayaShopPageFragment2.getClass();
        InterfaceC1096i interfaceC1096i2 = mayaShopPageFragment2.t0;
        if (interfaceC1096i2 != null) {
            MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1096i2;
            mayaShopV2Activity.n1().k0(mayaShopV2Activity, str);
        }
    }

    @Override // a7.InterfaceC0641b
    public final void o0() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = (InterfaceC1096i) getActivity();
        a aVar = W4.a.e().z().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f14016r0 = new h(aVar.Q(), (d) aVar.f4748y.get(), 0);
        this.f14011A0 = (C0187u) aVar.f.get();
        Q1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Q1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14013o0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        ArrayList arrayList;
        Bundle bundle = this.f14019x0;
        if (bundle != null) {
            bundle.putBoolean("is_initially_loaded", this.u0);
        }
        Bundle bundle2 = this.f14019x0;
        if (bundle2 != null) {
            RecyclerView recyclerView = this.f14014p0;
            if (recyclerView == null) {
                j.n("mRecyclerViewItems");
                throw null;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            bundle2.putParcelable("layout_manager", layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
        Bundle bundle3 = this.f14019x0;
        if (bundle3 != null) {
            w wVar = this.f14017s0;
            if (wVar != null) {
                arrayList = new ArrayList();
                for (ShopProviderListItem shopProviderListItem : wVar.c) {
                    if (shopProviderListItem instanceof ShopProvider) {
                        arrayList.add(shopProviderListItem);
                    }
                }
            } else {
                arrayList = null;
            }
            bundle3.putParcelableArrayList("provider_list_items", new ArrayList<>(arrayList));
        }
        String string = requireArguments().getString("category_name");
        InterfaceC1096i interfaceC1096i = this.t0;
        Bundle bundleW1 = interfaceC1096i != null ? ((MayaShopV2Activity) interfaceC1096i).W1() : null;
        if (bundleW1 != null) {
            bundleW1.putString("shop_last_fragment", string);
        }
        if (bundleW1 != null) {
            bundleW1.putBundle(string, this.f14019x0);
        }
        InterfaceC1096i interfaceC1096i2 = this.t0;
        if (interfaceC1096i2 != null) {
            ((MayaShopV2Activity) interfaceC1096i2).m = bundleW1;
        }
        super.onPause();
        if (t1().e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.w(4));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str = this.f14020z0;
            if (str != null) {
                c1219hE.j.put("source_tab", str);
            }
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String str2 = this.w0;
            if (str2 != null) {
                c1219hE.j.put("category", str2);
            }
            o1().b(c1219hE);
        }
        P1().m();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String upperCase;
        super.onResume();
        MayaCarousel mayaCarouselP1 = P1();
        C0187u c0187u = mayaCarouselP1.f12035w;
        if (c0187u != null) {
            c0187u.q(mayaCarouselP1);
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(this.f14012B0);
        String str = this.w0;
        if (str != null) {
            Locale ROOT = Locale.ROOT;
            j.f(ROOT, "ROOT");
            upperCase = str.toUpperCase(ROOT);
            j.f(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        c1219hD.s(upperCase);
        c1219hD.n(2);
        c1220iO1.c(activity, c1219hD);
        P1().setVisibility(0);
        P1().k();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f14013o0;
        j.d(c0447e);
        this.f14014p0 = (RecyclerView) c0447e.f;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f14017s0 = new w(fragmentActivityRequireActivity, this);
        RecyclerView recyclerView = this.f14014p0;
        String upperCase = null;
        if (recyclerView == null) {
            j.n("mRecyclerViewItems");
            throw null;
        }
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        recyclerView.addItemDecoration(new o(contextRequireContext));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.f14017s0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("category_code");
            if (string == null) {
                string = "home";
            }
            this.f14018v0 = string;
            this.w0 = arguments.getString("category_name");
            this.f14020z0 = arguments.getString("category_source_tab");
            InterfaceC1096i interfaceC1096i = this.t0;
            if ((interfaceC1096i != null ? ((MayaShopV2Activity) interfaceC1096i).W1().getBundle(this.w0) : null) != null) {
                InterfaceC1096i interfaceC1096i2 = this.t0;
                bundle2 = interfaceC1096i2 != null ? ((MayaShopV2Activity) interfaceC1096i2).W1().getBundle(this.w0) : null;
            } else {
                bundle2 = new Bundle();
            }
            this.f14019x0 = bundle2;
            this.u0 = bundle2 != null && bundle2.getBoolean("is_initially_loaded", false);
            Q1().j();
        }
        R1().setHeader(new e());
        View viewFindViewById = R1().getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f14015q0 = (LottieAnimationView) viewFindViewById;
        R1().setListener(new Q6.s(this, 26));
        MayaCarousel mayaCarouselP1 = P1();
        int iV1 = v1() - getResources().getDimensionPixelSize(R.dimen.maya_margin_48);
        Resources resources = mayaCarouselP1.getResources();
        j.f(resources, "getResources(...)");
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.maya_shop_category_banner_card_width);
        Resources resources2 = mayaCarouselP1.getResources();
        j.f(resources2, "getResources(...)");
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.maya_shop_category_banner_card_height);
        mayaCarouselP1.h(dimensionPixelSize, dimensionPixelSize2, iV1);
        mayaCarouselP1.j(dimensionPixelSize, dimensionPixelSize2, iV1);
        mayaCarouselP1.setAdsCornerRadiusDimens(R.dimen.maya_radius_16dp);
        mayaCarouselP1.setDividerMode(EnumC0650k.f7026b);
        String str = this.f14012B0.f10786a;
        String str2 = this.w0;
        if (str2 != null) {
            upperCase = str2.toUpperCase(Locale.ROOT);
            j.f(upperCase, "toUpperCase(...)");
        }
        mayaCarouselP1.setFilterAdsByScreen(str + Global.UNDERSCORE + upperCase + Global.UNDERSCORE + AbstractC1173g.G(2));
        mayaCarouselP1.setHideCarouselTitle(true);
        mayaCarouselP1.setAutomaticScrolling(true);
        mayaCarouselP1.setEndlessScrolling(true);
        mayaCarouselP1.setCarouselListener(this);
        mayaCarouselP1.setCarouselStateListener(this);
        mayaCarouselP1.setShouldSetDisplayListener(false);
        mayaCarouselP1.setBannerPriorityFixEnabled(S5.c.b(q1(), b.f125o1));
        mayaCarouselP1.e();
        P1().setVisibility(0);
        P1().k();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return this.f14012B0;
    }
}
