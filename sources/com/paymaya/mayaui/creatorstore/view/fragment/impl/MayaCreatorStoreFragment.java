package com.paymaya.mayaui.creatorstore.view.fragment.impl;

import Ah.p;
import B5.m;
import D.C0187u;
import Kh.C0310o;
import Kh.T;
import Kh.z;
import Lh.d;
import Lh.h;
import M8.T2;
import N5.B;
import N5.C0435a;
import S5.c;
import a7.EnumC0650k;
import a7.InterfaceC0641b;
import a7.InterfaceC0643d;
import a7.ViewTreeObserverOnGlobalLayoutListenerC0635C;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import androidx.work.impl.e;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.database.repository.x;
import com.paymaya.data.database.repository.y;
import com.paymaya.domain.model.ClevertapAd;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.OnlinePaymentListItem;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1280q0;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.creatorstore.view.activity.impl.MayaCreatorStoreActivity;
import d4.AbstractC1331a;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.j;
import l7.a;
import l7.b;
import n3.C1916a;
import p7.InterfaceC2015a;
import ph.U2;
import s.AbstractC2217b;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCreatorStoreFragment extends MayaBaseLoadingFragment implements InterfaceC2015a, InterfaceC0641b, InterfaceC0643d {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public MayaCarousel f12109A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ViewTreeObserverOnGlobalLayoutListenerC0635C f12110B0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public SpringView f12111o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RecyclerView f12112p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public NestedScrollView f12113q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public LottieAnimationView f12114r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public C1219h f12115s0;
    public b t0;
    public m u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public C0187u f12116v0;
    public C0435a w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public q7.b f12117x0;
    public o7.b y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public GridLayoutManager f12118z0;

    @Override // ad.InterfaceC0684a
    public final void B0(HashMap map) {
        String str = (String) map.get("unitId");
        String str2 = (String) map.get("action");
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        String str3 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        String str4 = (String) map.get("banner_key");
        String str5 = (String) map.get("priority");
        String string = requireArguments().getString("online_payment_category");
        String str6 = (String) map.get("position");
        String str7 = (String) map.get("unitId");
        String str8 = (String) map.get("action");
        C1219h c1219hE = C1219h.e("CREATOR_STORE_" + EnumC1217f.BANNER_V2 + Global.UNDERSCORE + AbstractC1173g.G(17));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map2 = c1219hE.j;
        map2.put("position", str6);
        map2.put("key", str7);
        if (str3 != null) {
            str4 = str3;
        }
        map2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str4);
        map2.put(SessionDescription.ATTR_TYPE, "CT" + str6);
        map2.put(ImagesContract.URL, str8);
        map2.put("priority", str5);
        map2.put("category", string);
        c1219hE.i();
        c1220iO1.c(activity, c1219hE);
        C0187u c0187u = this.f12116v0;
        if (c0187u == null) {
            j.n("mCleverTapAPI");
            throw null;
        }
        c0187u.m(str);
        ((b) Q1()).l(str2);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_creator_store_fragment, viewGroup, false);
        int i = R.id.carousel;
        MayaCarousel mayaCarousel = (MayaCarousel) ViewBindings.findChildViewById(viewInflate, R.id.carousel);
        if (mayaCarousel != null) {
            i = R.id.container_recycler_view_maya_creator_store;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.container_recycler_view_maya_creator_store);
            if (recyclerView != null) {
                i = R.id.frame_container_carousel;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_container_carousel);
                if (frameLayout != null) {
                    SpringView springView = (SpringView) viewInflate;
                    i = R.id.view_group_empty_creator_store;
                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_group_empty_creator_store);
                    if (viewFindChildViewById != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) viewFindChildViewById;
                        int i4 = R.id.end_guide_creator_store;
                        if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.end_guide_creator_store)) != null) {
                            i4 = R.id.image_view_missed_target;
                            if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_missed_target)) != null) {
                                i4 = R.id.start_guide_creator_store;
                                if (((Guideline) ViewBindings.findChildViewById(viewFindChildViewById, R.id.start_guide_creator_store)) != null) {
                                    i4 = R.id.text_view_empty_store_title;
                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_empty_store_title)) != null) {
                                        i4 = R.id.text_view_fragment_online_payment_empty;
                                        if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_fragment_online_payment_empty)) != null) {
                                            this.w0 = new C0435a(springView, mayaCarousel, recyclerView, frameLayout, springView, new B(nestedScrollView, 0), 4);
                                            j.f(springView, "getRoot(...)");
                                            return springView;
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i4)));
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
    public final View I1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.maya_view_reusable_error_2, viewGroup, false);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_creator_store_view_loading, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final void P1() {
        GridLayoutManager gridLayoutManager;
        int i = 2;
        int i4 = 0;
        o7.b bVar = this.y0;
        if (bVar != null) {
            int iMax = Math.max(0, bVar.f18810b.size() - 1);
            if (bVar.getItemViewType(iMax) == OnlinePaymentListItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue() && (gridLayoutManager = this.f12118z0) != null && gridLayoutManager.findLastCompletelyVisibleItemPosition() == iMax) {
                b bVar2 = (b) Q1();
                if (bVar2.h || !bVar2.i) {
                    return;
                }
                bVar2.i = false;
                String str = bVar2.f18252g;
                C1280q0 c1280q0 = bVar2.f18251d;
                y yVar = c1280q0.e;
                int iB = yVar.b(str);
                int i6 = iB / 20;
                int i10 = i6 + 1;
                if (iB % 20 != 0) {
                    i10 = i6 + 2;
                }
                p<List<OnlinePayment>> featuredMerchants = c1280q0.c.getFeaturedMerchants(T2.u(i10, str));
                e eVar = new e(yVar, 24);
                featuredMerchants.getClass();
                d dVar = new d(featuredMerchants, eVar, i);
                Uh.d dVar2 = c1280q0.f;
                Objects.requireNonNull(dVar2);
                bVar2.e(new T(5, new h(new d(dVar, new e(dVar2, 23), i4), zh.b.a(), 0), new a(bVar2, i4)).e());
            }
        }
    }

    public final k7.a Q1() {
        b bVar = this.t0;
        if (bVar != null) {
            return bVar;
        }
        j.n("mMayaCreatorStoreFragmentPresenter");
        throw null;
    }

    public final RecyclerView R1() {
        RecyclerView recyclerView = this.f12112p0;
        if (recyclerView != null) {
            return recyclerView;
        }
        j.n("mRecyclerViewPartners");
        throw null;
    }

    public final void S1() {
        MayaCarousel mayaCarousel = this.f12109A0;
        if (mayaCarousel == null || !mayaCarousel.f12022o0) {
            return;
        }
        mayaCarousel.setVisibility(8);
    }

    public final void T1() {
        SpringView springView = this.f12111o0;
        if (springView == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView.i();
        LottieAnimationView lottieAnimationView = this.f12114r0;
        if (lottieAnimationView == null) {
            j.n("mLottieView");
            throw null;
        }
        lottieAnimationView.a();
        LottieAnimationView lottieAnimationView2 = this.f12114r0;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setProgress(0.0f);
        } else {
            j.n("mLottieView");
            throw null;
        }
    }

    public final void U1(OnlinePayment onlinePayment) {
        if (onlinePayment != null) {
            C1219h c1219h = this.f12115s0;
            if (c1219h == null) {
                j.n("analyticsEvent");
                throw null;
            }
            c1219h.n(17);
            c1219h.t(EnumC1217f.MERCHANT);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("merchant", onlinePayment.mName());
            c1219h.i();
            z1(c1219h);
            ((b) Q1()).m(onlinePayment);
        }
    }

    @Override // ad.InterfaceC0684a
    public final void c(int i, String str, String str2) {
        C0187u c0187u = this.f12116v0;
        if (c0187u == null) {
            j.n("mCleverTapAPI");
            throw null;
        }
        c0187u.m(str2);
        ((b) Q1()).l(str);
    }

    @Override // a7.InterfaceC0641b
    public final void o0() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.f12115s0 = new C1219h();
        O5.a aVar = W4.a.e().j().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C1280q0 c1280q0F = aVar.F();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(sessionSubject, "sessionSubject");
        this.t0 = new b(c1280q0F, preference, flagConfigurationService, sessionSubject);
        this.u0 = (m) aVar.f4718h0.get();
        this.f12116v0 = (C0187u) aVar.f.get();
        this.f12117x0 = (q7.b) getActivity();
        ((AbstractC2509a) Q1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        m mVar = this.u0;
        if (mVar == null) {
            j.n("mSuspendSessionController");
            throw null;
        }
        mVar.a();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.w0 = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        MayaCarousel mayaCarousel;
        super.onPause();
        if (!c.b(q1(), A5.b.f128q) || (mayaCarousel = this.f12109A0) == null) {
            return;
        }
        mayaCarousel.m();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        q7.b bVar = this.f12117x0;
        if (bVar != null) {
            ((MayaCreatorStoreActivity) bVar).L1(1.0f);
        }
        if (c.b(q1(), A5.b.f128q)) {
            String string = requireArguments().getString("online_payment_category");
            boolean zB = c.b(q1(), A5.b.f130r);
            EnumC1215d enumC1215d = EnumC1215d.CREATOR_STORE;
            if (zB) {
                C1220i c1220iO1 = o1();
                C1219h c1219hD = C1219h.d(enumC1215d);
                c1219hD.r(EnumC1216e.BANNER_V2);
                c1219hD.n(2);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hD.j.put("category", string);
                c1220iO1.b(c1219hD);
            } else {
                C1220i c1220iO12 = o1();
                C1219h c1219hD2 = C1219h.d(enumC1215d);
                c1219hD2.r(EnumC1216e.BANNER);
                c1219hD2.n(2);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hD2.j.put("category", string);
                c1220iO12.b(c1219hD2);
            }
            ((b) Q1()).n();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MayaCreatorStoreFragment mayaCreatorStoreFragment;
        MayaCarousel mayaCarousel;
        int i = 17;
        int i4 = 2;
        int i6 = 1;
        int i10 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0435a c0435a = this.w0;
        j.d(c0435a);
        SpringView springView = (SpringView) c0435a.f;
        j.g(springView, "<set-?>");
        this.f12111o0 = springView;
        C0435a c0435a2 = this.w0;
        j.d(c0435a2);
        this.f12112p0 = (RecyclerView) c0435a2.f4048d;
        C0435a c0435a3 = this.w0;
        j.d(c0435a3);
        this.f12113q0 = (NestedScrollView) ((B) c0435a3.f4049g).f3550b;
        C0435a c0435a4 = this.w0;
        j.d(c0435a4);
        this.f12109A0 = (MayaCarousel) c0435a4.c;
        String string = requireArguments().getString("online_payment_category");
        this.y0 = new o7.b(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        this.f12118z0 = gridLayoutManager;
        gridLayoutManager.setSpanSizeLookup(new q7.c(this));
        R1().setLayoutManager(this.f12118z0);
        R1().setAdapter(this.y0);
        R1().addOnScrollListener(new q7.d(this));
        SpringView springView2 = this.f12111o0;
        if (springView2 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView2.setHeader(new J7.e());
        SpringView springView3 = this.f12111o0;
        if (springView3 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        View viewFindViewById = springView3.getHeaderView().findViewById(R.id.lottie_view);
        j.e(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
        this.f12114r0 = (LottieAnimationView) viewFindViewById;
        SpringView springView4 = this.f12111o0;
        if (springView4 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        springView4.setListener(new p8.a(this, 3));
        k7.a aVarQ1 = Q1();
        if (string == null) {
            string = "";
        }
        b bVar = (b) aVarQ1;
        bVar.f18252g = string;
        if (string.equals("globalstocks")) {
            MayaCreatorStoreFragment mayaCreatorStoreFragment2 = (MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get());
            C1219h c1219h = mayaCreatorStoreFragment2.f12115s0;
            if (c1219h == null) {
                j.n("analyticsEvent");
                throw null;
            }
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put(SessionDescription.ATTR_TYPE, "global");
            mayaCreatorStoreFragment2.m1().j.put(SessionDescription.ATTR_TYPE, "global");
        } else if (string.equals("stocks")) {
            MayaCreatorStoreFragment mayaCreatorStoreFragment3 = (MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get());
            C1219h c1219h2 = mayaCreatorStoreFragment3.f12115s0;
            if (c1219h2 == null) {
                j.n("analyticsEvent");
                throw null;
            }
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219h2.j.put(SessionDescription.ATTR_TYPE, ImagesContract.LOCAL);
            mayaCreatorStoreFragment3.m1().j.put(SessionDescription.ATTR_TYPE, ImagesContract.LOCAL);
        }
        if (c.b(bVar.f, A5.b.f128q) && (mayaCarousel = (mayaCreatorStoreFragment = (MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get())).f12109A0) != null) {
            int i11 = MayaCarousel.f11992x0;
            Resources resources = mayaCarousel.getResources();
            j.f(resources, "getResources(...)");
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.maya_carousel_v4_item_width);
            Resources resources2 = mayaCarousel.getResources();
            j.f(resources2, "getResources(...)");
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.maya_carousel_v4_item_height);
            mayaCarousel.h(dimensionPixelSize, dimensionPixelSize2, 0);
            mayaCarousel.j(dimensionPixelSize, dimensionPixelSize2, 0);
            mayaCarousel.setAdsCornerRadiusDimens(R.dimen.maya_radius_16dp);
            mayaCarousel.setDividerSizeInPx(mayaCreatorStoreFragment.getResources().getDimensionPixelSize(R.dimen.maya_margin_12));
            mayaCarousel.setDividerMode(EnumC0650k.f7026b);
            mayaCarousel.setCarouselListener(mayaCreatorStoreFragment);
            mayaCarousel.setCarouselStateListener(mayaCreatorStoreFragment);
            mayaCarousel.setClevertapAdTextStyle(ClevertapAd.TextStyle.V4_WITH_TEXT_BANNER);
            mayaCarousel.setAutomaticScrolling(true);
            mayaCarousel.setEndlessScrolling(true);
            mayaCarousel.setIndicatorEnabled(true);
            mayaCarousel.setHideCarouselTitle(true);
            mayaCarousel.setImageRatio(0.696875d);
            mayaCarousel.setBannerPriorityFixEnabled(c.b(mayaCreatorStoreFragment.q1(), A5.b.f125o1));
            if (c.b(mayaCreatorStoreFragment.q1(), A5.b.f130r)) {
                mayaCarousel.setIndicatorEnabled(false);
                mayaCarousel.setDefaultImagePlaceholder(2131231031);
                mayaCarousel.setFilterAdsByScreen(AbstractC1233w.m);
            } else {
                mayaCarousel.setFilterAdsByScreen(AbstractC1233w.f11238l);
            }
            OneShotPreDrawListener.add(mayaCarousel, new U2(mayaCarousel, mayaCreatorStoreFragment));
        }
        C1280q0 c1280q0 = bVar.f18251d;
        String str = bVar.f18252g;
        c1280q0.getClass();
        M5.a aVar = new M5.a(2);
        aVar.f3080b = str;
        y yVar = c1280q0.e;
        Kh.B bE = new z(yVar.f11328a.d("online_payment", aVar), new x(yVar, i10), 0).e(zh.b.a());
        A0 a02 = new A0(bVar, i);
        C1916a c1916a = Eh.d.c;
        mg.c cVar = Eh.d.f1365b;
        bVar.e(new C0310o(bE, a02, c1916a, cVar).f());
        bVar.e(new C0310o(bVar.f18251d.f.e(zh.b.a()), new C1258f0(bVar, 18), c1916a, cVar).f());
        bVar.k();
        String dataString = ((MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get())).requireActivity().getIntent().getDataString();
        String str2 = dataString != null ? dataString : "";
        int iW = C.w(str2);
        if (iW == 0) {
            return;
        }
        int iC = AbstractC2217b.c(iW);
        if (iC != 65 && iC != 97) {
            switch (iC) {
                case 28:
                case 29:
                case 30:
                    break;
                default:
                    switch (iC) {
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                            break;
                        default:
                            return;
                    }
                    break;
            }
        }
        String strL = C.L(str2, "partner");
        if (strL != null) {
            ((MayaBaseFragment) ((InterfaceC2015a) bVar.c.get())).E1();
            p<OnlinePayment> merchant = bVar.f18251d.c.getMerchant(strL);
            bVar.e(new T(5, new d(new d(AbstractC1331a.l(merchant, merchant, zh.b.a()), new M(bVar, i), i4), new com.google.firebase.messaging.p(bVar, 20), i10), new a(bVar, i6)).e());
        }
        MayaCreatorStoreFragment mayaCreatorStoreFragment4 = (MayaCreatorStoreFragment) ((InterfaceC2015a) bVar.c.get());
        mayaCreatorStoreFragment4.getClass();
        C1219h c1219hM1 = mayaCreatorStoreFragment4.m1();
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hM1.j.put("from_deep_link", "true");
        mayaCreatorStoreFragment4.requireActivity().getIntent().setData(null);
    }
}
