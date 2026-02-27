package S9;

import G6.k;
import L9.C0327e;
import N5.D0;
import N9.e;
import P9.n;
import Q9.L;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaAgreementSettingsBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.ViewHolder implements R9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5691d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NewMayaCreditSummaryFragment f5692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f5693b;
    public final C0327e c;

    public c(D0 d02, NewMayaCreditSummaryFragment newMayaCreditSummaryFragment) {
        super(d02.f3580b);
        this.f5692a = newMayaCreditSummaryFragment;
        this.f5693b = d02.c;
        C0327e c0327e = new C0327e(2);
        this.c = c0327e;
        c0327e.h(this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void D(c cVar, int i, CreditAgreement creditAgreement) {
        C0327e c0327e = cVar.c;
        c0327e.getClass();
        c cVar2 = (c) ((R9.a) c0327e.c.get());
        cVar2.getClass();
        NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = cVar2.f5692a;
        if (newMayaCreditSummaryFragment == null || creditAgreement.getHeading().length() <= 0) {
            return;
        }
        L l6 = newMayaCreditSummaryFragment.f13311x0;
        if (l6 != null) {
            NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) l6;
            LinkedHashSet linkedHashSet = E.f10412a;
            E.a("NewMayaCreditActivity", "showAgreementSettings: " + i);
            String strD = AbstractC1236z.d(newMayaCreditActivity, NewMayaAgreementSettingsBottomSheetFragment.class);
            NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment = new NewMayaAgreementSettingsBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("position_id", i);
            bundle.putParcelable("agreement_item", creditAgreement);
            bundle.putBoolean("agreement_acceptance", false);
            newMayaAgreementSettingsBottomSheetFragment.setArguments(bundle);
            newMayaAgreementSettingsBottomSheetFragment.f13141Y = new e(newMayaCreditActivity, 1);
            newMayaAgreementSettingsBottomSheetFragment.show(newMayaCreditActivity.getSupportFragmentManager(), strD);
        }
        k kVarQ1 = newMayaCreditSummaryFragment.Q1();
        String key = creditAgreement.getKey();
        int iHashCode = key.hashCode();
        EnumC1216e enumC1216e = EnumC1216e.ACCOUNT_SUMMARY;
        switch (iHashCode) {
            case -1730299390:
                if (key.equals("disclosureStatement")) {
                    NewMayaCreditSummaryFragment newMayaCreditSummaryFragment2 = (NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get());
                    newMayaCreditSummaryFragment2.getClass();
                    C1219h c1219h = new C1219h();
                    c1219h.r(enumC1216e);
                    c1219h.n(17);
                    c1219h.t(EnumC1217f.DISCLOSURE);
                    c1219h.i();
                    newMayaCreditSummaryFragment2.z1(c1219h);
                    break;
                }
                break;
            case -531499779:
                if (key.equals("automatedPayments")) {
                    NewMayaCreditSummaryFragment newMayaCreditSummaryFragment3 = (NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get());
                    newMayaCreditSummaryFragment3.getClass();
                    C1219h c1219h2 = new C1219h();
                    c1219h2.r(enumC1216e);
                    c1219h2.n(17);
                    c1219h2.t(EnumC1217f.AUTOMATED_PAYMENTS);
                    c1219h2.i();
                    newMayaCreditSummaryFragment3.z1(c1219h2);
                    break;
                }
                break;
            case 797410532:
                if (key.equals("truthAndTransparency")) {
                    NewMayaCreditSummaryFragment newMayaCreditSummaryFragment4 = (NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get());
                    newMayaCreditSummaryFragment4.getClass();
                    C1219h c1219h3 = new C1219h();
                    c1219h3.r(enumC1216e);
                    c1219h3.n(17);
                    c1219h3.t(EnumC1217f.TRUTH);
                    c1219h3.i();
                    newMayaCreditSummaryFragment4.z1(c1219h3);
                    break;
                }
                break;
            case 1466385832:
                if (key.equals("termsAndConditions")) {
                    NewMayaCreditSummaryFragment newMayaCreditSummaryFragment5 = (NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get());
                    newMayaCreditSummaryFragment5.getClass();
                    C1219h c1219h4 = new C1219h();
                    c1219h4.r(enumC1216e);
                    c1219h4.n(17);
                    c1219h4.t(EnumC1217f.TERMS);
                    c1219h4.i();
                    newMayaCreditSummaryFragment5.z1(c1219h4);
                    break;
                }
                break;
            case 1539108570:
                if (key.equals("privacyPolicy")) {
                    NewMayaCreditSummaryFragment newMayaCreditSummaryFragment6 = (NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get());
                    newMayaCreditSummaryFragment6.getClass();
                    C1219h c1219h5 = new C1219h();
                    c1219h5.r(enumC1216e);
                    c1219h5.n(17);
                    c1219h5.t(EnumC1217f.DISCLOSURE);
                    c1219h5.i();
                    newMayaCreditSummaryFragment6.z1(c1219h5);
                    break;
                }
                break;
        }
    }
}
