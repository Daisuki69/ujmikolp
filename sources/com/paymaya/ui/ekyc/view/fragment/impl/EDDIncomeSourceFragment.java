package com.paymaya.ui.ekyc.view.fragment.impl;

import B5.i;
import O5.a;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import butterknife.OnClick;
import cj.C1110A;
import cj.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.EDDOptionInput;
import com.paymaya.domain.model.EDDSettings;
import com.paymaya.domain.model.IncomeSource;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.widget.EDDOptionsInput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import rd.InterfaceC2200a;
import sd.d;
import yd.InterfaceC2528a;
import yd.g;
import zd.m;

/* JADX INFO: loaded from: classes4.dex */
public class EDDIncomeSourceFragment extends AbstractBaseEDDFormFragmentImpl<g> implements g, Bd.g {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public d f14536Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public m f14537Z;

    @Override // Bd.g
    public final void Q0(EDDOptionsInput eDDOptionsInput) {
        this.f14508V.remove(eDDOptionsInput);
        s1().removeView(eDDOptionsInput);
        d dVarZ1 = z1();
        int size = ((AbstractBaseEDDFormFragmentImpl) ((g) dVarZ1.c.get())).f14508V.size();
        EDDSettings eDDSettingsA = dVarZ1.e.a();
        if (size < (eDDSettingsA != null ? eDDSettingsA.getMaxAlternativeIncomeSources() : 5)) {
            View view = ((AbstractBaseEDDFormFragmentImpl) ((g) dVarZ1.c.get())).mAddItemButton;
            if (view != null) {
                view.setVisibility(0);
            } else {
                j.n("mAddItemButton");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.ALTERNATIVE_SOURCES_OF_INCOME;
    }

    @Override // yd.InterfaceC2528a
    public final void i(Object obj, boolean z4) {
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        EDDOptionsInput eDDOptionsInput = new EDDOptionsInput(contextRequireContext);
        String string = getString(R.string.pma_hint_edd_choose_one);
        j.f(string, "getString(...)");
        String string2 = getString(R.string.pma_hint_edd_income_source);
        j.f(string2, "getString(...)");
        eDDOptionsInput.e(string, string2, z4, this);
        Bd.j jVar = (Bd.j) C1110A.B(this.f14508V);
        EDDOptionsInput eDDOptionsInput2 = jVar instanceof EDDOptionsInput ? (EDDOptionsInput) jVar : null;
        if (eDDOptionsInput2 == null) {
            eDDOptionsInput2 = eDDOptionsInput;
        }
        eDDOptionsInput.setFirstItem(eDDOptionsInput2);
        String string3 = getString(R.string.pma_item_edd_others_prefix);
        j.f(string3, "getString(...)");
        eDDOptionsInput.setPrefix(string3);
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
        List listUnmodifiableList;
        ArrayList<Bd.j> arrayList = this.f14508V;
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        for (Bd.j jVar : arrayList) {
            j.e(jVar, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.widget.EDDOptionsInput");
            arrayList2.add(String.valueOf(((EDDOptionsInput) jVar).getMOptionsEditText().getText()));
        }
        m mVar = this.f14537Z;
        if (mVar != null) {
            EDDActivity eDDActivity = (EDDActivity) mVar;
            Cursor cursorQuery = eDDActivity.t1().e.f11433b.f11323a.f2812a.query(String.format("SELECT * FROM %1$s ORDER BY %2$s", "income_source_v2", AppMeasurementSdk.ConditionalUserProperty.NAME));
            if (cursorQuery.moveToFirst()) {
                ArrayList arrayList3 = new ArrayList(cursorQuery.getCount());
                int columnIndex = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                do {
                    arrayList3.add(IncomeSource.sBuilder().mName(cursorQuery.getString(columnIndex)).build());
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
            } else {
                cursorQuery.close();
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            j.f(listUnmodifiableList, "getIncomeSources(...)");
            List list = listUnmodifiableList;
            ArrayList arrayList4 = new ArrayList(t.l(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList4.add(((IncomeSource) it.next()).mName());
            }
            i iVar = eDDActivity.e;
            String string = eDDActivity.getString(R.string.pma_label_edd_income_source);
            ArrayList arrayList5 = new ArrayList(arrayList4);
            ArrayList arrayList6 = new ArrayList(arrayList2);
            iVar.getClass();
            i.o(eDDActivity, i, string, arrayList5, arrayList6, false);
        }
    }

    @OnClick({R.id.add_item_layout_pma_fragment_edd_form})
    public void onAddIncomeSourceClicked() {
        d dVarZ1 = z1();
        int size = ((AbstractBaseEDDFormFragmentImpl) ((g) dVarZ1.c.get())).f14508V.size() + 1;
        EDDSettings eDDSettingsA = dVarZ1.e.a();
        if (size >= (eDDSettingsA != null ? eDDSettingsA.getMaxAlternativeIncomeSources() : 5)) {
            View view = ((AbstractBaseEDDFormFragmentImpl) ((g) dVarZ1.c.get())).mAddItemButton;
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
        this.f14537Z = (m) getActivity();
        a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14536Y = new d(aVar.p(), 1);
        z1().h(this);
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_income_source, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        z1().i();
        EDDOptionsInput.i = 0;
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m mVar = this.f14537Z;
        if (mVar != null) {
            ((EDDActivity) mVar).Q(this);
        }
    }

    @Override // com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl, com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
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
            j.e(jVar, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.widget.EDDOptionsInput");
            arrayList2.add(((EDDOptionsInput) jVar).getInputAsEDDOptionInput());
        }
        bundle.putParcelableArrayList("items", new ArrayList<>(arrayList2));
    }

    public final d z1() {
        d dVar = this.f14536Y;
        if (dVar != null) {
            return dVar;
        }
        j.n("mEDDIncomeSourceFragmentPresenter");
        throw null;
    }
}
