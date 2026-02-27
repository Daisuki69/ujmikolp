package n8;

import android.text.Editable;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordSetNewPasswordFragment;
import j8.InterfaceC1671a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: n8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1937e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaForgotPasswordSetNewPasswordFragment f18634b;

    public /* synthetic */ C1937e(MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment, int i) {
        this.f18633a = i;
        this.f18634b = mayaForgotPasswordSetNewPasswordFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        switch (this.f18633a) {
            case 0:
                ((Boolean) obj).getClass();
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment = this.f18634b;
                MayaProfileInputLayout mayaProfileInputLayout = mayaForgotPasswordSetNewPasswordFragment.f12376X;
                if (mayaProfileInputLayout != null) {
                    mayaForgotPasswordSetNewPasswordFragment.o1().c(mayaForgotPasswordSetNewPasswordFragment.requireActivity(), C1219h.b("FORGOT_PASSWORD_SCREEN_INPUTTED", "Set a new password", mayaProfileInputLayout.getLabel().toString(), mayaForgotPasswordSetNewPasswordFragment.f12381c0, mayaForgotPasswordSetNewPasswordFragment.f12383e0, false));
                    return Unit.f18162a;
                }
                j.n("mMayaProfileInputLayoutConfirmNewPassword");
                throw null;
            case 1:
                MayaErrorDialogFragment it = (MayaErrorDialogFragment) obj;
                j.g(it, "it");
                KeyEventDispatcher.Component componentRequireActivity = this.f18634b.requireActivity();
                j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.forgotpassword.view.activity.IMayaForgotPasswordActivityView");
                ((MayaForgotPasswordActivity) ((InterfaceC1671a) componentRequireActivity)).finish();
                return Unit.f18162a;
            case 2:
                MayaErrorDialogFragment it2 = (MayaErrorDialogFragment) obj;
                j.g(it2, "it");
                f fVar = this.f18634b.f12385g0;
                if (fVar != null) {
                    AbstractC1236z.b((MayaForgotPasswordActivity) fVar);
                }
                return Unit.f18162a;
            case 3:
                ((Boolean) obj).getClass();
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment2 = this.f18634b;
                MayaProfileInputLayout mayaProfileInputLayout2 = mayaForgotPasswordSetNewPasswordFragment2.f12375W;
                if (mayaProfileInputLayout2 == null) {
                    j.n("mMayaProfileInputLayoutSetNewPassword");
                    throw null;
                }
                Editable text = mayaProfileInputLayout2.getInputEditText().getText();
                if (text == null || (string = text.toString()) == null) {
                    string = "";
                }
                if (string.length() == 0) {
                    mayaForgotPasswordSetNewPasswordFragment2.f12382d0 = false;
                    String string2 = mayaForgotPasswordSetNewPasswordFragment2.getString(R.string.maya_label_error_new_password_required);
                    j.f(string2, "getString(...)");
                    mayaForgotPasswordSetNewPasswordFragment2.f12384f0 = string2;
                    MayaProfileInputLayout mayaProfileInputLayout3 = mayaForgotPasswordSetNewPasswordFragment2.f12375W;
                    if (mayaProfileInputLayout3 == null) {
                        j.n("mMayaProfileInputLayoutSetNewPassword");
                        throw null;
                    }
                    mayaProfileInputLayout3.setHelperErrorText(string2);
                    mayaProfileInputLayout3.p();
                    mayaForgotPasswordSetNewPasswordFragment2.J1(false);
                }
                return Unit.f18162a;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment3 = this.f18634b;
                mayaForgotPasswordSetNewPasswordFragment3.f12381c0 = zBooleanValue;
                String string3 = mayaForgotPasswordSetNewPasswordFragment3.getString(R.string.maya_change_password_error_retype_password_not_match_new);
                j.f(string3, "getString(...)");
                mayaForgotPasswordSetNewPasswordFragment3.f12383e0 = string3;
                mayaForgotPasswordSetNewPasswordFragment3.K1(string3);
                mayaForgotPasswordSetNewPasswordFragment3.J1(mayaForgotPasswordSetNewPasswordFragment3.f12381c0);
                return Unit.f18162a;
            case 5:
                ((Boolean) obj).getClass();
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment4 = this.f18634b;
                MayaProfileInputLayout mayaProfileInputLayout4 = mayaForgotPasswordSetNewPasswordFragment4.f12375W;
                if (mayaProfileInputLayout4 != null) {
                    mayaForgotPasswordSetNewPasswordFragment4.o1().c(mayaForgotPasswordSetNewPasswordFragment4.requireActivity(), C1219h.b("FORGOT_PASSWORD_SCREEN_INPUTTED", "Set a new password", mayaProfileInputLayout4.getLabel().toString(), mayaForgotPasswordSetNewPasswordFragment4.f12382d0, mayaForgotPasswordSetNewPasswordFragment4.f12384f0, false));
                    return Unit.f18162a;
                }
                j.n("mMayaProfileInputLayoutSetNewPassword");
                throw null;
            case 6:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment5 = this.f18634b;
                mayaForgotPasswordSetNewPasswordFragment5.f12382d0 = zBooleanValue2;
                MayaProfileInputLayout mayaProfileInputLayout5 = mayaForgotPasswordSetNewPasswordFragment5.f12375W;
                if (mayaProfileInputLayout5 == null) {
                    j.n("mMayaProfileInputLayoutSetNewPassword");
                    throw null;
                }
                mayaProfileInputLayout5.f();
                MayaProfileInputLayout mayaProfileInputLayout6 = mayaForgotPasswordSetNewPasswordFragment5.f12376X;
                if (mayaProfileInputLayout6 == null) {
                    j.n("mMayaProfileInputLayoutConfirmNewPassword");
                    throw null;
                }
                mayaProfileInputLayout6.f();
                mayaForgotPasswordSetNewPasswordFragment5.J1(mayaForgotPasswordSetNewPasswordFragment5.f12382d0);
                return Unit.f18162a;
            case 7:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment6 = this.f18634b;
                mayaForgotPasswordSetNewPasswordFragment6.f12382d0 = zBooleanValue3;
                String string4 = mayaForgotPasswordSetNewPasswordFragment6.getString(R.string.maya_change_password_error_retype_password_not_match_new);
                j.f(string4, "getString(...)");
                mayaForgotPasswordSetNewPasswordFragment6.f12383e0 = string4;
                mayaForgotPasswordSetNewPasswordFragment6.K1(string4);
                mayaForgotPasswordSetNewPasswordFragment6.J1(mayaForgotPasswordSetNewPasswordFragment6.f12382d0);
                return Unit.f18162a;
            default:
                ((Boolean) obj).booleanValue();
                MayaForgotPasswordSetNewPasswordFragment mayaForgotPasswordSetNewPasswordFragment7 = this.f18634b;
                if (!mayaForgotPasswordSetNewPasswordFragment7.f12381c0) {
                    String string5 = mayaForgotPasswordSetNewPasswordFragment7.getString(R.string.maya_change_password_error_retype_password_not_match_new);
                    j.f(string5, "getString(...)");
                    mayaForgotPasswordSetNewPasswordFragment7.f12383e0 = string5;
                    mayaForgotPasswordSetNewPasswordFragment7.K1(string5);
                    mayaForgotPasswordSetNewPasswordFragment7.J1(false);
                }
                return Unit.f18162a;
        }
    }
}
