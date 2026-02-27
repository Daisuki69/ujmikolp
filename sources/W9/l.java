package w9;

import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements W6.e, W6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaMfaActivity f20727a;

    public /* synthetic */ l(MayaMfaActivity mayaMfaActivity) {
        this.f20727a = mayaMfaActivity;
    }

    @Override // W6.d
    public void onClose() {
        MayaMfaActivity mayaMfaActivity = this.f20727a;
        mayaMfaActivity.setResult(1012);
        mayaMfaActivity.finish();
        MayaMfaActivity.X1(mayaMfaActivity);
    }

    @Override // W6.e
    public void onDismiss() {
        MayaMfaActivity mayaMfaActivity = this.f20727a;
        mayaMfaActivity.Z1().q(mayaMfaActivity.f12931r);
        mayaMfaActivity.f12931r = "";
    }
}
