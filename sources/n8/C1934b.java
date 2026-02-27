package n8;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.core.view.KeyEventDispatcher;
import bg.AbstractC0983W;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.MFAChallengeVerificationResultV2;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordEnterMinFragment;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSetNewPasswordFragment;
import j8.InterfaceC1671a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: n8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1934b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaForgotPasswordEnterMinFragment f18630b;

    public /* synthetic */ C1934b(MayaForgotPasswordEnterMinFragment mayaForgotPasswordEnterMinFragment, int i) {
        this.f18629a = i;
        this.f18630b = mayaForgotPasswordEnterMinFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC1935c interfaceC1935c;
        switch (this.f18629a) {
            case 0:
                ActivityResult result = (ActivityResult) obj;
                j.g(result, "result");
                Intent data = result.getData();
                int resultCode = result.getResultCode();
                MayaForgotPasswordEnterMinFragment mayaForgotPasswordEnterMinFragment = this.f18630b;
                if (resultCode == 1011) {
                    MFAChallengeVerificationResultV2 mFAChallengeVerificationResultV2 = data != null ? (MFAChallengeVerificationResultV2) AbstractC0983W.l(data, "mfa_success_verification_result", MFAChallengeVerificationResultV2.class) : null;
                    String challengeId = mFAChallengeVerificationResultV2 != null ? mFAChallengeVerificationResultV2.getChallengeId() : null;
                    if (challengeId != null && (interfaceC1935c = mayaForgotPasswordEnterMinFragment.f12370Z) != null) {
                        MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment = new MayaForgotPasswordSetNewPasswordFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString("", challengeId);
                        mayaForgotPasswordSetNewPasswordFragment.setArguments(bundle);
                        AbstractC1236z.h((MayaForgotPasswordActivity) interfaceC1935c, R.id.fragment_container, mayaForgotPasswordSetNewPasswordFragment);
                    }
                } else if (resultCode == 1016) {
                    KeyEventDispatcher.Component componentRequireActivity = mayaForgotPasswordEnterMinFragment.requireActivity();
                    j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.forgotpassword.view.activity.IMayaForgotPasswordActivityView");
                    ((MayaForgotPasswordActivity) ((InterfaceC1671a) componentRequireActivity)).finish();
                }
                break;
            default:
                MayaErrorDialogFragment it = (MayaErrorDialogFragment) obj;
                j.g(it, "it");
                KeyEventDispatcher.Component componentRequireActivity2 = this.f18630b.requireActivity();
                j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.forgotpassword.view.activity.IMayaForgotPasswordActivityView");
                ((MayaForgotPasswordActivity) ((InterfaceC1671a) componentRequireActivity2)).finish();
                break;
        }
        return Unit.f18162a;
    }
}
