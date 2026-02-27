package N9;

import A7.j;
import android.os.Bundle;
import android.view.View;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditInterstitialActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditWebContentBottomSheetDialogFragment;
import defpackage.AbstractC1414e;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCreditInterstitialActivity f4338b;

    public /* synthetic */ a(MayaCreditInterstitialActivity mayaCreditInterstitialActivity, int i) {
        this.f4337a = i;
        this.f4338b = mayaCreditInterstitialActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4337a) {
            case 0:
                int i = MayaCreditInterstitialActivity.f13073r;
                final MayaCreditInterstitialActivity mayaCreditInterstitialActivity = this.f4338b;
                final int i4 = 0;
                break;
            case 1:
                MayaCreditInterstitialActivity mayaCreditInterstitialActivity2 = this.f4338b;
                int i6 = MayaCreditInterstitialActivity.f13073r;
                MayaCreditInterstitialActivity mayaCreditInterstitialActivity3 = (MayaCreditInterstitialActivity) ((M9.b) mayaCreditInterstitialActivity2.V1().c.get());
                mayaCreditInterstitialActivity3.getClass();
                E.a("MayaCreditInterstitialActivity", "closeClick");
                mayaCreditInterstitialActivity3.finish();
                break;
            default:
                MayaCreditInterstitialActivity mayaCreditInterstitialActivity4 = this.f4338b;
                int i10 = MayaCreditInterstitialActivity.f13073r;
                C1220i c1220iK1 = mayaCreditInterstitialActivity4.k1();
                C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
                AbstractC1414e.m(c1219hD, EnumC1216e.INTRO, 28);
                c1220iK1.c(mayaCreditInterstitialActivity4, c1219hD);
                j jVarV1 = mayaCreditInterstitialActivity4.V1();
                if (kotlin.jvm.internal.j.b(((com.paymaya.data.preference.a) jVarV1.e).l(), "kyc1")) {
                    MayaCreditInterstitialActivity mayaCreditInterstitialActivity5 = (MayaCreditInterstitialActivity) ((M9.b) jVarV1.c.get());
                    mayaCreditInterstitialActivity5.getClass();
                    E.a("MayaCreditInterstitialActivity", "showPrivacyNotice");
                    String string = mayaCreditInterstitialActivity5.getString(R.string.maya_label_credit_management_privacy_notice);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    String string2 = mayaCreditInterstitialActivity5.getString(R.string.maya_label_credit_management_data_privacy_policy_contentV1);
                    kotlin.jvm.internal.j.f(string2, "getString(...)");
                    String string3 = mayaCreditInterstitialActivity5.getString(R.string.maya_label_continue);
                    kotlin.jvm.internal.j.f(string3, "getString(...)");
                    Pair pair = (Pair) mayaCreditInterstitialActivity5.f13077q.getValue();
                    MayaCreditWebContentBottomSheetDialogFragment mayaCreditWebContentBottomSheetDialogFragment = new MayaCreditWebContentBottomSheetDialogFragment();
                    Bundle bundleE = androidx.media3.datasource.cache.c.e("title", string, "web_content", string2);
                    bundleE.putString("button_text", string3);
                    mayaCreditWebContentBottomSheetDialogFragment.setArguments(bundleE);
                    mayaCreditWebContentBottomSheetDialogFragment.f13133Y = pair != null ? (Function1) pair.f18161b : null;
                    mayaCreditWebContentBottomSheetDialogFragment.show(mayaCreditInterstitialActivity5.getSupportFragmentManager(), "confirmation_dialog");
                } else {
                    final MayaCreditInterstitialActivity mayaCreditInterstitialActivity6 = (MayaCreditInterstitialActivity) ((M9.b) jVarV1.c.get());
                    mayaCreditInterstitialActivity6.getClass();
                    E.a("MayaCreditInterstitialActivity", "showUpgradeRequiredDialog");
                    String string4 = mayaCreditInterstitialActivity6.getString(R.string.maya_label_upgrade_dialog_title);
                    kotlin.jvm.internal.j.f(string4, "getString(...)");
                    final int i11 = 1;
                    MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string4, mayaCreditInterstitialActivity6.getString(R.string.maya_label_upgrade_dialog_description), new Pair(mayaCreditInterstitialActivity6.getString(R.string.maya_label_upgrade_now), new Function1() { // from class: N9.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            EnumC1215d enumC1215d = EnumC1215d.CREDIT;
                            MayaCreditInterstitialActivity mayaCreditInterstitialActivity7 = mayaCreditInterstitialActivity6;
                            View it = (View) obj;
                            switch (i11) {
                                case 0:
                                    int i12 = MayaCreditInterstitialActivity.f13073r;
                                    kotlin.jvm.internal.j.g(it, "it");
                                    C1220i c1220iK12 = mayaCreditInterstitialActivity7.k1();
                                    C1219h c1219hD2 = C1219h.d(enumC1215d);
                                    c1219hD2.r(EnumC1216e.OPT_IN_DATA_PRIVACY);
                                    c1219hD2.n(17);
                                    c1219hD2.t(EnumC1217f.CONTINUE);
                                    c1219hD2.i();
                                    c1220iK12.c(mayaCreditInterstitialActivity7, c1219hD2);
                                    mayaCreditInterstitialActivity7.V1().z();
                                    break;
                                default:
                                    int i13 = MayaCreditInterstitialActivity.f13073r;
                                    kotlin.jvm.internal.j.g(it, "it");
                                    C1220i c1220iK13 = mayaCreditInterstitialActivity7.k1();
                                    C1219h c1219hD3 = C1219h.d(enumC1215d);
                                    c1219hD3.r(EnumC1216e.OPT_IN_KYC0);
                                    c1219hD3.n(17);
                                    c1219hD3.t(EnumC1217f.UPGRADE_NOW);
                                    c1219hD3.i();
                                    c1220iK13.c(mayaCreditInterstitialActivity7, c1219hD3);
                                    mayaCreditInterstitialActivity7.n1().s(mayaCreditInterstitialActivity7, false);
                                    break;
                            }
                            return Unit.f18162a;
                        }
                    }), new Pair(mayaCreditInterstitialActivity6.getString(R.string.maya_label_maybe_later), null), null, 96);
                    mayaAlertBottomSheetDialogFragmentN.s1(mayaAlertBottomSheetDialogFragmentN.f11818a0);
                    mayaAlertBottomSheetDialogFragmentN.f11820c0 = mayaAlertBottomSheetDialogFragmentN.f11820c0;
                    mayaAlertBottomSheetDialogFragmentN.show(mayaCreditInterstitialActivity6.getSupportFragmentManager(), "alert_dialog");
                }
                break;
        }
        return Unit.f18162a;
    }
}
