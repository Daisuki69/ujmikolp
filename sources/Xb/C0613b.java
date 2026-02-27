package Xb;

import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import kotlin.Pair;

/* JADX INFO: renamed from: Xb.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0613b implements Ch.a, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6562b;

    public /* synthetic */ C0613b(f fVar, int i) {
        this.f6561a = i;
        this.f6562b = fVar;
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f6561a) {
            case 1:
                f fVar = this.f6562b;
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                ((MayaShopHomePageFragment) ((bc.b) fVar.c.get())).T1("Buy Again");
                return new Pair(null, throwable);
            default:
                f fVar2 = this.f6562b;
                Throwable throwable2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable2, "throwable");
                ((MayaShopHomePageFragment) ((bc.b) fVar2.c.get())).T1("Most Popular");
                return new Pair(null, throwable2);
        }
    }

    @Override // Ch.a
    public void run() {
        switch (this.f6561a) {
            case 0:
                MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) ((bc.b) this.f6562b.c.get());
                mayaShopHomePageFragment.t0 = false;
                mayaShopHomePageFragment.V1();
                break;
            default:
                MayaShopHomePageFragment mayaShopHomePageFragment2 = (MayaShopHomePageFragment) ((bc.b) this.f6562b.c.get());
                mayaShopHomePageFragment2.getClass();
                mayaShopHomePageFragment2.u0.remove("Buy Again");
                mayaShopHomePageFragment2.V1();
                break;
        }
    }
}
