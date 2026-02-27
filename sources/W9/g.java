package w9;

import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMfaActivity f20719b;

    public /* synthetic */ g(MayaMfaActivity mayaMfaActivity, int i) {
        this.f20718a = i;
        this.f20719b = mayaMfaActivity;
    }

    @Override // W6.e
    public void onDismiss() {
        switch (this.f20718a) {
            case 0:
                this.f20719b.finish();
                break;
            default:
                MayaMfaActivity mayaMfaActivity = this.f20719b;
                mayaMfaActivity.Z1().q(mayaMfaActivity.f12931r);
                mayaMfaActivity.f12931r = "";
                break;
        }
    }
}
