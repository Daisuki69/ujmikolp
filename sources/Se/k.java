package se;

import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment;
import we.RunnableC2398C;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20069b;

    public /* synthetic */ k(l lVar, int i) {
        this.f20068a = i;
        this.f20069b = lVar;
    }

    @Override // Ch.a
    public final void run() {
        switch (this.f20068a) {
            case 0:
                l lVar = this.f20069b;
                ((ShopV3ProvidersCollectionFragment) ((ve.h) lVar.c.get())).f14860f0 = false;
                ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment = (ShopV3ProvidersCollectionFragment) ((ve.h) lVar.c.get());
                if (shopV3ProvidersCollectionFragment.C1().isRefreshing()) {
                    shopV3ProvidersCollectionFragment.C1().post(new RunnableC2398C(shopV3ProvidersCollectionFragment, 1));
                    break;
                }
                break;
            default:
                ((ShopV3ProvidersCollectionFragment) ((ve.h) this.f20069b.c.get())).f14860f0 = false;
                break;
        }
    }
}
