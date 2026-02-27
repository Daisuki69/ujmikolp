package rc;

import N5.R0;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.domain.model.FieldType;
import com.paymaya.domain.model.MayaUpdateProfileData;
import com.paymaya.domain.model.ProfileTin;
import com.paymaya.domain.model.UpdateProfileWorkNature;
import com.paymaya.domain.model.ValidationResult;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.List;
import oc.InterfaceC1975b;
import sc.C2251b;
import wc.InterfaceC2392c;

/* JADX INFO: renamed from: rc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2196c extends qc.d implements InterfaceC1975b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Y.e f19886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19887l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public UpdateProfileWorkNature f19889o;

    public C2196c(Y.e eVar, com.paymaya.data.preference.a aVar) {
        super(eVar, aVar);
        this.f19886k = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean p(rc.C2196c r5, com.paymaya.domain.model.FieldType r6, java.lang.Object r7) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.paymaya.domain.model.FieldType.SourceOfIncome
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L14
            r0 = r6
            com.paymaya.domain.model.FieldType$SourceOfIncome r0 = (com.paymaya.domain.model.FieldType.SourceOfIncome) r0
            boolean r5 = r5.m
            boolean r5 = r0.isFieldRequired(r5)
            goto L34
        L14:
            boolean r0 = r6 instanceof com.paymaya.domain.model.FieldType.JobTitle
            if (r0 == 0) goto L22
            r0 = r6
            com.paymaya.domain.model.FieldType$JobTitle r0 = (com.paymaya.domain.model.FieldType.JobTitle) r0
            boolean r5 = r5.f19888n
            boolean r5 = r0.isFieldRequired(r5)
            goto L34
        L22:
            boolean r0 = r6 instanceof com.paymaya.domain.model.FieldType.CompanyName
            if (r0 == 0) goto L30
            r0 = r6
            com.paymaya.domain.model.FieldType$CompanyName r0 = (com.paymaya.domain.model.FieldType.CompanyName) r0
            boolean r5 = r5.f19887l
            boolean r5 = r0.isFieldRequired(r5)
            goto L34
        L30:
            boolean r5 = com.paymaya.domain.model.FieldType.isFieldRequired$default(r6, r1, r2, r3)
        L34:
            boolean r6 = r6 instanceof com.paymaya.domain.model.FieldType.MonthlyTakeHomePay
            if (r6 == 0) goto L6b
            boolean r6 = r7 instanceof java.lang.String
            if (r6 == 0) goto L3f
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3
        L3f:
            if (r3 != 0) goto L47
            java.lang.String r3 = "bFoV"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
        L47:
            java.lang.CharSequence r6 = zj.C2576A.b0(r3)
            java.lang.String r6 = r6.toString()
            int r7 = r6.length()
            if (r7 != 0) goto L56
            goto L69
        L56:
            java.lang.Double r6 = zj.x.e(r6)
            if (r6 == 0) goto L69
            double r6 = r6.doubleValue()
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 > 0) goto L67
            goto L69
        L67:
            r6 = r1
            goto L7d
        L69:
            r6 = r2
            goto L7d
        L6b:
            sc.b r6 = sc.C2251b.f20034a
            boolean r6 = r7 instanceof java.lang.String
            if (r6 == 0) goto L7a
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r6 = r7.length()
            if (r6 != 0) goto L67
            goto L7c
        L7a:
            if (r7 != 0) goto L67
        L7c:
            goto L69
        L7d:
            if (r5 == 0) goto L82
            if (r6 == 0) goto L82
            return r2
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.C2196c.p(rc.c, com.paymaya.domain.model.FieldType, java.lang.Object):boolean");
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        super.j();
        FragmentActivity activity = ((MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) this.c.get())).getActivity();
        m((activity == null || (intent = activity.getIntent()) == null) ? null : intent.getDataString());
        k(new Ag.j(this, 22));
    }

    public final void q(MayaUpdateProfileData mayaUpdateProfileData) {
        kotlin.jvm.internal.j.g(mayaUpdateProfileData, numX49.tnTj78("bFoS"));
        ProfileTin tin = mayaUpdateProfileData.getTin();
        String number = tin != null ? tin.getNumber() : null;
        C2251b c2251b = C2251b.f20034a;
        List listL = l();
        FieldType.TIN tin2 = FieldType.TIN.INSTANCE;
        String strTnTj78 = numX49.tnTj78("bFoj");
        boolean z4 = C2251b.a(c2251b, listL, tin2, number == null ? strTnTj78 : number) == null;
        if (number != null && number.length() != 0 && z4) {
            MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) this.c.get());
            ((R0) mayaUnderWritingRequirementsFragment.G1()).m.setVisibility(8);
            ((R0) mayaUnderWritingRequirementsFragment.G1()).i.setVisibility(0);
            MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment2 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) this.c.get());
            mayaUnderWritingRequirementsFragment2.getClass();
            ((R0) mayaUnderWritingRequirementsFragment2.G1()).i.getInputEditText().setText(number);
        }
        ProfileTin sss = mayaUpdateProfileData.getSss();
        String number2 = sss != null ? sss.getNumber() : null;
        List listL2 = l();
        FieldType.SSS sss2 = FieldType.SSS.INSTANCE;
        if (number2 != null) {
            strTnTj78 = number2;
        }
        boolean z5 = C2251b.a(c2251b, listL2, sss2, strTnTj78) == null;
        if (number2 == null || number2.length() == 0 || !z5) {
            return;
        }
        MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment3 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) this.c.get());
        ((R0) mayaUnderWritingRequirementsFragment3.G1()).f3883l.setVisibility(8);
        ((R0) mayaUnderWritingRequirementsFragment3.G1()).h.setVisibility(0);
        MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment4 = (MayaUnderWritingRequirementsFragment) ((InterfaceC2392c) this.c.get());
        mayaUnderWritingRequirementsFragment4.getClass();
        ((R0) mayaUnderWritingRequirementsFragment4.G1()).h.getInputEditText().setText(number2);
    }

    public final ValidationResult r(FieldType fieldType, Object obj) {
        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bFod"));
        C2251b c2251b = C2251b.f20034a;
        ValidationResult.RequiredFieldError requiredFieldErrorD = C2251b.d(fieldType, obj, new eb.f(2, this, C2196c.class, numX49.tnTj78("bFoi"), numX49.tnTj78("bFoE"), 0, 5));
        return requiredFieldErrorD == null ? ValidationResult.Success.INSTANCE : requiredFieldErrorD;
    }

    public final ValidationResult s(FieldType fieldType, String str) {
        kotlin.jvm.internal.j.g(fieldType, numX49.tnTj78("bFoF"));
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bFoH"));
        C2251b c2251b = C2251b.f20034a;
        ValidationResult.RequiredFieldError requiredFieldErrorD = C2251b.d(fieldType, str, new eb.f(2, this, C2196c.class, numX49.tnTj78("bFoO"), numX49.tnTj78("bFoQ"), 0, 6));
        if (requiredFieldErrorD != null) {
            return requiredFieldErrorD;
        }
        ValidationResult.RegExError regExErrorC = c2251b.c(l(), fieldType, str);
        return regExErrorC == null ? ValidationResult.Success.INSTANCE : regExErrorC;
    }
}
