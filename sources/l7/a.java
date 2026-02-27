package l7;

import com.paymaya.common.base.MayaBaseFragment;
import p7.InterfaceC2015a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18250b;

    public /* synthetic */ a(b bVar, int i) {
        this.f18249a = i;
        this.f18250b = bVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f18249a) {
            case 0:
                this.f18250b.i = true;
                break;
            default:
                ((MayaBaseFragment) ((InterfaceC2015a) this.f18250b.c.get())).w1();
                break;
        }
    }
}
