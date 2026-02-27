package Fa;

import E8.l;
import M8.C0373k0;
import M8.T2;
import N5.C0435a;
import N5.C0489y;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import cj.L;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.paymaya.R;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaChoicesBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaOptionsBottomSheetFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaPostTransactionBottomSheetDialogFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyWebContentBottomSheetDialogFragment;
import com.paymaya.mayaui.favorite.view.dialog.impl.MayaFavoriteReminderSampleBottomSheetDialogFragment;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteReminderScheduleBottomSheetFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycChangeYourMindBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycConfirmationBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycDnfbpWhyNeededBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycExampleUpgradeBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycValidationRulesBottomSheetDialogFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeBottomSheetFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeSuccessBottomSheetFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsPreviewBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditWebContentBottomSheetDialogFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaAgreementSettingsBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditBillingEndDateBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditBillingEndDateConfirmationBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditContactReferenceLearnMoreBottomSheetFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditInterestRateBottomSheetFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalRequestExpiredBottomSheetDialogFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaVerifiedSellerBottomSheetDialogFragment;
import com.paymaya.mayaui.regv2.view.bottomsheet.impl.MayaProminentDisclosureBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaChangeMinRemindersBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaDisplayNamePasswordBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaLicensesBottomSheetDialogFragment;
import com.paymaya.mayaui.settings.view.dialog.impl.MayaSettingsPasswordCredentialBottomSheetFragment;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherClaimBottomSheetDialogFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetDialogFragment f1565b;

    public /* synthetic */ c(BottomSheetDialogFragment bottomSheetDialogFragment, int i) {
        this.f1564a = i;
        this.f1565b = bottomSheetDialogFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewL1;
        View viewL12;
        View viewL13;
        View viewL14;
        switch (this.f1564a) {
            case 0:
                MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment = (MayaPushApprovalRequestAuthorizedBottomSheetDialogFragment) this.f1565b;
                Dialog dialog = mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment.getDialog();
                j.e(dialog, numX49.tnTj78("bBto"));
                View viewL15 = mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment.l1((BottomSheetDialog) dialog);
                if (viewL15 == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewL15);
                bottomSheetBehaviorFrom.setState(3);
                bottomSheetBehaviorFrom.setSkipCollapsed(true);
                bottomSheetBehaviorFrom.setDraggable(false);
                mayaPushApprovalRequestAuthorizedBottomSheetDialogFragment.setCancelable(false);
                return;
            case 1:
                MayaPushApprovalRequestExpiredBottomSheetDialogFragment mayaPushApprovalRequestExpiredBottomSheetDialogFragment = (MayaPushApprovalRequestExpiredBottomSheetDialogFragment) this.f1565b;
                Dialog dialog2 = mayaPushApprovalRequestExpiredBottomSheetDialogFragment.getDialog();
                j.e(dialog2, numX49.tnTj78("bBt4"));
                View viewL16 = mayaPushApprovalRequestExpiredBottomSheetDialogFragment.l1((BottomSheetDialog) dialog2);
                if (viewL16 == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom2 = BottomSheetBehavior.from(viewL16);
                bottomSheetBehaviorFrom2.setState(3);
                bottomSheetBehaviorFrom2.setSkipCollapsed(true);
                bottomSheetBehaviorFrom2.setDraggable(false);
                mayaPushApprovalRequestExpiredBottomSheetDialogFragment.setCancelable(false);
                return;
            case 2:
                MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment = (MayaMissionsEnterCodeBottomSheetFragment) this.f1565b;
                View view = mayaMissionsEnterCodeBottomSheetFragment.getView();
                if (view != null) {
                    view.post(new l(mayaMissionsEnterCodeBottomSheetFragment, 3));
                    return;
                }
                return;
            case 3:
                j.e(dialogInterface, numX49.tnTj78("bBtC"));
                View viewL17 = ((MayaMissionsEnterCodeSuccessBottomSheetFragment) this.f1565b).l1((BottomSheetDialog) dialogInterface);
                if (viewL17 == null) {
                    return;
                }
                viewL17.setBackgroundResource(R.color.transparent);
                BottomSheetBehavior.from(viewL17).setState(3);
                return;
            case 4:
                j.e(dialogInterface, numX49.tnTj78("bBt8"));
                View viewL18 = ((MayaMissionsPreviewBottomSheetFragment) this.f1565b).l1((BottomSheetDialog) dialogInterface);
                if (viewL18 == null) {
                    return;
                }
                viewL18.setBackgroundResource(R.color.transparent);
                BottomSheetBehavior bottomSheetBehaviorFrom3 = BottomSheetBehavior.from(viewL18);
                bottomSheetBehaviorFrom3.setState(3);
                bottomSheetBehaviorFrom3.setSkipCollapsed(true);
                return;
            case 5:
                j.e(dialogInterface, numX49.tnTj78("bBtU"));
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialogInterface;
                MayaVoucherClaimBottomSheetDialogFragment mayaVoucherClaimBottomSheetDialogFragment = (MayaVoucherClaimBottomSheetDialogFragment) this.f1565b;
                View viewFindViewById3 = bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById3 == null) {
                    return;
                }
                viewFindViewById3.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                bottomSheetDialog.setCancelable(false);
                bottomSheetDialog.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom4 = BottomSheetBehavior.from(viewFindViewById3);
                ConstraintLayout constraintLayout = mayaVoucherClaimBottomSheetDialogFragment.f14279S;
                if (constraintLayout == null) {
                    j.n(numX49.tnTj78("bBte"));
                    throw null;
                }
                bottomSheetBehaviorFrom4.setPeekHeight(constraintLayout.getHeight());
                bottomSheetBehaviorFrom4.setState(4);
                bottomSheetBehaviorFrom4.setDraggable(false);
                return;
            case 6:
                MayaKycChangeYourMindBottomSheetDialogFragment mayaKycChangeYourMindBottomSheetDialogFragment = (MayaKycChangeYourMindBottomSheetDialogFragment) this.f1565b;
                Dialog dialog3 = mayaKycChangeYourMindBottomSheetDialogFragment.getDialog();
                BottomSheetDialog bottomSheetDialog2 = dialog3 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog3 : null;
                if (bottomSheetDialog2 == null || (viewFindViewById = bottomSheetDialog2.findViewById(R.id.design_bottom_sheet)) == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom5 = BottomSheetBehavior.from(viewFindViewById);
                bottomSheetBehaviorFrom5.setState(3);
                bottomSheetBehaviorFrom5.setSkipCollapsed(true);
                bottomSheetBehaviorFrom5.setDraggable(false);
                mayaKycChangeYourMindBottomSheetDialogFragment.setCancelable(false);
                T2.H(mayaKycChangeYourMindBottomSheetDialogFragment, null, 3);
                return;
            case 7:
                MayaKycConfirmationBottomSheetDialogFragment mayaKycConfirmationBottomSheetDialogFragment = (MayaKycConfirmationBottomSheetDialogFragment) this.f1565b;
                Dialog dialog4 = mayaKycConfirmationBottomSheetDialogFragment.getDialog();
                BottomSheetDialog bottomSheetDialog3 = dialog4 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog4 : null;
                if (bottomSheetDialog3 == null || (viewFindViewById2 = bottomSheetDialog3.findViewById(R.id.design_bottom_sheet)) == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom6 = BottomSheetBehavior.from(viewFindViewById2);
                bottomSheetBehaviorFrom6.setState(3);
                bottomSheetBehaviorFrom6.setSkipCollapsed(true);
                bottomSheetBehaviorFrom6.setDraggable(false);
                mayaKycConfirmationBottomSheetDialogFragment.setCancelable(false);
                T2.H(mayaKycConfirmationBottomSheetDialogFragment, L.c(new Pair(EnumC1212a.IS_SUSPECTED_MINOR, ((C0373k0) mayaKycConfirmationBottomSheetDialogFragment.f12508W.getValue()).b() ? numX49.tnTj78("bBtQ") : numX49.tnTj78("bBtt"))), 2);
                return;
            case 8:
                MayaKycDnfbpWhyNeededBottomSheetDialogFragment mayaKycDnfbpWhyNeededBottomSheetDialogFragment = (MayaKycDnfbpWhyNeededBottomSheetDialogFragment) this.f1565b;
                Dialog dialog5 = mayaKycDnfbpWhyNeededBottomSheetDialogFragment.getDialog();
                BottomSheetDialog bottomSheetDialog4 = dialog5 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog5 : null;
                if (bottomSheetDialog4 == null || (viewL1 = mayaKycDnfbpWhyNeededBottomSheetDialogFragment.l1(bottomSheetDialog4)) == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom7 = BottomSheetBehavior.from(viewL1);
                bottomSheetBehaviorFrom7.setState(3);
                bottomSheetBehaviorFrom7.setSkipCollapsed(true);
                bottomSheetBehaviorFrom7.setDraggable(false);
                return;
            case 9:
                MayaKycExampleUpgradeBottomSheetDialogFragment mayaKycExampleUpgradeBottomSheetDialogFragment = (MayaKycExampleUpgradeBottomSheetDialogFragment) this.f1565b;
                Dialog dialog6 = mayaKycExampleUpgradeBottomSheetDialogFragment.getDialog();
                BottomSheetDialog bottomSheetDialog5 = dialog6 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog6 : null;
                if (bottomSheetDialog5 == null || (viewL12 = mayaKycExampleUpgradeBottomSheetDialogFragment.l1(bottomSheetDialog5)) == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom8 = BottomSheetBehavior.from(viewL12);
                bottomSheetBehaviorFrom8.setState(3);
                bottomSheetBehaviorFrom8.setSkipCollapsed(true);
                bottomSheetBehaviorFrom8.setDraggable(false);
                return;
            case 10:
                MayaKycValidationRulesBottomSheetDialogFragment mayaKycValidationRulesBottomSheetDialogFragment = (MayaKycValidationRulesBottomSheetDialogFragment) this.f1565b;
                Dialog dialog7 = mayaKycValidationRulesBottomSheetDialogFragment.getDialog();
                BottomSheetDialog bottomSheetDialog6 = dialog7 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog7 : null;
                if (bottomSheetDialog6 == null || (viewL13 = mayaKycValidationRulesBottomSheetDialogFragment.l1(bottomSheetDialog6)) == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom9 = BottomSheetBehavior.from(viewL13);
                bottomSheetBehaviorFrom9.setState(3);
                bottomSheetBehaviorFrom9.setSkipCollapsed(true);
                bottomSheetBehaviorFrom9.setDraggable(false);
                mayaKycValidationRulesBottomSheetDialogFragment.setCancelable(false);
                return;
            case 11:
                j.e(dialogInterface, numX49.tnTj78("bBtH"));
                BottomSheetDialog bottomSheetDialog7 = (BottomSheetDialog) dialogInterface;
                MayaVerifiedSellerBottomSheetDialogFragment mayaVerifiedSellerBottomSheetDialogFragment = (MayaVerifiedSellerBottomSheetDialogFragment) this.f1565b;
                View viewFindViewById4 = bottomSheetDialog7.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById4 == null) {
                    return;
                }
                viewFindViewById4.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                bottomSheetDialog7.setCancelable(false);
                bottomSheetDialog7.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom10 = BottomSheetBehavior.from(viewFindViewById4);
                ConstraintLayout constraintLayout2 = mayaVerifiedSellerBottomSheetDialogFragment.f13649U;
                if (constraintLayout2 == null) {
                    j.n(numX49.tnTj78("bBtO"));
                    throw null;
                }
                bottomSheetBehaviorFrom10.setPeekHeight(constraintLayout2.getHeight());
                bottomSheetBehaviorFrom10.setState(4);
                bottomSheetBehaviorFrom10.setDraggable(false);
                return;
            case 12:
                j.e(dialogInterface, numX49.tnTj78("bBtF"));
                BottomSheetDialog bottomSheetDialog8 = (BottomSheetDialog) dialogInterface;
                View viewL19 = ((MayaCreditWebContentBottomSheetDialogFragment) this.f1565b).l1(bottomSheetDialog8);
                if (viewL19 == null) {
                    return;
                }
                viewL19.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                bottomSheetDialog8.setCanceledOnTouchOutside(true);
                int iB = sj.b.b(((Number) r0.q1().f18161b).intValue() * 0.95f);
                ViewGroup.LayoutParams layoutParams = viewL19.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = iB;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom11 = BottomSheetBehavior.from(viewL19);
                bottomSheetBehaviorFrom11.setPeekHeight(iB);
                bottomSheetBehaviorFrom11.setState(4);
                bottomSheetBehaviorFrom11.setDraggable(false);
                return;
            case 13:
                j.e(dialogInterface, numX49.tnTj78("bBtE"));
                NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment = (NewMayaAgreementSettingsBottomSheetFragment) this.f1565b;
                View viewL110 = newMayaAgreementSettingsBottomSheetFragment.l1((BottomSheetDialog) dialogInterface);
                if (viewL110 == null) {
                    return;
                }
                viewL110.setBackgroundResource(R.color.transparent);
                int iDoubleValue = (int) (((Number) newMayaAgreementSettingsBottomSheetFragment.q1().f18161b).doubleValue() * 0.95d);
                ViewGroup.LayoutParams layoutParams2 = viewL110.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = iDoubleValue;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom12 = BottomSheetBehavior.from(viewL110);
                bottomSheetBehaviorFrom12.setPeekHeight(iDoubleValue);
                bottomSheetBehaviorFrom12.setState(4);
                bottomSheetBehaviorFrom12.setDraggable(false);
                return;
            case 14:
                j.e(dialogInterface, numX49.tnTj78("bBti"));
                View viewL111 = ((NewMayaCreditBillingEndDateBottomSheetFragment) this.f1565b).l1((BottomSheetDialog) dialogInterface);
                if (viewL111 == null) {
                    return;
                }
                viewL111.setBackgroundResource(R.color.transparent);
                BottomSheetBehavior bottomSheetBehaviorFrom13 = BottomSheetBehavior.from(viewL111);
                bottomSheetBehaviorFrom13.setState(3);
                bottomSheetBehaviorFrom13.setSkipCollapsed(true);
                return;
            case 15:
                j.e(dialogInterface, numX49.tnTj78("bBtd"));
                View viewL112 = ((NewMayaCreditBillingEndDateConfirmationBottomSheetFragment) this.f1565b).l1((BottomSheetDialog) dialogInterface);
                if (viewL112 == null) {
                    return;
                }
                viewL112.setBackgroundResource(R.color.transparent);
                BottomSheetBehavior bottomSheetBehaviorFrom14 = BottomSheetBehavior.from(viewL112);
                bottomSheetBehaviorFrom14.setState(3);
                bottomSheetBehaviorFrom14.setSkipCollapsed(true);
                return;
            case 16:
                j.e(dialogInterface, numX49.tnTj78("bBtj"));
                View viewL113 = ((NewMayaCreditContactReferenceLearnMoreBottomSheetFragment) this.f1565b).l1((BottomSheetDialog) dialogInterface);
                if (viewL113 == null) {
                    return;
                }
                viewL113.setBackgroundResource(R.color.transparent);
                BottomSheetBehavior bottomSheetBehaviorFrom15 = BottomSheetBehavior.from(viewL113);
                bottomSheetBehaviorFrom15.setState(3);
                bottomSheetBehaviorFrom15.setSkipCollapsed(true);
                return;
            case 17:
                j.e(dialogInterface, numX49.tnTj78("bBtS"));
                View viewL114 = ((NewMayaCreditInterestRateBottomSheetFragment) this.f1565b).l1((BottomSheetDialog) dialogInterface);
                if (viewL114 == null) {
                    return;
                }
                viewL114.setBackgroundResource(R.color.transparent);
                BottomSheetBehavior bottomSheetBehaviorFrom16 = BottomSheetBehavior.from(viewL114);
                bottomSheetBehaviorFrom16.setState(3);
                bottomSheetBehaviorFrom16.setSkipCollapsed(true);
                return;
            case 18:
                j.e(dialogInterface, numX49.tnTj78("bBtV"));
                BottomSheetDialog bottomSheetDialog9 = (BottomSheetDialog) dialogInterface;
                MayaChangeMinRemindersBottomSheetDialogFragment mayaChangeMinRemindersBottomSheetDialogFragment = (MayaChangeMinRemindersBottomSheetDialogFragment) this.f1565b;
                View viewL115 = mayaChangeMinRemindersBottomSheetDialogFragment.l1(bottomSheetDialog9);
                if (viewL115 == null) {
                    return;
                }
                viewL115.setBackgroundResource(R.color.transparent);
                bottomSheetDialog9.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom17 = BottomSheetBehavior.from(viewL115);
                bottomSheetBehaviorFrom17.setState(3);
                bottomSheetBehaviorFrom17.setSkipCollapsed(true);
                bottomSheetBehaviorFrom17.setDraggable(false);
                mayaChangeMinRemindersBottomSheetDialogFragment.setCancelable(false);
                return;
            case 19:
                j.e(dialogInterface, numX49.tnTj78("bBtu"));
                MayaDisplayNamePasswordBottomSheetDialogFragment mayaDisplayNamePasswordBottomSheetDialogFragment = (MayaDisplayNamePasswordBottomSheetDialogFragment) this.f1565b;
                View viewL116 = mayaDisplayNamePasswordBottomSheetDialogFragment.l1((BottomSheetDialog) dialogInterface);
                if (viewL116 == null) {
                    return;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom18 = BottomSheetBehavior.from(viewL116);
                bottomSheetBehaviorFrom18.setState(3);
                bottomSheetBehaviorFrom18.setSkipCollapsed(true);
                mayaDisplayNamePasswordBottomSheetDialogFragment.setCancelable(false);
                return;
            case 20:
                j.e(dialogInterface, numX49.tnTj78("bBtB"));
                BottomSheetDialog bottomSheetDialog10 = (BottomSheetDialog) dialogInterface;
                MayaLicensesBottomSheetDialogFragment mayaLicensesBottomSheetDialogFragment = (MayaLicensesBottomSheetDialogFragment) this.f1565b;
                View viewL117 = mayaLicensesBottomSheetDialogFragment.l1(bottomSheetDialog10);
                if (viewL117 == null) {
                    return;
                }
                viewL117.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                int i = (int) (((double) mayaLicensesBottomSheetDialogFragment.getResources().getDisplayMetrics().heightPixels) * 0.7d);
                viewL117.getLayoutParams().height = i;
                bottomSheetDialog10.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom19 = BottomSheetBehavior.from(viewL117);
                bottomSheetBehaviorFrom19.setPeekHeight(i);
                bottomSheetBehaviorFrom19.setState(4);
                bottomSheetBehaviorFrom19.setSkipCollapsed(true);
                bottomSheetBehaviorFrom19.setDraggable(false);
                mayaLicensesBottomSheetDialogFragment.setCancelable(false);
                return;
            case 21:
                j.e(dialogInterface, numX49.tnTj78("bBtk"));
                BottomSheetDialog bottomSheetDialog11 = (BottomSheetDialog) dialogInterface;
                MayaSettingsPasswordCredentialBottomSheetFragment mayaSettingsPasswordCredentialBottomSheetFragment = (MayaSettingsPasswordCredentialBottomSheetFragment) this.f1565b;
                View viewL118 = mayaSettingsPasswordCredentialBottomSheetFragment.l1(bottomSheetDialog11);
                if (viewL118 == null) {
                    return;
                }
                viewL118.setBackgroundResource(R.color.transparent);
                bottomSheetDialog11.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom20 = BottomSheetBehavior.from(viewL118);
                bottomSheetBehaviorFrom20.setState(3);
                bottomSheetBehaviorFrom20.setSkipCollapsed(true);
                bottomSheetBehaviorFrom20.setDraggable(false);
                mayaSettingsPasswordCredentialBottomSheetFragment.setCancelable(false);
                return;
            case 22:
                MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment = (MayaDataPrivacyWebContentBottomSheetDialogFragment) this.f1565b;
                Dialog dialog8 = mayaDataPrivacyWebContentBottomSheetDialogFragment.getDialog();
                BottomSheetDialog bottomSheetDialog12 = dialog8 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog8 : null;
                if (bottomSheetDialog12 != null) {
                    O7.a aVar = mayaDataPrivacyWebContentBottomSheetDialogFragment.f12311a0;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    View viewFindViewById5 = bottomSheetDialog12.findViewById(R.id.design_bottom_sheet);
                    if (viewFindViewById5 == null) {
                        return;
                    }
                    viewFindViewById5.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                    Ke.b.a(viewFindViewById5);
                    bottomSheetDialog12.setCanceledOnTouchOutside(false);
                    viewFindViewById5.post(new Ke.f(viewFindViewById5, 1));
                    BottomSheetBehavior bottomSheetBehaviorFrom21 = BottomSheetBehavior.from(viewFindViewById5);
                    bottomSheetBehaviorFrom21.setDraggable(false);
                    bottomSheetBehaviorFrom21.setState(3);
                    return;
                }
                return;
            case 23:
                j.e(dialogInterface, numX49.tnTj78("bBtZ"));
                BottomSheetDialog bottomSheetDialog13 = (BottomSheetDialog) dialogInterface;
                MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragment = (MayaAlertBottomSheetDialogFragment) this.f1565b;
                View viewL119 = mayaAlertBottomSheetDialogFragment.l1(bottomSheetDialog13);
                if (viewL119 == null) {
                    return;
                }
                viewL119.setBackgroundResource(R.color.transparent);
                bottomSheetDialog13.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom22 = BottomSheetBehavior.from(viewL119);
                bottomSheetBehaviorFrom22.setState(3);
                bottomSheetBehaviorFrom22.setSkipCollapsed(true);
                bottomSheetBehaviorFrom22.setDraggable(false);
                mayaAlertBottomSheetDialogFragment.setCancelable(false);
                return;
            case 24:
                j.e(dialogInterface, numX49.tnTj78("bBtr"));
                BottomSheetDialog bottomSheetDialog14 = (BottomSheetDialog) dialogInterface;
                MayaChoicesBottomSheetDialogFragment mayaChoicesBottomSheetDialogFragment = (MayaChoicesBottomSheetDialogFragment) this.f1565b;
                View viewFindViewById6 = bottomSheetDialog14.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById6 == null) {
                    return;
                }
                viewFindViewById6.setBackgroundResource(R.drawable.pma_background_white_round_corner_bottom_sheet);
                int height = viewFindViewById6.getHeight();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) mayaChoicesBottomSheetDialogFragment.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                if (height > displayMetrics.heightPixels) {
                    TypedValue typedValue = new TypedValue();
                    height -= mayaChoicesBottomSheetDialogFragment.requireContext().getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, mayaChoicesBottomSheetDialogFragment.getResources().getDisplayMetrics()) : 0;
                }
                ViewGroup.LayoutParams layoutParams3 = viewFindViewById6.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = height;
                    viewFindViewById6.setLayoutParams(layoutParams3);
                }
                bottomSheetDialog14.setCancelable(true);
                bottomSheetDialog14.setCanceledOnTouchOutside(true);
                BottomSheetBehavior bottomSheetBehaviorFrom23 = BottomSheetBehavior.from(viewFindViewById6);
                bottomSheetBehaviorFrom23.setState(3);
                bottomSheetBehaviorFrom23.setSkipCollapsed(true);
                bottomSheetBehaviorFrom23.setDraggable(true);
                return;
            case 25:
                j.e(dialogInterface, numX49.tnTj78("bBtL"));
                BottomSheetDialog bottomSheetDialog15 = (BottomSheetDialog) dialogInterface;
                MayaOptionsBottomSheetFragment mayaOptionsBottomSheetFragment = (MayaOptionsBottomSheetFragment) this.f1565b;
                View viewFindViewById7 = bottomSheetDialog15.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById7 == null) {
                    return;
                }
                viewFindViewById7.setBackgroundResource(R.color.transparent);
                bottomSheetDialog15.setCanceledOnTouchOutside(mayaOptionsBottomSheetFragment.f11864X);
                BottomSheetBehavior bottomSheetBehaviorFrom24 = BottomSheetBehavior.from(viewFindViewById7);
                bottomSheetBehaviorFrom24.setState(3);
                bottomSheetBehaviorFrom24.setSkipCollapsed(true);
                return;
            case 26:
                j.e(dialogInterface, numX49.tnTj78("bBt2"));
                BottomSheetDialog bottomSheetDialog16 = (BottomSheetDialog) dialogInterface;
                MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment = (MayaPostTransactionBottomSheetDialogFragment) this.f1565b;
                View viewL120 = mayaPostTransactionBottomSheetDialogFragment.l1(bottomSheetDialog16);
                if (viewL120 == null) {
                    return;
                }
                viewL120.setBackgroundResource(R.color.transparent);
                bottomSheetDialog16.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom25 = BottomSheetBehavior.from(viewL120);
                bottomSheetBehaviorFrom25.setState(3);
                bottomSheetBehaviorFrom25.setSkipCollapsed(true);
                bottomSheetBehaviorFrom25.setDraggable(false);
                mayaPostTransactionBottomSheetDialogFragment.setCancelable(false);
                return;
            case 27:
                j.e(dialogInterface, numX49.tnTj78("bBtb"));
                BottomSheetDialog bottomSheetDialog17 = (BottomSheetDialog) dialogInterface;
                MayaFavoriteReminderSampleBottomSheetDialogFragment mayaFavoriteReminderSampleBottomSheetDialogFragment = (MayaFavoriteReminderSampleBottomSheetDialogFragment) this.f1565b;
                View viewL121 = mayaFavoriteReminderSampleBottomSheetDialogFragment.l1(bottomSheetDialog17);
                if (viewL121 == null) {
                    return;
                }
                viewL121.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                bottomSheetDialog17.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom26 = BottomSheetBehavior.from(viewL121);
                C0489y c0489y = mayaFavoriteReminderSampleBottomSheetDialogFragment.f12320T;
                j.d(c0489y);
                bottomSheetBehaviorFrom26.setPeekHeight(c0489y.f4296b.getHeight());
                bottomSheetBehaviorFrom26.setState(3);
                bottomSheetBehaviorFrom26.setSkipCollapsed(true);
                bottomSheetBehaviorFrom26.setDraggable(false);
                return;
            case 28:
                MayaProminentDisclosureBottomSheetDialogFragment mayaProminentDisclosureBottomSheetDialogFragment = (MayaProminentDisclosureBottomSheetDialogFragment) this.f1565b;
                Dialog dialog9 = mayaProminentDisclosureBottomSheetDialogFragment.getDialog();
                BottomSheetDialog bottomSheetDialog18 = dialog9 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog9 : null;
                if (bottomSheetDialog18 == null || (viewL14 = mayaProminentDisclosureBottomSheetDialogFragment.l1(bottomSheetDialog18)) == null) {
                    return;
                }
                viewL14.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                viewL14.getLayoutParams().height = mayaProminentDisclosureBottomSheetDialogFragment.o1();
                bottomSheetDialog18.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom27 = BottomSheetBehavior.from(viewL14);
                bottomSheetBehaviorFrom27.setPeekHeight(mayaProminentDisclosureBottomSheetDialogFragment.o1());
                bottomSheetBehaviorFrom27.setState(4);
                bottomSheetBehaviorFrom27.setDraggable(false);
                return;
            default:
                j.e(dialogInterface, numX49.tnTj78("bBtP"));
                BottomSheetDialog bottomSheetDialog19 = (BottomSheetDialog) dialogInterface;
                MayaFavoriteReminderScheduleBottomSheetFragment mayaFavoriteReminderScheduleBottomSheetFragment = (MayaFavoriteReminderScheduleBottomSheetFragment) this.f1565b;
                View viewL122 = mayaFavoriteReminderScheduleBottomSheetFragment.l1(bottomSheetDialog19);
                if (viewL122 == null) {
                    return;
                }
                viewL122.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                bottomSheetDialog19.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom28 = BottomSheetBehavior.from(viewL122);
                C0435a c0435a = mayaFavoriteReminderScheduleBottomSheetFragment.f12350S;
                j.d(c0435a);
                bottomSheetBehaviorFrom28.setPeekHeight(((ConstraintLayout) c0435a.f4047b).getHeight());
                bottomSheetBehaviorFrom28.setState(3);
                bottomSheetBehaviorFrom28.setSkipCollapsed(true);
                bottomSheetBehaviorFrom28.setDraggable(false);
                mayaFavoriteReminderScheduleBottomSheetFragment.setCancelable(false);
                return;
        }
    }
}
