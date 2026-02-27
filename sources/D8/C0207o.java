package D8;

import K8.InterfaceC0282g;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.domain.model.KycPreSubmissionContent;
import com.paymaya.domain.model.KycRegulatoryProfileCMSResponse;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;

/* JADX INFO: renamed from: D8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0207o implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212u f1059b;

    public /* synthetic */ C0207o(C0212u c0212u, int i) {
        this.f1058a = i;
        this.f1059b = c0212u;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f1058a) {
            case 0:
                KycRegulatoryProfileCMSResponse regulatoryProfileCmsResponse = (KycRegulatoryProfileCMSResponse) obj;
                kotlin.jvm.internal.j.g(regulatoryProfileCmsResponse, "regulatoryProfileCmsResponse");
                this.f1059b.p();
                C0212u c0212u = this.f1059b;
                c0212u.f1080K = regulatoryProfileCmsResponse;
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get());
                mayaKycCompletePersonalInformationFragment.getClass();
                KeyEventDispatcher.Component componentRequireActivity = mayaKycCompletePersonalInformationFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().h = regulatoryProfileCmsResponse;
                break;
            case 1:
                Throwable p02 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                this.f1059b.e0(p02);
                break;
            case 2:
                KycPreSubmissionContent p03 = (KycPreSubmissionContent) obj;
                kotlin.jvm.internal.j.g(p03, "p0");
                this.f1059b.t(p03);
                break;
            default:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1059b.c.get());
                mayaKycCompletePersonalInformationFragment2.y3(((N5.W) mayaKycCompletePersonalInformationFragment2.G1()).f3971b.m, false);
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1059b.c.get());
                mayaKycCompletePersonalInformationFragment3.y3(((N5.W) mayaKycCompletePersonalInformationFragment3.G1()).f3971b.f4017o, false);
                this.f1059b.j0();
                this.f1059b.e0(it);
                break;
        }
    }
}
