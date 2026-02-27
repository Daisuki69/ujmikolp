package G6;

import D8.C0214w;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.PullFundsDetails;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardConfirmationFragment;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0214w f1810b;
    public final /* synthetic */ ExecutePullFunds c;

    public /* synthetic */ q(C0214w c0214w, ExecutePullFunds executePullFunds, int i) {
        this.f1809a = i;
        this.f1810b = c0214w;
        this.c = executePullFunds;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f1809a) {
            case 0:
                PullFundsDetails pullFundsDetails = (PullFundsDetails) obj;
                kotlin.jvm.internal.j.g(pullFundsDetails, "pullFundsDetails");
                C0214w c0214w = this.f1810b;
                ExecutePullFunds executePullFunds = this.c;
                c0214w.getClass();
                kotlin.jvm.internal.j.g(executePullFunds, "executePullFunds");
                ((MayaBaseFragment) ((K6.k) c0214w.c.get())).w1();
                String errorSpiel = pullFundsDetails.getErrorSpiel();
                if (errorSpiel == null || C2576A.H(errorSpiel)) {
                    ((MayaCashInViaCardConfirmationFragment) ((K6.k) c0214w.c.get())).I1(executePullFunds);
                } else {
                    MayaCashInViaCardConfirmationFragment mayaCashInViaCardConfirmationFragment = (MayaCashInViaCardConfirmationFragment) ((K6.k) c0214w.c.get());
                    mayaCashInViaCardConfirmationFragment.getClass();
                    L6.t tVar = mayaCashInViaCardConfirmationFragment.f11730h0;
                    if (tVar != null) {
                        MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) tVar;
                        String string = mayaCashInActivity.getString(R.string.maya_label_cash_in_failed_title);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        mayaCashInActivity.Z1(R.drawable.maya_ic_failed, string, errorSpiel, executePullFunds, new Ag.f(1, mayaCashInActivity, MayaCashInActivity.class, "showViaCardWebReceiptFailed", "showViaCardWebReceiptFailed(Lcom/paymaya/domain/model/ExecutePullFunds;)V", 0, 23));
                    }
                }
                break;
            default:
                C0214w c0214w2 = this.f1810b;
                ExecutePullFunds executePullFunds2 = this.c;
                kotlin.jvm.internal.j.f(c0214w2.f((Throwable) obj, true), "mayaErrorHandling(...)");
                kotlin.jvm.internal.j.g(executePullFunds2, "executePullFunds");
                ((MayaBaseFragment) ((K6.k) c0214w2.c.get())).w1();
                ((MayaCashInViaCardConfirmationFragment) ((K6.k) c0214w2.c.get())).I1(executePullFunds2);
                break;
        }
    }
}
