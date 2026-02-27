package L9;

import N5.C0450f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.ContactReferenceData;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditAccountData;
import com.paymaya.domain.model.CreditApplication;
import com.paymaya.domain.model.CreditBillingStatement;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.Z;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import kotlin.Pair;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements Ch.f, Ch.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f2933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreditResponse f2934b;

    public /* synthetic */ x(B b8, CreditResponse creditResponse) {
        this.f2933a = b8;
        this.f2934b = creditResponse;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        CreditAccount creditAccount = (CreditAccount) obj;
        Pair pair = (Pair) obj2;
        kotlin.jvm.internal.j.g(creditAccount, "creditAccount");
        kotlin.jvm.internal.j.g(pair, "<destruct>");
        Boolean bool = (Boolean) pair.f18160a;
        bool.booleanValue();
        CreditBillingStatement creditBillingStatement = (CreditBillingStatement) pair.f18161b;
        this.f2933a.getClass();
        CreditResponse creditResponse = this.f2934b;
        creditResponse.setCreditAccount(creditAccount);
        return new CreditAccountData(creditResponse, creditAccount, new Pair(bool, creditBillingStatement));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // Ch.f
    public Object apply(Object obj) {
        Lh.f fVar;
        Ah.p<ContactReferenceData> contactReference;
        CreditApplication creditApplication = (CreditApplication) obj;
        kotlin.jvm.internal.j.g(creditApplication, "creditApplication");
        B b8 = this.f2933a;
        CreditResponse creditResponse = this.f2934b;
        b8.getClass();
        b8.f2857d.f11330b.edit().putString("key_maya_credit_status", creditApplication.getStatus()).apply();
        creditResponse.setCreditApplication(creditApplication);
        String status = creditApplication.getStatus();
        switch (status.hashCode()) {
            case -1159694117:
                if (status.equals("SUBMITTED")) {
                    b8.w();
                    return Ah.p.c(creditResponse);
                }
                break;
            case 208058887:
                if (status.equals("WRITTEN_OFF")) {
                    if (S5.c.b(b8.e, A5.b.f86X)) {
                        String loanAccountId = creditApplication.getLoanAccountId();
                        String str = loanAccountId != null ? loanAccountId : "";
                        b8.u();
                        b8.r(str);
                    }
                    return Ah.p.c(creditResponse);
                }
                break;
            case 1964909896:
                if (status.equals("BOOKED")) {
                    if (!S5.c.b(b8.e, A5.b.f76S)) {
                        ((MayaBaseFragment) ((P9.k) b8.c.get())).E1();
                        C1264i0 c1264i0 = b8.f;
                        if (c1264i0.i()) {
                            contactReference = c1264i0.c.getContactReferenceData(C1264i0.a(c1264i0));
                            kotlin.jvm.internal.j.d(contactReference);
                        } else {
                            contactReference = c1264i0.f11449b.getContactReference();
                            kotlin.jvm.internal.j.d(contactReference);
                        }
                        Lh.d dVar = new Lh.d(new Lh.d(new Lh.h(contactReference, zh.b.a(), 0), new v(b8, 0), 2), new w(b8, 0), 0);
                        Jh.a aVar = new Jh.a();
                        try {
                            dVar.f(new Jh.b(aVar, 0));
                            b8.e(aVar);
                        } catch (NullPointerException e) {
                            throw e;
                        } catch (Throwable th2) {
                            throw AbstractC1213b.L(th2, "subscribeActual failed", th2);
                        }
                    }
                    String loanAccountId2 = creditApplication.getLoanAccountId();
                    b8.f2860l = loanAccountId2 != null ? loanAccountId2 : "";
                    String loanAccountId3 = creditApplication.getLoanAccountId();
                    if (loanAccountId3 == null || loanAccountId3.length() == 0) {
                        b8.w();
                        return Ah.p.c(creditResponse);
                    }
                    b8.r(loanAccountId3);
                    C1264i0 c1264i02 = b8.f;
                    Ah.p pVarB = c1264i02.b(loanAccountId3);
                    if (c1264i02.i()) {
                        Ah.p<Response<CreditBillingStatement>> creditBillingStatement = c1264i02.c.getCreditBillingStatement(C1264i0.a(c1264i02), loanAccountId3);
                        Z z4 = Z.e;
                        creditBillingStatement.getClass();
                        fVar = new Lh.f(creditBillingStatement, z4, 0);
                    } else {
                        Ah.p<Response<CreditBillingStatement>> creditBillingStatement2 = c1264i02.f11449b.getCreditBillingStatement(loanAccountId3);
                        Z z5 = Z.f;
                        creditBillingStatement2.getClass();
                        fVar = new Lh.f(creditBillingStatement2, z5, 0);
                    }
                    return new Lh.i(new Lh.f(new Lh.d(new Lh.h(Ah.p.l(pVarB, fVar, new x(b8, creditResponse)), zh.b.a(), 0), new A(b8, 1), 2), C0329g.f2889b, 0), new A7.r(10, b8, creditResponse), null);
                }
                break;
            case 1967871671:
                if (status.equals("APPROVED")) {
                    ((NewMayaCreditFragment) ((P9.k) b8.c.get())).L1();
                    ((NewMayaCreditFragment) ((P9.k) b8.c.get())).V1();
                    ((NewMayaCreditFragment) ((P9.k) b8.c.get())).U1();
                    ((NewMayaCreditFragment) ((P9.k) b8.c.get())).X1();
                    ((NewMayaCreditFragment) ((P9.k) b8.c.get())).T1();
                    C0450f c0450f = ((NewMayaCreditFragment) ((P9.k) b8.c.get())).f13244L0;
                    if (c0450f == null) {
                        kotlin.jvm.internal.j.n("mViewCreditApplicationHeader");
                        throw null;
                    }
                    ((ConstraintLayout) c0450f.c).setVisibility(0);
                    NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) b8.c.get());
                    newMayaCreditFragment.m1().r(EnumC1216e.APPROVED_REVIEW);
                    ConstraintSet constraintSet = new ConstraintSet();
                    C0450f c0450f2 = newMayaCreditFragment.f13244L0;
                    if (c0450f2 == null) {
                        kotlin.jvm.internal.j.n("mViewCreditApplicationHeader");
                        throw null;
                    }
                    constraintSet.clone((ConstraintLayout) c0450f2.c);
                    constraintSet.setVerticalBias(R.id.chip_maya_credit, 0.0f);
                    C0450f c0450f3 = newMayaCreditFragment.f13244L0;
                    if (c0450f3 == null) {
                        kotlin.jvm.internal.j.n("mViewCreditApplicationHeader");
                        throw null;
                    }
                    constraintSet.applyTo((ConstraintLayout) c0450f3.c);
                    ConstraintLayout constraintLayout = ((NewMayaCreditFragment) ((P9.k) b8.c.get())).f13251U0;
                    if (constraintLayout == null) {
                        kotlin.jvm.internal.j.n("mContainerHelpCenter");
                        throw null;
                    }
                    constraintLayout.setVisibility(0);
                    if (S5.c.b(b8.e, A5.b.f82V)) {
                        ((NewMayaCreditFragment) ((P9.k) b8.c.get())).Z1();
                    }
                    return Ah.p.c(creditResponse);
                }
                break;
        }
        return Ah.p.c(new CreditResponse(null, null, null, 7, null));
    }
}
