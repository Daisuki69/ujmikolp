package ha;

import com.paymaya.R;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsFormFragment f17022b;
    public final /* synthetic */ UIComponent c;

    public /* synthetic */ t(MayaPayBillsFormFragment mayaPayBillsFormFragment, UIComponent uIComponent, int i) {
        this.f17021a = i;
        this.f17022b = mayaPayBillsFormFragment;
        this.c = uIComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        HashMap map;
        MayaInputLayout mayaInputLayout;
        HashMap map2;
        MayaInputLayout mayaInputLayout2;
        switch (this.f17021a) {
            case 0:
                ((ba.C) this.f17022b.S1()).r(this.c);
                break;
            case 1:
                ((ba.C) this.f17022b.S1()).r(this.c);
                break;
            case 2:
                MayaPayBillsFormFragment mayaPayBillsFormFragment = this.f17022b;
                UIComponent uIComponent = this.c;
                ba.C c = (ba.C) mayaPayBillsFormFragment.S1();
                ga.e eVar = (ga.e) c.c.get();
                String strParameter = uIComponent.parameter();
                String strTnTj78 = numX49.tnTj78("bSHPo");
                kotlin.jvm.internal.j.f(strParameter, strTnTj78);
                ((MayaPayBillsFormFragment) eVar).T1(strParameter);
                String strParameter2 = uIComponent.parameter();
                kotlin.jvm.internal.j.f(strParameter2, strTnTj78);
                c.y(strParameter2, true);
                break;
            case 3:
                MayaPayBillsFormFragment mayaPayBillsFormFragment2 = this.f17022b;
                UIComponent uIComponent2 = this.c;
                ba.C c10 = (ba.C) mayaPayBillsFormFragment2.S1();
                String strParameter3 = uIComponent2.parameter();
                ga.e eVar2 = (ga.e) c10.c.get();
                kotlin.jvm.internal.j.d(strParameter3);
                String strPlaceholder = uIComponent2.placeholder();
                String strTnTj782 = numX49.tnTj78("bSHPC");
                kotlin.jvm.internal.j.f(strPlaceholder, strTnTj782);
                MayaPayBillsFormFragment mayaPayBillsFormFragment3 = (MayaPayBillsFormFragment) eVar2;
                mayaPayBillsFormFragment3.getClass();
                Ci.b bVar = mayaPayBillsFormFragment3.f13417A0;
                if (bVar != null && (map2 = (HashMap) bVar.f) != null && (mayaInputLayout2 = (MayaInputLayout) map2.get(strParameter3)) != null) {
                    mayaInputLayout2.setHelperErrorText(mayaPayBillsFormFragment3.getString(R.string.maya_error_pay_bills_invalid_field, strPlaceholder));
                    mayaInputLayout2.getSecondaryIconImageView().setImageResource(R.drawable.maya_ic_information_error_badge);
                }
                Ci.b bVar2 = ((MayaPayBillsFormFragment) ((ga.e) c10.c.get())).f13417A0;
                if (bVar2 != null && (map = (HashMap) bVar2.f) != null && (mayaInputLayout = (MayaInputLayout) map.get(strParameter3)) != null) {
                    mayaInputLayout.p();
                    mayaInputLayout.s();
                }
                c10.y(strParameter3, false);
                ga.e eVar3 = (ga.e) c10.c.get();
                String strPlaceholder2 = uIComponent2.placeholder();
                kotlin.jvm.internal.j.f(strPlaceholder2, strTnTj782);
                MayaPayBillsFormFragment mayaPayBillsFormFragment4 = (MayaPayBillsFormFragment) eVar3;
                mayaPayBillsFormFragment4.getClass();
                String string = mayaPayBillsFormFragment4.getString(R.string.maya_error_pay_bills_invalid_field, strPlaceholder2);
                kotlin.jvm.internal.j.f(string, numX49.tnTj78("bSHP4"));
                ((ba.C) mayaPayBillsFormFragment4.S1()).w(strPlaceholder2, string, mayaPayBillsFormFragment4.f13428M0);
                break;
            default:
                ((ba.C) this.f17022b.S1()).r(this.c);
                break;
        }
        return Unit.f18162a;
    }
}
