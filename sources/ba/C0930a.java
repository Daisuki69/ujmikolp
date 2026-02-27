package ba;

import L9.C0323a;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import ga.InterfaceC1514a;

/* JADX INFO: renamed from: ba.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0930a implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f8571b;

    public /* synthetic */ C0930a(C0323a c0323a, int i) {
        this.f8570a = i;
        this.f8571b = c0323a;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f8570a) {
            case 0:
                ((MayaBaseLoadingFragment) ((InterfaceC1514a) this.f8571b.c.get())).f10359n0 = false;
                break;
            case 1:
                ((MayaBaseFragment) ((InterfaceC1514a) this.f8571b.c.get())).w1();
                break;
            default:
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) this.f8571b.c.get())).f13363O0 = false;
                break;
        }
    }
}
