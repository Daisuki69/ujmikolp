package L9;

import cj.L;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.CreditEligibility;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditActivationConfirmDetailFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.text.DecimalFormat;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.i implements qj.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2903a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj, Class cls, String str, String str2, int i4, int i6) {
        super(obj, str, i, str2, i4, cls);
        this.f2903a = i6;
    }

    @Override // qj.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2903a) {
            case 0:
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                CreditEligibility p22 = (CreditEligibility) obj3;
                kotlin.jvm.internal.j.g(p22, "p2");
                o oVar = (o) this.receiver;
                oVar.getClass();
                ((MayaBaseFragment) ((P9.g) oVar.c.get())).w1();
                CreditTerm term = p22.getTerm();
                if (term == null) {
                    ((NewMayaCreditActivationConfirmDetailFragment) ((P9.g) oVar.c.get())).H1("CREDIT_SCORING_EXTRACT_FAILURE", L.c(new Pair(Constants.REASON, "Missing credit term")));
                } else {
                    CreditReviewUiModel creditReviewUiModel = oVar.h;
                    if (creditReviewUiModel == null) {
                        kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                        throw null;
                    }
                    creditReviewUiModel.f13066s = str;
                    creditReviewUiModel.f13067t = zBooleanValue;
                    creditReviewUiModel.m = term;
                    creditReviewUiModel.f13057d = new DecimalFormat("#.##").format(term.getFeeRate() * ((double) 100)).toString();
                    P9.g gVar = (P9.g) oVar.c.get();
                    CreditReviewUiModel creditReviewUiModel2 = oVar.h;
                    if (creditReviewUiModel2 == null) {
                        kotlin.jvm.internal.j.n("mCreditReviewUiModel");
                        throw null;
                    }
                    ((NewMayaCreditActivationConfirmDetailFragment) gVar).I1(creditReviewUiModel2);
                }
                return Unit.f18162a;
            case 1:
                String p02 = (String) obj;
                String p1 = (String) obj2;
                String p23 = (String) obj3;
                kotlin.jvm.internal.j.g(p02, "p0");
                kotlin.jvm.internal.j.g(p1, "p1");
                kotlin.jvm.internal.j.g(p23, "p2");
                ((Q6.o) this.receiver).r(p02, p1, p23);
                return Unit.f18162a;
            default:
                String p03 = (String) obj;
                String p12 = (String) obj2;
                String p24 = (String) obj3;
                kotlin.jvm.internal.j.g(p03, "p0");
                kotlin.jvm.internal.j.g(p12, "p1");
                kotlin.jvm.internal.j.g(p24, "p2");
                ((Z8.c) this.receiver).s(p03, p12, p24);
                return Unit.f18162a;
        }
    }
}
