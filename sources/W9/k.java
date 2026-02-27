package w9;

import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMfaActivity f20726b;

    public /* synthetic */ k(MayaMfaActivity mayaMfaActivity, int i) {
        this.f20725a = i;
        this.f20726b = mayaMfaActivity;
    }

    @Override // W6.e
    public final void onDismiss() {
        switch (this.f20725a) {
            case 0:
                MayaMfaActivity mayaMfaActivity = this.f20726b;
                mayaMfaActivity.Z1().q(mayaMfaActivity.f12931r);
                mayaMfaActivity.f12931r = "";
                break;
            case 1:
                MayaMfaActivity mayaMfaActivity2 = this.f20726b;
                mayaMfaActivity2.Z1().q(mayaMfaActivity2.f12931r);
                mayaMfaActivity2.f12931r = "";
                break;
            default:
                this.f20726b.finish();
                break;
        }
    }
}
