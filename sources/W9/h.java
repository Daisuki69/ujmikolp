package w9;

import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements W6.d, W6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaMfaActivity f20720a;

    public /* synthetic */ h(MayaMfaActivity mayaMfaActivity) {
        this.f20720a = mayaMfaActivity;
    }

    @Override // W6.d
    public void onClose() {
        this.f20720a.a2();
    }

    @Override // W6.e
    public void onDismiss() {
        MayaMfaActivity mayaMfaActivity = this.f20720a;
        mayaMfaActivity.Z1().q(mayaMfaActivity.f12931r);
        mayaMfaActivity.f12931r = "";
    }
}
