package com.paymaya.ui.ekyc.view.fragment.impl;

import A7.c;
import O5.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import butterknife.OnClick;
import cj.C1110A;
import cj.t;
import com.google.android.material.textfield.TextInputEditText;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.model.EDDSettings;
import com.paymaya.domain.model.FinancialDocument;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import pg.C2038a;
import rd.InterfaceC2200a;
import sd.e;
import yd.InterfaceC2528a;
import yd.f;
import zd.C2557a;
import zd.l;

/* JADX INFO: loaded from: classes4.dex */
public class EDDFinancialDocumentsFragment extends AbstractBaseEDDFormFragmentImpl<f> implements f {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f14532a0 = 0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public e f14533Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public l f14534Z;

    public final void A1(EDDInputFinancialDocument eDDInputFinancialDocument) {
        this.f14508V.remove(eDDInputFinancialDocument);
        s1().removeView(eDDInputFinancialDocument);
        e eVarZ1 = z1();
        int size = ((AbstractBaseEDDFormFragmentImpl) ((f) eVarZ1.c.get())).f14508V.size();
        EDDSettings eDDSettingsA = eVarZ1.f20041d.a();
        if (size < (eDDSettingsA != null ? eDDSettingsA.getMaxRelatedCompanies() : 0)) {
            View view = ((AbstractBaseEDDFormFragmentImpl) ((f) eVarZ1.c.get())).mAddItemButton;
            if (view != null) {
                view.setVisibility(0);
            } else {
                j.n("mAddItemButton");
                throw null;
            }
        }
    }

    public final void B1(String str, FinancialDocument financialDocument) {
        Object next;
        ArrayList<Bd.j> arrayList = this.f14508V;
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        for (Bd.j jVar : arrayList) {
            j.e(jVar, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument");
            arrayList2.add((EDDInputFinancialDocument) jVar);
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (j.b(((EDDInputFinancialDocument) next).getDocumentId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EDDInputFinancialDocument eDDInputFinancialDocument = (EDDInputFinancialDocument) next;
        if (eDDInputFinancialDocument != null) {
            eDDInputFinancialDocument.setMFinancialDocument(financialDocument);
            eDDInputFinancialDocument.setMFileUrl(null);
            eDDInputFinancialDocument.setText(financialDocument.getName());
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.FINACIAL_DOCUMENTS;
    }

    @Override // yd.InterfaceC2528a
    public final void i(Object obj, boolean z4) {
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        EDDInputFinancialDocument eDDInputFinancialDocument = new EDDInputFinancialDocument(contextRequireContext);
        C2038a c2038a = new C2038a(29, this, eDDInputFinancialDocument, false);
        eDDInputFinancialDocument.getMRemoveImageView().setVisibility(z4 ? 0 : 8);
        eDDInputFinancialDocument.e = c2038a;
        Bd.j jVar = (Bd.j) C1110A.B(this.f14508V);
        EDDInputFinancialDocument eDDInputFinancialDocument2 = jVar instanceof EDDInputFinancialDocument ? (EDDInputFinancialDocument) jVar : null;
        if (eDDInputFinancialDocument2 == null) {
            eDDInputFinancialDocument2 = eDDInputFinancialDocument;
        }
        eDDInputFinancialDocument.setFirstItem(eDDInputFinancialDocument2);
        if (this.f14508V.isEmpty()) {
            C2557a isValidListener = this.f14509W;
            j.g(isValidListener, "isValidListener");
            TextInputEditText mEditText = eDDInputFinancialDocument.getMEditText();
            EDDInputFinancialDocument eDDInputFinancialDocument3 = eDDInputFinancialDocument.j;
            G5.l lVar = new G5.l(eDDInputFinancialDocument3 != null ? eDDInputFinancialDocument3.getMTextInputLayout() : null);
            lVar.f1751b = new c(eDDInputFinancialDocument, 7);
            lVar.c = isValidListener;
            mEditText.addTextChangedListener(lVar);
        }
        eDDInputFinancialDocument.setInput(obj instanceof EDDFinancialDocument ? (EDDFinancialDocument) obj : null);
        this.f14508V.add(eDDInputFinancialDocument);
        TransitionManager.beginDelayedTransition(s1(), new Fade(1));
        s1().addView(eDDInputFinancialDocument);
    }

    @OnClick({R.id.add_item_layout_pma_fragment_edd_form})
    public void onAddCompanyClick() {
        e eVarZ1 = z1();
        int size = ((AbstractBaseEDDFormFragmentImpl) ((f) eVarZ1.c.get())).f14508V.size() + 1;
        EDDSettings eDDSettingsA = eVarZ1.f20041d.a();
        if (size >= (eDDSettingsA != null ? eDDSettingsA.getMaxFinancialDocs() : 0)) {
            View view = ((AbstractBaseEDDFormFragmentImpl) ((f) eVarZ1.c.get())).mAddItemButton;
            if (view == null) {
                j.n("mAddItemButton");
                throw null;
            }
            view.setVisibility(8);
        }
        ((InterfaceC2528a) eVarZ1.c.get()).i(null, true);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14533Y = new e(aVar.p(), aVar.r());
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.fragment.impl.EDDFinancialDocumentsFragment.EDDFinancialDocumentsFragmentListener");
        this.f14534Z = (l) activity;
        z1().h(this);
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_financial_documents, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        z1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        l lVar = this.f14534Z;
        if (lVar != null) {
            ((EDDActivity) lVar).Q(this);
        }
        e eVarZ1 = z1();
        ((AbstractBaseEDDFormFragmentImpl) eVarZ1.o()).x1();
        AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl = (AbstractBaseEDDFormFragmentImpl) eVarZ1.o();
        Group group = abstractBaseEDDFormFragmentImpl.mAddItemGroup;
        if (group == null) {
            j.n("mAddItemGroup");
            throw null;
        }
        group.setVisibility(0);
        View view = abstractBaseEDDFormFragmentImpl.mAddItemButton;
        if (view != null) {
            view.setVisibility(0);
        } else {
            j.n("mAddItemButton");
            throw null;
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
            j.e(jVar, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument");
            arrayList2.add(((EDDInputFinancialDocument) jVar).getEDDFinancialDocument());
        }
        bundle.putParcelableArrayList("items", new ArrayList<>(arrayList2));
    }

    public final e z1() {
        e eVar = this.f14533Y;
        if (eVar != null) {
            return eVar;
        }
        j.n("mEDDFinancialDocumentsFragmentPresenter");
        throw null;
    }
}
