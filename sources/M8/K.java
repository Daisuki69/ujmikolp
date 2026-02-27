package M8;

import android.widget.FrameLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.dynatrace.android.compose.ToggleableComposeCallback_1_7;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompletePersonalInformationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class K implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3185b;
    public final /* synthetic */ Object c;

    public /* synthetic */ K(Object obj, boolean z4, int i) {
        this.f3184a = i;
        this.c = obj;
        this.f3185b = z4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3184a) {
            case 0:
                MayaKycCompletePersonalInformationFragment mayaKycCompletePersonalInformationFragment = (MayaKycCompletePersonalInformationFragment) this.c;
                FrameLayout frameLayout = ((N5.W) mayaKycCompletePersonalInformationFragment.G1()).f3970a;
                kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
                NavController navControllerFindNavController = Navigation.findNavController(frameLayout);
                X x6 = new X(T2.j(mayaKycCompletePersonalInformationFragment), this.f3185b);
                String string = mayaKycCompletePersonalInformationFragment.getString(R.string.maya_kyc_complete_personal_information_continue_action);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                T2.Q(mayaKycCompletePersonalInformationFragment, string, T2.l(mayaKycCompletePersonalInformationFragment, x6).toString(), null, 12);
                E1.c.m(navControllerFindNavController, x6);
                return Unit.f18162a;
            default:
                return ToggleableComposeCallback_1_7.invoke$lambda$0((ToggleableComposeCallback_1_7) this.c, this.f3185b);
        }
    }
}
