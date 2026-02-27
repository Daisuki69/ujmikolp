package com.paymaya.mayaui.travel.view.fragment.impl;

import B5.i;
import D7.c;
import G5.r;
import G5.t;
import N5.C0491z;
import N5.G0;
import O5.a;
import Uh.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.store.C1280q0;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import fa.ViewOnClickListenerC1479a;
import fc.InterfaceC1481a;
import gc.C1516a;
import ic.C1597a;
import jc.b;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import y5.AbstractC2509a;
import y5.s;

/* JADX INFO: loaded from: classes4.dex */
public class MayaTravelHomeFragment extends MayaBaseFragment implements b, D7.b, t {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0491z f14191U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public RecyclerView f14192V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public AppCompatTextView f14193W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public RecyclerView f14194X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Group f14195Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public G0 f14196Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public HtmlTextView f14197a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C1516a f14198b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public kc.b f14199c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public c f14200d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C1597a f14201e0;

    public final InterfaceC1481a G1() {
        C1516a c1516a = this.f14198b0;
        if (c1516a != null) {
            return c1516a;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    @Override // D7.b
    public final void M(SecondaryFeature secondaryFeature, int i) {
        C1516a c1516a = (C1516a) G1();
        String strMId = secondaryFeature.mId();
        if (strMId != null) {
            int iHashCode = strMId.hashCode();
            if (iHashCode == -991978376) {
                if (strMId.equals("airfare")) {
                    kc.b bVar = ((MayaTravelHomeFragment) ((b) c1516a.c.get())).f14199c0;
                    if (bVar != null) {
                        MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) bVar;
                        mayaTravelActivity.n1();
                        i.k(mayaTravelActivity, "paymaya://paybills?category=airfare");
                    }
                    s sVar = (b) c1516a.c.get();
                    C1219h c1219hH = AbstractC2329d.h(17);
                    c1219hH.t(EnumC1217f.AIRFARE);
                    ((MayaBaseFragment) sVar).A1(c1219hH);
                    return;
                }
                return;
            }
            if (iHashCode == -178678409) {
                if (strMId.equals("p2p_train")) {
                    kc.b bVar2 = ((MayaTravelHomeFragment) ((b) c1516a.c.get())).f14199c0;
                    if (bVar2 != null) {
                        MayaTravelActivity mayaTravelActivity2 = (MayaTravelActivity) bVar2;
                        mayaTravelActivity2.n1();
                        i.H(mayaTravelActivity2, "Beep");
                    }
                    s sVar2 = (b) c1516a.c.get();
                    C1219h c1219hH2 = AbstractC2329d.h(17);
                    c1219hH2.t(EnumC1217f.TRAIN);
                    ((MayaBaseFragment) sVar2).A1(c1219hH2);
                    return;
                }
                return;
            }
            if (iHashCode == 3565883 && strMId.equals("toll")) {
                kc.b bVar3 = ((MayaTravelHomeFragment) ((b) c1516a.c.get())).f14199c0;
                if (bVar3 != null) {
                    MayaTravelActivity mayaTravelActivity3 = (MayaTravelActivity) bVar3;
                    mayaTravelActivity3.n1();
                    i.k(mayaTravelActivity3, "paymaya://paybills?category=toll");
                }
                s sVar3 = (b) c1516a.c.get();
                C1219h c1219hH3 = AbstractC2329d.h(17);
                c1219hH3.t(EnumC1217f.TOLL);
                ((MayaBaseFragment) sVar3).A1(c1219hH3);
            }
        }
    }

    @Override // G5.t
    public final void m(String str, View view) {
        kc.b bVar = this.f14199c0;
        if (bVar != null) {
            MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) bVar;
            mayaTravelActivity.n1().w(mayaTravelActivity, "https://www.paymaya.com/partner-merchants/travel");
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f14199c0 = (kc.b) getActivity();
        a aVar = W4.a.e().A().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1280q0 c1280q0F = aVar.F();
        d sessionPublishSubject = (d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f14198b0 = new C1516a(preference, c1280q0F, sessionPublishSubject);
        ((AbstractC2509a) G1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_travel_home, viewGroup, false);
        int i = R.id.barrier_cta;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_cta)) != null) {
            i = R.id.barrier_featured_partners;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_featured_partners)) != null) {
                i = R.id.card_view_beep_card_banner;
                if (((CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_beep_card_banner)) != null) {
                    i = R.id.constraint_layout_travel_information_container;
                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout_travel_information_container)) != null) {
                        i = R.id.group_feature_partners;
                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_feature_partners);
                        if (group != null) {
                            i = R.id.image_view_banner_logo;
                            if (((AppCompatImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_banner_logo)) != null) {
                                i = R.id.image_view_cta_arrow;
                                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_cta_arrow)) != null) {
                                    i = R.id.recycler_view_featured_partners;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_featured_partners);
                                    if (recyclerView != null) {
                                        i = R.id.recycler_view_travel_services;
                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_travel_services);
                                        if (recyclerView2 != null) {
                                            i = R.id.text_view_banner_subtitle;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_banner_subtitle)) != null) {
                                                i = R.id.text_view_banner_title;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_banner_title)) != null) {
                                                    i = R.id.text_view_cta;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_cta);
                                                    if (appCompatTextView != null) {
                                                        i = R.id.text_view_title_cashless_travel;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_cashless_travel)) != null) {
                                                            i = R.id.text_view_title_featured_partners;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_featured_partners)) != null) {
                                                                i = R.id.text_view_travel_information_1;
                                                                HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_travel_information_1);
                                                                if (htmlTextView != null) {
                                                                    i = R.id.text_view_travel_information_icon;
                                                                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_travel_information_icon)) != null) {
                                                                        i = R.id.view_featured_partners_loading;
                                                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_featured_partners_loading);
                                                                        if (viewFindChildViewById != null) {
                                                                            int i4 = R.id.lottie_animation_travel_featured_partner_1_loading;
                                                                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_travel_featured_partner_1_loading)) != null) {
                                                                                i4 = R.id.lottie_animation_travel_featured_partner_1_logo_loading;
                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_travel_featured_partner_1_logo_loading);
                                                                                if (viewFindChildViewById2 != null) {
                                                                                    i4 = R.id.lottie_animation_travel_featured_partner_2_loading;
                                                                                    if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_travel_featured_partner_2_loading)) != null) {
                                                                                        i4 = R.id.lottie_animation_travel_featured_partner_2_logo_loading;
                                                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_travel_featured_partner_2_logo_loading);
                                                                                        if (viewFindChildViewById3 != null) {
                                                                                            i4 = R.id.lottie_animation_travel_featured_partner_3_loading;
                                                                                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_travel_featured_partner_3_loading)) != null) {
                                                                                                i4 = R.id.lottie_animation_travel_featured_partner_3_logo_loading;
                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_travel_featured_partner_3_logo_loading);
                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                    i4 = R.id.lottie_animation_travel_featured_partners_label_loading;
                                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_animation_travel_featured_partners_label_loading);
                                                                                                    if (viewFindChildViewById5 != null) {
                                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                                                        this.f14191U = new C0491z(nestedScrollView, group, recyclerView, recyclerView2, appCompatTextView, htmlTextView, new G0((ConstraintLayout) viewFindChildViewById, 12));
                                                                                                        return nestedScrollView;
                                                                                                    }
                                                                                                }
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

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) G1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f14191U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        kc.b bVar = this.f14199c0;
        if (bVar != null) {
            ((MayaTravelActivity) bVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f14191U;
        j.d(c0491z);
        this.f14192V = (RecyclerView) c0491z.c;
        C0491z c0491z2 = this.f14191U;
        j.d(c0491z2);
        this.f14193W = (AppCompatTextView) c0491z2.e;
        C0491z c0491z3 = this.f14191U;
        j.d(c0491z3);
        this.f14194X = (RecyclerView) c0491z3.f;
        C0491z c0491z4 = this.f14191U;
        j.d(c0491z4);
        this.f14195Y = (Group) c0491z4.f4303b;
        C0491z c0491z5 = this.f14191U;
        j.d(c0491z5);
        this.f14196Z = (G0) c0491z5.h;
        C0491z c0491z6 = this.f14191U;
        j.d(c0491z6);
        this.f14197a0 = (HtmlTextView) c0491z6.f4304d;
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        A1(c1219h);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 4);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        c cVar = new c(contextRequireContext, this);
        this.f14200d0 = cVar;
        RecyclerView recyclerView = this.f14192V;
        if (recyclerView == null) {
            j.n("mRecyclerViewTravelServices");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        RecyclerView recyclerView2 = this.f14192V;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewTravelServices");
            throw null;
        }
        recyclerView2.setLayoutManager(gridLayoutManager);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.maya_margin_large);
        RecyclerView recyclerView3 = this.f14192V;
        if (recyclerView3 == null) {
            j.n("mRecyclerViewTravelServices");
            throw null;
        }
        recyclerView3.addItemDecoration(new O6.a(dimensionPixelSize, 0));
        RecyclerView recyclerView4 = this.f14194X;
        if (recyclerView4 == null) {
            j.n("mRecyclerViewFeaturedPartners");
            throw null;
        }
        recyclerView4.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.maya_padding_large);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.maya_padding_normal);
        RecyclerView recyclerView5 = this.f14194X;
        if (recyclerView5 == null) {
            j.n("mRecyclerViewFeaturedPartners");
            throw null;
        }
        recyclerView5.addItemDecoration(new r(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize2));
        C1597a c1597a = new C1597a(this);
        this.f14201e0 = c1597a;
        RecyclerView recyclerView6 = this.f14194X;
        if (recyclerView6 == null) {
            j.n("mRecyclerViewFeaturedPartners");
            throw null;
        }
        recyclerView6.setAdapter(c1597a);
        ((C1516a) G1()).j();
        AppCompatTextView appCompatTextView = this.f14193W;
        if (appCompatTextView == null) {
            j.n("mTextViewBeepQRTicketCTA");
            throw null;
        }
        appCompatTextView.setOnClickListener(new ViewOnClickListenerC1479a(this, 13));
        HtmlTextView htmlTextView = this.f14197a0;
        if (htmlTextView != null) {
            htmlTextView.setOnLinkClickListener(this);
        } else {
            j.n("mTextViewLearnMore");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.TRAVEL;
    }
}
