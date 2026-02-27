package fa;

import A3.i;
import Bb.f;
import D8.C0214w;
import Q6.n;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Biller;
import com.paymaya.mayaui.appdomemonitoring.view.activity.AppdomeThreatEventsActivity;
import com.paymaya.mayaui.compliance.view.activity.impl.MayaComplianceActivity;
import com.paymaya.mayaui.creatorstore.view.activity.impl.MayaCreatorStoreActivity;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreIntroductionFragment;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaLuckyGamesInterstitialFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLocationPermissionBottomSheetDialogFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaWizardFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantConfirmationFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantConfirmationFragment;
import com.paymaya.mayaui.paybills.view.dialog.impl.MayaBIRReminderDialogFragment;
import com.paymaya.mayaui.paybills.view.dialog.impl.MayaSpinnerBottomSheetDialogFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycIntroBottomSheetFragment;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycSubmittedFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelConfirmationFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelHomeFragment;
import com.paymaya.ui.dataprivacy.view.dialog.impl.DataPrivacyDialogFragment;
import g6.C1502a;
import ja.C1672a;
import ja.C1673b;
import ja.C1676e;
import ja.C1677f;
import ja.C1678g;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: fa.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1479a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16750b;

    public /* synthetic */ ViewOnClickListenerC1479a(Object obj, int i) {
        this.f16749a = i;
        this.f16750b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, ia.b] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, ia.b] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MayaSpinnerBottomSheetDialogFragment mayaSpinnerBottomSheetDialogFragment;
        Dialog dialog;
        n nVar;
        Object obj = this.f16750b;
        switch (this.f16749a) {
            case 0:
                MayaBIRReminderDialogFragment mayaBIRReminderDialogFragment = (MayaBIRReminderDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    mayaBIRReminderDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 1:
                C1502a c1502a = (C1502a) obj;
                Callback.onClick_enter(view);
                try {
                    C1502a.D(c1502a);
                    return;
                } finally {
                }
            case 2:
                AppdomeThreatEventsActivity appdomeThreatEventsActivity = (AppdomeThreatEventsActivity) obj;
                int i = AppdomeThreatEventsActivity.f;
                Callback.onClick_enter(view);
                try {
                    AppdomeThreatEventsActivity.g1(appdomeThreatEventsActivity);
                    return;
                } finally {
                }
            case 3:
                MayaComplianceActivity mayaComplianceActivity = (MayaComplianceActivity) obj;
                int i4 = MayaComplianceActivity.f12100p;
                Callback.onClick_enter(view);
                try {
                    mayaComplianceActivity.finish();
                    return;
                } finally {
                }
            case 4:
                MayaLocationPermissionBottomSheetDialogFragment mayaLocationPermissionBottomSheetDialogFragment = (MayaLocationPermissionBottomSheetDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaLocationPermissionBottomSheetDialogFragment.s1(mayaLocationPermissionBottomSheetDialogFragment);
                    return;
                } finally {
                }
            case 5:
                MayaWizardFragment mayaWizardFragment = (MayaWizardFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaWizardFragment.H1(mayaWizardFragment);
                    return;
                } finally {
                }
            case 6:
                MayaPayBillsSearchFragment mayaPayBillsSearchFragment = (MayaPayBillsSearchFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaPayBillsSearchFragment.J1(mayaPayBillsSearchFragment);
                    return;
                } finally {
                }
            case 7:
                C1672a c1672a = (C1672a) obj;
                Callback.onClick_enter(view);
                try {
                    C1672a.D(c1672a);
                    return;
                } finally {
                }
            case 8:
                C1673b c1673b = (C1673b) obj;
                Callback.onClick_enter(view);
                try {
                    C1673b.D(c1673b);
                    return;
                } finally {
                }
            case 9:
                C1676e c1676e = (C1676e) obj;
                Callback.onClick_enter(view);
                try {
                    Biller biller = c1676e.f;
                    if (biller != null) {
                        i iVar = c1676e.e;
                        iVar.getClass();
                        if (!i.c(biller)) {
                            ((RecyclerView.ViewHolder) iVar.c).B(biller);
                        }
                    }
                    return;
                } finally {
                }
            case 10:
                C1677f c1677f = (C1677f) obj;
                Callback.onClick_enter(view);
                try {
                    Biller biller2 = c1677f.f;
                    if (biller2 != null) {
                        i iVar2 = c1677f.e;
                        iVar2.getClass();
                        if (!i.c(biller2)) {
                            ((RecyclerView.ViewHolder) iVar2.c).B(biller2);
                        }
                    }
                    return;
                } finally {
                }
            case 11:
                C1678g c1678g = (C1678g) obj;
                Callback.onClick_enter(view);
                try {
                    Object obj2 = c1678g.c;
                    if (obj2 != null && (dialog = (mayaSpinnerBottomSheetDialogFragment = c1678g.f17734b).getDialog()) != null && (nVar = mayaSpinnerBottomSheetDialogFragment.f13349T) != null) {
                        ((MayaShopPaymentFragment) nVar.f5284b).T1().getInputEditText().setText((String) obj2);
                        dialog.dismiss();
                    }
                    return;
                } finally {
                }
            case 12:
                MayaTravelConfirmationFragment mayaTravelConfirmationFragment = (MayaTravelConfirmationFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaTravelConfirmationFragment.G1(mayaTravelConfirmationFragment);
                    return;
                } finally {
                }
            case 13:
                MayaTravelHomeFragment mayaTravelHomeFragment = (MayaTravelHomeFragment) obj;
                Callback.onClick_enter(view);
                try {
                    kc.b bVar = mayaTravelHomeFragment.f14199c0;
                    if (bVar != null) {
                        ((MayaTravelActivity) bVar).X1();
                    }
                    C1219h c1219h = new C1219h();
                    c1219h.n(17);
                    c1219h.t(EnumC1217f.BEEP);
                    mayaTravelHomeFragment.A1(c1219h);
                    return;
                } finally {
                }
            case 14:
                ReKycIntroBottomSheetFragment reKycIntroBottomSheetFragment = (ReKycIntroBottomSheetFragment) obj;
                Callback.onClick_enter(view);
                try {
                    ReKycIntroBottomSheetFragment.q1(reKycIntroBottomSheetFragment);
                    return;
                } finally {
                }
            case 15:
                ReKycSubmittedFragment reKycSubmittedFragment = (ReKycSubmittedFragment) obj;
                Callback.onClick_enter(view);
                try {
                    ReKycSubmittedFragment.H1(reKycSubmittedFragment);
                    return;
                } finally {
                }
            case 16:
                me.a aVar = (me.a) obj;
                Callback.onClick_enter(view);
                try {
                    me.a.D(aVar);
                    throw null;
                } finally {
                }
            case 17:
                MayaCreatorStoreActivity mayaCreatorStoreActivity = (MayaCreatorStoreActivity) obj;
                int i6 = MayaCreatorStoreActivity.f12105q;
                Callback.onClick_enter(view);
                try {
                    mayaCreatorStoreActivity.onBackPressed();
                    return;
                } finally {
                }
            case 18:
                MayaDynamicMerchantActivity mayaDynamicMerchantActivity = (MayaDynamicMerchantActivity) obj;
                int i10 = MayaDynamicMerchantActivity.f12840r;
                Callback.onClick_enter(view);
                try {
                    mayaDynamicMerchantActivity.onBackPressed();
                    return;
                } finally {
                }
            case 19:
                MayaMerchantActivity mayaMerchantActivity = (MayaMerchantActivity) obj;
                int i11 = MayaMerchantActivity.f12845s;
                Callback.onClick_enter(view);
                try {
                    mayaMerchantActivity.onBackPressed();
                    return;
                } finally {
                }
            case 20:
                MayaQRPHMerchantActivity mayaQRPHMerchantActivity = (MayaQRPHMerchantActivity) obj;
                int i12 = MayaQRPHMerchantActivity.f12851t;
                Callback.onClick_enter(view);
                try {
                    mayaQRPHMerchantActivity.onBackPressed();
                    return;
                } finally {
                }
            case 21:
                DataPrivacyDialogFragment dataPrivacyDialogFragment = (DataPrivacyDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    DataPrivacyDialogFragment.l1(dataPrivacyDialogFragment);
                    return;
                } finally {
                }
            case 22:
                MayaDynamicMerchantConfirmationFragment mayaDynamicMerchantConfirmationFragment = (MayaDynamicMerchantConfirmationFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaDynamicMerchantConfirmationFragment.G1(mayaDynamicMerchantConfirmationFragment);
                    return;
                } finally {
                }
            case 23:
                MayaDynamicMerchantPaymentFragment mayaDynamicMerchantPaymentFragment = (MayaDynamicMerchantPaymentFragment) obj;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO1 = mayaDynamicMerchantPaymentFragment.o1();
                    FragmentActivity activity = mayaDynamicMerchantPaymentFragment.getActivity();
                    C1219h c1219hD = C1219h.d(mayaDynamicMerchantPaymentFragment.u1());
                    c1219hD.n(17);
                    c1219hD.t(EnumC1217f.CONTINUE);
                    c1220iO1.c(activity, c1219hD);
                    C0214w c0214w = mayaDynamicMerchantPaymentFragment.f12868Y;
                    if (c0214w != null) {
                        c0214w.k();
                        return;
                    } else {
                        j.n("mDynamicMerchantPaymentPresenter");
                        throw null;
                    }
                } finally {
                }
            case 24:
                MayaMerchantConfirmationFragment mayaMerchantConfirmationFragment = (MayaMerchantConfirmationFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaMerchantConfirmationFragment.G1(mayaMerchantConfirmationFragment);
                    return;
                } finally {
                }
            case 25:
                MayaQRPHDynamicMerchantConfirmationFragment mayaQRPHDynamicMerchantConfirmationFragment = (MayaQRPHDynamicMerchantConfirmationFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaQRPHDynamicMerchantConfirmationFragment.G1(mayaQRPHDynamicMerchantConfirmationFragment);
                    return;
                } finally {
                }
            case 26:
                MayaQRPHDynamicMerchantPaymentFragment mayaQRPHDynamicMerchantPaymentFragment = (MayaQRPHDynamicMerchantPaymentFragment) obj;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO12 = mayaQRPHDynamicMerchantPaymentFragment.o1();
                    FragmentActivity activity2 = mayaQRPHDynamicMerchantPaymentFragment.getActivity();
                    C1219h c1219hD2 = C1219h.d(mayaQRPHDynamicMerchantPaymentFragment.u1());
                    c1219hD2.n(17);
                    c1219hD2.t(EnumC1217f.CONTINUE);
                    c1220iO12.c(activity2, c1219hD2);
                    f fVar = mayaQRPHDynamicMerchantPaymentFragment.f12896X;
                    if (fVar != null) {
                        fVar.k();
                        return;
                    } else {
                        j.n("mQRPHDynamicMerchantPaymentPresenter");
                        throw null;
                    }
                } finally {
                }
            case 27:
                MayaQRPHMerchantConfirmationFragment mayaQRPHMerchantConfirmationFragment = (MayaQRPHMerchantConfirmationFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaQRPHMerchantConfirmationFragment.G1(mayaQRPHMerchantConfirmationFragment);
                    return;
                } finally {
                }
            case 28:
                MayaCreatorStoreIntroductionFragment mayaCreatorStoreIntroductionFragment = (MayaCreatorStoreIntroductionFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaCreatorStoreIntroductionFragment.H1(mayaCreatorStoreIntroductionFragment);
                    return;
                } finally {
                }
            default:
                MayaLuckyGamesInterstitialFragment mayaLuckyGamesInterstitialFragment = (MayaLuckyGamesInterstitialFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaLuckyGamesInterstitialFragment.G1(mayaLuckyGamesInterstitialFragment);
                    return;
                } finally {
                }
        }
    }
}
