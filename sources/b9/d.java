package B9;

import A5.l;
import Ah.p;
import F9.f;
import G9.i;
import Lh.h;
import M8.T2;
import com.paymaya.domain.model.MissionV2Base;
import com.paymaya.domain.store.C1272m0;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsHomeFragment;
import kotlin.jvm.internal.j;
import w.C2360b;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC2509a implements A9.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f384d;
    public final C1272m0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.paymaya.data.preference.a mPreference, C1272m0 c1272m0, Uh.d dVar) {
        super(dVar);
        j.g(mPreference, "mPreference");
        this.f384d = mPreference;
        this.e = c1272m0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        if (this.f384d.e().isMissionsAvailable()) {
            ((MayaMissionsHomeFragment) ((f) this.c.get())).O1();
            k();
        } else {
            i iVar = ((MayaMissionsHomeFragment) ((f) this.c.get())).f13030x0;
            if (iVar != null) {
                ((MayaMissionsActivity) iVar).Z1();
            }
        }
    }

    public final void k() {
        C1272m0 c1272m0 = this.e;
        c1272m0.getClass();
        p<MissionV2Base> missionsV2 = c1272m0.f11462b.getMissionsV2(T2.t());
        j.f(missionsV2, "getMissionsV2(...)");
        e(new Lh.d(new Lh.d(new h(missionsV2, zh.b.a(), 0), new l(this, 5), 2), new C2360b(this, 6), 0).e());
    }
}
