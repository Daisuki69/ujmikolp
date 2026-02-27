package n9;

import android.view.View;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: n9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1941d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaQRPHMerchantActivity f18642b;

    public /* synthetic */ C1941d(MayaQRPHMerchantActivity mayaQRPHMerchantActivity, int i) {
        this.f18641a = i;
        this.f18642b = mayaQRPHMerchantActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MayaQRPHMerchantActivity mayaQRPHMerchantActivity = this.f18642b;
        switch (this.f18641a) {
            case 0:
                EnumC1215d enumC1215d = EnumC1215d.P2M;
                EnumC1216e enumC1216e = EnumC1216e.SUCCESS;
                View it = (View) obj;
                int i = MayaQRPHMerchantActivity.f12851t;
                j.g(it, "it");
                C1220i c1220iK1 = mayaQRPHMerchantActivity.k1();
                C1219h c1219hD = C1219h.d(enumC1215d);
                c1219hD.r(enumC1216e);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.FINISH);
                c1219hD.i();
                c1220iK1.c(mayaQRPHMerchantActivity, c1219hD);
                mayaQRPHMerchantActivity.n1().q(mayaQRPHMerchantActivity);
                break;
            case 1:
                View it2 = (View) obj;
                int i4 = MayaQRPHMerchantActivity.f12851t;
                j.g(it2, "it");
                mayaQRPHMerchantActivity.n1().s(mayaQRPHMerchantActivity, true);
                break;
            default:
                View it3 = (View) obj;
                int i6 = MayaQRPHMerchantActivity.f12851t;
                j.g(it3, "it");
                C1220i c1220iK12 = mayaQRPHMerchantActivity.k1();
                C1219h c1219hD2 = C1219h.d(EnumC1215d.QRPH);
                c1219hD2.r(EnumC1216e.DASHBOARD);
                c1219hD2.n(17);
                c1219hD2.t(EnumC1217f.UPGRADE_NOW);
                c1219hD2.i();
                c1220iK12.c(mayaQRPHMerchantActivity, c1219hD2);
                mayaQRPHMerchantActivity.n1().s(mayaQRPHMerchantActivity, false);
                break;
        }
        return Unit.f18162a;
    }
}
