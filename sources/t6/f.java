package T6;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaErrorDialogFragment f5809b;

    public /* synthetic */ f(MayaErrorDialogFragment mayaErrorDialogFragment, int i) {
        this.f5808a = i;
        this.f5809b = mayaErrorDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MayaErrorDialogFragment mayaErrorDialogFragment = this.f5809b;
        switch (this.f5808a) {
            case 0:
                int i = MayaSessionExpiredActivity.f11789v;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 1:
                Callback.onClick_enter(view);
                try {
                    MayaErrorDialogFragment.u1(mayaErrorDialogFragment);
                    return;
                } finally {
                }
            case 2:
                Callback.onClick_enter(view);
                try {
                    W6.d dVar = mayaErrorDialogFragment.f11851d0;
                    if (dVar != null) {
                        dVar.onClose();
                    }
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 3:
                Callback.onClick_enter(view);
                try {
                    W6.d dVar2 = mayaErrorDialogFragment.f11851d0;
                    if (dVar2 != null) {
                        dVar2.onClose();
                    }
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 4:
                int i4 = MayaLoginActivity.f12721v;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 5:
                int i6 = MayaForgotPasswordActivity.f12356r;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 6:
                int i10 = MayaForgotPasswordActivity.f12356r;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 7:
                int i11 = MayaForgotPasswordActivity.f12356r;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 8:
                int i12 = MayaForgotPasswordActivity.f12356r;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
            default:
                int i13 = MayaQRPHMerchantActivity.f12851t;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.dismiss();
                    return;
                } finally {
                }
        }
    }
}
