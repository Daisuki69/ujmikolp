package n9;

import android.view.View;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: n9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1940c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMerchantActivity f18640b;

    public /* synthetic */ C1940c(MayaMerchantActivity mayaMerchantActivity, int i) {
        this.f18639a = i;
        this.f18640b = mayaMerchantActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC1215d enumC1215d = EnumC1215d.P2M;
        MayaMerchantActivity mayaMerchantActivity = this.f18640b;
        switch (this.f18639a) {
            case 0:
                EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
                View it = (View) obj;
                int i = MayaMerchantActivity.f12845s;
                j.g(it, "it");
                C1220i c1220iK1 = mayaMerchantActivity.k1();
                C1219h c1219hD = C1219h.d(enumC1215d);
                c1219hD.r(enumC1216e);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.FINISH);
                c1219hD.i();
                c1220iK1.c(mayaMerchantActivity, c1219hD);
                mayaMerchantActivity.n1().q(mayaMerchantActivity);
                break;
            default:
                View it2 = (View) obj;
                int i4 = MayaMerchantActivity.f12845s;
                j.g(it2, "it");
                C1220i c1220iK12 = mayaMerchantActivity.k1();
                C1219h c1219hD2 = C1219h.d(enumC1215d);
                c1219hD2.r(EnumC1216e.DASHBOARD);
                c1219hD2.n(17);
                c1219hD2.t(EnumC1217f.UPGRADE_NOW);
                c1219hD2.i();
                c1220iK12.c(mayaMerchantActivity, c1219hD2);
                mayaMerchantActivity.n1().s(mayaMerchantActivity, false);
                break;
        }
        return Unit.f18162a;
    }
}
