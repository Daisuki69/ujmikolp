package com.paymaya.mayaui.banktransfer.view.fragment.impl;

import Ah.p;
import B5.i;
import G5.C;
import Kh.T;
import Lh.d;
import Lh.f;
import N5.C0450f;
import N5.C0489y;
import N5.G0;
import N5.I;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.H0;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.Q;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import m5.C1847a;
import n6.InterfaceC1932c;
import o6.e;
import o6.k;
import o6.l;
import o6.m;
import o6.n;
import r6.a;
import r6.b;
import s6.InterfaceC2242c;
import t6.h;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankTransferListFragment extends MayaBaseFragment implements InterfaceC2242c {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public I f11560U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public RecyclerView f11561V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public NestedScrollView f11562W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f11563X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public LottieAnimationView f11564Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f11565Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f11566a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public AppCompatTextView f11567b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public G0 f11568c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C0489y f11569d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public RecyclerView f11570e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public G0 f11571f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public M f11572g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public n f11573h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public h f11574i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public b f11575j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public a f11576k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final String f11577l0 = "BANK_TRANSFER_BANK_LIST_" + EnumC1212a.BUTTON + Global.UNDERSCORE + AbstractC1173g.G(18);

    public static final void M1(MayaBankTransferListFragment mayaBankTransferListFragment) {
        if (mayaBankTransferListFragment.t1().e().isAppEventV2BankTransferEnabled()) {
            C1220i c1220iO1 = mayaBankTransferListFragment.o1();
            C1219h c1219hE = C1219h.e(mayaBankTransferListFragment.f11577l0);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("source_page", "Dashboard");
            map.put("button", "See all");
            map.put("destination_page", "Bank Transfer Favorite Screen");
            c1220iO1.b(c1219hE);
        }
        h hVar = mayaBankTransferListFragment.f11574i0;
        if (hVar != null) {
            MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) hVar;
            mayaBankTransferActivity.n1();
            i.p(mayaBankTransferActivity, "bank");
        }
    }

    public static final void N1(MayaBankTransferListFragment mayaBankTransferListFragment) {
        int i = 1;
        int i4 = 2;
        int i6 = 0;
        n nVar = (n) mayaBankTransferListFragment.G1();
        if (!nVar.f.e().isFavoritesServiceAvailable()) {
            G0 g02 = ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).f11568c0;
            if (g02 == null) {
                j.n("mViewFavoritesMaintenance");
                throw null;
            }
            g02.f3627b.setVisibility(0);
            ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).K1();
            ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).I1();
            ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).L1();
            ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).J1();
            ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).P1();
            return;
        }
        if (nVar.h) {
            return;
        }
        ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).P1();
        G0 g03 = ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).f11568c0;
        if (g03 == null) {
            j.n("mViewFavoritesMaintenance");
            throw null;
        }
        g03.f3627b.setVisibility(8);
        ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).K1();
        G0 g04 = ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).f11571f0;
        if (g04 == null) {
            j.n("mViewLoadingFavorites");
            throw null;
        }
        g04.f3627b.setVisibility(0);
        ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).I1();
        ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).J1();
        nVar.e(new f(new d(new d(new Lh.h(nVar.e.c("bank"), zh.b.a(), 0).d(new k(nVar)), new l(nVar), i4), new m(nVar, i), i6), new o6.i(nVar, i4), i6).e());
    }

    public final InterfaceC1932c G1() {
        n nVar = this.f11573h0;
        if (nVar != null) {
            return nVar;
        }
        j.n("mMayaBankTransferListFragmentPresenter");
        throw null;
    }

    public final void H1() {
        LottieAnimationView lottieAnimationView = this.f11564Y;
        if (lottieAnimationView == null) {
            j.n("mLottieAnimationView");
            throw null;
        }
        lottieAnimationView.setVisibility(8);
        RecyclerView recyclerView = this.f11561V;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        } else {
            j.n("mRecyclerViewBankNames");
            throw null;
        }
    }

    public final void I1() {
        AppCompatTextView appCompatTextView = this.f11567b0;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        } else {
            j.n("mTextViewEmptyFavorites");
            throw null;
        }
    }

    public final void J1() {
        C0489y c0489y = this.f11569d0;
        if (c0489y != null) {
            c0489y.f4296b.setVisibility(8);
        } else {
            j.n("mViewFavoritesError");
            throw null;
        }
    }

    public final void K1() {
        RecyclerView recyclerView = this.f11570e0;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        } else {
            j.n("mRecyclerViewFavorites");
            throw null;
        }
    }

    public final void L1() {
        G0 g02 = this.f11571f0;
        if (g02 != null) {
            g02.f3627b.setVisibility(8);
        } else {
            j.n("mViewLoadingFavorites");
            throw null;
        }
    }

    public final void O1() {
        if (t1().e().isAppEventV2BankTransferEnabled()) {
            h hVar = this.f11574i0;
            String str = hVar != null ? ((MayaBankTransferActivity) hVar).f11535r : null;
            FavoriteCount favoriteCount = hVar != null ? (FavoriteCount) ((MayaBankTransferActivity) hVar).Y1().f2942g : null;
            int iMUsed = favoriteCount != null ? favoriteCount.mUsed() : 0;
            C1220i c1220iO1 = o1();
            C1219h c1219h = new C1219h();
            HashMap map = c1219h.j;
            c1219h.p(EnumC1215d.BANK_TRANSFER_BANK_LIST);
            c1219h.n(2);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            map.put("source_page", str);
            map.put("has_favorites", String.valueOf(iMUsed > 0));
            map.put("number_of_favorites", String.valueOf(iMUsed));
            c1220iO1.b(c1219h);
        }
    }

    public final void P1() {
        TextView textView = this.f11565Z;
        if (textView == null) {
            j.n("mTextViewMyFavoritesLabel");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f11565Z;
        if (textView2 != null) {
            textView2.setText(R.string.pma_label_my_favorites);
        } else {
            j.n("mTextViewMyFavoritesLabel");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f11574i0 = (h) getActivity();
        O5.a aVar = W4.a.e().h().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C1269l c1269lF = aVar.f();
        Q q9 = aVar.q();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(sessionSubject, "sessionSubject");
        this.f11573h0 = new n(c1269lF, q9, preference, flagConfigurationService, sessionSubject);
        ((AbstractC2509a) G1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_bank_transfer_list, viewGroup, false);
        int i = R.id.favorites_barrier_pma_fragment_bank_transfer_v2_options;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.favorites_barrier_pma_fragment_bank_transfer_v2_options)) != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
            i = R.id.recycler_view_bank_favorites;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_bank_favorites);
            if (recyclerView != null) {
                i = R.id.text_view_empty_favorites;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_empty_favorites);
                if (appCompatTextView != null) {
                    i = R.id.text_view_my_favorites;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_my_favorites);
                    if (textView != null) {
                        i = R.id.text_view_see_all;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_see_all);
                        if (textView2 != null) {
                            i = R.id.text_view_title_header;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header);
                            if (textView3 != null) {
                                i = R.id.view_bank_list;
                                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_bank_list);
                                if (viewFindChildViewById != null) {
                                    int i4 = R.id.lottie_view_loading;
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.lottie_view_loading);
                                    if (lottieAnimationView != null) {
                                        i4 = R.id.recycler_view_bank_list;
                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.recycler_view_bank_list);
                                        if (recyclerView2 != null) {
                                            i4 = R.id.text_view_all_banks_label;
                                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_all_banks_label)) != null) {
                                                C0450f c0450f = new C0450f((ViewGroup) viewFindChildViewById, (Object) lottieAnimationView, (Object) recyclerView2, 15);
                                                i = R.id.view_favorites_error;
                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_favorites_error);
                                                if (viewFindChildViewById2 != null) {
                                                    C0489y c0489yA = C0489y.a(viewFindChildViewById2);
                                                    i = R.id.view_favorites_loading;
                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_favorites_loading);
                                                    if (viewFindChildViewById3 != null) {
                                                        G0 g0C = G0.c(viewFindChildViewById3);
                                                        i = R.id.view_maintenance;
                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_maintenance);
                                                        if (viewFindChildViewById4 != null) {
                                                            this.f11560U = new I(nestedScrollView, nestedScrollView, recyclerView, appCompatTextView, textView, textView2, textView3, c0450f, c0489yA, g0C, G0.b(viewFindChildViewById4));
                                                            return nestedScrollView;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((AbstractC2509a) G1()).i();
        this.f11560U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2;
        int i4 = 1;
        int i6 = 0;
        super.onResume();
        h hVar = this.f11574i0;
        if (hVar != null) {
            ((MayaBankTransferActivity) hVar).Q(this);
        }
        n nVar = (n) G1();
        if (!nVar.h) {
            nVar.h = true;
            RecyclerView recyclerView = ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).f11561V;
            if (recyclerView == null) {
                j.n("mRecyclerViewBankNames");
                throw null;
            }
            recyclerView.setVisibility(8);
            MayaBankTransferListFragment mayaBankTransferListFragment = (MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get());
            LottieAnimationView lottieAnimationView = mayaBankTransferListFragment.f11564Y;
            if (lottieAnimationView == null) {
                j.n("mLottieAnimationView");
                throw null;
            }
            lottieAnimationView.setVisibility(0);
            RecyclerView recyclerView2 = mayaBankTransferListFragment.f11561V;
            if (recyclerView2 == null) {
                j.n("mRecyclerViewBankNames");
                throw null;
            }
            recyclerView2.setVisibility(8);
            if (nVar.f.e().isFavoritesServiceAvailable()) {
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).P1();
                G0 g02 = ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).f11568c0;
                if (g02 == null) {
                    j.n("mViewFavoritesMaintenance");
                    throw null;
                }
                g02.f3627b.setVisibility(8);
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).K1();
                G0 g03 = ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).f11571f0;
                if (g03 == null) {
                    j.n("mViewLoadingFavorites");
                    throw null;
                }
                g03.f3627b.setVisibility(0);
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).I1();
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).J1();
                nVar.e(new T(5, p.l(new Lh.i(new f(new d(new Lh.h(nVar.f18806d.a(), zh.b.a(), 0), new o6.i(nVar, i6), i), new e(nVar), i6), new o6.h(nVar, i4), null), new f(new Lh.i(new d(new Lh.h(nVar.e.c("bank").d(new o6.j(nVar)), zh.b.a(), 0), new k(nVar), i), new o6.h(nVar, i6), null), new l(nVar), i6), e.c), new o6.h(nVar, i)).e());
            } else {
                G0 g04 = ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).f11568c0;
                if (g04 == null) {
                    j.n("mViewFavoritesMaintenance");
                    throw null;
                }
                g04.f3627b.setVisibility(0);
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).K1();
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).I1();
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).L1();
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).P1();
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).J1();
                ((MayaBankTransferListFragment) ((InterfaceC2242c) nVar.c.get())).O1();
                nVar.e(new d(new d(new Lh.h(nVar.f18806d.a(), zh.b.a(), 0), new m(nVar, i6), i), new M(nVar, 24), i6).e());
            }
        }
        n nVar2 = (n) G1();
        if (c.b(nVar2.f18807g, A5.b.h)) {
            MayaBankTransferListFragment mayaBankTransferListFragment2 = (MayaBankTransferListFragment) ((InterfaceC2242c) nVar2.c.get());
            if (mayaBankTransferListFragment2.f11572g0 == null) {
                M m = new M(mayaBankTransferListFragment2, s5.f.f20016g);
                H0 h02 = new H0(18);
                C1847a c1847a = (C1847a) m.f11371b;
                c1847a.f17717d = h02;
                c1847a.e = new H0(19);
                c1847a.f = new Sb.i(8);
                mayaBankTransferListFragment2.f11572g0 = m;
            }
            M m2 = mayaBankTransferListFragment2.f11572g0;
            if (m2 != null) {
                m2.j();
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        I i = this.f11560U;
        j.d(i);
        this.f11561V = (RecyclerView) ((C0450f) i.i).f4088d;
        I i4 = this.f11560U;
        j.d(i4);
        this.f11562W = (NestedScrollView) i4.f;
        I i6 = this.f11560U;
        j.d(i6);
        this.f11563X = (TextView) i6.f3647d;
        I i10 = this.f11560U;
        j.d(i10);
        this.f11564Y = (LottieAnimationView) ((C0450f) i10.i).f4087b;
        j.d(this.f11560U);
        I i11 = this.f11560U;
        j.d(i11);
        this.f11565Z = i11.f3646b;
        I i12 = this.f11560U;
        j.d(i12);
        this.f11567b0 = (AppCompatTextView) i12.h;
        I i13 = this.f11560U;
        j.d(i13);
        this.f11566a0 = (TextView) i13.c;
        I i14 = this.f11560U;
        j.d(i14);
        this.f11571f0 = (G0) i14.f3649k;
        I i15 = this.f11560U;
        j.d(i15);
        this.f11570e0 = (RecyclerView) i15.f3648g;
        I i16 = this.f11560U;
        j.d(i16);
        this.f11568c0 = (G0) i16.f3650l;
        I i17 = this.f11560U;
        j.d(i17);
        this.f11569d0 = (C0489y) i17.j;
        ((n) G1()).j();
        a aVar = this.f11576k0;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f11576k0 = aVar;
        RecyclerView recyclerView = this.f11570e0;
        if (recyclerView == null) {
            j.n("mRecyclerViewFavorites");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = this.f11570e0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewFavorites");
            throw null;
        }
        recyclerView2.setAdapter(this.f11576k0);
        b bVar = this.f11575j0;
        if (bVar == null) {
            bVar = new b(this);
        }
        this.f11575j0 = bVar;
        RecyclerView recyclerView3 = this.f11561V;
        if (recyclerView3 == null) {
            j.n("mRecyclerViewBankNames");
            throw null;
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView4 = this.f11561V;
        if (recyclerView4 == null) {
            j.n("mRecyclerViewBankNames");
            throw null;
        }
        recyclerView4.setAdapter(this.f11575j0);
        NestedScrollView nestedScrollView = this.f11562W;
        if (nestedScrollView == null) {
            j.n("mScrollView");
            throw null;
        }
        TextView textView = this.f11563X;
        if (textView == null) {
            j.n("mTextViewTitleHeader");
            throw null;
        }
        C.a(nestedScrollView, textView, new Ag.j(this, 23));
        TextView textView2 = this.f11566a0;
        if (textView2 == null) {
            j.n("mTextViewViewAllFavorites");
            throw null;
        }
        final int i18 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: t6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaBankTransferListFragment f20178b;

            {
                this.f20178b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        MayaBankTransferListFragment mayaBankTransferListFragment = this.f20178b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaBankTransferListFragment.M1(mayaBankTransferListFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaBankTransferListFragment mayaBankTransferListFragment2 = this.f20178b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaBankTransferListFragment.N1(mayaBankTransferListFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        C0489y c0489y = this.f11569d0;
        if (c0489y == null) {
            j.n("mViewFavoritesError");
            throw null;
        }
        final int i19 = 1;
        c0489y.c.setOnClickListener(new View.OnClickListener(this) { // from class: t6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaBankTransferListFragment f20178b;

            {
                this.f20178b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        MayaBankTransferListFragment mayaBankTransferListFragment = this.f20178b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaBankTransferListFragment.M1(mayaBankTransferListFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaBankTransferListFragment mayaBankTransferListFragment2 = this.f20178b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaBankTransferListFragment.N1(mayaBankTransferListFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
