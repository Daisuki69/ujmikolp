package t6;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;

/* JADX INFO: renamed from: t6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2271b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBankTransferFormFragment f20169b;

    public /* synthetic */ ViewOnClickListenerC2271b(MayaBankTransferFormFragment mayaBankTransferFormFragment, int i) {
        this.f20168a = i;
        this.f20169b = mayaBankTransferFormFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f20168a) {
            case 0:
                MayaBankTransferFormFragment mayaBankTransferFormFragment = this.f20169b;
                Callback.onClick_enter(view);
                try {
                    MayaBankTransferFormFragment.U1(mayaBankTransferFormFragment);
                    return;
                } finally {
                }
            default:
                MayaBankTransferFormFragment mayaBankTransferFormFragment2 = this.f20169b;
                Callback.onClick_enter(view);
                try {
                    ((o6.g) mayaBankTransferFormFragment2.R1()).m();
                    return;
                } finally {
                }
        }
    }
}
