package A7;

import Kh.C0310o;
import Kh.T;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.data.database.repository.G;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.E;
import com.paymaya.domain.store.W0;
import com.paymaya.domain.store.X0;
import com.paymaya.domain.store.Y0;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;
import java.util.HashMap;
import java.util.List;
import w.C2360b;
import w.C2361c;
import y5.AbstractC2509a;
import z7.InterfaceC2554a;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AbstractC2509a implements InterfaceC2554a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y0 f227d;
    public final C1273n e;
    public final E f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final W0 f228g;
    public boolean h;
    public UserActivity i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f230l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Y0 y0, C1273n c1273n, com.paymaya.data.preference.a mPreference, E e, W0 w0, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f227d = y0;
        this.e = c1273n;
        this.f = e;
        this.f228g = w0;
        this.j = 1;
        this.f230l = new l(0);
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        Y0 y0 = this.f227d;
        mg.c cVar = new mg.c(9);
        G g8 = y0.c;
        e(new C0310o(new Kh.z(g8.f11299a.d("user_activity", cVar), new com.paymaya.data.database.repository.x(g8, 7), 0).e(zh.b.a()).c(C0103a.f194d), new C2361c(this, 3), Eh.d.c, Eh.d.f1365b).f());
        if (((MayaBaseLoadingFragment) ((F7.c) this.c.get())).f10359n0) {
            return;
        }
        k(true);
    }

    public final void k(boolean z4) {
        int i = 2;
        int i4 = 0;
        Y0 y0 = this.f227d;
        y0.getClass();
        HashMap map = new HashMap();
        map.put("page", String.valueOf(1));
        map.put("limit", String.valueOf(25));
        Ah.p<List<UserActivity>> activities = y0.f11408b.getActivities(map);
        X0 x02 = new X0(y0, 2);
        activities.getClass();
        e(new T(5, new Lh.d(new Lh.d(new Lh.h(new Lh.d(activities, x02, i), zh.b.a(), 0), new m(this, i4), i), new A3.i(this, z4, 1), i4), new k(this, i4)).e());
    }

    public final void l() {
        if (this.h || this.f229k) {
            return;
        }
        this.j++;
        this.h = true;
        D7.h hVar = ((MayaTransactionsFragment) ((F7.c) this.c.get())).t0;
        if ((hVar == null || !hVar.f1003d) && hVar != null) {
            hVar.f(true);
        }
        Y0 y0 = this.f227d;
        int i = this.j;
        y0.getClass();
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        map.put("limit", String.valueOf(25));
        Ah.p<List<UserActivity>> activities = y0.f11408b.getActivities(map);
        X0 x02 = new X0(y0, 0);
        activities.getClass();
        new T(5, new Lh.d(new Lh.d(new Lh.h(new Lh.d(activities, x02, 2), zh.b.a(), 0), new A5.l(this, 1), 2), new C2360b(this, 3), 0), new k(this, 1)).e();
    }

    public final void m(PayMayaError payMayaError) {
        MayaTransactionsFragment mayaTransactionsFragment;
        G7.r rVar;
        ((MayaBaseFragment) ((F7.c) this.c.get())).w1();
        if (payMayaError.isSessionTimeout() || (rVar = (mayaTransactionsFragment = (MayaTransactionsFragment) ((F7.c) this.c.get())).f12205s0) == null) {
            return;
        }
        mayaTransactionsFragment.getString(R.string.pma_toast_error_title_error);
        M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447).show(((MayaTransactionsActivity) rVar).getSupportFragmentManager(), "error_dialog");
    }
}
