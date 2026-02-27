package Z8;

import com.paymaya.common.base.MayaBaseFragment;
import g9.InterfaceC1511f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f6916b;

    public /* synthetic */ h(i iVar, int i) {
        this.f6915a = i;
        this.f6916b = iVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f6915a) {
            case 0:
                ((MayaBaseFragment) ((InterfaceC1511f) this.f6916b.c.get())).w1();
                break;
            case 1:
                ((MayaBaseFragment) ((InterfaceC1511f) this.f6916b.c.get())).w1();
                break;
            default:
                androidx.camera.core.impl.a.A(this.f6916b.f6917d.f11330b, "savings_auto_provision_opt_in_sent", true);
                break;
        }
    }
}
