package Bb;

import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f401b;

    public /* synthetic */ g(n nVar, int i) {
        this.f400a = i;
        this.f401b = nVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f400a) {
            case 0:
                ((MayaBaseFragment) ((Fb.c) this.f401b.c.get())).w1();
                break;
            case 1:
                ((MayaSendMoneyFragment) ((Fb.c) this.f401b.c.get())).L1();
                break;
            case 2:
                ((MayaBaseFragment) ((Fb.c) this.f401b.c.get())).w1();
                break;
            default:
                ((MayaSendMoneyFragment) ((Fb.c) this.f401b.c.get())).f13798Z0 = false;
                break;
        }
    }
}
