package Gc;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaVoucherDetailsFragment f1960b;

    public /* synthetic */ c(MayaVoucherDetailsFragment mayaVoucherDetailsFragment, int i) {
        this.f1959a = i;
        this.f1960b = mayaVoucherDetailsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1959a) {
            case 0:
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment = this.f1960b;
                Callback.onClick_enter(view);
                try {
                    MayaVoucherDetailsFragment.R1(mayaVoucherDetailsFragment);
                    return;
                } finally {
                }
            case 1:
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment2 = this.f1960b;
                Callback.onClick_enter(view);
                try {
                    MayaVoucherDetailsFragment.S1(mayaVoucherDetailsFragment2);
                    return;
                } finally {
                }
            case 2:
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment3 = this.f1960b;
                Callback.onClick_enter(view);
                try {
                    FragmentActivity activity = mayaVoucherDetailsFragment3.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                    return;
                } finally {
                }
            case 3:
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment4 = this.f1960b;
                Callback.onClick_enter(view);
                try {
                    MayaVoucherDetailsFragment.T1(mayaVoucherDetailsFragment4);
                    return;
                } finally {
                }
            case 4:
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment5 = this.f1960b;
                Callback.onClick_enter(view);
                try {
                    MayaVoucherDetailsFragment.U1(mayaVoucherDetailsFragment5);
                    return;
                } finally {
                }
            case 5:
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment6 = this.f1960b;
                Callback.onClick_enter(view);
                try {
                    mayaVoucherDetailsFragment6.O1();
                    mayaVoucherDetailsFragment6.P1().p(mayaVoucherDetailsFragment6.N0);
                    return;
                } finally {
                }
            default:
                MayaVoucherDetailsFragment mayaVoucherDetailsFragment7 = this.f1960b;
                Callback.onClick_enter(view);
                try {
                    mayaVoucherDetailsFragment7.O1();
                    mayaVoucherDetailsFragment7.P1().p(mayaVoucherDetailsFragment7.N0);
                    return;
                } finally {
                }
        }
    }
}
