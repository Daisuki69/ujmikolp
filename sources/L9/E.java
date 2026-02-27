package L9;

import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2868b;

    public /* synthetic */ E(I i, int i4) {
        this.f2867a = i4;
        this.f2868b = i;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f2867a) {
            case 0:
                ((MayaBaseFragment) ((P9.o) this.f2868b.c.get())).w1();
                break;
            case 1:
                ((NewMayaCreditUpdatePersonalDetailsContactReferenceFragment) ((P9.o) this.f2868b.c.get())).s1().g();
                break;
            case 2:
                ((MayaBaseFragment) ((P9.o) this.f2868b.c.get())).w1();
                break;
            default:
                ((MayaBaseFragment) ((P9.o) this.f2868b.c.get())).w1();
                break;
        }
    }
}
