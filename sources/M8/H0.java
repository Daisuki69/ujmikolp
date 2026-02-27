package M8;

import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.domain.model.UpdateProfileCmsContentData;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class H0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3172b;
    public final /* synthetic */ Object c;

    public /* synthetic */ H0(int i, Object obj, Object obj2) {
        this.f3171a = i;
        this.f3172b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v23, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3171a) {
            case 0:
                KycFieldType fieldType = (KycFieldType) obj;
                String value = (String) obj2;
                kotlin.jvm.internal.j.g(fieldType, "fieldType");
                kotlin.jvm.internal.j.g(value, "value");
                break;
            case 1:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = (MayaPayBillsBIRFragment) this.f3172b;
                UIComponent uIComponent = (UIComponent) this.c;
                String updatedDateString = (String) obj;
                String updatedDisplayedDate = (String) obj2;
                kotlin.jvm.internal.j.g(updatedDateString, "updatedDateString");
                kotlin.jvm.internal.j.g(updatedDisplayedDate, "updatedDisplayedDate");
                ba.s sVar = (ba.s) mayaPayBillsBIRFragment.V1();
                sVar.q().setBillerFieldInput(uIComponent, updatedDateString, updatedDisplayedDate);
                ((MayaPayBillsBIRFragment) ((ga.c) sVar.c.get())).W1(uIComponent.parameter());
                String strParameter = uIComponent.parameter();
                kotlin.jvm.internal.j.f(strParameter, "parameter(...)");
                sVar.v(strParameter, true);
                ((MayaPayBillsBIRFragment) ((ga.c) sVar.c.get())).d2(sVar.l(sVar.q().build()) && sVar.m());
                break;
            case 2:
                MayaPayBillsFormFragment mayaPayBillsFormFragment = (MayaPayBillsFormFragment) this.f3172b;
                UIComponent uIComponent2 = (UIComponent) this.c;
                String updatedDateString2 = (String) obj;
                String updatedDisplayedDate2 = (String) obj2;
                kotlin.jvm.internal.j.g(updatedDateString2, "updatedDateString");
                kotlin.jvm.internal.j.g(updatedDisplayedDate2, "updatedDisplayedDate");
                ba.C c = (ba.C) mayaPayBillsFormFragment.S1();
                ((MayaPayBillsFormFragment) ((ga.e) c.c.get())).Q1().setBillerFieldInput(uIComponent2, updatedDateString2, updatedDisplayedDate2);
                ga.e eVar = (ga.e) c.c.get();
                String strParameter2 = uIComponent2.parameter();
                kotlin.jvm.internal.j.f(strParameter2, "parameter(...)");
                ((MayaPayBillsFormFragment) eVar).T1(strParameter2);
                String strParameter3 = uIComponent2.parameter();
                kotlin.jvm.internal.j.f(strParameter3, "parameter(...)");
                c.y(strParameter3, true);
                break;
            default:
                MayaUpdateProfileData userProfileData = (MayaUpdateProfileData) obj2;
                kotlin.jvm.internal.j.g(userProfileData, "userProfileData");
                ((qc.d) this.f3172b).h = (UpdateProfileCmsContentData) obj;
                ((kotlin.jvm.internal.i) this.c).invoke(userProfileData);
                break;
        }
        return Unit.f18162a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ H0(qc.d dVar, Function1 function1) {
        this.f3171a = 3;
        this.f3172b = dVar;
        this.c = (kotlin.jvm.internal.i) function1;
    }
}
