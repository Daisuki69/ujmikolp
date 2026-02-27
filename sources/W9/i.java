package w9;

import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements W6.e, W6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMfaActivity f20722b;

    public /* synthetic */ i(MayaMfaActivity mayaMfaActivity, int i) {
        this.f20721a = i;
        this.f20722b = mayaMfaActivity;
    }

    @Override // W6.d
    public void onClose() {
        MayaMfaActivity mayaMfaActivity = this.f20722b;
        mayaMfaActivity.setResult(1012);
        mayaMfaActivity.finish();
        MayaMfaActivity.X1(mayaMfaActivity);
    }

    @Override // W6.e
    public void onDismiss() {
        switch (this.f20721a) {
            case 0:
                MayaMfaActivity mayaMfaActivity = this.f20722b;
                mayaMfaActivity.Z1().q(mayaMfaActivity.f12931r);
                mayaMfaActivity.f12931r = "";
                break;
            default:
                this.f20722b.finish();
                break;
        }
    }
}
