package Ga;

import Fa.b;
import N5.C0450f;
import N5.X0;
import android.widget.FrameLayout;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.PushApprovalPendingRequest;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X0 f1937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaPushApprovalListFragment f1938b;
    public final p8.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(X0 x02, MayaPushApprovalListFragment listener) {
        super(x02.f4030b);
        j.g(listener, "listener");
        this.f1937a = x02;
        this.f1938b = listener;
        this.c = new p8.a(this, 26);
    }

    public static final void D(a aVar, PushApprovalPendingRequest pushApprovalPendingRequest) {
        MayaPushApprovalListFragment mayaPushApprovalListFragment = aVar.f1938b;
        mayaPushApprovalListFragment.getClass();
        C0450f c0450f = mayaPushApprovalListFragment.f13552X;
        j.d(c0450f);
        FrameLayout frameLayout = (FrameLayout) c0450f.c;
        j.f(frameLayout, "getRoot(...)");
        Navigation.findNavController(frameLayout).navigate(new b(pushApprovalPendingRequest));
        String id = pushApprovalPendingRequest.getId();
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.REQUEST);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("challengeId", id);
        c1219hH.i();
        mayaPushApprovalListFragment.A1(c1219hH);
    }
}
