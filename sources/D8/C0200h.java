package D8;

import K8.InterfaceC0279d;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.ViewKt;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.KycSelectionItem;
import com.paymaya.domain.model.KycSelectionModel;
import com.paymaya.domain.model.KycValidationResult;
import com.paymaya.domain.model.KycValidationRule;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: D8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0200h extends C8.a implements B8.b {
    public final Y.e e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public KycSelectionItem f1048g;

    public C0200h(Y.e eVar, com.paymaya.data.preference.a aVar) {
        super(aVar, 0);
        this.e = eVar;
        ArrayList arrayListD = C1132s.d(new KycSelectionItem(0, "Certificate of Registration", "AMLC_COR", null, false, 24, null), new KycSelectionItem(1, "Provisional Certificate of Registration", "AMLC_PCOR", null, false, 24, null));
        this.f = arrayListD;
        this.f1048g = (KycSelectionItem) C1110A.A(arrayListD);
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        ((N5.U) ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) this.c.get())).G1()).c.setEnabled(false);
    }

    public final void o() {
        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) this.c.get());
        ((N5.U) ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) this.c.get())).G1()).c.setEnabled(((N5.U) mayaKycAmlcCertificateFragment.G1()).f3941g.d() && ((N5.U) mayaKycAmlcCertificateFragment.G1()).h.b() && mayaKycAmlcCertificateFragment.f12476b0 != null);
    }

    public final void p() {
        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = (MayaKycAmlcCertificateFragment) ((InterfaceC0279d) this.c.get());
        mayaKycAmlcCertificateFragment.getClass();
        C1220i c1220iO1 = mayaKycAmlcCertificateFragment.o1();
        FragmentActivity activity = mayaKycAmlcCertificateFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaKycAmlcCertificateFragment.u1());
        c1219hD.s("AMLC_ADD_DOCUMENT");
        c1219hD.n(3);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = mayaKycAmlcCertificateFragment.getString(R.string.maya_kyc_amlc_certificate_screen_label);
        HashMap map = c1219hD.j;
        map.put("page_name", string);
        map.put("path", "TOFU 1.0");
        map.put("kyc_status", mayaKycAmlcCertificateFragment.t1().l());
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
        InterfaceC0279d interfaceC0279d = (InterfaceC0279d) this.c.get();
        int id = this.f1048g.getId();
        ArrayList certTypeOptions = this.f;
        MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment2 = (MayaKycAmlcCertificateFragment) interfaceC0279d;
        mayaKycAmlcCertificateFragment2.getClass();
        kotlin.jvm.internal.j.g(certTypeOptions, "certTypeOptions");
        KycSelectionModel kycSelectionModel = new KycSelectionModel(R.string.maya_kyc_amlc_checkpoint_certificate_type_hint, id, certTypeOptions, KycFieldType.AMLC_CERT_TYPE, false, 16, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("uiModel", kycSelectionModel);
        ConstraintLayout constraintLayout = ((N5.U) mayaKycAmlcCertificateFragment2.G1()).f3938a;
        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
        E1.c.l(ViewKt.findNavController(constraintLayout), R.id.maya_kyc_amlc_certificate_fragment, R.id.action_maya_kyc_amlc_certificate_fragment_to_maya_kyc_single_selection_bottom_sheet_dialog_fragment, bundle);
    }

    public final KycValidationResult q(KycFieldType fieldType, String value) {
        KycCmsContentData data;
        kotlin.jvm.internal.j.g(fieldType, "fieldType");
        kotlin.jvm.internal.j.g(value, "value");
        zj.o oVar = G8.d.f1924a;
        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) this.c.get())).requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
        List<KycValidationRule> validationRules = (kycCmsContent == null || (data = kycCmsContent.getData()) == null) ? null : data.getValidationRules();
        if (validationRules == null) {
            validationRules = C1112C.f9377a;
        }
        return G8.d.a(fieldType, value, validationRules, new Ag.f(1, this, C0200h.class, "isFieldRequired", "isFieldRequired(Lcom/paymaya/domain/model/KycFieldType;)Z", 0, 2));
    }
}
