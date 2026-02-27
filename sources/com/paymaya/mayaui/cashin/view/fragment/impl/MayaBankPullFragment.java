package com.paymaya.mayaui.cashin.view.fragment.impl;

import A5.l;
import Ah.o;
import Ah.p;
import Hh.f;
import J6.a;
import J6.b;
import K6.c;
import L6.InterfaceC0319e;
import L6.ViewOnClickListenerC0318d;
import Lh.d;
import Lh.h;
import N5.C0453g;
import W6.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import p3.C2011b;
import w.C2360b;
import w.C2361c;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankPullFragment extends MayaBaseLoadingFragment implements c, a, e {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0453g f11628o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public RecyclerView f11629p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public G6.c f11630q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public InterfaceC0319e f11631r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f11632s0;
    public b t0;
    public LinearLayoutManager u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public LinearLayoutManager f11633v0;
    public TextView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public RecyclerView f11634x0;

    public static final void R1(MayaBankPullFragment mayaBankPullFragment, int i, BankPullPaymentOption bankPullPaymentOption) {
        G6.c cVar = (G6.c) mayaBankPullFragment.P1();
        ((MayaBaseFragment) ((c) cVar.c.get())).E1();
        LinkedPaymentOption paymentOption = bankPullPaymentOption.getPaymentOption();
        String paymentId = paymentOption != null ? paymentOption.getPaymentId() : null;
        if (paymentId != null) {
            Ah.a aVarDeletePaymentToken = cVar.f1779d.f11503b.deletePaymentToken(paymentId);
            o oVarA = zh.b.a();
            aVarDeletePaymentToken.getClass();
            new Hh.a(new f(aVarDeletePaymentToken, oVarA, 0).a(new G6.b(cVar, i, bankPullPaymentOption, 0)).b(new C2361c(cVar, 22)), new G6.a(cVar), 1).c();
        }
    }

    @Override // J6.a
    public final void B(String title, List list) {
        j.g(title, "title");
        InterfaceC0319e interfaceC0319e = this.f11631r0;
        if (interfaceC0319e != null) {
            MayaBankPullLinkedAccountsFragment mayaBankPullLinkedAccountsFragment = new MayaBankPullLinkedAccountsFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("linked_payment_options", new ArrayList<>(list));
            mayaBankPullLinkedAccountsFragment.setArguments(bundle);
            AbstractC1236z.h((MayaCashInActivity) interfaceC0319e, R.id.frame_layout_container, mayaBankPullLinkedAccountsFragment);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_bank_pull, viewGroup, false);
        int i = R.id.recycler_view_payment_options;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_payment_options);
        if (recyclerView != null) {
            i = R.id.recycler_view_v2_linked_accounts;
            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_v2_linked_accounts);
            if (recyclerView2 != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                i = R.id.swipe_left_delete_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.swipe_left_delete_text_view);
                if (textView != null) {
                    i = R.id.text_view_linked_account_header_v2;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_linked_account_header_v2);
                    if (textView2 != null) {
                        i = R.id.text_view_title_header;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header);
                        if (textView3 != null) {
                            this.f11628o0 = new C0453g(nestedScrollView, recyclerView, recyclerView2, textView, textView2, textView3);
                            j.f(nestedScrollView, "getRoot(...)");
                            return nestedScrollView;
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

    public final F6.a P1() {
        G6.c cVar = this.f11630q0;
        if (cVar != null) {
            return cVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void Q1() {
        Pair pair;
        O1();
        G6.c cVar = (G6.c) P1();
        if (((MayaBaseLoadingFragment) ((c) cVar.c.get())).f10359n0 && (pair = cVar.e) != null) {
            cVar.k(pair);
            return;
        }
        p<Map<String, List<LinkedPaymentOption>>> paymentTokens = cVar.f1779d.f11503b.getPaymentTokens();
        Nh.j jVar = Th.e.c;
        h hVarH = paymentTokens.h(jVar);
        C1295y0 c1295y0 = cVar.f1779d;
        c1295y0.getClass();
        HashMap map = new HashMap();
        map.put("payment_options_sort", "priority");
        map.put(Constants.ENABLED, "true");
        cVar.e(new d(new d(new h(p.l(hVarH, c1295y0.f11503b.getBankPullSettings(map).h(jVar), new G6.a(cVar)), zh.b.a(), 0), new l(cVar, 20), 2), new C2360b(cVar, 23), 0).e());
    }

    @Override // J6.a
    public final void a1(BankPullPaymentOption paymentOption) {
        j.g(paymentOption, "paymentOption");
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(EnumC1217f.BANK);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("bank", paymentOption.getId());
        A1(c1219h);
        InterfaceC0319e interfaceC0319e = this.f11631r0;
        if (interfaceC0319e != null) {
            AbstractC1236z.h((MayaCashInActivity) interfaceC0319e, R.id.frame_layout_container, C2011b.j(paymentOption));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f11631r0 = (InterfaceC0319e) getActivity();
        O5.a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1295y0 c1295y0K = aVar.K();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f11630q0 = new G6.c(preference, c1295y0K, sessionSubject);
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
        this.f11628o0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, W6.e
    public final void onDismiss() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Q1();
        InterfaceC0319e interfaceC0319e = this.f11631r0;
        if (interfaceC0319e != null) {
            ((MayaCashInActivity) interfaceC0319e).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        j.d(this.f11628o0);
        C0453g c0453g = this.f11628o0;
        j.d(c0453g);
        this.w0 = (TextView) c0453g.e;
        C0453g c0453g2 = this.f11628o0;
        j.d(c0453g2);
        this.f11629p0 = (RecyclerView) c0453g2.c;
        C0453g c0453g3 = this.f11628o0;
        j.d(c0453g3);
        this.f11634x0 = (RecyclerView) c0453g3.f4095d;
        j.d(this.f11628o0);
        ((G6.c) P1()).j();
        this.u0 = new LinearLayoutManager(getContext(), 1, false);
        b bVar = new b(this);
        this.f11632s0 = bVar;
        RecyclerView recyclerView = this.f11629p0;
        if (recyclerView == null) {
            j.n("mRecyclerViewPaymentOptions");
            throw null;
        }
        recyclerView.setAdapter(bVar);
        RecyclerView recyclerView2 = this.f11629p0;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewPaymentOptions");
            throw null;
        }
        recyclerView2.setLayoutManager(this.u0);
        this.f11633v0 = new LinearLayoutManager(getContext(), 1, false);
        b bVar2 = new b(this);
        this.t0 = bVar2;
        RecyclerView recyclerView3 = this.f11634x0;
        if (recyclerView3 == null) {
            j.n("mRecyclerViewLinkedAccountsV2");
            throw null;
        }
        recyclerView3.setAdapter(bVar2);
        RecyclerView recyclerView4 = this.f11634x0;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(this.f11633v0);
        } else {
            j.n("mRecyclerViewLinkedAccountsV2");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.BANK_PULL;
    }

    @Override // J6.a
    public final void w() {
        b bVar = this.f11632s0;
        if (bVar != null) {
            bVar.e(!((Boolean) bVar.f2421d.getValue(bVar, b.e[0])).booleanValue());
        }
    }

    @Override // J6.a
    public final void y0(int i, BankPullPaymentOption bankPullPaymentOption) {
        G6.c cVar = (G6.c) P1();
        LinkedPaymentOption paymentOption = bankPullPaymentOption.getPaymentOption();
        if (paymentOption != null) {
            c cVar2 = (c) cVar.c.get();
            String lastFourDigits = paymentOption.getLastFourDigits();
            MayaBankPullFragment mayaBankPullFragment = (MayaBankPullFragment) cVar2;
            mayaBankPullFragment.getClass();
            j.g(lastFourDigits, "lastFourDigits");
            InterfaceC0319e interfaceC0319e = mayaBankPullFragment.f11631r0;
            if (interfaceC0319e != null) {
                ((MayaCashInActivity) interfaceC0319e).a2(lastFourDigits, bankPullPaymentOption.getName(), new ViewOnClickListenerC0318d(mayaBankPullFragment, i, bankPullPaymentOption, 0), mayaBankPullFragment);
            }
        }
    }
}
