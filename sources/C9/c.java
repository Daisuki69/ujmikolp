package c9;

import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.AccountUsage;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDAccountUsageFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDFinancialDocumentsFragment;
import com.paymaya.ui.ekyc.view.widget.EDDInputFinancialDocument;
import kotlin.jvm.internal.j;
import sd.C2253b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9313b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f9312a = i;
        this.f9313b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.c;
        Object obj2 = this.f9313b;
        switch (this.f9312a) {
            case 0:
                int i4 = MayaRegistrationActivity.f12730r;
                MayaRegistrationActivity mayaRegistrationActivity = (MayaRegistrationActivity) obj2;
                mayaRegistrationActivity.a2((String) obj, "Start an account");
                AbstractC1236z.c(mayaRegistrationActivity);
                com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) mayaRegistrationActivity.Y1().e;
                j.g(preference, "preference");
                preference.M();
                preference.N();
                return;
            case 1:
                EDDAccountUsageFragment eDDAccountUsageFragment = (EDDAccountUsageFragment) obj2;
                C2253b c2253bR1 = eDDAccountUsageFragment.r1();
                Object obj3 = ((com.paymaya.common.adapter.a) obj).f10231a.get(i);
                j.f(obj3, "getItem(...)");
                c2253bR1.m((AccountUsage) obj3);
                FragmentActivity fragmentActivityRequireActivity = eDDAccountUsageFragment.requireActivity();
                TextInputEditText textInputEditText = eDDAccountUsageFragment.mPrimaryUseOtherEditText;
                if (textInputEditText == null) {
                    j.n("mPrimaryUseOtherEditText");
                    throw null;
                }
                TextInputEditText textInputEditText2 = eDDAccountUsageFragment.mRemittanceEditText;
                if (textInputEditText2 == null) {
                    j.n("mRemittanceEditText");
                    throw null;
                }
                TextInputEditText textInputEditText3 = eDDAccountUsageFragment.mPurposeEditText;
                if (textInputEditText3 == null) {
                    j.n("mPurposeEditText");
                    throw null;
                }
                View[] viewArr = {textInputEditText, textInputEditText2, textInputEditText3};
                for (int i6 = 0; i6 < 3; i6++) {
                    C.Q(fragmentActivityRequireActivity, viewArr[i6]);
                }
                dialogInterface.dismiss();
                return;
            default:
                ((EDDFinancialDocumentsFragment) obj2).A1((EDDInputFinancialDocument) obj);
                return;
        }
    }
}
