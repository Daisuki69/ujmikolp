package L9;

import D8.C0214w;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditOTPFragment;
import defpackage.AbstractC1414e;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0214w f2863b;

    public /* synthetic */ C(C0214w c0214w, int i) {
        this.f2862a = i;
        this.f2863b = c0214w;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f2862a) {
            case 0:
                C0214w c0214w = this.f2863b;
                ((MayaBaseFragment) ((P9.m) c0214w.c.get())).w1();
                NewMayaCreditOTPFragment newMayaCreditOTPFragment = (NewMayaCreditOTPFragment) ((P9.m) c0214w.c.get());
                C1220i c1220iO1 = newMayaCreditOTPFragment.o1();
                FragmentActivity activity = newMayaCreditOTPFragment.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.CREDIT);
                AbstractC1414e.m(c1219hD, EnumC1216e.ACTIVATION, 14);
                c1220iO1.c(activity, c1219hD);
                Q9.I i = newMayaCreditOTPFragment.f13299k0;
                if (i != null) {
                    i.finish();
                }
                break;
            default:
                ((MayaBaseFragment) ((P9.m) this.f2863b.c.get())).w1();
                break;
        }
    }
}
