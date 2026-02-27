package we;

import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment;

/* JADX INFO: renamed from: we.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC2398C implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ShopV3ProvidersCollectionFragment f20734b;

    public /* synthetic */ RunnableC2398C(ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment, int i) {
        this.f20733a = i;
        this.f20734b = shopV3ProvidersCollectionFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20733a) {
            case 0:
                this.f20734b.C1().setRefreshing(true);
                break;
            default:
                this.f20734b.C1().setRefreshing(false);
                break;
        }
    }
}
