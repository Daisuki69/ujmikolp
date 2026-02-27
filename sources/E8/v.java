package E8;

import M8.D1;
import M8.N0;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneSwornStatementFragment;
import com.paymaya.mayaui.rekyc.view.activity.impl.ReKycSubmittedActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1307b;

    public /* synthetic */ v(Object obj, int i) {
        this.f1306a = i;
        this.f1307b = obj;
    }

    @Override // M8.N0
    public final void D0() {
        Object obj = this.f1307b;
        switch (this.f1306a) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                MayaDashboardActivity mayaDashboardActivity = MayaKycActivity.f12445B;
                ((MayaKycActivity) obj).i2(true);
                break;
            case 2:
                ((MayaKycAmlcCertificateFragment) obj).N1();
                break;
            case 3:
                ((MayaKycActivity) D1.b((MayaKycCompletePersonalInformationFragment) obj)).i2(true);
                break;
            case 4:
                ((MayaKycSsneSwornStatementFragment) obj).N1();
                break;
            default:
                int i = ReKycSubmittedActivity.f13699q;
                ((ReKycSubmittedActivity) obj).finish();
                break;
        }
    }
}
