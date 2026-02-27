package L9;

import a.AbstractC0617a;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditApplication;
import com.paymaya.domain.model.CreditContactReferenceResponse;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.CreditServiceFee;
import com.paymaya.domain.model.CreditUserPreference;
import com.paymaya.domain.model.PersonalDetailsData;
import com.paymaya.domain.store.C1265j;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G6.k f2865b;
    public final /* synthetic */ CreditServiceFee c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CreditAccount f2866d;

    public /* synthetic */ D(G6.k kVar, CreditServiceFee creditServiceFee, CreditAccount creditAccount, int i) {
        this.f2864a = i;
        this.f2865b = kVar;
        this.c = creditServiceFee;
        this.f2866d = creditAccount;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f2864a) {
            case 0:
                PersonalDetailsData details = (PersonalDetailsData) obj;
                kotlin.jvm.internal.j.g(details, "details");
                G6.k kVar = this.f2865b;
                CreditServiceFee creditServiceFee = this.c;
                CreditAccount creditAccount = this.f2866d;
                kVar.getClass();
                kotlin.jvm.internal.j.g(creditServiceFee, "creditServiceFee");
                kotlin.jvm.internal.j.g(creditAccount, "creditAccount");
                kVar.e = false;
                String feeRate = creditServiceFee.getFeeRate();
                if (C2576A.H(feeRate)) {
                    feeRate = null;
                }
                String formattedLoanAmountValue = creditAccount.getFormattedLoanAmountValue();
                CreditUserPreference userPreference = creditAccount.getScheduleSettings().getUserPreference();
                String strA = AbstractC0617a.A(userPreference != null ? userPreference.getEndDayOfMonth() : 0);
                CreditResponse creditResponseP1 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get())).P1();
                String strM = G6.k.m(feeRate, creditResponseP1 != null ? creditResponseP1.getCreditApplication() : null);
                BackUpIdentity backUpIdentityA = ((C1265j) kVar.h).a();
                String strMValue = backUpIdentityA != null ? backUpIdentityA.mValue() : null;
                BackUpIdentity backUpIdentityA2 = ((C1265j) kVar.h).a();
                CreditReviewUiModel creditReviewUiModel = new CreditReviewUiModel(formattedLoanAmountValue, null, strA, strM, strMValue, backUpIdentityA2 != null ? backUpIdentityA2.isVerifiedEmail() ? J9.d.f2493a : J9.d.f2494b : J9.d.c, creditAccount.getFormatNoteNumberValue(), null, null, null, 0, null, null, null, 1048450);
                creditReviewUiModel.j = details.getAlternativeMobileNumber();
                String gender = details.getGender();
                creditReviewUiModel.h = gender != null ? kVar.n(gender) : null;
                String maritalStatus = details.getMaritalStatus();
                creditReviewUiModel.i = maritalStatus != null ? kVar.o(maritalStatus) : null;
                J9.b bVar = new J9.b(details.getGender(), details.getMaritalStatus(), 60);
                kVar.v(creditReviewUiModel);
                NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = (NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get());
                newMayaCreditSummaryFragment.W1(bVar, creditReviewUiModel.j);
                newMayaCreditSummaryFragment.V1(creditReviewUiModel);
                Group group = newMayaCreditSummaryFragment.f13310v0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mGroupContactReference");
                    throw null;
                }
                group.setVisibility(8);
                String str = creditReviewUiModel.f13058g;
                if (str != null) {
                    TextView textView = newMayaCreditSummaryFragment.u0;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n("mTextViewAccountNumber");
                        throw null;
                    }
                    textView.setText(str);
                }
                String name = (String) kVar.m;
                kotlin.jvm.internal.j.g(name, "name");
                TextView textView2 = newMayaCreditSummaryFragment.t0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mTextViewName");
                    throw null;
                }
                textView2.setText(name);
                kVar.f1795k = creditReviewUiModel;
                NewMayaCreditSummaryFragment newMayaCreditSummaryFragment2 = (NewMayaCreditSummaryFragment) ((P9.n) kVar.c.get());
                CreditResponse creditResponseP12 = newMayaCreditSummaryFragment2.P1();
                if (creditResponseP12 != null) {
                    creditResponseP12.setCreditAccount(creditAccount);
                }
                newMayaCreditSummaryFragment2.L1();
                newMayaCreditSummaryFragment2.R1();
                return;
            case 1:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f2865b.z(this.c, this.f2866d);
                return;
            case 2:
                CreditContactReferenceResponse contactReferenceResponse = (CreditContactReferenceResponse) obj;
                kotlin.jvm.internal.j.g(contactReferenceResponse, "contactReferenceResponse");
                G6.k kVar2 = this.f2865b;
                CreditServiceFee creditServiceFee2 = this.c;
                CreditAccount creditAccount2 = this.f2866d;
                kVar2.getClass();
                kotlin.jvm.internal.j.g(creditServiceFee2, "creditServiceFee");
                kotlin.jvm.internal.j.g(creditAccount2, "creditAccount");
                kVar2.e = false;
                CreditResponse creditResponseP13 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar2.c.get())).P1();
                CreditApplication creditApplication = creditResponseP13 != null ? creditResponseP13.getCreditApplication() : null;
                String feeRate2 = creditServiceFee2.getFeeRate();
                kVar2.u(creditAccount2, creditApplication, C2576A.H(feeRate2) ? null : feeRate2, contactReferenceResponse);
                CreditResponse creditResponseP14 = ((NewMayaCreditSummaryFragment) ((P9.n) kVar2.c.get())).P1();
                if (creditResponseP14 != null) {
                    creditResponseP14.setCreditAccount(creditAccount2);
                }
                ((MayaBaseLoadingFragment) ((P9.n) kVar2.c.get())).L1();
                ((NewMayaCreditSummaryFragment) ((P9.n) kVar2.c.get())).R1();
                return;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                this.f2865b.z(this.c, this.f2866d);
                return;
        }
    }
}
