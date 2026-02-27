package ha;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.paymaya.R;
import com.paymaya.domain.model.Billable;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.Favorite;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsFormFragment f17020b;

    public /* synthetic */ s(MayaPayBillsFormFragment mayaPayBillsFormFragment, int i) {
        this.f17019a = i;
        this.f17020b = mayaPayBillsFormFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String strTnTj78 = numX49.tnTj78("bSHo");
        String strTnTj782 = numX49.tnTj78("bSHK");
        String strTnTj783 = numX49.tnTj78("bSHw");
        switch (this.f17019a) {
            case 0:
                MayaPayBillsFormFragment mayaPayBillsFormFragment = this.f17020b;
                String string = mayaPayBillsFormFragment.getString(R.string.maya_toast_error_invalid_date_format);
                kotlin.jvm.internal.j.f(string, strTnTj783);
                w wVar = mayaPayBillsFormFragment.f13419C0;
                if (wVar != null) {
                    M2.b.Z(0, mayaPayBillsFormFragment.getString(R.string.maya_toast_error_title_pay_bills_error), string, null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(((MayaPayBillsActivity) wVar).getSupportFragmentManager(), numX49.tnTj78("bSH6"));
                }
                return Unit.f18162a;
            case 1:
                ba.C c = (ba.C) this.f17020b.S1();
                MayaPayBillsFormFragment mayaPayBillsFormFragment2 = (MayaPayBillsFormFragment) ((ga.e) c.c.get());
                MayaInputLayout mayaInputLayout = mayaPayBillsFormFragment2.f13435r0;
                if (mayaInputLayout == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout.setHelperErrorText(mayaPayBillsFormFragment2.getString(R.string.maya_format_missing_field_is_required, mayaInputLayout.getLabel()));
                MayaInputLayout mayaInputLayout2 = mayaPayBillsFormFragment2.f13435r0;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout2.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_error_badge);
                c.y(strTnTj782, false);
                MayaPayBillsFormFragment mayaPayBillsFormFragment3 = (MayaPayBillsFormFragment) ((ga.e) c.c.get());
                MayaInputLayout mayaInputLayout3 = mayaPayBillsFormFragment3.f13435r0;
                if (mayaInputLayout3 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout3.p();
                MayaInputLayout mayaInputLayout4 = mayaPayBillsFormFragment3.f13435r0;
                if (mayaInputLayout4 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout4.s();
                MayaPayBillsFormFragment mayaPayBillsFormFragment4 = (MayaPayBillsFormFragment) ((ga.e) c.c.get());
                MayaInputLayout mayaInputLayout5 = mayaPayBillsFormFragment4.f13435r0;
                if (mayaInputLayout5 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                String string2 = mayaInputLayout5.getLabel().toString();
                String string3 = mayaPayBillsFormFragment4.getString(R.string.maya_format_missing_field_is_required, string2);
                kotlin.jvm.internal.j.f(string3, strTnTj783);
                ((ba.C) mayaPayBillsFormFragment4.S1()).w(string2, string3, mayaPayBillsFormFragment4.f13428M0);
                return Unit.f18162a;
            case 2:
                ba.C c10 = (ba.C) this.f17020b.S1();
                c10.y(strTnTj782, true);
                MayaPayBillsFormFragment mayaPayBillsFormFragment5 = (MayaPayBillsFormFragment) ((ga.e) c10.c.get());
                MayaInputLayout mayaInputLayout6 = mayaPayBillsFormFragment5.f13435r0;
                if (mayaInputLayout6 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                mayaInputLayout6.f();
                MayaInputLayout mayaInputLayout7 = mayaPayBillsFormFragment5.f13435r0;
                if (mayaInputLayout7 != null) {
                    mayaInputLayout7.i();
                    return Unit.f18162a;
                }
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            case 3:
                String string4 = this.f17020b.getString(R.string.maya_php_currency);
                kotlin.jvm.internal.j.f(string4, strTnTj783);
                return string4;
            case 4:
                Bundle arguments = this.f17020b.getArguments();
                if (arguments != null) {
                    return (Biller) arguments.getParcelable(numX49.tnTj78("bSHN"));
                }
                return null;
            case 5:
                Bundle arguments2 = this.f17020b.getArguments();
                if (arguments2 != null) {
                    return (Billable) arguments2.getParcelable(numX49.tnTj78("bSHM"));
                }
                return null;
            case 6:
                Bundle arguments3 = this.f17020b.getArguments();
                if (arguments3 != null) {
                    return (Favorite) arguments3.getParcelable(numX49.tnTj78("bSHh"));
                }
                return null;
            case 7:
                Bundle arguments4 = this.f17020b.getArguments();
                if (arguments4 != null) {
                    return arguments4.getString(numX49.tnTj78("bSHD"));
                }
                return null;
            case 8:
                Bundle arguments5 = this.f17020b.getArguments();
                if (arguments5 != null) {
                    return arguments5.getString(numX49.tnTj78("bSHm"));
                }
                return null;
            case 9:
                w wVar2 = this.f17020b.f13419C0;
                if (wVar2 != null) {
                    return ((MayaPayBillsActivity) wVar2).f13341t;
                }
                return null;
            default:
                Bundle arguments6 = this.f17020b.getArguments();
                return Boolean.valueOf(arguments6 != null ? arguments6.getBoolean(numX49.tnTj78("bSHc")) : true);
        }
    }
}
