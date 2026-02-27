package Xb;

import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProvidersCollectionFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f6600b;

    public /* synthetic */ x(y yVar, int i) {
        this.f6599a = i;
        this.f6600b = yVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f6599a) {
            case 0:
                y yVar = this.f6600b;
                ((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).u0 = false;
                ((MayaShopProvidersCollectionFragment) ((bc.j) yVar.c.get())).R1().i();
                break;
            default:
                ((MayaShopProvidersCollectionFragment) ((bc.j) this.f6600b.c.get())).u0 = false;
                break;
        }
    }
}
