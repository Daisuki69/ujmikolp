package D8;

import K8.InterfaceC0282g;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.data.api.KycRegulatoryProfileCmsApi;
import com.paymaya.domain.model.Dosri;
import com.paymaya.domain.model.Fatca;
import com.paymaya.domain.model.KycPreSubmissionContent;
import com.paymaya.domain.model.KycRegulatoryProfileStatusResponse;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;

/* JADX INFO: renamed from: D8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0209q implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212u f1063b;

    public /* synthetic */ C0209q(C0212u c0212u, int i) {
        this.f1062a = i;
        this.f1063b = c0212u;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f1062a) {
            case 0:
                KycRegulatoryProfileStatusResponse profileEligibilityStatusResponse = (KycRegulatoryProfileStatusResponse) obj;
                kotlin.jvm.internal.j.g(profileEligibilityStatusResponse, "profileEligibilityStatusResponse");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1063b.c.get());
                mayaKycCompletePersonalInformationFragment.getClass();
                KeyEventDispatcher.Component componentRequireActivity = mayaKycCompletePersonalInformationFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().i = profileEligibilityStatusResponse;
                C0212u c0212u = this.f1063b;
                Fatca fatca = profileEligibilityStatusResponse.getFatca();
                if (!(fatca != null ? kotlin.jvm.internal.j.b(fatca.isRequired(), Boolean.TRUE) : false)) {
                    Dosri dosri = profileEligibilityStatusResponse.getDosri();
                    if (!(dosri != null ? kotlin.jvm.internal.j.b(dosri.isRequired(), Boolean.TRUE) : false)) {
                        c0212u.p();
                    }
                }
                M8.O o8 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).f12494f0;
                if ((o8 != null ? ((MayaKycActivity) o8).Z1().h : null) != null) {
                    M8.O o10 = ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) c0212u.c.get())).f12494f0;
                    c0212u.f1080K = o10 != null ? ((MayaKycActivity) o10).Z1().h : null;
                    c0212u.p();
                } else {
                    new Lh.d(new Lh.d(new Lh.h(((KycRegulatoryProfileCmsApi) c0212u.f1089g.c).getRegulatoryProfileCMSData().h(Th.e.c), zh.b.a(), 0), new C0207o(c0212u, 0), 2), new C0208p(c0212u, 0), 0).e();
                }
                break;
            case 1:
                KycPreSubmissionContent p02 = (KycPreSubmissionContent) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                this.f1063b.o0(p02, false);
                break;
            default:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1063b.c.get());
                mayaKycCompletePersonalInformationFragment2.y3(((N5.W) mayaKycCompletePersonalInformationFragment2.G1()).f3971b.f, false);
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1063b.c.get())).j3("");
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1063b.c.get())).d2().b();
                this.f1063b.e0(it);
                break;
        }
    }
}
