package ha;

import G5.C0256f;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.dialog.impl.MayaBIRReminderDialogFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsBIRFragment;

/* JADX INFO: renamed from: ha.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1553f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsBIRFragment f16997b;

    public /* synthetic */ ViewOnClickListenerC1553f(MayaPayBillsBIRFragment mayaPayBillsBIRFragment, int i) {
        this.f16996a = i;
        this.f16997b = mayaPayBillsBIRFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16996a) {
            case 0:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment = this.f16997b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO1 = mayaPayBillsBIRFragment.o1();
                    FragmentActivity activity = mayaPayBillsBIRFragment.getActivity();
                    C1219h c1219hD = C1219h.d(mayaPayBillsBIRFragment.u1());
                    c1219hD.n(17);
                    c1219hD.t(EnumC1217f.NEXT);
                    c1220iO1.c(activity, c1219hD);
                    C0256f c0256f = mayaPayBillsBIRFragment.f13390K0;
                    if (c0256f != null) {
                        c0256f.a();
                    }
                    ((ba.s) mayaPayBillsBIRFragment.V1()).y();
                    return;
                } finally {
                }
            case 1:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment2 = this.f16997b;
                Callback.onClick_enter(view);
                try {
                    m mVar = mayaPayBillsBIRFragment2.f13391L0;
                    if (mVar != null) {
                        new MayaBIRReminderDialogFragment().show(((MayaPayBillsActivity) mVar).getSupportFragmentManager(), "bir_reminder");
                    }
                    return;
                } finally {
                }
            case 2:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment3 = this.f16997b;
                Callback.onClick_enter(view);
                try {
                    ((ba.s) mayaPayBillsBIRFragment3.V1()).p();
                    return;
                } finally {
                }
            default:
                MayaPayBillsBIRFragment mayaPayBillsBIRFragment4 = this.f16997b;
                Callback.onClick_enter(view);
                try {
                    ((ba.s) mayaPayBillsBIRFragment4.V1()).p();
                    return;
                } finally {
                }
        }
    }
}
