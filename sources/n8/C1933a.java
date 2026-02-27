package n8;

import android.widget.TextView;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordEnterMinFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import zj.o;

/* JADX INFO: renamed from: n8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1933a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18627a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaProfileInputLayout f18628b;
    public final /* synthetic */ MayaForgotPasswordEnterMinFragment c;

    public /* synthetic */ C1933a(MayaProfileInputLayout mayaProfileInputLayout, MayaForgotPasswordEnterMinFragment mayaForgotPasswordEnterMinFragment) {
        this.f18628b = mayaProfileInputLayout;
        this.c = mayaForgotPasswordEnterMinFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MayaForgotPasswordEnterMinFragment mayaForgotPasswordEnterMinFragment = this.c;
        MayaProfileInputLayout mayaProfileInputLayout = this.f18628b;
        switch (this.f18627a) {
            case 0:
                mayaForgotPasswordEnterMinFragment.f12371a0 = false;
                String string = mayaForgotPasswordEnterMinFragment.getString(R.string.maya_format_missing_field_is_required, mayaForgotPasswordEnterMinFragment.getString(R.string.maya_label_mobile_number));
                j.f(string, "getString(...)");
                mayaForgotPasswordEnterMinFragment.I1(string);
                mayaProfileInputLayout.p();
                mayaForgotPasswordEnterMinFragment.J1().k();
                return Unit.f18162a;
            default:
                String strValueOf = String.valueOf(mayaProfileInputLayout.getInputEditText().getText());
                o oVar = Je.c.f2514a;
                if (!Je.c.f2514a.e(strValueOf)) {
                    mayaForgotPasswordEnterMinFragment.f12371a0 = false;
                    String string2 = mayaForgotPasswordEnterMinFragment.getString(R.string.maya_error_change_min_invalid_mobile_number);
                    j.f(string2, "getString(...)");
                    mayaForgotPasswordEnterMinFragment.I1(string2);
                    mayaProfileInputLayout.p();
                    mayaForgotPasswordEnterMinFragment.J1().k();
                    return Unit.f18162a;
                }
                mayaForgotPasswordEnterMinFragment.f12371a0 = true;
                TextView textView = mayaForgotPasswordEnterMinFragment.f12368X;
                if (textView == null) {
                    j.n("mMobileNumberHelperErrorTextView");
                    throw null;
                }
                textView.setVisibility(8);
                mayaProfileInputLayout.f();
                mayaForgotPasswordEnterMinFragment.J1().k();
                return Unit.f18162a;
        }
    }

    public /* synthetic */ C1933a(MayaForgotPasswordEnterMinFragment mayaForgotPasswordEnterMinFragment, MayaProfileInputLayout mayaProfileInputLayout) {
        this.c = mayaForgotPasswordEnterMinFragment;
        this.f18628b = mayaProfileInputLayout;
    }
}
