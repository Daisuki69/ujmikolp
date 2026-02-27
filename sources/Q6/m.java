package Q6;

import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaSessionExpiredFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f5282b;

    public /* synthetic */ m(o oVar, int i) {
        this.f5281a = i;
        this.f5282b = oVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f5281a) {
            case 0:
                ((MayaBaseFragment) ((X6.f) this.f5282b.c.get())).w1();
                break;
            default:
                o oVar = this.f5282b;
                ((MayaBaseFragment) ((X6.f) oVar.c.get())).w1();
                Y6.j jVar = ((MayaSessionExpiredFragment) ((X6.f) oVar.c.get())).f11935f0;
                if (jVar != null) {
                    MayaSessionExpiredActivity mayaSessionExpiredActivity = (MayaSessionExpiredActivity) jVar;
                    mayaSessionExpiredActivity.n1().z(mayaSessionExpiredActivity);
                }
                break;
        }
    }
}
