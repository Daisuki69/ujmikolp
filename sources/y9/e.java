package y9;

import android.widget.Button;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaMultiTypeOtpFragment f21085b;

    public /* synthetic */ e(MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment, int i) {
        this.f21084a = i;
        this.f21085b = mayaMultiTypeOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f21084a) {
            case 0:
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = this.f21085b;
                mayaMultiTypeOtpFragment.I1().c();
                f fVar = mayaMultiTypeOtpFragment.f12943W;
                if (fVar != null) {
                    String strM = AbstractC1213b.m(9);
                    j.f(strM, "tapped(...)");
                    MfaMeta mfaMetaJ1 = mayaMultiTypeOtpFragment.J1();
                    String successScreen = mfaMetaJ1 != null ? mfaMetaJ1.getSuccessScreen() : null;
                    if (successScreen == null) {
                        successScreen = "";
                    }
                    Button button = mayaMultiTypeOtpFragment.f12947a0;
                    if (button == null) {
                        j.n("mVerifyButton");
                        throw null;
                    }
                    ((MayaMfaActivity) fVar).c2(strM, "Enter the OTP", successScreen, button.getText().toString());
                }
                return Unit.f18162a;
            case 1:
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment2 = this.f21085b;
                f fVar2 = mayaMultiTypeOtpFragment2.f12943W;
                if (fVar2 != null) {
                    String strM2 = AbstractC1213b.m(12);
                    j.f(strM2, "tapped(...)");
                    String string = mayaMultiTypeOtpFragment2.getString(R.string.maya_label_back_to_login);
                    j.f(string, "getString(...)");
                    ((MayaMfaActivity) fVar2).c2(strM2, "Authentication expired (Dialog)", "Login Page", string);
                }
                return Unit.f18162a;
            case 2:
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment3 = this.f21085b;
                f fVar3 = mayaMultiTypeOtpFragment3.f12943W;
                if (fVar3 != null) {
                    String strM3 = AbstractC1213b.m(12);
                    j.f(strM3, "tapped(...)");
                    String string2 = mayaMultiTypeOtpFragment3.getString(R.string.maya_label_retry);
                    j.f(string2, "getString(...)");
                    ((MayaMfaActivity) fVar3).c2(strM3, "Authentication expired (Dialog)", "Enter your number", string2);
                }
                return Unit.f18162a;
            case 3:
                MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment4 = this.f21085b;
                f fVar4 = mayaMultiTypeOtpFragment4.f12943W;
                if (fVar4 != null) {
                    String strM4 = AbstractC1213b.m(10);
                    j.f(strM4, "tapped(...)");
                    MfaMeta mfaMetaJ12 = mayaMultiTypeOtpFragment4.J1();
                    String sourceScreen = mfaMetaJ12 != null ? mfaMetaJ12.getSourceScreen() : null;
                    if (sourceScreen == null) {
                        sourceScreen = "";
                    }
                    String string3 = mayaMultiTypeOtpFragment4.getString(R.string.maya_label_got_it);
                    j.f(string3, "getString(...)");
                    ((MayaMfaActivity) fVar4).c2(strM4, "Max OTP attempts reached (Dialog)", sourceScreen, string3);
                }
                return Unit.f18162a;
            default:
                f fVar5 = this.f21085b.f12943W;
                if (fVar5 != null) {
                    String strM5 = AbstractC1213b.m(11);
                    j.f(strM5, "tapped(...)");
                    ((MayaMfaActivity) fVar5).c2(strM5, "Max resend attempts reached (Dialog)", "Enter the OTP", "Close");
                }
                return Unit.f18162a;
        }
    }
}
