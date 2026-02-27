package ha;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: ha.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1554g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsBIRFragment f16999b;

    public /* synthetic */ C1554g(MayaPayBillsBIRFragment mayaPayBillsBIRFragment, int i) {
        this.f16998a = i;
        this.f16999b = mayaPayBillsBIRFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strTnTj78 = numX49.tnTj78("bSHPt");
        String strTnTj782 = numX49.tnTj78("bSHPU");
        String strTnTj783 = numX49.tnTj78("bSHPe");
        switch (this.f16998a) {
            case 0:
                return Boolean.valueOf(this.f16999b.f13392M0);
            case 1:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = this.f16999b;
                mayaPayBillsBIRFragment.f2();
                ((ba.s) mayaPayBillsBIRFragment.V1()).v(strTnTj783, false);
                return Unit.f18162a;
            case 2:
                ((ba.s) this.f16999b.V1()).v(strTnTj783, true);
                return Unit.f18162a;
            case 3:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = this.f16999b;
                MayaInputLayout mayaInputLayout = mayaPayBillsBIRFragment2.u0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout.p();
                MayaInputLayout mayaInputLayout2 = mayaPayBillsBIRFragment2.u0;
                if (mayaInputLayout2 != null) {
                    mayaInputLayout2.setHelperErrorText(mayaPayBillsBIRFragment2.getString(R.string.maya_error_pay_bills_missing_field, mayaPayBillsBIRFragment2.getString(R.string.maya_label_amount)));
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            case 4:
                MayaInputLayout mayaInputLayout3 = this.f16999b.u0;
                if (mayaInputLayout3 != null) {
                    mayaInputLayout3.f();
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            case 5:
                ba.s sVar = (ba.s) this.f16999b.V1();
                sVar.v(strTnTj783, false);
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment3 = (MayaPayBillsBIRFragment) ((ga.c) sVar.c.get());
                MayaInputLayout mayaInputLayout4 = mayaPayBillsBIRFragment3.f13396r0;
                if (mayaInputLayout4 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                mayaInputLayout4.setHelperErrorText(mayaPayBillsBIRFragment3.getString(R.string.maya_format_missing_field_is_required, mayaInputLayout4.getLabel()));
                MayaInputLayout mayaInputLayout5 = mayaPayBillsBIRFragment3.f13396r0;
                if (mayaInputLayout5 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                mayaInputLayout5.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_error_badge);
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment4 = (MayaPayBillsBIRFragment) ((ga.c) sVar.c.get());
                MayaInputLayout mayaInputLayout6 = mayaPayBillsBIRFragment4.f13396r0;
                if (mayaInputLayout6 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                mayaInputLayout6.p();
                MayaInputLayout mayaInputLayout7 = mayaPayBillsBIRFragment4.f13396r0;
                if (mayaInputLayout7 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                mayaInputLayout7.s();
                ((MayaPayBillsBIRFragment) ((ga.c) sVar.c.get())).Y1();
                return Unit.f18162a;
            case 6:
                ba.s sVar2 = (ba.s) this.f16999b.V1();
                sVar2.v(strTnTj783, true);
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment5 = (MayaPayBillsBIRFragment) ((ga.c) sVar2.c.get());
                MayaInputLayout mayaInputLayout8 = mayaPayBillsBIRFragment5.f13396r0;
                if (mayaInputLayout8 == null) {
                    kotlin.jvm.internal.j.n(strTnTj782);
                    throw null;
                }
                mayaInputLayout8.f();
                MayaInputLayout mayaInputLayout9 = mayaPayBillsBIRFragment5.f13396r0;
                if (mayaInputLayout9 != null) {
                    mayaInputLayout9.i();
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n(strTnTj782);
                throw null;
            default:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment6 = this.f16999b;
                String string = mayaPayBillsBIRFragment6.getString(R.string.maya_toast_error_invalid_date_format);
                m mVar = mayaPayBillsBIRFragment6.f13391L0;
                if (mVar != null) {
                    M2.b.Z(0, mayaPayBillsBIRFragment6.getString(R.string.maya_toast_error_title_pay_bills_error), string, null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(((MayaPayBillsActivity) mVar).getSupportFragmentManager(), numX49.tnTj78("bSHP8"));
                }
                return Unit.f18162a;
        }
    }
}
