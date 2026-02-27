package com.paymaya.ui.ekyc.view.fragment.impl;

import A7.c;
import G5.l;
import O5.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.KeyEventDispatcher;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cj.C1110A;
import cj.t;
import com.google.android.material.textfield.TextInputEditText;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.EDDSettings;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.widget.EDDInput;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import o6.f;
import rd.InterfaceC2200a;
import sd.d;
import yd.InterfaceC2528a;
import yd.i;
import zd.C2557a;
import zd.o;

/* JADX INFO: loaded from: classes4.dex */
public class EDDRelatedCompaniesFragment extends AbstractBaseEDDFormFragmentImpl<i> implements i {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public d f14543Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public o f14544Z;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.RELATED_COMPANIES;
    }

    @Override // yd.InterfaceC2528a
    public final void i(Object obj, boolean z4) {
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        EDDInput eDDInput = new EDDInput(contextRequireContext);
        View.inflate(eDDInput.getContext(), R.layout.pma_view_edd_input, eDDInput);
        ButterKnife.bind(eDDInput);
        eDDInput.getMEditText().setSaveEnabled(false);
        String string = getString(R.string.pma_hint_enumerate_one);
        j.f(string, "getString(...)");
        f fVar = new f(this, 23);
        eDDInput.getMTextInputLayout().setHintEnabled(true);
        eDDInput.getMTextInputLayout().setHint(string);
        eDDInput.getMRemoveImageView().setVisibility(z4 ? 0 : 8);
        eDDInput.f14596d = fVar;
        Bd.j jVar = (Bd.j) C1110A.B(this.f14508V);
        EDDInput eDDInput2 = jVar instanceof EDDInput ? (EDDInput) jVar : null;
        if (eDDInput2 == null) {
            eDDInput2 = eDDInput;
        }
        eDDInput.setFirstItem(eDDInput2);
        if (this.f14508V.isEmpty()) {
            C2557a isValidListener = this.f14509W;
            j.g(isValidListener, "isValidListener");
            TextInputEditText mEditText = eDDInput.getMEditText();
            EDDInput eDDInput3 = eDDInput.e;
            l lVar = new l(eDDInput3 != null ? eDDInput3.getMTextInputLayout() : null);
            lVar.f1751b = new c(eDDInput, 6);
            lVar.c = isValidListener;
            mEditText.addTextChangedListener(lVar);
        }
        eDDInput.setInput(obj instanceof String ? (String) obj : null);
        this.f14508V.add(eDDInput);
        TransitionManager.beginDelayedTransition(s1(), new Fade(1));
        s1().addView(eDDInput);
    }

    @OnClick({R.id.add_item_layout_pma_fragment_edd_form})
    public void onAddCompanyClick() {
        d dVarZ1 = z1();
        int size = ((AbstractBaseEDDFormFragmentImpl) ((i) dVarZ1.c.get())).f14508V.size() + 1;
        EDDSettings eDDSettingsA = dVarZ1.e.a();
        if (size >= (eDDSettingsA != null ? eDDSettingsA.getMaxRelatedCompanies() : 0)) {
            View view = ((AbstractBaseEDDFormFragmentImpl) ((i) dVarZ1.c.get())).mAddItemButton;
            if (view == null) {
                j.n("mAddItemButton");
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
        a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14543Y = new d(aVar.p(), 2);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.fragment.impl.EDDRelatedCompaniesFragment.EDDRelatedCompaniesFragmentListener");
        this.f14544Z = (o) activity;
        z1().h(this);
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_related_companies, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        z1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o oVar = this.f14544Z;
        if (oVar != null) {
            ((EDDActivity) oVar).Q(this);
        }
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
            j.e(jVar, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.widget.EDDInput");
            arrayList2.add(((EDDInput) jVar).getInput());
        }
        bundle.putStringArrayList("items", new ArrayList<>(arrayList2));
    }

    public final d z1() {
        d dVar = this.f14543Y;
        if (dVar != null) {
            return dVar;
        }
        j.n("mEDDRelatedCompaniesFragmentPresenter");
        throw null;
    }
}
