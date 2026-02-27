package D8;

import M8.C0344d;
import M8.C0348e;
import M8.C0409t1;
import N5.C0459i0;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycLivenessCaptureFragment;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class F implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f1012b;

    public /* synthetic */ F(G g8, int i) {
        this.f1011a = i;
        this.f1012b = g8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1011a) {
            case 0:
                G g8 = this.f1012b;
                int iIntValue = ((Integer) obj).intValue();
                MayaKycLivenessCaptureFragment mayaKycLivenessCaptureFragment = (MayaKycLivenessCaptureFragment) ((K8.w) g8.c.get());
                mayaKycLivenessCaptureFragment.getClass();
                String strD = com.paymaya.common.utility.D.d(iIntValue);
                String version = HuiYanOsApi.getVersion();
                kotlin.jvm.internal.j.f(version, "getVersion(...)");
                mayaKycLivenessCaptureFragment.J1(strD, version, false);
                KeyEventDispatcher.Component componentRequireActivity = mayaKycLivenessCaptureFragment.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                H8.b bVar = (H8.b) componentRequireActivity;
                MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
                mayaKycActivity.f12447o = new C0348e(10, bVar);
                mayaKycActivity.f12446n = new C0344d(9, bVar);
                ConstraintLayout constraintLayout = ((C0459i0) mayaKycLivenessCaptureFragment.G1()).f4117a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                NavController navControllerFindNavController = Navigation.findNavController(constraintLayout);
                C0409t1 c0409t1 = new C0409t1(2131231472, mayaKycActivity.s().toString(), R.string.maya_label_that_didnt_load_right, R.string.maya_label_connection_issue_split, R.string.maya_label_got_it, iIntValue);
                NavOptions.Builder builder = new NavOptions.Builder();
                Bundle bundle = ((F8.a) mayaKycLivenessCaptureFragment.f12560Y.getValue(mayaKycLivenessCaptureFragment, MayaKycLivenessCaptureFragment.f12558d0[0])).f1551a;
                navControllerFindNavController.navigate(c0409t1, NavOptions.Builder.setPopUpTo$default(builder, bundle != null ? bundle.getBoolean("isOnIdLessFlow") : false ? R.id.maya_kyc_face_authentication_tips_fragment : R.id.maya_kyc_take_video_selfie_fragment, false, false, 4, (Object) null).build());
                break;
            default:
                G g10 = this.f1012b;
                ((Integer) obj).intValue();
                ((MayaKycLivenessCaptureFragment) ((K8.w) g10.c.get())).R1(1001);
                break;
        }
        return Unit.f18162a;
    }
}
