package M8;

import N5.C0490y0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import com.paymaya.data.api.KycInHouseApi;
import com.paymaya.domain.model.ImageQualityRequest;
import com.paymaya.domain.model.KycUploadRequest;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycUploadPhilsysIdFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import w.C2360b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class M2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycUploadPhilsysIdFragment f3200b;

    public /* synthetic */ M2(MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment, int i) {
        this.f3199a = i;
        this.f3200b = mayaKycUploadPhilsysIdFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3199a) {
            case 0:
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment = this.f3200b;
                mayaKycUploadPhilsysIdFragment.f12646Y = true;
                T2.Q(mayaKycUploadPhilsysIdFragment, MayaKycUploadPhilsysIdFragment.L1(((C0490y0) mayaKycUploadPhilsysIdFragment.G1()).f4298b.f4308d, "front"), "File picker", null, 12);
                mayaKycUploadPhilsysIdFragment.P1();
                break;
            case 1:
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment2 = this.f3200b;
                mayaKycUploadPhilsysIdFragment2.f12646Y = false;
                T2.Q(mayaKycUploadPhilsysIdFragment2, MayaKycUploadPhilsysIdFragment.L1(((C0490y0) mayaKycUploadPhilsysIdFragment2.G1()).f4298b.c, "back"), "File picker", null, 12);
                mayaKycUploadPhilsysIdFragment2.P1();
                break;
            case 2:
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment3 = this.f3200b;
                mayaKycUploadPhilsysIdFragment3.f12646Y = true;
                T2.Q(mayaKycUploadPhilsysIdFragment3, ((C0490y0) mayaKycUploadPhilsysIdFragment3.G1()).f4298b.f.getText().toString(), "File picker", null, 12);
                mayaKycUploadPhilsysIdFragment3.P1();
                break;
            case 3:
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment4 = this.f3200b;
                mayaKycUploadPhilsysIdFragment4.f12646Y = false;
                T2.Q(mayaKycUploadPhilsysIdFragment4, ((C0490y0) mayaKycUploadPhilsysIdFragment4.G1()).f4298b.e.getText().toString(), "File picker", null, 12);
                mayaKycUploadPhilsysIdFragment4.P1();
                break;
            case 4:
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment5 = this.f3200b;
                MayaEKYCSelectedDocument mayaEKYCSelectedDocumentB = ((P2) mayaKycUploadPhilsysIdFragment5.f12645X.getValue()).b();
                if (mayaEKYCSelectedDocumentB != null) {
                    T2.Q(mayaKycUploadPhilsysIdFragment5, ((C0490y0) mayaKycUploadPhilsysIdFragment5.G1()).f4298b.f4307b.getText().toString(), T2.l(mayaKycUploadPhilsysIdFragment5, new S2(mayaEKYCSelectedDocumentB)).toString(), null, 12);
                }
                D8.T tM1 = mayaKycUploadPhilsysIdFragment5.M1();
                MayaKycUploadPhilsysIdFragment mayaKycUploadPhilsysIdFragment6 = (MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get());
                ((C0490y0) mayaKycUploadPhilsysIdFragment6.G1()).f4298b.f4306a.setVisibility(8);
                ((C0490y0) mayaKycUploadPhilsysIdFragment6.G1()).c.f4041b.setVisibility(0);
                KycUploadRequest kycUploadRequestO = tM1.o("FRONT");
                Y.e eVar = tM1.e;
                KeyEventDispatcher.Component componentRequireActivity = ((MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                Hh.f fVarW = eVar.w(((MayaKycActivity) ((H8.b) componentRequireActivity)).a2().size(), kycUploadRequestO);
                KycUploadRequest kycUploadRequestO2 = tM1.o("BACK");
                Y.e eVar2 = tM1.e;
                KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                Hh.f fVarW2 = eVar2.w(((MayaKycActivity) ((H8.b) componentRequireActivity2)).a2().size(), kycUploadRequestO2);
                KeyEventDispatcher.Component componentRequireActivity3 = ((MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get())).requireActivity();
                H8.b bVar = componentRequireActivity3 instanceof H8.b ? (H8.b) componentRequireActivity3 : null;
                String key = bVar != null ? ((MayaKycActivity) bVar).f12455w : null;
                if (key == null) {
                    key = "";
                }
                if (tM1.f.e().isKycForcePhNationalIdEnabled() && key.equals("PHILSYS_DIGITAL")) {
                    MayaEKYCSelectedDocument mayaEKYCSelectedDocumentP = tM1.p();
                    kotlin.jvm.internal.j.d(mayaEKYCSelectedDocumentP);
                    key = mayaEKYCSelectedDocumentP.getKey();
                }
                KeyEventDispatcher.Component componentRequireActivity4 = ((MayaKycUploadPhilsysIdFragment) ((K8.O) tM1.c.get())).requireActivity();
                H8.b bVar2 = componentRequireActivity4 instanceof H8.b ? (H8.b) componentRequireActivity4 : null;
                String str = bVar2 != null ? ((MayaKycActivity) bVar2).f12457y : null;
                tM1.e(new Hh.f(new Hh.a(new Hh.a(fVarW, fVarW2, 0), ((KycInHouseApi) tM1.e.f6708b).postImageQuality(new ImageQualityRequest(key, "FRONT", str != null ? str : "")).f(Th.e.c), 0), zh.b.a(), 0).a(new A7.c(tM1, 15)).b(new C2360b(tM1, 16)).c());
                break;
            case 5:
                ConstraintLayout constraintLayout = ((C0490y0) this.f3200b.G1()).f4297a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                Navigation.findNavController(constraintLayout).popBackStack();
                break;
            default:
                ConstraintLayout constraintLayout2 = ((C0490y0) this.f3200b.G1()).f4297a;
                kotlin.jvm.internal.j.f(constraintLayout2, "getRoot(...)");
                Navigation.findNavController(constraintLayout2).popBackStack();
                break;
        }
        return Unit.f18162a;
    }
}
