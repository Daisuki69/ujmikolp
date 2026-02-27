package I8;

import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycActivity f2267b;

    public /* synthetic */ e(MayaKycActivity mayaKycActivity, int i) {
        this.f2266a = i;
        this.f2267b = mayaKycActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MayaKycActivity mayaKycActivity = this.f2267b;
        switch (this.f2266a) {
            case 0:
                mayaKycActivity.f12454v = true;
                break;
            default:
                MayaDashboardActivity mayaDashboardActivity = MayaKycActivity.f12445B;
                mayaKycActivity.n1().s(mayaKycActivity, true);
                break;
        }
    }
}
