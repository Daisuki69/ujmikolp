package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.p;
import F7.j;
import G7.y;
import Kh.I;
import Lh.c;
import W4.a;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.PersonalizationGiphy;
import com.paymaya.domain.model.PersonalizationPayMaya;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import sd.AbstractC2252a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserActivityMoneyInFragment extends MayaAbstractBaseUserActivityFragmentImpl implements j {
    public p u0;

    public static final void Y1(MayaUserActivityMoneyInFragment mayaUserActivityMoneyInFragment) {
        PersonalizationPayMaya mayaDecoration;
        String mId;
        PersonalizationGiphy gifDecoration;
        p pVarX1 = mayaUserActivityMoneyInFragment.X1();
        UserActivity userActivityM1 = ((MayaAbstractBaseUserActivityFragmentImpl) ((j) pVarX1.c.get())).M1();
        if (userActivityM1 != null) {
            TransferPersonalizationMeta transferPersonalizationMetaMTransferPersonalizationMeta = userActivityM1.mTransferPersonalizationMeta();
            String decorationId = null;
            String gifId = (transferPersonalizationMetaMTransferPersonalizationMeta == null || (gifDecoration = transferPersonalizationMetaMTransferPersonalizationMeta.getGifDecoration()) == null) ? null : gifDecoration.getGifId();
            if (gifId == null || gifId.length() == 0) {
                j jVar = (j) pVarX1.c.get();
                EnumC1212a enumC1212a = EnumC1212a.THEME_ID;
                Decoration decorationMDecoration = userActivityM1.mDecoration();
                if (decorationMDecoration == null || (mId = decorationMDecoration.getMId()) == null) {
                    TransferPersonalizationMeta transferPersonalizationMetaMTransferPersonalizationMeta2 = userActivityM1.mTransferPersonalizationMeta();
                    if (transferPersonalizationMetaMTransferPersonalizationMeta2 != null && (mayaDecoration = transferPersonalizationMetaMTransferPersonalizationMeta2.getMayaDecoration()) != null) {
                        decorationId = mayaDecoration.getDecorationId();
                    }
                } else {
                    decorationId = mId;
                }
                ((MayaUserActivityMoneyInFragment) jVar).Z1(enumC1212a, decorationId);
            } else {
                ((MayaUserActivityMoneyInFragment) ((j) pVarX1.c.get())).Z1(EnumC1212a.GIF_ID, gifId);
            }
            y5.p pVar = ((MayaAbstractBaseUserActivityFragmentImpl) ((j) pVarX1.c.get())).t0;
            if (pVar != null) {
                ((MayaTransactionsActivity) pVar).Y1(userActivityM1, true);
            }
        }
    }

    @Override // F7.n
    public final String E0() {
        String string = getString(R.string.maya_label_account_name);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final AbstractC2252a G1() {
        return X1();
    }

    @Override // F7.m
    public final String I0() {
        String string = getString(R.string.maya_label_receipt_bank_name);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.m
    public final String M0() {
        String string = getString(R.string.maya_label_receipt_merchant_id);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.p
    public final String O0() {
        String string = getString(R.string.maya_label_receipt_recipient);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.n
    public final String R0() {
        String string = getString(R.string.maya_label_account_number);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final void S1() {
        super.S1();
        U1(getString(R.string.maya_label_share_receipt), null);
    }

    @Override // F7.m
    public final String W0() {
        String string = getString(R.string.maya_label_receipt_paid_using);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    public final p X1() {
        p pVar = this.u0;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.j.n("mMoneyInFragmentPresenter");
        throw null;
    }

    public final void Z1(EnumC1212a enumC1212a, String str) {
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.RECEIVE_MONEY);
        c1219h.n(17);
        c1219h.t(EnumC1217f.PREVIEW);
        c1219h.j.put(enumC1212a.f10691a, str);
        z1(c1219h);
    }

    @Override // F7.m, F7.p, F7.e
    public final String n() {
        String string = getString(R.string.maya_label_receipt_payment_id);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.m, F7.n
    public final String o() {
        String string = getString(R.string.maya_label_receipt_invoice_number);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = (y) getActivity();
        c cVarB = a.e().b();
        O5.a aVar = (O5.a) cVarB.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        ((I) cVarB.f2990b).getClass();
        this.u0 = new p(4);
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
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        X1().j();
        ConstraintLayout constraintLayout = this.f10312j0;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new Ba.a(this, 6));
        } else {
            kotlin.jvm.internal.j.n("mViewDecoratedMessageContainer");
            throw null;
        }
    }

    @Override // F7.m, F7.n
    public final String p() {
        String string = getString(R.string.maya_label_receipt_trace_number);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.p
    public final String p0() {
        String string = getString(R.string.maya_label_receipt_product_name);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.n
    public final String t() {
        String string = getString(R.string.maya_label_receipt_account_type);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        return string;
    }
}
