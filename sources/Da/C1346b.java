package da;

import B5.i;
import android.view.View;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: da.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1346b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsActivity f16300b;

    public /* synthetic */ C1346b(MayaPayBillsActivity mayaPayBillsActivity, int i) {
        this.f16299a = i;
        this.f16300b = mayaPayBillsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MayaPayBillsActivity mayaPayBillsActivity = this.f16300b;
        String strTnTj78 = numX49.tnTj78("bdpr");
        View view = (View) obj;
        switch (this.f16299a) {
            case 0:
                int i = MayaPayBillsActivity.f13334x;
                j.g(view, strTnTj78);
                mayaPayBillsActivity.n1();
                i.k(mayaPayBillsActivity, numX49.tnTj78("bdpZ"));
                C1219h c1219h = new C1219h();
                c1219h.n(17);
                c1219h.t(EnumC1217f.MCCLMODAL_ACTIVATE);
                c1219h.i();
                mayaPayBillsActivity.v1(c1219h);
                break;
            case 1:
                int i4 = MayaPayBillsActivity.f13334x;
                j.g(view, strTnTj78);
                C1219h c1219h2 = new C1219h();
                c1219h2.n(17);
                c1219h2.t(EnumC1217f.MCCLMODAL_CLOSE);
                c1219h2.i();
                mayaPayBillsActivity.v1(c1219h2);
                break;
            default:
                int i6 = MayaPayBillsActivity.f13334x;
                j.g(view, strTnTj78);
                C1220i c1220iK1 = mayaPayBillsActivity.k1();
                C1219h c1219hD = C1219h.d(EnumC1215d.PAY_BILLS);
                c1219hD.r(EnumC1216e.DASHBOARD);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.UPGRADE_NOW);
                c1219hD.i();
                c1220iK1.c(mayaPayBillsActivity, c1219hD);
                mayaPayBillsActivity.n1().s(mayaPayBillsActivity, false);
                break;
        }
        return Unit.f18162a;
    }
}
