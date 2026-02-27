package h9;

import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.login.view.fragment.impl.MayaLoginFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: h9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1547f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaLoginFragment f16943b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ C1547f(MayaLoginFragment mayaLoginFragment, Function0 function0, int i) {
        this.f16942a = i;
        this.f16943b = mayaLoginFragment;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16942a) {
            case 0:
                MayaLoginFragment mayaLoginFragment = this.f16943b;
                C1220i c1220iO1 = mayaLoginFragment.o1();
                FragmentActivity activity = mayaLoginFragment.getActivity();
                C1219h c1219hD = C1219h.d(mayaLoginFragment.u1());
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.ACCEPT_CONFIRM_CREDENTIAL);
                c1220iO1.c(activity, c1219hD);
                this.c.invoke();
                break;
            default:
                MayaLoginFragment mayaLoginFragment2 = this.f16943b;
                C1220i c1220iO12 = mayaLoginFragment2.o1();
                FragmentActivity activity2 = mayaLoginFragment2.getActivity();
                C1219h c1219hD2 = C1219h.d(mayaLoginFragment2.u1());
                c1219hD2.n(17);
                c1219hD2.t(EnumC1217f.REJECT_CONFIRM_CREDENTIAL);
                c1220iO12.c(activity2, c1219hD2);
                this.c.invoke();
                break;
        }
        return Unit.f18162a;
    }
}
