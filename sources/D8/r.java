package D8;

import K8.InterfaceC0282g;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212u f1065b;

    public /* synthetic */ r(C0212u c0212u, int i) {
        this.f1064a = i;
        this.f1065b = c0212u;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f1064a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f1065b.e0(it);
                break;
            case 1:
                Throwable p02 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                this.f1065b.e0(p02);
                break;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1065b.c.get());
                mayaKycCompletePersonalInformationFragment.y3(((N5.W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.h, false);
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1065b.c.get())).m3("");
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1065b.c.get())).k2().b();
                this.f1065b.e0(it2);
                break;
        }
    }
}
