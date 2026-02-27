package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D8.M;
import J8.k;
import J8.n;
import K8.F;
import M8.AbstractC0367i2;
import M8.C0332a;
import M8.C0363h2;
import M8.M1;
import M8.X1;
import N5.C0479t;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBindingBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.data.preference.a;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycFormSections;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.KycSelectionModel;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycSingleSelectionBottomSheetDialogFragment extends MayaBaseBindingBottomSheetDialogFragment<C0479t> implements F {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public M f12609U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public k f12610V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public a f12611W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final InterfaceC1033d f12612X;

    public MayaKycSingleSelectionBottomSheetDialogFragment() {
        super(C0363h2.f3311a);
        this.f12612X = C1034e.b(new C0332a(this, 8));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10325B = (C1220i) aVar.f4716g.get();
        this.f12609U = new M();
        this.f12611W = (a) aVar.e.get();
        M m = this.f12609U;
        if (m == null) {
            j.n("mPresenter");
            throw null;
        }
        m.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        M m = this.f12609U;
        if (m == null) {
            j.n("mPresenter");
            throw null;
        }
        m.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        KycFieldType type;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0479t c0479t = (C0479t) s1();
        KycSelectionModel kycSelectionModelT1 = t1();
        c0479t.e.setText(kycSelectionModelT1 != null ? kycSelectionModelT1.getHeaderTextRes() : 0);
        KycSelectionModel kycSelectionModelT12 = t1();
        String formSectionName = (kycSelectionModelT12 == null || (type = kycSelectionModelT12.getType()) == null) ? null : type.getFormSectionName();
        a aVar = this.f12611W;
        if (aVar == null) {
            j.n("mPreference");
            throw null;
        }
        if (aVar.e().isKycUxTofuRedesignEnabled() && u1()) {
            ((C0479t) s1()).f.setVisibility(0);
            ((C0479t) s1()).f.setText(formSectionName);
        }
        a aVar2 = this.f12611W;
        if (aVar2 == null) {
            j.n("mPreference");
            throw null;
        }
        if (aVar2.e().isShortenedFlowAddressDropdownEnabled()) {
            KycSelectionModel kycSelectionModelT13 = t1();
            if (kycSelectionModelT13 != null) {
                switch (AbstractC0367i2.f3316a[kycSelectionModelT13.getType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        ((C0479t) s1()).f4211b.setVisibility(0);
                        break;
                }
            }
            a aVar3 = this.f12611W;
            if (aVar3 == null) {
                j.n("mPreference");
                throw null;
            }
            if (aVar3.e().isKycUxTofuRedesignEnabled() && u1()) {
                ((C0479t) s1()).f4211b.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.maya_ic_search_light, 0);
            }
        }
        C0479t c0479t2 = (C0479t) s1();
        KycSelectionModel kycSelectionModelT14 = t1();
        List<KycSelectionItem> items = kycSelectionModelT14 != null ? kycSelectionModelT14.getItems() : null;
        if (items == null) {
            items = C1112C.f9377a;
        }
        KycSelectionModel kycSelectionModelT15 = t1();
        Integer numValueOf = kycSelectionModelT15 != null ? Integer.valueOf(kycSelectionModelT15.getSelectedId()) : null;
        M m = this.f12609U;
        if (m == null) {
            j.n("mPresenter");
            throw null;
        }
        k kVar = new k(items, numValueOf, new M1(1, m, M.class, "onItemSelected", "onItemSelected(Lcom/paymaya/domain/model/KycSelectionItem;)V", 0, 3), this);
        this.f12610V = kVar;
        RecyclerView recyclerView = c0479t2.f4212d;
        recyclerView.setAdapter(kVar);
        recyclerView.addItemDecoration(new n(recyclerView.getResources().getDimensionPixelSize(R.dimen.maya_margin_medium), 0, recyclerView.getResources().getDimensionPixelSize(R.dimen.maya_margin_large), 2));
        ((C0479t) s1()).f4211b.addTextChangedListener(new G5.F(this, 4));
        ((C0479t) s1()).f4211b.setOnTouchListener(new X1(this, 1));
    }

    public final KycSelectionModel t1() {
        return (KycSelectionModel) this.f12612X.getValue();
    }

    public final boolean u1() {
        KycFieldType type;
        KycSelectionModel kycSelectionModelT1 = t1();
        return C1110A.v(C1132s.g(KycFormSections.CURRENT_ADDRESS, KycFormSections.PERMANENT_ADDRESS, KycFormSections.PLACE_OF_BIRTH), (kycSelectionModelT1 == null || (type = kycSelectionModelT1.getType()) == null) ? null : type.getFormSectionName());
    }
}
