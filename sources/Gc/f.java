package Gc;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVouchersPageFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaVouchersPageFragment f1963b;

    public /* synthetic */ f(MayaVouchersPageFragment mayaVouchersPageFragment, int i) {
        this.f1962a = i;
        this.f1963b = mayaVouchersPageFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1962a) {
            case 0:
                MayaVouchersPageFragment mayaVouchersPageFragment = this.f1963b;
                Callback.onClick_enter(view);
                try {
                    mayaVouchersPageFragment.O1();
                    ((Dc.d) mayaVouchersPageFragment.P1()).k();
                    return;
                } finally {
                }
            case 1:
                MayaVouchersPageFragment mayaVouchersPageFragment2 = this.f1963b;
                Callback.onClick_enter(view);
                try {
                    mayaVouchersPageFragment2.O1();
                    ((Dc.d) mayaVouchersPageFragment2.P1()).k();
                    return;
                } finally {
                }
            default:
                MayaVouchersPageFragment mayaVouchersPageFragment3 = this.f1963b;
                Callback.onClick_enter(view);
                try {
                    MayaVouchersPageFragment.R1(mayaVouchersPageFragment3);
                    return;
                } finally {
                }
        }
    }
}
