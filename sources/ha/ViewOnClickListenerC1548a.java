package ha;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;

/* JADX INFO: renamed from: ha.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1548a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBillersCategoryFragment f16992b;

    public /* synthetic */ ViewOnClickListenerC1548a(MayaBillersCategoryFragment mayaBillersCategoryFragment, int i) {
        this.f16991a = i;
        this.f16992b = mayaBillersCategoryFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16991a) {
            case 0:
                MayaBillersCategoryFragment mayaBillersCategoryFragment = this.f16992b;
                Callback.onClick_enter(view);
                try {
                    InterfaceC1549b interfaceC1549b = mayaBillersCategoryFragment.f13360K0;
                    if (interfaceC1549b != null) {
                        MayaPayBillsActivity mayaPayBillsActivity = (MayaPayBillsActivity) interfaceC1549b;
                        mayaPayBillsActivity.n1();
                        B5.i.p(mayaPayBillsActivity, "billspay");
                    }
                    if (mayaBillersCategoryFragment.t1().e().isBillsPayEventsV2Enabled()) {
                        mayaBillersCategoryFragment.U1("See all");
                    }
                    return;
                } finally {
                }
            case 1:
                MayaBillersCategoryFragment mayaBillersCategoryFragment2 = this.f16992b;
                Callback.onClick_enter(view);
                try {
                    mayaBillersCategoryFragment2.P1().t();
                    return;
                } finally {
                }
            case 2:
                MayaBillersCategoryFragment mayaBillersCategoryFragment3 = this.f16992b;
                Callback.onClick_enter(view);
                try {
                    MayaBillersCategoryFragment.W1(mayaBillersCategoryFragment3);
                    return;
                } finally {
                }
            case 3:
                MayaBillersCategoryFragment mayaBillersCategoryFragment4 = this.f16992b;
                Callback.onClick_enter(view);
                try {
                    MayaBillersCategoryFragment.X1(mayaBillersCategoryFragment4);
                    return;
                } finally {
                }
            case 4:
                MayaBillersCategoryFragment mayaBillersCategoryFragment5 = this.f16992b;
                Callback.onClick_enter(view);
                try {
                    MayaBillersCategoryFragment.V1(mayaBillersCategoryFragment5);
                    return;
                } finally {
                }
            case 5:
                MayaBillersCategoryFragment mayaBillersCategoryFragment6 = this.f16992b;
                Callback.onClick_enter(view);
                try {
                    mayaBillersCategoryFragment6.P1().m();
                    return;
                } finally {
                }
            default:
                MayaBillersCategoryFragment mayaBillersCategoryFragment7 = this.f16992b;
                Callback.onClick_enter(view);
                try {
                    mayaBillersCategoryFragment7.P1().m();
                    return;
                } finally {
                }
        }
    }
}
