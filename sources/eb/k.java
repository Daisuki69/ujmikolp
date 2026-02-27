package eb;

import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaAccountProvisionFragment f16639b;
    public final /* synthetic */ PayMayaError c;

    public /* synthetic */ k(MayaAccountProvisionFragment mayaAccountProvisionFragment, PayMayaError payMayaError, int i) {
        this.f16638a = i;
        this.f16639b = mayaAccountProvisionFragment;
        this.c = payMayaError;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16638a) {
            case 0:
                String str = (String) obj;
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bi9j"));
                String strC = AbstractC1213b.c(13);
                kotlin.jvm.internal.j.f(strC, numX49.tnTj78("bi9d"));
                MayaAccountProvisionFragment mayaAccountProvisionFragment = this.f16639b;
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment, str, strC, numX49.tnTj78("bi9i"), mayaAccountProvisionFragment.G1().r().toString(), this.c.mSpiel(), null, 32);
                break;
            case 1:
                String str2 = (String) obj;
                kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bi9u"));
                String strC2 = AbstractC1213b.c(13);
                kotlin.jvm.internal.j.f(strC2, numX49.tnTj78("bi9V"));
                MayaAccountProvisionFragment mayaAccountProvisionFragment2 = this.f16639b;
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment2, str2, strC2, numX49.tnTj78("bi9S"), mayaAccountProvisionFragment2.s(), this.c.mSpiel(), null, 32);
                break;
            default:
                String str3 = (String) obj;
                kotlin.jvm.internal.j.g(str3, numX49.tnTj78("bi9Z"));
                String strC3 = AbstractC1213b.c(13);
                kotlin.jvm.internal.j.f(strC3, numX49.tnTj78("bi9k"));
                MayaAccountProvisionFragment mayaAccountProvisionFragment3 = this.f16639b;
                MayaAccountProvisionFragment.M1(mayaAccountProvisionFragment3, str3, strC3, numX49.tnTj78("bi9B"), mayaAccountProvisionFragment3.s(), this.c.mSpiel(), null, 32);
                break;
        }
        return Unit.f18162a;
    }
}
