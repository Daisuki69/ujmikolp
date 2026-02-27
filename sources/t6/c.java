package T6;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaErrorDialogFragment f5803b;
    public final /* synthetic */ PayMayaErrorAction c;

    public /* synthetic */ c(MayaErrorDialogFragment mayaErrorDialogFragment, PayMayaErrorAction payMayaErrorAction, int i) {
        this.f5802a = i;
        this.f5803b = mayaErrorDialogFragment;
        this.c = payMayaErrorAction;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PayMayaErrorAction payMayaErrorAction = this.c;
        MayaErrorDialogFragment mayaErrorDialogFragment = this.f5803b;
        switch (this.f5802a) {
            case 0:
                int i = MayaSessionExpiredActivity.f11789v;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.s1(payMayaErrorAction);
                    return;
                } finally {
                }
            default:
                int i4 = MayaLoginActivity.f12721v;
                Callback.onClick_enter(view);
                try {
                    mayaErrorDialogFragment.s1(payMayaErrorAction);
                    return;
                } finally {
                }
        }
    }
}
