package E8;

import L9.I;
import N5.R0;
import android.text.Editable;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import cj.C1110A;
import cj.C1132s;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.KycFieldType;
import com.paymaya.domain.model.UIComponent;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.kyczoloz.view.widget.KycMayaDropDown;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1296b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1297d;
    public final /* synthetic */ Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p(J8.c cVar, J8.b bVar, KycDocument kycDocument, Function0 function0) {
        this.f1295a = 2;
        this.f1296b = cVar;
        this.c = bVar;
        this.f1297d = kycDocument;
        this.e = (kotlin.jvm.internal.i) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f1295a) {
            case 0:
                ((Function0) this.f1296b).invoke();
                Button button = (Button) this.c;
                this.f1297d.invoke(button instanceof AppCompatButton ? ((AppCompatButton) button).getText().toString() : "", (String) this.e);
                break;
            case 1:
                G8.a aVar = (G8.a) ((G8.b) this.f1296b);
                aVar.getClass();
                KycFieldType fieldType = (KycFieldType) this.c;
                kotlin.jvm.internal.j.g(fieldType, "fieldType");
                aVar.c.invoke(fieldType);
                Function1 function1 = (Function1) this.f1297d;
                KycMayaDropDown kycMayaDropDown = (KycMayaDropDown) this.e;
                function1.invoke(kycMayaDropDown.getSelectedData());
                kycMayaDropDown.requestFocus();
                break;
            case 2:
                J8.c cVar = (J8.c) this.f1296b;
                boolean z4 = cVar.f2459g;
                J8.b bVar = (J8.b) this.c;
                if (z4) {
                    bVar.getClass();
                    if (C1110A.v(C1132s.g("PH_NATIONAL_ID", "PHILSYS_DIGITAL", "EPHIL_ID"), ((KycDocument) this.f1297d).getKey())) {
                    }
                }
                if (cVar.c != bVar.getBindingAdapterPosition()) {
                    cVar.notifyItemChanged(cVar.c);
                    int bindingAdapterPosition = bVar.getBindingAdapterPosition();
                    cVar.c = bindingAdapterPosition;
                    cVar.notifyItemChanged(bindingAdapterPosition);
                }
                ((kotlin.jvm.internal.i) this.e).invoke();
                cVar.e.invoke(cVar.f2458d);
                break;
            case 3:
                LauncherActivity launcherActivity = (LauncherActivity) this.f1296b;
                String strD = (String) this.e;
                String str = (String) this.c;
                String str2 = (String) this.f1297d;
                I i4 = launcherActivity.f14621k;
                i4.j();
                if ((strD == null || str2 == null) ? false : zj.z.w(strD, 2, "paymaya://inbox", false)) {
                    C1220i c1220i = ((LauncherActivity) ((Md.b) i4.c.get())).c;
                    C1219h c1219hE = C1219h.e("PUSH_NOTIFICATION_SENDBIRD_TAPPED");
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hE.g("notification_id", str2);
                    c1220i.b(c1219hE);
                }
                if (str2 != null && str2.length() != 0) {
                    strD = com.paymaya.common.utility.C.d(strD, "notificationId", str2);
                }
                Ld.b bVar2 = new Ld.b(i, i4, strD, str);
                ((A5.m) i4.h).getClass();
                A5.m.c(bVar2);
                I i6 = launcherActivity.f14621k;
                i6.getClass();
                Ag.k kVar = new Ag.k(i6, 29);
                ((A5.m) i6.h).getClass();
                A5.m.c(kVar);
                launcherActivity.f14623n = false;
                break;
            case 4:
                break;
            case 5:
                ha.m mVar = ((MayaPayBillsBIRFragment) this.f1296b).f13391L0;
                if (mVar != null) {
                    String str3 = (String) this.e;
                    ((MayaPayBillsActivity) mVar).a2(str3 != null ? str3 : "", (String) this.f1297d, (List) this.c);
                }
                break;
            case 6:
                ha.m mVar2 = ((MayaPayBillsBIRFragment) this.f1296b).f13391L0;
                if (mVar2 != null) {
                    String str4 = (String) this.e;
                    ((MayaPayBillsActivity) mVar2).a2(str4 != null ? str4 : "", (String) this.c, this.f1297d);
                }
                break;
            case 7:
                ha.m mVar3 = ((MayaPayBillsBIRFragment) this.f1296b).f13391L0;
                if (mVar3 != null) {
                    String strPlaceholder = ((UIComponent) this.c).placeholder();
                    kotlin.jvm.internal.j.f(strPlaceholder, "placeholder(...)");
                    ((MayaPayBillsActivity) mVar3).a2(strPlaceholder, (String) this.e, this.f1297d);
                }
                break;
            case 8:
                ha.w wVar = ((MayaPayBillsFormFragment) this.f1296b).f13419C0;
                if (wVar != null) {
                    String strPlaceholder2 = ((UIComponent) this.c).placeholder();
                    kotlin.jvm.internal.j.f(strPlaceholder2, "placeholder(...)");
                    ((MayaPayBillsActivity) wVar).a2(strPlaceholder2, (String) this.e, this.f1297d);
                }
                break;
            case 9:
                List list = MayaUnderWritingRequirementsFragment.f14251d0;
                MayaProfileInputLayout mayaProfileInputLayout = (MayaProfileInputLayout) this.c;
                TextView textView = (TextView) this.f1297d;
                MayaUnderWritingRequirementsFragment mayaUnderWritingRequirementsFragment = (MayaUnderWritingRequirementsFragment) this.f1296b;
                mayaUnderWritingRequirementsFragment.getClass();
                textView.setVisibility(8);
                mayaProfileInputLayout.setVisibility(0);
                mayaUnderWritingRequirementsFragment.f2(true);
                ((R0) mayaUnderWritingRequirementsFragment.G1()).f3886p.setText((String) this.e);
                mayaProfileInputLayout.requestFocus();
                com.paymaya.common.utility.C.u0(mayaUnderWritingRequirementsFragment.getActivity(), mayaProfileInputLayout.getInputEditText());
                String string = textView.getText().toString();
                C1220i c1220iO1 = mayaUnderWritingRequirementsFragment.o1();
                C1219h c1219hE2 = C1219h.e("CREDIT_CARD_UNDERWRITING_TAPPED");
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                HashMap map = c1219hE2.j;
                map.put("button", string);
                map.put("page_name", "Minimum Underwriting Requirements");
                c1219hE2.i();
                c1220iO1.b(c1219hE2);
                break;
            default:
                List list2 = MayaUserProfileUpdateFragment.f14261f0;
                TextView textView2 = (TextView) this.f1297d;
                MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = (MayaUserProfileUpdateFragment) this.f1296b;
                mayaUserProfileUpdateFragment.getClass();
                textView2.setVisibility(0);
                ((MayaProfileInputLayout) this.c).setVisibility(8);
                mayaUserProfileUpdateFragment.u2(false);
                MayaProfileInputLayout mayaProfileInputLayout2 = (MayaProfileInputLayout) this.e;
                Editable text = mayaProfileInputLayout2.getInputEditText().getText();
                if (text != null) {
                    text.clear();
                }
                com.paymaya.common.utility.C.Q(mayaUserProfileUpdateFragment.getActivity(), mayaProfileInputLayout2.getInputEditText());
                break;
        }
        return Unit.f18162a;
    }

    public /* synthetic */ p(MayaPayBillsBIRFragment mayaPayBillsBIRFragment, String str, List list, String str2) {
        this.f1295a = 6;
        this.f1296b = mayaPayBillsBIRFragment;
        this.e = str;
        this.f1297d = list;
        this.c = str2;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1295a = i;
        this.f1296b = obj;
        this.c = obj2;
        this.f1297d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ p(Object obj, String str, Object obj2, String str2, int i) {
        this.f1295a = i;
        this.f1296b = obj;
        this.e = str;
        this.c = obj2;
        this.f1297d = str2;
    }
}
