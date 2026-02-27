package Q9;

import a.AbstractC0617a;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import defpackage.AbstractC1414e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewMayaCreditEnhancedActivationFragment f5343b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5344d;

    public /* synthetic */ z(NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment, int i, int i4, int i6) {
        this.f5342a = i6;
        this.f5343b = newMayaCreditEnhancedActivationFragment;
        this.c = i;
        this.f5344d = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5342a) {
            case 0:
                NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = this.f5343b;
                int i = this.c;
                int i4 = this.f5344d;
                C1220i c1220iO1 = newMayaCreditEnhancedActivationFragment.o1();
                FragmentActivity activity = newMayaCreditEnhancedActivationFragment.getActivity();
                C1219h c1219hD = C1219h.d(newMayaCreditEnhancedActivationFragment.u1());
                c1219hD.r(EnumC1216e.CONFIRM_BILL_END_DATE);
                c1219hD.n(17);
                AbstractC1414e.n(c1219hD, EnumC1217f.CONFIRM, c1220iO1, activity, c1219hD);
                L9.s sVarH1 = newMayaCreditEnhancedActivationFragment.H1();
                sVarH1.m = i;
                sVarH1.f2915n = i4;
                CreditReviewUiModel creditReviewUiModel = sVarH1.h;
                creditReviewUiModel.c = i4 > 0 ? AbstractC0617a.A(i4) : null;
                creditReviewUiModel.f13059k = sVarH1.f2915n;
                ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH1.c.get())).Q1(creditReviewUiModel);
                ((NewMayaCreditEnhancedActivationFragment) ((P9.j) sVarH1.c.get())).J1(sVarH1.k());
                break;
            default:
                NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment2 = this.f5343b;
                C1220i c1220iO12 = newMayaCreditEnhancedActivationFragment2.o1();
                FragmentActivity activity2 = newMayaCreditEnhancedActivationFragment2.getActivity();
                C1219h c1219hD2 = C1219h.d(newMayaCreditEnhancedActivationFragment2.u1());
                c1219hD2.r(EnumC1216e.CONFIRM_BILL_END_DATE);
                c1219hD2.n(17);
                AbstractC1414e.n(c1219hD2, EnumC1217f.CHANGE, c1220iO12, activity2, c1219hD2);
                newMayaCreditEnhancedActivationFragment2.H1().l(Integer.valueOf(this.c), Integer.valueOf(this.f5344d));
                break;
        }
        return Unit.f18162a;
    }
}
