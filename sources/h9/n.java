package h9;

import android.widget.TextView;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationIdentityFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16955a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaInputLayout f16956b;
    public final /* synthetic */ MayaRegistrationIdentityFragment c;

    public /* synthetic */ n(MayaInputLayout mayaInputLayout, MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment) {
        this.f16956b = mayaInputLayout;
        this.c = mayaRegistrationIdentityFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment = this.c;
        MayaInputLayout mayaInputLayout = this.f16956b;
        switch (this.f16955a) {
            case 0:
                mayaRegistrationIdentityFragment.f12803h0 = false;
                String string = mayaRegistrationIdentityFragment.getString(R.string.maya_format_missing_field_is_required, mayaRegistrationIdentityFragment.getString(R.string.maya_label_mobile_number));
                kotlin.jvm.internal.j.f(string, "getString(...)");
                mayaRegistrationIdentityFragment.f12804i0 = string;
                TextView textView = mayaRegistrationIdentityFragment.f12797b0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mMobileNumberHelperErrorTextView");
                    throw null;
                }
                textView.setVisibility(0);
                TextView textView2 = mayaRegistrationIdentityFragment.f12797b0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mMobileNumberHelperErrorTextView");
                    throw null;
                }
                textView2.setText(string);
                ((Z8.f) mayaRegistrationIdentityFragment.J1()).l();
                mayaInputLayout.p();
                return Unit.f18162a;
            default:
                if (String.valueOf(mayaInputLayout.getInputEditText().getText()).matches("^((\\+?63)|0)?[0-9]{10}$")) {
                    mayaRegistrationIdentityFragment.f12803h0 = true;
                    mayaRegistrationIdentityFragment.f12804i0 = "";
                    TextView textView3 = mayaRegistrationIdentityFragment.f12797b0;
                    if (textView3 == null) {
                        kotlin.jvm.internal.j.n("mMobileNumberHelperErrorTextView");
                        throw null;
                    }
                    textView3.setVisibility(8);
                    ((Z8.f) mayaRegistrationIdentityFragment.J1()).l();
                    mayaInputLayout.f();
                    return Unit.f18162a;
                }
                mayaRegistrationIdentityFragment.f12803h0 = false;
                String string2 = mayaRegistrationIdentityFragment.getString(R.string.maya_error_registration_identity_enter_valid_mobile_number);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                mayaRegistrationIdentityFragment.f12804i0 = string2;
                TextView textView4 = mayaRegistrationIdentityFragment.f12797b0;
                if (textView4 == null) {
                    kotlin.jvm.internal.j.n("mMobileNumberHelperErrorTextView");
                    throw null;
                }
                textView4.setVisibility(0);
                TextView textView5 = mayaRegistrationIdentityFragment.f12797b0;
                if (textView5 == null) {
                    kotlin.jvm.internal.j.n("mMobileNumberHelperErrorTextView");
                    throw null;
                }
                textView5.setText(string2);
                ((Z8.f) mayaRegistrationIdentityFragment.J1()).l();
                mayaInputLayout.p();
                return Unit.f18162a;
        }
    }

    public /* synthetic */ n(MayaRegistrationIdentityFragment mayaRegistrationIdentityFragment, MayaInputLayout mayaInputLayout) {
        this.c = mayaRegistrationIdentityFragment;
        this.f16956b = mayaInputLayout;
    }
}
