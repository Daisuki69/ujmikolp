package D8;

import K8.InterfaceC0294t;
import M8.InterfaceC0338b1;
import N5.C0438b;
import cj.C1110A;
import cj.C1132s;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.FatcaGuides;
import com.paymaya.domain.model.FatcaReason;
import com.paymaya.domain.model.FatcaSelection;
import com.paymaya.domain.model.KycRegulatoryProfileCMSResponse;
import com.paymaya.domain.model.KycRegulatoryProfileStatusResponse;
import com.paymaya.domain.model.RegulatoryCMSData;
import com.paymaya.mayaui.kyczoloz.utils.ComplianceRequest;
import com.paymaya.mayaui.kyczoloz.utils.FatcaDetails;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFatcaFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends C8.a {
    public final R4.i e;
    public final com.paymaya.data.preference.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public KycRegulatoryProfileCMSResponse f1005g;
    public KycRegulatoryProfileStatusResponse h;
    public String i;

    public B(R4.i iVar, com.paymaya.data.preference.a aVar) {
        super(aVar, 0);
        this.e = iVar;
        this.f = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        List<FatcaSelection> fatcaSelections;
        FatcaGuides fatcaGuides;
        super.j();
        if (this.f.v().length() == 0) {
            this.f.m0(UUID.randomUUID().toString());
        }
        InterfaceC0338b1 interfaceC0338b1 = ((MayaKycFatcaFragment) ((InterfaceC0294t) this.c.get())).f12541X;
        this.f1005g = interfaceC0338b1 != null ? ((MayaKycActivity) interfaceC0338b1).Z1().h : null;
        InterfaceC0338b1 interfaceC0338b12 = ((MayaKycFatcaFragment) ((InterfaceC0294t) this.c.get())).f12541X;
        this.h = interfaceC0338b12 != null ? ((MayaKycActivity) interfaceC0338b12).Z1().i : null;
        KycRegulatoryProfileCMSResponse kycRegulatoryProfileCMSResponse = this.f1005g;
        if (kycRegulatoryProfileCMSResponse != null) {
            InterfaceC0294t interfaceC0294t = (InterfaceC0294t) this.c.get();
            RegulatoryCMSData regulatoryCMSData = kycRegulatoryProfileCMSResponse.getRegulatoryCMSData();
            MayaKycFatcaFragment mayaKycFatcaFragment = (MayaKycFatcaFragment) interfaceC0294t;
            mayaKycFatcaFragment.getClass();
            if (regulatoryCMSData != null && (fatcaGuides = regulatoryCMSData.getFatcaGuides()) != null) {
                ((C0438b) mayaKycFatcaFragment.G1()).f.setText(fatcaGuides.getHeader());
                ((C0438b) mayaKycFatcaFragment.G1()).e.setTextHTML(fatcaGuides.getBody());
                mayaKycFatcaFragment.getContext();
                com.paymaya.common.utility.C.e0(fatcaGuides.getIconUrl(), ((C0438b) mayaKycFatcaFragment.G1()).c, 2131231240);
            }
            if (regulatoryCMSData == null || (fatcaSelections = regulatoryCMSData.getFatcaSelections()) == null) {
                return;
            }
            ((C0438b) mayaKycFatcaFragment.G1()).f4056b.setText(fatcaSelections.get(0).getDescription());
            ((C0438b) mayaKycFatcaFragment.G1()).f4057d.setText(fatcaSelections.get(1).getDescription());
        }
    }

    public final void o(FatcaSelection fatcaSelection) {
        String key;
        FatcaDetails fatcaDetails;
        if (fatcaSelection != null) {
            Boolean boolIsFatca = fatcaSelection.isFatca();
            FatcaReason fatcaReason = fatcaSelection.getFatcaReason();
            if (fatcaReason == null || (key = fatcaReason.getKey()) == null) {
                key = "";
            }
            com.paymaya.domain.model.FatcaDetails fatcaDetails2 = new com.paymaya.domain.model.FatcaDetails(boolIsFatca, C1132s.d(key), null, 4, null);
            Boolean fatca = fatcaDetails2.getFatca();
            if (fatca != null) {
                boolean zBooleanValue = fatca.booleanValue();
                ArrayList<String> fatcaReason2 = fatcaDetails2.getFatcaReason();
                fatcaDetails = new FatcaDetails(zBooleanValue, fatcaReason2 != null ? C1110A.W(fatcaReason2) : null, "mobile-app-kyc");
            } else {
                fatcaDetails = null;
            }
            if (fatcaDetails == null) {
                throw new IllegalArgumentException("At least one of DosriDetails or FatcaDetails must be provided.");
            }
            ComplianceRequest complianceRequest = new ComplianceRequest(null, fatcaDetails);
            ((MayaBaseFragment) ((InterfaceC0294t) this.c.get())).E1();
            new Hh.f(this.e.c(complianceRequest), zh.b.a(), 0).a(new A7.c(this, 12)).b(new J5.a(this, 15)).c();
        }
    }
}
