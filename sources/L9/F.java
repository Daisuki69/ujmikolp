package L9;

import Kh.T;
import a.AbstractC0617a;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditEligibility;
import com.paymaya.domain.model.CreditUserPreference;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2870b;

    public /* synthetic */ F(I i, int i4) {
        this.f2869a = i4;
        this.f2870b = i;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        I i = this.f2870b;
        switch (this.f2869a) {
            case 0:
                CreditAccount it = (CreditAccount) obj;
                kotlin.jvm.internal.j.g(it, "it");
                CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) i.i;
                if (creditReviewUiModel != null) {
                    CreditUserPreference userPreference = it.getScheduleSettings().getUserPreference();
                    creditReviewUiModel.c = userPreference != null ? AbstractC0617a.A(userPreference.getEndDayOfMonth()) : null;
                }
                CreditReviewUiModel creditReviewUiModel2 = (CreditReviewUiModel) i.i;
                if (creditReviewUiModel2 != null) {
                    BackUpIdentity backUpIdentityA = ((C1265j) i.h).a();
                    creditReviewUiModel2.e = backUpIdentityA != null ? backUpIdentityA.mValue() : null;
                }
                Ah.p<CreditEligibility> mayaCreditEligibility = ((C1264i0) i.f2876g).f11449b.getMayaCreditEligibility();
                kotlin.jvm.internal.j.f(mayaCreditEligibility, "getMayaCreditEligibility(...)");
                i.e(new T(5, new Lh.d(new Lh.h(mayaCreditEligibility, zh.b.a(), 0), new G6.v(i, 14), 2), new E(i, 3)).e());
                break;
            default:
                Throwable error = (Throwable) obj;
                kotlin.jvm.internal.j.g(error, "error");
                PayMayaError payMayaErrorF = i.f(error, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                i.w(payMayaErrorF);
                i.t(payMayaErrorF, error);
                break;
        }
    }
}
