package ha;

import com.paymaya.R;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: ha.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1557j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsBIRFragment f17006b;
    public final /* synthetic */ UIComponent c;

    public /* synthetic */ C1557j(MayaPayBillsBIRFragment mayaPayBillsBIRFragment, UIComponent uIComponent, int i) {
        this.f17005a = i;
        this.f17006b = mayaPayBillsBIRFragment;
        this.c = uIComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strTnTj78 = numX49.tnTj78("bSHPM");
        String strTnTj782 = numX49.tnTj78("bSHPN");
        switch (this.f17005a) {
            case 0:
                ((ba.s) this.f17006b.V1()).s(this.c);
                return Unit.f18162a;
            case 1:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = this.f17006b;
                UIComponent uIComponent = this.c;
                aa.b bVarV1 = mayaPayBillsBIRFragment.V1();
                String strParameter = uIComponent.parameter();
                kotlin.jvm.internal.j.f(strParameter, strTnTj782);
                ((ba.s) bVarV1).v(strParameter, false);
                ba.s sVar = (ba.s) mayaPayBillsBIRFragment.V1();
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = (MayaPayBillsBIRFragment) ((ga.c) sVar.c.get());
                MayaInputLayout mayaInputLayout = mayaPayBillsBIRFragment2.w0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout.setHelperErrorText(mayaPayBillsBIRFragment2.getString(R.string.maya_format_missing_field_is_required, mayaInputLayout.getLabel()));
                MayaInputLayout mayaInputLayout2 = mayaPayBillsBIRFragment2.w0;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout2.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_error_badge);
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment3 = (MayaPayBillsBIRFragment) ((ga.c) sVar.c.get());
                MayaInputLayout mayaInputLayout3 = mayaPayBillsBIRFragment3.w0;
                if (mayaInputLayout3 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout3.p();
                MayaInputLayout mayaInputLayout4 = mayaPayBillsBIRFragment3.w0;
                if (mayaInputLayout4 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout4.s();
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment4 = (MayaPayBillsBIRFragment) ((ga.c) sVar.c.get());
                MayaInputLayout mayaInputLayout5 = mayaPayBillsBIRFragment4.w0;
                if (mayaInputLayout5 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                String string = mayaInputLayout5.getLabel().toString();
                String string2 = mayaPayBillsBIRFragment4.getString(R.string.maya_format_missing_field_is_required, string);
                kotlin.jvm.internal.j.f(string2, numX49.tnTj78("bSHPa"));
                ((ba.s) mayaPayBillsBIRFragment4.V1()).t(string, string2);
                return Unit.f18162a;
            case 2:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment5 = this.f17006b;
                UIComponent uIComponent2 = this.c;
                aa.b bVarV12 = mayaPayBillsBIRFragment5.V1();
                String strParameter2 = uIComponent2.parameter();
                kotlin.jvm.internal.j.f(strParameter2, strTnTj782);
                ((ba.s) bVarV12).v(strParameter2, true);
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment6 = (MayaPayBillsBIRFragment) ((ga.c) ((ba.s) mayaPayBillsBIRFragment5.V1()).c.get());
                MayaInputLayout mayaInputLayout6 = mayaPayBillsBIRFragment6.w0;
                if (mayaInputLayout6 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout6.f();
                MayaInputLayout mayaInputLayout7 = mayaPayBillsBIRFragment6.w0;
                if (mayaInputLayout7 != null) {
                    mayaInputLayout7.i();
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            case 3:
                aa.b bVarV13 = this.f17006b.V1();
                String strParameter3 = this.c.parameter();
                kotlin.jvm.internal.j.f(strParameter3, strTnTj782);
                ((ba.s) bVarV13).v(strParameter3, true);
                return Unit.f18162a;
            case 4:
                aa.b bVarV14 = this.f17006b.V1();
                String strParameter4 = this.c.parameter();
                kotlin.jvm.internal.j.f(strParameter4, strTnTj782);
                ((ba.s) bVarV14).v(strParameter4, false);
                return Unit.f18162a;
            case 5:
                UIComponent uIComponent3 = this.c;
                String strParameter5 = uIComponent3.parameter();
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment7 = this.f17006b;
                mayaPayBillsBIRFragment7.W1(strParameter5);
                aa.b bVarV15 = mayaPayBillsBIRFragment7.V1();
                String strParameter6 = uIComponent3.parameter();
                kotlin.jvm.internal.j.f(strParameter6, strTnTj782);
                ((ba.s) bVarV15).v(strParameter6, true);
                return Unit.f18162a;
            case 6:
                UIComponent uIComponent4 = this.c;
                String strParameter7 = uIComponent4.parameter();
                String strPlaceholder = uIComponent4.placeholder();
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment8 = this.f17006b;
                Ci.b bVar = mayaPayBillsBIRFragment8.f13389J0;
                if (bVar == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bSHP6"));
                    throw null;
                }
                MayaInputLayout mayaInputLayout8 = (MayaInputLayout) ((HashMap) bVar.f).get(strParameter7);
                if (mayaInputLayout8 != null) {
                    mayaInputLayout8.setHelperErrorText(mayaPayBillsBIRFragment8.getString(R.string.maya_error_pay_bills_invalid_field, strPlaceholder));
                    mayaInputLayout8.p();
                }
                aa.b bVarV16 = mayaPayBillsBIRFragment8.V1();
                String strParameter8 = uIComponent4.parameter();
                kotlin.jvm.internal.j.f(strParameter8, strTnTj782);
                ((ba.s) bVarV16).v(strParameter8, false);
                return Unit.f18162a;
            case 7:
                ((ba.s) this.f17006b.V1()).s(this.c);
                return Unit.f18162a;
            case 8:
                ((ba.s) this.f17006b.V1()).s(this.c);
                return Unit.f18162a;
            default:
                ((ba.s) this.f17006b.V1()).s(this.c);
                return Unit.f18162a;
        }
    }
}
