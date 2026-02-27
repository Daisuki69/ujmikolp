package G6;

import L6.A;
import L6.B;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.RedirectUrls;
import com.paymaya.domain.model.Success;
import com.paymaya.domain.store.S0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInWebFragment;
import d4.AbstractC1331a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S0 f1815d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1816g;
    public String h;
    public boolean i;

    public t(S0 s02, Uh.d dVar) {
        super(dVar);
        this.f1815d = s02;
    }

    @Override // y5.AbstractC2509a
    public final void h(Object obj) {
        K6.m view = (K6.m) obj;
        kotlin.jvm.internal.j.g(view, "view");
        super.h(view);
        this.e = true;
    }

    @Override // y5.AbstractC2509a
    public final void i() {
        super.i();
        this.e = false;
    }

    public final void k() {
        ((MayaCashInWebFragment) ((K6.m) this.c.get())).O1();
        Ah.p<Success> pVarRefreshToken = this.f1815d.f11388d.refreshToken();
        e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarRefreshToken, pVarRefreshToken, zh.b.a()), new V2.c(this, 29), 2), new A5.l(this, 26), 0).e());
    }

    public final void l(BankPullPaymentOption bankPullPaymentOption, boolean z4) {
        j();
        ((MayaCashInWebFragment) ((K6.m) this.c.get())).S1(0);
        if (z4) {
            k();
        } else {
            MayaCashInWebFragment mayaCashInWebFragment = (MayaCashInWebFragment) ((K6.m) this.c.get());
            MayaBaseLoadingFragment.N1(mayaCashInWebFragment, 100, mayaCashInWebFragment.getString(R.string.maya_label_that_didnt_load_right), null, new A(mayaCashInWebFragment, 1), 28);
            ProgressBar progressBar = ((MayaCashInWebFragment) ((K6.m) this.c.get())).f11758q0;
            if (progressBar == null) {
                kotlin.jvm.internal.j.n("mWebPageProgressBar");
                throw null;
            }
            progressBar.setVisibility(8);
        }
        if (bankPullPaymentOption == null) {
            MayaCashInWebFragment mayaCashInWebFragment2 = (MayaCashInWebFragment) ((K6.m) this.c.get());
            B b8 = mayaCashInWebFragment2.t0;
            if (b8 != null) {
                String string = mayaCashInWebFragment2.getString(R.string.maya_label_cash_in_title);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                ((MayaCashInActivity) b8).K1(string);
                return;
            }
            return;
        }
        K6.m mVar = (K6.m) this.c.get();
        String name = bankPullPaymentOption.getName();
        MayaCashInWebFragment mayaCashInWebFragment3 = (MayaCashInWebFragment) mVar;
        mayaCashInWebFragment3.getClass();
        kotlin.jvm.internal.j.g(name, "name");
        B b10 = mayaCashInWebFragment3.t0;
        if (b10 != null) {
            ((MayaCashInActivity) b10).K1(name);
        }
    }

    public final void m(String str) {
        if (this.f1816g) {
            return;
        }
        this.f1816g = true;
        ExecutePullFunds executePullFundsP1 = ((MayaCashInWebFragment) ((K6.m) this.c.get())).P1();
        RedirectUrls redirectUrlsMRedirectUrls = executePullFundsP1 != null ? executePullFundsP1.mRedirectUrls() : null;
        if (kotlin.jvm.internal.j.b(str, redirectUrlsMRedirectUrls != null ? redirectUrlsMRedirectUrls.mSuccess() : null)) {
            Bundle arguments = ((MayaCashInWebFragment) ((K6.m) this.c.get())).getArguments();
            if ((arguments != null ? (BankPullPaymentOption) arguments.getParcelable("paymentOption") : null) == null) {
                MayaCashInWebFragment mayaCashInWebFragment = (MayaCashInWebFragment) ((K6.m) this.c.get());
                mayaCashInWebFragment.getClass();
                C1219h c1219h = new C1219h();
                c1219h.n(14);
                c1219h.t(EnumC1217f.VIA_CARD_3DS);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("attribution", mayaCashInWebFragment.n1().f10371a);
                c1219h.i();
                mayaCashInWebFragment.A1(c1219h);
                B b8 = mayaCashInWebFragment.t0;
                if (b8 != null) {
                    ExecutePullFunds executePullFunds = mayaCashInWebFragment.u0;
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) b8;
                    AbstractC1236z.e(mayaCashInActivity, MayaCashInViaCardConfirmationFragment.class, false);
                    mayaCashInActivity.d2(executePullFunds);
                    return;
                }
                return;
            }
            MayaCashInWebFragment mayaCashInWebFragment2 = (MayaCashInWebFragment) ((K6.m) this.c.get());
            mayaCashInWebFragment2.getClass();
            C1219h c1219h2 = new C1219h();
            c1219h2.n(14);
            c1219h2.t(EnumC1217f.T_3DS);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219h2.j.put("attribution", mayaCashInWebFragment2.n1().f10371a);
            BankPullPaymentOption bankPullPaymentOption = mayaCashInWebFragment2.f11761v0;
            c1219h2.j.put("bank", bankPullPaymentOption != null ? bankPullPaymentOption.getId() : null);
            c1219h2.i();
            mayaCashInWebFragment2.A1(c1219h2);
            B b10 = mayaCashInWebFragment2.t0;
            if (b10 != null) {
                ExecutePullFunds executePullFunds2 = mayaCashInWebFragment2.u0;
                BankPullPaymentOption bankPullPaymentOption2 = mayaCashInWebFragment2.f11761v0;
                MayaCashInActivity mayaCashInActivity2 = (MayaCashInActivity) b10;
                AbstractC1236z.e(mayaCashInActivity2, MayaBankPullConfirmationFragment.class, false);
                String string = mayaCashInActivity2.getString(R.string.maya_label_youre_almost_there);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                String string2 = mayaCashInActivity2.getString(R.string.maya_label_bank_pull_processing);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                mayaCashInActivity2.Y1(R.drawable.maya_ic_processing_white, string, string2, executePullFunds2, bankPullPaymentOption2, new I6.e(2, mayaCashInActivity2, MayaCashInActivity.class, "showViaBankWebReceiptProcessing", "showViaBankWebReceiptProcessing(Lcom/paymaya/domain/model/ExecutePullFunds;Lcom/paymaya/domain/model/BankPullPaymentOption;)V", 0, 1));
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.j.b(str, redirectUrlsMRedirectUrls != null ? redirectUrlsMRedirectUrls.mFailure() : null)) {
            Bundle arguments2 = ((MayaCashInWebFragment) ((K6.m) this.c.get())).getArguments();
            if ((arguments2 != null ? (BankPullPaymentOption) arguments2.getParcelable("paymentOption") : null) == null) {
                MayaCashInWebFragment mayaCashInWebFragment3 = (MayaCashInWebFragment) ((K6.m) this.c.get());
                mayaCashInWebFragment3.getClass();
                C1219h c1219h3 = new C1219h();
                c1219h3.n(12);
                c1219h3.t(EnumC1217f.VIA_CARD_3DS);
                c1219h3.i();
                mayaCashInWebFragment3.A1(c1219h3);
                B b11 = mayaCashInWebFragment3.t0;
                if (b11 != null) {
                    ExecutePullFunds executePullFunds3 = mayaCashInWebFragment3.u0;
                    MayaCashInActivity mayaCashInActivity3 = (MayaCashInActivity) b11;
                    Fragment fragmentFindFragmentByTag = mayaCashInActivity3.getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(mayaCashInActivity3, MayaCashInViaCardConfirmationFragment.class));
                    if (executePullFunds3 != null && fragmentFindFragmentByTag != null) {
                        MayaCashInViaCardConfirmationFragment mayaCashInViaCardConfirmationFragment = (MayaCashInViaCardConfirmationFragment) fragmentFindFragmentByTag;
                        mayaCashInViaCardConfirmationFragment.f11727e0 = true;
                        mayaCashInViaCardConfirmationFragment.f11728f0 = executePullFunds3;
                    }
                    AbstractC1236z.e(mayaCashInActivity3, MayaCashInViaCardConfirmationFragment.class, false);
                    return;
                }
                return;
            }
            MayaCashInWebFragment mayaCashInWebFragment4 = (MayaCashInWebFragment) ((K6.m) this.c.get());
            mayaCashInWebFragment4.getClass();
            C1219h c1219h4 = new C1219h();
            c1219h4.n(12);
            c1219h4.t(EnumC1217f.T_3DS);
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            BankPullPaymentOption bankPullPaymentOption3 = mayaCashInWebFragment4.f11761v0;
            c1219h4.j.put("bank", bankPullPaymentOption3 != null ? bankPullPaymentOption3.getId() : null);
            c1219h4.i();
            mayaCashInWebFragment4.A1(c1219h4);
            B b12 = mayaCashInWebFragment4.t0;
            if (b12 != null) {
                ExecutePullFunds executePullFunds4 = mayaCashInWebFragment4.u0;
                BankPullPaymentOption bankPullPaymentOption4 = mayaCashInWebFragment4.f11761v0;
                MayaCashInActivity mayaCashInActivity4 = (MayaCashInActivity) b12;
                AbstractC1236z.e(mayaCashInActivity4, MayaBankPullConfirmationFragment.class, false);
                String string3 = mayaCashInActivity4.getString(R.string.maya_label_cash_in_failed_title);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                String string4 = mayaCashInActivity4.getString(R.string.maya_label_cash_in_via_bank_failed_description);
                kotlin.jvm.internal.j.f(string4, "getString(...)");
                mayaCashInActivity4.Y1(R.drawable.maya_ic_failed, string3, string4, executePullFunds4, bankPullPaymentOption4, new I6.e(2, mayaCashInActivity4, MayaCashInActivity.class, "showViaBankWebReceiptFailed", "showViaBankWebReceiptFailed(Lcom/paymaya/domain/model/ExecutePullFunds;Lcom/paymaya/domain/model/BankPullPaymentOption;)V", 0, 0));
            }
        }
    }
}
