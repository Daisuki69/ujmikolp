package M8;

import D8.C0215x;
import K8.InterfaceC0289n;
import N5.C0439b0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDocumentIdGuideFragment;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: M8.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0389o0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycDocumentIdGuideFragment f3345b;

    public /* synthetic */ C0389o0(MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment, int i) {
        this.f3344a = i;
        this.f3345b = mayaKycDocumentIdGuideFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String description;
        switch (this.f3344a) {
            case 0:
                break;
            case 1:
                C0215x c0215xK1 = this.f3345b.K1();
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentL1 = ((MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) c0215xK1.c.get())).L1();
                if (mayaEKYCSelectedDocumentL1 == null) {
                    ((L8.e) c0215xK1.c.get()).h1();
                } else if (c0215xK1.e.e().isCameraXEnabled() && c0215xK1.e.e().isShortenedFlowIdCaptureV3Enabled()) {
                    if (c0215xK1.e.e().isKycUxTofuRedesignEnabled()) {
                        MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment = (MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) c0215xK1.c.get());
                        mayaKycDocumentIdGuideFragment.L1();
                        ConstraintLayout constraintLayout = ((C0439b0) mayaKycDocumentIdGuideFragment.G1()).f4058a;
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentL12 = mayaKycDocumentIdGuideFragment.L1();
                        kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentL12);
                        MayaEKYCSelectedDocument mayaEKYCSelectedDocumentL13 = mayaKycDocumentIdGuideFragment.L1();
                        if (mayaEKYCSelectedDocumentL13 == null || (description = mayaEKYCSelectedDocumentL13.getDescription()) == null) {
                            description = "";
                        }
                        C0416v0 c0416v0 = new C0416v0("FRONT", mayaEKYCSelectedDocumentL12, false);
                        T2.Q(mayaKycDocumentIdGuideFragment, description, T2.l(mayaKycDocumentIdGuideFragment, c0416v0).toString(), null, 12);
                        Navigation.findNavController(constraintLayout).navigate(c0416v0);
                    } else {
                        MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment2 = (MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) c0215xK1.c.get());
                        mayaKycDocumentIdGuideFragment2.getClass();
                        ConstraintLayout constraintLayout2 = ((C0439b0) mayaKycDocumentIdGuideFragment2.G1()).f4058a;
                        kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                        NavController navControllerFindNavController = Navigation.findNavController(constraintLayout2);
                        C0420w0 c0420w0 = new C0420w0(mayaEKYCSelectedDocumentL1, ((C0408t0) mayaKycDocumentIdGuideFragment2.f12516X.getValue()).a());
                        T2.Q(mayaKycDocumentIdGuideFragment2, ((C0439b0) mayaKycDocumentIdGuideFragment2.G1()).c.getText().toString(), T2.l(mayaKycDocumentIdGuideFragment2, c0420w0).toString(), null, 12);
                        E1.c.m(navControllerFindNavController, c0420w0);
                    }
                }
                break;
            default:
                C0215x c0215xK12 = this.f3345b.K1();
                MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment3 = (MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) c0215xK12.c.get());
                File cacheDir = mayaKycDocumentIdGuideFragment3.requireContext().getCacheDir();
                kotlin.jvm.internal.j.f(cacheDir, "getCacheDir(...)");
                E8.k.d(cacheDir, mayaKycDocumentIdGuideFragment3.L1());
                MayaKycDocumentIdGuideFragment mayaKycDocumentIdGuideFragment4 = (MayaKycDocumentIdGuideFragment) ((InterfaceC0289n) c0215xK12.c.get());
                KeyEventDispatcher.Component componentRequireActivity = mayaKycDocumentIdGuideFragment4.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                MayaKycActivity mayaKycActivity = (MayaKycActivity) ((H8.b) componentRequireActivity);
                mayaKycActivity.f12455w = null;
                mayaKycActivity.f12456x = null;
                mayaKycActivity.f12457y = null;
                ConstraintLayout constraintLayout3 = ((C0439b0) mayaKycDocumentIdGuideFragment4.G1()).f4058a;
                kotlin.jvm.internal.j.f(constraintLayout3, "getRoot(...)");
                NavController navControllerFindNavController2 = Navigation.findNavController(constraintLayout3);
                C0424x0 c0424x0 = new C0424x0(((C0408t0) mayaKycDocumentIdGuideFragment4.f12516X.getValue()).b(), ((C0408t0) mayaKycDocumentIdGuideFragment4.f12516X.getValue()).a());
                T2.Q(mayaKycDocumentIdGuideFragment4, ((C0439b0) mayaKycDocumentIdGuideFragment4.G1()).f4060d.getText().toString(), T2.l(mayaKycDocumentIdGuideFragment4, c0424x0).toString(), null, 12);
                E1.c.m(navControllerFindNavController2, c0424x0);
                break;
        }
        return Unit.f18162a;
    }
}
