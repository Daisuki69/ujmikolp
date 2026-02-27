package D8;

import K8.InterfaceC0290o;
import M8.J0;
import N5.C0442c0;
import N5.C0453g;
import N5.C0466m;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.widget.MayaRadioGroupView;
import com.paymaya.common.widget.MayaRadioOptionView;
import com.paymaya.data.api.ComplianceApi;
import com.paymaya.domain.model.DosriGuides;
import com.paymaya.domain.model.DosriType;
import com.paymaya.domain.model.KycRegulatoryProfileCMSResponse;
import com.paymaya.domain.model.RegulatoryCMSData;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.kyczoloz.utils.ComplianceRequest;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDosriFragment;
import java.util.List;
import java.util.UUID;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import w.C2360b;
import w.C2361c;
import zj.C2576A;

/* JADX INFO: renamed from: D8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0217z extends C8.a implements B8.d {
    public final com.paymaya.data.preference.a e;
    public final com.paymaya.domain.store.L f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z0 f1109g;
    public KycRegulatoryProfileCMSResponse h;

    public C0217z(com.paymaya.data.preference.a aVar, com.paymaya.domain.store.L l6, Z0 z02) {
        super(aVar, 0);
        this.e = aVar;
        this.f = l6;
        this.f1109g = z02;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        DosriGuides dosriGuides;
        DosriGuides dosriGuides2;
        super.j();
        if (this.e.v().length() == 0) {
            this.e.m0(UUID.randomUUID().toString());
        }
        J0 j02 = ((MayaKycDosriFragment) ((InterfaceC0290o) this.c.get())).f12525c0;
        KycRegulatoryProfileCMSResponse kycRegulatoryProfileCMSResponse = j02 != null ? ((MayaKycActivity) j02).Z1().h : null;
        this.h = kycRegulatoryProfileCMSResponse;
        if (kycRegulatoryProfileCMSResponse != null) {
            InterfaceC0290o interfaceC0290o = (InterfaceC0290o) this.c.get();
            RegulatoryCMSData regulatoryCMSData = kycRegulatoryProfileCMSResponse.getRegulatoryCMSData();
            final MayaKycDosriFragment mayaKycDosriFragment = (MayaKycDosriFragment) interfaceC0290o;
            C0466m c0466m = ((C0442c0) mayaKycDosriFragment.G1()).f4068b;
            ((TextView) c0466m.h).setText((regulatoryCMSData == null || (dosriGuides2 = regulatoryCMSData.getDosriGuides()) == null) ? null : dosriGuides2.getHeader());
            ((TextView) c0466m.i).setText((regulatoryCMSData == null || (dosriGuides = regulatoryCMSData.getDosriGuides()) == null) ? null : dosriGuides.getBody());
            List<DosriType> dosriTypes = regulatoryCMSData != null ? regulatoryCMSData.getDosriTypes() : null;
            ((MayaRadioGroupView) ((C0442c0) mayaKycDosriFragment.G1()).f4068b.f).removeAllViews();
            if (dosriTypes != null) {
                for (DosriType dosriType : dosriTypes) {
                    String strValueOf = String.valueOf(dosriType.getDescription());
                    String additionalDescription = dosriType.getAdditionalDescription();
                    if (additionalDescription == null) {
                        additionalDescription = "";
                    }
                    MayaRadioGroupView mayaRadioGroupView = (MayaRadioGroupView) ((C0442c0) mayaKycDosriFragment.G1()).f4068b.f;
                    Context context = mayaRadioGroupView.getContext();
                    kotlin.jvm.internal.j.f(context, "getContext(...)");
                    MayaRadioOptionView mayaRadioOptionView = new MayaRadioOptionView(context, null, 6, 0);
                    C0453g c0453g = mayaRadioOptionView.f11284d;
                    ((TextView) c0453g.e).setText(strValueOf);
                    boolean zH = C2576A.H(additionalDescription);
                    TextView textView = (TextView) c0453g.f4095d;
                    if (zH) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(additionalDescription);
                        textView.setVisibility(0);
                    }
                    mayaRadioOptionView.getRadioButton().setTag(dosriType);
                    mayaRadioGroupView.addView(mayaRadioOptionView);
                }
            }
            ((MayaRadioGroupView) ((C0442c0) mayaKycDosriFragment.G1()).f4068b.f).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: M8.G0
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    Object tag = ((MayaRadioOptionView) radioGroup.findViewById(i)).getRadioButton().getTag();
                    DosriType dosriType2 = tag instanceof DosriType ? (DosriType) tag : null;
                    MayaKycDosriFragment mayaKycDosriFragment2 = mayaKycDosriFragment;
                    mayaKycDosriFragment2.f12521Y = dosriType2;
                    String description = dosriType2 != null ? dosriType2.getDescription() : null;
                    if (description == null) {
                        description = "";
                    }
                    mayaKycDosriFragment2.Q1(description, "");
                    DosriType dosriType3 = mayaKycDosriFragment2.f12521Y;
                    if (!kotlin.jvm.internal.j.b(dosriType3 != null ? dosriType3.getKey() : null, "RELATED_INTEREST")) {
                        if (mayaKycDosriFragment2.L1().getChildCount() > 0) {
                            mayaKycDosriFragment2.L1().removeAllViews();
                        }
                        mayaKycDosriFragment2.S1();
                        mayaKycDosriFragment2.R1(true);
                        return;
                    }
                    C0466m c0466m2 = ((C0442c0) mayaKycDosriFragment2.G1()).f4068b;
                    c0466m2.f4151d.setVisibility(0);
                    ((LinearLayout) c0466m2.e).setVisibility(0);
                    ((TextView) c0466m2.f4152g).setVisibility(0);
                    mayaKycDosriFragment2.R1(false);
                }
            });
            mayaKycDosriFragment.f12522Z = regulatoryCMSData != null ? regulatoryCMSData.getDosriRelationships() : null;
        }
    }

    public final void o(ComplianceRequest complianceRequest) {
        ((MayaBaseFragment) ((InterfaceC0290o) this.c.get())).E1();
        com.paymaya.domain.store.L l6 = this.f;
        l6.getClass();
        String strK = new com.google.gson.j().k(complianceRequest);
        kotlin.jvm.internal.j.d(strK);
        MediaType mediaType = Je.d.f2515a;
        e(new Lh.d(new Lh.d(new Lh.h(((ComplianceApi) l6.f11367b).saveDosriProfile(RequestBody.Companion.create(Je.d.f2515a, strK)).h(Th.e.c), zh.b.a(), 0), new C2360b(this, 13), 2), new C2361c(this, 13), 0).e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        r0 = new com.paymaya.domain.model.DosriValidationResult.RequiredFieldError(com.paymaya.domain.model.KycFieldType.MIDDLE_NAME);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r0 = new com.paymaya.domain.model.DosriValidationResult.RequiredFieldError(com.paymaya.domain.model.KycFieldType.LAST_NAME);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        r0 = new com.paymaya.domain.model.DosriValidationResult.RequiredFieldError(com.paymaya.domain.model.KycFieldType.FIRST_NAME);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0217z.p():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.paymaya.domain.model.DosriValidationResult q(com.paymaya.domain.model.KycFieldType r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D8.C0217z.q(com.paymaya.domain.model.KycFieldType, java.lang.String, boolean):com.paymaya.domain.model.DosriValidationResult");
    }
}
