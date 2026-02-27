package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.p;
import F7.q;
import G7.C;
import Kh.I;
import Lh.c;
import W4.a;
import android.os.Bundle;
import android.view.View;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import kotlin.jvm.internal.j;
import sd.AbstractC2252a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserActivitySystemAlertFragment extends MayaAbstractBaseUserActivityFragmentImpl implements q {
    public p u0;

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final AbstractC2252a G1() {
        p pVar = this.u0;
        if (pVar != null) {
            return pVar;
        }
        j.n("mSystemAlertFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = (C) getActivity();
        c cVarB = a.e().b();
        O5.a aVar = (O5.a) cVarB.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        ((I) cVarB.f2990b).getClass();
        this.u0 = new p(8);
        G1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f10297U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        y5.p pVar = this.t0;
        if (pVar != null) {
            ((MayaTransactionsActivity) pVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        ((p) G1()).j();
    }
}
