package D8;

import K8.InterfaceC0282g;
import M8.C0344d;
import M8.C0348e;
import M8.D1;
import android.widget.FrameLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import com.paymaya.R;
import com.paymaya.domain.model.KycPreSubmissionContent;
import com.paymaya.domain.model.Profile;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;

/* JADX INFO: renamed from: D8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0205m implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0212u f1055b;

    public /* synthetic */ C0205m(C0212u c0212u, int i) {
        this.f1054a = i;
        this.f1055b = c0212u;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f1054a) {
            case 0:
                kotlin.jvm.internal.j.g((Profile) obj, "it");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1055b.c.get());
                KeyEventDispatcher.Component componentRequireActivity = mayaKycCompletePersonalInformationFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                H8.b bVar = (H8.b) componentRequireActivity;
                MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
                mayaKycActivity.f12447o = new C0348e(4, bVar);
                mayaKycActivity.f12446n = new C0344d(4, bVar);
                FrameLayout frameLayout = ((N5.W) mayaKycCompletePersonalInformationFragment.G1()).f3970a;
                kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
                Navigation.findNavController(frameLayout).navigate(new M8.Y(R.string.maya_label_multi_kyc_submission_error_header, R.string.maya_label_multi_kyc_submission_error_description, ((MayaKycActivity) D1.b(mayaKycCompletePersonalInformationFragment)).s().toString(), 20303));
                ((MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1055b.c.get())).w2().f4041b.setVisibility(8);
                break;
            case 1:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                this.f1055b.e0(it);
                break;
            case 2:
                KycPreSubmissionContent p02 = (KycPreSubmissionContent) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                this.f1055b.s(p02);
                break;
            default:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment2 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1055b.c.get());
                mayaKycCompletePersonalInformationFragment2.y3(((N5.W) mayaKycCompletePersonalInformationFragment2.G1()).f3971b.i, false);
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment3 = (MayaKycCompletePersonalInformationFragment) ((InterfaceC0282g) this.f1055b.c.get());
                mayaKycCompletePersonalInformationFragment3.y3(((N5.W) mayaKycCompletePersonalInformationFragment3.G1()).f3971b.f4014k, false);
                this.f1055b.i0();
                this.f1055b.e0(it2);
                break;
        }
    }
}
