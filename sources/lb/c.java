package Lb;

import Sb.m;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinOTPFragment;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2945b;

    public /* synthetic */ c(d dVar, int i) {
        this.f2944a = i;
        this.f2945b = dVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f2944a) {
            case 0:
                d dVar = this.f2945b;
                dVar.f2946d.h0(dVar.j);
                new Hh.a(new Hh.f(dVar.f2947g.b(), zh.b.a(), 0), new c(dVar, 2), 1).c();
                break;
            case 1:
                ((MayaBaseFragment) ((Rb.e) this.f2945b.c.get())).w1();
                break;
            default:
                d dVar2 = this.f2945b;
                ((MayaBaseFragment) ((Rb.e) dVar2.c.get())).A1(AbstractC2329d.h(14));
                ((MayaBaseFragment) ((Rb.e) dVar2.c.get())).w1();
                m mVar = ((MayaChangeMinOTPFragment) ((Rb.e) dVar2.c.get())).f13945k0;
                if (mVar != null) {
                    MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) mVar;
                    String string = mayaSettingsActivity.getString(R.string.maya_label_change_min_success_title);
                    j.f(string, "getString(...)");
                    z2.d.n(2131231645, string, mayaSettingsActivity.getString(R.string.maya_label_change_min_success_description), new Pair(mayaSettingsActivity.getString(R.string.maya_label_got_it), new Nb.a(mayaSettingsActivity, 5)), null, null, 112).show(mayaSettingsActivity.getSupportFragmentManager(), "alert_dialog");
                }
                break;
        }
    }
}
