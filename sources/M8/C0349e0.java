package M8;

import N5.C0457h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompleteYourMayaExperienceFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: M8.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0349e0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycCompleteYourMayaExperienceFragmentV2 f3289b;

    public /* synthetic */ C0349e0(MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV2, int i) {
        this.f3288a = i;
        this.f3289b = mayaKycCompleteYourMayaExperienceFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3288a) {
            case 0:
                return new J8.p(this.f3289b);
            default:
                MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV2 = this.f3289b;
                ConstraintLayout constraintLayout = ((C0457h0) mayaKycCompleteYourMayaExperienceFragmentV2.G1()).f4103a;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                NavController navControllerFindNavController = Navigation.findNavController(constraintLayout);
                ActionOnlyNavDirections actionOnlyNavDirections = new ActionOnlyNavDirections(R.id.action_mayaKycCompleteYourMayaExperienceFragmentV2_to_maya_kyc_submit_id_fragment);
                T2.Q(mayaKycCompleteYourMayaExperienceFragmentV2, ((C0457h0) mayaKycCompleteYourMayaExperienceFragmentV2.G1()).c.getText().toString(), T2.l(mayaKycCompleteYourMayaExperienceFragmentV2, actionOnlyNavDirections).toString(), null, 12);
                KeyEventDispatcher.Component componentRequireActivity = mayaKycCompleteYourMayaExperienceFragmentV2.requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                ((MayaKycActivity) ((H8.b) componentRequireActivity)).k2();
                E1.c.m(navControllerFindNavController, actionOnlyNavDirections);
                return Unit.f18162a;
        }
    }
}
