package Q9;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditInterstitialActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import defpackage.AbstractC1414e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewMayaCreditFragment f5301b;

    public /* synthetic */ D(NewMayaCreditFragment newMayaCreditFragment, int i) {
        this.f5300a = i;
        this.f5301b = newMayaCreditFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BackUpIdentity backUpIdentityA;
        final int i = 1;
        switch (this.f5300a) {
            case 0:
                final NewMayaCreditFragment newMayaCreditFragment = this.f5301b;
                return new Pair(newMayaCreditFragment.getString(R.string.maya_label_data_privacy_dialog_agree), new Function1() { // from class: Q9.F
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i) {
                            case 0:
                                kotlin.jvm.internal.j.g(it, "it");
                                NewMayaCreditFragment newMayaCreditFragment2 = newMayaCreditFragment;
                                C1220i c1220iO1 = newMayaCreditFragment2.o1();
                                FragmentActivity activity = newMayaCreditFragment2.getActivity();
                                C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
                                c1219hD.r(EnumC1216e.SUMMARY);
                                c1219hD.n(17);
                                AbstractC1414e.n(c1219hD, EnumC1217f.BILL_TOOLTIP_VIEW, c1220iO1, activity, c1219hD);
                                break;
                            default:
                                kotlin.jvm.internal.j.g(it, "it");
                                NewMayaCreditFragment newMayaCreditFragment3 = newMayaCreditFragment;
                                C1220i c1220iO12 = newMayaCreditFragment3.o1();
                                FragmentActivity activity2 = newMayaCreditFragment3.getActivity();
                                C1219h c1219hD2 = C1219h.d(EnumC1215d.CREDIT);
                                c1219hD2.r(EnumC1216e.OPT_IN_DATA_PRIVACY);
                                c1219hD2.n(17);
                                AbstractC1414e.n(c1219hD2, EnumC1217f.AGREE, c1220iO12, activity2, c1219hD2);
                                break;
                        }
                        return Unit.f18162a;
                    }
                });
            case 1:
                final NewMayaCreditFragment newMayaCreditFragment2 = this.f5301b;
                final int i4 = 0;
                return new Pair(newMayaCreditFragment2.getString(R.string.maya_label_got_it), new Function1() { // from class: Q9.F
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        View it = (View) obj;
                        switch (i4) {
                            case 0:
                                kotlin.jvm.internal.j.g(it, "it");
                                NewMayaCreditFragment newMayaCreditFragment22 = newMayaCreditFragment2;
                                C1220i c1220iO1 = newMayaCreditFragment22.o1();
                                FragmentActivity activity = newMayaCreditFragment22.getActivity();
                                C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
                                c1219hD.r(EnumC1216e.SUMMARY);
                                c1219hD.n(17);
                                AbstractC1414e.n(c1219hD, EnumC1217f.BILL_TOOLTIP_VIEW, c1220iO1, activity, c1219hD);
                                break;
                            default:
                                kotlin.jvm.internal.j.g(it, "it");
                                NewMayaCreditFragment newMayaCreditFragment3 = newMayaCreditFragment2;
                                C1220i c1220iO12 = newMayaCreditFragment3.o1();
                                FragmentActivity activity2 = newMayaCreditFragment3.getActivity();
                                C1219h c1219hD2 = C1219h.d(EnumC1215d.CREDIT);
                                c1219hD2.r(EnumC1216e.OPT_IN_DATA_PRIVACY);
                                c1219hD2.n(17);
                                AbstractC1414e.n(c1219hD2, EnumC1217f.AGREE, c1220iO12, activity2, c1219hD2);
                                break;
                        }
                        return Unit.f18162a;
                    }
                });
            default:
                NewMayaCreditFragment newMayaCreditFragment3 = this.f5301b;
                C1220i c1220iO1 = newMayaCreditFragment3.o1();
                FragmentActivity activity = newMayaCreditFragment3.getActivity();
                EnumC1215d enumC1215d = EnumC1215d.CREDIT;
                C1219h c1219hD = C1219h.d(enumC1215d);
                AbstractC1414e.m(c1219hD, EnumC1216e.DASHBOARD, 32);
                c1220iO1.c(activity, c1219hD);
                L9.B bP1 = newMayaCreditFragment3.P1();
                if (!S5.c.b(bP1.e, A5.b.f88Y) || ((backUpIdentityA = bP1.h.a()) != null && backUpIdentityA.isVerifiedEmail())) {
                    G g8 = ((NewMayaCreditFragment) ((P9.k) bP1.c.get())).D1;
                    if (g8 != null) {
                        MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g8;
                        mayaDashboardActivity.n1();
                        mayaDashboardActivity.startActivity(new Intent(mayaDashboardActivity, (Class<?>) MayaCreditInterstitialActivity.class));
                    }
                } else {
                    G g10 = ((NewMayaCreditFragment) ((P9.k) bP1.c.get())).D1;
                    if (g10 != null) {
                        MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) g10;
                        String string = mayaDashboardActivity2.getString(R.string.maya_label_verify_email_title);
                        kotlin.jvm.internal.j.f(string, "getString(...)");
                        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231346, string, mayaDashboardActivity2.getString(R.string.maya_label_verify_email_description), new Pair(mayaDashboardActivity2.getString(R.string.maya_label_verify_now), new C7.e(mayaDashboardActivity2, i)), new Pair(mayaDashboardActivity2.getString(R.string.maya_label_cancel), null), null, 96);
                        mayaAlertBottomSheetDialogFragmentN.s1(mayaAlertBottomSheetDialogFragmentN.f11818a0);
                        mayaAlertBottomSheetDialogFragmentN.f11820c0 = mayaAlertBottomSheetDialogFragmentN.f11820c0;
                        mayaAlertBottomSheetDialogFragmentN.show(mayaDashboardActivity2.getSupportFragmentManager(), "alert_dialog");
                        C1220i c1220iK1 = mayaDashboardActivity2.k1();
                        C1219h c1219hD2 = C1219h.d(enumC1215d);
                        c1219hD2.r(EnumC1216e.VERIFY_EMAIL);
                        c1219hD2.n(21);
                        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                        c1219hD2.j.put("source_page", "Credit tab");
                        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                        String string2 = mayaDashboardActivity2.getString(R.string.maya_label_apply_now);
                        if (string2 != null) {
                            c1219hD2.j.put("source_button", string2);
                        }
                        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                        c1219hD2.j.put("product_type", "MAYA_CREDIT_CONSUMER_LOAN");
                        c1219hD2.i();
                        c1220iK1.c(mayaDashboardActivity2, c1219hD2);
                    }
                }
                return Unit.f18162a;
        }
    }
}
