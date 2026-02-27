package f9;

import N5.C0487x;
import N5.K;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.paymaya.R;
import com.paymaya.mayaui.forgotpassword.view.dialog.impl.MayaForgotPasswordSecurityTipsDialogFragment;
import com.paymaya.mayaui.login.view.dialog.impl.MayaFaceVerificationBottomSheetDialogFragment;
import com.paymaya.mayaui.login.view.dialog.impl.MayaPasswordTipsBottomSheetDialogFragment;
import com.paymaya.mayaui.login.view.dialog.impl.MayaRegistrationSuccessBottomSheetDialogFragment;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLocationPermissionBottomSheetDialogFragment;
import com.paymaya.mayaui.paybills.view.dialog.impl.MayaBIRReminderDialogFragment;
import com.paymaya.mayaui.paybills.view.dialog.impl.MayaSpinnerBottomSheetDialogFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaProfileUpdateSingleSelectionBottomSheetDialogFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ConfirmationBottomSheetFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: f9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC1475b implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetDialogFragment f16746b;

    public /* synthetic */ DialogInterfaceOnShowListenerC1475b(BottomSheetDialogFragment bottomSheetDialogFragment, int i) {
        this.f16745a = i;
        this.f16746b = bottomSheetDialogFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View viewL1;
        switch (this.f16745a) {
            case 0:
                j.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialogInterface;
                MayaFaceVerificationBottomSheetDialogFragment mayaFaceVerificationBottomSheetDialogFragment = (MayaFaceVerificationBottomSheetDialogFragment) this.f16746b;
                View viewL12 = mayaFaceVerificationBottomSheetDialogFragment.l1(bottomSheetDialog);
                if (viewL12 == null) {
                    return;
                }
                viewL12.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                viewL12.getLayoutParams().height = mayaFaceVerificationBottomSheetDialogFragment.o1();
                bottomSheetDialog.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewL12);
                bottomSheetBehaviorFrom.setPeekHeight(mayaFaceVerificationBottomSheetDialogFragment.o1());
                bottomSheetBehaviorFrom.setState(4);
                bottomSheetBehaviorFrom.setSkipCollapsed(true);
                bottomSheetBehaviorFrom.setDraggable(false);
                return;
            case 1:
                j.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                BottomSheetDialog bottomSheetDialog2 = (BottomSheetDialog) dialogInterface;
                MayaPasswordTipsBottomSheetDialogFragment mayaPasswordTipsBottomSheetDialogFragment = (MayaPasswordTipsBottomSheetDialogFragment) this.f16746b;
                View viewL13 = mayaPasswordTipsBottomSheetDialogFragment.l1(bottomSheetDialog2);
                if (viewL13 == null) {
                    return;
                }
                viewL13.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                bottomSheetDialog2.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom2 = BottomSheetBehavior.from(viewL13);
                C0487x c0487x = mayaPasswordTipsBottomSheetDialogFragment.f12753S;
                j.d(c0487x);
                bottomSheetBehaviorFrom2.setPeekHeight(c0487x.f4259b.getHeight());
                bottomSheetBehaviorFrom2.setState(3);
                bottomSheetBehaviorFrom2.setSkipCollapsed(true);
                bottomSheetBehaviorFrom2.setDraggable(false);
                return;
            case 2:
                j.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                BottomSheetDialog bottomSheetDialog3 = (BottomSheetDialog) dialogInterface;
                MayaRegistrationSuccessBottomSheetDialogFragment mayaRegistrationSuccessBottomSheetDialogFragment = (MayaRegistrationSuccessBottomSheetDialogFragment) this.f16746b;
                View viewL14 = mayaRegistrationSuccessBottomSheetDialogFragment.l1(bottomSheetDialog3);
                if (viewL14 == null) {
                    return;
                }
                viewL14.setBackgroundResource(R.color.transparent);
                bottomSheetDialog3.setCanceledOnTouchOutside(false);
                bottomSheetDialog3.setCancelable(false);
                BottomSheetBehavior bottomSheetBehaviorFrom3 = BottomSheetBehavior.from(viewL14);
                bottomSheetBehaviorFrom3.setState(3);
                bottomSheetBehaviorFrom3.setSkipCollapsed(true);
                bottomSheetBehaviorFrom3.setDraggable(false);
                mayaRegistrationSuccessBottomSheetDialogFragment.setCancelable(false);
                return;
            case 3:
                j.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                View viewL15 = ((MayaBIRReminderDialogFragment) this.f16746b).l1((BottomSheetDialog) dialogInterface);
                if (viewL15 == null) {
                    return;
                }
                viewL15.setBackgroundResource(R.color.transparent);
                int iB = sj.b.b(((Number) r0.q1().f18161b).intValue() * 0.9f);
                ViewGroup.LayoutParams layoutParams = viewL15.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = iB;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom4 = BottomSheetBehavior.from(viewL15);
                bottomSheetBehaviorFrom4.setPeekHeight(iB);
                bottomSheetBehaviorFrom4.setState(3);
                bottomSheetBehaviorFrom4.setSkipCollapsed(true);
                return;
            case 4:
                j.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                MayaSpinnerBottomSheetDialogFragment mayaSpinnerBottomSheetDialogFragment = (MayaSpinnerBottomSheetDialogFragment) this.f16746b;
                View viewL16 = mayaSpinnerBottomSheetDialogFragment.l1((BottomSheetDialog) dialogInterface);
                if (viewL16 == null) {
                    return;
                }
                viewL16.setBackgroundResource(R.color.transparent);
                int iDoubleValue = (int) (((Number) mayaSpinnerBottomSheetDialogFragment.q1().f18161b).doubleValue() * 0.75d);
                ViewGroup.LayoutParams layoutParams2 = viewL16.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = iDoubleValue;
                }
                BottomSheetBehavior bottomSheetBehaviorFrom5 = BottomSheetBehavior.from(viewL16);
                bottomSheetBehaviorFrom5.setPeekHeight(iDoubleValue);
                bottomSheetBehaviorFrom5.setState(3);
                bottomSheetBehaviorFrom5.setDraggable(true);
                return;
            case 5:
                j.e(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                BottomSheetDialog bottomSheetDialog4 = (BottomSheetDialog) dialogInterface;
                MayaLocationPermissionBottomSheetDialogFragment mayaLocationPermissionBottomSheetDialogFragment = (MayaLocationPermissionBottomSheetDialogFragment) this.f16746b;
                View viewFindViewById = bottomSheetDialog4.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById == null) {
                    return;
                }
                viewFindViewById.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                bottomSheetDialog4.setCancelable(false);
                bottomSheetDialog4.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom6 = BottomSheetBehavior.from(viewFindViewById);
                ConstraintLayout constraintLayout = mayaLocationPermissionBottomSheetDialogFragment.f12773U;
                if (constraintLayout == null) {
                    j.n("mContainerLayout");
                    throw null;
                }
                bottomSheetBehaviorFrom6.setPeekHeight(constraintLayout.getHeight());
                bottomSheetBehaviorFrom6.setState(4);
                bottomSheetBehaviorFrom6.setDraggable(false);
                return;
            case 6:
                MayaForgotPasswordSecurityTipsDialogFragment mayaForgotPasswordSecurityTipsDialogFragment = (MayaForgotPasswordSecurityTipsDialogFragment) this.f16746b;
                Dialog dialog = mayaForgotPasswordSecurityTipsDialogFragment.getDialog();
                BottomSheetDialog bottomSheetDialog5 = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
                if (bottomSheetDialog5 == null || (viewL1 = mayaForgotPasswordSecurityTipsDialogFragment.l1(bottomSheetDialog5)) == null) {
                    return;
                }
                viewL1.setBackgroundResource(R.drawable.maya_bg_default_bottom_dialog_sheet);
                bottomSheetDialog5.setCanceledOnTouchOutside(false);
                BottomSheetBehavior bottomSheetBehaviorFrom7 = BottomSheetBehavior.from(viewL1);
                C0487x c0487x2 = mayaForgotPasswordSecurityTipsDialogFragment.f12362S;
                j.d(c0487x2);
                bottomSheetBehaviorFrom7.setPeekHeight(c0487x2.f4259b.getHeight());
                bottomSheetBehaviorFrom7.setState(3);
                bottomSheetBehaviorFrom7.setSkipCollapsed(true);
                bottomSheetBehaviorFrom7.setDraggable(false);
                return;
            case 7:
                if (dialogInterface != null) {
                    BottomSheetDialog bottomSheetDialog6 = (BottomSheetDialog) dialogInterface;
                    bottomSheetDialog6.setCancelable(false);
                    bottomSheetDialog6.setCanceledOnTouchOutside(false);
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment = (ShopV3ConfirmationBottomSheetFragment) this.f16746b;
                    K k8 = shopV3ConfirmationBottomSheetFragment.f14780R;
                    j.d(k8);
                    ConstraintLayout constraintLayout2 = k8.e;
                    j.f(constraintLayout2, "containerLayoutPmaFragme…V3ConfirmationBottomSheet");
                    shopV3ConfirmationBottomSheetFragment.n1(constraintLayout2);
                    return;
                }
                return;
            default:
                MayaProfileUpdateSingleSelectionBottomSheetDialogFragment mayaProfileUpdateSingleSelectionBottomSheetDialogFragment = (MayaProfileUpdateSingleSelectionBottomSheetDialogFragment) this.f16746b;
                Dialog dialog2 = mayaProfileUpdateSingleSelectionBottomSheetDialogFragment.getDialog();
                j.e(dialog2, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                View viewL17 = mayaProfileUpdateSingleSelectionBottomSheetDialogFragment.l1((BottomSheetDialog) dialog2);
                if (viewL17 == null) {
                    return;
                }
                BottomSheetBehavior.from(viewL17).setState(3);
                return;
        }
    }
}
