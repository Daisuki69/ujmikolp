package E8;

import M8.T2;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.paymaya.R;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseBottomSheetDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f1293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycBaseBottomSheetDialogFragment f1294b;

    public /* synthetic */ o(Dialog dialog, MayaKycBaseBottomSheetDialogFragment mayaKycBaseBottomSheetDialogFragment) {
        this.f1293a = dialog;
        this.f1294b = mayaKycBaseBottomSheetDialogFragment;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View viewFindViewById;
        Dialog dialog = this.f1293a;
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog == null || (viewFindViewById = bottomSheetDialog.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        bottomSheetBehaviorFrom.setDraggable(false);
        T2.H(this.f1294b, null, 3);
        bottomSheetDialog.setCancelable(false);
    }
}
