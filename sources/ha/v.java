package ha;

import com.paymaya.domain.model.UIComponent;
import com.paymaya.domain.model.UIValue;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsFormFragment f17026b;
    public final /* synthetic */ UIComponent c;

    public /* synthetic */ v(MayaPayBillsFormFragment mayaPayBillsFormFragment, UIComponent uIComponent, int i) {
        this.f17025a = i;
        this.f17026b = mayaPayBillsFormFragment;
        this.c = uIComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        switch (this.f17025a) {
            case 0:
                MayaPayBillsFormFragment mayaPayBillsFormFragment = this.f17026b;
                UIComponent uIComponent = this.c;
                String str = (String) obj;
                kotlin.jvm.internal.j.g(str, numX49.tnTj78("bSHPb"));
                ba.C c = (ba.C) mayaPayBillsFormFragment.S1();
                List<UIValue> listValues = uIComponent.values();
                if (listValues != null) {
                    Iterator<T> it = listValues.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (str.equals(((UIValue) next).display())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    UIValue uIValue = (UIValue) next;
                    if (uIValue != null) {
                        ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).Q1().setBillerFieldInput(uIComponent, uIValue.value(), uIValue.display());
                        ga.e eVar = (ga.e) c.c.get();
                        String strParameter = uIComponent.parameter();
                        String strTnTj78 = numX49.tnTj78("bSHP2");
                        kotlin.jvm.internal.j.f(strParameter, strTnTj78);
                        ((MayaPayBillsFormFragment) eVar).T1(strParameter);
                        String strParameter2 = uIComponent.parameter();
                        kotlin.jvm.internal.j.f(strParameter2, strTnTj78);
                        c.y(strParameter2, true);
                    }
                }
                break;
            default:
                MayaPayBillsFormFragment mayaPayBillsFormFragment2 = this.f17026b;
                UIComponent uIComponent2 = this.c;
                String str2 = (String) obj;
                kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bSHPP"));
                ((MayaPayBillsFormFragment) ((ga.e) ((ba.C) mayaPayBillsFormFragment2.S1()).c.get())).Q1().setBillerFieldInput(uIComponent2, str2, str2);
                break;
        }
        return Unit.f18162a;
    }
}
