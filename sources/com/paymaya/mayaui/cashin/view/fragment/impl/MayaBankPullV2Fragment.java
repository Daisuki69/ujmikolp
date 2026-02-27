package com.paymaya.mayaui.cashin.view.fragment.impl;

import Ah.a;
import Ah.o;
import Ah.p;
import G6.g;
import Hh.f;
import J6.c;
import K6.e;
import L6.ViewOnClickListenerC0321g;
import L6.i;
import Lh.d;
import Lh.h;
import N5.C0466m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import w.C2360b;
import w.C2361c;
import y5.AbstractC2509a;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankPullV2Fragment extends MayaBaseLoadingFragment implements e, W6.e {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public boolean f11641A0 = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0466m f11642o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AppCompatTextView f11643p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f11644q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RecyclerView f11645r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public RecyclerView f11646s0;
    public Group t0;
    public g u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public i f11647v0;
    public c w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public c f11648x0;
    public LinearLayoutManager y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public LinearLayoutManager f11649z0;

    public static final void Q1(MayaBankPullV2Fragment mayaBankPullV2Fragment, BankPullPaymentOption bankPullPaymentOption, String str, String str2, int i) {
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.UNLINK);
        c1219h.n(17);
        c1219h.t(EnumC1217f.CONFIRM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("bank", bankPullPaymentOption.getId());
        c1219h.j.put("account_number", str);
        c1219h.j.put("bank_status", str2);
        c1219h.i();
        mayaBankPullV2Fragment.z1(c1219h);
        g gVar = (g) mayaBankPullV2Fragment.P1();
        ((MayaBaseFragment) ((e) gVar.c.get())).E1();
        LinkedPaymentOption paymentOption = bankPullPaymentOption.getPaymentOption();
        a aVarDeletePaymentToken = gVar.e.f11503b.deletePaymentToken(paymentOption != null ? paymentOption.getPaymentId() : null);
        o oVarA = b.a();
        aVarDeletePaymentToken.getClass();
        new Hh.a(new f(aVarDeletePaymentToken, oVarA, 0).a(new G6.f(i, gVar, bankPullPaymentOption, str2)).b(new Cg.c(8, gVar, bankPullPaymentOption, str2)), new A7.c(gVar, 21), 1).c();
    }

    public static final void R1(MayaBankPullV2Fragment mayaBankPullV2Fragment) {
        if (mayaBankPullV2Fragment.f11641A0) {
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.LINK_NEW_ACCOUNT);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("state", "collapsed");
            c1219hH.i();
            mayaBankPullV2Fragment.A1(c1219hH);
            AppCompatTextView appCompatTextView = mayaBankPullV2Fragment.f11643p0;
            if (appCompatTextView == null) {
                j.n("mTextViewLinkNewAccount");
                throw null;
            }
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.maya_ic_chevron_down_green, 0);
            RecyclerView recyclerView = mayaBankPullV2Fragment.f11645r0;
            if (recyclerView == null) {
                j.n("mRecyclerViewPaymentOptions");
                throw null;
            }
            recyclerView.setVisibility(8);
        } else {
            C1219h c1219hH2 = AbstractC2329d.h(17);
            c1219hH2.t(EnumC1217f.LINK_NEW_ACCOUNT);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH2.j.put("state", "expanded");
            c1219hH2.i();
            mayaBankPullV2Fragment.A1(c1219hH2);
            AppCompatTextView appCompatTextView2 = mayaBankPullV2Fragment.f11643p0;
            if (appCompatTextView2 == null) {
                j.n("mTextViewLinkNewAccount");
                throw null;
            }
            appCompatTextView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.maya_ic_chevron_up_green, 0);
            RecyclerView recyclerView2 = mayaBankPullV2Fragment.f11645r0;
            if (recyclerView2 == null) {
                j.n("mRecyclerViewPaymentOptions");
                throw null;
            }
            recyclerView2.setVisibility(0);
        }
        mayaBankPullV2Fragment.f11641A0 = !mayaBankPullV2Fragment.f11641A0;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_bank_pull_v2, viewGroup, false);
        int i = R.id.group_linked_accounts;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_linked_accounts);
        if (group != null) {
            i = R.id.recycler_view_linked_accounts;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_linked_accounts);
            if (recyclerView != null) {
                i = R.id.recycler_view_payment_options;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_payment_options);
                if (recyclerView2 != null) {
                    NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                    i = R.id.text_view_link_new_account;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_link_new_account);
                    if (appCompatTextView != null) {
                        i = R.id.text_view_link_new_account_logo;
                        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_link_new_account_logo)) != null) {
                            i = R.id.text_view_linked_account_header;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_linked_account_header)) != null) {
                                i = R.id.text_view_swipe_left_delete;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_swipe_left_delete)) != null) {
                                    i = R.id.text_view_title_header;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header);
                                    if (textView != null) {
                                        i = R.id.view_link_new_account_background;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_link_new_account_background);
                                        if (viewFindChildViewById != null) {
                                            i = R.id.view_link_new_account_click;
                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_link_new_account_click);
                                            if (viewFindChildViewById2 != null) {
                                                i = R.id.view_link_new_account_divider;
                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_link_new_account_divider);
                                                if (viewFindChildViewById3 != null) {
                                                    this.f11642o0 = new C0466m(nestedScrollView, group, recyclerView, recyclerView2, appCompatTextView, textView, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3);
                                                    j.f(nestedScrollView, "getRoot(...)");
                                                    return nestedScrollView;
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
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_dialog_fragment_loading, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final F6.c P1() {
        g gVar = this.u0;
        if (gVar != null) {
            return gVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void S1() {
        h hVarH;
        Pair pair;
        O1();
        g gVar = (g) P1();
        if (((MayaBaseLoadingFragment) ((e) gVar.c.get())).f10359n0 && (pair = gVar.f) != null) {
            gVar.k(pair);
            return;
        }
        if (gVar.f1786d.e().isBankPullSettingsV2Enabled()) {
            C1295y0 c1295y0 = gVar.e;
            c1295y0.getClass();
            HashMap map = new HashMap();
            map.put("payment_options_sort", "priority");
            map.put(Constants.ENABLED, "true");
            hVarH = c1295y0.f11503b.getBankPullSettingsV2(map).h(Th.e.c);
        } else {
            C1295y0 c1295y02 = gVar.e;
            c1295y02.getClass();
            HashMap map2 = new HashMap();
            map2.put("payment_options_sort", "priority");
            map2.put(Constants.ENABLED, "true");
            hVarH = c1295y02.f11503b.getBankPullSettings(map2).h(Th.e.c);
        }
        gVar.e(new d(new d(new h(p.l(gVar.e.f11503b.getPaymentTokens().h(Th.e.c), hVarH, new C2.f(gVar)), b.a(), 0), new C2360b(gVar, 24), 2), new C2361c(gVar, 23), 0).e());
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10338R = true;
        this.f11647v0 = (i) getActivity();
        O5.a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1295y0 c1295y0K = aVar.K();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.u0 = new g(preference, c1295y0K, sessionSubject);
        ((AbstractC2509a) P1()).h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) P1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11642o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, W6.e
    public final void onDismiss() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        S1();
        i iVar = this.f11647v0;
        if (iVar != null) {
            ((MayaCashInActivity) iVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f11642o0);
        C0466m c0466m = this.f11642o0;
        j.d(c0466m);
        this.f11643p0 = (AppCompatTextView) c0466m.i;
        C0466m c0466m2 = this.f11642o0;
        j.d(c0466m2);
        this.f11644q0 = (View) c0466m2.e;
        C0466m c0466m3 = this.f11642o0;
        j.d(c0466m3);
        this.f11645r0 = (RecyclerView) c0466m3.h;
        C0466m c0466m4 = this.f11642o0;
        j.d(c0466m4);
        this.f11646s0 = (RecyclerView) c0466m4.f4152g;
        C0466m c0466m5 = this.f11642o0;
        j.d(c0466m5);
        this.t0 = (Group) c0466m5.c;
        ((g) P1()).j();
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        O6.b bVar = new O6.b(contextRequireContext, 1);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.maya_divider_recycler_view);
        if (drawable != null) {
            bVar.f4759a = drawable;
        }
        this.y0 = new LinearLayoutManager(getContext(), 1, false);
        c cVar = new c(this);
        this.w0 = cVar;
        RecyclerView recyclerView = this.f11645r0;
        if (recyclerView == null) {
            j.n("mRecyclerViewPaymentOptions");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        RecyclerView recyclerView2 = this.f11645r0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewPaymentOptions");
            throw null;
        }
        recyclerView2.setLayoutManager(this.y0);
        RecyclerView recyclerView3 = this.f11645r0;
        if (recyclerView3 == null) {
            j.n("mRecyclerViewPaymentOptions");
            throw null;
        }
        recyclerView3.addItemDecoration(bVar);
        this.f11649z0 = new LinearLayoutManager(getContext(), 1, false);
        c cVar2 = new c(this);
        this.f11648x0 = cVar2;
        RecyclerView recyclerView4 = this.f11646s0;
        if (recyclerView4 == null) {
            j.n("mRecyclerViewLinkedAccounts");
            throw null;
        }
        recyclerView4.setAdapter(cVar2);
        RecyclerView recyclerView5 = this.f11646s0;
        if (recyclerView5 == null) {
            j.n("mRecyclerViewLinkedAccounts");
            throw null;
        }
        recyclerView5.setLayoutManager(this.f11649z0);
        RecyclerView recyclerView6 = this.f11646s0;
        if (recyclerView6 == null) {
            j.n("mRecyclerViewLinkedAccounts");
            throw null;
        }
        recyclerView6.addItemDecoration(bVar);
        View view2 = this.f11644q0;
        if (view2 != null) {
            view2.setOnClickListener(new ViewOnClickListenerC0321g(this, 0));
        } else {
            j.n("mViewLinkNewAccountClick");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.BANK_PULL;
    }
}
