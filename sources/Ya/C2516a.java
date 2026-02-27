package ya;

import Kh.T;
import Lh.d;
import Lh.h;
import N5.C0450f;
import N5.C0453g;
import N5.C0464l;
import Th.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import com.google.firebase.messaging.p;
import com.paymaya.data.api.PushApprovalApi;
import com.paymaya.mayaui.pushapproval.view.activity.impl.MayaPushApprovalActivity;
import com.paymaya.mayaui.pushapproval.view.fragment.impl.MayaPushApprovalListFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import o6.f;
import oi.C1983a;

/* JADX INFO: renamed from: ya.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2516a extends C8.a {
    public final /* synthetic */ int e;
    public final p f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2516a(p pVar, com.paymaya.data.preference.a aVar, int i) {
        super(aVar, 1);
        this.e = i;
        this.f = pVar;
    }

    @Override // y5.AbstractC2509a
    public void j() {
        switch (this.e) {
            case 0:
                super.j();
                p();
                break;
            default:
                super.j();
                break;
        }
    }

    public void o() {
        int i = 2;
        e(new T(4, new d(new d(new h(((PushApprovalApi) this.f.f9799b).getPendingApprovalRequests().h(e.c), zh.b.a(), 0), new C1983a(this, 25), i), new f(this, 22), 0), new y9.d(this, i)).e());
    }

    public void p() {
        MayaPushApprovalListFragment mayaPushApprovalListFragment = (MayaPushApprovalListFragment) ((Da.b) this.c.get());
        C0450f c0450f = mayaPushApprovalListFragment.f13552X;
        j.d(c0450f);
        ((ConstraintLayout) ((C0453g) c0450f.f4088d).f4094b).setVisibility(0);
        mayaPushApprovalListFragment.J1().setVisibility(0);
        mayaPushApprovalListFragment.H1().setVisibility(8);
        C0450f c0450f2 = mayaPushApprovalListFragment.f13552X;
        j.d(c0450f2);
        ((C0464l) c0450f2.f4087b).f4141b.setVisibility(8);
        mayaPushApprovalListFragment.I1().setVisibility(8);
        mayaPushApprovalListFragment.G1().setEnabled(false);
        KeyEventDispatcher.Component componentRequireActivity = mayaPushApprovalListFragment.requireActivity();
        j.e(componentRequireActivity, numX49.tnTj78("bQl2"));
        ((MayaPushApprovalActivity) ((Aa.a) componentRequireActivity)).X1();
        o();
    }
}
