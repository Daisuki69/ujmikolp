package Bg;

import D8.C0217z;
import M8.K0;
import N5.C0466m;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C1786a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f0 extends C1786a implements Function1 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i, Object obj, Class cls, String str, String str2, int i4, int i6) {
        super(obj, str, i, str2, i4, cls);
        this.h = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.f18182a;
        switch (this.h) {
            case 0:
                Object objC = ((Vg.e) obj2).c((InterfaceC1526a) obj);
                if (objC != EnumC1578a.f17050a) {
                    break;
                }
                break;
            default:
                KycSelectionItem p02 = (KycSelectionItem) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                MayaKycDosriFragment mayaKycDosriFragment = (MayaKycDosriFragment) obj2;
                KycFieldType kycFieldType = mayaKycDosriFragment.f12520X;
                if ((kycFieldType == null ? -1 : K0.f3186a[kycFieldType.ordinal()]) != 1) {
                    Unit unit = Unit.f18162a;
                } else {
                    ConstraintLayout constraintLayout = mayaKycDosriFragment.f12523a0;
                    if (constraintLayout != null) {
                        MayaDropDown mayaDropDown = (MayaDropDown) C0466m.a(constraintLayout).e;
                        mayaDropDown.getDisplayText().setText(p02.getText());
                        mayaDropDown.setSelectedData(p02);
                        mayaDropDown.getDisplayText().setHint("");
                        mayaDropDown.b();
                        ((C0217z) mayaKycDosriFragment.M1()).p();
                        Unit unit2 = Unit.f18162a;
                    }
                }
                break;
        }
        return Unit.f18162a;
    }
}
