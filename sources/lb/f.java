package Lb;

import L9.C0323a;
import Rb.j;
import com.paymaya.common.base.MayaBaseFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f2952b;

    public /* synthetic */ f(C0323a c0323a, int i) {
        this.f2951a = i;
        this.f2952b = c0323a;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f2951a) {
            case 0:
                ((MayaBaseFragment) ((j) this.f2952b.c.get())).w1();
                break;
            case 1:
                ((MayaBaseFragment) ((j) this.f2952b.c.get())).w1();
                break;
            default:
                ((MayaBaseFragment) ((j) this.f2952b.c.get())).w1();
                break;
        }
    }
}
