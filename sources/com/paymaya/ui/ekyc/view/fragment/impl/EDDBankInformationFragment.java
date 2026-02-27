package com.paymaya.ui.ekyc.view.fragment.impl;

import B5.i;
import Bd.g;
import O5.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import butterknife.OnClick;
import cj.C1110A;
import cj.t;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.Bank;
import com.paymaya.domain.model.EDDOptionInput;
import com.paymaya.domain.model.EDDSettings;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.widget.EDDOptionsInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rd.InterfaceC2200a;
import sd.d;
import yd.InterfaceC2528a;
import yd.e;
import zd.j;

/* JADX INFO: loaded from: classes4.dex */
public class EDDBankInformationFragment extends AbstractBaseEDDFormFragmentImpl<e> implements e, g {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public d f14529Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public j f14530Z;

    @Override // Bd.g
    public final void Q0(EDDOptionsInput eDDOptionsInput) {
        this.f14508V.remove(eDDOptionsInput);
        s1().removeView(eDDOptionsInput);
        d dVarZ1 = z1();
        int size = ((AbstractBaseEDDFormFragmentImpl) ((e) dVarZ1.c.get())).f14508V.size();
        EDDSettings eDDSettingsA = dVarZ1.e.a();
        if (size < (eDDSettingsA != null ? eDDSettingsA.getMaxBanks() : 5)) {
            View view = ((AbstractBaseEDDFormFragmentImpl) ((e) dVarZ1.c.get())).mAddItemButton;
            if (view != null) {
                view.setVisibility(0);
            } else {
                kotlin.jvm.internal.j.n("mAddItemButton");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.BANK_INFORMATION;
    }

    @Override // yd.InterfaceC2528a
    public final void i(Object obj, boolean z4) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        EDDOptionsInput eDDOptionsInput = new EDDOptionsInput(contextRequireContext);
        String string = getString(R.string.pma_hint_edd_choose_one);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        String string2 = getString(R.string.pma_hint_edd_bank_name);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        eDDOptionsInput.e(string, string2, z4, this);
        Bd.j jVar = (Bd.j) C1110A.B(this.f14508V);
        EDDOptionsInput eDDOptionsInput2 = jVar instanceof EDDOptionsInput ? (EDDOptionsInput) jVar : null;
        if (eDDOptionsInput2 == null) {
            eDDOptionsInput2 = eDDOptionsInput;
        }
        eDDOptionsInput.setFirstItem(eDDOptionsInput2);
        if (this.f14508V.isEmpty()) {
            eDDOptionsInput.b(this.f14509W);
        }
        eDDOptionsInput.setInput(obj instanceof EDDOptionInput ? (EDDOptionInput) obj : null);
        this.f14508V.add(eDDOptionsInput);
        TransitionManager.beginDelayedTransition(s1(), new Fade(1));
        s1().addView(eDDOptionsInput);
    }

    @Override // Bd.g
    public final void l(int i) {
        ArrayList<Bd.j> arrayList = this.f14508V;
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        for (Bd.j jVar : arrayList) {
            kotlin.jvm.internal.j.e(jVar, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.widget.EDDOptionsInput");
            arrayList2.add(String.valueOf(((EDDOptionsInput) jVar).getMOptionsEditText().getText()));
        }
        j jVar2 = this.f14530Z;
        if (jVar2 != null) {
            EDDActivity eDDActivity = (EDDActivity) jVar2;
            List listB = eDDActivity.t1().f.b();
            kotlin.jvm.internal.j.f(listB, "getBanks(...)");
            List list = listB;
            ArrayList arrayList3 = new ArrayList(t.l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strMBankName = ((Bank) it.next()).mBankName();
                if (strMBankName == null) {
                    strMBankName = "";
                }
                arrayList3.add(strMBankName);
            }
            i iVar = eDDActivity.e;
            String string = eDDActivity.getString(R.string.pma_label_bank);
            ArrayList arrayList4 = new ArrayList(arrayList3);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            iVar.getClass();
            i.o(eDDActivity, i, string, arrayList4, arrayList5, true);
        }
    }

    @OnClick({R.id.add_item_layout_pma_fragment_edd_form})
    public void onAddIncomeSourceClicked() {
        d dVarZ1 = z1();
        int size = ((AbstractBaseEDDFormFragmentImpl) ((e) dVarZ1.c.get())).f14508V.size() + 1;
        EDDSettings eDDSettingsA = dVarZ1.e.a();
        if (size >= (eDDSettingsA != null ? eDDSettingsA.getMaxBanks() : 5)) {
            View view = ((AbstractBaseEDDFormFragmentImpl) ((e) dVarZ1.c.get())).mAddItemButton;
            if (view == null) {
                kotlin.jvm.internal.j.n("mAddItemButton");
                throw null;
            }
            view.setVisibility(8);
        }
        ((InterfaceC2528a) dVarZ1.c.get()).i(null, true);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f14530Z = (j) getActivity();
        a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14529Y = new d(aVar.p(), 0);
        z1().h(this);
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_bank_information, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        z1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j jVar = this.f14530Z;
        if (jVar != null) {
            ((EDDActivity) jVar).Q(this);
        }
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        z1().j();
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl
    public final InterfaceC2200a u1() {
        return z1();
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl
    public final void w1(Bundle bundle) {
        ArrayList<Bd.j> arrayList = this.f14508V;
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        for (Bd.j jVar : arrayList) {
            kotlin.jvm.internal.j.e(jVar, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.widget.EDDOptionsInput");
            arrayList2.add(((EDDOptionsInput) jVar).getInputAsEDDOptionInput());
        }
        bundle.putParcelableArrayList("items", new ArrayList<>(arrayList2));
    }

    public final d z1() {
        d dVar = this.f14529Y;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.j.n("mEDDBankInformationFragmentPresenter");
        throw null;
    }
}
