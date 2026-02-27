package Ba;

import D8.C0200h;
import G6.k;
import H9.c;
import H9.d;
import Ib.b;
import K8.InterfaceC0279d;
import N5.C0458i;
import S1.s;
import android.view.View;
import android.widget.RadioButton;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.navigation.Navigation;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.MayaRadioOptionView;
import com.paymaya.mayaui.cards.view.fragment.impl.MayaCardsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaAutoCashinWalletSettingsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFormFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionConfirmationFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityMoneyInFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivitySendMoneyFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycAccountUnderReviewActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycUpdateOtherIdsActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAcceptedIdsFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycAmlcCertificateFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsDetailsFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeSuccessBottomSheetFragment;
import com.paymaya.mayaui.pushapproval.view.activity.impl.MayaPushApprovalActivity;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalErrorDialogFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalRequestExpiredBottomSheetDialogFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersReceiptFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f387b;

    public /* synthetic */ a(Object obj, int i) {
        this.f386a = i;
        this.f387b = obj;
    }

    /* JADX WARN: Type inference failed for: r9v26, types: [H9.b, androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARN: Type inference failed for: r9v31, types: [com.paymaya.common.base.MayaBaseFragment, yb.a] */
    /* JADX WARN: Type inference failed for: r9v44, types: [J6.a, com.paymaya.common.base.MayaBaseFragment] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f386a) {
            case 0:
                MayaPushApprovalActivity mayaPushApprovalActivity = (MayaPushApprovalActivity) this.f387b;
                int i = MayaPushApprovalActivity.f13543p;
                Callback.onClick_enter(view);
                try {
                    C0458i c0458i = mayaPushApprovalActivity.f13545o;
                    j.d(c0458i);
                    FragmentContainerView navHostFragment = c0458i.c;
                    j.f(navHostFragment, "navHostFragment");
                    if (!Navigation.findNavController(navHostFragment).popBackStack()) {
                        mayaPushApprovalActivity.finish();
                    }
                    return;
                } finally {
                }
            case 1:
                MayaCardsFragment mayaCardsFragment = (MayaCardsFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaCardsFragment.r1(mayaCardsFragment);
                    return;
                } finally {
                }
            case 2:
                MayaPushApprovalErrorDialogFragment mayaPushApprovalErrorDialogFragment = (MayaPushApprovalErrorDialogFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaPushApprovalErrorDialogFragment.n1(mayaPushApprovalErrorDialogFragment);
                    return;
                } finally {
                }
            case 3:
                MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment = (MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment.s1(mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment);
                    return;
                } finally {
                }
            case 4:
                MayaPushApprovalRequestExpiredBottomSheetDialogFragment mayaPushApprovalRequestExpiredBottomSheetDialogFragment = (MayaPushApprovalRequestExpiredBottomSheetDialogFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaPushApprovalRequestExpiredBottomSheetDialogFragment.s1(mayaPushApprovalRequestExpiredBottomSheetDialogFragment);
                    return;
                } finally {
                }
            case 5:
                MayaRadioOptionView mayaRadioOptionView = (MayaRadioOptionView) this.f387b;
                int i4 = MayaRadioOptionView.e;
                Callback.onClick_enter(view);
                try {
                    if (!((RadioButton) mayaRadioOptionView.f11284d.c).isChecked()) {
                        ((RadioButton) mayaRadioOptionView.f11284d.c).setChecked(true);
                    }
                    return;
                } finally {
                }
            case 6:
                MayaUserActivityMoneyInFragment mayaUserActivityMoneyInFragment = (MayaUserActivityMoneyInFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaUserActivityMoneyInFragment.Y1(mayaUserActivityMoneyInFragment);
                    return;
                } finally {
                }
            case 7:
                MayaUserActivitySendMoneyFragment mayaUserActivitySendMoneyFragment = (MayaUserActivitySendMoneyFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaUserActivitySendMoneyFragment.Y1(mayaUserActivitySendMoneyFragment);
                    return;
                } finally {
                }
            case 8:
                MayaMissionsDetailsFragment mayaMissionsDetailsFragment = (MayaMissionsDetailsFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaMissionsDetailsFragment.s1(mayaMissionsDetailsFragment);
                    return;
                } finally {
                }
            case 9:
                MayaMissionsEnterCodeSuccessBottomSheetFragment mayaMissionsEnterCodeSuccessBottomSheetFragment = (MayaMissionsEnterCodeSuccessBottomSheetFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    mayaMissionsEnterCodeSuccessBottomSheetFragment.dismiss();
                    return;
                } finally {
                }
            case 10:
                MayaVouchersReceiptFragment mayaVouchersReceiptFragment = (MayaVouchersReceiptFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaVouchersReceiptFragment.m2(mayaVouchersReceiptFragment);
                    return;
                } finally {
                }
            case 11:
                H9.a aVar = (H9.a) this.f387b;
                Callback.onClick_enter(view);
                try {
                    aVar.f2144a.d(aVar.c);
                    return;
                } finally {
                }
            case 12:
                c cVar = (c) this.f387b;
                Callback.onClick_enter(view);
                try {
                    cVar.f2148b.d(cVar.f2149d);
                    return;
                } finally {
                }
            case 13:
                d dVar = (d) this.f387b;
                Callback.onClick_enter(view);
                try {
                    d.D(dVar);
                    return;
                } finally {
                }
            case 14:
                MayaKycAccountUnderReviewActivity mayaKycAccountUnderReviewActivity = (MayaKycAccountUnderReviewActivity) this.f387b;
                int i6 = MayaKycAccountUnderReviewActivity.f12440r;
                Callback.onClick_enter(view);
                try {
                    mayaKycAccountUnderReviewActivity.finish();
                    return;
                } finally {
                }
            case 15:
                MayaKycUpdateOtherIdsActivity mayaKycUpdateOtherIdsActivity = (MayaKycUpdateOtherIdsActivity) this.f387b;
                int i10 = MayaKycUpdateOtherIdsActivity.f12458p;
                Callback.onClick_enter(view);
                try {
                    mayaKycUpdateOtherIdsActivity.finish();
                    return;
                } finally {
                }
            case 16:
                Ib.a aVar2 = (Ib.a) this.f387b;
                Callback.onClick_enter(view);
                try {
                    aVar2.f2271b.e(aVar2.c);
                    return;
                } finally {
                }
            case 17:
                b bVar = (b) this.f387b;
                Callback.onClick_enter(view);
                try {
                    b.D(bVar);
                    return;
                } finally {
                }
            case 18:
                Jd.a aVar3 = (Jd.a) this.f387b;
                Callback.onClick_enter(view);
                try {
                    Jd.a.D(aVar3);
                    return;
                } finally {
                }
            case 19:
                MayaAutoCashinWalletSettingsFragment mayaAutoCashinWalletSettingsFragment = (MayaAutoCashinWalletSettingsFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaAutoCashinWalletSettingsFragment.G1(mayaAutoCashinWalletSettingsFragment);
                    return;
                } finally {
                }
            case 20:
                MayaBankPullConfirmationFragment mayaBankPullConfirmationFragment = (MayaBankPullConfirmationFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaBankPullConfirmationFragment.G1(mayaBankPullConfirmationFragment);
                    return;
                } finally {
                }
            case 21:
                MayaCashInCodeFormFragment mayaCashInCodeFormFragment = (MayaCashInCodeFormFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaCashInCodeFormFragment.U1(mayaCashInCodeFormFragment);
                    return;
                } finally {
                }
            case 22:
                MayaCashInViaCardConfirmationFragment mayaCashInViaCardConfirmationFragment = (MayaCashInViaCardConfirmationFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaCashInViaCardConfirmationFragment.H1(mayaCashInViaCardConfirmationFragment);
                    return;
                } finally {
                }
            case 23:
                MayaWesternUnionConfirmationFragment mayaWesternUnionConfirmationFragment = (MayaWesternUnionConfirmationFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    MayaWesternUnionConfirmationFragment.H1(mayaWesternUnionConfirmationFragment);
                    return;
                } finally {
                }
            case 24:
                MayaWesternUnionFragment mayaWesternUnionFragment = (MayaWesternUnionFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO1 = mayaWesternUnionFragment.o1();
                    FragmentActivity activity = mayaWesternUnionFragment.getActivity();
                    C1219h c1219hD = C1219h.d(EnumC1215d.WESTERN_UNION);
                    c1219hD.n(17);
                    c1219hD.t(EnumC1217f.CONTINUE);
                    c1220iO1.c(activity, c1219hD);
                    mayaWesternUnionFragment.G1().k();
                    return;
                } finally {
                }
            case 25:
                k kVar = (k) this.f387b;
                Callback.onClick_enter(view);
                try {
                    k.l(kVar);
                    return;
                } finally {
                }
            case 26:
                M6.a aVar4 = (M6.a) this.f387b;
                Callback.onClick_enter(view);
                try {
                    aVar4.f3088a.w();
                    return;
                } finally {
                }
            case 27:
                MayaKycAcceptedIdsFragment mayaKycAcceptedIdsFragment = (MayaKycAcceptedIdsFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    FragmentActivity fragmentActivityRequireActivity = mayaKycAcceptedIdsFragment.requireActivity();
                    j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                    Navigation.findNavController(fragmentActivityRequireActivity, R.id.maya_kyc_nav_host_fragment).popBackStack();
                    return;
                } finally {
                }
            default:
                MayaKycAmlcCertificateFragment mayaKycAmlcCertificateFragment = (MayaKycAmlcCertificateFragment) this.f387b;
                Callback.onClick_enter(view);
                try {
                    ((MayaKycAmlcCertificateFragment) ((InterfaceC0279d) ((C0200h) mayaKycAmlcCertificateFragment.K1()).c.get())).N1();
                    String string = mayaKycAmlcCertificateFragment.getString(R.string.maya_kyc_amlc_page_name_label);
                    j.f(string, "getString(...)");
                    s.m(mayaKycAmlcCertificateFragment, "Back", string, null, null, null, 28);
                    return;
                } finally {
                }
        }
    }
}
