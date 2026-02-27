package ha;

import G5.C0256f;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsFormFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaPayBillsFormFragment f17016b;

    public /* synthetic */ q(MayaPayBillsFormFragment mayaPayBillsFormFragment, int i) {
        this.f17015a = i;
        this.f17016b = mayaPayBillsFormFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17015a) {
            case 0:
                MayaPayBillsFormFragment mayaPayBillsFormFragment = this.f17016b;
                Callback.onClick_enter(view);
                try {
                    C1220i c1220iO1 = mayaPayBillsFormFragment.o1();
                    FragmentActivity activity = mayaPayBillsFormFragment.getActivity();
                    C1219h c1219hD = C1219h.d(mayaPayBillsFormFragment.u1());
                    c1219hD.n(17);
                    c1219hD.t(EnumC1217f.NEXT);
                    c1220iO1.c(activity, c1219hD);
                    C0256f c0256f = mayaPayBillsFormFragment.f13418B0;
                    if (c0256f != null) {
                        c0256f.a();
                    }
                    ((ba.C) mayaPayBillsFormFragment.S1()).l();
                    return;
                } finally {
                }
            case 1:
                MayaPayBillsFormFragment mayaPayBillsFormFragment2 = this.f17016b;
                Callback.onClick_enter(view);
                try {
                    ((ba.C) mayaPayBillsFormFragment2.S1()).n();
                    return;
                } finally {
                }
            case 2:
                MayaPayBillsFormFragment mayaPayBillsFormFragment3 = this.f17016b;
                Callback.onClick_enter(view);
                try {
                    w wVar = mayaPayBillsFormFragment3.f13419C0;
                    if (wVar != null) {
                        AbstractC1236z.c((MayaPayBillsActivity) wVar);
                    }
                    return;
                } finally {
                }
            default:
                MayaPayBillsFormFragment mayaPayBillsFormFragment4 = this.f17016b;
                Callback.onClick_enter(view);
                try {
                    ((ba.C) mayaPayBillsFormFragment4.S1()).n();
                    return;
                } finally {
                }
        }
    }
}
