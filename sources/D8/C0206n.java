package D8;

import K8.InterfaceC0282g;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;

/* JADX INFO: renamed from: D8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0206n implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212u f1057b;

    public /* synthetic */ C0206n(C0212u c0212u, int i) {
        this.f1056a = i;
        this.f1057b = c0212u;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f1056a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f1057b.e0(it);
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1057b.c.get())).w2().f4041b.setVisibility(8);
                break;
            case 1:
                Throwable p02 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                this.f1057b.e0(p02);
                break;
            case 2:
                Throwable p03 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                this.f1057b.e0(p03);
                break;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1057b.c.get());
                mayaKycCompletePersonalInformationFragment.y3(((N5.W) mayaKycCompletePersonalInformationFragment.G1()).f3971b.f4015l, false);
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1057b.c.get())).s3("");
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1057b.c.get())).C2().b();
                this.f1057b.e0(it2);
                break;
        }
    }
}
