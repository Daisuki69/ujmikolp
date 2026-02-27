package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.p;
import F7.o;
import G7.B;
import Kh.I;
import Lh.c;
import W4.a;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.PersonalizationGiphy;
import com.paymaya.domain.model.PersonalizationPayMaya;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import kotlin.jvm.internal.j;
import sd.AbstractC2252a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserActivitySendMoneyFragment extends MayaAbstractBaseUserActivityFragmentImpl implements o {
    public p u0;

    public static final void Y1(MayaUserActivitySendMoneyFragment mayaUserActivitySendMoneyFragment) {
        PersonalizationPayMaya mayaDecoration;
        String mId;
        PersonalizationGiphy gifDecoration;
        p pVarX1 = mayaUserActivitySendMoneyFragment.X1();
        UserActivity userActivityM1 = ((MayaAbstractBaseUserActivityFragmentImpl) ((o) pVarX1.c.get())).M1();
        if (userActivityM1 != null) {
            TransferPersonalizationMeta transferPersonalizationMetaMTransferPersonalizationMeta = userActivityM1.mTransferPersonalizationMeta();
            String decorationId = null;
            String gifId = (transferPersonalizationMetaMTransferPersonalizationMeta == null || (gifDecoration = transferPersonalizationMetaMTransferPersonalizationMeta.getGifDecoration()) == null) ? null : gifDecoration.getGifId();
            if (gifId == null || gifId.length() == 0) {
                o oVar = (o) pVarX1.c.get();
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
                ((MayaUserActivitySendMoneyFragment) oVar).Z1(enumC1212a, decorationId);
            } else {
                ((MayaUserActivitySendMoneyFragment) ((o) pVarX1.c.get())).Z1(EnumC1212a.GIF_ID, gifId);
            }
            y5.p pVar = ((MayaAbstractBaseUserActivityFragmentImpl) ((o) pVarX1.c.get())).t0;
            if (pVar != null) {
                ((MayaTransactionsActivity) pVar).Y1(userActivityM1, false);
            }
        }
    }

    @Override // F7.n
    public final String E0() {
        String string = getString(R.string.maya_label_account_name);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final AbstractC2252a G1() {
        return X1();
    }

    @Override // F7.n
    public final String R0() {
        String string = getString(R.string.maya_label_account_number);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final void S1() {
        int iHashCode;
        super.S1();
        p pVarX1 = X1();
        UserActivity userActivityM1 = ((MayaAbstractBaseUserActivityFragmentImpl) ((o) pVarX1.c.get())).M1();
        if (userActivityM1 == null) {
            MayaUserActivitySendMoneyFragment mayaUserActivitySendMoneyFragment = (MayaUserActivitySendMoneyFragment) ((o) pVarX1.c.get());
            mayaUserActivitySendMoneyFragment.U1(mayaUserActivitySendMoneyFragment.getString(R.string.maya_label_share_receipt), null);
            return;
        }
        String strMMethod = userActivityM1.mMethod();
        if (strMMethod == null || ((iHashCode = strMMethod.hashCode()) == 605263820 ? !strMMethod.equals("SMP2PCONDB") : !(iHashCode == 1073689859 && strMMethod.equals("MONEYINDB")))) {
            MayaUserActivitySendMoneyFragment mayaUserActivitySendMoneyFragment2 = (MayaUserActivitySendMoneyFragment) ((o) pVarX1.c.get());
            mayaUserActivitySendMoneyFragment2.U1(mayaUserActivitySendMoneyFragment2.getString(R.string.maya_label_share_receipt), null);
            return;
        }
        o oVar = (o) pVarX1.c.get();
        Amount amountMAmount = userActivityM1.mAmount();
        String currencyFormattedValue = amountMAmount != null ? amountMAmount.getCurrencyFormattedValue() : null;
        if (currencyFormattedValue == null) {
            currencyFormattedValue = "";
        }
        ActivityDescription activityDescriptionMDescription = userActivityM1.mDescription();
        String strMTarget = activityDescriptionMDescription != null ? activityDescriptionMDescription.mTarget() : null;
        String str = strMTarget != null ? strMTarget : "";
        String parsedReferenceNoWithSpaces = userActivityM1.getParsedReferenceNoWithSpaces();
        j.f(parsedReferenceNoWithSpaces, "getParsedReferenceNoWithSpaces(...)");
        String strF = AbstractC1234x.f(AbstractC1234x.b(userActivityM1.mTimestamp()));
        j.f(strF, "formatDateMayaUserActivity(...)");
        MayaUserActivitySendMoneyFragment mayaUserActivitySendMoneyFragment3 = (MayaUserActivitySendMoneyFragment) oVar;
        mayaUserActivitySendMoneyFragment3.getClass();
        mayaUserActivitySendMoneyFragment3.U1(mayaUserActivitySendMoneyFragment3.getString(R.string.maya_label_share_receipt), mayaUserActivitySendMoneyFragment3.getString(R.string.maya_label_share_user_activity_send_money, currencyFormattedValue, str, parsedReferenceNoWithSpaces, strF));
    }

    public final p X1() {
        p pVar = this.u0;
        if (pVar != null) {
            return pVar;
        }
        j.n("mSendMoneyFragmentPresenter");
        throw null;
    }

    public final void Z1(EnumC1212a enumC1212a, String str) {
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.SEND_MONEY);
        c1219h.n(17);
        c1219h.t(EnumC1217f.PREVIEW);
        c1219h.j.put(enumC1212a.f10691a, str);
        z1(c1219h);
    }

    @Override // F7.n
    public final String o() {
        String string = getString(R.string.maya_label_receipt_invoice_number);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = (B) getActivity();
        c cVarB = a.e().b();
        O5.a aVar = (O5.a) cVarB.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        ((I) cVarB.f2990b).getClass();
        this.u0 = new p(7);
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
        ConstraintLayout constraintLayout = this.f10312j0;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new Ba.a(this, 7));
        } else {
            j.n("mViewDecoratedMessageContainer");
            throw null;
        }
    }

    @Override // F7.n
    public final String p() {
        String string = getString(R.string.maya_label_receipt_trace_number);
        j.f(string, "getString(...)");
        return string;
    }

    @Override // F7.n
    public final String t() {
        String string = getString(R.string.maya_label_receipt_account_type);
        j.f(string, "getString(...)");
        return string;
    }
}
