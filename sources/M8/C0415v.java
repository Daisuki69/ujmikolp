package M8;

import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycConfirmExitBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycVerifyWithPhilsysFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C1786a;

/* JADX INFO: renamed from: M8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0415v extends C1786a implements Function2 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0415v(int i, Object obj, Class cls, String str, String str2, int i4, int i6) {
        super(obj, str, i, str2, i4, cls);
        this.h = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.h) {
            case 0:
                String p02 = (String) obj;
                String p1 = (String) obj2;
                kotlin.jvm.internal.j.g(p02, "p0");
                kotlin.jvm.internal.j.g(p1, "p1");
                ((MayaKycAmlcCertificateFragment) this.f18182a).M1(p02, p1, "");
                break;
            case 1:
                String p03 = (String) obj;
                String p12 = (String) obj2;
                kotlin.jvm.internal.j.g(p03, "p0");
                kotlin.jvm.internal.j.g(p12, "p1");
                T2.Q((MayaKycConfirmExitBottomSheetDialogFragment) this.f18182a, p03, p12, null, 12);
                break;
            case 2:
                String p04 = (String) obj;
                String p13 = (String) obj2;
                kotlin.jvm.internal.j.g(p04, "p0");
                kotlin.jvm.internal.j.g(p13, "p1");
                T2.Q((MayaKycConfirmExitBottomSheetDialogFragment) this.f18182a, p04, p13, null, 12);
                break;
            case 3:
                KycFieldType p05 = (KycFieldType) obj;
                String p14 = (String) obj2;
                kotlin.jvm.internal.j.g(p05, "p0");
                kotlin.jvm.internal.j.g(p14, "p1");
                break;
            case 4:
                KycFieldType p06 = (KycFieldType) obj;
                String p15 = (String) obj2;
                kotlin.jvm.internal.j.g(p06, "p0");
                kotlin.jvm.internal.j.g(p15, "p1");
                break;
            case 5:
                KycFieldType p07 = (KycFieldType) obj;
                String p16 = (String) obj2;
                kotlin.jvm.internal.j.g(p07, "p0");
                kotlin.jvm.internal.j.g(p16, "p1");
                break;
            case 6:
                String p08 = (String) obj;
                String p17 = (String) obj2;
                kotlin.jvm.internal.j.g(p08, "p0");
                kotlin.jvm.internal.j.g(p17, "p1");
                ((MayaKycVerifyWithPhilsysFragment) this.f18182a).I1(p08, p17);
                break;
            default:
                String p09 = (String) obj;
                String p18 = (String) obj2;
                kotlin.jvm.internal.j.g(p09, "p0");
                kotlin.jvm.internal.j.g(p18, "p1");
                MayaKycWorkDetailsFragment mayaKycWorkDetailsFragment = (MayaKycWorkDetailsFragment) this.f18182a;
                mayaKycWorkDetailsFragment.getClass();
                String modal = T2.j(mayaKycWorkDetailsFragment);
                Map mapE = cj.M.e();
                kotlin.jvm.internal.j.g(modal, "modal");
                EnumC1216e enumC1216e = EnumC1216e.WORK_INFORMATION;
                com.paymaya.common.utility.D dO = mayaKycWorkDetailsFragment.O();
                String strConcat = modal.concat(" Error");
                L8.a aVar = new L8.a(mayaKycWorkDetailsFragment, mapE, 1);
                L8.b bVar = new L8.b(mayaKycWorkDetailsFragment, 0);
                if (strConcat == null) {
                    strConcat = p18.concat(" Error");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(EnumC1212a.ERROR, p09);
                linkedHashMap.put(EnumC1212a.PAGE_NAME, p18);
                linkedHashMap.put(EnumC1212a.MODAL, strConcat);
                com.paymaya.common.utility.D.c(dO, enumC1216e, 37, linkedHashMap, null, aVar, bVar, 16);
                break;
        }
        return Unit.f18162a;
    }
}
