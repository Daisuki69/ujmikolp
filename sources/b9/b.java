package B9;

import F9.g;
import G9.k;
import Lh.h;
import M8.T2;
import com.paymaya.domain.store.C1272m0;
import com.paymaya.domain.store.Z;
import com.paymaya.mayaui.missions.view.activity.impl.MayaMissionsActivity;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsCompletedFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsInProgressFragment;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import w.C2361c;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f382d;
    public final com.paymaya.data.preference.a e;
    public final C1272m0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.paymaya.data.preference.a mPreference, C1272m0 c1272m0, Uh.d dVar, int i) {
        super(dVar);
        this.f382d = i;
        switch (i) {
            case 1:
                j.g(mPreference, "mPreference");
                super(dVar);
                this.e = mPreference;
                this.f = c1272m0;
                break;
            default:
                j.g(mPreference, "mPreference");
                this.e = mPreference;
                this.f = c1272m0;
                break;
        }
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        switch (this.f382d) {
            case 0:
                super.j();
                if (!this.e.e().isMissionsAvailable()) {
                    G9.b bVar = ((MayaMissionsCompletedFragment) ((F9.a) this.c.get())).u0;
                    if (bVar != null) {
                        ((MayaMissionsActivity) bVar).Z1();
                    }
                } else {
                    ((MayaMissionsCompletedFragment) ((F9.a) this.c.get())).O1();
                    k();
                }
                break;
            default:
                super.j();
                if (!this.e.e().isMissionsAvailable()) {
                    k kVar = ((MayaMissionsInProgressFragment) ((g) this.c.get())).u0;
                    if (kVar != null) {
                        ((MayaMissionsActivity) kVar).Z1();
                    }
                } else {
                    ((MayaMissionsInProgressFragment) ((g) this.c.get())).O1();
                    l();
                }
                break;
        }
    }

    public void k() {
        C1272m0 c1272m0 = this.f;
        c1272m0.getClass();
        HashMap map = new HashMap();
        map.put("status", "completed");
        map.putAll(T2.t());
        e(new Lh.d(new Lh.d(new h(c1272m0.f11462b.getMissionsV2(map).d(Z.i), zh.b.a(), 0), new J5.c(this, 6), 2), new V2.c(this, 4), 0).e());
    }

    public void l() {
        C1272m0 c1272m0 = this.f;
        c1272m0.getClass();
        HashMap map = new HashMap();
        map.put("status", "ongoing");
        map.putAll(T2.t());
        e(new Lh.d(new Lh.d(new h(c1272m0.f11462b.getMissionsV2(map).d(Z.j), zh.b.a(), 0), new C2361c(this, 7), 2), new J5.a(this, 8), 0).e());
    }
}
