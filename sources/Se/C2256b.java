package se;

import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import dOYHB6.tiZVw8.numX49;
import kotlin.Pair;

/* JADX INFO: renamed from: se.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C2256b implements Ch.a, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20053b;

    public /* synthetic */ C2256b(e eVar, int i) {
        this.f20052a = i;
        this.f20053b = eVar;
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        e eVar = this.f20053b;
        Throwable th2 = (Throwable) obj;
        kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bF3m"));
        ((ShopV3HomePageFragment) ((ve.c) eVar.c.get())).C1(numX49.tnTj78("bF3D"));
        return new Pair(null, th2);
    }

    @Override // Ch.a
    public void run() {
        switch (this.f20052a) {
            case 0:
                ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) ((ve.c) this.f20053b.c.get());
                shopV3HomePageFragment.f14797f0 = false;
                shopV3HomePageFragment.D1();
                break;
            default:
                ShopV3HomePageFragment shopV3HomePageFragment2 = (ShopV3HomePageFragment) ((ve.c) this.f20053b.c.get());
                shopV3HomePageFragment2.getClass();
                shopV3HomePageFragment2.f14798g0.remove(numX49.tnTj78("bF3h"));
                shopV3HomePageFragment2.D1();
                break;
        }
    }
}
