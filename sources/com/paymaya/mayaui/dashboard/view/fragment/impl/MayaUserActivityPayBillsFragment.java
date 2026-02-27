package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.p;
import F7.k;
import G7.z;
import J5.a;
import Kh.I;
import Lh.c;
import android.os.Bundle;
import android.view.View;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import sd.AbstractC2252a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserActivityPayBillsFragment extends MayaAbstractBaseUserActivityFragmentImpl implements k {
    public p u0;

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final AbstractC2252a G1() {
        return X1();
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final void S1() {
        super.S1();
        p pVarX1 = X1();
        UserActivity userActivityM1 = ((MayaAbstractBaseUserActivityFragmentImpl) ((k) pVarX1.c.get())).M1();
        if (userActivityM1 != null) {
            Amount amountMAmount = userActivityM1.mAmount();
            String strValueOf = String.valueOf(amountMAmount != null ? amountMAmount.getCurrencyFormattedValue() : null);
            ActivityDescription activityDescriptionMDescription = userActivityM1.mDescription();
            String strMTarget = activityDescriptionMDescription != null ? activityDescriptionMDescription.mTarget() : null;
            String strF = AbstractC1234x.f(AbstractC1234x.b(userActivityM1.mTimestamp()));
            Biller biller = (Biller) ((HashMap) a.c().f2414b).get(userActivityM1.mBillerslug());
            if (biller != null) {
                strMTarget = biller.mName();
            }
            if (!userActivityM1.isBillsPayMethod(false) || (!"authorized".equals(userActivityM1.mStatus()) && !"posted".equals(userActivityM1.mStatus()))) {
                MayaUserActivityPayBillsFragment mayaUserActivityPayBillsFragment = (MayaUserActivityPayBillsFragment) ((k) pVarX1.c.get());
                mayaUserActivityPayBillsFragment.U1(mayaUserActivityPayBillsFragment.getString(R.string.maya_label_share_receipt), null);
            } else {
                MayaUserActivityPayBillsFragment mayaUserActivityPayBillsFragment2 = (MayaUserActivityPayBillsFragment) ((k) pVarX1.c.get());
                mayaUserActivityPayBillsFragment2.U1(mayaUserActivityPayBillsFragment2.getString(R.string.maya_label_share_receipt), mayaUserActivityPayBillsFragment2.getString(R.string.maya_pay_bill_label_share_authorized, strValueOf, strMTarget, userActivityM1.getParsedReferenceNoWithSpaces(), strF));
            }
        }
    }

    public final p X1() {
        p pVar = this.u0;
        if (pVar != null) {
            return pVar;
        }
        j.n("mPayBillsFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVarB = W4.a.e().b();
        O5.a aVar = (O5.a) cVarB.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        ((I) cVarB.f2990b).getClass();
        this.u0 = new p(5);
        this.t0 = (z) getActivity();
        X1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        X1().i();
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
        X1().j();
    }
}
