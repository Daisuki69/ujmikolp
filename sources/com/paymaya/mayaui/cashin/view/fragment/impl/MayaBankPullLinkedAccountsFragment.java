package com.paymaya.mayaui.cashin.view.fragment.impl;

import Ah.o;
import Hh.f;
import J5.c;
import J6.a;
import J6.b;
import K6.d;
import L6.InterfaceC0320f;
import N5.G;
import W6.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import cj.C1112C;
import cj.t;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankPullListItem;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaOptionsBottomSheetFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import p3.C2011b;
import v.AbstractC2329d;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankPullLinkedAccountsFragment extends MayaBaseFragment implements d, a, e {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public G f11635U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public RecyclerView f11636V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public G6.d f11637W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public InterfaceC0320f f11638X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public b f11639Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public LinearLayoutManager f11640Z;

    public static final void H1(MayaBankPullLinkedAccountsFragment mayaBankPullLinkedAccountsFragment, int i, BankPullPaymentOption bankPullPaymentOption) {
        G6.d dVar = (G6.d) mayaBankPullLinkedAccountsFragment.G1();
        ((MayaBaseFragment) ((d) dVar.c.get())).E1();
        LinkedPaymentOption paymentOption = bankPullPaymentOption.getPaymentOption();
        String paymentId = paymentOption != null ? paymentOption.getPaymentId() : null;
        if (paymentId != null) {
            Ah.a aVarDeletePaymentToken = dVar.f1780d.f11503b.deletePaymentToken(paymentId);
            o oVarA = zh.b.a();
            aVarDeletePaymentToken.getClass();
            new Hh.a(new f(aVarDeletePaymentToken, oVarA, 0).a(new G6.b(dVar, i, bankPullPaymentOption, 1)).b(new c(dVar, 25)), new A7.c(dVar, 20), 1).c();
        }
    }

    @Override // J6.a
    public final void B(String title, List list) {
        j.g(title, "title");
    }

    public final F6.b G1() {
        G6.d dVar = this.f11637W;
        if (dVar != null) {
            return dVar;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    @Override // J6.a
    public final void a1(BankPullPaymentOption paymentOption) {
        j.g(paymentOption, "paymentOption");
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.n(17);
        c1219h.t(EnumC1217f.LINKED_ACCOUNT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        map.put("bank", paymentOption.getId());
        LinkedPaymentOption paymentOption2 = paymentOption.getPaymentOption();
        map.put("account_number", paymentOption2 != null ? paymentOption2.getLastFourDigits() : null);
        A1(c1219h);
        InterfaceC0320f interfaceC0320f = this.f11638X;
        if (interfaceC0320f != null) {
            AbstractC1236z.h((MayaCashInActivity) interfaceC0320f, R.id.frame_layout_container, C2011b.j(paymentOption));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11638X = (InterfaceC0320f) getActivity();
        O5.a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        C1295y0 c1295y0K = aVar.K();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(sessionSubject, "sessionSubject");
        this.f11637W = new G6.d(c1295y0K, sessionSubject);
        ((AbstractC2509a) G1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_bank_pull_linked_accounts, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_linked_accounts);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.recycler_view_linked_accounts)));
        }
        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
        this.f11635U = new G(nestedScrollView, recyclerView, 0);
        j.f(nestedScrollView, "getRoot(...)");
        return nestedScrollView;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) G1()).i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11635U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, W6.e
    public final void onDismiss() {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC0320f interfaceC0320f = this.f11638X;
        if (interfaceC0320f != null) {
            ((MayaCashInActivity) interfaceC0320f).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Iterable linkedPaymentOptionsList;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        G g8 = this.f11635U;
        j.d(g8);
        this.f11636V = g8.c;
        this.f11640Z = new LinearLayoutManager(getContext(), 1, false);
        b bVar = new b(this);
        this.f11639Y = bVar;
        RecyclerView recyclerView = this.f11636V;
        if (recyclerView == null) {
            j.n("mRecyclerViewLinkedAccounts");
            throw null;
        }
        recyclerView.setAdapter(bVar);
        RecyclerView recyclerView2 = this.f11636V;
        if (recyclerView2 == null) {
            j.n("mRecyclerViewLinkedAccounts");
            throw null;
        }
        recyclerView2.setLayoutManager(this.f11640Z);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("linked_payment_options");
            if (parcelableArrayList == null || (linkedPaymentOptionsList = C1110A.V(parcelableArrayList)) == null) {
                linkedPaymentOptionsList = C1112C.f9377a;
            }
            G6.d dVar = (G6.d) G1();
            j.g(linkedPaymentOptionsList, "linkedPaymentOptionsList");
            dVar.j();
            Iterable iterable = linkedPaymentOptionsList;
            ArrayList arrayList = new ArrayList(t.l(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new BankPullListItem.BankPullLinkedItem((BankPullPaymentOption) it.next()));
            }
            MayaBankPullLinkedAccountsFragment mayaBankPullLinkedAccountsFragment = (MayaBankPullLinkedAccountsFragment) ((d) dVar.c.get());
            mayaBankPullLinkedAccountsFragment.getClass();
            b bVar2 = mayaBankPullLinkedAccountsFragment.f11639Y;
            if (bVar2 != null) {
                bVar2.f(arrayList);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.BANK_PULL;
    }

    @Override // J6.a
    public final void w() {
    }

    @Override // J6.a
    public final void y0(int i, BankPullPaymentOption bankPullPaymentOption) {
        int i4 = 0;
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.UNLINK);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("bank", bankPullPaymentOption.getId());
        LinkedPaymentOption paymentOption = bankPullPaymentOption.getPaymentOption();
        c1219hH.j.put("account_number", paymentOption != null ? paymentOption.getLastFourDigits() : null);
        A1(c1219hH);
        InterfaceC0320f interfaceC0320f = this.f11638X;
        if (interfaceC0320f != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) interfaceC0320f;
            LinkedPaymentOption paymentOption2 = bankPullPaymentOption.getPaymentOption();
            String string = mayaCashInActivity.getString(R.string.maya_format_account_options, paymentOption2 != null ? paymentOption2.getLastFourDigits() : null);
            j.f(string, "getString(...)");
            String string2 = mayaCashInActivity.getString(R.string.maya_label_unlink_account);
            I6.d dVar = new I6.d(mayaCashInActivity, i, bankPullPaymentOption, i4);
            MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment = new MayaOptionsBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("title", string);
            bundle.putString("option_value", string2);
            bundle.putString("cancel_value", null);
            mayaOptionsBottomSheetFragment.setArguments(bundle);
            mayaOptionsBottomSheetFragment.f11866Z = dVar;
            mayaOptionsBottomSheetFragment.f11867a0 = null;
            mayaOptionsBottomSheetFragment.show(mayaCashInActivity.getSupportFragmentManager(), "option_dialog");
        }
    }
}
