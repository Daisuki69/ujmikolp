package D8;

import N5.A0;
import android.widget.Button;
import androidx.core.view.KeyEventDispatcher;
import androidx.exifinterface.media.ExifInterface;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.KycValidationResult;
import com.paymaya.domain.model.KycValidationRule;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycVerifyWithPhilsysFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends AbstractC2509a implements B8.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1025d;
    public KycSelectionItem e;

    public W() {
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        ArrayList arrayListD = C1132s.d(new KycSelectionItem(0, "N/A", null, str, false, 28, null), new KycSelectionItem(1, "Jr.", str, str2, false, 28, null), new KycSelectionItem(2, "Sr.", str2, str3, false, 28, null), new KycSelectionItem(3, "II", str3, str4, false, 28, null), new KycSelectionItem(4, "III", str4, str5, false, 28, null), new KycSelectionItem(5, "IV", str5, str6, false, 28, null), new KycSelectionItem(6, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str6, str7, false, 28, null), new KycSelectionItem(7, "VI", str7, str8, false, 28, null), new KycSelectionItem(8, "VII", str8, str9, false, 28, null), new KycSelectionItem(9, "VIII", str9, str10, false, 28, null), new KycSelectionItem(10, "IX", str10, str11, false, 28, null), new KycSelectionItem(11, "X", str11, null, false, 28, null));
        this.f1025d = arrayListD;
        this.e = (KycSelectionItem) C1110A.A(arrayListD);
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        ((Button) ((A0) ((MayaKycVerifyWithPhilsysFragment) ((K8.Q) this.c.get())).G1()).c.f4087b).setEnabled(false);
        LinkedHashMap linkedHashMap = E8.C.f1266a;
        U option = (U) E8.C.a(U.f1022a, "verify_philsys_option");
        MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) this.c.get());
        mayaKycVerifyWithPhilsysFragment.getClass();
        kotlin.jvm.internal.j.g(option, "option");
        A0 a02 = (A0) mayaKycVerifyWithPhilsysFragment.G1();
        a02.f3539a.post(new B5.g(8, option, mayaKycVerifyWithPhilsysFragment));
        ((MayaKycVerifyWithPhilsysFragment) ((K8.Q) this.c.get())).L1(this.e);
        k();
    }

    public final void k() {
        boolean zB;
        ((MayaKycVerifyWithPhilsysFragment) ((K8.Q) this.c.get())).getClass();
        LinkedHashMap linkedHashMap = E8.C.f1266a;
        int iOrdinal = ((U) E8.C.a(U.f1022a, "verify_philsys_option")).ordinal();
        if (iOrdinal == 0) {
            MayaKycVerifyWithPhilsysFragment mayaKycVerifyWithPhilsysFragment = (MayaKycVerifyWithPhilsysFragment) ((K8.Q) this.c.get());
            zB = ((A0) mayaKycVerifyWithPhilsysFragment.G1()).i.b() && ((A0) mayaKycVerifyWithPhilsysFragment.G1()).f3543k.b() && ((A0) mayaKycVerifyWithPhilsysFragment.G1()).j.b() && ((A0) mayaKycVerifyWithPhilsysFragment.G1()).h.b() && ((A0) mayaKycVerifyWithPhilsysFragment.G1()).m.d();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            zB = ((A0) ((MayaKycVerifyWithPhilsysFragment) ((K8.Q) this.c.get())).G1()).f3544l.b();
        }
        ((Button) ((A0) ((MayaKycVerifyWithPhilsysFragment) ((K8.Q) this.c.get())).G1()).c.f4087b).setEnabled(zB);
    }

    public final KycValidationResult l(KycFieldType fieldType, String value) {
        KycCmsContentData data;
        kotlin.jvm.internal.j.g(fieldType, "fieldType");
        kotlin.jvm.internal.j.g(value, "value");
        zj.o oVar = G8.d.f1924a;
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycVerifyWithPhilsysFragment) ((K8.Q) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
        List<KycValidationRule> validationRules = (kycCmsContent == null || (data = kycCmsContent.getData()) == null) ? null : data.getValidationRules();
        if (validationRules == null) {
            validationRules = C1112C.f9377a;
        }
        return G8.d.a(fieldType, value, validationRules, new Ag.f(1, this, W.class, "isFieldRequired", "isFieldRequired(Lcom/paymaya/domain/model/KycFieldType;)Z", 0, 5));
    }
}
