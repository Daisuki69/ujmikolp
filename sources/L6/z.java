package L6;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import dOYHB6.yFtIp6.svM7M6;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends G5.h {
    public final /* synthetic */ MayaCashInViaCardFormFragment f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(AppCompatEditText appCompatEditText, MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment) {
        super(appCompatEditText);
        this.f = mayaCashInViaCardFormFragment;
    }

    @Override // G5.h
    public final void a() {
        G6.s sVarH1 = this.f.H1();
        String strG1 = ((MayaCashInViaCardFormFragment) ((K6.l) sVarH1.c.get())).G1();
        String string = svM7M6.getString(sVarH1.f1813d.f11330b, "key_visa_scheme", "");
        if (string != null && !C2576A.H(string)) {
            String string2 = svM7M6.getString(sVarH1.f1813d.f11330b, "key_visa_scheme", "");
            kotlin.jvm.internal.j.f(string2, "getVisaSchemeRegexPattern(...)");
            if (new zj.o(string2).e(strG1)) {
                MayaInputLayout mayaInputLayout = ((MayaCashInViaCardFormFragment) ((K6.l) sVarH1.c.get())).f11742f0;
                if (mayaInputLayout != null) {
                    mayaInputLayout.getPrimaryIconImageView().setImageResource(R.drawable.maya_ic_card_scheme_visa);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mCardNumberMayaInputLayout");
                    throw null;
                }
            }
        }
        String string3 = svM7M6.getString(sVarH1.f1813d.f11330b, "key_mastercard_scheme", "");
        if (string3 != null && !C2576A.H(string3)) {
            String string4 = svM7M6.getString(sVarH1.f1813d.f11330b, "key_mastercard_scheme", "");
            kotlin.jvm.internal.j.f(string4, "getMastercardSchemeRegexPattern(...)");
            if (new zj.o(string4).e(strG1)) {
                MayaInputLayout mayaInputLayout2 = ((MayaCashInViaCardFormFragment) ((K6.l) sVarH1.c.get())).f11742f0;
                if (mayaInputLayout2 != null) {
                    mayaInputLayout2.getPrimaryIconImageView().setImageResource(R.drawable.maya_ic_card_scheme_mastercard);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mCardNumberMayaInputLayout");
                    throw null;
                }
            }
        }
        if (AbstractC1213b.U("^(?:2131|1800|35\\d{3})\\d{11}$", strG1)) {
            MayaInputLayout mayaInputLayout3 = ((MayaCashInViaCardFormFragment) ((K6.l) sVarH1.c.get())).f11742f0;
            if (mayaInputLayout3 != null) {
                mayaInputLayout3.getPrimaryIconImageView().setImageResource(R.drawable.maya_ic_card_scheme_jcb);
                return;
            } else {
                kotlin.jvm.internal.j.n("mCardNumberMayaInputLayout");
                throw null;
            }
        }
        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = (MayaCashInViaCardFormFragment) ((K6.l) sVarH1.c.get());
        MayaInputLayout mayaInputLayout4 = mayaCashInViaCardFormFragment.f11742f0;
        if (mayaInputLayout4 != null) {
            mayaInputLayout4.getPrimaryIconImageView().setImageDrawable(ContextCompat.getDrawable(mayaCashInViaCardFormFragment.requireContext(), R.drawable.maya_ic_credit_card_quaternary));
        } else {
            kotlin.jvm.internal.j.n("mCardNumberMayaInputLayout");
            throw null;
        }
    }
}
