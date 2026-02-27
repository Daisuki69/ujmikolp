package o6;

import com.paymaya.common.base.MayaBaseFragment;
import s6.InterfaceC2241b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f18789b;

    public /* synthetic */ d(g gVar, int i) {
        this.f18788a = i;
        this.f18789b = gVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f18788a) {
            case 0:
                this.f18789b.i = false;
                break;
            default:
                ((MayaBaseFragment) ((InterfaceC2241b) this.f18789b.c.get())).w1();
                break;
        }
    }
}
