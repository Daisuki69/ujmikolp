package C7;

import B5.i;
import android.content.Intent;
import android.view.View;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycAccountUnderReviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDashboardActivity f751b;

    public /* synthetic */ e(MayaDashboardActivity mayaDashboardActivity, int i) {
        this.f750a = i;
        this.f751b = mayaDashboardActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC1216e enumC1216e = EnumC1216e.VERIFY_EMAIL;
        MayaDashboardActivity mayaDashboardActivity = this.f751b;
        View it = (View) obj;
        switch (this.f750a) {
            case 0:
                int i = MayaDashboardActivity.f12133U;
                j.g(it, "it");
                C1220i c1220iK1 = mayaDashboardActivity.k1();
                C1219h c1219hD = C1219h.d(EnumC1215d.MY_CARDS);
                c1219hD.r(EnumC1216e.DASHBOARD);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.UPGRADE_NOW);
                c1219hD.i();
                c1220iK1.c(mayaDashboardActivity, c1219hD);
                mayaDashboardActivity.n1().s(mayaDashboardActivity, false);
                break;
            case 1:
                int i4 = MayaDashboardActivity.f12133U;
                j.g(it, "it");
                mayaDashboardActivity.n1();
                i.k(mayaDashboardActivity, "paymaya://accountrecovery");
                C1220i c1220iK12 = mayaDashboardActivity.k1();
                C1219h c1219hD2 = C1219h.d(EnumC1215d.CREDIT);
                c1219hD2.r(enumC1216e);
                c1219hD2.n(18);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hD2.j.put("source_page", "Email verification bottom sheet");
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                String string = mayaDashboardActivity.getString(R.string.maya_label_verify_now);
                if (string != null) {
                    c1219hD2.j.put("source_button", string);
                }
                EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hD2.j.put("product_type", "MAYA_CREDIT_CONSUMER_LOAN");
                c1219hD2.i();
                c1220iK12.c(mayaDashboardActivity, c1219hD2);
                break;
            case 2:
                int i6 = MayaDashboardActivity.f12133U;
                j.g(it, "it");
                mayaDashboardActivity.n1();
                mayaDashboardActivity.startActivity(new Intent(mayaDashboardActivity.getApplicationContext(), (Class<?>) MayaKycAccountUnderReviewActivity.class));
                break;
            case 3:
                int i10 = MayaDashboardActivity.f12133U;
                j.g(it, "it");
                mayaDashboardActivity.n1();
                i.k(mayaDashboardActivity, "paymaya://accountrecovery");
                C1220i c1220iK13 = mayaDashboardActivity.k1();
                C1219h c1219hD3 = C1219h.d(EnumC1215d.LOANS);
                c1219hD3.r(enumC1216e);
                c1219hD3.n(18);
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hD3.j.put("source_page", "Email verification bottom sheet");
                EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                String string2 = mayaDashboardActivity.getString(R.string.maya_label_verify_now);
                if (string2 != null) {
                    c1219hD3.j.put("source_button", string2);
                }
                EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
                c1219hD3.j.put("product_type", "MAYA_INSTALLMENT_V2_CONSUMER_LOAN");
                c1219hD3.i();
                c1220iK13.c(mayaDashboardActivity, c1219hD3);
                break;
            default:
                int i11 = MayaDashboardActivity.f12133U;
                j.g(it, "it");
                C1220i c1220iK14 = mayaDashboardActivity.k1();
                C1219h c1219h = new C1219h();
                c1219h.q("AGE_RESTRICTED");
                c1219h.n(17);
                c1219h.t(EnumC1217f.GOT_IT);
                c1219h.i();
                c1220iK14.c(mayaDashboardActivity, c1219h);
                break;
        }
        return Unit.f18162a;
    }
}
