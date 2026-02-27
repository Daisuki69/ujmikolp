package Q9;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;

/* JADX INFO: renamed from: Q9.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0577g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaCreditTransferFragment f5322b;

    public /* synthetic */ ViewOnClickListenerC0577g(MayaCreditTransferFragment mayaCreditTransferFragment, int i) {
        this.f5321a = i;
        this.f5322b = mayaCreditTransferFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5321a) {
            case 0:
                MayaCreditTransferFragment mayaCreditTransferFragment = this.f5322b;
                Callback.onClick_enter(view);
                try {
                    mayaCreditTransferFragment.P1().k();
                    return;
                } finally {
                }
            default:
                MayaCreditTransferFragment mayaCreditTransferFragment2 = this.f5322b;
                Callback.onClick_enter(view);
                try {
                    mayaCreditTransferFragment2.P1().k();
                    return;
                } finally {
                }
        }
    }
}
